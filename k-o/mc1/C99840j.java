package mc1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93745z1;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteIndexUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import p385u2.C111105a;
import pb1.C100755z;
import pc1.C100774c;
import qo3.C77426q;

/* renamed from: mc1.j */
public final class C99840j implements C100774c.C100778d {

    /* renamed from: a */
    public final /* synthetic */ C99841k f292544a;

    public C99840j(C99841k kVar) {
        this.f292544a = kVar;
    }

    /* renamed from: a */
    public void mo128359a() {
    }

    /* renamed from: b */
    public void mo128360b() {
        C99841k kVar = this.f292544a;
        if (!FavoriteIndexUI.m118089T7(kVar.mo139192d3().mo139186f3(), kVar.getContext(), new C99838h(kVar))) {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterForward] checkFavoriteTransLegal result = false");
        } else {
            C93745z1.m118451h(kVar.getContext(), 4105, kVar.mo139192d3().mo139186f3());
        }
    }

    /* renamed from: c */
    public void mo128361c() {
        C99841k kVar = this.f292544a;
        List<C100755z> f3 = kVar.mo139192d3().mo139186f3();
        if (((ArrayList) f3).isEmpty()) {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] getSelectFavItemInfos isEmpty = true");
            return;
        }
        C77426q qVar = new C77426q(kVar.getContext());
        qVar.mo107589a(true);
        qVar.mo107595g(kVar.getContext().getString(C0966R.string.cn5));
        qVar.mo107602n(kVar.getContext().getString(C0966R.string.f7944x1));
        qVar.mo107599k(C111105a.m151500b(kVar.getContext(), C0966R.color.a_3));
        qVar.mo107600l(new C99834f(f3, kVar));
        qVar.mo107598j(kVar.getContext().getString(C0966R.string.bj_));
        qVar.mo107597i(new C99837g(kVar));
        qVar.mo107603o();
    }
}
