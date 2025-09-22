package MedievalWitch;

public class Admir {

    package me.code;

import java.util.HashMap;
import java.util.Scanner;

    public class Main {
        private static final Scanner scanner = new Scanner(System.in);
        private static final HashMap<String, String> inventory = new HashMap<>();
        private static final HashMap<String, String> roomItems = new HashMap<>();
        private static final String currentRoom = "cave";
        private static boolean gameRunning = true;

        public static void main(String[] args) {
            setupRoomItems();
            startGame();
        }

        private static void setupRoomItems() {
            // lägg till andra items i format ("room_item","item description")
            // det kan vara hjälpsam om man lägger till flera rumm
            roomItems.put("cave_mushrooms", "De är giftiga, akta dig!");
        }

        public static void startGame() {
            System.out.println("Medeltidshäxa");
            System.out.println("I den här delen beskriver vi spelet.");
            showRoom();

            while (gameRunning) {
                System.out.print(">> ");
            /*
               trim() hjälper oss att ta bort "whitespace", annars får vi problemet
               att item inte finns även om den verkligen finns
             */
                String input = scanner.nextLine().toLowerCase().trim();
                executeCommand(input);
            }
        }

        private static void showHelp() {
            System.out.println("==== Hjälp ====");
            System.out.println("help - Visar den här hjälptexten");
            System.out.println("search [objekt] - letar efter föremål i rummet");
            System.out.println("pickup [objekt] - plockar upp ett föremål");
            System.out.println("inventory - Visar vad spelaren har med sig");
            System.out.println("look - beskriver rummet ");
            System.out.println("quit - avslutar spelet");
        }

        private static void executeCommand(String input) {
            // gör lista eftersom det inte finns flera kommandon
            String[] parts = input.split(" ", 2);
            String command = parts[0];
            // kollar om arrayen har mer än 1 element,
            // om sant, lägger till andra element
            // om inte sant, empty sträng
            String itemName = parts.length > 1 ? parts[1] : "";

            switch (command) {
                case "help":
                    showHelp();
                    break;
                case "search":
                    searchItem(itemName);
                    break;
                case "pickup":
                    pickupItem(itemName);
                    break;
                case "look":
                    showRoom();
                    break;
                case "inventory":
                    showInventory();
                    break;
                case "quit":
                    quitGame();
                    break;
                default:
                    System.out.println("Kommand finns inte. Skriv 'help' för hjälp.");
            }
        }

        private static void searchItem(String item) {
            if(item.isEmpty()) {
                System.out.println("Elara ser omkring..");
                showItemsInRoom();
                return;
            }
            String itemKey = currentRoom + "_" + item;
            if(roomItems.containsKey(itemKey)) {
                System.out.println("Du hittade: " + item + " - " + roomItems.get(itemKey));
            } else {
                System.out.println("Kan inte hitta föremål med detta namn.");
            }
        }

        private static void pickupItem(String item) {
            if(item.isEmpty()) {
                System.out.println("Vad vill du plocka upp?");
                showItemsInRoom();
                return;
            }

            // kanske vi kan lägga till max items som kan vara i påsen?
            String itemKey = currentRoom + "_" + item;
            if(roomItems.containsKey(itemKey)) {
                // lägg den i påsen
                inventory.put(item, roomItems.get(itemKey));
                // ta bort item ur rummet
                roomItems.remove(itemKey);
                System.out.println("Du plockade upp " + item + " och la den i påsen.");
            } else {
                System.out.println("Det finns inget att plocka upp.");
            }
        }

        private static void showItemsInRoom() {
            boolean foundItems = false;
            System.out.println("Du ser: ");
            for (String key : roomItems.keySet()) {
                if (key.startsWith(currentRoom + "_")) {
                    String item = key.substring(currentRoom.length() + 1);
                    System.out.println("- " + item);
                    foundItems = true;
                }
            }
            if(!foundItems){
                System.out.print("Rummet är tomt.");
            }
        }

        private static void showInventory() {
            System.out.println("=== Elaras påse ====");
            if(inventory.isEmpty()) {
                System.out.println("Påsen är tom.");
            } else {
                for (HashMap.Entry<String, String> item : inventory.entrySet()) {
                    // items namn och beskrivning
                    // kanske det räcker bara namnet?
                    System.out.println("- " + item.getKey() + ": " + item.getValue());
                }
            }
        }
        private static void showRoom() {
            System.out.println("\n==== " + getRoomName() + " ====");
            System.out.println(getRoomDescription());
        }

        private static String getRoomName() {
            switch (currentRoom) {
                // vi kan läga till fler om det behövs
                case "cave":
                    return "Elaras cave";
                default:
                    return "Okänt room.";
            }
        }

        private static String getRoomDescription() {
            switch (currentRoom) {
                // vi kan läga till fler om det behövs
                case "cave":
                    return "Här lägger vi beskrivning av rummet";
                default:
                    return "Ökand plats.";
            }
        }

        private static void quitGame() {
            gameRunning = false;
        }
    }

}
