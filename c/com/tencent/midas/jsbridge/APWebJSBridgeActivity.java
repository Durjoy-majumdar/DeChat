package com.tencent.midas.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Toast;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.common.Scopes;
import com.pay.tool.APMidasCommMethod;
import com.pay.tool.APMidasTools;
import com.tencent.map.tools.net.NetUtil;
import com.tencent.mapsdk.internal.C0938ej;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.api.APMidasResponse;
import com.tencent.midas.api.request.APMidasBaseRequest;
import com.tencent.midas.api.request.APMidasGameRequest;
import com.tencent.midas.api.request.APMidasGoodsRequest;
import com.tencent.midas.api.request.APMidasMonthRequest;
import com.tencent.midas.api.request.APMidasSubscribeRequest;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.control.APMidasPayHelper;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.midas.data.APPluginDataInterface;
import com.tencent.midas.data.APPluginReportManager;
import com.tencent.midas.plugin.APPluginUtils;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.xweb.IXWebPreferences;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;

public class APWebJSBridgeActivity extends HellActivity {
    private static final String KEY_REQUEST = "key_request";
    private static final String KEY_TYPE = "key_pure_h5_pay";
    private static final String TAG = "APWebJSBridgeActivity";
    private static final String VALUE_PURE_H5 = "value_pure_h5_pay";
    private static final String WEB_URL_POST = "/index.html";
    private static final String WEB_URL_PRE = "https://youxi.vip.qq.com/m/act/";
    private byte _hellAccFlag_;
    private IAPWebPage webPage = null;

    private String constructUrl() {
        String str;
        if (TextUtils.isEmpty(APPluginDataInterface.singleton().getDiscountUrl())) {
            str = WEB_URL_PRE + APPluginDataInterface.singleton().getOfferId() + WEB_URL_POST;
            this.webPage.initHead(this, APMidasTools.getUrlParamsValue(str, APWebProtocol.URL_KEY_HEAD_CONTROL), APMidasTools.getUrlParamsValue(str, APWebProtocol.URL_KEY_HEAD_TITLE));
            this.webPage.updateWebViewSize(str);
        } else {
            str = APPluginDataInterface.singleton().getDiscountUrl();
            this.webPage.initHead(this, APMidasTools.getUrlParamsValue(str, APWebProtocol.URL_KEY_HEAD_CONTROL), APMidasTools.getUrlParamsValue(str, APWebProtocol.URL_KEY_HEAD_TITLE));
            this.webPage.updateWebViewSize(APPluginDataInterface.singleton().getDiscountUrl());
        }
        APLog.m161212e("constructUrl", str);
        HashMap hashMap = new HashMap();
        hashMap.put("offerId", APPluginDataInterface.singleton().getOfferId());
        hashMap.put("openId", APPluginDataInterface.singleton().getOpenId());
        hashMap.put("openKey", APPluginDataInterface.singleton().getOpenKey());
        hashMap.put("sessionId", APPluginDataInterface.singleton().getSessionId());
        hashMap.put("sessionType", APPluginDataInterface.singleton().getSessionType());
        hashMap.put("pf", APPluginDataInterface.singleton().getPf());
        hashMap.put("pfKey", APPluginDataInterface.singleton().getPfKey());
        hashMap.put("zoneId", APPluginDataInterface.singleton().getZoneId());
        if (!str.contains("?")) {
            str = str + "?";
        } else if (!str.endsWith("?")) {
            str = str + "&";
        }
        String str2 = str + APMidasTools.map2UrlParams(hashMap);
        APLog.m161214i("constructUrl", str2);
        return str2;
    }

