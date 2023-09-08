package vb2;

import a14.C0000n0;
import a14.C53965x0;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import iy3.C60641c;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.widget.RangeSliderView$repeatDrag$1", mo125469f = "RangeSliderView.kt", mo125470l = {177}, mo125471m = "invokeSuspend")
/* renamed from: vb2.h */
public final class C65579h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f188700d;

    /* renamed from: e */
    public final /* synthetic */ RangeSliderView f188701e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f188702f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65579h(RangeSliderView rangeSliderView, C8478d0 d0Var, C15601d<? super C65579h> dVar) {
        super(2, dVar);
        this.f188701e = rangeSliderView;
        this.f188702f = d0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65579h(this.f188701e, this.f188702f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65579h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i2 = this.f188700d;
        if (i2 == 0 || i2 == 1) {
            ResultKt.throwOnFailure(obj);
            do {
                RangeSliderView rangeSliderView = this.f188701e;
                float f = rangeSliderView.f163748G;
                Float upper = rangeSliderView.f163742A.getUpper();
                C87412m.m108593f(upper, "dragRange.upper");
                if (f > upper.floatValue()) {
                    RangeSliderView rangeSliderView2 = this.f188701e;
                    float f2 = rangeSliderView2.f163748G;
                    Float upper2 = rangeSliderView2.f163742A.getUpper();
                    C87412m.m108593f(upper2, "dragRange.upper");
                    i = C60641c.m70921b(f2 - upper2.floatValue());
                } else {
                    RangeSliderView rangeSliderView3 = this.f188701e;
                    float f3 = rangeSliderView3.f163748G;
                    Float lower = rangeSliderView3.f163742A.getLower();
                    C87412m.m108593f(lower, "dragRange.lower");
                    i = C60641c.m70921b(f3 - lower.floatValue());
                }
                this.f188701e.mo80697b(this.f188702f.f27483d + i, true);
                this.f188702f.f27483d += i;
                this.f188700d = 1;
            } while (C53965x0.m60607b(100, this) != aVar);
            return aVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
