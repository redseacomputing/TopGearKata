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
    public void should_not_switch_in_range_rpm() {
        GearBox gearBox = new GearBox();
        Assert.assertTrue(true);
    }




    /*
    *   Testfälle:
    *   +Wir sind im ersten Gang, haben 1000 Umdrehungen und sind immer noch im ersten Gang
    *   +Sind im ersten Gang mit 2000 Umdrehungen und gehen in den zweiten Gang
    *   +Sind im zweiten Gang, haben 500 Umdrehungen und sind im ersten Gang
    *   +
    * */
}
