package cj1;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: cj1.a6 */
public final class C28567a6 {

    /* renamed from: a */
    public static final C28567a6 f78431a = new C28567a6();

    /* renamed from: a */
    public static final void m38271a(C28567a6 a6Var) {
        a6Var.getClass();
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
        singleMMKV.putString("crashStack", "");
        singleMMKV.putLong("PARAM_LIVE_ID", 0);
        singleMMKV.putString("PARAM_MEM_INFO", "");
        singleMMKV.putInt("PARAM_LIVING_BATTERY", 0);
        singleMMKV.putBoolean("PARAM_IS_FOREGROUND", false);
        singleMMKV.putBoolean("PARAM_IS_FLOAT", false);
        singleMMKV.putInt("PARAM_THREAD_CNT_IN_PROCESS", 0);
        singleMMKV.putInt("PARAM_THREAD_CNT_IN_JAVA", 0);
        singleMMKV.putBoolean("PARAM_IS_SCREEN_OFF", false);
        singleMMKV.putString("PARAM_MEM_INFO", "");
        singleMMKV.commit();
    }
}
