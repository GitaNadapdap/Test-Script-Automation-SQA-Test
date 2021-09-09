import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//open web browser
WebUI.openBrowser("https://www.cermati.com/gabung")

//input email
WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tabungan dan Promo Terbaik - Cermati.com/input__email'), "onainadapdap21@gmail.com")

//input password
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tabungan dan Promo Terbaik - Cermati.com/input__password'), "XA8EWhIfeOQ=")

//input confirm password
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tabungan dan Promo Terbaik - Cermati.com/input__password'), "XA8EWhIfeOQ=")

//input first name
WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tabungan dan Promo Terbaik - Cermati.com/input__firstName'), "Onai")

//input last name
WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tabungan dan Promo Terbaik - Cermati.com/input__lastName'), "Nadapdap")

//input phone number
WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tabungan dan Promo Terbaik - Cermati.com/input__mobilePhone'), "082277319005")

//input residence city
WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tabungan dan Promo Terbaik - Cermati.com/input__residenceCity'), "Toba Samosir")

//click button register
WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tabungan dan Promo Terbaik - Cermati.com/button_Daftar Akun'))

//close browser
WebUI.closeBrowser()

//@TearDown
//def onFailure(){
//	WebUI.closeBrowser()
//}

