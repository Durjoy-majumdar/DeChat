package com.tencent.midas.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.Toast;
import com.pay.tool.APMidasCommMethod;
import com.pay.tool.APMidasTools;
import com.tencent.midas.api.ability.MidasBaseAbility;
import com.tencent.midas.api.request.APIabResult;
import com.tencent.midas.api.request.APInventory;
import com.tencent.midas.api.request.APMidasBaseRequest;
import com.tencent.midas.api.request.APMidasGameRequest;
import com.tencent.midas.api.request.APMidasGoodsRequest;
import com.tencent.midas.api.request.APMidasNetRequest;
import com.tencent.midas.api.request.APPurchase;
import com.tencent.midas.api.request.APQueryInventoryFinishedListener;
import com.tencent.midas.api.request.OnAPConsumeFinishedListener;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.comm.APLogUtil;
import com.tencent.midas.control.APMidasPayHelper;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.midas.data.APPluginReportManager;
import com.tencent.midas.plugin.APPluginLoader;
import com.tencent.midas.plugin.APPluginStatic;
import com.tencent.midas.plugin.APPluginUtils;
import dalvik.system.DexClassLoader;
import java.util.ArrayList;
import java.util.List;

public class APMidasPayAPI {
    public static final String ACCOUNT_TYPE_COMMON = "common";
    public static final String ACCOUNT_TYPE_SECURITY = "secrety";
    public static final String ENV_DEV = "dev";
    public static final String ENV_RELEASE = "release";
    public static final String ENV_TEST = "test";
    public static final String ENV_TESTING = "testing";
    public static final int LANDSCAPE = 0;
    public static final String PAY_CHANNEL_BANK = "bank";
    public static final String PAY_CHANNEL_PAYSCORE = "wechat_payscore";
    public static final String PAY_CHANNEL_QQWALLET = "qqwallet";
    public static final String PAY_CHANNEL_UNIONPAY = "wechat_quickpass";
    public static final String PAY_CHANNEL_WECHAT = "wechat";
    public static final int PORTRAINT = 1;
    private static final String TAG = "APMidasPayAPI";
    public static final String WX_COUPONS = "wechatAddCardToWXCardPackage";
    private static String dataPath = "";
    public static String env = "release";
    public static Context fromApplicationContext = null;
    private static String logCallbackClassName = "";
    private static boolean logEnable = true;
    private static int screenType = -1;

    public static void H5Release() {
        if (APMidasPayHelper.x5Webview != null) {
            APMidasPayHelper.x5Webview = null;
        }
        if (APMidasPayHelper.webview != null) {
            APMidasPayHelper.webview = null;
        }
        if (APMidasPayHelper.sIWebView != null) {
            APMidasPayHelper.sIWebView = null;
        }
    }

    public static void InnerH5PayInit(Activity activity, WebView webView) {
        APLog.m161214i(TAG, "InnerH5PayInit enter");
        if (checkParams(activity)) {
            APMidasPayHelper.MIDAS_WEBVIEW = APMidasPayHelper.MIDAS_INNER_WEBVIEW;
            APMidasPayHelper.h5Init(activity, webView, (com.tencent.smtt.sdk.WebView) null);
        }
    }

    public static void InnerH5PayInitX5(Activity activity, com.tencent.smtt.sdk.WebView webView) {
        APLog.m161214i(TAG, "InnerH5PayInit enter");
        if (checkParams(activity)) {
            APMidasPayHelper.MIDAS_WEBVIEW = APMidasPayHelper.MIDAS_INNER_WEBVIEW;
            APMidasPayHelper.h5Init(activity, (WebView) null, webView);
        }
    }

