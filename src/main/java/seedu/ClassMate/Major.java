package seedu.ClassMate;

import java.util.ArrayList;

public class Major {

    // Store major requirements as a list of Module objects
    private ArrayList<Module> coreModules;

    // Construct CEGMajor object
    public Major() {
        this.coreModules = new ArrayList<>();
        setupCEGModules();
    }

    // Setup coreModule list by hardcoding the construction of modules
    private void setupCEGModules() {
        /* TODO:
         * Construct Module objects
         * Add to ArrayList<Module>
         * Set prerequisites
         */
    }
}
