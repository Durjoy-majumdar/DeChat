package qj1;

import a14.C0000n0;
import a14.C53965x0;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54979h1;
import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import sk1.C63956k;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLivePromoteBubblePlugin$statusChange$1$2$1$1", mo125469f = "FinderLivePromoteBubblePlugin.kt", mo125470l = {315}, mo125471m = "invokeSuspend")
/* renamed from: qj1.id */
public final class C62821id extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f178304d;

    /* renamed from: e */
    public final /* synthetic */ C62712dd f178305e;

    /* renamed from: f */
    public final /* synthetic */ C63956k f178306f;

    /* renamed from: qj1.id$a */
    public static final class C62822a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178307d;

        /* renamed from: e */
        public final /* synthetic */ C63956k f178308e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62822a(C62712dd ddVar, C63956k kVar) {
            super(0);
            this.f178307d = ddVar;
            this.f178308e = kVar;
        }

        public Object invoke() {
            boolean z;
            Class cls = C54979h1.class;
            C0740i2 i2Var = ((C54979h1) this.f178307d.mo87696x0(cls)).f154147v;
            C63956k kVar = i2Var instanceof C63956k ? (C63956k) i2Var : null;
            C63956k kVar2 = this.f178308e;
            boolean z2 = kVar2 instanceof C63956k;
            C63956k kVar3 = z2 ? kVar2 : null;
            if (kVar3 != null) {
                C62712dd ddVar = this.f178307d;
                C63956k kVar4 = z2 ? kVar2 : null;
                if (kVar4 != null) {
                    kVar4.f181295h = 0;
                }
                if (kVar == null) {
                    C62712dd.m73744Z0(ddVar, kVar2);
                } else if (kVar.f181291d == kVar3.f181291d) {
                    long j = ((C54979h1) ddVar.mo87696x0(cls)).f154118J;
                    C0740i2 i2Var2 = ((C54979h1) ddVar.mo87696x0(cls)).f154147v;
                    C63956k kVar5 = i2Var2 instanceof C63956k ? (C63956k) i2Var2 : null;
                    String str = kVar5 != null ? kVar5.f181302r : null;
                    if (j != kVar3.f181291d || !C87412m.m108589b(kVar3.f181302r, str)) {
                        String str2 = ddVar.f178063s;
                        StringBuilder sb = new StringBuilder();
                        sb.append("updatePromoteData curPromoteItem:");
                        C62966ri riVar = ddVar.f178065u;
                        sb.append(riVar != null ? riVar.hashCode() : 0);
                        sb.append(", promoteData = ");
                        sb.append(kVar2.f181291d);
                        Log.m105924i(str2, sb.toString());
                        ddVar.mo87731i1(kVar2);
                        ddVar.mo87725c1(kVar2);
                        C62966ri riVar2 = ddVar.f178065u;
                        if (riVar2 == null) {
                            C62966ri g1 = ddVar.mo87729g1(kVar2);
                            if (g1 != null) {
                                g1.mo12175C(kVar2);
                                ddVar.mo87726d1(g1);
                                ViewGroup viewGroup = ddVar.f178066v;
                                if (viewGroup != null) {
                                    viewGroup.removeAllViews();
                                    ddVar.mo87724b1((C62966ri) null, g1);
                                } else {
                                    C87412m.m108603p("promoteBubbleContainer");
                                    throw null;
                                }
                            }
                            ddVar.f178065u = g1;
                            z = true;
                        } else {
                            riVar2.mo12189t(kVar2);
                            z = false;
                        }
                        ((C54979h1) ddVar.mo87696x0(cls)).f154118J = 0;
                        ((C54979h1) ddVar.mo87696x0(cls)).mo75948o3(kVar2);
                        ddVar.mo10792g(0);
                        ddVar.mo87732j1();
                        if (z) {
                            ddVar.mo87689H0((View) null, ddVar.f178063s);
                        }
                        C61926c.m72666K(1000, new C62849kd(ddVar));
                    } else {
                        String str3 = ddVar.f178063s;
                        Log.m105924i(str3, "promoteIdHideByVisitor = " + j + ", newPromoteInfo.mPromoteId = " + kVar3.f181291d + ", only update data");
                        ((C54979h1) ddVar.mo87696x0(cls)).mo75948o3(kVar3);
                    }
                } else {
                    C62712dd.m73744Z0(ddVar, kVar2);
                }
                C62712dd.m73745a1(ddVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62821id(C62712dd ddVar, C63956k kVar, C15601d<? super C62821id> dVar) {
        super(2, dVar);
        this.f178305e = ddVar;
        this.f178306f = kVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62821id(this.f178305e, this.f178306f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62821id) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C54979h1.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f178304d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = ((C54979h1) this.f178305e.mo87696x0(cls)).f154118J;
            C0740i2 i2Var = ((C54979h1) this.f178305e.mo87696x0(cls)).f154147v;
            C63956k kVar = null;
            C63956k kVar2 = i2Var instanceof C63956k ? (C63956k) i2Var : null;
            String str = kVar2 != null ? kVar2.f181302r : null;
            C63956k kVar3 = this.f178306f;
            if (j != kVar3.f181291d || !C87412m.m108589b(str, kVar3.f181302r)) {
                C63956k kVar4 = this.f178306f;
                if (kVar4 instanceof C63956k) {
                    kVar = kVar4;
                }
                int i2 = kVar != null ? kVar.f181295h : 0;
                String str2 = this.f178305e.f178063s;
                Log.m105924i(str2, "[updatePromoteData] delay:" + i2);
                this.f178304d = 1;
                if (C53965x0.m60607b(((long) i2) * 1000, this) == aVar) {
                    return aVar;
                }
            } else {
                String str3 = this.f178305e.f178063s;
                Log.m105924i(str3, "promoteIdHideByVisitor = " + j + ", newPromoteInfo.mPromoteId = " + this.f178306f.f181291d + ", only update data");
                ((C54979h1) this.f178305e.mo87696x0(cls)).mo75948o3(this.f178306f);
                return C13598b0.f38549a;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C61926c.m72668M(new C62822a(this.f178305e, this.f178306f));
        return C13598b0.f38549a;
    }
}
