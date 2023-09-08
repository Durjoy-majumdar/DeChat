package cj1;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: cj1.w5 */
public final class C28594w5 implements Runnable {

    /* renamed from: d */
    public static final C28594w5 f78482d = new C28594w5();

    public final void run() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
        singleMMKV.putBoolean("PARAM_IS_FLOAT", false);
        singleMMKV.commit();
    }
}
