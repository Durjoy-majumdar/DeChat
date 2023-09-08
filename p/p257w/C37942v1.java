package p257w;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tav.coremedia.TimeUtil;
import gy3.C8480h;
import gy3.C87412m;
import p257w.C37919o;

/* renamed from: w.v1 */
public final class C37942v1<V extends C37919o> implements C37918n1<V> {

    /* renamed from: a */
    public final C37931s1<V> f100387a;

    /* renamed from: b */
    public final C37924q0 f100388b;

    /* renamed from: c */
    public final long f100389c;

    /* renamed from: d */
    public final long f100390d;

    public C37942v1(C37931s1 s1Var, C37924q0 q0Var, long j, C8480h hVar) {
        this.f100387a = s1Var;
        this.f100388b = q0Var;
        this.f100389c = ((long) (s1Var.mo61431e() + s1Var.mo61432f())) * TimeUtil.SECOND_TO_US;
        this.f100390d = j * TimeUtil.SECOND_TO_US;
    }

    /* renamed from: a */
    public boolean mo61417a() {
        return true;
    }

    /* renamed from: b */
    public V mo61418b(long j, V v, V v2, V v3) {
        V v4;
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        V v5 = v3;
        C87412m.m108594g(v5, "initialVelocity");
        C37931s1<V> s1Var = this.f100387a;
        long h = mo61437h(j);
        long j2 = this.f100390d;
        long j3 = this.f100389c;
        if (j + j2 > j3) {
            v4 = mo61419c(j3 - j2, v, v3, v2);
        } else {
            v4 = v5;
        }
        return s1Var.mo61418b(h, v, v2, v4);
    }

    /* renamed from: c */
    public V mo61419c(long j, V v, V v2, V v3) {
        V v4;
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        V v5 = v3;
        C87412m.m108594g(v5, "initialVelocity");
        C37931s1<V> s1Var = this.f100387a;
        long h = mo61437h(j);
        long j2 = this.f100390d;
        long j3 = this.f100389c;
        if (j + j2 > j3) {
            v4 = mo61419c(j3 - j2, v, v3, v2);
        } else {
            v4 = v5;
        }
        return s1Var.mo61419c(h, v, v2, v4);
    }

    /* renamed from: d */
    public long mo61420d(V v, V v2, V v3) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v3, "initialVelocity");
        return MAlarmHandler.NEXT_FIRE_INTERVAL;
    }

    /* renamed from: g */
    public V mo61421g(V v, V v2, V v3) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v3, "initialVelocity");
        mo61420d(v, v2, v3);
        return mo61419c(MAlarmHandler.NEXT_FIRE_INTERVAL, v, v2, v3);
    }

    /* renamed from: h */
    public final long mo61437h(long j) {
        long j2 = this.f100390d;
        if (j + j2 <= 0) {
            return 0;
        }
        long j3 = j + j2;
        long j4 = this.f100389c;
        long j5 = j3 / j4;
        if (this.f100388b != C37924q0.Restart && j5 % ((long) 2) != 0) {
            return ((j5 + 1) * j4) - j3;
        }
        Long.signum(j5);
        return j3 - (j5 * j4);
    }
}
