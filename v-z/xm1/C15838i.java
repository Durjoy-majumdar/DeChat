package xm1;

import a14.C0000n0;
import a14.C53965x0;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C51942x91;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$1", mo125469f = "LiveEntranceFragmentUICMoreIcon.kt", mo125470l = {247}, mo125471m = "invokeSuspend")
/* renamed from: xm1.i */
public final class C15838i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f42649d;

    /* renamed from: e */
    public int f42650e;

    /* renamed from: f */
    public final /* synthetic */ List<C51942x91> f42651f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<ViewGroup> f42652g;

    /* renamed from: h */
    public final /* synthetic */ C8479f0<TextView> f42653h;

    /* renamed from: i */
    public final /* synthetic */ C8479f0<ImageView> f42654i;

    /* renamed from: j */
    public final /* synthetic */ C8479f0<ViewGroup> f42655j;

    /* renamed from: n */
    public final /* synthetic */ C8479f0<ImageView> f42656n;

    /* renamed from: o */
    public final /* synthetic */ C8479f0<TextView> f42657o;

    /* renamed from: p */
    public final /* synthetic */ C15834h f42658p;

    /* renamed from: q */
    public final /* synthetic */ int f42659q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15838i(List<? extends C51942x91> list, C8479f0<ViewGroup> f0Var, C8479f0<TextView> f0Var2, C8479f0<ImageView> f0Var3, C8479f0<ViewGroup> f0Var4, C8479f0<ImageView> f0Var5, C8479f0<TextView> f0Var6, C15834h hVar, int i, C15601d<? super C15838i> dVar) {
        super(2, dVar);
        this.f42651f = list;
        this.f42652g = f0Var;
        this.f42653h = f0Var2;
        this.f42654i = f0Var3;
        this.f42655j = f0Var4;
        this.f42656n = f0Var5;
        this.f42657o = f0Var6;
        this.f42658p = hVar;
        this.f42659q = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15838i(this.f42651f, this.f42652g, this.f42653h, this.f42654i, this.f42655j, this.f42656n, this.f42657o, this.f42658p, this.f42659q, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15838i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i2 = this.f42650e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            i = -1;
        } else if (i2 == 1) {
            int i3 = this.f42649d;
            ResultKt.throwOnFailure(obj);
            i = i3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            C8479f0<ViewGroup> f0Var = this.f42652g;
            C8479f0<ImageView> f0Var2 = this.f42654i;
            C8479f0<TextView> f0Var3 = this.f42653h;
            C8479f0<ViewGroup> f0Var4 = this.f42655j;
            C8479f0<ImageView> f0Var5 = this.f42656n;
            C8479f0<TextView> f0Var6 = this.f42657o;
            f0Var.f27484d = f0Var4.f27484d;
            f0Var2.f27484d = f0Var5.f27484d;
            f0Var3.f27484d = f0Var6.f27484d;
            f0Var4.f27484d = (ViewGroup) f0Var.f27484d;
            f0Var5.f27484d = (ImageView) f0Var2.f27484d;
            f0Var6.f27484d = (TextView) f0Var3.f27484d;
            int i4 = i + 1;
            if (i4 >= this.f42651f.size()) {
                i4 = 0;
            }
            C15834h.m14773e3(this.f42658p, this.f42659q, this.f42651f.get(i), (ViewGroup) this.f42652g.f27484d, (TextView) this.f42653h.f27484d, (ImageView) this.f42654i.f27484d);
            View view = (View) this.f42652g.f27484d;
            View view2 = (View) this.f42655j.f27484d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            C87412m.m108593f(ofFloat, "ofFloat(0f, 1f)");
            ofFloat.addUpdateListener(new C15839j(view, view2));
            ofFloat.addListener(new C15840k(view, view2));
            ofFloat.setDuration(1000);
            ofFloat.start();
            this.f42649d = i;
            this.f42650e = 1;
        } while (C53965x0.m60607b(3000, this) != aVar);
        return aVar;
    }
}
