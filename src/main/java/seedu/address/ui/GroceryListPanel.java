package seedu.address.ui;

import java.util.logging.Logger;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.Region;
import seedu.address.commons.core.LogsCenter;
import seedu.address.model.food.GroceryItem;

/**
 * Panel containing the list of persons.
 */
public class GroceryListPanel extends UiPart<Region> {
    private static final String FXML = "PersonListPanel.fxml";
    private final Logger logger = LogsCenter.getLogger(GroceryListPanel.class);

    @FXML
    private ListView<GroceryItem> groceryListView;

    public GroceryListPanel(ObservableList<GroceryItem> groceryList) {
        super(FXML);
        groceryListView.setItems(groceryList);
        groceryListView.setCellFactory(listView -> new GroceryListViewCell());
    }

    /**
     * Custom {@code ListCell} that displays the graphics of a {@code Person} using a {@code PersonCard}.
     */
    class GroceryListViewCell extends ListCell<GroceryItem> {
        @Override
        protected void updateItem(GroceryItem groceryItem, boolean empty) {
            super.updateItem(groceryItem, empty);

            if (empty || groceryItem == null) {
                setGraphic(null);
                setText(null);
            } else {
                setGraphic(new GroceryItemCard(groceryItem, getIndex() + 1).getRoot());
            }
        }
    }

}
