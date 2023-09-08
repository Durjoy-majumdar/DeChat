package com.tencent.p014mm.plugin.appbrand.utils;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.x0 */
public class C84792x0 {

    /* renamed from: a */
    public long f247220a;

    /* renamed from: b */
    public long f247221b;

    /* renamed from: c */
    public C84793a f247222c;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.x0$a */
    public interface C84793a {
        /* renamed from: a */
        boolean mo117508a(Object... objArr);
    }

    public C84792x0(long j, C84793a aVar) {
        this.f247220a = j;
        this.f247222c = aVar;
    }

    /* renamed from: a */
    public boolean mo117507a(Object... objArr) {
        C84793a aVar;
        if ((System.currentTimeMillis() - this.f247221b < this.f247220a) || (aVar = this.f247222c) == null) {
            return false;
        }
        boolean a = aVar.mo117508a(objArr);
        if (a) {
            this.f247221b = System.currentTimeMillis();
        }
        return a;
    }
}
