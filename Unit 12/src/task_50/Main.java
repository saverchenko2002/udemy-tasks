package task_50;

import java.util.*;

public class Main {
    private Map<Integer, Location> locations = new HashMap<>();
    private Map<String, String> vocabulary = new HashMap<>();

    public static void main(String[] args) {
        new Main().command();
    }

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        vocabulary.put("QUIT", "Q");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("NORTH", "N");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
    }

    public void command() {
        String INVALID_DIRECTION = "You cannot go in that direction";
        String HINT_MESSAGE = "Available exits are ";

        String[] dividedInput;

        int currentLocation = 1;
        final int quitLocation = 0;
        String direction;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(locations.get(currentLocation).getDescription());
            System.out.println(HINT_MESSAGE + locations.get(currentLocation).getExits().keySet()
                    .toString()
                    .replace("[", "")
                    .replace("]", ", ") + "\n");

            direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                dividedInput = direction.split(" ");
                for (String currentWord : dividedInput) {
                    if (vocabulary.containsKey(currentWord)) {
                        direction = vocabulary.get(currentWord);
                        break;
                    }
                }
            }

            if (direction.equals("Q")) {
                scanner.close();
                System.out.println(locations.get(quitLocation).getDescription());
                break;
            } else if (locations.get(currentLocation).getExits().containsKey(direction)) {
                currentLocation = locations.get(currentLocation).getExits().get(direction);
            } else {
                System.out.println(INVALID_DIRECTION + "\n");
            }
        }
    }
}