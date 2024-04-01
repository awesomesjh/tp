package supertracker.command;

import supertracker.item.Inventory;
import supertracker.item.Item;
import supertracker.ui.Ui;

import java.util.List;

public class FindCommand implements Command {
    private String name;

    public FindCommand(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        int index = 1;
        boolean isFound = false;
        List<Item> items = Inventory.getItems();

        Ui.findIntro();
        for (Item item : items) {
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                Ui.printFoundItem(item, index);
                index++;
                isFound = true;
            }
        }
        if (!isFound) {
            Ui.printNoItemFound(name);
        }
    }

    @Override
    public boolean isQuit() {
        return false;
    }
}
