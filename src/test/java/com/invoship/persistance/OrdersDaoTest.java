package com.invoship.persistance;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Database;

/**
 *
 *
 * @author John Oliver
 */
class OrdersDaoTest {

    private com.invoship.persistance.OrdersDao ordersDao;
    com.invoship.persistance.UserDao userDao;

    private final Logger logger = LogManager.getLogger(this.getClass());

    @BeforeEach
    void setUp() {
        this.ordersDao = new com.invoship.persistance.OrdersDao();
        this.userDao = new com.invoship.persistance.UserDao();
        Database database = Database.getInstance();
        UnitTestUtil.destroyTestDatabase();
        UnitTestUtil.createTestDatabase();
        UnitTestUtil.createTestData();
    }

    @Test
    void getById() {
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void insert() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }

    @Test
    void getByPropertyEqual() {
    }

    @Test
    void getByPropertyLike() {
    }
}