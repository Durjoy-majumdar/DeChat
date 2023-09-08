package ar1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dp1.C58384l1;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CountDownLatch;
import je1.C46540v;
import je1.C60799f4;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import te3.C64268br3;
import te3.C64365fh0;
import te3.C64657qh1;
import up1.C37521f;
import up1.C65420m;
import uq1.C65437f;
import uq1.C65446j;
import uq1.C65447k;
import uq1.C65449m;
import vp1.C65834e;
import wp1.C15585f;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: ar1.c */
public final class C54319c extends C66177f implements C11385n {

    /* renamed from: h */
    public FinderItem f152449h;

    /* renamed from: i */
    public byte[] f152450i;

    /* renamed from: j */
    public final String f152451j;

    /* renamed from: n */
    public C66408e f152452n;

    /* renamed from: o */
    public CountDownLatch f152453o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54319c(FinderItem finderItem, byte[] bArr) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        this.f152449h = finderItem;
        this.f152450i = bArr;
        this.f152451j = "LogPost.FinderPostCgiStage";
        this.f152452n = new C54324i(finderItem, 2);
        this.f152453o = new CountDownLatch(1);
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
        C64365fh0 fh03;
        String str4 = this.f152451j;
        Log.m105924i(str4, "start localId:" + this.f152449h.getLocalId());
        C15585f.C15586a aVar = C15585f.f42211a;
        if (!aVar.mo14344g(this.f152449h.getLocalId())) {
            return new C54324i(this.f152449h, 1);
        }
        String str5 = this.f152451j;
        Log.m105924i(str5, "doPostScene " + this.f152449h.getLocalId());
        boolean isLongVideo = this.f152449h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 23, 1);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523 : 0) > 0) {
                nVar.mo175913w(1253 == 1253 ? 1523 : 0, 23, 1);
            }
        }
        this.f152449h.trackPost("doPostScene");
        FinderItem finderItem = this.f152449h;
        FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postStage = 4;
        }
        aVar.mo14345h(finderItem);
        FinderItem finderItem2 = this.f152449h;
        String str6 = finderItem2.getPostInfo().f185645d;
        String str7 = "";
        C60799f4 f4Var = new C60799f4(finderItem2, str6 == null ? str7 : str6, this.f152449h.getLocalId(), this.f152450i);
        C64268br3 br32 = this.f152449h.getPostInfo().f185657s;
        if (!Util.isNullOrNil(br32 != null ? br32.f182331f : null)) {
            FinderItem finderItem3 = this.f152449h;
            FinderObjectDesc finderObjectDesc = finderItem3.getFeedObject().objectDesc;
            int i = 0;
            if (((finderObjectDesc == null || (fh03 = finderObjectDesc.client_draft_ext_info) == null) ? 0 : fh03.f183133d) != 0) {
                Log.m105924i(this.f152451j, "dealDumpCgi has done, continue post");
                C64657qh1 qh12 = f4Var.f173175o;
                FinderObjectDesc finderObjectDesc2 = finderItem3.getFeedObject().objectDesc;
                if (!(finderObjectDesc2 == null || (fh02 = finderObjectDesc2.client_draft_ext_info) == null)) {
                    i = fh02.f183133d;
                }
                qh12.f185012C = i;
                mo75106h(f4Var);
            } else {
                C64268br3 br33 = finderItem3.getPostInfo().f185657s;
                String str8 = finderItem3.getPostInfo().f185645d;
                if (str8 == null) {
                    str8 = str7;
                }
                if (br33 == null || (str = br33.f182331f) == null) {
                    str = str7;
                }
                if (br33 == null || (str2 = br33.f182329d) == null) {
                    str2 = str7;
                }
                if (!(br33 == null || (str3 = br33.f182330e) == null)) {
                    str7 = str3;
                }
                new C46540v(str8, str, str2, str7).mo9225i().mo123420E(new C54318b(finderItem3, this, f4Var));
            }
        } else {
            mo75106h(f4Var);
        }
        this.f152453o.await();
        return this.f152452n;
    }

    /* renamed from: h */
    public final boolean mo75106h(C60799f4 f4Var) {
        String str = this.f152451j;
        Log.m105924i(str, "doPostSceneContinue finderObj_waitType: " + this.f152449h.getPostInfo().f185658t + ", request_waitType:" + f4Var.f173175o.f185012C);
        C37521f.f99374d.getClass();
        if (C37521f.f99562y.mo60266n().intValue() == 3) {
            this.f152452n = new C54324i(this.f152449h, 2);
            this.f152453o.countDown();
            return false;
        }
        C86709a0.m107529k().f251779b.mo123455a(3585, this);
        return C86709a0.m107524d().mo123461g(f4Var, 0);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        FinderFeedReportObject finderFeedReportObject;
        FinderFeedReportObject finderFeedReportObject2;
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        C86709a0.m107529k().f251779b.mo123470p(3585, this);
        C87412m.m108592e(yVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderPost");
        C60799f4 f4Var = (C60799f4) yVar2;
        String str2 = f4Var.f173171h;
        Log.m105925i(this.f152451j, "errType %d, errCode %d, errMsg %s, clientId %s", Integer.valueOf(i), Integer.valueOf(i2), str, str2);
        if (!str2.equals(this.f152449h.getPostInfo().f185645d)) {
            Log.m105928w(this.f152451j, "not my feed!");
            return;
        }
        this.f152449h.trackPost("doPostSceneEnd");
        if (i3 == 0 && i4 == 0) {
            FinderItem e = C65834e.f189316a.mo89871e(f4Var.f173176p.f164794id);
            long j = 0;
            if (!(e == null || (finderFeedReportObject2 = e.field_reportObject) == null)) {
                int i5 = finderFeedReportObject2.postTaskCost;
                long j2 = this.f190193g;
                if (j2 == 0) {
                    j2 = C31543z5.m39453c() - this.f190192f;
                }
                finderFeedReportObject2.postTaskCost = i5 + ((int) j2);
            }
            if (!(e == null || (finderFeedReportObject = e.field_reportObject) == null)) {
                C65449m.f188332a.mo89571k(finderFeedReportObject, "postSuccess");
            }
            C65437f fVar = C65437f.f188296h;
            long localId = this.f152449h.getLocalId();
            long j3 = f4Var.f173176p.f164794id;
            fVar.getClass();
            C61926c.m72668M(new C65447k(fVar, localId, j3, true));
            if (this.f152449h.getPostInfo().f185651j > 0) {
                long a = C31543z5.m39451a() - this.f152449h.getPostInfo().f185651j;
                boolean isLongVideo = this.f152449h.isLongVideo();
                C58384l1 l1Var = C58384l1.f167282a;
                l1Var.mo83217a(1253, 11, 1, isLongVideo);
                l1Var.mo83217a(1253, 12, a, isLongVideo);
            }
            FinderObjectDesc finderObjectDesc = f4Var.f173175o.f185018e;
            if ((finderObjectDesc != null ? finderObjectDesc.draftObjectId : 0) != 0) {
                C65420m mVar = C65420m.f188268a;
                if (finderObjectDesc != null) {
                    j = finderObjectDesc.draftObjectId;
                }
                mVar.mo89521c(j);
            }
            this.f152452n = new C54321e(this.f152449h);
            this.f152453o.countDown();
            return;
        }
        long localId2 = this.f152449h.getLocalId();
        Log.m105924i("Finder.FinderPostReportLogic", "savePostError " + localId2 + ", " + i3 + ", " + i4);
        C15585f.C15586a aVar = C15585f.f42211a;
        FinderItem d = aVar.mo14341d(localId2);
        if (d != null) {
            FinderFeedReportObject finderFeedReportObject3 = d.field_reportObject;
            if (finderFeedReportObject3 != null) {
                finderFeedReportObject3.cgiErrorType = i3;
            }
            if (finderFeedReportObject3 != null) {
                finderFeedReportObject3.cgiErrorCode = i4;
            }
            aVar.mo14345h(d);
        }
        if (this.f152449h.isPostFailed()) {
            C65437f fVar2 = C65437f.f188296h;
            long localId3 = this.f152449h.getLocalId();
            fVar2.getClass();
            C61926c.m72668M(new C65446j(fVar2, localId3, false));
        }
        this.f152452n = new C54324i(this.f152449h, 2);
        this.f152453o.countDown();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54319c(FinderItem finderItem, byte[] bArr, int i, C8480h hVar) {
        this(finderItem, (i & 2) != 0 ? null : bArr);
    }
}
