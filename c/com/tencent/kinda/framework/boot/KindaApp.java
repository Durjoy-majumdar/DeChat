package com.tencent.kinda.framework.boot;

import com.tencent.kinda.framework.WxCrossServices;
import com.tencent.kinda.framework.module.base.KindaBaseServiceModule;
import com.tencent.kinda.framework.module.base.KindaBaseViewModule;
import com.tencent.kinda.framework.module.pay.KindaPayServiceModule;
import com.tencent.kinda.gen.IAppKinda;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.modularize.KindaAppModuleManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.WCWebUpdater;
import gy3.C87412m;
import java.io.PrintWriter;
import java.io.StringWriter;

public class KindaApp {
    private static final String TAG = "MicroMsg.Kinda.KindaApp";
    private static KindaApp instance;
    private KindaAppModuleManager appModuleManager;
    private IAppKinda kinda = IAppKinda.getInstance();
    private MMHandlerThread threadHandler;

    private KindaApp() {
        Log.m105924i(TAG, "create kinda app");
        C115669n.INSTANCE.mo175911u(782, 30);
        WxCrossServices.tryLoadLibrary();
        KindaAppModuleManager kindaAppModuleManager = new KindaAppModuleManager();
        this.appModuleManager = kindaAppModuleManager;
        kindaAppModuleManager.registerModule(new KindaBaseViewModule());
        this.appModuleManager.registerModule(new KindaBaseServiceModule());
        this.appModuleManager.registerModule(new KindaPayServiceModule());
        this.appModuleManager.initAllModule();
    }

    public static IAppKinda appKinda() {
        return instance().kinda;
    }

    public static KindaApp instance() {
        if (instance == null) {
            synchronized (KindaApp.class) {
                if (instance == null) {
                    instance = new KindaApp();
                }
            }
        }
        return instance;
    }

    public static void reportFatalError(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Log.m105920e(TAG, "reportFatalError stack : " + stringWriter2);
        if (stringWriter2.length() > 6000) {
            stringWriter2 = stringWriter2.substring(0, 6000);
        }
        C87412m.m108594g(stringWriter2, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        C115669n.INSTANCE.mo160131h(24610, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "1", "1", stringWriter2);
    }

    public void checkIfNeedRequestUserBindqueryWhenUnBindCard(String str) {
        Log.m105925i(TAG, "checkIfNeedRequestUserBindqueryWhenUnBindCard bindserial : %s", str);
        this.kinda.checkIfNeedRequestUserBindqueryWhenUnBindCard(str);
    }

    public void checkIfNeedUpdateOfflinePayToken() {
        Log.m105924i(TAG, "checkIfNeedUpdateOfflinePayToken");
        this.kinda.checkIfNeedUpdateOfflinePayToken();
    }

    public void notifyAllUseCases(ITransmitKvData iTransmitKvData) {
        Log.m105924i(TAG, "notifyAllUseCases");
        this.kinda.notifyAllUseCases(iTransmitKvData);
    }

    public void onBackground() {
        Log.m105924i(TAG, "onBackground");
        this.kinda.applicationEnterBackground();
    }

    public void onCreate() {
        WxCrossServices.tryLoadLibrary();
        this.appModuleManager.onAppCreate();
    }

    public void onForeground() {
        Log.m105924i(TAG, "onForeground");
        this.kinda.applicationEnterForeground();
    }

    public void reInitModule() {
        KindaAppModuleManager kindaAppModuleManager = this.appModuleManager;
        if (kindaAppModuleManager != null) {
            kindaAppModuleManager.initAllModule();
            this.kinda = IAppKinda.getInstance();
        }
    }

    public void releaseAppKinda() {
        this.kinda = null;
    }

    public void updateOfflinePayDefaultCard(String str, String str2) {
        Log.m105925i(TAG, "updateOfflinePayDefaultCard, bindserial : %s", str);
        this.kinda.updateOfflinePayDefaultCard(str, str2);
    }

    public void updateOfflinePayTokenFromScene(int i) {
        Log.m105925i(TAG, "updateOfflinePayTokenFromScene : %s", Integer.valueOf(i));
        this.kinda.updateOfflinePayTokenWithScene(i);
    }
}
