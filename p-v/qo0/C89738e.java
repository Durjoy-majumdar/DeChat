package qo0;

import ej0.C86525c;
import gy3.C87412m;

/* renamed from: qo0.e */
public final class C89738e {

    /* renamed from: a */
    public final C86525c f258045a;

    /* renamed from: b */
    public boolean f258046b;

    /* renamed from: c */
    public boolean f258047c;

    /* renamed from: d */
    public boolean f258048d;

    public C89738e(C86525c cVar) {
        C87412m.m108594g(cVar, "mrDevice");
        this.f258045a = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C89738e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.video.cast.MRDeviceWithStatus");
        return C87412m.m108589b(this.f258045a, ((C89738e) obj).f258045a);
    }

    public int hashCode() {
        return this.f258045a.hashCode();
    }

    public String toString() {
        return "MRDeviceWithStatus(mrDevice=" + this.f258045a + ", isSelected=" + this.f258046b + ", isConnectSuccess=" + this.f258047c + ", isConnecting=" + this.f258048d + ')';
    }
}
