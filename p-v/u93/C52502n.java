package u93;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44634d2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44635e2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import g83.C45900i;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import p225rc.C89925n;
import u93.C52497i;

/* renamed from: u93.n */
public final class C52502n extends C45900i {

    /* renamed from: c */
    public final /* synthetic */ C52497i f146659c;

    /* renamed from: d */
    public final /* synthetic */ C52505p f146660d;

    /* renamed from: u93.n$a */
    public static final class C52503a<T> implements ValueCallback {

        /* renamed from: a */
        public static final C52503a<T> f146661a = new C52503a<>();

        public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
            String str = (String) obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52502n(C52497i iVar, C52505p pVar) {
        super(0);
        this.f146659c = iVar;
        this.f146660d = pVar;
    }

    public void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "onPageFinished " + str);
        C52497i iVar = this.f146659c;
        C52505p pVar = this.f146660d;
        iVar.getClass();
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "loadJavaScript");
        try {
            str2 = Util.convertStreamToString(MMApplicationContext.getContext().getAssets().open("jsapi/wxjs.js"));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchPreloadLogic", e, "", new Object[0]);
            str2 = null;
        }
        pVar.evaluateJavascript("javascript:" + str2, new C52498j(iVar));
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        C52497i.C14140a.C14141a aVar = C52497i.C14140a.f39570a;
        HashMap hashMap = new HashMap();
        hashMap.put("webview_type", "1");
        hashMap.put("init_url", iVar.f146653a);
        hashMap.put("init_font_size", "1");
        sb.append(aVar.mo13551a("sys:init", hashMap));
        sb.append(')');
        pVar.evaluateJavascript(sb.toString(), new C52499k(iVar));
        pVar.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + aVar.mo13551a("sys:bridged", (Map<String, ? extends Object>) null) + ')', new C52500l(iVar));
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
        linkedList.add("onClientNavAction");
        linkedList.add("onNavBarShadowManuallyHidden");
        linkedList.add("onGetVertSearchEntriesData");
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
        linkedList.add("onDeviceMotionFired");
        linkedList.add("onCurrentLocationReady");
        linkedList.add("onSelectContact");
        linkedList.add("onSearchWAWidgetAttrChanged");
        linkedList.add("onSearchWAWidgetReloadData");
        linkedList.add("onSearchWAWidgetReloadDataFinish");
        linkedList.add("onSearchWAWidgetStateChange");
        linkedList.add("onSearchWAWidgetDataPush");
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
        hashMap2.put("__runOn3rd_apis", new JSONArray(linkedList));
        sb4.append(aVar.mo13551a("sys:attach_runOn3rd_apis", hashMap2));
        sb4.append(')');
        pVar.evaluateJavascript(sb4.toString(), new C52501m(iVar));
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C87412m.m108594g(webView, "view");
        super.onPageStarted(webView, str, bitmap);
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "onPageStarted " + str);
        C52505p pVar = this.f146660d;
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        if (pVar != null) {
            C44634d2 d2Var = new C44634d2(pVar);
            Log.m105918d("MicroMsg.WebViewUtil", "initIFrame");
            MMHandlerThread.postToMainThread(new C44635e2(d2Var));
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C87412m.m108594g(webView, "view");
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        if (!C89925n.m112490c(str, "weixin://private/setresult/")) {
            return false;
        }
        Log.m105925i("MicroMsg.WebSearch.WebSearchPreloadLogic", "handleUrl %s ,view %s", str, webView.toString());
        this.f146660d.evaluateJavascript("javascript:WeixinJSBridge._continueSetResult()", C52503a.f146661a);
        return true;
    }
}
