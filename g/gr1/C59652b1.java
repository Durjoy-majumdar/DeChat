package gr1;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e03.C20502f;
import er1.C58784w3;
import gy3.C87412m;
import ht1.C60184m;
import p1081gi.C98127h;
import p682rz.C36594q;
import pl1.C62367r0;
import up1.C37521f;

/* renamed from: gr1.b1 */
public final class C59652b1 implements C20502f {

    /* renamed from: a */
    public final /* synthetic */ FinderThumbPlayerProxy.C56502b f170468a;

    /* renamed from: b */
    public final /* synthetic */ int f170469b;

    public C59652b1(FinderThumbPlayerProxy.C56502b bVar, int i) {
        this.f170468a = bVar;
        this.f170469b = i;
    }

    /* renamed from: a */
    public C98127h mo32064a(String str) {
        C87412m.m108594g(str, "id");
        FinderThumbPlayerProxy.C56502b bVar = this.f170468a;
        int i = this.f170469b;
        Class cls = C36594q.class;
        long j = bVar.f161763h.field_totalSize;
        String str2 = null;
        if (j == 0) {
            return null;
        }
        C58784w3 w3Var = C58784w3.f168295a;
        String str3 = bVar.f161759d;
        C59673q2 q2Var = bVar.f161760e;
        String str4 = q2Var.f170491a;
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        String str6 = q2Var.f170492b;
        C36594q qVar = (C36594q) C86312j.m106911c(cls);
        C59673q2 q2Var2 = bVar.f161760e;
        if (q2Var2 != null) {
            str2 = q2Var2.f170492b;
        }
        int EJ = qVar.mo60729EJ(1, str2);
        String str7 = bVar.f161763h.field_fileFormat;
        if (str7 == null) {
            str7 = str5;
        }
        String urlToken = ((C62367r0) bVar.f161760e.f170495e).getUrlToken();
        String str8 = bVar.f161760e.f170495e.mo87421f().f185284x;
        if (str8 != null) {
            str5 = str8;
        }
        String str9 = urlToken;
        boolean z = bVar.f161760e.f170495e.mo87421f().f185257U == 1;
        long j2 = bVar.f161765j;
        int i2 = i;
        Class cls2 = cls;
        int i3 = (int) ((((long) 100) * j2) / j);
        String fTPPTag = bVar.f161766n.getFTPPTag();
        w3Var.getClass();
        C87412m.m108594g(str3, "mediaId");
        C87412m.m108594g(str6, "path");
        C87412m.m108594g(fTPPTag, "tag");
        boolean Y = C37521f.f99374d.mo61171Y();
        C98127h hVar = new C98127h();
        hVar.field_mediaId = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        String str10 = str9;
        sb.append(str10);
        hVar.f287705p0 = sb.toString();
        hVar.field_fullpath = str6;
        hVar.f287700b1 = str5;
        hVar.f287665i = z;
        hVar.f287654K = 2;
        hVar.f287689V = 2;
        hVar.f287655L = 8;
        hVar.f287692W0 = i3;
        hVar.field_preloadRatio = i3;
        hVar.f287696Y0 = C60184m.C60185a.f171718a;
        hVar.f287657N = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154552g;
        hVar.field_fileType = CdnLogic.kMediaTypeAppVideo;
        hVar.f287671r = j2;
        hVar.f287698Z0 = 0;
        hVar.f287662f = bVar;
        hVar.f287656M = bVar;
        hVar.f287688U0 = String.valueOf(i2);
        if (!Y) {
            hVar.field_requestVideoFormat = EJ <= 0 ? ((C36594q) C86312j.m106911c(cls2)).mo60729EJ(1, str6) : EJ;
        } else {
            hVar.field_requestVideoFormat = 0;
            hVar.f287699a1 = str7;
        }
        Log.m105924i(fTPPTag, "[createVideoPreloadTask] finder video, isHot=" + z + " reqFormat=" + EJ + " fileFormat=" + str7 + ",isOpenMultiBitRateDownload=" + Y + ", decodeKey=" + str5 + ' ' + str10 + " mediaId=" + str3 + " url=" + hVar.f287705p0 + " preloadPercent:" + i3 + " preloadMinSize:" + j2);
        return hVar;
    }
}
