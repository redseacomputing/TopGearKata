package com.lagerweij;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    @Test
    public void should_start_engine() {
        GearBox gearBox = new GearBox();
        gearBox.switchGear(1000);
        assertEquals(1,gearBox.getGear());
    }

    @Test
    public void should_switch_from_first_to_second_gear() {
        GearBox gearBox = new GearBox();
        gearBox.switchGear(1000);
        gearBox.switchGear(2001);
        assertEquals(2,gearBox.getGear());
    }

    @Test
    public void should_switch_from_second_to_third_gear() {
        GearBox gearBox = new GearBox();
        gearBox.switchGear(1000);
        gearBox.switchGear(2001);
        gearBox.switchGear(499);
        assertEquals(1,gearBox.getGear());
    }

    /*
    *   Testfälle:
    *   +Wir sind im ersten Gang, haben 1000 Umdrehungen und sind immer noch im ersten Gang _
    *   +Sind im ersten Gang mit 2000 Umdrehungen und gehen in den zweiten Gang _
    *   +Sind im zweiten Gang, haben 500 Umdrehungen und sind im ersten Gang
    *   +
    * */
}
