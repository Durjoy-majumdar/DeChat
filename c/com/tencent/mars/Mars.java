package com.tencent.mars;

import android.content.Context;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C9556a;

public class Mars {
    private static final int CertVersion_Mainland = 1;
    private static final int CertVersion_WeChatUS = 2;
    private static final C114668z.C104589a appForegroundListener = new C114668z.C104589a() {
        public void onAppBackground(String str) {
            Mars.onForeground(false);
        }

        public void onAppForeground(String str) {
            Mars.onForeground(true);
        }
    };
    private static volatile boolean hasInitialized = false;
    public static final String libMarsBase = "wechatbase";
    public static final String libMarsHttp = "wechathttp";
    public static final String libMarsMM = "wechatmm";
    public static final String libMarsNetwork = "wechatnetwork";
    private static ArrayList<String[]> libModules = new ArrayList<>();
    private byte _hellAccFlag_;

    public static synchronized void checkLoadedModules(ArrayList<String> arrayList, String str) {
        synchronized (Mars.class) {
            if (arrayList != null) {
                int i = 0;
                String[] strArr = new String[0];
                Log.m105924i(str, "loaded modules: " + Arrays.toString(arrayList.toArray(strArr)));
                Arrays.sort(strArr);
                libModules.add(strArr);
                boolean z = true;
                for (int i2 = 0; i2 < libModules.size(); i2++) {
                    if (!Arrays.equals((Object[]) libModules.get(i2), (Object[]) libModules.get(0))) {
                        z = false;
                    }
                }
                if (!z) {
                    while (i < libModules.size()) {
                        int i3 = i + 1;
                        int i4 = i3;
                        while (i4 < libModules.size() && (!hasInterSection(libModules.get(i), libModules.get(i4)))) {
                            i4++;
                        }
                        if (!z) {
                            break;
                        }
                        i = i3;
                    }
                }
                if (!z) {
                    throw new IllegalStateException("mars lib module custom made error, pls check your *.so.");
                }
            }
        }
    }

    public static int currentCertVer() {
        int defaultXAgreementId = WeChatBrands.AppInfo.current().getDefaultXAgreementId();
        return (defaultXAgreementId == 0 || defaultXAgreementId != 3) ? 1 : 2;
    }

    private static boolean hasInterSection(String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String add : strArr) {
            arrayList.add(add);
        }
        for (String contains : strArr2) {
            if (arrayList.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public static void init(Context context, MMHandler mMHandler) {
        PlatformComm.init(context, mMHandler);
        hasInitialized = true;
    }

    private static void initCert() {
        onInit(currentCertVer());
    }

    public static void loadDefaultMarsLibrary() {
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c("c++_shared");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mars/Mars", "loadDefaultMarsLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mars/Mars", "loadDefaultMarsLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (Throwable unused) {
        }
    }

    public static void onCreate(boolean z) {
        if (z && hasInitialized) {
            onCreate();
        } else if (!z) {
            onCreate();
        } else {
            throw new IllegalStateException("function MarsCore.init must be executed before Mars.onCreate when application firststartup.");
        }
        appForegroundListener.alive();
    }

    public static void onDestroy() {
        onDestroyImpl();
        appForegroundListener.dead();
    }

    private static void onDestroyImpl() {
        BaseEvent.onDestroy();
    }

    public static void onExceptionCrash() {
        BaseEvent.onExceptionCrash();
    }

    public static void onForeground(boolean z) {
        BaseEvent.onForeground(z);
    }

    private static void onInit(int i) {
        Log.m105925i("MicroMsg.Mars", "packerEncoderVersion %s", Integer.valueOf(i));
        BaseEvent.onInitConfigBeforeOnCreate(i);
    }

    public static void onNetworkChange() {
        BaseEvent.onNetworkChange();
    }

    public static void onSingalCrash(int i) {
        BaseEvent.onSingalCrash(i);
    }

    public static void onCreate() {
        initCert();
        BaseEvent.onCreate();
    }
}
