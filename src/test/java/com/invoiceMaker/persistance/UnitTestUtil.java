package com.invoiceMaker.persistance;

import util.Database;

/**
 * This class is used to contain utility methods for testing.
 *
 * @author John Oliver
 */
public final class UnitTestUtil {

    public static void destroyTestDatabase() {
        Database database = Database.getInstance();
        database.runSQL("Invoice-Maker_drop.sql");
    }

    public static void createTestDatabase() {
        Database database = Database.getInstance();
        database.runSQL("Invoice-Maker_create.sql");
    }

    public static void createTestData() {
        Database database = Database.getInstance();
        database.runSQL("UsersTestData-07-10-2020-07-01-beta.sql");
    }

}
