package ve1;

import android.content.Context;
import cm1.C55033u;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;
import te3.C64284cg;

/* renamed from: ve1.h0 */
public final class C65599h0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55033u f188761d;

    /* renamed from: e */
    public final /* synthetic */ C65592g0 f188762e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188763f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65599h0(C55033u uVar, C65592g0 g0Var, C60905o oVar) {
        super(1);
        this.f188761d = uVar;
        this.f188762e = g0Var;
        this.f188763f = oVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "username");
        FinderContact finderContact = this.f188761d.f154492d.mo89532o2().reply_contact;
        C13598b0 b0Var = null;
        C64284cg b = finderContact != null ? C58960c.m68830b(C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null), false) : null;
        if (b != null) {
            C60905o oVar = this.f188763f;
            C65592g0 g0Var = this.f188762e;
            C55033u uVar = this.f188761d;
            C65604i iVar = C65604i.f188772a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String str2 = b.f182468d;
            if (str2 == null) {
                str2 = "";
            }
            iVar.mo89680f(context, str2, g0Var.f188747e.getCommentScene(), uVar, g0Var.f188747e.mo77342u(), "");
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            C65592g0 g0Var2 = this.f188762e;
            C55033u uVar2 = this.f188761d;
            C60905o oVar2 = this.f188763f;
            C65604i iVar2 = C65604i.f188772a;
            Context context2 = oVar2.f173499A;
            C87412m.m108593f(context2, "holder.context");
            iVar2.mo89683i(str, uVar2, context2, g0Var2.f188747e.getCommentScene(), "");
        }
        return C13598b0.f38549a;
    }
}
