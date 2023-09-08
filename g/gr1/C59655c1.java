package gr1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e03.C20504h;
import e03.C58469b;
import gy3.C8480h;
import mr1.C25026b;
import p1081gi.C98127h;
import te3.C64689rq2;

/* renamed from: gr1.c1 */
public final class C59655c1 implements C20504h {

    /* renamed from: a */
    public final /* synthetic */ FinderThumbPlayerProxy f170478a;

    /* renamed from: b */
    public final /* synthetic */ FinderThumbPlayerProxy.C56502b f170479b;

    public C59655c1(FinderThumbPlayerProxy finderThumbPlayerProxy, FinderThumbPlayerProxy.C56502b bVar) {
        this.f170478a = finderThumbPlayerProxy;
        this.f170479b = bVar;
    }

    /* renamed from: a */
    public void mo32066a(int i, C98127h hVar) {
        int i2 = i;
        String fTPPTag = this.f170478a.getFTPPTag();
        Log.m105924i(fTPPTag, "startCdnPreload()#onStart(), real start download preload task " + FinderThumbPlayerProxy.m64984z(this.f170478a) + ' ' + i2);
        if (i2 == -1) {
            this.f170478a.mo79455b0();
        }
        if (i2 == 0) {
            C25026b Fx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0();
            long feedId = this.f170479b.f161760e.f170496f.getFeedId();
            FinderThumbPlayerProxy.C56502b bVar = this.f170479b;
            String str = bVar.f161759d;
            C64689rq2 rq22 = bVar.f161760e.f170494d;
            Fx0.mo52131h(feedId, str, new C58469b(1, 6, 0, 1, rq22 != null ? rq22.f185238E : 0, this.f170478a.getFTPPTag(), 0, 64, (C8480h) null), hVar, this.f170479b.f161763h);
        }
    }
}
