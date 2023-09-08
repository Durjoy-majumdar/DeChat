package p502e0;

import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import p1166z0.C112545k;
import p436a1.C103237h0;
import p436a1.C103266t0;
import p560i2.C108322d;
import p560i2.C33183o;

/* renamed from: e0.a */
public abstract class C107071a implements C103266t0 {

    /* renamed from: a */
    public final C31353b f320489a;

    /* renamed from: b */
    public final C31353b f320490b;

    /* renamed from: c */
    public final C31353b f320491c;

    /* renamed from: d */
    public final C31353b f320492d;

    public C107071a(C31353b bVar, C31353b bVar2, C31353b bVar3, C31353b bVar4) {
        C87412m.m108594g(bVar, "topStart");
        C87412m.m108594g(bVar2, "topEnd");
        C87412m.m108594g(bVar3, "bottomEnd");
        C87412m.m108594g(bVar4, "bottomStart");
        this.f320489a = bVar;
        this.f320490b = bVar2;
        this.f320491c = bVar3;
        this.f320492d = bVar4;
    }

    /* renamed from: a */
    public final C103237h0 mo143025a(long j, C33183o oVar, C108322d dVar) {
        C87412m.m108594g(oVar, "layoutDirection");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        float a = this.f320489a.mo58085a(j, dVar);
        float a2 = this.f320490b.mo58085a(j, dVar);
        float a3 = this.f320491c.mo58085a(j, dVar);
        float a4 = this.f320492d.mo58085a(j, dVar);
        float c = C112545k.m153757c(j);
        float f = a + a4;
        if (f > c) {
            float f2 = c / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a4;
        float f4 = a2 + a3;
        if (f4 > c) {
            float f5 = c / f4;
            a2 *= f5;
            a3 *= f5;
        }
        if (a >= 0.0f && a2 >= 0.0f && a3 >= 0.0f && f3 >= 0.0f) {
            return mo157521b(j, a, a2, a3, f3, oVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + f3 + ")!").toString());
    }

    /* renamed from: b */
    public abstract C103237h0 mo157521b(long j, float f, float f2, float f3, float f4, C33183o oVar);
}
