package dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbUtilStepDefinitions {

    @Given("Kullanici DBUtill ile CHQA database'ine baglanir.")
    public void kullanici_db_utill_ile_chqa_database_ine_baglanir() {

        DBUtils.getConnection();
    }


    @Then("Kullanici DBUtill ile {string} tablosundaki {string} verilerini alir.")
    public void kullanici_db_utill_ile_tablosundaki_verilerini_alir(String table, String field) {

        String readQuery = "SELECT "+field+" FROM " + table;
        DBUtils.executeQuery(readQuery);
    }


    @Then("Kullanici DBUtill ile {string} sütunundaki {int}. fiyatin {int} oldugunu test eder.")
    public void kullanici_db_utill_ile_sütunundaki_fiyatin_oldugunu_test_eder(String field, Integer satirNo, Integer expectedPrice) throws Exception {

        DBUtils.getResultset().first();

        int satirsayisi = DBUtils.getRowCount();
        int aktifSatirNumarasi = 1;
        System.out.println(satirsayisi);
        DBUtils.getResultset().first();

        while (aktifSatirNumarasi<satirsayisi) {

            Object satirdakiObje = DBUtils.getResultset().getObject(field);
            System.out.println(aktifSatirNumarasi + " . satirdaki fiyat : " + DBUtils.getResultset().getDouble(field));
            DBUtils.getResultset().next();
            aktifSatirNumarasi++;
        }

        DBUtils.getResultset().absolute(satirNo);
        int actualDeger = (int) DBUtils.getResultset().getDouble(field);
        Assert.assertTrue(actualDeger==expectedPrice);
    }


    @Then("DBU IDHotel degeri {int} olan kaydin e-mail degerini {string} yapar.")
    public void dbuIDHotelDegeriOlanKaydinEMailDegeriniYapar(int IDHotelNo, String yeniEmail) throws SQLException {

        String updateQuery="UPDATE tHOTEL SET Email='"+yeniEmail+"' WHERE IDHotel="+IDHotelNo;
        DBUtils.executeQuery(updateQuery);

        String readQuery= "SELECT Email FROM tHOTEL";

        DBUtils.executeQuery(readQuery);

        int aktifSatirNumarasi=1;
        DBUtils.getResultset().first();

        while (aktifSatirNumarasi<100){

            Object satirdakiObje=DBUtils.getResultset().getObject("Email");
            System.out.println(aktifSatirNumarasi + ".satirdaki Email :" + satirdakiObje.toString());
            DBUtils.getResultset().next();
            aktifSatirNumarasi++;
        }
    }
}
