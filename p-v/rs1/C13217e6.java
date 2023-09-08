package rs1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import dp1.C58368h1;
import dp1.C58403t;
import dp1.C58417y0;
import dp1.C7438g1;
import ef1.C58564i;
import ef1.C7645n;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C9508q;
import rs1.C13442s8;
import sx3.C110818d0;
import te3.C64689rq2;

/* renamed from: rs1.e6 */
public final class C13217e6 {

    /* renamed from: a */
    public static final C13217e6 f37554a = new C13217e6();

    /* renamed from: a */
    public final void mo12700a(Context context, BaseFinderFeed baseFinderFeed, FinderMediaLayout finderMediaLayout) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "baseFinderFeed");
        C87412m.m108594g(finderMediaLayout, "mediaLayout");
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(context);
        if (f != null) {
            C58403t k3 = f.mo12855k3(-1);
            C7438g1 g1Var = (C7438g1) f.mo12854j3(-1);
            if (g1Var != null) {
                if (k3 instanceof C58368h1) {
                    C7645n nVar = new C7645n(6);
                    nVar.f25952c = 0;
                    nVar.f25953d = 0;
                    nVar.f25954e = 0;
                    nVar.f25955f = 0;
                    nVar.f25956g = 1;
                    nVar.f25957h = 6;
                    nVar.f25958i = baseFinderFeed.getItemId();
                    nVar.f25959j = 0;
                    LinkedList<C64689rq2> mediaList = baseFinderFeed.mo3513o().getMediaList();
                    View findViewById = finderMediaLayout.findViewById(C0966R.C0970id.ol9);
                    C87412m.m108593f(findViewById, "findViewById(R.id.finder_media_banner)");
                    C64689rq2 rq22 = (C64689rq2) C110818d0.m150917O(mediaList, ((FinderBaseMediaBanner) findViewById).getFocusPosition());
                    nVar.f25960k = FeedData.Companion.mo78883a(baseFinderFeed);
                    nVar.f25964l = g1Var.f25628s;
                    nVar.f25965m = g1Var.f167611e;
                    nVar.f25966n = g1Var.f167612f;
                    C58564i iVar = new C58564i(baseFinderFeed, 0, (C9508q) null, 4, (C8480h) null);
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(iVar);
                    nVar.f25967o = linkedList;
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(iVar);
                    nVar.f25968p = linkedList2;
                    g1Var.f25628s = nVar.f25958i;
                    g1Var.f167611e = nVar.f25953d;
                    g1Var.f167612f = nVar.f25955f;
                    ((C58368h1) k3).mo2331B1(nVar);
                }
                ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(baseFinderFeed.mo3513o().getFeedObject(), ((MMFinderUI) context).mo2194I7());
                C13442s8 f2 = aVar.mo12873f(context);
                if (f2 != null) {
                    long j = baseFinderFeed.mo3513o().getFeedObject().f164794id;
                    FinderContact finderContact = baseFinderFeed.mo3513o().getFeedObject().contact;
                    f2.mo12848O3(j, finderContact != null ? finderContact.username : null);
                }
            }
        }
    }
}
