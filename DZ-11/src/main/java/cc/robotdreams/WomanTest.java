package cc.robotdreams;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class WomanTest {


        @Test
        // Test to check the registration of partnership
        public void testRegisterPartnership() {
            Woman woman = new Woman("Jassica", "Clapton", 35);
            Man man = new Man("Matthew", "Grey", 38);

            woman.registerPartnership(man);

            assertEquals(man, woman.getPartner());
            assertEquals(woman, man.getPartner());
            assertEquals(man.getLastName(), woman.getLastName());
        }

    @Test
    public void testDeregisterPartnership() {
        Woman woman = new Woman("Monica", "Cupper", 25);
        Man man = new Man("Yan", "Presly", 28);

        woman.registerPartnership(man);

        String previousLastName = woman.getLastNameBeforeMarriage(); // Store the previous last name

        woman.deregisterPartnership(true); // Deregister partnership and unset partner

        assertNull(woman.getPartner());
        assertNull(man.getPartner());
        assertEquals(previousLastName, woman.getLastName()); // LastName should be reverted
    }



    @Test
    // Test to check the addition of shopping preferences
    public void testAddShoppingPreference() {
        Woman woman = new Woman("Ashley", "Wilson", 31);
        woman.addShoppingPreference("clothing");
        woman.addShoppingPreference("shoes");

        assertTrue(woman.getShoppingPreferences().contains("clothing"));
        assertTrue(woman.getShoppingPreferences().contains("shoes"));
        assertFalse(woman.getShoppingPreferences().contains("groceries"));
    }

    @Test
    // Test to check the retrieval of shopping preferences
    public void testGetShoppingPreferences() {
        Woman woman = new Woman("Ann", "Green", 61);
        woman.addShoppingPreference("makeup");
        woman.addShoppingPreference("electronics");

        assertTrue(woman.getShoppingPreferences().contains("makeup"));
        assertTrue(woman.getShoppingPreferences().contains("electronics"));
        assertFalse(woman.getShoppingPreferences().contains("home staff"));
    }


    @Test
    // Test to check getFullName() method
    public void testGetFullName() {
        Woman woman = new Woman("Rachel", "Bradley", 40);
        String fullName = woman.getFullName();

        assertEquals("Rachel Bradley", fullName);
    }

    // Test to check introduce() method

    @Test
    public void testIntroduceWithoutPartner() {
        Woman woman = new Woman("Monica", "Cupper", 25);
        woman.setOccupation("Seller");
        woman.setHasChildren(false);

        String introduction = woman.introduce();

        assertTrue(introduction.contains("Monica Cupper"));
        assertFalse(introduction.contains("Married to"));
        assertTrue(introduction.contains("Occupation: Seller"));
        assertTrue(introduction.contains("hasChildren: false"));
    }

    @Test
    public void testGetAge() {
        Woman woman = new Woman("Ashley", "Wilson", 31);
        assertEquals(31, woman.getAge());
    }

    @Test
    public void testSetAge() {
        Woman woman = new Woman("Ann", "Green", 61);

        woman.setAge(59);
        assertEquals(59, woman.getAge());

        woman.setAge(50);
        assertEquals(50, woman.getAge());
    }


    // Test to check isRetired() method
    @Test
    public void testIsRetired() {
        Woman retiredWoman = new Woman("Ann", "Green", 61);
        Woman nonRetiredWoman = new Woman("Rachel", "Bradley", 40);

        assertTrue(retiredWoman.isRetired());
        assertFalse(nonRetiredWoman.isRetired());
    }

    // Test to check getAddress() method
    @Test
    public void testGetAddress() {
        Woman woman = new Woman("Jassica", "Clapton", 35);
        woman.setAddress("5th Avenue");

        assertEquals("5th Avenue", woman.getAddress());
    }

    // Test to check setAddress() method
    @Test
    public void testSetAddress() {
        Woman woman = new Woman("Monica", "Cupper", 25);
        woman.setAddress("Main St");

        assertEquals("Main St", woman.getAddress());
    }

    // Test to check getPets() method

    @Test
    public void testGetPets() {
        Woman woman = new Woman("Ashley", "Wilson", 31);
        woman.addPet("hamster");
        woman.addPet("cat");

        assertTrue(woman.getPets().contains("hamster"));
        assertTrue(woman.getPets().contains("cat"));
    }

}

