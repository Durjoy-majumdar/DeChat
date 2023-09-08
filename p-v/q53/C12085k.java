package q53;

import android.view.View;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import m53.C10757d;
import p217oq.C11717f;
import qo3.C12925w;

/* renamed from: q53.k */
public final class C12085k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35169d;

    public C12085k(C12041a aVar) {
        this.f35169d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$initHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f35169d.f35065e.mo11725e3();
        ((C11717f) C86312j.m106911c(C11717f.class)).mo11557h5();
        C12041a aVar = this.f35169d;
        if (aVar.f35062b.f32230i != null) {
            aVar.f35072l = true;
            C12119t tVar = aVar.f35064d;
            if (tVar != null) {
                tVar.mo12476d();
            } else {
                C87412m.m108603p("buyCoinView");
                throw null;
            }
        } else {
            C12925w wVar = aVar.f35063c;
            if (wVar != null) {
                wVar.mo5085n();
            } else {
                C87412m.m108603p("mBottomSheet");
                throw null;
            }
        }
        C12041a aVar2 = this.f35169d;
        C10757d.C10758a aVar3 = aVar2.f35073m;
        if (aVar3 != null) {
            aVar3.mo9998a(aVar2, Boolean.TRUE);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$initHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
