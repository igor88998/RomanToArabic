package org.example;


/*
    @author igormakovijcuk
    @project RomanToArabic
    @class UtilTest
    @version 1.0.0
    @since 02.03.2024 - 21.05
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilTest {

    @Test
    public void WhenRomanNumberIs_MDSVC_Then_null() {
        assertEquals(null, Util.toArabic("MDSVC"));
    }

    @Test
    public void WhenRomanNumberIs_a_To_z_Then_null() {
        for (char c = 'a'; c <= 'z'; c++) {
            assertEquals(null, Util.toArabic(String.valueOf(c)));
        }
    }

    @Test
    public void WhenRomanNumberIs_I_Then_1() {
        assertEquals(1, Util.toArabic("I"));
    }

    @Test
    public void WhenRomanNumberIs_II_Then_2() {
        assertEquals(2, Util.toArabic("II"));
    }

    @Test
    public void WhenRomanNumberIs_IV_Then_4() {
        assertEquals(4, Util.toArabic("IV"));
    }

    @Test
    public void whenRomanNumberIs_V_Then_5() {
        assertEquals(5, Util.toArabic("V"));
    }

    @Test
    public void whenRomanNumberIs_VI_Then_6() {
        assertEquals(6, Util.toArabic("VI"));
    }

    @Test
    public void whenRomanNumberIs_VII_Then_7() {
        assertEquals(7, Util.toArabic("VII"));
    }

    @Test
    public void whenRomanNumberIs_IX_Then_9() {
        assertEquals(9, Util.toArabic("IX"));
    }

    @Test
    public void whenRomanNumberIs_X_Then_10() {
        assertEquals(10, Util.toArabic("X"));
    }

    @Test
    public void whenRomanNumberIs_XI_Then_11() {
        assertEquals(11, Util.toArabic("XI"));
    }

    @Test
    public void whenRomanNumberIs_XII_Then_12() {
        assertEquals(12, Util.toArabic("XII"));
    }

    @Test
    public void whenRomanNumberIs_XV_Then_15() {
        assertEquals(15, Util.toArabic("XV"));
    }

    @Test
    public void whenRomanNumberIs_XVI_Then_16() {
        assertEquals(16, Util.toArabic("XVI"));
    }

    @Test
    public void whenRomanNumberIs_XIX_Then_19() {
        assertEquals(19, Util.toArabic("XIX"));
    }

    @Test
    public void whenRomanNumberIs_XX_Then_20() {
        assertEquals(20, Util.toArabic("XX"));
    }

    @Test
    public void whenRomanNumberIs_XXI_Then_21() {
        assertEquals(21, Util.toArabic("XXI"));
    }

    @Test
    public void whenRomanNumberIs_XXIV_Then_24() {
        assertEquals(24, Util.toArabic("XXIV"));
    }

    @Test
    public void whenRomanNumberIs_XXX_Then_30() {
        assertEquals(30, Util.toArabic("XXX"));
    }

    @Test
    public void whenRomanNumberIs_XXXI_Then_31() {
        assertEquals(31, Util.toArabic("XXXI"));
    }

    @Test
    public void whenRomanNumberIs_XXXIV_Then_34() {
        assertEquals(34, Util.toArabic("XXXIV"));
    }

    @Test
    public void whenRomanNumberIs_XXXV_Then_35() {
        assertEquals(35, Util.toArabic("XXXV"));
    }

    @Test
    public void whenRomanNumberIs_XL_Then_40() {
        assertEquals(40, Util.toArabic("XL"));
    }

    @Test
    public void whenRomanNumberIs_L_Then_50() {
        assertEquals(50, Util.toArabic("L"));
    }

    @Test
    public void whenRomanNumberIs_LX_Then_60() {
        assertEquals(60, Util.toArabic("LX"));
    }

    @Test
    public void whenRomanNumberIs_LXX_Then_70() {
        assertEquals(70, Util.toArabic("LXX"));
    }

    @Test
    public void whenRomanNumberIs_XC_Then_90() {
        assertEquals(90, Util.toArabic("XC"));
    }

    @Test
    public void whenRomanNumberIs_C_Then_100() {
        assertEquals(100, Util.toArabic("C"));
    }

    @Test
    public void whenRomanNumberIs_CC_Then_200() {
        assertEquals(200, Util.toArabic("CC"));
    }

    @Test
    public void whenRomanNumberIs_CCC_Then_300() {
        assertEquals(300, Util.toArabic("CCC"));
    }

    @Test
    public void whenRomanNumberIs_CD_Then_400() {
        assertEquals(400, Util.toArabic("CD"));
    }

    @Test
    public void whenRomanNumberIs_D_Then_500() {
        assertEquals(500, Util.toArabic("D"));
    }

    @Test
    public void whenRomanNumberIs_DC_Then_600() {
        assertEquals(600, Util.toArabic("DC"));
    }

    @Test
    public void whenRomanNumberIs_DCC_Then_700() {
        assertEquals(700, Util.toArabic("DCC"));
    }

    @Test
    public void whenRomanNumberIs_CM_Then_900() {
        assertEquals(900, Util.toArabic("CM"));
    }

    @Test
    public void whenRomanNumberIs_CMXCIX_Then_999() {
        assertEquals(999, Util.toArabic("CMXCIX"));
    }

    @Test
    public void whenRomanNumberIs_M_Then_1000() {
        assertEquals(1000, Util.toArabic("M"));
    }

    @Test
    public void whenRomanNumberIs_MC_Then_1100() {
        assertEquals(1100, Util.toArabic("MC"));
    }

    @Test
    public void whenRomanNumberIs_MCD_Then_1400() {
        assertEquals(1400, Util.toArabic("MCD"));
    }

    @Test
    public void whenRomanNumberIs_MD_Then_1500() {
        assertEquals(1500, Util.toArabic("MD"));
    }

    @Test
    public void whenRomanNumberIs_MCM_Then_1900() {
        assertEquals(1900, Util.toArabic("MCM"));
    }

    @Test
    public void whenRomanNumberIs_MM_Then_2000() {
        assertEquals(2000, Util.toArabic("MM"));
    }

    @Test
    public void whenRomanNumberIs_MMM_Then_3000() {
        assertEquals(3000, Util.toArabic("MMM"));
    }

    @Test
    public void whenRomanNumberIs_MMMM_Then_null() {
        assertEquals(null, Util.toArabic("MMMM"));
    }

}