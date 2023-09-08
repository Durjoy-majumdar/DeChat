package op1;

import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import nj3.C76912y0;
import np1.C61817a;
import o40.C61926c;
import pe3.C89349b;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C49942j41;
import te3.C50078k41;
import te3.C50401mh0;
import te3.C50542nh0;
import te3.C50912q41;

/* renamed from: op1.r */
public final class C62111r extends C87413o implements C32228q<Boolean, String, C50912q41, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62084h f176617d;

    /* renamed from: e */
    public final /* synthetic */ C50401mh0 f176618e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62111r(C62084h hVar, C50401mh0 mh02) {
        super(3);
        this.f176617d = hVar;
        this.f176618e = mh02;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        C62660c cVar;
        C32226l<? super Boolean, C13598b0> lVar;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C50912q41 q412 = (C50912q41) obj3;
        C87412m.m108594g((String) obj2, "errmsg");
        C87412m.m108594g(q412, "resp");
        C62084h hVar = this.f176617d;
        C50401mh0 mh02 = this.f176618e;
        hVar.getClass();
        C89349b bVar = mh02.f138029e;
        if (bVar != null) {
            C50542nh0 nh02 = q412.f140127d;
            if (booleanValue && nh02 != null && nh02.f138603e == 0) {
                switch (mh02.f138028d) {
                    case 101:
                        C61817a aVar = hVar.f176542s;
                        if (!(aVar == null || (cVar = aVar.f175776i) == null)) {
                            cVar.mo3210u0(C58124b.C58125b.FINDER_LIVE_SHOPPING_REFRESH, (Bundle) null);
                            break;
                        }
                    case 102:
                        C50078k41 k412 = new C50078k41();
                        k412.parseFrom(bVar.mo123703f());
                        C61926c.m72675T(hVar.f176535i, new C62109p(k412));
                        if (hVar.f176532f) {
                            ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
                            LinkedList<Long> linkedList = C54108o.f151869h.f151454e0;
                            LinkedList<Long> linkedList2 = k412.f136542d;
                            C87412m.m108593f(linkedList2, "removeProducts.remove_product_ids");
                            linkedList.removeAll(linkedList2);
                        }
                        hVar.mo87167d6();
                        hVar.notifyDataSetChanged();
                        if (hVar.f176535i.size() == 0 && (lVar = hVar.f176544u) != null) {
                            lVar.invoke(Boolean.TRUE);
                            break;
                        }
                    case 103:
                        C49942j41 j412 = new C49942j41();
                        j412.parseFrom(bVar.mo123703f());
                        hVar.mo87153P5(j412.f135856d, new C62110q(hVar));
                        break;
                }
            } else {
                String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e3q);
                C87412m.m108593f(string, "getContext().resources.g…ofile_action_fail_prefix)");
                switch (mh02.f138028d) {
                    case 101:
                        str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e89);
                        C87412m.m108593f(str, "getContext().resources.g…er_live_shopping_reorder)");
                        break;
                    case 102:
                        str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e7u);
                        C87412m.m108593f(str, "getContext().resources.g…der_live_shopping_delete)");
                        break;
                    case 103:
                        str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e8l);
                        C87412m.m108593f(str, "getContext().resources.g….finder_live_shopping_up)");
                        break;
                    default:
                        str = "";
                        break;
                }
                Context context = MMApplicationContext.getContext();
                C76912y0.makeText(context, (CharSequence) string + str, 0).show();
            }
        }
        return C13598b0.f38549a;
    }
}
