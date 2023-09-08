package mc1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93745z1;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteIndexUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C11184p0;
import p385u2.C111105a;
import pb1.C100699c0;
import pb1.C100734q;
import pb1.C100755z;
import pc1.C100774c;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: mc1.m */
public final class C99844m implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C99841k f292551d;

    public C99844m(C99841k kVar) {
        this.f292551d = kVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C100755z c3;
        C100755z c35;
        C100755z c36;
        C100755z c37;
        C13598b0 b0Var = null;
        if (menuItem != null) {
            C99841k kVar = this.f292551d;
            int itemId = menuItem.getItemId();
            if (itemId != 0) {
                if (itemId != 1) {
                    if (itemId != 2) {
                        if (!(itemId != 3 || kVar.f292548g == -1 || (c37 = kVar.mo139192d3().mo139183c3(kVar.f292548g)) == null)) {
                            Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleTransmit] favItemInfo id = " + c37.field_id + ", position = " + kVar.f292548g);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(c37);
                            if (!FavoriteIndexUI.m118089T7(arrayList, kVar.getContext(), new C99839i(kVar, arrayList))) {
                                Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleTransmit] checkFavoriteTransLegal result = false");
                            } else {
                                C93745z1.m118451h(kVar.getContext(), 4106, arrayList);
                            }
                        }
                    } else if (!(kVar.f292548g == -1 || (c36 = kVar.mo139192d3().mo139183c3(kVar.f292548g)) == null)) {
                        Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleTAG] favItemInfo id = " + c36.field_id + ", position = " + kVar.f292548g);
                        Intent intent = new Intent();
                        intent.putExtra("key_fav_scene", 4);
                        intent.putExtra("key_fav_item_id", c36.field_localId);
                        C100734q.m131875t0(kVar.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
                        C100699c0.m131739a("FavTagEditUI");
                        kVar.f292547f.invoke(4);
                    }
                } else if (!(kVar.f292548g == -1 || (c35 = kVar.mo139192d3().mo139183c3(kVar.f292548g)) == null)) {
                    Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleMore] favItemInfo id = " + c35.field_id + ", position = " + kVar.f292548g);
                    kVar.mo139192d3().mo139187g3(kVar.f292548g);
                    C100774c cVar = kVar.f292546e;
                    if (cVar != null) {
                        cVar.mo140210c(false, true, false);
                        if (!((ArrayList) kVar.mo139192d3().mo139186f3()).isEmpty()) {
                            C100774c cVar2 = kVar.f292546e;
                            if (cVar2 != null) {
                                cVar2.mo140208a(true);
                            } else {
                                C87412m.m108603p("mMoreFooter");
                                throw null;
                            }
                        } else {
                            C100774c cVar3 = kVar.f292546e;
                            if (cVar3 != null) {
                                cVar3.mo140208a(false);
                            } else {
                                C87412m.m108603p("mMoreFooter");
                                throw null;
                            }
                        }
                        kVar.f292545d = true;
                        kVar.f292547f.invoke(15);
                    } else {
                        C87412m.m108603p("mMoreFooter");
                        throw null;
                    }
                }
            } else if (!(kVar.f292548g == -1 || (c3 = kVar.mo139192d3().mo139183c3(kVar.f292548g)) == null)) {
                Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleDelete] favItemInfo id = " + c3.field_id + ", position = " + kVar.f292548g);
                C77426q qVar = new C77426q(kVar.getContext());
                qVar.mo107589a(true);
                qVar.mo107595g(kVar.getContext().getString(C0966R.string.cn4));
                qVar.mo107602n(kVar.getContext().getString(C0966R.string.f7944x1));
                qVar.mo107599k(C111105a.m151500b(kVar.getContext(), C0966R.color.a_3));
                qVar.mo107600l(new C99831d(c3, kVar));
                qVar.mo107598j(kVar.getContext().getString(C0966R.string.bj_));
                qVar.mo107597i(new C99833e(kVar));
                qVar.mo107603o();
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.FavFinderFilterUI", "[OnMMMenuItemSelectedListener] item = null!!");
        }
    }
}