    private static boolean checkInitCommParam(Context context, APMidasBaseRequest aPMidasBaseRequest) {
        if (!env.equals("release")) {
            try {
                if (APMidasCommMethod.getApplicationPackageName().equals("com.tencent.unipay")) {
                    return true;
                }
                if (aPMidasBaseRequest == null) {
                    Toast.makeText(context, "初始化request不能为空", 1).show();
                    return false;
                } else if (TextUtils.isEmpty(aPMidasBaseRequest.offerId)) {
                    Toast.makeText(context, "初始化offerid不能为空", 1).show();
                    return false;
                } else if (TextUtils.isEmpty(aPMidasBaseRequest.openId)) {
                    Toast.makeText(context, "初始化openId不能为空", 1).show();
                    return false;
                } else if (TextUtils.isEmpty(aPMidasBaseRequest.openKey)) {
                    Toast.makeText(context, "初始化openKey不能为空", 1).show();
                    return false;
                } else if (TextUtils.isEmpty(aPMidasBaseRequest.sessionId)) {
                    Toast.makeText(context, "初始化sessionId不能为空", 1).show();
                    return false;
                } else if (TextUtils.isEmpty(aPMidasBaseRequest.sessionType)) {
                    Toast.makeText(context, "初始化sessionType不能为空", 1).show();
                    return false;
                } else if (TextUtils.isEmpty(aPMidasBaseRequest.f343435pf)) {
                    Toast.makeText(context, "初始化pf不能为空", 1).show();
                    return false;
                } else if (TextUtils.isEmpty(aPMidasBaseRequest.pfKey)) {
                    Toast.makeText(context, "初始化pfKey不能为空", 1).show();
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private static boolean checkParams(Context context) {
        if (context != null) {
            return true;
        }
        APLog.m161212e(TAG, "checkParams() context/activity == Null");
        new Throwable("APMidasPayAPI().checkParams() context/activity == Null");
        return false;
    }

    public static void closeAll() {
        APPluginStatic.removeAll();
    }

    public static void consumeAsync(Activity activity, List<APPurchase> list, OnAPConsumeFinishedListener onAPConsumeFinishedListener) {
        Class<?> cls;
        APLog.m161214i(TAG, "consumeAsync enter");
        if (checkParams(activity)) {
            APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
            try {
                cls = Class.forName(List.class.getName());
            } catch (ClassNotFoundException e) {
                APLog.m161210d(TAG, "consumeAsync setEnv e:" + e.toString());
                cls = null;
            }
            Class[] clsArr = {cls, OnAPConsumeFinishedListener.class};
            Object call = aPMidasPayHelper.call(activity, APMidasPayHelper.MED_DISTRIBUTE_XGAME_CONSUME, new Object[]{list, onAPConsumeFinishedListener}, (Class<?>[]) clsArr);
            APLog.m161214i(TAG, "consumeAsync ret " + call);
            if (call == null) {
                onAPConsumeFinishedListener.onConsumeFinished(new ArrayList());
            }
        }
    }

    public static void getInfo(Activity activity, String str, APMidasBaseRequest aPMidasBaseRequest, IAPMidasNetCallBack iAPMidasNetCallBack) {
        APLog.m161214i(TAG, "getInfo enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (Exception e) {
                APLog.m161214i("fromApplicationContext", e.toString());
            }
            APPluginReportManager.payDataRelease();
            APPluginReportManager.getInstance().payInterfaceInit(aPMidasBaseRequest, APMidasPluginInfo.LAUNCH_INTERFACE_GETINFO);
            APPluginReportManager.getInstance().insertTimeData(APMidasPluginInfo.LAUNCH_INTERFACE_GETINFO, APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHINFO);
            APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
            APMidasPayHelper.setEnv(env);
            APMidasPayHelper.setLogEnable(logEnable);
            APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.getInfo(activity, str, aPMidasBaseRequest, iAPMidasNetCallBack);
        }
    }

    public static String getJSContent(Context context) {
        APLog.m161214i(TAG, "getJSContent enter");
        return !checkParams(context) ? "" : APMidasPayHelper.getJSContent(context);
    }

    public static String getMidasCoreVersion(Activity activity) {
        APLog.m161214i(TAG, "getMidasCoreVersion enter");
        return !checkParams(activity) ? "" : APPluginUtils.getMidasCoreVersionName(activity);
    }

    public static String getMidasPluginVersion() {
        APLog.m161210d(TAG, "getMidasPluginVersion enter " + Thread.currentThread().getStackTrace()[3].toString());
        return APMidasCommMethod.getApplicationPackageName().equals("com.tencent.unipay") ? APMidasCommMethod.getApplicationVersion() : "1.7.9a";
    }

    public static String getMidasSDKVersion(Activity activity) {
        APLog.m161214i(TAG, "getMidasSDKVersion enter");
        if (!checkParams(activity)) {
            return "";
        }
        return (String) new APMidasPayHelper().call(activity, Thread.currentThread().getStackTrace()[2].getMethodName(), new Object[0]);
    }

    public static String getPath() {
        return dataPath;
    }

    public static int h5PayHook(Activity activity, WebView webView, String str, String str2, JsResult jsResult) {
        APLog.m161214i(TAG, "h5PayHook enter");
        if (!checkParams(activity)) {
            return -33;
        }
        APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
        APMidasPayHelper.setEnv(env);
        APMidasPayHelper.setLogEnable(logEnable);
        APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
        aPMidasPayHelper.setScreenType(screenType);
        return aPMidasPayHelper.h5Pay(activity, webView, (com.tencent.smtt.sdk.WebView) null, str, str2);
    }

    public static int h5PayHookX5(Activity activity, com.tencent.smtt.sdk.WebView webView, String str, String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult) {
        APLog.m161214i(TAG, "h5PayHookX5 enter");
        if (!checkParams(activity)) {
            return -33;
        }
        APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
        APMidasPayHelper.setEnv(env);
        APMidasPayHelper.setLogEnable(logEnable);
        APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
        aPMidasPayHelper.setScreenType(screenType);
        return aPMidasPayHelper.h5Pay(activity, (WebView) null, webView, str, str2);
    }

    public static void h5PayInit(Activity activity, WebView webView) {
        APLog.m161214i(TAG, "h5PayInit enter");
        if (checkParams(activity)) {
            APMidasPayHelper.MIDAS_WEBVIEW = APMidasPayHelper.MIDAS_OUT_WEBVIEW;
            APMidasPayHelper.h5Init(activity, webView, (com.tencent.smtt.sdk.WebView) null);
        }
    }

    public static void h5PayInitUnifier(Activity activity, IAPWebView iAPWebView) {
        APLog.m161214i(TAG, "h5PayInitUnifier enter");
        if (checkParams(activity)) {
            APMidasPayHelper.MIDAS_WEBVIEW = APMidasPayHelper.MIDAS_OUT_WEBVIEW;
            APMidasPayHelper.h5InitUnifier(activity, iAPWebView);
        }
    }

    public static void h5PayInitX5(Activity activity, com.tencent.smtt.sdk.WebView webView) {
        APLog.m161214i(TAG, "h5PayInitX5 enter");
        if (checkParams(activity)) {
            APMidasPayHelper.h5Init(activity, (WebView) null, webView);
        }
    }

    public static void hfCouponsRollBack(Activity activity, String str) {
        APLog.m161214i(TAG, "hfCouponsRollBack enter");
        if (checkParams(activity)) {
            new APMidasPayHelper().call(activity, APMidasPayHelper.MED_DISTRIBUTE_HF_COUPONS_ROLLBACK, new Object[]{str});
        }
    }

    public static void init(Context context, APMidasBaseRequest aPMidasBaseRequest) {
        if (context == null || aPMidasBaseRequest == null) {
            APLog.m161212e(TAG, "init parameter is null!");
            return;
        }
        initCommon(context, aPMidasBaseRequest);
        if (checkInitCommParam(context, aPMidasBaseRequest)) {
            APMidasPayHelper.init(context, aPMidasBaseRequest);
        } else {
            APMidasPayHelper.isNewProcess = APMidasPayHelper.isNewProcess(context);
        }
    }

    private static void initCommon(Context context, APMidasBaseRequest aPMidasBaseRequest) {
        APPluginReportManager.initDataRelease();
        APPluginReportManager.getInstance().initInterfaceInit(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, aPMidasBaseRequest);
        APLogUtil.initAPLogInPlugin(context.getApplicationContext(), logEnable, logCallbackClassName);
        APLog.m161214i(TAG, "init new enter");
        APPluginReportManager.getInstance().insertTimeData(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, APPluginReportManager.MIDASPLUGIN_TIMENAME_INIT);
        APMidasPayHelper.setEnv(env);
        APMidasPayHelper.setLogEnable(logEnable);
        APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
    }

    public static void launchAbility(Context context, MidasBaseAbility midasBaseAbility, final ResultReceiver resultReceiver) {
        APLog.m161214i(TAG, "launchAbility enter : " + midasBaseAbility.toString());
        if (APMidasTools.isFastClick()) {
            APLog.m161214i("launchAbility", "isfast");
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                bundle.putString("midas_callback_ability_postBack", midasBaseAbility.postBack);
                bundle.putInt("midas_callback_ability_code", -999);
                bundle.putString("midas_callback_ability_msg", "fast click");
                bundle.putBundle("midas_callback_ability_data", new Bundle());
                resultReceiver.send(-1, bundle);
            }
        } else if (checkParams(context)) {
            APPluginReportManager.payDataRelease();
            APMidasGameRequest aPMidasGameRequest = new APMidasGameRequest();
            aPMidasGameRequest.offerId = midasBaseAbility.offerId;
            aPMidasGameRequest.openId = midasBaseAbility.openId;
            aPMidasGameRequest.openKey = midasBaseAbility.openKey;
            aPMidasGameRequest.sessionId = midasBaseAbility.sessionId;
            aPMidasGameRequest.sessionType = midasBaseAbility.sessionType;
            aPMidasGameRequest.f343435pf = midasBaseAbility.f343434pf;
            aPMidasGameRequest.pfKey = midasBaseAbility.pfKey;
            APPluginReportManager.getInstance().payInterfaceInit(aPMidasGameRequest, APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHFEATURE);
            APPluginReportManager.getInstance().insertTimeData(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHFEATURE, APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHABILITY);
            APPluginReportManager.getInstance().insertData(APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHABILITY, APPluginReportManager.MIDASPLUGIN_ENTER_ABILITY, "MidasPlugin", midasBaseAbility.toString());
            new APMidasPayHelper().sendMidas(context, midasBaseAbility.toBundle(), new ResultReceiver(new Handler()) {
                public void onReceiveResult(int i, Bundle bundle) {
                    APLog.m161214i(APMidasPayAPI.TAG, "launchAbility.onReceiveResult() resultCode=" + i + ", resultData=" + bundle);
                    ResultReceiver resultReceiver = resultReceiver;
                    if (resultReceiver != null) {
                        resultReceiver.send(i, bundle);
                        APPluginReportManager.getInstance().dataReport("launchAbility");
                        APPluginUtils.release();
                        APLog.closeLog();
                    }
                }
            });
        }
    }

    public static void launchNet(Activity activity, APMidasNetRequest aPMidasNetRequest, IAPMidasNetCallBack iAPMidasNetCallBack) {
        APLog.m161214i(TAG, "launchNet enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (Exception e) {
                APLog.m161214i("fromApplicationContext", e.toString());
            }
            APPluginReportManager.payDataRelease();
            APPluginReportManager.getInstance().payInterfaceInit(aPMidasNetRequest, APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHNET);
            APPluginReportManager.getInstance().insertTimeData(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHNET, APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHNET);
            APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
            APMidasPayHelper.setEnv(env);
            APMidasPayHelper.setLogEnable(logEnable);
            APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.net(activity, aPMidasNetRequest, iAPMidasNetCallBack);
        }
    }

    public static void launchPay(Activity activity, APMidasBaseRequest aPMidasBaseRequest, IAPMidasPayCallBack iAPMidasPayCallBack) {
        APLog.m161214i(TAG, "launchPay enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (Exception e) {
                APLog.m161214i("fromApplicationContext", e.toString());
            }
            if (APMidasTools.isFastClick()) {
                APLog.m161214i("launchPay", "isfast");
                APLog.m161222w(TAG, "launchPay enter fast:" + iAPMidasPayCallBack);
                APMidasResponse aPMidasResponse = new APMidasResponse();
                aPMidasResponse.resultCode = -1;
                aPMidasResponse.payChannel = -1;
                aPMidasResponse.payState = 2;
                aPMidasResponse.provideState = -1;
                aPMidasResponse.resultMsg = "fast click";
                iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
                return;
            }
            APPluginReportManager.payDataRelease();
            APPluginReportManager.getInstance().payInterfaceInit(aPMidasBaseRequest, APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
            APPluginReportManager.getInstance().insertTimeData(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY, APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHPAY);
            APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
            APMidasPayHelper.setEnv(env);
            APMidasPayHelper.setLogEnable(logEnable);
            APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.setScreenType(screenType);
            aPMidasPayHelper.pay(activity, aPMidasBaseRequest, iAPMidasPayCallBack);
        }
    }

    public static void launchPurchaseFlow(Activity activity, APMidasBaseRequest aPMidasBaseRequest, final APOnIabPurchaseFinished aPOnIabPurchaseFinished) {
        boolean z;
        APLog.m161214i(TAG, "launchPurchaseFlow enter");
        if (checkParams(activity)) {
            APMidasPayHelper.setEnv(env);
            APMidasPayHelper.setLogEnable(logEnable);
            APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            if (aPMidasBaseRequest == null || !((z = aPMidasBaseRequest instanceof APMidasGoodsRequest))) {
                aPOnIabPurchaseFinished.onIabPurchaseFinished(new APIabResult(3, ""), (APPurchase) null);
                APLog.m161212e("launchPurchaseFlow", "parameter is error");
                return;
            }
            if (z) {
                ((APMidasGoodsRequest) aPMidasBaseRequest).mIsReceiptMode = true;
            }
            APMidasGoodsRequest aPMidasGoodsRequest = (APMidasGoodsRequest) aPMidasBaseRequest;
            aPMidasGoodsRequest.isCanChange = false;
            aPMidasGoodsRequest.saveValue = "1";
            aPMidasGoodsRequest.tokenType = 2;
            launchPay(activity, aPMidasBaseRequest, new IAPMidasPayCallBack() {
                public void MidasPayCallBack(APMidasResponse aPMidasResponse) {
                    int resultCode = aPMidasResponse.getResultCode();
                    if (aPMidasResponse.resultCode == 100) {
                        resultCode = 101;
                    }
                    aPOnIabPurchaseFinished.onIabPurchaseFinished(new APIabResult(resultCode, aPMidasResponse.getResultMsg()), aPMidasResponse.getReceipt());
                }

                public void MidasPayNeedLogin() {
                    aPOnIabPurchaseFinished.onIabyNeedLogin();
                }
            });
        }
    }

    public static void launchWXMiniProgram(Context context, Bundle bundle, ResultReceiver resultReceiver) {
        APLog.m161214i(TAG, "launchWXMiniProgram enter");
        if (checkParams(context)) {
            if (!(context instanceof Activity)) {
                APLog.m161212e("launchAbility", "context is not Activity : " + context);
                if (!"release".equals(env)) {
                    Toast.makeText(context.getApplicationContext(), "Input context must be Activity", 1).show();
                }
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("midas_callback_ability_code", -998);
                    bundle2.putString("midas_callback_ability_msg", "context is not Activity ");
                    bundle2.putBundle("midas_callback_ability_data", new Bundle());
                    resultReceiver.send(-101, bundle2);
                    return;
                }
                return;
            }
            new APMidasPayHelper().launchWXMiniProgram(context, bundle, resultReceiver);
        }
    }

