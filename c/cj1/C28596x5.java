package cj1;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: cj1.x5 */
public final class C28596x5 implements Runnable {

    /* renamed from: d */
    public static final C28596x5 f78484d = new C28596x5();

    public final void run() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
        singleMMKV.putBoolean("PARAM_IS_FOREGROUND", false);
        singleMMKV.commit();
    }
}
