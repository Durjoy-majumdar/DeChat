package tz0;

import com.tencent.p014mm.plugin.card.p031ui.p033v3.VipCardListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51488u30;
import wz0.C22945n;

/* renamed from: tz0.f */
public final class C22569f<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ VipCardListUI f64899a;

    /* renamed from: b */
    public final /* synthetic */ String f64900b;

    public C22569f(VipCardListUI vipCardListUI, String str) {
        this.f64899a = vipCardListUI;
        this.f64900b = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            VipCardListUI vipCardListUI = this.f64899a;
            String str = this.f64900b;
            C51488u30 u302 = (C51488u30) t;
            Log.m105925i("MicroMsg.CardHomePageNewUI", "retCode: %s", Integer.valueOf(u302.f142574d));
            if (u302.f142574d == 0) {
                Iterator<VipCardListUI.C18668a> it = vipCardListUI.f52211v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    VipCardListUI.C18668a next = it.next();
                    if (C87412m.m108589b(next.mo23499a().f64049d, str)) {
                        vipCardListUI.f52211v.remove(next);
                        WxRecyclerAdapter<VipCardListUI.C18668a> wxRecyclerAdapter = vipCardListUI.f52210u;
                        if (wxRecyclerAdapter != null) {
                            wxRecyclerAdapter.notifyDataSetChanged();
                        } else {
                            C87412m.m108603p("mVipCardListAdapter");
                            throw null;
                        }
                    }
                }
            } else {
                C22945n.m27018r(vipCardListUI, u302.f142575e);
            }
        } else {
            C22945n.m27017q(this.f64899a, "");
        }
        VipCardListUI vipCardListUI2 = this.f64899a;
        Boolean bool = Boolean.FALSE;
        int i = VipCardListUI.f52184R;
        vipCardListUI2.mo23495O7(bool);
        return C13598b0.f38549a;
    }
}
