package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.o */
public final class C23907o implements C23809a3 {

    /* renamed from: a */
    public final C23897n f68504a;

    public C23907o(C23897n nVar) {
        Charset charset = C23908o0.f68505a;
        if (nVar != null) {
            this.f68504a = nVar;
            nVar.f68488a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* renamed from: a */
    public void mo37953a(int i, boolean z) {
        this.f68504a.mo37897D(i, z);
    }

    /* renamed from: b */
    public void mo37954b(int i, C16994k kVar) {
        this.f68504a.mo37899F(i, kVar);
    }

    /* renamed from: c */
    public void mo37955c(int i, List<C16994k> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f68504a.mo37899F(i, list.get(i2));
        }
    }

    /* renamed from: d */
    public void mo37956d(int i, double d) {
        this.f68504a.mo37901H(i, d);
    }

    /* renamed from: e */
    public void mo37957e(int i) {
        this.f68504a.mo37916W(i, 4);
    }

    /* renamed from: f */
    public void mo37958f(int i, int i2) {
        this.f68504a.mo37907N(i, i2);
    }

    /* renamed from: g */
    public void mo37959g(int i, int i2) {
        this.f68504a.mo37902I(i, i2);
    }

    /* renamed from: h */
    public void mo37960h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f68504a.mo37916W(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                Logger logger = C23897n.f68486b;
                i3 += 4;
            }
            this.f68504a.mo37918Y(i3);
            while (i2 < list.size()) {
                this.f68504a.mo37903J(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f68504a.mo37902I(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public void mo37961i(int i, long j) {
        this.f68504a.mo37904K(i, j);
    }

    /* renamed from: j */
    public void mo37962j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f68504a.mo37916W(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                Logger logger = C23897n.f68486b;
                i3 += 8;
            }
            this.f68504a.mo37918Y(i3);
            while (i2 < list.size()) {
                this.f68504a.mo37905L(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f68504a.mo37904K(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: k */
    public void mo37963k(int i, float f) {
        this.f68504a.mo37906M(i, f);
    }

    /* renamed from: l */
    public void mo37964l(int i, Object obj, C23828f2 f2Var) {
        C23897n nVar = this.f68504a;
        nVar.mo37916W(i, 3);
        f2Var.mo37611c((C23845j1) obj, nVar.f68488a);
        nVar.mo37916W(i, 4);
    }

    /* renamed from: m */
    public void mo37965m(int i, int i2) {
        this.f68504a.mo37907N(i, i2);
    }

    /* renamed from: n */
    public void mo37966n(int i, long j) {
        this.f68504a.mo37919Z(i, j);
    }

    /* renamed from: o */
    public void mo37967o(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f68504a.mo37916W(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C23897n.m29281z(list.get(i4).longValue());
            }
            this.f68504a.mo37918Y(i3);
            while (i2 < list.size()) {
                this.f68504a.mo37920a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f68504a.mo37919Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: p */
    public void mo37968p(int i, Object obj, C23828f2 f2Var) {
        this.f68504a.mo37910Q(i, (C23845j1) obj, f2Var);
    }

    /* renamed from: q */
    public final void mo37969q(int i, Object obj) {
        if (obj instanceof C16994k) {
            this.f68504a.mo37913T(i, (C16994k) obj);
        } else {
            this.f68504a.mo37912S(i, (C23845j1) obj);
        }
    }

    /* renamed from: r */
    public void mo37970r(int i, int i2) {
        this.f68504a.mo37902I(i, i2);
    }

    /* renamed from: s */
    public void mo37971s(int i, long j) {
        this.f68504a.mo37904K(i, j);
    }

    /* renamed from: t */
    public void mo37972t(int i, int i2) {
        this.f68504a.mo37917X(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: u */
    public void mo37973u(int i, long j) {
        this.f68504a.mo37919Z(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: v */
    public void mo37974v(int i) {
        this.f68504a.mo37916W(i, 3);
    }

    /* renamed from: w */
    public void mo37975w(int i, int i2) {
        this.f68504a.mo37917X(i, i2);
    }

    /* renamed from: x */
    public void mo37976x(int i, long j) {
        this.f68504a.mo37919Z(i, j);
    }
}
