package p001ak;

import p006bk.C54479b;
import p006bk.C54484g;
import p850ek.C58614e;

/* renamed from: ak.d */
public abstract class C54056d<DATA, CONFIG extends C54484g> extends C54053a<DATA, CONFIG> {

    /* renamed from: A */
    public float f151369A = 0.0f;

    /* renamed from: B */
    public float f151370B = -1.0f;

    /* renamed from: C */
    public float[] f151371C = null;

    /* renamed from: D */
    public float f151372D;

    public C54056d(C54479b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo74709a() {
        this.f151365v = false;
        this.f151372D = ((float) ((int) (((float) mo74716g()) + this.f151351h))) / ((float) this.f151347d.f166939a);
    }

    /* renamed from: b */
    public float mo74710b() {
        return this.f151370B + this.f151352i;
    }

    /* renamed from: c */
    public float[] mo74711c(long j) {
        if (!mo74722l()) {
            return null;
        }
        float s = mo74730s(j);
        if (this.f151371C == null) {
            this.f151371C = new float[4];
        }
        this.f151371C[0] = s - C54479b.m61196c().f152759f;
        float[] fArr = this.f151371C;
        float f = this.f151370B;
        fArr[1] = f;
        fArr[2] = s + this.f151351h + this.f151353j;
        fArr[3] = f + this.f151352i;
        return fArr;
    }

    /* renamed from: d */
    public float mo74712d() {
        return this.f151369A;
    }

    /* renamed from: e */
    public float[] mo74713e(long j) {
        if (!mo74722l()) {
            return null;
        }
        float s = mo74730s(j);
        if (this.f151371C == null) {
            this.f151371C = new float[4];
        }
        float[] fArr = this.f151371C;
        fArr[0] = s;
        float f = this.f151370B;
        fArr[1] = f;
        fArr[2] = s + this.f151351h;
        fArr[3] = f + this.f151352i;
        return fArr;
    }

    /* renamed from: f */
    public float mo74715f() {
        return this.f151369A + this.f151351h;
    }

    /* renamed from: h */
    public float mo74717h() {
        return -this.f151372D;
    }

    /* renamed from: i */
    public float mo74719i() {
        return this.f151370B;
    }

    /* renamed from: o */
    public void mo74725o(float f, float f2, long j, long j2) {
        boolean m = mo74723m(j);
        boolean z = false;
        if (!m) {
            C58614e.m68064a("BaseDanmaku", "onLayout, Y = " + f2 + ", danmaku = " + toString());
            this.f151369A = mo74730s(j2);
            if (this.f151354k == 1) {
                z = true;
            }
            if (!z) {
                this.f151370B = f2;
                this.f151354k = 1;
                return;
            }
            return;
        }
        this.f151354k = 0;
    }

    /* renamed from: p */
    public void mo74726p(long j) {
        this.f151369A = mo74730s(j);
    }

    /* renamed from: s */
    public float mo74730s(long j) {
        return ((float) mo74716g()) - (((float) (j - this.f151346c)) * this.f151372D);
    }
}
