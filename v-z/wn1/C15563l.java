package wn1;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import kr0.C76630x0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C50221l60;
import tn1.C14051a;
import un1.C65411a;

/* renamed from: wn1.l */
public final class C15563l implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C14051a> f42167d;

    /* renamed from: e */
    public final /* synthetic */ Context f42168e;

    public C15563l(ArrayList<C14051a> arrayList, Context context) {
        this.f42167d = arrayList;
        this.f42168e = context;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        int c6 = i - ((C60898l) eVar).mo85796c6();
        if (c6 >= 0 && c6 < this.f42167d.size()) {
            C14051a aVar = this.f42167d.get(c6);
            C87412m.m108593f(aVar, "dataList[fixPos]");
            C14051a aVar2 = aVar;
            String str = aVar2.f39399d.f137197d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            Context context = this.f42168e;
            if (context instanceof FinderLiveOrderUI) {
                ((FinderLiveOrderUI) context).mo3024O7(str);
            }
            Log.m105924i("Finder.OrderUILogic", "order click, pos:" + c6 + ", id:" + aVar2.f39399d.f137197d + ",app_user_name:" + aVar2.f39399d.f137210t + ",page_path:" + aVar2.f39399d.f137211u + " detailJson:" + aVar2.f39400e);
            C39818r rVar = C39818r.f106831a;
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C65411a aVar3 = (C65411a) rVar.mo62443b(context2).mo75002a(C65411a.class);
            C13604l[] lVarArr = new C13604l[2];
            boolean z = false;
            lVarArr[0] = new C13604l("current_page", "order_list");
            String str3 = aVar2.f39399d.f137197d;
            if (str3 != null) {
                str2 = str3;
            }
            lVarArr[1] = new C13604l("order_id", str2);
            aVar3.mo89492c3("enter_order_detail", C90364q0.m113147f(lVarArr));
            C86299o oVar2 = new C86299o();
            String str4 = aVar2.f39399d.f137210t;
            if (!(str4 == null || str4.length() == 0)) {
                String str5 = aVar2.f39399d.f137211u;
                if (str5 == null || str5.length() == 0) {
                    z = true;
                }
                if (!z) {
                    C50221l60 l602 = aVar2.f39399d;
                    oVar2.f250929a = l602.f137210t;
                    oVar2.f250934f = l602.f137211u;
                    oVar2.f250939k = C1824s.CTRL_INDEX;
                    oVar2.f250931c = C58739j4.f168176a.mo83673A();
                    oVar2.f250937i = new C15562k(aVar2);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(oVar.f173499A, oVar2);
                }
            }
            oVar2.f250930b = "wxb1b30dcd0a6be5cb";
            oVar2.f250934f = "pages/detail/index.html";
            oVar2.f250939k = C1824s.CTRL_INDEX;
            oVar2.f250931c = C58739j4.f168176a.mo83673A();
            oVar2.f250937i = new C15562k(aVar2);
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(oVar.f173499A, oVar2);
        }
    }
}
