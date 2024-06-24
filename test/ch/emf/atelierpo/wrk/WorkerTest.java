package ch.emf.atelierpo.wrk;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class WorkerTest {

    public WorkerTest() {
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
     * Test of controlePlaqueImmatriculation method, of class Worker.
     */
    @Test
    public void a_testControlePlaqueImmatriculation() {
        System.out.println("testControlePlaqueImmatriculation");

        Worker instance = new Worker();

        boolean result;

        // TEST     canton      numeroDePlaque
        // ===================================
        // Tests obligatoires
        // ===================================
        // 1        null        null
        // 2        null        ""
        // 3        null        "FAUX"
        // 4        null        "999999"
        // ===================================
        // 5        ""          null
        // 6        ""          ""
        // 7        ""          "FAUX"
        // 8        ""          "999999"
        // ===================================
        // 9        "FAUX"      null
        // 10       "FAUX"      ""
        // 11       "FAUX"      "FAUX"
        // 12       "FAUX"      "999999"
        // ===================================
        // 13       "FR"        null
        // 14       "FR"        ""
        // 15       "FR"        "FAUX"
        // 16       "FR"        "999999"
        // ===================================
        // Tests spécifiques
        // ===================================
        // 17       "VD"        "1"
        // 18       "BS"        "45666"
        // 19       "ZH"        "9999992"
        // 20       "LU"        "-333"
        // 21       "G"         "89"
        // ===================================
        // ===================================
        // 1        null        null
        System.out.println("TEST 1        null        null");
        result = instance.controlePlaqueImmatriculation(null, null);
        assertFalse(result);
        System.out.println("TEST 1 > OK");
        // 2        null        ""
        System.out.println("TEST 2        null        \"\"");
        result = instance.controlePlaqueImmatriculation(null, "");
        assertFalse(result);
        System.out.println("TEST 2 > OK");
        // 3        null        "FAUX"
        System.out.println("TEST 3        null        \"FAUX\"");
        result = instance.controlePlaqueImmatriculation(null, "FAUX");
        assertFalse(result);
        System.out.println("TEST 3 > OK");
        // 4        null        "999999"
        System.out.println("TEST 4        null        \"999999\"");
        result = instance.controlePlaqueImmatriculation(null, "999999");
        assertFalse(result);
        System.out.println("TEST 4 > OK");
        // ===================================
        // 5        ""          null
        System.out.println("TEST 5        \"\"          null");
        result = instance.controlePlaqueImmatriculation("", null);
        assertFalse(result);
        System.out.println("TEST 5 > OK");
        // 6        ""          ""
        System.out.println("TEST 6        \"\"          \"\"");
        result = instance.controlePlaqueImmatriculation("", "");
        assertFalse(result);
        System.out.println("TEST 6 > OK");
        // 7        ""          "FAUX"
        System.out.println("TEST 7        \"\"          \"FAUX\"");
        result = instance.controlePlaqueImmatriculation("", "FAUX");
        assertFalse(result);
        System.out.println("TEST 7 > OK");
        // 8        ""          "999999"
        System.out.println("TEST 8        \"\"          \"999999\"");
        result = instance.controlePlaqueImmatriculation("", "999999");
        assertFalse(result);
        System.out.println("TEST 8 > OK");
        // ===================================
        // 9        "FAUX"      null
        System.out.println("TEST 9        \"FAUX\"      null");
        result = instance.controlePlaqueImmatriculation("FAUX", null);
        assertFalse(result);
        System.out.println("TEST 9 > OK");
        // 10       "FAUX"      ""
        System.out.println("TEST 10       \"FAUX\"      \"\"");
        result = instance.controlePlaqueImmatriculation("FAUX", "");
        assertFalse(result);
        System.out.println("TEST 10 > OK");
        // 11       "FAUX"      "FAUX"
        System.out.println("TEST 11       \"FAUX\"      \"FAUX\"");
        result = instance.controlePlaqueImmatriculation("FAUX", "FAUX");
        assertFalse(result);
        System.out.println("TEST 11 > OK");
        // 12       "FAUX"      "999999"
        System.out.println("TEST 12       \"FAUX\"      \"999999\"");
        result = instance.controlePlaqueImmatriculation("FAUX", "999999");
        assertFalse(result);
        System.out.println("TEST 12 > OK");
        // ===================================
        // 13       "FR"        null
        System.out.println("TEST 13       \"FR\"        null");
        result = instance.controlePlaqueImmatriculation("FR", null);
        assertFalse(result);
        System.out.println("TEST 13 > OK");
        // 14       "FR"        ""
        System.out.println("TEST 14       \"FR\"        \"\"");
        result = instance.controlePlaqueImmatriculation("FR", "");
        assertFalse(result);
        System.out.println("TEST 14 > OK");
        // 15       "FR"        "FAUX"
        System.out.println("TEST 15       \"FR\"        \"FAUX\"");
        result = instance.controlePlaqueImmatriculation("FR", "FAUX");
        assertFalse(result);
        System.out.println("TEST 15 > OK");
        // 16       "FR"        "999999"
        System.out.println("TEST 16       \"FR\"        \"999999\"");
        result = instance.controlePlaqueImmatriculation("FR", "999999");
        assertTrue(result);
        System.out.println("TEST 16 > OK");
        // ===================================
        // 17       "VD"        "1"
        System.out.println("TEST 17       \"VD\"        \"1\"");
        result = instance.controlePlaqueImmatriculation("VD", "1");
        assertTrue(result);
        System.out.println("TEST 17 > OK");
        // 18       "BS"        "45666"
        System.out.println("TEST 18       \"BS\"        \"45666\"");
        result = instance.controlePlaqueImmatriculation("BS", "45666");
        assertTrue(result);
        System.out.println("TEST 18 > OK");
        // 19       "ZH"        "9999992"
        System.out.println("TEST 19       \"ZH\"        \"9999992\"");
        result = instance.controlePlaqueImmatriculation("ZH", "9999992");
        assertFalse(result);
        System.out.println("TEST 19 > OK");
        // 20       "LU"        "-333"
        System.out.println("TEST 20       \"LU\"        \"-333\"");
        result = instance.controlePlaqueImmatriculation("LU", "-333");
        assertFalse(result);
        System.out.println("TEST 20 > OK");
        // 21       "G"         "89"
        System.out.println("TEST 21       \"G\"         \"89\"");
        result = instance.controlePlaqueImmatriculation("G", "89");
        assertFalse(result);
        System.out.println("TEST 21 > OK");
        // ===================================
        System.out.println("testControlePlaqueImmatriculation > OK");
    }

    /**
     * Test of controleNumeroTelMobile method, of class Worker.
     */
    @Test
    public void b_testControleNumeroTelMobile() {
        System.out.println("controleNumeroTelMobile");

        Worker instance = new Worker();

        boolean result;

        // TEST     prefix      numero
        // ===================================
        // Tests obligatoires
        // ===================================
        // 1        null        null
        // 2        null        ""
        // 3        null        "FAUX"
        // 4        null        "555 55 55"
        // ===================================
        // 5        ""          null
        // 6        ""          ""
        // 7        ""          "FAUX"
        // 8        ""          "555 55 55"
        // ===================================
        // 9        "FAUX"      null
        // 10       "FAUX"      ""
        // 11       "FAUX"      "FAUX"
        // 12       "FAUX"      "555 55 55"
        // ===================================
        // 13       "+4177"     null
        // 14       "+4177"     ""
        // 15       "+4177"     "FAUX"
        // 16       "+4177"     "555 55 55"
        // ===================================
        // Tests spécifiques
        // ===================================
        // 17       "+4176"     "000 00 00"
        // 18       "+4179"     "999 01 01"
        // 19       "+4173"     "999 67 67"
        // 20       "-4893"     "900 00 00"
        // 21       "+4179"     "9990101"
        // ===================================
        // ===================================
        // 1        null        null
        System.out.println("TEST 1        null        null");
        result = instance.controleNumeroTelMobile(null, null);
        assertFalse(result);
        System.out.println("TEST 1 > OK");
        // 2        null        ""
        System.out.println("TEST 2        null        \"\"");
        result = instance.controleNumeroTelMobile(null, "");
        assertFalse(result);
        System.out.println("TEST 2 > OK");
        // 3        null        "FAUX"
        System.out.println("TEST 3        null        \"FAUX\"");
        result = instance.controleNumeroTelMobile(null, "FAUX");
        assertFalse(result);
        System.out.println("TEST 3 > OK");
        // 4        null        "555 55 55"
        System.out.println("TEST 4        null        \"555 55 55\"");
        result = instance.controleNumeroTelMobile(null, "555 55 55");
        assertFalse(result);
        System.out.println("TEST 4 > OK");
        // ===================================
        // 5        ""          null
        System.out.println("TEST 5        \"\"          null");
        result = instance.controleNumeroTelMobile("", null);
        assertFalse(result);
        System.out.println("TEST 5 > OK");
        // 6        ""          ""
        System.out.println("TEST 6        \"\"          \"\"");
        result = instance.controleNumeroTelMobile("", "");
        assertFalse(result);
        System.out.println("TEST 6 > OK");
        // 7        ""          "FAUX"
        System.out.println("TEST 7        \"\"          \"FAUX\"");
        result = instance.controleNumeroTelMobile("", "FAUX");
        assertFalse(result);
        System.out.println("TEST 7 > OK");
        // 8        ""          "555 55 55"
        System.out.println("TEST 8        \"\"          \"555 55 55\"");
        result = instance.controleNumeroTelMobile("", "555 55 55");
        assertFalse(result);
        System.out.println("TEST 8 > OK");
        // ===================================
        // 9        "FAUX"      null
        System.out.println("TEST 9        \"FAUX\"      null");
        result = instance.controleNumeroTelMobile("FAUX", null);
        assertFalse(result);
        System.out.println("TEST 9 > OK");
        // 10       "FAUX"      ""
        System.out.println("TEST 10       \"FAUX\"      \"\"");
        result = instance.controleNumeroTelMobile("FAUX", "");
        assertFalse(result);
        System.out.println("TEST 10 > OK");
        // 11       "FAUX"      "FAUX"
        System.out.println("TEST 11       \"FAUX\"      \"FAUX\"");
        result = instance.controleNumeroTelMobile("FAUX", "FAUX");
        assertFalse(result);
        System.out.println("TEST 11 > OK");
        // 12       "FAUX"      "555 55 55"
        System.out.println("TEST 12       \"FAUX\"      \"555 55 55\"");
        result = instance.controleNumeroTelMobile("FAUX", "555 55 55");
        assertFalse(result);
        System.out.println("TEST 12 > OK");
        // ===================================
        // 13       "+4177"        null
        System.out.println("TEST 13       \"+4177\"        null");
        result = instance.controleNumeroTelMobile("+4177", null);
        assertFalse(result);
        System.out.println("TEST 13 > OK");
        // 14       "+4177"        ""
        System.out.println("TEST 14       \"+4177\"        \"\"");
        result = instance.controleNumeroTelMobile("+4177", "");
        assertFalse(result);
        System.out.println("TEST 14 > OK");
        // 15       "+4177"        "FAUX"
        System.out.println("TEST 15       \"+4177\"        \"FAUX\"");
        result = instance.controleNumeroTelMobile("+4177", "FAUX");
        assertFalse(result);
        System.out.println("TEST 15 > OK");
        // 16       "+4177"        "999999"
        System.out.println("TEST 16       \"+4177\"        \"555 55 55\"");
        result = instance.controleNumeroTelMobile("+4177", "555 55 55");
        assertTrue(result);
        System.out.println("TEST 16 > OK");
        // ===================================
        // 17       "+4176"        "000 00 00"
        System.out.println("TEST 17       \"+4176\"        \"000 00 00\"");
        result = instance.controleNumeroTelMobile("+4176", "000 00 00");
        assertTrue(result);
        System.out.println("TEST 17 > OK");
        // 18       "+4179"        "999 01 01"
        System.out.println("TEST 18       \"+4179\"        \"999 01 01\"");
        result = instance.controleNumeroTelMobile("+4179", "999 01 01");
        assertTrue(result);
        System.out.println("TEST 18 > OK");
        // 19       "+4173"        "999 67 67"
        System.out.println("TEST 19       \"+4173\"        \"999 67 67\"");
        result = instance.controleNumeroTelMobile("+4173", "999 67 67");
        assertFalse(result);
        System.out.println("TEST 19 > OK");
        // 20       "-4893"        "900 00 00"
        System.out.println("TEST 20       \"-4893\"        \"900 00 00\"");
        result = instance.controleNumeroTelMobile("-4893", "900 00 00");
        assertFalse(result);
        System.out.println("TEST 20 > OK");
        // 21       "+4179"         "9990101"
        System.out.println("TEST 21       \"+4179\"         \"9990101\"");
        result = instance.controleNumeroTelMobile("+4179", "9990101");
        assertFalse(result);
        System.out.println("TEST 21 > OK");
        // ===================================
        System.out.println("controleNumeroTelMobile > OK");

    }

}