    private String getPureH5PayURLParameters(APMidasBaseRequest aPMidasBaseRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put("m", "buy");
        hashMap.put(C0938ej.f2165t, "v3");
        hashMap.put("appid", aPMidasBaseRequest.offerId);
        hashMap.put("pf", aPMidasBaseRequest.f343435pf);
        hashMap.put("n", aPMidasBaseRequest.saveValue);
        hashMap.put("sessionid", aPMidasBaseRequest.sessionId);
        hashMap.put("sessiontype", aPMidasBaseRequest.sessionType);
        hashMap.put(Scopes.OPEN_ID, aPMidasBaseRequest.openId);
        hashMap.put("openkey", aPMidasBaseRequest.openKey);
        hashMap.put("zoneid", aPMidasBaseRequest.zoneId);
        hashMap.put("sdktype", Platform.ANDROID);
        String midasCoreVersionName = APPluginUtils.getMidasCoreVersionName(this);
        APLog.m161210d(TAG, "app_version = " + midasCoreVersionName);
        hashMap.put("appversion", midasCoreVersionName);
        hashMap.put("request_from", NetUtil.STR_UserAgent);
        hashMap.put("is_android_sdk_error_version", "1");
        hashMap.put("android_sdk_reserve", aPMidasBaseRequest.reserv);
        hashMap.put("android_sdk_mpinfo_discountType", aPMidasBaseRequest.mpInfo.discountType);
        hashMap.put("android_sdk_mpinfo_discountUrl", aPMidasBaseRequest.mpInfo.discountUrl);
        hashMap.put("android_sdk_mpinfo_discoutId", aPMidasBaseRequest.mpInfo.discoutId);
        hashMap.put("android_sdk_mpinfo_drmInfo", aPMidasBaseRequest.mpInfo.drmInfo);
        hashMap.put("android_sdk_mpinfo_extras", aPMidasBaseRequest.mpInfo.extras);
        hashMap.put("android_sdk_mpinfo_payChannel", aPMidasBaseRequest.mpInfo.payChannel);
        hashMap.put("android_sdk_extendInfo_unit", aPMidasBaseRequest.extendInfo.unit);
        hashMap.put("android_sdk_extendInfo_isShowListOtherNum", String.valueOf(aPMidasBaseRequest.extendInfo.isShowListOtherNum));
        hashMap.put("android_sdk_extendInfo_isShowNum", String.valueOf(aPMidasBaseRequest.extendInfo.isShowNum));
        if (aPMidasBaseRequest instanceof APMidasGameRequest) {
            if ("hy_gameid".equals(aPMidasBaseRequest.sessionId) && "wc_actoken".equals(aPMidasBaseRequest.sessionType)) {
                hashMap.put("c", "wechat_game");
            } else if ("itopid".equals(aPMidasBaseRequest.sessionId)) {
                hashMap.put("c", "itop_game");
            } else {
                hashMap.put("c", "game");
            }
            if (!TextUtils.isEmpty(aPMidasBaseRequest.saveValue)) {
                hashMap.put("as", "1");
            }
        } else if (aPMidasBaseRequest instanceof APMidasGoodsRequest) {
            APMidasGoodsRequest aPMidasGoodsRequest = (APMidasGoodsRequest) aPMidasBaseRequest;
            hashMap.put("c", "goods");
            if (aPMidasGoodsRequest.tokenType == 1) {
                hashMap.put("params", aPMidasGoodsRequest.goodsTokenUrl);
            } else {
                hashMap.put("productid", aPMidasGoodsRequest.prodcutId);
            }
        } else if (aPMidasBaseRequest instanceof APMidasSubscribeRequest) {
            APMidasSubscribeRequest aPMidasSubscribeRequest = (APMidasSubscribeRequest) aPMidasBaseRequest;
            if ("uin".equals(aPMidasBaseRequest.sessionId) || Scopes.OPEN_ID.equals(aPMidasBaseRequest.sessionId)) {
                hashMap.put("c", "qqsubscribe");
            } else {
                hashMap.put("c", "subscribe");
            }
            if (!TextUtils.isEmpty(aPMidasSubscribeRequest.productId)) {
                hashMap.put("as", "1");
                hashMap.put("productid", aPMidasSubscribeRequest.productId);
            }
            hashMap.put("service", aPMidasSubscribeRequest.serviceCode);
            hashMap.put("aid", aPMidasSubscribeRequest.remark);
            if (aPMidasSubscribeRequest.autoPay) {
                hashMap.put("ap", "1");
            }
        } else if (aPMidasBaseRequest instanceof APMidasMonthRequest) {
            APMidasMonthRequest aPMidasMonthRequest = (APMidasMonthRequest) aPMidasBaseRequest;
            hashMap.put("da", "1");
            hashMap.put("c", aPMidasMonthRequest.serviceCode.toLowerCase());
            hashMap.put("_newservice", "1");
            if (aPMidasMonthRequest.autoPay) {
                hashMap.put("ap", "1");
            }
            if (!TextUtils.isEmpty(aPMidasBaseRequest.saveValue)) {
                hashMap.put("as", "1");
            }
            hashMap.put("aid", aPMidasMonthRequest.remark);
        }
        String str = APMidasPayAPI.env;
        if (APMidasPayAPI.ENV_DEV.equals(str)) {
            hashMap.put(IXWebPreferences.XWEB_RENDERER_SANDBOX, "2");
        } else if (APMidasPayAPI.ENV_TEST.equals(str)) {
            hashMap.put(IXWebPreferences.XWEB_RENDERER_SANDBOX, "1");
        }
        return map2UrlParams(hashMap);
    }

    private void initUI() {
        this.webPage.initUI(this);
        this.webPage.loadUrl(constructUrl());
    }

