package op1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import cj1.C54795n5;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.xweb.util.WXWebReporter;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import np1.C61817a;
import np1.C61866i0;
import ok1.C62042e;
import org.json.JSONObject;
import qj1.C62660c;
import rx3.C13598b0;
import sk1.C63965x;
import te3.C64617p00;
import z04.C112550d0;

/* renamed from: op1.a0 */
public final class C62079a0 extends C87413o implements C32227p<Boolean, C86299o, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0740i2 f176503d;

    /* renamed from: e */
    public final /* synthetic */ C62084h f176504e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62079a0(C0740i2 i2Var, C62084h hVar) {
        super(2);
        this.f176503d = i2Var;
        this.f176504e = hVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C62660c cVar;
        C54795n5 D0;
        ((Boolean) obj).booleanValue();
        C86299o oVar = (C86299o) obj2;
        if (oVar != null) {
            C62084h hVar = this.f176504e;
            C0740i2 i2Var = this.f176503d;
            if (hVar.f176532f) {
                ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
                C54067f0 f0Var = C54108o.f151869h;
                String str = oVar.f250930b;
                if (str == null) {
                    str = "";
                }
                f0Var.f151451d = str;
            }
            AppBrandLaunchReferrer appBrandLaunchReferrer = oVar.f250947s;
            if (appBrandLaunchReferrer == null) {
                appBrandLaunchReferrer = new AppBrandLaunchReferrer();
            }
            JSONObject jSONObject = new JSONObject();
            C63965x xVar = (C63965x) i2Var;
            String str2 = xVar.f181346s.f183163H;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("cookies", str2);
            appBrandLaunchReferrer.f239396d = 1;
            appBrandLaunchReferrer.f239399g = jSONObject.toString();
            oVar.f250947s = appBrandLaunchReferrer;
            C62042e.f176370a.mo87047U1(hVar.f176531e, true);
            C61817a aVar = hVar.f176542s;
            if (!(aVar == null || (cVar = aVar.f175776i) == null || (D0 = cVar.mo14476D0()) == null)) {
                Context context = hVar.f176531e;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                D0.mo75721Y((MMActivity) context, xVar, new C62119z(hVar, oVar, i2Var));
            }
        }
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w wVar = (C54116w) c;
        C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionPurchaseButtonClick;
        LinkedList<C64617p00> linkedList = null;
        String str3 = oVar != null ? oVar.f250940l : null;
        String valueOf = String.valueOf(((C63965x) this.f176503d).f181347t);
        JSONObject e = C61866i0.f175909a.mo86794e(((C63965x) this.f176503d).f181346s);
        C62084h hVar2 = this.f176504e;
        C0740i2 i2Var2 = this.f176503d;
        e.put("list_type", hVar2.mo87158U5() ^ true ? 1 : 0);
        LinkedList<C64617p00> linkedList2 = ((C63965x) i2Var2).f181346s.f183195z;
        if (linkedList2 != null) {
            if (true ^ linkedList2.isEmpty()) {
                linkedList = linkedList2;
            }
            if (linkedList != null) {
                StringBuilder sb = new StringBuilder();
                for (C64617p00 p002 : linkedList) {
                    String str4 = p002.f184724e;
                    if (str4 == null) {
                        str4 = "";
                    }
                    sb.append(str4);
                    sb.append(";");
                }
                e.put("couponid", C112550d0.m153779O(sb, ";").toString());
            }
        }
        C13598b0 b0Var = C13598b0.f38549a;
        C54116w.Rx0(wVar, r0Var, str3, valueOf, (String) null, (String) null, (String) null, 0, 0, e, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
        return C13598b0.f38549a;
    }
}
