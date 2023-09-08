package com.tencent.midas.control;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.gms.dynamite.ProviderConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pay.tool.APMidasTools;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.api.APMidasResponse;
import com.tencent.midas.api.IAPMidasNetCallBack;
import com.tencent.midas.api.IAPMidasPayCallBack;
import com.tencent.midas.api.IAPWebView;
import com.tencent.midas.api.request.APMidasBaseRequest;
import com.tencent.midas.api.request.APMidasNetRequest;
import com.tencent.midas.api.request.APPurchase;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.control.APCallBackResultReceiver;
import com.tencent.midas.data.APDataId;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.midas.data.APMultiProcessData;
import com.tencent.midas.data.APPluginDataInterface;
import com.tencent.midas.data.APPluginReportManager;
import com.tencent.midas.jsbridge.APWebJSBridgeActivity;
import com.tencent.midas.plugin.APPluginChecker;
import com.tencent.midas.plugin.APPluginInstallerAndUpdater;
import com.tencent.midas.plugin.APPluginInterfaceManager;
import com.tencent.midas.plugin.APPluginLoader;
import com.tencent.midas.plugin.APPluginUtils;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import j20.C117292a;
import k20.C9556a;
import org.json.JSONException;

public class APMidasPayHelper implements APCallBackResultReceiver.Receiver {
    public static String MED_DISTRIBUTE_CALL = "openMidasCall";
    public static String MED_DISTRIBUTE_CALL2 = "openMidasCall2";
    public static final String MED_DISTRIBUTE_CALLBACK_FROM_MIDAS_PAY = "callbackFromMidasPay";
    public static String MED_DISTRIBUTE_H5PAY = "openMidasH5Pay";
    public static String MED_DISTRIBUTE_HANDLE_QQ_WALLET_INTENT = "handleQQWalletIntent";
    public static String MED_DISTRIBUTE_HANDLE_WX_INTENT = "handleWXIntent";
    public static final String MED_DISTRIBUTE_HF_COUPONS_ROLLBACK = "hfCouponsRollBack";
    public static String MED_DISTRIBUTE_INFO = "openMidasInfo";
    public static String MED_DISTRIBUTE_INIT = "golbalInit";
    public static String MED_DISTRIBUTE_LongConnection = "setLongConnection";
    public static String MED_DISTRIBUTE_NET = "openMidasNet";
    public static String MED_DISTRIBUTE_PAY = "openMidasPay";
    public static String MED_DISTRIBUTE_RECEIVE = "receiveMidas";
    public static String MED_DISTRIBUTE_RELEASE = "release";
    public static String MED_DISTRIBUTE_WEB = "openMidasWeb";
    public static final String MED_DISTRIBUTE_WX_MINIPROGRAM = "launchWXMiniProgram";
    public static final String MED_DISTRIBUTE_WX_MINIPROGRAM_ONRESPONSE = "launchWXMiniProgram_OnResponse";
    public static final String MED_DISTRIBUTE_XGAME_CONSUME = "consumeAsync";
    public static final String MED_DISTRIBUTE_XGAME_QUERY = "queryInventoryAsync";
    public static int MIDAS_INNER_WEBVIEW = 0;
    public static int MIDAS_OUT_WEBVIEW = 1;
    public static String MIDAS_PLUGIN_NAME = "MidasPay";
    public static final String MIDAS_PLUGIN_VERSION = "1.7.9a";
    public static int MIDAS_WEBVIEW = 0;
    public static String PKG_DISTRIBUTE = "com.tencent.midas.pay.APMidasDistribute";
    public static final int PLUGIN_INITFAIL = 2;
    private static final int PLUGIN_INITIDLE = -1;
    public static final int PLUGIN_INITING = 0;
    public static final int PLUGIN_INITSUCC = 1;
    private static final int RET_CHANGE_H5 = -100011;
    private static final String RET_MSG_CHANGE_H5 = "needChangeH5";
    private static final String TAG = "APMidasPayHelper";
    public static boolean cutoutEnable = false;
    /* access modifiers changed from: private */
    public static Object dexloadObject = new Object();
    /* access modifiers changed from: private */
    public static String env = "release";
    private static int initCount = 0;
    private static Object initObject = new Object();
    /* access modifiers changed from: private */
    public static APMidasBaseRequest initRequest = null;
    public static int initState = -1;
    /* access modifiers changed from: private */
    public static boolean isInitSucc = false;
    private static boolean isNeedLocalUpdate = false;
    public static boolean isNewProcess = false;
    /* access modifiers changed from: private */
    public static Object loadingObject = new Object();
    private static String logCallbackClassName = "";
    /* access modifiers changed from: private */
    public static boolean logEnable = false;
    public static IAPMidasPayCallBack midasCallBack = null;
    public static IAPMidasNetCallBack netCallBack = null;
    /* access modifiers changed from: private */
    public static String netCallBack_ReqType = "";
    /* access modifiers changed from: private */
    public static APCallBackResultReceiver remotRecevier;
    public static APMidasBaseRequest requestObject;
    public static IAPWebView sIWebView;
    public static Activity staticActivityContext;
    public static WebView webview;
    public static com.tencent.smtt.sdk.WebView x5Webview;
    private byte _hellAccFlag_;
    public Object retobj = null;
    public int saveType = 0;
    public int screenType = 0;

    public static /* synthetic */ int access$508() {
        int i = initCount;
        initCount = i + 1;
        return i;
    }

    public static synchronized String getJSContent(Context context) {
        String str;
        synchronized (APMidasPayHelper.class) {
            APLog.m161214i(TAG, "getJSContent");
            init(context, (APMidasBaseRequest) null);
            str = (String) new APMidasPayHelper().callWithContext(context, "getH5JS", new Object[]{context});
        }
        return str;
    }

    public static String getLogCallbackClassName() {
        return logCallbackClassName;
    }

