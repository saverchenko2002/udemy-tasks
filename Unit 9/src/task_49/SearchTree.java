package task_49;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem itemToInput) {
        if (root == null) {
            root = itemToInput;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(itemToInput);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(itemToInput);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(itemToInput);
                    return true;
                }
            } else return false;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else {
                performRemoval(parentItem, currentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem parentItem, ListItem removalItem) {
        if (removalItem.next() == null) {
            if (parentItem.next() == removalItem) {
                parentItem.setNext(removalItem.previous());
            } else if (parentItem.previous() == removalItem) {
                parentItem.setPrevious(removalItem.previous());
            } else {
                root = removalItem.previous();
            }
        } else if (removalItem.previous() == null) {
            if (parentItem.previous() == removalItem) {
                parentItem.setPrevious(removalItem.next());
            } else if (parentItem.next() == removalItem) {
                parentItem.setNext(removalItem.next());
            } else {
                root = removalItem.next();
            }
        } else {
            ListItem current = removalItem.next();
            ListItem parentOfLowestLeftEl = removalItem;
            while (current.previous() != null) {
                parentOfLowestLeftEl = current;
                current = current.previous();
            }
            removalItem.setValue(current.getValue());
            if (parentOfLowestLeftEl == removalItem) {
                removalItem.setNext(current.next());
            } else {
                parentOfLowestLeftEl.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
