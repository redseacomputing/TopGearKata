package com.lagerweij;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    @Test
    public void should_start_engine() {
        GearBox gearBox = new GearBox();
        gearBox.switchGear(1000);
        assertEquals(1, gearBox.getGear());
    }

    @Test
    public void should_switch_from_first_to_second_gear() {
        GearBox gearBox = new GearBox();
        gearBox.switchGear(1000);

        gearBox.switchGear(2001);

        assertEquals(2, gearBox.getGear());
    }

    @Test
    public void should_switch_from_second_to_third_gear() {
        GearBox gearBox = new GearBox();
        gearBox.switchGear(1000);
        gearBox.switchGear(2001);

        gearBox.switchGear(499);

        assertEquals(1, gearBox.getGear());
    }

    @Test
    public void should_not_switch_over_sixth_gear() {
        GearBox gearBox = new GearBox();
        gearBox.switchGear(1001);
        gearBox.switchGear(2001);
        gearBox.switchGear(2001);
        gearBox.switchGear(2001);
        gearBox.switchGear(2001);
        gearBox.switchGear(2001);
        assertEquals(6, gearBox.getGear());

        gearBox.switchGear(2001);

        assertEquals(6, gearBox.getGear());
    }

}