    public static void launchWXMiniProgram_OnResponse(Context context, int i, Bundle bundle) {
        APLog.m161214i(TAG, "launchWXMiniProgram_OnResponse enter");
        APLog.m161214i(TAG, "launchWXMiniProgram_OnResponse enter: bundle = " + bundle);
        if (checkParams(context)) {
            if (!(context instanceof Activity)) {
                APLog.m161212e("launchAbility", "context is not Activity : " + context);
                if (!"release".equals(env)) {
                    Toast.makeText(context.getApplicationContext(), "Input context must be Activity", 1).show();
                    return;
                }
                return;
            }
            new APMidasPayHelper().launchWXMiniProgram_OnResponse(context, i, bundle);
        }
    }

    public static void launchWeb(Activity activity, APMidasBaseRequest aPMidasBaseRequest, IAPMidasPayCallBack iAPMidasPayCallBack) {
        APLog.m161214i(TAG, "launchWeb enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (Exception e) {
                APLog.m161214i("fromApplicationContext", e.toString());
            }
            APPluginReportManager.payDataRelease();
            APPluginReportManager.getInstance().payInterfaceInit(aPMidasBaseRequest, APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHWEB);
            APPluginReportManager.getInstance().insertTimeData(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHWEB, APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHWEB);
            APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
            APMidasPayHelper.setEnv(env);
            APMidasPayHelper.setLogEnable(logEnable);
            APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.setScreenType(screenType);
            aPMidasPayHelper.web(activity, aPMidasBaseRequest, iAPMidasPayCallBack);
        }
    }

    public static void queryInventoryAsync(Activity activity, boolean z, List<?> list, APQueryInventoryFinishedListener aPQueryInventoryFinishedListener) {
        Class<?> cls;
        APLog.m161214i(TAG, "queryInventoryAsync enter");
        if (checkParams(activity)) {
            APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
            try {
                cls = Class.forName(List.class.getName());
            } catch (ClassNotFoundException e) {
                APLog.m161210d(TAG, "queryInventoryAsync setEnv e:" + e.toString());
                cls = null;
            }
            Class[] clsArr = {Boolean.class, cls, APQueryInventoryFinishedListener.class};
            Object call = aPMidasPayHelper.call(activity, APMidasPayHelper.MED_DISTRIBUTE_XGAME_QUERY, new Object[]{Boolean.valueOf(z), list, aPQueryInventoryFinishedListener}, (Class<?>[]) clsArr);
            APLog.m161214i(TAG, "queryInventoryAsync ret " + call);
            if (call == null) {
                aPQueryInventoryFinishedListener.onQueryInventoryFinished(new APIabResult(-1, ""), (APInventory) null);
            }
        }
    }

    public static void release(Activity activity) {
        APLog.m161214i(TAG, "release() enter");
        new APMidasPayHelper().call(activity, APMidasPayHelper.MED_DISTRIBUTE_RELEASE, new Object[0]);
    }

    public static void setCutoutEnable(boolean z) {
        APMidasPayHelper.cutoutEnable = z;
    }

    public static void setEnv(String str) {
        env = str;
        APMidasPayHelper.setEnv(str);
        Context context = fromApplicationContext;
        if (context != null && (context instanceof Activity)) {
            new APMidasPayHelper().call(fromApplicationContext, "setEnv", (Class<?>[]) new Class[]{String.class}, new Object[]{str});
        }
        APLog.m161210d("MidasPluginSDK", "env= " + env);
    }

    public static <T extends IMidasLogCallback> void setLogCallback(Class<T> cls) {
        logCallbackClassName = cls.getName();
    }

    public static void setLogEnable(boolean z) {
        logEnable = z;
        APMidasPayHelper.setLogEnable(z);
        APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
        Context context = fromApplicationContext;
        if (context != null && (context instanceof Activity)) {
            new APMidasPayHelper().call(fromApplicationContext, "setLogEnable", (Class<?>[]) new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z)});
        }
    }

    public static void setLongConnection(Context context, boolean z) {
        APMidasPayHelper.setLongConnection(context, z);
    }

    public static void setParentClassloader(DexClassLoader dexClassLoader) {
        APLog.m161214i(TAG, "setParentClassloader enter classLoader:" + dexClassLoader);
        APPluginLoader.setParentClassLoader(dexClassLoader);
    }

    public static void setPath(String str) {
        APLog.m161214i(TAG, "setPath enter path:" + str);
        dataPath = str;
    }

    public static void setScreenType(Activity activity, int i) {
        screenType = i;
    }

    public static void init(Context context, APMidasBaseRequest aPMidasBaseRequest, ResultReceiver resultReceiver) {
        initCommon(context, aPMidasBaseRequest);
        if (checkInitCommParam(context, aPMidasBaseRequest)) {
            APMidasPayHelper.init(context, aPMidasBaseRequest, resultReceiver);
        } else {
            APMidasPayHelper.isNewProcess = APMidasPayHelper.isNewProcess(context);
        }
    }
}
