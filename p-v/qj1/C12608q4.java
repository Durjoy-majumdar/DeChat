package qj1;

import a14.C0000n0;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cl1.C0668l;
import di3.C7335d;
import di3.C86312j;
import er1.C7839m5;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C51398th3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveChargePayLazyPlugin$initView$7", mo125469f = "FinderLiveChargePayLazyPlugin.kt", mo125470l = {277}, mo125471m = "invokeSuspend")
/* renamed from: qj1.q4 */
public final class C12608q4 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f36140d;

    /* renamed from: e */
    public int f36141e;

    /* renamed from: f */
    public final /* synthetic */ C12669t4 f36142f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12608q4(C12669t4 t4Var, C15601d<? super C12608q4> dVar) {
        super(2, dVar);
        this.f36142f = t4Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12608q4(this.f36142f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12608q4) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C12669t4 t4Var;
        C49352ez a;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f36141e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C89349b bVar = ((C0668l) this.f36142f.mo87696x0(C0668l.class)).f1574g;
            if (bVar != null) {
                C12669t4 t4Var2 = this.f36142f;
                C7335d c = C86312j.m106911c(C60200t1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                Context context = t4Var2.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                this.f36140d = t4Var2;
                this.f36141e = 1;
                obj = ((C60200t1) c).mo76881tZ(context, bVar, false, this);
                if (obj == aVar) {
                    return aVar;
                }
                t4Var = t4Var2;
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            t4Var = (C12669t4) this.f36140d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C51398th3 th32 = (C51398th3) obj;
        if (!(th32 == null || (a = C7839m5.m7985a(th32)) == null)) {
            TextView textView = t4Var.f36289u;
            if (textView != null) {
                textView.setTextSize(14.0f);
            }
            TextView textView2 = t4Var.f36289u;
            if (textView2 != null) {
                textView2.setAlpha(0.5f);
            }
            TextView textView3 = t4Var.f36288t;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = t4Var.f36288t;
            if (textView4 != null) {
                textView4.setText(a.f133183e);
            }
            View view = t4Var.f36287s;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$7", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$7", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView = t4Var.f36286r;
            if (imageView != null) {
                C20828a.m22825b().mo32518g(a.f133184f, imageView);
            }
            C12669t4.m12162a1(t4Var);
        }
        return C13598b0.f38549a;
    }
}