    private void initWebPage() {
        APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), APPluginReportManager.MIDASPLUGIN_WEBPAGE_INIT, "", "");
        if (APX5.isX5Enabled(this)) {
            this.webPage = new APX5WebPage();
            APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), APPluginReportManager.MIDASPLUGIN_WEBPAGE_X5, "", "");
            return;
        }
        this.webPage = new APSystemWebPage();
        APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), APPluginReportManager.MIDASPLUGIN_WEBPAGE_SYSTEM, "", "");
    }

    public static String map2UrlParams(HashMap<String, String> hashMap) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            for (Map.Entry next : hashMap.entrySet()) {
                stringBuffer.append((String) next.getKey());
                stringBuffer.append("=");
                stringBuffer.append((String) next.getValue());
                stringBuffer.append("&");
            }
            if (!TextUtils.isEmpty(stringBuffer)) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        } catch (Exception unused) {
        }
        return stringBuffer.toString();
    }

    public static boolean startPureH5Pay(Context context, String str, String str2) {
        APLog.m161210d(TAG, " Calling into startPureH5Pay caller = " + Thread.currentThread().getStackTrace()[3].toString());
        APPluginReportManager instance = APPluginReportManager.getInstance();
        instance.reportImmediatelyOneRecord(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY, APPluginReportManager.MIDASPLUGIN_LAUNCH_PURE_H5_ERROR_REASON, "scene=" + str2 + "&reason=" + str);
        if (context == null) {
            APLog.m161212e(TAG, "Cannot start pure h5 pay with null context!");
            return false;
        }
        APMidasBaseRequest aPMidasBaseRequest = APMidasPayHelper.requestObject;
        if (aPMidasBaseRequest == null) {
            APLog.m161212e(TAG, "Cannot start pure h5 pay with null request object!");
            return false;
        }
        Activity activity = APMidasPayHelper.staticActivityContext;
        if (activity == null) {
            APLog.m161212e(TAG, "Cannot start pure h5 pay with null activity object!");
            return false;
        }
        APMidasPayHelper.staticActivityContext = null;
        return startPureH5Pay(activity, aPMidasBaseRequest);
    }

    private void toPureH5Pay(APMidasBaseRequest aPMidasBaseRequest) {
        this.webPage.toPureH5Pay(this, aPMidasBaseRequest);
        String str = "https://pay.qq.com/h5/index.shtml?" + getPureH5PayURLParameters(aPMidasBaseRequest);
        APLog.m161210d(TAG, "To pure h5 pay full url = " + str);
        this.webPage.loadUrl(str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            APMidasCommMethod.pushActivity(this);
            initWebPage();
            Intent intent = getIntent();
            if (intent == null || !VALUE_PURE_H5.equals(intent.getStringExtra(KEY_TYPE))) {
                initUI();
            } else {
                toPureH5Pay((APMidasBaseRequest) intent.getSerializableExtra(KEY_REQUEST));
            }
        } catch (Exception e) {
            String fullExceptionStacktrace = APPluginUtils.getFullExceptionStacktrace(e);
            if (!TextUtils.isEmpty(fullExceptionStacktrace) && (fullExceptionStacktrace.contains("webview") || fullExceptionStacktrace.contains("Webview"))) {
                Toast.makeText(this, "系统组件缺失，请退出重试", 0).show();
            }
            APPluginUtils.callbackInMidasPluginWithoutCaringAboutNewProcess(this, 100, "返回");
            finish();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            APLog.m161210d(TAG, "onKey down = back!");
            APMidasResponse aPMidasResponse = new APMidasResponse();
            aPMidasResponse.resultCode = 100;
            aPMidasResponse.resultMsg = "返回";
            APMidasPayHelper.midasCallBack(aPMidasResponse);
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
    }

    private static boolean startPureH5Pay(Context context, APMidasBaseRequest aPMidasBaseRequest) {
        if (context == null) {
            APLog.m161212e(TAG, "Cannot start pure h5 pay with null context!");
            return false;
        }
        Intent intent = new Intent();
        intent.setClass(context, APWebJSBridgeActivity.class);
        intent.putExtra(KEY_TYPE, VALUE_PURE_H5);
        intent.putExtra(KEY_REQUEST, aPMidasBaseRequest);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/midas/jsbridge/APWebJSBridgeActivity", "startPureH5Pay", "(Landroid/content/Context;Lcom/tencent/midas/api/request/APMidasBaseRequest;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/midas/jsbridge/APWebJSBridgeActivity", "startPureH5Pay", "(Landroid/content/Context;Lcom/tencent/midas/api/request/APMidasBaseRequest;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
