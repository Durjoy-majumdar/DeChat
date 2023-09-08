package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.it */
public final class C24229it extends C24237iy {

    /* renamed from: b */
    public int f69359b;

    private C24229it(C24211ig igVar) {
        super(igVar);
    }

    /* renamed from: a */
    private void m30236a(int i) {
        C24230iu[] iuVarArr = this.f69403k;
        if (iuVarArr != null) {
            C24230iu iuVar = iuVarArr[0];
            this.f69404l.remove(Integer.valueOf(iuVar.f69362a));
            this.f69404l.put(Integer.valueOf(i), iuVar);
        }
        this.f69359b = i;
    }

    /* renamed from: e */
    private C24229it m30237e(long j) {
        super.mo40967b(j);
        return this;
    }

    /* renamed from: o */
    private int m30238o() {
        return this.f69359b;
    }

    /* renamed from: p */
    private C24211ig m30239p() {
        return this.f69405m;
    }

    /* renamed from: q */
    private C24229it m30240q() {
        return (C24229it) super.clone();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C24212ij mo40967b(long j) {
        super.mo40967b(j);
        return this;
    }

    public final /* synthetic */ Object clone() {
        return (C24229it) super.clone();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C24212ij mo40976h() {
        return (C24229it) super.clone();
    }

    public final String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f69405m;
        if (this.f69403k != null) {
            for (int i = 0; i < this.f69403k.length; i++) {
                str = str + "\n    " + this.f69403k[i].toString();
            }
        }
        return str;
    }

    private C24229it(C24211ig igVar, int i) {
        super(igVar);
        C24230iu[] iuVarArr = this.f69403k;
        if (iuVarArr != null) {
            C24230iu iuVar = iuVarArr[0];
            this.f69404l.remove(Integer.valueOf(iuVar.f69362a));
            this.f69404l.put(Integer.valueOf(i), iuVar);
        }
        this.f69359b = i;
    }

    /* renamed from: a */
    public static C24229it m30234a(C24211ig igVar, int... iArr) {
        C24229it itVar = new C24229it(igVar, 0);
        itVar.mo40997a(iArr);
        return itVar;
    }

    /* renamed from: a */
    public static C24229it m30232a(C24211ig igVar, int i, double... dArr) {
        C24229it itVar = new C24229it(igVar, i);
        itVar.mo40996a(dArr);
        return itVar;
    }

    /* renamed from: a */
    public static C24229it m30233a(C24211ig igVar, C24236ix ixVar, Object[] objArr) {
        C24229it itVar = new C24229it(igVar, 1);
        itVar.mo40998a(objArr);
        itVar.mo41014a((C24236ix<?>) ixVar);
        return itVar;
    }

    /* renamed from: a */
    private static C24229it m30235a(C24211ig igVar, C24230iu... iuVarArr) {
        C24229it itVar = new C24229it(igVar);
        itVar.mo41015a(iuVarArr);
        return itVar;
    }

    /* renamed from: a */
    public final void mo40997a(int... iArr) {
        C24230iu[] iuVarArr = this.f69403k;
        if (iuVarArr == null || iuVarArr.length == 0) {
            mo41015a(C24230iu.m30247a(this.f69359b, iArr));
            return;
        }
        super.mo40997a(iArr);
    }

    /* renamed from: a */
    public final void mo40996a(double... dArr) {
        C24230iu[] iuVarArr = this.f69403k;
        if (iuVarArr == null || iuVarArr.length == 0) {
            mo41015a(C24230iu.m30246a(this.f69359b, dArr));
            return;
        }
        super.mo40996a(dArr);
    }

    /* renamed from: a */
    public final void mo40998a(Object... objArr) {
        C24230iu[] iuVarArr = this.f69403k;
        if (iuVarArr == null || iuVarArr.length == 0) {
            mo41015a(C24230iu.m30249a(this.f69359b, objArr));
            return;
        }
        super.mo40998a(objArr);
    }
}
