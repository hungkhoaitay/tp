package seedu.address.model.group.exceptions;

/**
 * Signals that the operation will result in duplicate Groups (Groups are considered duplicates if they have the same
 * identity).
 */
public class DuplicateGroupException extends RuntimeException {
    public DuplicateGroupException() {
        super("Group with that name already exists in the list!");
    }
}
