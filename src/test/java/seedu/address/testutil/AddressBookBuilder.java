package seedu.address.testutil;

import seedu.address.model.GroceryList;
import seedu.address.model.food.GroceryItem;

/**
 * A utility class to help with building Addressbook objects.
 * Example usage: <br>
 *     {@code AddressBook ab = new AddressBookBuilder().withPerson("John", "Doe").build();}
 */
public class AddressBookBuilder {

    private GroceryList addressBook;

    public AddressBookBuilder() {
        addressBook = new GroceryList();
    }

    public AddressBookBuilder(GroceryList addressBook) {
        this.addressBook = addressBook;
    }

    /**
     * Adds a new {@code Person} to the {@code AddressBook} that we are building.
     */
    public AddressBookBuilder withPerson(GroceryItem food) {
        addressBook.addGroceryItem(food);
        return this;
    }

    public GroceryList build() {
        return addressBook;
    }
}
