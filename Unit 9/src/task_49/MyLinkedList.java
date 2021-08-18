package task_49;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem inputItem) {
        if (root == null) {
            root = inputItem;
            return true;
        }
        ListItem current = root;
        while (current != null) {
            int comparison = current.compareTo(inputItem);
            if (comparison < 0) {
                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(inputItem);
                    inputItem.setPrevious(current);
                    return true;
                }
            } else if (comparison > 0) {
                if (current.previous() != null) {
                    current.previous().setNext(inputItem);
                    inputItem.setPrevious(current.previous());
                    inputItem.setNext(current);
                    current.setPrevious(inputItem);
                    return true;
                } else {
                    current.setPrevious(inputItem);
                    inputItem.setNext(current);
                    root = inputItem;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToDelete) {
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(itemToDelete);
            if (comparison == 0) {
                if (currentItem == root) {
                    root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
