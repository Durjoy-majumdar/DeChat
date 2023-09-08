package qj1;

import a14.C0000n0;
import android.content.Context;
import cj1.C54804r0;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import di0.C86299o;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import o40.C61926c;
import ok1.C62042e;
import p565ir.C60612q;
import rx3.C13598b0;
import sk1.C63965x;
import te3.C49712hj1;
import te3.C64370fp1;
import tf0.C64916p1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveShoppingBubblePlugin$jumpShoppingBubble$jumpShoppingBubbleImpl$2", mo125469f = "FinderLiveShoppingBubblePlugin.kt", mo125470l = {189}, mo125471m = "invokeSuspend")
/* renamed from: qj1.me */
public final class C62885me extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f178432d;

    /* renamed from: e */
    public final /* synthetic */ boolean f178433e;

    /* renamed from: f */
    public final /* synthetic */ C62850ke f178434f;

    /* renamed from: g */
    public final /* synthetic */ C63965x f178435g;

    /* renamed from: h */
    public final /* synthetic */ C86299o f178436h;

    /* renamed from: i */
    public final /* synthetic */ C64370fp1 f178437i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62885me(boolean z, C62850ke keVar, C63965x xVar, C86299o oVar, C64370fp1 fp12, C15601d<? super C62885me> dVar) {
        super(2, dVar);
        this.f178433e = z;
        this.f178434f = keVar;
        this.f178435g = xVar;
        this.f178436h = oVar;
        this.f178437i = fp12;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62885me(this.f178433e, this.f178434f, this.f178435g, this.f178436h, this.f178437i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62885me) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f178432d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f178433e) {
                Context context = this.f178434f.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                C64370fp1 fp12 = this.f178435g.f181346s;
                this.f178432d = 1;
                if (((C60612q) C86312j.m106911c(C60612q.class)).Yv0(context, fp12, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C54804r0 r0Var = C54804r0.f153631a;
        Context context2 = this.f178434f.f166287d.getContext();
        C87412m.m108593f(context2, "root.context");
        r0Var.mo75767i(context2, this.f178434f.mo87684A0(), this.f178436h, this.f178434f.mo14482F0());
        Context context3 = this.f178434f.f166287d.getContext();
        C87412m.m108593f(context3, "root.context");
        r0Var.mo75761b(context3, this.f178434f.mo87684A0(), this.f178435g.f181347t);
        C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
        C56032b z0 = this.f178434f.mo14484z0();
        C49712hj1 hj12 = null;
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z0 instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) z0 : null;
        if (finderLiveVisitorPluginLayout != null) {
            hj12 = finderLiveVisitorPluginLayout.getReportObj();
        }
        p1Var.mo76728y(hj12, 18054, C62042e.m72804V(C62042e.f176370a, this.f178434f.mo87684A0(), 25, C61926c.m72691p(this.f178437i.f183176d), 0, 8, (Object) null));
        return C13598b0.f38549a;
    }
}