    public static synchronized void h5Init(final Activity activity, WebView webView, com.tencent.smtt.sdk.WebView webView2) {
        synchronized (APMidasPayHelper.class) {
            APLog.m161214i(TAG, "h5Init");
            x5Webview = webView2;
            webview = webView;
            isNewProcess = isNewProcess(activity);
            if (initCount < 1) {
                APPluginUtils.release();
                preLoadPlugin(activity, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new IAPInitCallBack() {
                    public void result(int i, String str, String str2, Bundle bundle) {
                        APLog.m161214i(APMidasPayHelper.TAG, "init ret:" + i + " msg:" + str);
                        APPluginReportManager.getInstance().dataReport(APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                        if (i == 0) {
                            APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
                            Activity activity = activity;
                            String str3 = (String) aPMidasPayHelper.call(activity, "getH5JS", new Object[]{activity});
                            if (!TextUtils.isEmpty(str3)) {
                                try {
                                    WebView webView = APMidasPayHelper.webview;
                                    if (webView != null) {
                                        webView.loadUrl("javascript:" + str3);
                                    }
                                    com.tencent.smtt.sdk.WebView webView2 = APMidasPayHelper.x5Webview;
                                    if (webView2 != null) {
                                        webView2.loadUrl("javascript:" + str3);
                                    }
                                } catch (Exception e) {
                                    APLog.m161222w(APMidasPayHelper.TAG, "h5Init loadJS error:" + e.toString());
                                }
                            }
                            boolean unused = APMidasPayHelper.isInitSucc = true;
                            APMidasPayHelper.access$508();
                        }
                    }
                });
            } else {
                String str = (String) new APMidasPayHelper().call(activity, "getH5JS", new Object[]{activity});
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (webview != null) {
                            webView.loadUrl("javascript:" + str);
                        }
                        com.tencent.smtt.sdk.WebView webView3 = x5Webview;
                        if (webView3 != null) {
                            webView3.loadUrl("javascript:" + str);
                        }
                    } catch (Exception e) {
                        APLog.m161222w(TAG, "h5Init loadJS error:" + e.toString());
                    }
                }
            }
        }
        return;
    }

    public static synchronized void h5InitUnifier(final Activity activity, IAPWebView iAPWebView) {
        synchronized (APMidasPayHelper.class) {
            APLog.m161214i(TAG, "h5InitUnifier");
            sIWebView = iAPWebView;
            isNewProcess = isNewProcess(activity);
            if (initCount < 1) {
                APPluginUtils.release();
                preLoadPlugin(activity, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new IAPInitCallBack() {
                    public void result(int i, String str, String str2, Bundle bundle) {
                        APLog.m161214i(APMidasPayHelper.TAG, "h5InitUnifier ret:" + i + " msg:" + str);
                        APPluginReportManager.getInstance().dataReport(APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                        if (i == 0) {
                            APMidasPayHelper aPMidasPayHelper = new APMidasPayHelper();
                            Activity activity = activity;
                            String str3 = (String) aPMidasPayHelper.call(activity, "getH5JS", new Object[]{activity});
                            if (!TextUtils.isEmpty(str3)) {
                                try {
                                    IAPWebView iAPWebView = APMidasPayHelper.sIWebView;
                                    if (iAPWebView != null) {
                                        iAPWebView.loadUrl("javascript:" + str3);
                                    }
                                } catch (Exception e) {
                                    APLog.m161222w(APMidasPayHelper.TAG, "h5InitUnifier loadJS error:" + e.toString());
                                }
                            }
                            boolean unused = APMidasPayHelper.isInitSucc = true;
                            APMidasPayHelper.access$508();
                        }
                    }
                });
            } else {
                String str = (String) new APMidasPayHelper().call(activity, "getH5JS", new Object[]{activity});
                if (!TextUtils.isEmpty(str)) {
                    try {
                        IAPWebView iAPWebView2 = sIWebView;
                        if (iAPWebView2 != null) {
                            iAPWebView2.loadUrl("javascript:" + str);
                        }
                    } catch (Exception e) {
                        APLog.m161222w(TAG, "h5InitUnifier loadJS error:" + e.toString());
                    }
                }
            }
        }
        return;
    }

    public static synchronized void init(Context context, APMidasBaseRequest aPMidasBaseRequest) {
        synchronized (APMidasPayHelper.class) {
            init(context, aPMidasBaseRequest, (ResultReceiver) null);
        }
    }

    public static boolean isLogEnable() {
        return logEnable;
    }

    public static boolean isNewProcess(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0).packageName, 1).activities;
            for (ActivityInfo activityInfo : activityInfoArr) {
                if (activityInfo.name.equals("com.tencent.midas.proxyactivity.APMidasPayProxyActivity")) {
                    String str = activityInfo.processName;
                    if (!TextUtils.isEmpty(str) && str.contains("midasPay")) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void midasCallBack(APMidasResponse aPMidasResponse) {
        if (aPMidasResponse == null || aPMidasResponse.resultCode != RET_CHANGE_H5 || !RET_MSG_CHANGE_H5.equals(aPMidasResponse.resultMsg) || !APWebJSBridgeActivity.startPureH5Pay(staticActivityContext, "", "change_h5_from_cgi")) {
            APLog.m161214i(TAG, "midasCallBack resultCode :" + aPMidasResponse.resultCode + " midasCallBack:" + midasCallBack);
            IAPMidasPayCallBack iAPMidasPayCallBack = midasCallBack;
            if (iAPMidasPayCallBack != null) {
                iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
                midasCallBack = null;
            }
            APCallBackResultReceiver aPCallBackResultReceiver = remotRecevier;
            if (aPCallBackResultReceiver != null) {
                aPCallBackResultReceiver.setReceiver((APCallBackResultReceiver.Receiver) null);
                remotRecevier = null;
            }
            APPluginReportManager.getInstance().dataReport(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
            requestObject = null;
            APPluginUtils.release();
            APLog.closeLog();
            staticActivityContext = null;
            return;
        }
        staticActivityContext = null;
    }

    public static void midasH5CallBack(String str) {
        APLog.m161214i(TAG, "midasH5CallBack params:" + str + " webview:" + webview + " x5Webview:" + x5Webview);
        WebView webView = webview;
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Exception e) {
                APLog.m161222w(TAG, "midasH5CallBack error:" + e.toString());
            }
        }
        com.tencent.smtt.sdk.WebView webView2 = x5Webview;
        if (webView2 != null) {
            try {
                webView2.loadUrl(str);
            } catch (Exception e2) {
                APLog.m161222w(TAG, "midasH5CallBack error:" + e2.toString());
            }
        }
        APCallBackResultReceiver aPCallBackResultReceiver = remotRecevier;
        if (aPCallBackResultReceiver != null) {
            aPCallBackResultReceiver.setReceiver((APCallBackResultReceiver.Receiver) null);
            remotRecevier = null;
        }
        APPluginReportManager.getInstance().dataReport(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
        APPluginUtils.release();
        APLog.closeLog();
        staticActivityContext = null;
        requestObject = null;
    }

    public static void midasLoginExpire() {
        IAPMidasPayCallBack iAPMidasPayCallBack = midasCallBack;
        if (iAPMidasPayCallBack != null) {
            iAPMidasPayCallBack.MidasPayNeedLogin();
            midasCallBack = null;
        }
        APCallBackResultReceiver aPCallBackResultReceiver = remotRecevier;
        if (aPCallBackResultReceiver != null) {
            aPCallBackResultReceiver.setReceiver((APCallBackResultReceiver.Receiver) null);
            remotRecevier = null;
        }
        APPluginReportManager.getInstance().dataReport(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
        APPluginUtils.release();
        APLog.closeLog();
        staticActivityContext = null;
        requestObject = null;
    }

    public static void onNetError(String str, Integer num, String str2) {
        IAPMidasNetCallBack iAPMidasNetCallBack = netCallBack;
        if (iAPMidasNetCallBack != null) {
            iAPMidasNetCallBack.MidasNetError(str, num.intValue(), str2);
            netCallBack = null;
            netCallBack_ReqType = "";
        }
        staticActivityContext = null;
    }

    public static void onNetFinish(String str, String str2) {
        IAPMidasNetCallBack iAPMidasNetCallBack = netCallBack;
        if (iAPMidasNetCallBack != null) {
            iAPMidasNetCallBack.MidasNetFinish(str, str2);
            netCallBack = null;
            netCallBack_ReqType = "";
        }
        staticActivityContext = null;
    }

    public static void onNetStop(String str) {
        IAPMidasNetCallBack iAPMidasNetCallBack = netCallBack;
        if (iAPMidasNetCallBack != null) {
            iAPMidasNetCallBack.MidasNetStop(str);
            netCallBack = null;
            netCallBack_ReqType = "";
        }
        staticActivityContext = null;
    }

    /* access modifiers changed from: private */
    public void openPlugin(Activity activity, Intent intent, String str) {
        Object obj;
        APLog.m161210d(TAG, "Calling into openPlugin, method = " + str + " caller = " + Thread.currentThread().getStackTrace()[3].toString());
        try {
            obj = APPluginInterfaceManager.initPluginInterface(activity, MIDAS_PLUGIN_NAME, PKG_DISTRIBUTE, str, new Object[]{activity, intent});
        } catch (Exception unused) {
            obj = null;
        }
        try {
            APPluginReportManager.getInstance().dataReport(APPluginDataInterface.singleton().getLaunchInterface());
        } catch (Exception e) {
            APLog.m161214i(TAG, "openPlugin dataReport:" + e.toString());
        }
        APLog.m161214i(TAG, "openPlugin obj:" + obj);
    }

    private void pluginInitErrCallBack(final Activity activity) {
        APLog.m161214i(TAG, "pluginInitErrCallBack" + midasCallBack);
        if (!APWebJSBridgeActivity.startPureH5Pay(activity, APPluginUtils.getInitErrorMsg(), "pluginInitErrCallBack")) {
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), APPluginReportManager.MIDASPLUGIN_FORMAT_APKLOAD_ERROR, "", APPluginUtils.getInitErrorMsg());
                    Toast.makeText(activity, "腾讯支付服务加载失败，请退出重试", 1).show();
                    APMidasResponse aPMidasResponse = new APMidasResponse();
                    aPMidasResponse.resultCode = -100;
                    IAPMidasPayCallBack iAPMidasPayCallBack = APMidasPayHelper.midasCallBack;
                    if (iAPMidasPayCallBack != null) {
                        iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
                        APMidasPayHelper.midasCallBack = null;
                        APMidasPayHelper.requestObject = null;
                        APMidasPayHelper.staticActivityContext = null;
                    }
                    IAPMidasNetCallBack iAPMidasNetCallBack = APMidasPayHelper.netCallBack;
                    if (iAPMidasNetCallBack != null) {
                        iAPMidasNetCallBack.MidasNetError(APMidasPayHelper.netCallBack_ReqType, -100, "腾讯支付服务加载失败，请退出重试");
                        APMidasPayHelper.netCallBack = null;
                        String unused = APMidasPayHelper.netCallBack_ReqType = "";
                        APMidasPayHelper.requestObject = null;
                        APMidasPayHelper.staticActivityContext = null;
                    }
                    APPluginReportManager.getInstance().dataReport(APPluginDataInterface.singleton().getLaunchInterface());
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static void preLoadMidasPay(final Context context, final String str, final IAPInitCallBack iAPInitCallBack) {
        int i;
        APLog.m161210d(TAG, "Calling into preLoadMidasPay " + Thread.currentThread().getStackTrace()[3].toString());
        System.currentTimeMillis();
        if (isNeedLocalUpdate) {
            APLog.m161210d(TAG, "Calling into preLoadMidasPay isNeedLocalUpdate == true");
            APPluginInstallerAndUpdater.installFromLocal(context);
            APPluginReportManager.getInstance().insertTimeDataEx(APMidasTools.getCurrentThreadName(Thread.currentThread()), APPluginReportManager.MIDASPLUGIN_TIMENAME_INSTALL_FROM_LOCAL, System.currentTimeMillis());
            isNeedLocalUpdate = false;
        } else {
            APLog.m161210d(TAG, "Calling into preLoadMidasPay isNeedLocalUpdate == false");
        }
        long currentTimeMillis = System.currentTimeMillis();
        int isNeedUpdateFromAssets = APPluginInstallerAndUpdater.isNeedUpdateFromAssets(context, env);
        APPluginReportManager.getInstance().insertTimeDataEx(APMidasTools.getCurrentThreadName(Thread.currentThread()), APPluginReportManager.MIDASPLUGIN_TIMENAME_IS_NEED_ASSETS_UPDATE, currentTimeMillis);
        APLog.m161210d(TAG, "preLoadMidasPay isNeedUpdateFromAssets = " + isNeedUpdateFromAssets);
        if (isNeedUpdateFromAssets > 0) {
            long currentTimeMillis2 = System.currentTimeMillis();
            i = APPluginInstallerAndUpdater.installPlugin(context, isNeedUpdateFromAssets);
            APPluginReportManager.getInstance().insertTimeDataEx(APMidasTools.getCurrentThreadName(Thread.currentThread()), APPluginReportManager.MIDASPLUGIN_TIMENAME_INSTALL_FROM_ASSETS, currentTimeMillis2);
        } else {
            i = 0;
        }
        APLog.m161214i(TAG, "preLoadMidasPay installPlugin ret:" + i + " initRequest:" + initRequest);
        synchronized (initObject) {
            if (i != 0) {
                initCount = 0;
                initState = 2;
                if (iAPInitCallBack != null) {
                    iAPInitCallBack.result(-1, APPluginUtils.getInitErrorMsg(), str, (Bundle) null);
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                boolean isPluginValid = APPluginChecker.isPluginValid(context);
                APPluginReportManager.getInstance().insertTimeDataEx(APMidasTools.getCurrentThreadName(Thread.currentThread()), APPluginReportManager.MIDASPLUGIN_TIMENAME_PLUGIN_VALID, currentTimeMillis3);
                if (!isPluginValid) {
                    APLog.m161214i(TAG, "preLoadMidasPay isPluginValid false");
                    APPluginInstallerAndUpdater.unInstallPlugin(context);
                    initState = -1;
                    if (iAPInitCallBack != null) {
                        initCount = 0;
                        iAPInitCallBack.result(-1, "支付插件校验失败", str, (Bundle) null);
                    }
                    synchronized (loadingObject) {
                        loadingObject.notifyAll();
                    }
                } else {
                    try {
                        long currentTimeMillis4 = System.currentTimeMillis();
                        APPluginLoader.preCreateClassLoaderByPath(context);
                        APPluginReportManager.getInstance().insertTimeDataEx(APMidasTools.getCurrentThreadName(Thread.currentThread()), APPluginReportManager.MIDASPLUGIN_TIMENAME_LOAD_DEX, currentTimeMillis4);
                    } catch (Exception e) {
                        APLog.m161212e(TAG, "preLoadMidasPay preCreateClassLoaderByPath e: " + e.toString());
                    }
                    final String name = Thread.currentThread().getName();
                    if (context instanceof Activity) {
                        ((Activity) context).runOnUiThread(new Runnable() {
                            /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                                java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
                                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                                	at java.base/java.util.ArrayList.get(ArrayList.java:458)
                                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                                	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                                	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
                                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
                                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
                                */
                            public void run() {
                                /*
                                    r11 = this;
                                    android.content.Intent r0 = new android.content.Intent
                                    r0.<init>()
                                    java.lang.String r1 = "version"
                                    java.lang.String r2 = "1.7.9a"
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "req"
                                    com.tencent.midas.api.request.APMidasBaseRequest r2 = com.tencent.midas.control.APMidasPayHelper.initRequest
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "env"
                                    java.lang.String r2 = com.tencent.midas.control.APMidasPayHelper.env
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "logEnable"
                                    boolean r2 = com.tencent.midas.control.APMidasPayHelper.logEnable
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "launchInterfaceName"
                                    java.lang.String r2 = r0
                                    r0.putExtra(r1, r2)
                                    android.content.Context r1 = r10
                                    android.app.Activity r1 = (android.app.Activity) r1
                                    r2 = 1
                                    r3 = 0
                                    long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0063 }
                                    java.lang.String r6 = com.tencent.midas.control.APMidasPayHelper.MIDAS_PLUGIN_NAME     // Catch:{ Exception -> 0x0063 }
                                    java.lang.String r7 = com.tencent.midas.control.APMidasPayHelper.PKG_DISTRIBUTE     // Catch:{ Exception -> 0x0063 }
                                    java.lang.String r8 = com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_INIT     // Catch:{ Exception -> 0x0063 }
                                    r9 = 2
                                    java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0063 }
                                    r10 = 0
                                    r9[r10] = r1     // Catch:{ Exception -> 0x0063 }
                                    r9[r2] = r0     // Catch:{ Exception -> 0x0063 }
                                    java.lang.Object r0 = com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(r1, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0063 }
                                    com.tencent.midas.data.APPluginReportManager r1 = com.tencent.midas.data.APPluginReportManager.getInstance()     // Catch:{ Exception -> 0x0061 }
                                    java.lang.String r6 = r0     // Catch:{ Exception -> 0x0061 }
                                    java.lang.String r7 = "sdk.plugin.init.kernel.totaltime"
                                    r1.insertTimeDataEx(r6, r7, r4)     // Catch:{ Exception -> 0x0061 }
                                    com.tencent.midas.control.IAPInitCallBack r1 = r12     // Catch:{ Exception -> 0x0061 }
                                    if (r1 == 0) goto L_0x0073
                                    java.lang.String r4 = "succ"
                                    java.lang.String r5 = r11     // Catch:{ Exception -> 0x0061 }
                                    r1.result(r10, r4, r5, r3)     // Catch:{ Exception -> 0x0061 }
                                    goto L_0x0073
                                L_0x0061:
                                    r1 = move-exception
                                    goto L_0x0065
                                L_0x0063:
                                    r1 = move-exception
                                    r0 = r3
                                L_0x0065:
                                    com.tencent.midas.control.IAPInitCallBack r4 = r12
                                    if (r4 == 0) goto L_0x0073
                                    r5 = -2
                                    java.lang.String r1 = r1.toString()
                                    java.lang.String r6 = r11
                                    r4.result(r5, r1, r6, r3)
                                L_0x0073:
                                    java.lang.String r1 = "APMidasPayHelper"
                                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                    r3.<init>()
                                    java.lang.String r4 = "preLoadMidasPay openPlugin obj:"
                                    r3.append(r4)
                                    r3.append(r0)
                                    java.lang.String r0 = r3.toString()
                                    com.tencent.midas.comm.APLog.m161214i(r1, r0)
                                    com.tencent.midas.data.APPluginReportManager r0 = com.tencent.midas.data.APPluginReportManager.getInstance()
                                    java.lang.String r1 = r0
                                    java.lang.String r3 = "sdk.plugin.init.totaltime"
                                    r0.insertTimeData(r1, r3)
                                    java.lang.String r0 = "APMidasPayHelper"
                                    java.lang.String r1 = "preLoadMidasPay initState = PLUGIN_INITSUCC"
                                    com.tencent.midas.comm.APLog.m161214i(r0, r1)
                                    com.tencent.midas.control.APMidasPayHelper.initState = r2
                                    java.lang.Object r0 = com.tencent.midas.control.APMidasPayHelper.loadingObject
                                    monitor-enter(r0)
                                    java.lang.Object r1 = com.tencent.midas.control.APMidasPayHelper.loadingObject     // Catch:{ all -> 0x00ab }
                                    r1.notifyAll()     // Catch:{ all -> 0x00ab }
                                    monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                                    return
                                L_0x00ab:
                                    r1 = move-exception
                                    monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.control.APMidasPayHelper.C11460913.run():void");
                            }
                        });
                    } else {
                        initState = 1;
                        synchronized (loadingObject) {
                            loadingObject.notifyAll();
                        }
                    }
                }
            }
        }
    }

    private static void preLoadPlugin(final Context context, final String str, final IAPInitCallBack iAPInitCallBack) {
        synchronized (initObject) {
            initState = 0;
        }
        Thread thread = new Thread(new Runnable() {
            public void run() {
                APMidasPayHelper.preLoadMidasPay(context, str, iAPInitCallBack);
            }
        });
        thread.setName(APPluginDataInterface.singleton().getLaunchInterface());
        thread.start();
    }

    public static void release(Context context) {
        APLog.m161210d(TAG, "release");
        APPluginInstallerAndUpdater.unInstallPlugin(context);
        synchronized (initObject) {
            initState = -1;
        }
    }

    public static void setEnv(String str) {
        if (!"release".equals(str) && !APMidasPayAPI.ENV_TEST.equals(str) && !APMidasPayAPI.ENV_DEV.equals(str) && !"debug".equals(str) && !APMidasPayAPI.ENV_TESTING.equals(str)) {
            str = "release";
        }
        env = str;
    }

    public static void setLogCallbackClassName(String str) {
        logCallbackClassName = str;
    }

    public static void setLogEnable(boolean z) {
        logEnable = z;
    }

    public static synchronized void setLongConnection(Context context, boolean z) {
        synchronized (APMidasPayHelper.class) {
            APLog.m161214i(TAG, "setLongConnection to open = " + z);
            Intent intent = new Intent();
            intent.putExtra(ProviderConstants.API_COLNAME_FEATURE_VERSION, "1.7.9a");
            intent.putExtra("env", env);
            intent.putExtra("logEnable", logEnable);
            intent.putExtra("openLongConnection", z);
            intent.putExtra("launchInterfaceName", Thread.currentThread().getName());
            try {
                APPluginInterfaceManager.initPluginInterface(context, MIDAS_PLUGIN_NAME, PKG_DISTRIBUTE, MED_DISTRIBUTE_LongConnection, new Object[]{context, intent});
            } catch (Exception e) {
                APLog.m161214i(TAG, "initcallback isInitSucc direct call init function e:" + e.toString());
            }
        }
        return;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|4|(2:7|8)|9|10|(1:12)|13|(3:15|16|17)(3:18|19|20)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003d */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int toH5Midas(android.app.Activity r10, android.webkit.WebView r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r9 = this;
            java.lang.String r11 = "APMidasPayHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "toH5Midas initState: "
            r0.append(r1)
            int r1 = initState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.midas.comm.APLog.m161214i(r11, r0)
            java.lang.Object r11 = initObject
            monitor-enter(r11)
            android.app.ProgressDialog r2 = new android.app.ProgressDialog     // Catch:{ all -> 0x0064 }
            r2.<init>(r10)     // Catch:{ all -> 0x0064 }
            r7 = 0
            r2.setIndeterminate(r7)     // Catch:{ all -> 0x0064 }
            r2.setProgressStyle(r7)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "温馨提示"
            r2.setTitle(r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "腾讯支付服务初始化中"
            r2.setMessage(r0)     // Catch:{ all -> 0x0064 }
            int r0 = initState     // Catch:{ all -> 0x0064 }
            r1 = -1
            if (r0 == r1) goto L_0x003a
            if (r0 != 0) goto L_0x003d
        L_0x003a:
            r2.show()     // Catch:{ all -> 0x003d }
        L_0x003d:
            int r0 = initState     // Catch:{ all -> 0x0064 }
            if (r0 != r1) goto L_0x0045
            r0 = 0
            preLoadPlugin(r10, r15, r0)     // Catch:{ all -> 0x0064 }
        L_0x0045:
            int r15 = initState     // Catch:{ all -> 0x0064 }
            if (r15 != 0) goto L_0x005e
            java.lang.Thread r15 = new java.lang.Thread     // Catch:{ all -> 0x0064 }
            com.tencent.midas.control.APMidasPayHelper$10 r8 = new com.tencent.midas.control.APMidasPayHelper$10     // Catch:{ all -> 0x0064 }
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            r15.<init>(r8)     // Catch:{ all -> 0x0064 }
            r15.start()     // Catch:{ all -> 0x0064 }
            monitor-exit(r11)     // Catch:{ all -> 0x0064 }
            return r7
        L_0x005e:
            int r10 = r9.toH5MidasPay(r10, r12, r13, r14)     // Catch:{ all -> 0x0064 }
            monitor-exit(r11)     // Catch:{ all -> 0x0064 }
            return r10
        L_0x0064:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0064 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.control.APMidasPayHelper.toH5Midas(android.app.Activity, android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    /* access modifiers changed from: private */
    public int toH5MidasPay(Activity activity, String str, String str2, String str3) {
        synchronized (initObject) {
            if (initState == 2) {
                APLog.m161214i(TAG, "toH5MidasPay plugin init error");
                pluginInitErrCallBack(activity);
                initState = -1;
                return -1;
            }
            final String str4 = str;
            final String str5 = str2;
            final Activity activity2 = activity;
            final String str6 = str3;
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    Intent intent = new Intent();
                    intent.putExtra(ProviderConstants.API_COLNAME_FEATURE_VERSION, APMidasPayAPI.getMidasPluginVersion());
                    intent.putExtra("env", APMidasPayHelper.env);
                    intent.putExtra("screenType", APMidasPayHelper.this.screenType);
                    intent.putExtra("logEnable", APMidasPayHelper.logEnable);
                    intent.putExtra("req", "H5Pay");
                    intent.putExtra("url", str4);
                    intent.putExtra(StateEvent.Name.MESSAGE, str5);
                    intent.putExtra("reqType", APMidasPayHelper.netCallBack_ReqType);
                    try {
                        APMultiProcessData processData = APPluginDataInterface.singleton().getProcessData();
                        if (processData != null) {
                            intent.putExtra("launchPayGUID", processData.getGuid());
                            intent.putExtra("launchPayTime", processData.getPayInterfaceTime());
                            intent.putExtra("launchPayDataid", APDataId.getDataId());
                            intent.putExtra("launchIntervalTime", processData.getIntervalTime());
                        }
                    } catch (Exception unused) {
                    }
                    if (APMidasPayHelper.isNewProcess) {
                        APCallBackResultReceiver unused2 = APMidasPayHelper.remotRecevier = new APCallBackResultReceiver(new Handler());
                        APMidasPayHelper.remotRecevier.setReceiver(APMidasPayHelper.this);
                        intent.putExtra("remoteReceiver", APMidasPayHelper.remotRecevier);
                    }
                    APMidasPayHelper.this.openPlugin(activity2, intent, str6);
                }
            });
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:6|7|(3:9|53|14)|19|(2:26|27)|28|29|(3:31|(1:33)|34)(1:35)|36|(3:38|39|40)(3:41|42|43)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0074 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int toMidas(android.app.Activity r15, com.tencent.midas.api.request.APMidasBaseRequest r16, java.lang.String r17, java.lang.String r18) {
        /*
            r14 = this;
            r0 = r15
            r8 = r17
            r1 = -1
            if (r16 != 0) goto L_0x000e
            java.lang.String r0 = "APMidasPayHelper"
            java.lang.String r2 = "toMidas pay request is null"
            com.tencent.midas.comm.APLog.m161222w(r0, r2)
            return r1
        L_0x000e:
            requestObject = r16
            staticActivityContext = r0
            java.lang.String r2 = "APMidasPayHelper"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ToMidas initState = "
            r3.append(r4)
            int r4 = initState
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.midas.comm.APLog.m161214i(r2, r3)
            java.lang.Object r10 = initObject
            monitor-enter(r10)
            android.app.ProgressDialog r3 = new android.app.ProgressDialog     // Catch:{ all -> 0x00aa }
            r3.<init>(r15)     // Catch:{ all -> 0x00aa }
            r11 = 0
            r3.setIndeterminate(r11)     // Catch:{ all -> 0x00aa }
            r3.setProgressStyle(r11)     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "温馨提示"
            r3.setTitle(r2)     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "腾讯支付服务初始化中"
            r3.setMessage(r2)     // Catch:{ all -> 0x00aa }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00aa }
            boolean r2 = com.tencent.midas.plugin.APPluginInstallerAndUpdater.isNeedUpdateFromLocal(r15)     // Catch:{ all -> 0x00aa }
            isNeedLocalUpdate = r2     // Catch:{ all -> 0x00aa }
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = initObject     // Catch:{ all -> 0x00aa }
            monitor-enter(r2)     // Catch:{ all -> 0x00aa }
            initState = r1     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x005b:
            int r2 = initState     // Catch:{ all -> 0x00aa }
            if (r2 == r1) goto L_0x0061
            if (r2 != 0) goto L_0x0074
        L_0x0061:
            java.lang.String r2 = MED_DISTRIBUTE_NET     // Catch:{ all -> 0x00aa }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x00aa }
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = MED_DISTRIBUTE_INFO     // Catch:{ all -> 0x00aa }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x00aa }
            if (r2 != 0) goto L_0x0074
            r3.show()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            int r2 = initState     // Catch:{ all -> 0x00aa }
            if (r2 != r1) goto L_0x0086
            boolean r1 = isNeedLocalUpdate     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x007f
            release(r15)     // Catch:{ all -> 0x00aa }
        L_0x007f:
            r1 = 0
            r9 = r18
            preLoadPlugin(r15, r9, r1)     // Catch:{ all -> 0x00aa }
            goto L_0x0088
        L_0x0086:
            r9 = r18
        L_0x0088:
            int r1 = initState     // Catch:{ all -> 0x00aa }
            if (r1 != 0) goto L_0x00a4
            java.lang.Thread r12 = new java.lang.Thread     // Catch:{ all -> 0x00aa }
            com.tencent.midas.control.APMidasPayHelper$8 r13 = new com.tencent.midas.control.APMidasPayHelper$8     // Catch:{ all -> 0x00aa }
            r1 = r13
            r2 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r1.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x00aa }
            r12.<init>(r13)     // Catch:{ all -> 0x00aa }
            r12.start()     // Catch:{ all -> 0x00aa }
            monitor-exit(r10)     // Catch:{ all -> 0x00aa }
            return r11
        L_0x00a4:
            int r0 = r14.toMidasPay(r15, r16, r17, r18)     // Catch:{ all -> 0x00aa }
            monitor-exit(r10)     // Catch:{ all -> 0x00aa }
            return r0
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.control.APMidasPayHelper.toMidas(android.app.Activity, com.tencent.midas.api.request.APMidasBaseRequest, java.lang.String, java.lang.String):int");
    }

    /* access modifiers changed from: private */
    public int toMidasPay(final Activity activity, final APMidasBaseRequest aPMidasBaseRequest, final String str, String str2) {
        synchronized (initObject) {
            if (initState == 2) {
                APLog.m161214i(TAG, "toMidasPay plugin init error");
                pluginInitErrCallBack(activity);
                initState = -1;
                return -1;
            }
            requestObject = aPMidasBaseRequest;
            staticActivityContext = activity;
            try {
                activity.runOnUiThread(new Runnable() {
                    public void run() {
                        Intent intent = new Intent();
                        intent.putExtra(ProviderConstants.API_COLNAME_FEATURE_VERSION, APMidasPayAPI.getMidasPluginVersion());
                        intent.putExtra("env", APMidasPayHelper.env);
                        intent.putExtra("screenType", APMidasPayHelper.this.screenType);
                        intent.putExtra("logEnable", APMidasPayHelper.logEnable);
                        intent.putExtra("req", aPMidasBaseRequest);
                        intent.putExtra("reqType", APMidasPayHelper.netCallBack_ReqType);
                        intent.putExtra(FirebaseAnalytics.C113379b.METHOD, str);
                        if (APMidasPayHelper.isNewProcess) {
                            APCallBackResultReceiver unused = APMidasPayHelper.remotRecevier = new APCallBackResultReceiver(new Handler());
                            APMidasPayHelper.remotRecevier.setReceiver(APMidasPayHelper.this);
                            intent.putExtra("remoteReceiver", APMidasPayHelper.remotRecevier);
                        }
                        intent.putExtra("launchInterfaceName", APPluginDataInterface.singleton().getLaunchInterface());
                        try {
                            APMultiProcessData processData = APPluginDataInterface.singleton().getProcessData();
                            if (processData != null) {
                                intent.putExtra("launchPayGUID", processData.getGuid());
                                intent.putExtra("launchPayTime", processData.getPayInterfaceTime());
                                intent.putExtra("launchPayDataid", APDataId.getDataId());
                                intent.putExtra("launchIntervalTime", processData.getIntervalTime());
                            }
                        } catch (Exception unused2) {
                        }
                        APMidasPayHelper.this.openPlugin(activity, intent, str);
                    }
                });
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:10|11|(3:13|78|18)|23|(2:30|31)|32|33|(3:35|(1:37)|38)|39|(1:41)(1:42)|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x009d */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void waitingPluginReady(android.content.Context r9, android.os.ResultReceiver r10) {
        /*
            r8 = this;
            java.lang.String r0 = "test"
            java.lang.String r1 = env
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0019
            int r0 = initCount
            r1 = 1
            if (r0 >= r1) goto L_0x0019
            java.lang.String r0 = "腾讯支付尚未初始化，请先调用初始化接口!"
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r1)
            r0.show()
        L_0x0019:
            boolean r0 = isNewProcess
            if (r0 == 0) goto L_0x0036
            android.content.Context r0 = r9.getApplicationContext()
            java.lang.String r1 = "TencentUnipay"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "launchpaycalling"
            java.lang.String r2 = "1"
            r0.putString(r1, r2)
            r0.commit()
        L_0x0036:
            java.lang.String r0 = "APMidasPayHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ToMidas initState = "
            r1.append(r2)
            int r2 = initState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.midas.comm.APLog.m161214i(r0, r1)
            java.lang.Object r0 = initObject
            monitor-enter(r0)
            android.app.ProgressDialog r3 = new android.app.ProgressDialog     // Catch:{ all -> 0x00cd }
            r3.<init>(r9)     // Catch:{ all -> 0x00cd }
            r1 = 0
            r3.setIndeterminate(r1)     // Catch:{ all -> 0x00cd }
            r3.setProgressStyle(r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = "温馨提示"
            r3.setTitle(r2)     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = "腾讯支付服务初始化中"
            r3.setMessage(r2)     // Catch:{ all -> 0x00cd }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00cd }
            boolean r2 = com.tencent.midas.plugin.APPluginInstallerAndUpdater.isNeedUpdateFromLocal(r9)     // Catch:{ all -> 0x00cd }
            isNeedLocalUpdate = r2     // Catch:{ all -> 0x00cd }
            r6 = -1
            if (r2 == 0) goto L_0x0080
            java.lang.Object r2 = initObject     // Catch:{ all -> 0x00cd }
            monitor-enter(r2)     // Catch:{ all -> 0x00cd }
            initState = r6     // Catch:{ all -> 0x007d }
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            goto L_0x0080
        L_0x007d:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            throw r9     // Catch:{ all -> 0x00cd }
        L_0x0080:
            int r2 = initState     // Catch:{ all -> 0x00cd }
            if (r2 == r6) goto L_0x0086
            if (r2 != 0) goto L_0x009d
        L_0x0086:
            java.lang.String r2 = MED_DISTRIBUTE_NET     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = "launchFunction"
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x00cd }
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = MED_DISTRIBUTE_INFO     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = "launchFunction"
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x00cd }
            if (r2 != 0) goto L_0x009d
            r3.show()     // Catch:{ all -> 0x009d }
        L_0x009d:
            int r2 = initState     // Catch:{ all -> 0x00cd }
            if (r2 != r6) goto L_0x00ae
            boolean r2 = isNeedLocalUpdate     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x00a8
            release(r9)     // Catch:{ all -> 0x00cd }
        L_0x00a8:
            java.lang.String r2 = "launchFunction"
            r6 = 0
            preLoadPlugin(r9, r2, r6)     // Catch:{ all -> 0x00cd }
        L_0x00ae:
            int r9 = initState     // Catch:{ all -> 0x00cd }
            if (r9 != 0) goto L_0x00c3
            java.lang.Thread r9 = new java.lang.Thread     // Catch:{ all -> 0x00cd }
            com.tencent.midas.control.APMidasPayHelper$6 r7 = new com.tencent.midas.control.APMidasPayHelper$6     // Catch:{ all -> 0x00cd }
            r1 = r7
            r2 = r8
            r6 = r10
            r1.<init>(r3, r4, r6)     // Catch:{ all -> 0x00cd }
            r9.<init>(r7)     // Catch:{ all -> 0x00cd }
            r9.start()     // Catch:{ all -> 0x00cd }
            goto L_0x00cb
        L_0x00c3:
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x00cd }
            r9.<init>()     // Catch:{ all -> 0x00cd }
            r10.send(r1, r9)     // Catch:{ all -> 0x00cd }
        L_0x00cb:
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return
        L_0x00cd:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.control.APMidasPayHelper.waitingPluginReady(android.content.Context, android.os.ResultReceiver):void");
    }

    public Object call(Activity activity, String str, Object[] objArr) {
        return callWithContext(activity, str, objArr);
    }

    public Object callWithContext(Context context, String str, Object[] objArr) {
        try {
            return APPluginInterfaceManager.initPluginInterface(context, MIDAS_PLUGIN_NAME, PKG_DISTRIBUTE, MED_DISTRIBUTE_CALL, new Object[]{str, objArr});
        } catch (Exception e) {
            APLog.m161214i(TAG, "callWithContext error:" + e.toString());
            return null;
        }
    }

    public int getInfo(Activity activity, String str, APMidasBaseRequest aPMidasBaseRequest, IAPMidasNetCallBack iAPMidasNetCallBack) {
        netCallBack = iAPMidasNetCallBack;
        netCallBack_ReqType = str;
        return toMidas(activity, aPMidasBaseRequest, MED_DISTRIBUTE_INFO, "getInfo");
    }

    public int h5Pay(Activity activity, WebView webView, com.tencent.smtt.sdk.WebView webView2, String str, String str2) {
        webview = webView;
        x5Webview = webView2;
        APLog.m161214i(TAG, "h5Pay webview:" + webview + " x5Webview:" + x5Webview + " msg:" + str2);
        if (TextUtils.isEmpty(str2) || !str2.startsWith("midas_js_bridge_")) {
            return -2;
        }
        return toH5Midas(activity, webView, str, str2, MED_DISTRIBUTE_H5PAY, "h5Pay");
    }

    public void launchWXMiniProgram(Context context, Bundle bundle, ResultReceiver resultReceiver) {
        call(context, MED_DISTRIBUTE_WX_MINIPROGRAM, (Class<?>[]) new Class[]{Context.class, Bundle.class, ResultReceiver.class}, new Object[]{context, bundle, resultReceiver});
    }

    public void launchWXMiniProgram_OnResponse(Context context, int i, Bundle bundle) {
        call(context, MED_DISTRIBUTE_WX_MINIPROGRAM_ONRESPONSE, (Class<?>[]) new Class[]{Integer.TYPE, Bundle.class}, new Object[]{Integer.valueOf(i), bundle});
    }

    public void launchWeb(Activity activity, APMidasBaseRequest aPMidasBaseRequest, IAPMidasPayCallBack iAPMidasPayCallBack) {
        Intent intent = new Intent();
        intent.setClass(activity, APWebJSBridgeActivity.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/midas/control/APMidasPayHelper", "launchWeb", "(Landroid/app/Activity;Lcom/tencent/midas/api/request/APMidasBaseRequest;Lcom/tencent/midas/api/IAPMidasPayCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/midas/control/APMidasPayHelper", "launchWeb", "(Landroid/app/Activity;Lcom/tencent/midas/api/request/APMidasBaseRequest;Lcom/tencent/midas/api/IAPMidasPayCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int net(Activity activity, APMidasNetRequest aPMidasNetRequest, IAPMidasNetCallBack iAPMidasNetCallBack) {
        netCallBack = iAPMidasNetCallBack;
        netCallBack_ReqType = aPMidasNetRequest.reqType;
        return toMidas(activity, aPMidasNetRequest, MED_DISTRIBUTE_NET, "net");
    }

    public void onReceiveResult(int i, Bundle bundle) {
        APLog.m161214i(TAG, "remotRecevier payHelper resultCode:" + i);
        if (i == 0) {
            progressRemoteInfo(bundle);
        }
    }

    public int pay(Activity activity, APMidasBaseRequest aPMidasBaseRequest, IAPMidasPayCallBack iAPMidasPayCallBack) {
        APLog.m161210d(TAG, "Calling into pay, caller = " + Thread.currentThread().getStackTrace()[3].toString());
        if (APMidasPayAPI.ENV_TEST.equals(env) && initCount < 1) {
            Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        midasCallBack = iAPMidasPayCallBack;
        if (isNewProcess) {
            SharedPreferences.Editor edit = activity.getApplicationContext().getSharedPreferences(APPluginDataInterface.SHARE_PREFERENCE_NAME, 4).edit();
            edit.putString("launchpaycalling", "1");
            edit.commit();
        }
        return toMidas(activity, aPMidasBaseRequest, MED_DISTRIBUTE_PAY, WeChatBrands.Business.GROUP_PAY);
    }

    public void progressRemoteInfo(Bundle bundle) {
        APPurchase aPPurchase;
        String string = bundle.getString("type");
        APLog.m161214i(TAG, "progressRemoteInfo type:" + string);
        if ("callback".equals(string)) {
            APMidasResponse aPMidasResponse = new APMidasResponse();
            aPMidasResponse.resultCode = bundle.getInt("resultCode", -1);
            aPMidasResponse.resultInerCode = bundle.getInt("resultInerCode");
            aPMidasResponse.realSaveNum = bundle.getInt("realSaveNum");
            aPMidasResponse.payChannel = bundle.getInt("payChannel");
            aPMidasResponse.payState = bundle.getInt("payState");
            aPMidasResponse.provideState = bundle.getInt("provideState");
            aPMidasResponse.resultMsg = bundle.getString("resultMsg");
            aPMidasResponse.extendInfo = bundle.getString("extendInfo");
            aPMidasResponse.payReserve1 = bundle.getString("payReserve1");
            aPMidasResponse.payReserve2 = bundle.getString("payReserve2");
            aPMidasResponse.payReserve3 = bundle.getString("payReserve3");
            try {
                aPPurchase = new APPurchase(bundle.getString("purchaseJson"), bundle.getString("purchaseSign"));
            } catch (JSONException e) {
                aPPurchase = new APPurchase();
                APLog.m161222w("progressRemoteInfo", "purchase creat fail1 " + e.toString());
            } catch (Exception e2) {
                aPPurchase = new APPurchase();
                APLog.m161222w("progressRemoteInfo", "purchase creat fail2 " + e2.toString());
            }
            aPMidasResponse.mAPPurchase = aPPurchase;
            midasCallBack(aPMidasResponse);
        } else if ("h5callback".equals(string)) {
            midasH5CallBack(bundle.getString("callbackinfo"));
        } else if ("needlogin".equals(string)) {
            midasLoginExpire();
        }
    }

    public void sendMidas(Context context, Bundle bundle, ResultReceiver resultReceiver) {
        final Context context2 = context;
        final Bundle bundle2 = bundle;
        final ResultReceiver resultReceiver2 = resultReceiver;
        waitingPluginReady(context, new ResultReceiver(new Handler(Looper.getMainLooper())) {
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == 0) {
                    try {
                        APMidasPayHelper aPMidasPayHelper = APMidasPayHelper.this;
                        Context context = context2;
                        aPMidasPayHelper.retobj = APPluginInterfaceManager.initPluginInterface(context, APMidasPayHelper.MIDAS_PLUGIN_NAME, APMidasPayHelper.PKG_DISTRIBUTE, APMidasPayHelper.MED_DISTRIBUTE_RECEIVE, new Object[]{context, bundle2, resultReceiver2}, new Class[]{Context.class, Bundle.class, ResultReceiver.class});
                    } catch (Exception e) {
                        APLog.m161212e(APMidasPayHelper.TAG, "sendMidas() e = " + e.toString());
                    }
                } else if (resultReceiver2 != null) {
                    String string = bundle2.getString("__midas_ability_baseReq__postBack");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("midas_callback_ability_postBack", string);
                    bundle2.putInt("midas_callback_ability_code", -1999);
                    bundle2.putString("midas_callback_ability_msg", "MidasPlugin load failure");
                    bundle2.putBundle("midas_callback_ability_data", bundle);
                    resultReceiver2.send(-1, bundle2);
                }
            }
        });
    }

    public void setScreenType(int i) {
        this.screenType = i;
    }

    public void web(Activity activity, APMidasBaseRequest aPMidasBaseRequest, IAPMidasPayCallBack iAPMidasPayCallBack) {
        midasCallBack = iAPMidasPayCallBack;
        launchWeb(activity, aPMidasBaseRequest, iAPMidasPayCallBack);
    }

    public Object call(Activity activity, String str, Object[] objArr, Class<?>[] clsArr) {
        return callWithContext(activity, str, objArr, clsArr);
    }

    public static synchronized void init(final Context context, APMidasBaseRequest aPMidasBaseRequest, final ResultReceiver resultReceiver) {
        synchronized (APMidasPayHelper.class) {
            APLog.m161214i(TAG, "init initCount:" + initCount);
            isNewProcess = isNewProcess(context);
            initRequest = aPMidasBaseRequest;
            if (initCount < 1 && !isInitSucc) {
                APPluginUtils.release();
                preLoadPlugin(context, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new IAPInitCallBack() {
                    public void result(int i, String str, String str2, Bundle bundle) {
                        APLog.m161214i(APMidasPayHelper.TAG, "initcallback ret:" + i + " msg:" + str);
                        synchronized (APMidasPayHelper.dexloadObject) {
                            boolean unused = APMidasPayHelper.isInitSucc = true;
                            APMidasPayHelper.dexloadObject.notifyAll();
                        }
                        APPluginReportManager.getInstance().dataReport(APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                    }
                });
            } else if (isInitSucc) {
                ((Activity) context).runOnUiThread(new Runnable() {
                    public void run() {
                        APLog.m161214i(APMidasPayHelper.TAG, "initcallback isInitSucc direct call init function");
                        Intent intent = new Intent();
                        intent.putExtra(ProviderConstants.API_COLNAME_FEATURE_VERSION, "1.7.9a");
                        intent.putExtra("req", APMidasPayHelper.initRequest);
                        intent.putExtra("env", APMidasPayHelper.env);
                        intent.putExtra("logEnable", APMidasPayHelper.logEnable);
                        intent.putExtra("launchInterfaceName", Thread.currentThread().getName());
                        ResultReceiver resultReceiver = resultReceiver;
                        if (resultReceiver != null) {
                            intent.putExtra("receiver", resultReceiver);
                        }
                        try {
                            Context context = context;
                            APPluginInterfaceManager.initPluginInterface(context, APMidasPayHelper.MIDAS_PLUGIN_NAME, APMidasPayHelper.PKG_DISTRIBUTE, APMidasPayHelper.MED_DISTRIBUTE_INIT, new Object[]{context, intent});
                        } catch (Exception e) {
                            APLog.m161214i(APMidasPayHelper.TAG, "initcallback isInitSucc direct call init function e:" + e.toString());
                        }
                    }
                });
            }
            APPluginReportManager.getInstance().dataReport(APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            initCount++;
        }
    }

    public Object call(Context context, String str, Class<?>[] clsArr, Object[] objArr) {
        return callWithContext(context, str, objArr, clsArr);
    }

    public Object callWithContext(Context context, String str, Object[] objArr, Class<?>[] clsArr) {
        synchronized (initObject) {
            APLog.m161214i("callWithContext ", "initState:" + initState);
            if (initState == 0) {
                final Context context2 = context;
                final String str2 = str;
                final Object[] objArr2 = objArr;
                final Class<?>[] clsArr2 = clsArr;
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            APLog.m161210d("callWithContext ", "PLUGIN_INITING wait");
                            synchronized (APMidasPayHelper.dexloadObject) {
                                APMidasPayHelper.dexloadObject.wait();
                            }
                            APLog.m161210d("callWithContext ", "PLUGIN_INITING go");
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                public void run() {
                                    try {
                                        C1146167 r0 = C1146167.this;
                                        APMidasPayHelper.this.retobj = APPluginInterfaceManager.initPluginInterface2(context2, APMidasPayHelper.MIDAS_PLUGIN_NAME, APMidasPayHelper.PKG_DISTRIBUTE, APMidasPayHelper.MED_DISTRIBUTE_CALL2, new Object[]{str2, objArr2, clsArr2});
                                    } catch (Exception e) {
                                        APLog.m161212e("callWithContext", "error1 " + e.toString());
                                    }
                                }
                            });
                        } catch (InterruptedException e) {
                            APLog.m161212e("callWithContext", "error2 " + e.toString());
                        } catch (Exception e2) {
                            APLog.m161212e("callWithContext", "error3 " + e2.toString());
                        } catch (Throwable th) {
                            APLog.m161212e("callWithContext", "error4 " + th.toString());
                        }
                    }
                }).start();
            } else {
                try {
                    this.retobj = APPluginInterfaceManager.initPluginInterface2(context, MIDAS_PLUGIN_NAME, PKG_DISTRIBUTE, MED_DISTRIBUTE_CALL2, new Object[]{str, objArr, clsArr});
                } catch (Exception e) {
                    APLog.m161212e("callWithContext", "error3 " + e.toString());
                }
            }
        }
        return this.retobj;
    }
}
