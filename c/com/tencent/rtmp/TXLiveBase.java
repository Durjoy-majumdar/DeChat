package com.tencent.rtmp;

import android.content.Context;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.TXLiteAVExternalDecoderFactoryInterface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C28637q;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.videoconsumer.decoder.C17356n;
import com.tencent.liteav.videoconsumer.decoder.ExternalDecodeFactoryManager;

public class TXLiveBase {
    private static final String TAG = "TXLiveBase";
    private static TXLiveBase instance = new TXLiveBase();
    /* access modifiers changed from: private */
    public static TXLiveBaseListener listener;
    private static C19984c networkTimeCallback = new C19984c((byte) 0);

    /* renamed from: com.tencent.rtmp.TXLiveBase$b */
    public static class C19983b implements LiteavLog.C17108a {
        private C19983b() {
        }

        public /* synthetic */ C19983b(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo19357a(LiteavLog.C17107b bVar, String str, String str2) {
            TXLiveBaseListener access$200 = TXLiveBase.listener;
            if (access$200 != null) {
                access$200.onLog(bVar.mNativeValue, str, str2);
            }
        }
    }

    /* renamed from: com.tencent.rtmp.TXLiveBase$c */
    public static class C19984c implements CommonUtil.C17106a {
        private C19984c() {
        }

        public /* synthetic */ C19984c(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo19356a(int i, String str) {
            TXLiveBase.onUpdateNetworkTime(i, str);
        }
    }

    static {
        if (C28637q.m38304a()) {
            CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
    }

    private TXLiveBase() {
    }

    public static TXLiveBase getInstance() {
        return instance;
    }

    public static long getNetworkTimestamp() {
        return CommonUtil.getNetworkTimestamp();
    }

    public static String getPituSDKVersion() {
        return "";
    }

    public static String getSDKVersionStr() {
        return CommonUtil.getSDKVersionStr();
    }

    public static boolean isLibraryPathValid(String str) {
        return false;
    }

    public static void onUpdateNetworkTime(int i, String str) {
        TXLiveBaseListener tXLiveBaseListener = listener;
        if (tXLiveBaseListener != null) {
            tXLiveBaseListener.onUpdateNetworkTime(i, str);
        }
    }

    public static void setAppID(String str) {
        LiveSettingJni.nativeSetAppId(str);
    }

    public static void setAppVersion(String str) {
    }

    public static void setConsoleEnabled(boolean z) {
        LiteavLog.nativeSetConsoleLogEnabled(z);
    }

    public static boolean setExtID(String str, String str2) {
        return LiteavSystemInfo.setExtID(str, str2);
    }

    public static void setExternalDecoderFactory(TXLiteAVExternalDecoderFactoryInterface tXLiteAVExternalDecoderFactoryInterface) {
        LiteavLog.m16901i(TAG, "Set external decoder factory. factory:".concat(String.valueOf(tXLiteAVExternalDecoderFactoryInterface)));
        if (tXLiteAVExternalDecoderFactoryInterface == null) {
            ExternalDecodeFactoryManager.m17220a((C17356n) null);
        } else {
            ExternalDecodeFactoryManager.m17220a(new C19982a(tXLiteAVExternalDecoderFactoryInterface));
        }
    }

    public static int setGlobalEnv(String str) {
        return CommonUtil.setGlobalEnv(str);
    }

    public static void setLibraryPath(String str) {
        C28637q.m38303a(str);
        if (C28637q.m38304a()) {
            CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
    }

    public static void setListener(TXLiveBaseListener tXLiveBaseListener) {
        boolean z = false;
        LiteavLog.setCallback(new C19983b((byte) 0));
        if (tXLiveBaseListener != null) {
            z = true;
        }
        LiteavLog.nativeSetLogCallbackEnabled(z);
        listener = tXLiveBaseListener;
        LicenseChecker.getInstance().setListener(new LicenseChecker.C17167b() {
            /* renamed from: a */
            public final void mo19706a(int i, String str) {
                if (TXLiveBase.listener != null) {
                    TXLiveBase.listener.onLicenceLoaded(i, str);
                }
            }
        });
    }

    public static void setLogLevel(int i) {
        LiteavLog.C17107b bVar = LiteavLog.C17107b.kAll;
        LiteavLog.nativeSetLogLevel((i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? LiteavLog.C17107b.kAll : LiteavLog.C17107b.kNone : LiteavLog.C17107b.kFatal : LiteavLog.C17107b.kError : LiteavLog.C17107b.kWarning : LiteavLog.C17107b.kInfo).mNativeValue);
    }

    public static void setPituLicencePath(String str) {
    }

    public static void setUserId(String str) {
        LiveSettingJni.nativeSetUserId(str);
    }

    public static int updateNetworkTime() {
        return CommonUtil.updateNetworkTime();
    }

    public String getLicenceInfo(Context context) {
        return LicenseChecker.getInstance().getLicense(LicenseChecker.C17170c.LIVE);
    }

    public void setLicence(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        LicenseChecker.getInstance().setLicense(LicenseChecker.C17170c.LIVE, str, str2);
    }

    /* renamed from: com.tencent.rtmp.TXLiveBase$a */
    public static class C19982a implements C17356n {

        /* renamed from: a */
        private TXLiteAVExternalDecoderFactoryInterface f56935a;

        public C19982a(TXLiteAVExternalDecoderFactoryInterface tXLiteAVExternalDecoderFactoryInterface) {
            this.f56935a = tXLiteAVExternalDecoderFactoryInterface;
        }

        /* renamed from: a */
        public final long mo20422a() {
            long CreateHevcDecoder = this.f56935a.CreateHevcDecoder();
            LiteavLog.m16901i("ExternalDecoderWrapper", "Create external hevc decoder. decoder:".concat(String.valueOf(CreateHevcDecoder)));
            return CreateHevcDecoder;
        }

        /* renamed from: a */
        public final void mo20423a(long j) {
            LiteavLog.m16901i("ExternalDecoderWrapper", "Destroy external hevc decoder. handler:".concat(String.valueOf(j)));
            this.f56935a.DestroyHevcDecoder(j);
        }
    }
}
