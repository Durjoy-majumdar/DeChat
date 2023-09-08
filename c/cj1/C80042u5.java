package cj1;

import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import gy3.C87412m;
import ok1.C62042e;
import p757xv.C91353u;
import z04.C112551y;

/* renamed from: cj1.u5 */
public final class C80042u5 implements Runnable {

    /* renamed from: d */
    public static final C80042u5 f234481d = new C80042u5();

    public final void run() {
        Class cls = C91353u.class;
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
        singleMMKV.putInt("PARAM_THREAD_CNT_IN_PROCESS", ((C91353u) C86312j.m106911c(cls)).mo112627ck());
        singleMMKV.putInt("PARAM_THREAD_CNT_IN_JAVA", ((C91353u) C86312j.m106911c(cls)).mo112630mt());
        String xVar = ((MemoryWatchDog) ((C91353u) C86312j.m106911c(cls)).mo112623CU()).mo118582h(false, 4).toString();
        C87412m.m108593f(xVar, "getService(\n            …CE_CRASH_DUMP).toString()");
        singleMMKV.putString("PARAM_MEM_INFO", C112551y.m153814n(xVar, ",", ";", false));
        Integer O = C62042e.f176370a.mo87029O();
        if (O != null) {
            singleMMKV.putInt("PARAM_LIVING_BATTERY", O.intValue());
        }
        singleMMKV.commit();
    }
}
