package p267x;

import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import p1166z0.C112541g;
import p1166z0.C112545k;
import p436a1.C103237h0;
import p436a1.C103266t0;
import p560i2.C108319b;
import p560i2.C108322d;
import p560i2.C33183o;
import p721v0.C65503j;
import p868x0.C111979d;

/* renamed from: x.d2 */
public final class C111902d2 {

    /* renamed from: a */
    public static final float f335011a = ((float) 30);

    /* renamed from: b */
    public static final C65503j f335012b;

    /* renamed from: c */
    public static final C65503j f335013c;

    /* renamed from: x.d2$a */
    public static final class C111903a implements C103266t0 {
        /* renamed from: a */
        public C103237h0 mo143025a(long j, C33183o oVar, C108322d dVar) {
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
            float M = (float) dVar.mo143032M(C111902d2.f335011a);
            return new C103237h0.C103238b(new C112541g(0.0f, -M, C112545k.m153758d(j), C112545k.m153756b(j) + M));
        }
    }

    /* renamed from: x.d2$b */
    public static final class C111904b implements C103266t0 {
        /* renamed from: a */
        public C103237h0 mo143025a(long j, C33183o oVar, C108322d dVar) {
            C87412m.m108594g(oVar, "layoutDirection");
            C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
            float M = (float) dVar.mo143032M(C111902d2.f335011a);
            return new C103237h0.C103238b(new C112541g(-M, 0.0f, C112545k.m153758d(j) + M, C112545k.m153756b(j)));
        }
    }

    static {
        int i = C65503j.f188489K0;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        f335012b = C111979d.m152690a(aVar, new C111903a());
        f335013c = C111979d.m152690a(aVar, new C111904b());
    }

    /* renamed from: a */
    public static final void m152624a(long j, boolean z) {
        boolean z2 = true;
        if (z) {
            if (C108319b.m146696g(j) == Integer.MAX_VALUE) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (C108319b.m146697h(j) == Integer.MAX_VALUE) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }
}
