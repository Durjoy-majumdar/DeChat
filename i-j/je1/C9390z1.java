package je1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C52136ym0;
import te3.C52283zm0;

/* renamed from: je1.z1 */
public final class C9390z1 extends C89132b<C52283zm0> {
    public C9390z1(FinderItem finderItem, int i, C89349b bVar, C89349b bVar2) {
        C87412m.m108594g(finderItem, "feedObject");
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        C52136ym0 ym02 = new C52136ym0();
        ym02.f145394e = finderItem.field_username;
        ym02.f145395f = i;
        ym02.f145396g = bVar;
        ym02.f145397h = finderItem.field_id;
        ym02.f145398i = finderItem.getObjectNonceId();
        ym02.f145399j = bVar2;
        ym02.f145393d = C46523h2.f125330a.mo71859a(3593);
        bVar3.f127066a = ym02;
        C52283zm0 zm02 = new C52283zm0();
        zm02.setBaseResponse(new C49966ja());
        zm02.getBaseResponse().f135956e = new C51163rv3();
        bVar3.f127067b = zm02;
        bVar3.f127068c = "/cgi-bin/micromsg-bin/findergetfeedlikedlist";
        bVar3.f127069d = 3593;
        mo123453j(bVar3.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("CgiGetFinderFeedLikedList init finderUsername=");
        sb.append(finderItem.field_username);
        sb.append(" scene=");
        sb.append(i);
        sb.append(" lastBuffer=");
        sb.append(bVar != null);
        Log.m105924i("Finder.CgiGetFinderFeedLikedList", sb.toString());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        Log.m105924i("Finder.CgiGetFinderFeedLikedList", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " resp=" + ((C52283zm0) eu32) + " thread=" + Thread.currentThread());
    }
}
