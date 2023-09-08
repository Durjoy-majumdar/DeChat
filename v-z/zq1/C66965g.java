package zq1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58381l;
import dp1.C58386m;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CountDownLatch;
import je1.C46540v;
import je1.C60814y2;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import te3.C49705hh1;
import te3.C49712hj1;
import te3.C64268br3;
import te3.C64365fh0;
import te3.C64736tq2;
import up1.C37521f;
import up1.C65418l;
import uq1.C65437f;
import uq1.C65443g;
import uq1.C65444h;
import uq1.C65449m;
import wp1.C15585f;
import wp1.C66166c;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: zq1.g */
public final class C66965g extends C66177f implements C11385n {

    /* renamed from: h */
    public C65418l f192390h;

    /* renamed from: i */
    public byte[] f192391i;

    /* renamed from: j */
    public final String f192392j = "LogPost.FinderDraftPostCgiStage";

    /* renamed from: n */
    public final FinderItem f192393n;

    /* renamed from: o */
    public C66408e f192394o;

    /* renamed from: p */
    public CountDownLatch f192395p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66965g(C65418l lVar, byte[] bArr) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        this.f192390h = lVar;
        this.f192391i = bArr;
        this.f192393n = lVar.mo89514l2();
        this.f192394o = new C66961c(this.f192390h, 2);
        this.f192395p = new CountDownLatch(1);
    }

    /* renamed from: a */
    public int mo75100a() {
        return 4;
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: e */
    public void mo75103e(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: f */
    public void mo75104f(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: g */
    public C66408e mo75105g() {
        String str;
        String str2;
        String str3;
        C64365fh0 fh02;
        String str4 = this.f192392j;
        Log.m105924i(str4, "start localId:" + this.f192393n.getLocalId());
        boolean z = true;
        int i = 0;
        if (!(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90229qq(this.f192390h.field_localId) != null)) {
            return new C66961c(this.f192390h, 1);
        }
        String str5 = this.f192392j;
        Log.m105924i(str5, "doPostScene " + this.f192390h.field_localId);
        boolean isLongVideo = this.f192393n.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1718, 23, 1);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719 : 0) > 0) {
                nVar.mo175913w(1718 == 1718 ? 1719 : 0, 23, 1);
            }
        }
        this.f192393n.trackDraftPost("doPostScene");
        FinderFeedReportObject finderFeedReportObject = this.f192393n.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postStage = 4;
        }
        C66166c.f190172a.mo90231b(this.f192390h);
        String str6 = this.f192393n.getPostInfo().f185645d;
        if (!(str6 == null || str6.length() == 0)) {
            z = false;
        }
        if (z) {
            C64736tq2 postInfo = this.f192393n.getPostInfo();
            postInfo.f185645d = "FinderLocal_feed_" + System.nanoTime();
        }
        C64268br3 br32 = this.f192393n.getPostInfo().f185657s;
        if (!Util.isNullOrNil(br32 != null ? br32.f182331f : null)) {
            FinderObjectDesc finderObjectDesc = this.f192393n.getFeedObject().objectDesc;
            if (!(finderObjectDesc == null || (fh02 = finderObjectDesc.client_draft_ext_info) == null)) {
                i = fh02.f183133d;
            }
            if (i == 0) {
                FinderItem finderItem = this.f192393n;
                C64268br3 br33 = finderItem.getPostInfo().f185657s;
                String str7 = finderItem.getPostInfo().f185645d;
                String str8 = "";
                if (str7 == null) {
                    str7 = str8;
                }
                if (br33 == null || (str = br33.f182331f) == null) {
                    str = str8;
                }
                if (br33 == null || (str2 = br33.f182329d) == null) {
                    str2 = str8;
                }
                if (!(br33 == null || (str3 = br33.f182330e) == null)) {
                    str8 = str3;
                }
                new C46540v(str7, str, str2, str8).mo9225i().mo123420E(new C66964f(finderItem, this));
                this.f192395p.await();
                return this.f192394o;
            }
        }
        mo90946h();
        this.f192395p.await();
        return this.f192394o;
    }

    /* renamed from: h */
    public final boolean mo90946h() {
        C37521f.f99374d.getClass();
        if (C37521f.f99562y.mo60266n().intValue() == 3) {
            this.f192394o = new C66961c(this.f192390h, 2);
            this.f192395p.countDown();
            return false;
        }
        C65418l lVar = this.f192390h;
        String str = this.f192393n.getPostInfo().f185645d;
        if (str == null) {
            str = "";
        }
        C60814y2 y2Var = new C60814y2(lVar, str, (C49712hj1) null, this.f192391i, 4, (C8480h) null);
        C86709a0.m107529k().f251779b.mo123455a(6649, this);
        return C86709a0.m107524d().mo123461g(y2Var, 0);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        C86709a0.m107529k().f251779b.mo123470p(6649, this);
        C87412m.m108592e(yVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderDraftPost2");
        C60814y2 y2Var = (C60814y2) yVar2;
        String str2 = y2Var.f173201h;
        boolean z = true;
        Log.m105925i(this.f192392j, "errType %d, errCode %d, errMsg %s, clientId %s", Integer.valueOf(i), Integer.valueOf(i2), str, str2);
        if (!str2.equals(this.f192393n.getPostInfo().f185645d)) {
            Log.m105928w(this.f192392j, "not my feed!");
            return;
        }
        this.f192393n.trackDraftPost("doPostSceneEnd");
        C47465a aVar = y2Var.f173202i.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
        FinderObject finderObject = ((C49705hh1) aVar).f134654d;
        String str3 = this.f192392j;
        StringBuilder sb = new StringBuilder();
        sb.append("svrFinderObj id:");
        sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
        sb.append(", localId:");
        sb.append(this.f192390h.field_localId);
        Log.m105924i(str3, sb.toString());
        if (i3 == 0 && i4 == 0 && finderObject != null) {
            FinderFeedReportObject finderFeedReportObject = this.f192393n.field_reportObject;
            if (finderFeedReportObject != null) {
                int i5 = finderFeedReportObject.postTaskCost;
                long j = this.f190193g;
                if (j == 0) {
                    j = C31543z5.m39453c() - this.f190192f;
                }
                finderFeedReportObject.postTaskCost = i5 + ((int) j);
            }
            FinderFeedReportObject finderFeedReportObject2 = this.f192393n.field_reportObject;
            if (finderFeedReportObject2 != null) {
                C65449m.f188332a.mo89571k(finderFeedReportObject2, "postSuccess");
            }
            C58381l.f167278a.mo83215a(this.f192390h);
            C66166c.f190172a.mo90232c(this.f192390h, finderObject);
            C65437f fVar = C65437f.f188296h;
            long j2 = this.f192390h.field_localId;
            long j3 = finderObject.f164794id;
            fVar.getClass();
            C61926c.m72668M(new C65444h(fVar, j2, j3, true));
            if (this.f192393n.getPostInfo().f185651j > 0) {
                long a = C31543z5.m39451a() - this.f192393n.getPostInfo().f185651j;
                boolean isLongVideo = this.f192393n.isLongVideo();
                C58386m mVar = C58386m.f167284a;
                mVar.mo83220a(1718, 11, 1, isLongVideo);
                mVar.mo83220a(1718, 12, a, isLongVideo);
            }
            this.f192394o = new C66960b(this.f192390h);
            this.f192395p.countDown();
            return;
        }
        C58386m.C58388b bVar = C58386m.C58388b.f167286a;
        bVar.mo83223b(this.f192393n.isLongVideo());
        if (((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90229qq(this.f192390h.field_localId) != null) {
            if (i3 == 4) {
                C65418l lVar = this.f192390h;
                lVar.field_localFlag = (lVar.field_localFlag | 2) & -2;
                C66166c.f190172a.mo90231b(lVar);
                bVar.mo83222a(this.f192393n.isLongVideo());
            }
            C65418l lVar2 = this.f192390h;
            if ((lVar2.field_localFlag & 2) == 0) {
                z = false;
            }
            if (z) {
                long j4 = lVar2.field_localId;
                Log.m105924i("Finder.FinderPostReportLogic", "savePostError " + j4 + ", " + i3 + ", " + i4);
                C15585f.C15586a aVar2 = C15585f.f42211a;
                FinderItem d = aVar2.mo14341d(j4);
                if (d != null) {
                    FinderFeedReportObject finderFeedReportObject3 = d.field_reportObject;
                    if (finderFeedReportObject3 != null) {
                        finderFeedReportObject3.cgiErrorType = i3;
                    }
                    if (finderFeedReportObject3 != null) {
                        finderFeedReportObject3.cgiErrorCode = i4;
                    }
                    aVar2.mo14345h(d);
                }
                C58381l.f167278a.mo83215a(this.f192390h);
                C65437f fVar2 = C65437f.f188296h;
                long j5 = this.f192390h.field_localId;
                fVar2.getClass();
                C61926c.m72668M(new C65443g(fVar2, j5, false));
            }
        } else {
            Log.m105924i(this.f192392j, "deleted when scene end.");
        }
        this.f192394o = new C66961c(this.f192390h, 2);
        this.f192395p.countDown();
    }
}
