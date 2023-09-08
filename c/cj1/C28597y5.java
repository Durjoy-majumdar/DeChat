package cj1;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: cj1.y5 */
public final class C28597y5 implements Runnable {

    /* renamed from: d */
    public static final C28597y5 f78485d = new C28597y5();

    public final void run() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
        singleMMKV.putBoolean("PARAM_IS_FOREGROUND", true);
        singleMMKV.commit();
    }
}
