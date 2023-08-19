package cc.robotdreams;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ManTest {

    @Test

    public void testAddHobbies() {
        Man man = new Man("John", "Doe", 30);
        man.addHobbies("Reading");
        man.addHobbies("Hiking");
        List<String> hobbies = man.getHobbies();

        assertEquals(2, hobbies.size());
        assertTrue(hobbies.contains("Reading"));
        assertTrue(hobbies.contains("Hiking"));
    }

    @Test
    public void testAddSportsInterest() {
        Man man = new Man("Robert", "Smith", 45);
        man.addSportsInterest("Football");
        man.addSportsInterest("Swimming");
        List<String> sportsInterests = man.getSportsInterests();

        assertEquals(2, sportsInterests.size());
        assertTrue(sportsInterests.contains("Football"));
        assertTrue(sportsInterests.contains("Swimming"));
    }

    @Test
    public void testSetAndGetOccupation() {
        Man man = new Man("Yan", "Presly", 28);
        man.setOccupation("Developer");

        assertEquals("Developer", man.getOccupation());
    }

    @Test
    public void testSetAndHasChildren() {
        Man man = new Man("Mike", "Nikols", 65);
        man.setHasChildren(true);

        assertTrue(man.hasChildren());
    }

    @Test
    public void testAddPet() {
        Man man = new Man("Matthew", "Grey", 38);
        man.addPet("Fish");
        man.addPet("Cat");
        List<String> pets = man.getPets();

        assertEquals(2, pets.size());
        assertTrue(pets.contains("Fish"));
        assertTrue(pets.contains("Cat"));
    }

    @Test
    public void testIsRetired() {
        Man man1 = new Man("Mike", "Nikols", 65);
        Man man2 = new Man("John", "Doe", 30);

        assertTrue(man1.isRetired());
        assertFalse(man2.isRetired());
    }

    @Test
    public void testIntroduceWithPartner() {
        Man man = new Man("Matthew", "Grey", 38);
        Woman woman = new Woman("Jassica", "Clapton", 35);
        man.registerPartnership(woman);
        woman.registerPartnership(man);

        man.setOccupation("Teacher");
        man.setHasChildren(true);

        String introduction = man.introduce();
        assertTrue(introduction.contains("Married to Jassica Clapton."));
        assertTrue(introduction.contains("Occupation: Teacher"));
        assertTrue(introduction.contains("hasChildren: true"));
    }
}

