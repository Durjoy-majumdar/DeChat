package com.tencent.p014mm.plugin.appbrand.utils;

import android.system.ErrnoException;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.h */
public class C84741h implements Runnable, C84774n2 {

    /* renamed from: d */
    public final Runnable f247141d;

    /* renamed from: e */
    public final String f247142e;

    public C84741h(Runnable runnable) {
        this.f247141d = runnable;
        this.f247142e = null;
    }

    /* renamed from: a */
    public String mo117460a() {
        return this.f247142e;
    }

    public void run() {
        try {
            this.f247141d.run();
        } catch (Throwable th) {
            if (!(th instanceof ErrnoException)) {
                Log.printErrStackTrace("MicroMsg.AccountScopedRunnable", th, "caught exception inside AccountScopedRunnable", new Object[0]);
                if (C86709a0.m107523b().f251765p && C86709a0.m107522a()) {
                    throw th;
                }
            }
        }
    }

    public C84741h(Runnable runnable, String str) {
        this.f247141d = runnable;
        this.f247142e = str;
    }
}
