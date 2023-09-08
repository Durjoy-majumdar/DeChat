package p396x6;

import com.google.android.exoplayer2.Format;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import p333e8.C20528a;
import p333e8.C20535i;
import p370p7.C21957r;
import p404z6.C23455e;

/* renamed from: x6.a */
public abstract class C22993a implements C23019q, C23020r {

    /* renamed from: d */
    public final int f66062d;

    /* renamed from: e */
    public C23021s f66063e;

    /* renamed from: f */
    public int f66064f;

    /* renamed from: g */
    public int f66065g;

    /* renamed from: h */
    public C21957r f66066h;

    /* renamed from: i */
    public long f66067i;

    /* renamed from: j */
    public boolean f66068j = true;

    /* renamed from: n */
    public boolean f66069n;

    public C22993a(int i) {
        this.f66062d = i;
    }

    public final void disable() {
        boolean z = true;
        if (this.f66065g != 1) {
            z = false;
        }
        C20528a.m22240d(z);
        this.f66065g = 0;
        this.f66066h = null;
        this.f66069n = false;
        mo32386t();
    }

    /* renamed from: e */
    public void mo32384e(int i, Object obj) {
    }

    /* renamed from: f */
    public final void mo36235f(C23021s sVar, Format[] formatArr, C21957r rVar, long j, boolean z, long j2) {
        C20528a.m22240d(this.f66065g == 0);
        this.f66063e = sVar;
        this.f66065g = 1;
        mo32387u(z);
        mo36246s(formatArr, rVar, j2);
        mo32388v(j, z);
    }

    public final int getState() {
        return this.f66065g;
    }

    /* renamed from: h */
    public final void mo36237h() {
        this.f66069n = true;
    }

    /* renamed from: i */
    public final void mo36238i() {
        this.f66066h.mo34997c();
    }

    /* renamed from: j */
    public final int mo36239j() {
        return this.f66062d;
    }

    /* renamed from: k */
    public final C23020r mo36240k() {
        return this;
    }

    /* renamed from: l */
    public int mo33312l() {
        return 0;
    }

    /* renamed from: m */
    public final boolean mo36241m() {
        return this.f66068j;
    }

    /* renamed from: n */
    public final boolean mo36242n() {
        return this.f66069n;
    }

    /* renamed from: o */
    public final C21957r mo36243o() {
        return this.f66066h;
    }

    /* renamed from: p */
    public final void mo36244p(long j) {
        this.f66069n = false;
        this.f66068j = false;
        mo32388v(j, false);
    }

    /* renamed from: q */
    public C20535i mo36245q() {
        return null;
    }

    /* renamed from: s */
    public final void mo36246s(Format[] formatArr, C21957r rVar, long j) {
        C20528a.m22240d(!this.f66069n);
        this.f66066h = rVar;
        this.f66068j = false;
        this.f66067i = j;
        mo32391y(formatArr, j);
    }

    public final void setIndex(int i) {
        this.f66064f = i;
    }

    public final void start() {
        boolean z = true;
        if (this.f66065g != 1) {
            z = false;
        }
        C20528a.m22240d(z);
        this.f66065g = 2;
        mo32389w();
    }

    public final void stop() {
        C20528a.m22240d(this.f66065g == 2);
        this.f66065g = 1;
        mo32390x();
    }

    /* renamed from: t */
    public abstract void mo32386t();

    /* renamed from: u */
    public void mo32387u(boolean z) {
    }

    /* renamed from: v */
    public abstract void mo32388v(long j, boolean z);

    /* renamed from: w */
    public void mo32389w() {
    }

    /* renamed from: x */
    public void mo32390x() {
    }

    /* renamed from: y */
    public void mo32391y(Format[] formatArr, long j) {
    }

    /* renamed from: z */
    public final int mo36250z(C23010j jVar, C23455e eVar, boolean z) {
        C23010j jVar2 = jVar;
        C23455e eVar2 = eVar;
        int a = this.f66066h.mo34995a(jVar2, eVar2, z);
        if (a == -4) {
            if (eVar2.mo36910g(4)) {
                this.f66068j = true;
                return this.f66069n ? -4 : -3;
            }
            eVar2.f67261g += this.f66067i;
        } else if (a == -5) {
            Format format = jVar2.f66173a;
            long j = format.f45767C;
            if (j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                jVar2.f66173a = new Format(format.f45772d, format.f45776h, format.f45777i, format.f45774f, format.f45773e, format.f45778j, format.f45781p, format.f45782q, format.f45783r, format.f45784s, format.f45785t, format.f45787v, format.f45786u, format.f45788w, format.f45789x, format.f45790y, format.f45791z, format.f45765A, format.f45766B, format.f45768D, format.f45769E, format.f45770F, j + this.f66067i, format.f45779n, format.f45780o, format.f45775g);
            }
        }
        return a;
    }
}
