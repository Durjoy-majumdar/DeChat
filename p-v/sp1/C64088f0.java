package sp1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import cj1.C54795n5;
import cl1.C54979h1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import ok1.C62042e;
import rx3.C13598b0;
import sk1.C13696v;

/* renamed from: sp1.f0 */
public final class C64088f0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f181711d;

    /* renamed from: e */
    public final /* synthetic */ boolean f181712e;

    /* renamed from: f */
    public final /* synthetic */ C64075c0 f181713f;

    /* renamed from: g */
    public final /* synthetic */ C45795b f181714g;

    /* renamed from: h */
    public final /* synthetic */ C13696v f181715h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64088f0(Context context, boolean z, C64075c0 c0Var, C45795b bVar, C13696v vVar) {
        super(0);
        this.f181711d = context;
        this.f181712e = z;
        this.f181713f = c0Var;
        this.f181714g = bVar;
        this.f181715h = vVar;
    }

    public Object invoke() {
        C62042e eVar = C62042e.f176370a;
        eVar.mo87047U1(this.f181711d, false);
        if (!this.f181712e) {
            Log.m105928w(this.f181713f.f181664h, "get shop shelf failed");
        } else {
            C64075c0 c0Var = this.f181713f;
            C45795b bVar = this.f181714g;
            MMActivity mMActivity = (MMActivity) this.f181711d;
            C13696v vVar = this.f181715h;
            FinderLiveShoppingCouponView couponView = c0Var.getCouponView();
            C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionCouponBubbleClick;
            Class cls = C54116w.class;
            Class cls2 = C54979h1.class;
            C54979h1 h1Var = (C54979h1) bVar.mo71262a(cls2);
            int i = vVar.f38761s.f142892B;
            String str = "";
            if (i == 1) {
                C45795b bVar2 = c0Var.f181659I;
                C54979h1 h1Var2 = bVar2 != null ? (C54979h1) bVar2.mo71262a(cls2) : null;
                if (h1Var2 != null) {
                    String str2 = vVar.f38761s.f142891A;
                    if (str2 != null) {
                        str = str2;
                    }
                    h1Var2.f154128U = str;
                }
                C58124b.C7172a.m7372a(c0Var.f181661e, C58124b.C58125b.FINDER_LIVE_SHOPPING_SHOW_CAN_USE_COUPON_ITEM_LIST, (Bundle) null, 2, (Object) null);
                ((C54116w) C86312j.m106911c(cls)).Tx0(r0Var, vVar, "0");
            } else if (i == 2) {
                eVar.mo87047U1(mMActivity, true);
                C54795n5 D0 = c0Var.f181663g.mo14476D0();
                if (D0 != null) {
                    LinkedList linkedList = new LinkedList();
                    String str3 = vVar.f38763u;
                    if (str3 != null) {
                        str = str3;
                    }
                    linkedList.add(str);
                    C13598b0 b0Var = C13598b0.f38549a;
                    D0.mo75757y(mMActivity, linkedList, true, new C64086e0(mMActivity, vVar, couponView, c0Var));
                }
            } else if (i == 3) {
                C58124b.C7172a.m7372a(c0Var.f181661e, C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_SHOW, (Bundle) null, 2, (Object) null);
                ((C54116w) C86312j.m106911c(cls)).Tx0(r0Var, vVar, "0");
            }
        }
        return C13598b0.f38549a;
    }
}
