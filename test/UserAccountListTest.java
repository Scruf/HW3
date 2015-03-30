/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.egor.user.UserAccount;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Egor
 */
public class UserAccountListTest {
    
    public UserAccountListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of search method, of class UserAccountList.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String username = "";
        UserAccountList instance = new UserAccountList();
        UserAccount expResult = null;
        UserAccount result = instance.search(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class UserAccountList.
     */
    @Test
    public void testAdd_UserAccount() {
        System.out.println("add");
        UserAccount POINTER = null;
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.add(POINTER);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class UserAccountList.
     */
    @Test
    public void testAdd_3args() {
        System.out.println("add");
        String username = "";
        String password = "";
        String email = "";
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.add(username, password, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class UserAccountList.
     */
    @Test
    public void testEdit_String_UserAccount() {
        System.out.println("edit");
        String username = "";
        UserAccount POINTER = null;
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.edit(username, POINTER);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class UserAccountList.
     */
    @Test
    public void testEdit_3args() {
        System.out.println("edit");
        String username = "";
        String password = "";
        String email = "";
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.edit(username, password, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class UserAccountList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        String username = "";
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.remove(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeUsername method, of class UserAccountList.
     */
    @Test
    public void testChangeUsername() {
        System.out.println("changeUsername");
        String username = "";
        String newUsername = "";
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.changeUsername(username, newUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassWord method, of class UserAccountList.
     */
    @Test
    public void testChangePassWord() {
        System.out.println("changePassWord");
        String username = "";
        String newPassword = "";
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.changePassWord(username, newPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeEmail method, of class UserAccountList.
     */
    @Test
    public void testChangeEmail() {
        System.out.println("changeEmail");
        String username = "";
        String newEmail = "";
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.changeEmail(username, newEmail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class UserAccountList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        UserAccountList instance = new UserAccountList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class UserAccountList.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String username = "";
        String password = "";
        UserAccountList instance = new UserAccountList();
        boolean expResult = false;
        boolean result = instance.authenticate(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class UserAccountList.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        UserAccountList instance = new UserAccountList();
        instance.load();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class UserAccountList.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        UserAccountList instance = new UserAccountList();
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Database_Load method, of class UserAccountList.
     */
    @Test
    public void testDatabase_Load() {
        System.out.println("Database_Load");
        UserAccountList instance = new UserAccountList();
        instance.Database_Load();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Database_Save method, of class UserAccountList.
     */
    @Test
    public void testDatabase_Save() {
        System.out.println("Database_Save");
        UserAccountList instance = new UserAccountList();
        instance.Database_Save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class UserAccountList.
     */
  
    
}
