package qp1;

import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.webkit.ValueCallback;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveShoppingManagerUI;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fj1.C45795b;
import gy3.C87412m;
import te3.v44;
import tp1.C64994a;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: qp1.a */
public final class C63305a<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveShoppingManagerPresenter f179630a;

    public C63305a(FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter) {
        this.f179630a = finderLiveShoppingManagerPresenter;
    }

    public void onReceiveValue(Object obj) {
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter;
        String str = (String) obj;
        String str2 = this.f179630a.f160920b;
        Log.m105924i(str2, "onReceiveValue value" + str);
        if (!Util.isNullOrNil(str)) {
            C104289g gVar = new C104289g(str);
            FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter2 = this.f179630a;
            int optInt = gVar.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            gVar.optString("appId");
            gVar.optString("path");
            gVar.optString("shopWindowId");
            gVar.optString("sceneNote");
            gVar.optInt("shareMode");
            gVar.optLong("productId");
            if (optInt == 0 && (finderLiveShoppingManagerPresenter = ((C64994a) C39818r.f106831a.mo62443b(finderLiveShoppingManagerPresenter2.f160919a).mo75002a(C64994a.class)).f187118d) != null) {
                FinderLiveService.f159376d.getClass();
                C45795b bVar = FinderLiveService.f159348A;
                v44 v44 = finderLiveShoppingManagerPresenter.f160924f;
                if (bVar != null && v44 != null) {
                    Activity activity = finderLiveShoppingManagerPresenter.f160919a;
                    C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveShoppingManagerUI");
                    C53895h.m60466d(((FinderLiveShoppingManagerUI) activity).f159014o, (C66212f) null, (C53934p0) null, new C63307c(finderLiveShoppingManagerPresenter, bVar, v44, (C15601d<? super C63307c>) null), 3, (Object) null);
                }
            }
        }
    }
}
