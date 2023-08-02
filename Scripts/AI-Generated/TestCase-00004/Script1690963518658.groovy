import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page_home click on hyperlink_172_category_khoa_hoc_suc_khoe --> navigate to Page_category_khoa-hoc-suc-khoe_'

testObj = findTestObject('Object Repository/Page_home/hyperlink_172_category_khoa_hoc_suc_khoe')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_category_khoa-hoc-suc-khoe_ click on hyperlink_172_an_tho_danh_cho_lua_tuoi_nao --> navigate to Page_an-tho-danh-cho-lua-tuoi-nao_'

testObj = findTestObject('Object Repository/Page_category_khoa-hoc-suc-khoe/hyperlink_172_an_tho_danh_cho_lua_tuoi_nao')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/khoa-hoc-suc-khoe(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_an-tho-danh-cho-lua-tuoi-nao_'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00004_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
