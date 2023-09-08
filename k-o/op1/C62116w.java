package op1;

import a14.C0000n0;
import android.content.Context;
import cm1.C0740i2;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p565ir.C60612q;
import pp1.C62438f;
import rx3.C13598b0;
import sk1.C63965x;
import te3.C64370fp1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.adapter.FinderLiveShoppingListAdapter$setProductOnClickListener$1$1$1$3", mo125469f = "FinderLiveShoppingListAdapter.kt", mo125470l = {821}, mo125471m = "invokeSuspend")
/* renamed from: op1.w */
public final class C62116w extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f176630d;

    /* renamed from: e */
    public final /* synthetic */ C62438f f176631e;

    /* renamed from: f */
    public final /* synthetic */ C0740i2 f176632f;

    /* renamed from: g */
    public final /* synthetic */ C62084h f176633g;

    /* renamed from: h */
    public final /* synthetic */ C86299o f176634h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62116w(C62438f fVar, C0740i2 i2Var, C62084h hVar, C86299o oVar, C15601d<? super C62116w> dVar) {
        super(2, dVar);
        this.f176631e = fVar;
        this.f176632f = i2Var;
        this.f176633g = hVar;
        this.f176634h = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62116w(this.f176631e, this.f176632f, this.f176633g, this.f176634h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62116w) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f176630d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.f176631e.f44854d.getContext();
            C87412m.m108593f(context, "holder.itemView.context");
            C64370fp1 fp12 = ((C63965x) this.f176632f).f181346s;
            this.f176630d = 1;
            if (((C60612q) C86312j.m106911c(C60612q.class)).Yv0(context, fp12, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32227p<? super Integer, ? super C86299o, C13598b0> pVar = this.f176633g.f176543t;
        if (pVar != null) {
            pVar.invoke(new Integer(2), this.f176634h);
        }
        C32226l<? super Long, C13598b0> lVar = this.f176633g.f176547x;
        if (lVar != null) {
            lVar.invoke(new Long(((C63965x) this.f176632f).f181347t));
        }
        return C13598b0.f38549a;
    }
}
