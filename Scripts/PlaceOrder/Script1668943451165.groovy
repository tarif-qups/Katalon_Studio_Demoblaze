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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/PlaceOrder/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/PlaceOrder/a_Add to cart'))

sleep(1000)

WebUI.click(findTestObject('Object Repository/PlaceOrder/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/PlaceOrder/a_Cart'))

WebUI.click(findTestObject('Object Repository/PlaceOrder/a_Delete'))

WebUI.click(findTestObject('Object Repository/PlaceOrder/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/PlaceOrder/input_Name_name'), 'abc')

WebUI.setText(findTestObject('Object Repository/PlaceOrder/input_Country_country'), 'bd')

WebUI.setText(findTestObject('Object Repository/PlaceOrder/input_City_city'), 'dhk')

WebUI.setText(findTestObject('Object Repository/PlaceOrder/input_Credit card_card'), '1234556')

WebUI.setText(findTestObject('Object Repository/PlaceOrder/input_Month_month'), 'nov')

WebUI.setText(findTestObject('Object Repository/PlaceOrder/input_Year_year'), '2022')

WebUI.click(findTestObject('Object Repository/PlaceOrder/button_Purchase'))

WebUI.click(findTestObject('Object Repository/PlaceOrder/button_OK'))

WebUI.closeBrowser()

