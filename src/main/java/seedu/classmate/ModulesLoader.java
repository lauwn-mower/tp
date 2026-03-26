package seedu.classmate;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

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
            throw new ClassMateException("The core modules and/or specialisation modules files do not exist");
        }
    }

    public static ArrayList<Module> loadCoreModules() throws ClassMateException {
        ArrayList<Module> modules = new ArrayList<>();
        File file = new File(CORE_MODULES_PATH);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine().trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] tokens = line.split(",");
                // assert statement

                String moduleName = tokens[0];
                String moduleCode = tokens[1];
                String semester = tokens[2];
                String prerequisites = tokens[3];

                Module module = new Module(moduleCode, moduleName);
                module.setSemester(semester);

                if (!prerequisites.equals("None")) {
                    String[] prerequisiteCodes = prerequisites.split("\\|");
                    for (String prerequisiteCode : prerequisiteCodes) {
                        module.addPrerequisite(prerequisiteCode);
                    }
                }
                modules.add(module);
            }
        } catch (FileNotFoundException e) {
            throw new ClassMateException("The core modules files does not exist");
        }

        return modules;
    }
}
