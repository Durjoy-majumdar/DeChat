package com.tencent.live2.impl;

import android.content.Context;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;
import com.tencent.rtmp.TXLiveBase;

/* renamed from: com.tencent.live2.impl.a */
public final class C17631a {

    /* renamed from: a */
    public static final C17633a f47988a = new C17633a();

    /* renamed from: com.tencent.live2.impl.a$1 */
    public static /* synthetic */ class C176321 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47989a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.liteav.base.util.LiteavLog$b[] r0 = com.tencent.liteav.base.util.LiteavLog.C17107b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47989a = r0
                com.tencent.liteav.base.util.LiteavLog$b r1 = com.tencent.liteav.base.util.LiteavLog.C17107b.kInfo     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47989a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.base.util.LiteavLog$b r1 = com.tencent.liteav.base.util.LiteavLog.C17107b.kWarning     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47989a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.base.util.LiteavLog$b r1 = com.tencent.liteav.base.util.LiteavLog.C17107b.kError     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47989a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.base.util.LiteavLog$b r1 = com.tencent.liteav.base.util.LiteavLog.C17107b.kFatal     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.live2.impl.C17631a.C176321.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.live2.impl.a$a */
    public static final class C17633a implements LiteavLog.C17108a {

        /* renamed from: a */
        public V2TXLivePremier.V2TXLivePremierObserver f47990a;

        /* renamed from: a */
        public final void mo19357a(LiteavLog.C17107b bVar, String str, String str2) {
            int i = C176321.f47989a[bVar.ordinal()];
            int i2 = 4;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 3;
            } else if (i != 3) {
                i2 = i != 4 ? 0 : 5;
            }
            V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = this.f47990a;
            if (v2TXLivePremierObserver != null) {
                v2TXLivePremierObserver.onLog(i2, str2);
            }
        }
    }

    /* renamed from: a */
    public static String m17916a() {
        return CommonUtil.getSDKVersionStr();
    }

    /* renamed from: a */
    public static void m17919a(V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        f47988a.f47990a = v2TXLivePremierObserver;
    }

    /* renamed from: a */
    public static void m17918a(V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig) {
        LiteavLog.C17107b bVar;
        if (v2TXLiveLogConfig != null) {
            LiteavLog.nativeSetConsoleLogEnabled(v2TXLiveLogConfig.enableConsole);
            LiteavLog.nativeSetLogToFileEnabled(v2TXLiveLogConfig.enableLogFile);
            String str = v2TXLiveLogConfig.logPath;
            if (str != null) {
                LiteavLog.nativeSetLogFilePath(str);
            }
            int i = v2TXLiveLogConfig.logLevel;
            if (i == 2) {
                bVar = LiteavLog.C17107b.kInfo;
            } else if (i == 3) {
                bVar = LiteavLog.C17107b.kWarning;
            } else if (i == 4) {
                bVar = LiteavLog.C17107b.kError;
            } else if (i == 5) {
                bVar = LiteavLog.C17107b.kFatal;
            } else if (i != 6) {
                bVar = LiteavLog.C17107b.kAll;
            } else {
                bVar = LiteavLog.C17107b.kNone;
            }
            LiteavLog.nativeSetLogLevel(bVar.mNativeValue);
            C17633a aVar = f47988a;
            boolean z = v2TXLiveLogConfig.enableObserver;
            if (!z) {
                aVar = null;
            }
            LiteavLog.setCallback(aVar);
            LiteavLog.nativeSetLogCallbackEnabled(z);
        }
    }

    /* renamed from: a */
    public static void m17920a(String str) {
        TXLiveBase.setGlobalEnv(str);
    }

    /* renamed from: a */
    public static void m17917a(Context context, String str, String str2) {
        TXLiveBase.getInstance().setLicence(context, str, str2);
    }

    /* renamed from: a */
    public static void m17921a(String str, int i, String str2, String str3) {
        CommonUtil.setSocks5Proxy(str, i, str2, str3);
    }
}
