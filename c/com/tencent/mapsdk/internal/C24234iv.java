package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.iv */
public final class C24234iv extends C24237iy {

    /* renamed from: b */
    private C24235a f69371b;

    /* renamed from: q */
    private long f69372q = -1;

    /* renamed from: com.tencent.mapsdk.internal.iv$a */
    public interface C24235a {
        /* renamed from: a */
        void mo41012a();
    }

    public C24234iv() {
        super((C24211ig) null);
    }

    /* renamed from: a */
    private void m30274a(C24235a aVar) {
        this.f69371b = aVar;
    }

    /* renamed from: a */
    public final void mo41010a(float f) {
    }

    /* renamed from: c */
    public final boolean mo41011c(long j) {
        if (this.f69402j == 0) {
            this.f69402j = 1;
            long j2 = this.f69401i;
            if (j2 < 0) {
                this.f69400h = j;
            } else {
                this.f69400h = j - j2;
                this.f69401i = -1;
            }
        }
        if (this.f69371b == null) {
            return false;
        }
        this.f69372q = j;
        return false;
    }
}
