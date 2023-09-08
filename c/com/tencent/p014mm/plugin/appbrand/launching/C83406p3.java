package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.Callable;
import lu3.C88655f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.p3 */
public final class C83406p3 implements Callable<Object>, C88655f {

    /* renamed from: d */
    public final /* synthetic */ C83448q3 f243706d;

    public C83406p3(C83448q3 q3Var) {
        this.f243706d = q3Var;
    }

    public Object call() {
        this.f243706d.f243857d = Util.nowMilliSecond();
        try {
            return this.f243706d.call();
        } finally {
            this.f243706d.f243858e = Util.nowMilliSecond();
            C83448q3 q3Var = this.f243706d;
            q3Var.f243859f = q3Var.f243858e - this.f243706d.f243857d;
        }
    }

    public String getKey() {
        return this.f243706d.mo115591f();
    }
}
