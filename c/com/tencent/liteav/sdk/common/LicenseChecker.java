package com.tencent.liteav.sdk.common;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C28637q;

@JNINamespace("liteav::license")
public class LicenseChecker {
    private C17167b mLicenceCheckListener;

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$b */
    public interface C17167b {
        /* renamed from: a */
        void mo19706a(int i, String str);
    }

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$d */
    public static class C17168d {

        /* renamed from: a */
        public static LicenseChecker f46363a = new LicenseChecker();
    }

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$a */
    public enum C17169a {
        PUSHER(1),
        UGC_SIMPLE(2),
        UGC_STANDARD(4),
        PITU_SIMPLE(8),
        PITU(16),
        PLAYER_STANDARD(32),
        PLAYER_MONET(64);
        
        public int value;

        private C17169a(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.tencent.liteav.sdk.common.LicenseChecker$c */
    public enum C17170c {
        LIVE,
        UGC
    }

    static {
        C28637q.m38304a();
    }

    public static LicenseChecker getInstance() {
        return C17168d.f46363a;
    }

    private static native String nativeGetAppId();

    private static native String nativeGetKey(int i);

    private static native String nativeGetLicense(int i);

    private static native void nativeSetClient(LicenseChecker licenseChecker);

    private static native boolean nativeSetLicense(int i, String str, String str2);

    private static native boolean nativeValid(int i);

    public void OnResult(int i, String str) {
        C17167b bVar = this.mLicenceCheckListener;
        if (bVar != null) {
            bVar.mo19706a(i, str);
        }
    }

    public String getAppId() {
        return nativeGetAppId();
    }

    public String getKey(C17170c cVar) {
        return nativeGetKey(cVar.ordinal());
    }

    public String getLicense(C17170c cVar) {
        return nativeGetLicense(cVar.ordinal());
    }

    public boolean setLicense(C17170c cVar, String str, String str2) {
        return nativeSetLicense(cVar.ordinal(), str, str2);
    }

    public void setListener(C17167b bVar) {
        this.mLicenceCheckListener = bVar;
        if (bVar != null) {
            nativeSetClient(this);
        }
    }

    public boolean valid(C17169a aVar) {
        return nativeValid(aVar.value);
    }
}
