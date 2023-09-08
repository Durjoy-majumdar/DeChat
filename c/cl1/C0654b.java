package cl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: cl1.b */
public final class C0654b extends C39970c<C45795b> {

    /* renamed from: f */
    public boolean f1544f;

    /* renamed from: g */
    public String f1545g = "";

    /* renamed from: h */
    public String f1546h = "";

    /* renamed from: i */
    public int f1547i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0654b(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001b  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo623c3() {
        /*
            r4 = this;
            c50.b r0 = c50.C54655b.f153178f1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 != 0) goto L_0x0017
            i50.a r0 = i50.C60251a.f171781k1
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x001b
            return r2
        L_0x001b:
            boolean r0 = r4.f1544f
            if (r0 == 0) goto L_0x003b
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r3 = r4.f1545g
            com.tencent.mm.storage.z1 r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.mo62927s3()
            if (r0 != r2) goto L_0x0051
            r1 = 1
            goto L_0x0051
        L_0x003b:
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.p1 r0 = (tf0.C64916p1) r0
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r4.business(r1)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
            boolean r1 = r0.mo76650AV(r1)
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C0654b.mo623c3():boolean");
    }

    /* renamed from: d3 */
    public final void mo624d3(boolean z, String str, String str2, int i) {
        boolean z2 = false;
        if (!(str == null || str.length() == 0)) {
            if (str == null) {
                str = "";
            }
            this.f1545g = str;
            if (z) {
                this.f1544f = z;
            }
        }
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            if (str2 == null) {
                str2 = "";
            }
            this.f1546h = str2;
        }
        if (i != 0) {
            this.f1547i = i;
        }
    }

    public void onCleared() {
        Log.m105924i("BizModeSlice", "#onCleared");
        this.f1544f = false;
        this.f1545g = "";
        this.f1546h = "";
        this.f1547i = 0;
    }
}
