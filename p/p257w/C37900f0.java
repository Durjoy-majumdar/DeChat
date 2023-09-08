package p257w;

import com.tencent.tav.coremedia.TimeUtil;
import gy3.C87412m;
import my3.C61595o;

/* renamed from: w.f0 */
public final class C37900f0 implements C37894c0 {

    /* renamed from: a */
    public final int f100311a;

    /* renamed from: b */
    public final int f100312b;

    /* renamed from: c */
    public final C37950z f100313c;

    public C37900f0(int i, int i2, C37950z zVar) {
        C87412m.m108594g(zVar, "easing");
        this.f100311a = i;
        this.f100312b = i2;
        this.f100313c = zVar;
    }

    /* renamed from: a */
    public C37918n1 mo61393a(C37906k1 k1Var) {
        C87412m.m108594g(k1Var, "converter");
        return new C37935t1((C37894c0) this);
    }

    /* renamed from: b */
    public float mo61389b(long j, float f, float f2, float f3) {
        long f4 = C61595o.m72298f((j / TimeUtil.SECOND_TO_US) - ((long) this.f100312b), 0, (long) this.f100311a);
        int i = (f4 > 0 ? 1 : (f4 == 0 ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (mo61392e(f4 * TimeUtil.SECOND_TO_US, f, f2, f3) - mo61392e((f4 - 1) * TimeUtil.SECOND_TO_US, f, f2, f3)) * 1000.0f;
    }

    /* renamed from: c */
    public long mo61390c(float f, float f2, float f3) {
        return ((long) (this.f100312b + this.f100311a)) * TimeUtil.SECOND_TO_US;
    }

    /* renamed from: d */
    public float mo61391d(float f, float f2, float f3) {
        return mo61389b(mo61390c(f, f2, f3), f, f2, f3);
    }

    /* renamed from: e */
    public float mo61392e(long j, float f, float f2, float f3) {
        long f4 = C61595o.m72298f((j / TimeUtil.SECOND_TO_US) - ((long) this.f100312b), 0, (long) this.f100311a);
        int i = this.f100311a;
        float a = this.f100313c.mo61380a(C61595o.m72296d(i == 0 ? 1.0f : ((float) f4) / ((float) i), 0.0f, 1.0f));
        C37906k1<Float, C37907l> k1Var = C111656m1.f334256a;
        return (f * (((float) 1) - a)) + (f2 * a);
    }
}
