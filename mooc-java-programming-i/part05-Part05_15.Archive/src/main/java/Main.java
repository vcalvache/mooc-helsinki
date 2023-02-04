
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        In this exercise you get to implement a program that can be used to handle an archive.
        Several items can be added to it. When no more items are added, all the items in the archive are printed.

        Part 1: Adding and listing items
        The program should read items from the user. When all the items from the user have been read,
        the program prints the information of each item.

        For each item, its identifier and name should be read. If the identifier or name is empty,
        the program stops asking for input, and prints all the item information.

        Example print:

        Sample output
        Identifier? (empty will stop)
        B07H8ND8HH
        Name? (empty will stop)
        He-Man figure
        Identifier? (empty will stop)
        B07H8ND8HH
        Name? (empty will stop)
        He-Man
        Identifier? (empty will stop)
        B07NQFMZYG
        Name? (empty will stop)
        He-Man figure
        Identifier? (empty will stop)
        B07NQFMZYG
        Name? (empty will stop)
        He-Man figure
        Identifier? (empty will stop)

        ==Items==
        B07H8ND8HH: He-Man figure
        B07H8ND8HH: He-Man
        B07NQFMZYG: He-Man figure
        B07NQFMZYG: He-Man figure

        The printing format of the items should be identifier: name.

        NB! Don't print the colon (:) anywhere else in the output of the program.

        Part 2: You only print once (per item)
        Modify the program so that after entering the items, each item is printed at most once.
        Two items should be considered the same if their identifiers are the same
        (there can be variation in their names in different countries, for instance).

        If the user enters the same item multiple times, the print uses the item that was added first.

        Sample output
        Identifier? (empty will stop)
        B07H8ND8HH
        Name? (empty will stop)
        He-Man figure
        Identifier? (empty will stop)
        B07H8ND8HH
        Name? (empty will stop)
        He-Man
        Identifier? (empty will stop)
        B07NQFMZYG
        Name? (empty will stop)
        He-Man figure
        Identifier? (empty will stop)
        B07NQFMZYG
        Name? (empty will stop)
        He-Man figure
        Identifier? (empty will stop)

        ==Items==
        B07H8ND8HH: He-Man figure
        B07NQFMZYG: He-Man figure

        Hint! It is probably smart to add each item to the list at most once —
        compare the equality of the objects based on their identifiers.
        */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> itemArchive = new ArrayList<>();

        while (true){
            System.out.println("Identifier? (empty will stop)");
            String givenIdentifier = scanner.nextLine();
            if (givenIdentifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String givenName = scanner.nextLine();
            
            if (givenName.isEmpty()){
                break;
            }

            Items itemToAdd= new Items(givenIdentifier, givenName);
            
            if (itemArchive.contains(itemToAdd) == false){
                itemArchive.add(itemToAdd);
            }

        }

        System.out.println("==Items==");
        for (Items item: itemArchive){
            System.out.println(item);
        }

    }
}
