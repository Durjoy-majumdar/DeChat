package com.tencent.p014mm.plugin.appbrand.utils;

import android.util.Log;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import jp3.C9486a;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.o1 */
public final class C29678o1 implements Runnable, C9486a {

    /* renamed from: d */
    public final C2032a1<? super C9486a> f80633d;

    /* renamed from: e */
    public final Runnable f80634e;

    /* renamed from: f */
    public final String f80635f;

    /* renamed from: g */
    public final AtomicBoolean f80636g = new AtomicBoolean(false);

    public C29678o1(C2032a1<? super C9486a> a1Var, Runnable runnable, String str) {
        C87412m.m108594g(a1Var, "mRegistry");
        this.f80633d = a1Var;
        this.f80634e = runnable;
        this.f80635f = str;
    }

    /* renamed from: a */
    public static final C29678o1 m38854a(C2032a1<? super C9486a> a1Var, Runnable runnable) {
        C87412m.m108594g(a1Var, "registry");
        if (runnable instanceof C29678o1) {
            runnable = ((C29678o1) runnable).f80634e;
        }
        String stackTraceString = Log.getStackTraceString(new Throwable());
        C87412m.m108593f(stackTraceString, "getStackTraceString(Throwable())");
        C29678o1 o1Var = new C29678o1(a1Var, runnable, stackTraceString);
        a1Var.keep(o1Var);
        return o1Var;
    }

    public void dead() {
        this.f80636g.set(true);
    }

    public void run() {
        if (!this.f80636g.get()) {
            try {
                Runnable runnable = this.f80634e;
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                this.f80633d.mo1963B7(this);
            }
        } else {
            com.tencent.p014mm.sdk.platformtools.Log.m105928w("Luggage.WXA.LifeCycleWrappedRunnable", "run() but dead, <init> stackTrace = " + this.f80635f);
        }
    }

    public String toString() {
        return "[LifeCycleWrappedRunnable]" + this.f80634e;
    }
}
