package p267x;

import com.tencent.xweb.util.WXWebReporter;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112535a;
import p1166z0.C112545k;
import p436a1.C103257q;
import p436a1.C103274x;
import p835c1.C104230e;
import p835c1.C104231f;
import p835c1.C104233g;
import p835c1.C104237k;
import p835c1.C54601d;
import rx3.C13598b0;

/* renamed from: x.i */
public final class C111917i extends C87413o implements C32226l<C54601d, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f335037d;

    /* renamed from: e */
    public final /* synthetic */ C103257q f335038e;

    /* renamed from: f */
    public final /* synthetic */ long f335039f;

    /* renamed from: g */
    public final /* synthetic */ float f335040g;

    /* renamed from: h */
    public final /* synthetic */ float f335041h;

    /* renamed from: i */
    public final /* synthetic */ long f335042i;

    /* renamed from: j */
    public final /* synthetic */ long f335043j;

    /* renamed from: n */
    public final /* synthetic */ C104237k f335044n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111917i(boolean z, C103257q qVar, long j, float f, float f2, long j2, long j3, C104237k kVar) {
        super(1);
        this.f335037d = z;
        this.f335038e = qVar;
        this.f335039f = j;
        this.f335040g = f;
        this.f335041h = f2;
        this.f335042i = j2;
        this.f335043j = j3;
        this.f335044n = kVar;
    }

    public Object invoke(Object obj) {
        C54601d dVar = (C54601d) obj;
        C87412m.m108594g(dVar, "$this$onDrawWithContent");
        dVar.mo75508h0();
        if (this.f335037d) {
            C104231f.C104232a.m139088g(dVar, this.f335038e, 0, 0, this.f335039f, 0.0f, (C104233g) null, (C103274x) null, 0, WXWebReporter.KEY_NEW_FAILED_CANT_FIX, (Object) null);
        } else {
            float b = C112535a.m153728b(this.f335039f);
            float f = this.f335040g;
            if (b < f) {
                float f2 = this.f335041h;
                float d = C112545k.m153758d(dVar.mo145819e()) - this.f335041h;
                float b2 = C112545k.m153756b(dVar.mo145819e()) - this.f335041h;
                C103257q qVar = this.f335038e;
                long j = this.f335039f;
                C104230e B = dVar.mo145815B();
                long e = B.mo145834e();
                B.mo145835i().mo142944c();
                B.mo145836j().mo145838a(f2, f2, d, b2, 0);
                C104231f.C104232a.m139088g(dVar, qVar, 0, 0, j, 0.0f, (C104233g) null, (C103274x) null, 0, WXWebReporter.KEY_NEW_FAILED_CANT_FIX, (Object) null);
                B.mo145835i().mo142943b();
                B.mo145837k(e);
            } else {
                C104231f.C104232a.m139088g(dVar, this.f335038e, this.f335042i, this.f335043j, C111923k.m152634a(this.f335039f, f), 0.0f, this.f335044n, (C103274x) null, 0, 208, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
