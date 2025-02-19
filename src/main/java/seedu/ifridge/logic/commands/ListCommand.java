package seedu.ifridge.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.ifridge.model.Model.PREDICATE_SHOW_ALL_GROCERY_ITEMS;

import seedu.ifridge.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_SUCCESS = "Listed all persons";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredGroceryItemList(PREDICATE_SHOW_ALL_GROCERY_ITEMS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
