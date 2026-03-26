package seedu.classmate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ModulesLoader {
    private static final String CORE_MODULES_PATH = "./data/core-modules.txt";
    private static final String SPECIALISATION_MODULES_PATH = "./data/specialisation-modules.txt";

    public void ensureDataFilesExist() throws ClassMateException {
        File coreModulesFile = new File(CORE_MODULES_PATH);
        File coreModulesDirectory = coreModulesFile.getParentFile();
        File specialisationModulesFile = new File(SPECIALISATION_MODULES_PATH);
        File specialisationModulesDirectory = specialisationModulesFile.getParentFile();

        if ((coreModulesDirectory != null && !coreModulesDirectory.exists()) ||
                (specialisationModulesDirectory != null && !specialisationModulesDirectory.exists())) {
            throw new ClassMateException("The core modules and specialisation modules files are not exist");
        }
    }

    public static void loadCoreModules() throws FileNotFoundException {
        File file = new File(CORE_MODULES_PATH);
    }
}
