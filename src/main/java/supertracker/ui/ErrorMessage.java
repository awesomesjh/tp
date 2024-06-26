package supertracker.ui;

public class ErrorMessage {
    public static final String INVALID_UPDATE_FORMAT = "Invalid update command format!";
    public static final String INVALID_RENAME_FORMAT = "Invalid rename command format!";
    public static final String EMPTY_PARAM_INPUT = "Parameters cannot be left empty!";
    public static final String INVALID_DELETE_FORMAT = "Invalid delete command format!";
    public static final String INVALID_LIST_FORMAT = "Invalid list command format!";
    public static final String INVALID_NEW_ITEM_FORMAT = "Invalid new command format!";
    public static final String INVALID_ADD_FORMAT = "Invalid add command format!";
    public static final String INVALID_REMOVE_FORMAT = "Invalid remove command format!";
    public static final String INVALID_BUY_FORMAT = "Invalid buy command format!";
    public static final String INVALID_SELL_FORMAT = "Invalid sell command format!";
    public static final String INVALID_CLEAR_FORMAT = "Invalid clear command format!";
    public static final String INVALID_REPORT_FORMAT = "Invalid report command format! " +
            "Follow 'report r/REPORT_TYPE [t/THRESHOLD_VALUE]'";
    public static final String INVALID_EXP_FORMAT = "Invalid expenditure command format! " +
            "Follow 'exp type/EXPENDITURE_TYPE [from/START_DATE] [to/END_DATE]'";
    public static final String INVALID_REV_FORMAT = "Invalid revenue command format! " +
            "Follow 'rev type/REVENUE_TYPE [from/START_DATE] [to/END_DATE]'";
    public static final String INVALID_PROFIT_FORMAT = "Invalid profit command format! " +
            "Follow 'profit type/PROFIT_TYPE [from/START_DATE] [to/END_DATE]'";
    public static final String INVALID_REPORT_TYPE = "Please select a valid report type. Only 'low stock' and " +
            "'expiry' are available.";
    public static final String INVALID_EXPIRY_REPORT_FORMAT = "If report type is 'expiry' threshold should not be " +
            "specified.";
    public static final String ITEM_NOT_IN_LIST_UPDATE =
            " does not exist in inventory. Unable to update its values. =(";
    public static final String ITEM_NOT_IN_LIST_DELETE =
            " does not exist in inventory. Unable to delete something that does not exist. =(";
    public static final String ITEM_NOT_IN_LIST_ADD =
            " does not exist in inventory. Unable to increase its quantity. =(";
    public static final String ITEM_NOT_IN_LIST_REMOVE =
            " does not exist in inventory. Unable to decrease its quantity. =(";
    public static final String ITEM_NOT_IN_LIST_RENAME =
            " does not exist in inventory. Unable to rename your desired item.";
    public static final String ITEM_NOT_IN_LIST_BUY =
            " does not exist in inventory. Unable to buy. =(";
    public static final String ITEM_NOT_IN_LIST_SELL =
            " does not exist in inventory. Unable to sell. =(";
    public static final String ITEM_IN_LIST_NEW = " already exists in inventory. Use the update command instead.";
    public static final String ITEM_IN_LIST_RENAME = " already exists in the inventory. Please choose another new name";
    public static final String QUANTITY_NOT_INTEGER = "Quantity should be a non-negative integer";
    public static final String INVALID_NUMBER_FORMAT = "Invalid values for price/quantity";
    public static final String INVALID_QUANTITY_FORMAT = "Invalid value for quantity";
    public static final String INVALID_PRICE_FORMAT = "Invalid value for price";
    public static final String INVALID_DATE_FORMAT = "Invalid date. Follow \"dd-mm-yyyy\" format";
    public static final String INVALID_DATE = "This date cannot exist";
    public static final String QUANTITY_NOT_POSITIVE = "Quantity should be more than or equal to 1";
    public static final String QUANTITY_TOO_SMALL = "Quantity should be more than or equal to 0";
    public static final String PRICE_TOO_SMALL = "Price should be more than or equal to 0";
    public static final String QUANTITY_TOO_LARGE = "Quantity should be less than or equal to 2147483647";
    public static final String PRICE_TOO_LARGE = "Price should be less than or equal to 2147483647";
    public static final String FILE_HANDLER_ERROR = "Error setting up file handler";
    public static final String INVALID_FIND_FORMAT = "Invalid find command format!";
    public static final String FILE_SAVE_ERROR = "Oops! Unable to save data due to an I/O error!";
    public static final String FILE_LOAD_ERROR = "Oops! Unable to load your previous data due to an I/O error!";
    public static final String ITEM_FILE_CORRUPTED_ERROR =
            "Oops! Unable to load some of your previous item data as the data in the save file has been corrupted!";
    public static final String TRANSACTION_FILE_CORRUPTED_ERROR =
            "Oops! Unable to load some of your previous transaction data"
            + " as the data in the save file has been corrupted!";
    public static final String TRANSACTION_DATE_LOAD_ERROR = "Looks like you might have edited a transaction date "
            + "in the save file to a date that has not happened yet";
    public static final String INTEGER_OVERFLOW = "Unable to add your specified number of items. " +
            "Why do you need more than 2147483647 items anyway?";
    public static final String INVALID_REV_TODAY_FORMAT = "Invalid revenue command format. " +
            "\"rev task/today\"";
    public static final String INVALID_REV_TOTAL_FORMAT = "Invalid revenue command format. " +
            "\"rev task/total\"";
    public static final String INVALID_REV_DAY_FORMAT = "Invalid revenue command format. " +
            "\"rev task/day from/DATE\"";
    public static final String INVALID_REV_RANGE_FORMAT = "Invalid revenue command format. "
            + "\"rev task/range from/START_DATE to/END_DATE\"";
    public static final String INVALID_EXP_TODAY_FORMAT = "Invalid expenditure command format. " +
            "\"exp task/today\"";
    public static final String INVALID_EXP_TOTAL_FORMAT = "Invalid expenditure command format. " +
            "\"exp task/total\"";
    public static final String INVALID_EXP_DAY_FORMAT = "Invalid expenditure command format. " +
            "\"exp task/day from/DATE\"";
    public static final String INVALID_EXP_RANGE_FORMAT = "Invalid expenditure command format. "
            + "\"exp task/range from/START_DATE to/END_DATE\"";
    public static final String INVALID_PROFIT_TODAY_FORMAT = "Invalid profit command format. " +
            "\"profit task/today\"";
    public static final String INVALID_PROFIT_TOTAL_FORMAT = "Invalid profit command format. " +
            "\"profit task/total\"";
    public static final String INVALID_PROFIT_DAY_FORMAT = "Invalid profit command format. " +
            "\"profit task/day from/DATE\"";
    public static final String INVALID_PROFIT_RANGE_FORMAT = "Invalid profit command format. " +
            "\"profit task/range from/START_DATE to/END_DATE\"";
}
