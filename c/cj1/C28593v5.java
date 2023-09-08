package cj1;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: cj1.v5 */
public final class C28593v5 implements Runnable {

    /* renamed from: d */
    public static final C28593v5 f78481d = new C28593v5();

    public final void run() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
        singleMMKV.putBoolean("PARAM_IS_FLOAT", true);
        singleMMKV.commit();
    }
}
