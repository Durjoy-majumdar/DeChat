package fh1;

import a14.C0000n0;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import di3.C86312j;
import fy3.C32227p;
import gc0.C20828a;
import gk1.C59522a;
import gk1.C59525c;
import hc0.C20937c;
import ic0.C98661k;
import java.util.HashMap;
import kg3.C76577a;
import kotlin.ResultKt;
import p227rn.C63484s;
import p227rn.C63485t;
import p243tn.C14050a;
import rx3.C13598b0;
import rx3.C13600d;
import te3.C64836xp2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveScrollSquareController$onControllerInit$1", mo125469f = "LiveScrollSquareController.kt", mo125470l = {135}, mo125471m = "invokeSuspend")
/* renamed from: fh1.q2 */
public final class C59072q2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f169010d;

    /* renamed from: e */
    public final /* synthetic */ C59062p2 f169011e;

    /* renamed from: fh1.q2$a */
    public static final class C59073a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C59062p2 f169012d;

        public C59073a(C59062p2 p2Var) {
            this.f169012d = p2Var;
        }

        public Object emit(Object obj, C15601d dVar) {
            int intValue = ((Number) obj).intValue();
            Class cls = C54991o.class;
            String str = this.f169012d.f168980j;
            Log.m105924i(str, "liveInfoChangeLiveData collect value " + intValue);
            C59522a F3 = this.f169012d.mo84269F3();
            C64836xp2 xp22 = new C64836xp2();
            C59062p2 p2Var = this.f169012d;
            xp22.f186369d = ((C54991o) p2Var.business(cls)).f154345o;
            xp22.f186370e = ((C54991o) p2Var.business(cls)).f154252S0;
            xp22.f186371f = ((C54991o) p2Var.business(cls)).mo75969L3();
            ImageView imageView = this.f169012d.f168982o;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            F3.getClass();
            Log.m105924i("LiveScrollPanelWidget", "showWidget params, anchorUserName: " + xp22.f186369d + " theme: " + xp22.f186370e + " blurDrawable: " + drawable);
            F3.f170119C = xp22;
            F3.mo84595c();
            String str2 = xp22.f186370e;
            if (!(str2 == null || str2.length() == 0)) {
                F3.f170131q.setVisibility(0);
                F3.f170131q.setText(xp22.f186370e);
            } else {
                F3.f170131q.setVisibility(8);
            }
            if (drawable == null) {
                drawable = new ColorDrawable(-16777216);
            }
            F3.f170140z = drawable;
            F3.f170137w.setBackgroundDrawable(drawable);
            F3.f170124g.setBackgroundDrawable(F3.f170117A);
            String str3 = xp22.f186371f;
            if (str3 == null) {
                str3 = "";
            }
            Integer num = (Integer) ((HashMap) C59522a.f170114H).get(F3.mo84594b(str3));
            if (num != null) {
                F3.mo84598f(num.intValue());
            } else {
                Class cls2 = C63485t.class;
                String zH = ((C63484s) C86312j.m106911c(C63484s.class)).mo60498zH(str3, 1);
                C20828a b = C20828a.m22825b();
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59361q = -1;
                bVar.f59346b = true;
                bVar.f59369y = ((C63485t) C86312j.m106911c(cls2)).mo35195EL(1);
                bVar.f59370z = ((C63485t) C86312j.m106911c(cls2)).mo35194BK(1);
                bVar.f59343A = ((C63485t) C86312j.m106911c(cls2)).Zd0(1);
                bVar.f59350f = C14050a.m13405b(zH);
                b.mo32522k(zH, (ImageView) null, bVar.mo32666a(), (C98661k) null, ((C63485t) C86312j.m106911c(cls2)).mo35197zY(1, 100, 100, true, true, (float) C76577a.m92151b(F3.f170124g.getContext(), 8), new C59525c(str3, F3)));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59072q2(C59062p2 p2Var, C15601d<? super C59072q2> dVar) {
        super(2, dVar);
        this.f169011e = p2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59072q2(this.f169011e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C59072q2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f169010d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58087u0<Integer> u0Var = ((C54991o) this.f169011e.business(C54991o.class)).f154307e1;
            C59073a aVar2 = new C59073a(this.f169011e);
            this.f169010d = 1;
            if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
