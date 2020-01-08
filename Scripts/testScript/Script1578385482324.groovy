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

WebUI.openBrowser("http://localhost:8080/login")

WebUI.setText(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah 212  Login/input_Koperasi_username'), "admin.212@yopmail.com")

WebUI.setText(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah 212  Login/input_Koperasi_password'), "admin")

WebUI.click(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah 212  Login/button_Masuk'))

WebUI.click(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah/a_Master'))

WebUI.click(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah/a_Cooperative Saving'))

WebUI.setText(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah/input_Cooperative Saving_nama'), "test")

WebUI.click(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah/button_Cooperative Saving_btn btn-default'))

WebUI.click(findTestObject('Object Repository/TestScriptTambahan/Page_Koperasi Syariah/a_Aktif_btn btn-warning'))

WebUI.setText(findTestObject('Object Repository/TestScriptTambahan/Page_Koperasi Syariah/input_Name_title'), "simpanan istri")

WebUI.click(findTestObject('Object Repository/TestScriptTambahan/Page_Koperasi Syariah/button_Save'))

WebUI.click(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah/span_Administrator'))

WebUI.click(findTestObject('Object Repository/TestScript/Page_Koperasi Syariah/a_Logout'))

WebUI.closeBrowser()