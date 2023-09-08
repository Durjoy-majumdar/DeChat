package u73;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import di3.C86312j;
import e00.C45519s0;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import u73.C52473z0;

/* renamed from: u73.a1 */
public class C52455a1 extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ MMWebView f146568a;

    /* renamed from: b */
    public final /* synthetic */ C52462f1 f146569b;

    /* renamed from: c */
    public final /* synthetic */ C52473z0 f146570c;

    public C52455a1(C52473z0 z0Var, MMWebView mMWebView, C52462f1 f1Var) {
        this.f146570c = z0Var;
        this.f146568a = mMWebView;
        this.f146569b = f1Var;
    }

    public void onPageFinished(WebView webView, String str) {
        String str2;
        Log.m105925i(this.f146570c.f146616a, "onPageFinished, view %s", webView.toString());
        C52473z0 z0Var = this.f146570c;
        MMWebView mMWebView = this.f146568a;
        C52462f1 f1Var = this.f146569b;
        Log.m105925i(z0Var.f146616a, "begin jsapi init,wv %s", mMWebView.toString());
        try {
            str2 = Util.convertStreamToString(mMWebView.getContext().getAssets().open("jsapi/wxjs.js"));
        } catch (Exception e) {
            Log.printErrStackTrace(z0Var.f146616a, e, "", new Object[0]);
            str2 = null;
        }
        if (str2 == null) {
            Log.m105920e(z0Var.f146616a, "loadJavaScript fail, jsContent is null");
            return;
        }
        mMWebView.evaluateJavascript("javascript:" + str2, new C52457b1(z0Var, mMWebView));
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        HashMap hashMap = new HashMap();
        hashMap.put("webview_type", "1");
        hashMap.put("init_url", mMWebView.getUrl());
        hashMap.put("init_font_size", "1");
        sb.append(C52473z0.C14138b.m13479b("sys:init", hashMap, false, mMWebView.getRandomStr()));
        sb.append(")");
        mMWebView.evaluateJavascript(sb.toString(), new C52458c1(z0Var, mMWebView));
        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + C52473z0.C14138b.m13479b("sys:bridged", (Map<String, Object>) null, false, mMWebView.getRandomStr()) + ")", new C52460d1(z0Var, mMWebView));
        StringBuilder sb4 = new StringBuilder();
        sb4.append("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        HashMap hashMap2 = new HashMap();
        LinkedList linkedList = new LinkedList();
        linkedList.add("menu:share:timeline");
        linkedList.add("menu:share:appmessage");
        linkedList.add("menu:share:weiboApp");
        linkedList.add("menu:share:QZone");
        linkedList.add("menu:share:qq");
        linkedList.add("onVoiceRecordEnd");
        linkedList.add("onVoicePlayBegin");
        linkedList.add("onVoicePlayEnd");
        linkedList.add("onLocalImageUploadProgress");
        linkedList.add("onImageDownloadProgress");
        linkedList.add("onVoiceUploadProgress");
        linkedList.add("onVoiceDownloadProgress");
        linkedList.add("onVideoUploadProgress");
        linkedList.add("onMediaFileUploadProgress");
        linkedList.add("menu:setfont");
        linkedList.add("menu:share:weibo");
        linkedList.add("menu:share:email");
        linkedList.add("wxdownload:state_change");
        linkedList.add("wxdownload:progress_change");
        linkedList.add("hdOnDeviceStateChanged");
        linkedList.add("activity:state_change");
        linkedList.add("onWXDeviceBluetoothStateChange");
        linkedList.add("onWXDeviceLanStateChange");
        linkedList.add("onWXDeviceBindStateChange");
        linkedList.add("onReceiveDataFromWXDevice");
        linkedList.add("onScanWXDeviceResult");
        linkedList.add("onWXDeviceStateChange");
        linkedList.add("onNfcTouch");
        linkedList.add("onBeaconMonitoring");
        linkedList.add("onBeaconsInRange");
        linkedList.add("menu:custom");
        linkedList.add("onSearchWAWidgetOpenApp");
        linkedList.add("onSearchDataReady");
        linkedList.add("onCurrentLocationReady");
        linkedList.add("onClientNavAction");
        linkedList.add("onNavBarShadowManuallyHidden");
        linkedList.add("onChatSearchDataReady");
        linkedList.add("onSearchHistoryReady");
        linkedList.add("onSearchWAWidgetOnTapCallback");
        linkedList.add("onSearchImageListReady");
        linkedList.add("onTeachSearchDataReady");
        linkedList.add("onSearchGuideDataReady");
        linkedList.add("onSearchInputChange");
        linkedList.add("onSearchInputConfirm");
        linkedList.add("onSearchSuggestionDataReady");
        linkedList.add("onMusicStatusChanged");
        linkedList.add("switchToTabSearch");
        linkedList.add("onVideoPlayerCallback");
        linkedList.add("onSelectContact");
        linkedList.add("onSearchWAWidgetAttrChanged");
        linkedList.add("onSearchWAWidgetReloadData");
        linkedList.add("onSearchWAWidgetReloadDataFinish");
        linkedList.add("onSearchWAWidgetStateChange");
        linkedList.add("onSearchWAWidgetDataPush");
        linkedList.add("onGetVertSearchEntriesData");
        linkedList.add("emoticonIsChosen");
        linkedList.add("onSimilarEmoticonReady");
        linkedList.add("onSearchWebQueryReady");
        linkedList.add("onPullDownRefresh");
        linkedList.add("onPageStateChange");
        linkedList.add("onGetKeyboardHeight");
        linkedList.add("onGetSmiley");
        linkedList.add("onAddShortcutStatus");
        linkedList.add("onFocusSearchInput");
        linkedList.add("onGetA8KeyUrl");
        linkedList.add("deleteAccountSuccess");
        linkedList.add("onGetMsgProofItems");
        linkedList.add("WNJSHandlerInsert");
        linkedList.add("WNJSHandlerMultiInsert");
        linkedList.add("WNJSHandlerExportData");
        linkedList.add("WNJSHandlerHeaderAndFooterChange");
        linkedList.add("WNJSHandlerEditableChange");
        linkedList.add("WNJSHandlerEditingChange");
        linkedList.add("WNJSHandlerSaveSelectionRange");
        linkedList.add("WNJSHandlerLoadSelectionRange");
        linkedList.add("onCustomGameMenuClicked");
        linkedList.add("onFinderViewEvent");
        linkedList.add("showLoading");
        linkedList.add("getSearchEmotionDataCallBack");
        linkedList.add("onNavigationBarRightButtonClick");
        linkedList.add("onSearchActionSheetClick");
        linkedList.add("onGetMatchContactList");
        linkedList.add("onUiInit");
        linkedList.add("onNetWorkChange");
        linkedList.add("onBackgroundAudioStateChange");
        if (!Util.isNullOrNil((List) null)) {
            linkedList.addAll((Collection) null);
        }
        hashMap2.put("__runOn3rd_apis", new JSONArray(linkedList));
        sb4.append(C52473z0.C14138b.m13479b("sys:attach_runOn3rd_apis", hashMap2, false, mMWebView.getRandomStr()));
        sb4.append(")");
        mMWebView.evaluateJavascript(sb4.toString(), new C52461e1(z0Var, mMWebView, f1Var));
        Log.m105924i(z0Var.f146616a, "jsapi init done");
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Log.m105925i(this.f146570c.f146616a, "onPageStarted, view %s", webView.toString());
        ((C45519s0) C86312j.m106911c(C45519s0.class)).mo70771uT(this.f146568a);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!((C45519s0) C86312j.m106911c(C45519s0.class)).mo70766WP(str, "weixin://private/setresult/")) {
            return false;
        }
        Log.m105925i(this.f146570c.f146616a, "handleUrl %s ,view %s", str, webView.toString());
        this.f146568a.evaluateJavascript("javascript:WeixinJSBridge._continueSetResult()", (ValueCallback<String>) null);
        return true;
    }
}
