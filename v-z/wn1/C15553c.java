package wn1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import di0.C86299o;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import ke3.C88144b;
import kr0.C76630x0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.s44;
import tn1.C14051a;
import un1.C65411a;

/* renamed from: wn1.c */
public final class C15553c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14051a f42147d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f42148e;

    public C15553c(C14051a aVar, C60905o oVar) {
        this.f42147d = aVar;
        this.f42148e = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s44 s44 = this.f42147d.f39399d.f137198e;
        boolean z = true;
        if (s44 != null && !s44.f141324i) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C39818r rVar = C39818r.f106831a;
        Context context = this.f42148e.f173499A;
        C87412m.m108593f(context, "holder.context");
        C65411a aVar = (C65411a) rVar.mo62443b(context).mo75002a(C65411a.class);
        C13604l[] lVarArr = new C13604l[3];
        C14051a aVar2 = this.f42147d;
        lVarArr[0] = new C13604l("shop_id", aVar2.f39405j);
        lVarArr[1] = new C13604l("current_page", "order_list");
        String str = aVar2.f39399d.f137197d;
        if (str == null) {
            str = "";
        }
        lVarArr[2] = new C13604l("order_id", str);
        aVar.mo89492c3("enter_shop_detail", C90364q0.m113147f(lVarArr));
        if (this.f42147d.f39407o.length() != 0) {
            z = false;
        }
        if (z) {
            C86299o oVar = new C86299o();
            C14051a aVar3 = this.f42147d;
            oVar.f250930b = aVar3.f39405j;
            oVar.f250934f = aVar3.f39406n;
            oVar.f250939k = C1824s.CTRL_INDEX;
            oVar.f250931c = C58739j4.f168176a.mo83673A();
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f42148e.f173499A, oVar);
        } else {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f42147d.f39407o);
            C88144b.m109791i(this.f42148e.f173499A, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
