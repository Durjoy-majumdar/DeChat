package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.Callable;
import lu3.C88655f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.q3 */
public abstract class C83448q3<T> implements Callable<T>, C88655f, C83404p1 {

    /* renamed from: d */
    public volatile long f243857d = 0;

    /* renamed from: e */
    public volatile long f243858e = 0;

    /* renamed from: f */
    public volatile long f243859f = 0;

    /* renamed from: g */
    public boolean f243860g = true;

    /* renamed from: d */
    public boolean mo115519d() {
        return this.f243860g;
    }

    /* renamed from: e */
    public final T mo115732e() {
        this.f243857d = Util.nowMilliSecond();
        try {
            return call();
        } finally {
            this.f243858e = Util.nowMilliSecond();
            this.f243859f = this.f243858e - this.f243857d;
        }
    }

    /* renamed from: f */
    public abstract String mo115591f();

    /* renamed from: g */
    public void mo115733g(boolean z) {
        this.f243860g = z;
    }

    public final String getKey() {
        return mo115591f();
    }
}
