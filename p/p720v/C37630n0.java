package p720v;

import com.google.android.gms.common.internal.Constants;
import com.tencent.tav.coremedia.TimeUtil;
import gy3.C87412m;
import p257w.C37896d0;
import p560i2.C108322d;
import p720v.C37624e0;

/* renamed from: v.n0 */
public final class C37630n0 implements C37896d0 {

    /* renamed from: a */
    public final C37624e0 f99770a;

    public C37630n0(C108322d dVar) {
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        this.f99770a = new C37624e0(C111281o0.f333194a, dVar);
    }

    /* renamed from: a */
    public float mo61249a() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo61250b(float f, float f2) {
        C37624e0 e0Var = this.f99770a;
        double b = e0Var.mo61239b(f2);
        double d = (double) C37626f0.f99761a;
        return f + (((float) (((double) (e0Var.f99755a * e0Var.f99757c)) * Math.exp((d / (d - 1.0d)) * b))) * Math.signum(f2));
    }

    /* renamed from: c */
    public float mo61251c(long j, float f, float f2) {
        long j2 = j / TimeUtil.SECOND_TO_US;
        C37624e0.C37625a a = this.f99770a.mo61238a(f2);
        long j3 = a.f99760c;
        return f + (a.f99759b * Math.signum(a.f99758a) * C37621a.f99749a.mo61231a(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).f99751a);
    }

    /* renamed from: d */
    public float mo61252d(long j, float f, float f2) {
        long j2 = j / TimeUtil.SECOND_TO_US;
        C37624e0.C37625a a = this.f99770a.mo61238a(f2);
        long j3 = a.f99760c;
        return (((C37621a.f99749a.mo61231a(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).f99752b * Math.signum(a.f99758a)) * a.f99759b) / ((float) a.f99760c)) * 1000.0f;
    }

    /* renamed from: e */
    public long mo61253e(float f, float f2) {
        return ((long) (Math.exp(this.f99770a.mo61239b(f2) / (((double) C37626f0.f99761a) - 1.0d)) * 1000.0d)) * TimeUtil.SECOND_TO_US;
    }
}
