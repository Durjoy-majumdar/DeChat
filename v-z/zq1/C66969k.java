package zq1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58381l;
import dp1.C58386m;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import je1.C60814y2;
import je1.C60817z2;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import te3.C49705hh1;
import te3.C49712hj1;
import te3.C64417hb1;
import te3.C64550mb1;
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

/* renamed from: zq1.k */
public final class C66969k extends C66177f implements C11385n {

    /* renamed from: h */
    public C65418l f192400h;

    /* renamed from: i */
    public final String f192401i = "LogPost.MvDraftCgiStage";

    /* renamed from: j */
    public final FinderItem f192402j;

    /* renamed from: n */
    public C66408e f192403n;

    /* renamed from: o */
    public CountDownLatch f192404o;

    /* renamed from: p */
    public final HashSet<C60817z2> f192405p;

    /* renamed from: q */
    public boolean f192406q;

    /* renamed from: r */
    public final C11385n f192407r;

    /* renamed from: zq1.k$a */
    public static final class C66970a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C66969k f192408d;

        public C66970a(C66969k kVar) {
            this.f192408d = kVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2;
            T t;
            if ((yVar instanceof C60817z2) && this.f192408d.f192405p.contains(yVar)) {
                Log.m105925i(this.f192408d.f192401i, "clip cgi errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                this.f192408d.f192405p.remove(yVar);
                if (i == 0 && i2 == 0) {
                    C60817z2 z2Var = (C60817z2) yVar;
                    C47465a aVar = z2Var.f173218i.f127056b.f127083a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
                    FinderObject finderObject = ((C49705hh1) aVar).f134654d;
                    Iterator<T> it = this.f192408d.f192402j.getClipListExt().iterator();
                    while (true) {
                        str2 = null;
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C87412m.m108589b(((FinderItem) t).getObjectNonceId(), z2Var.f173216g.getObjectNonceId())) {
                            break;
                        }
                    }
                    FinderItem finderItem = (FinderItem) t;
                    if (finderItem != null) {
                        finderItem.getFeedObject().f164794id = finderObject != null ? finderObject.f164794id : 0;
                    }
                    C64550mb1 mb12 = z2Var.f173217h;
                    mb12.f184260f = finderObject != null ? finderObject.f164794id : 0;
                    if (finderObject != null) {
                        str2 = finderObject.objectNonceId;
                    }
                    mb12.f184261g = str2;
                    mb12.f184262h = 0;
                    C66166c.f190172a.mo90231b(this.f192408d.f192400h);
                } else {
                    this.f192408d.f192406q = true;
                }
                if (this.f192408d.f192405p.isEmpty()) {
                    C66969k kVar = this.f192408d;
                    if (!kVar.f192406q) {
                        kVar.mo90947h();
                        return;
                    }
                }
                if (this.f192408d.f192405p.isEmpty()) {
                    C66969k kVar2 = this.f192408d;
                    if (kVar2.f192406q) {
                        kVar2.f192403n = new C66961c(kVar2.f192400h, 2);
                        kVar2.f192404o.countDown();
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66969k(C65418l lVar) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        this.f192400h = lVar;
        this.f192402j = lVar.mo89514l2();
        this.f192403n = new C66961c(this.f192400h, 2);
        this.f192404o = new CountDownLatch(1);
        this.f192405p = new HashSet<>();
        this.f192407r = new C66970a(this);
    }

    /* renamed from: a */
    public int mo75100a() {
        return 4;
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        C86709a0.m107524d().mo123470p(6649, this.f192407r);
    }

    /* renamed from: e */
    public void mo75103e(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        C86709a0.m107524d().mo123470p(6649, this.f192407r);
    }

    /* renamed from: f */
    public void mo75104f(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        C86709a0.m107524d().mo123470p(6649, this.f192407r);
    }

    /* renamed from: g */
    public C66408e mo75105g() {
        T t;
        Log.m105924i(this.f192401i, "start localId:" + this.f192402j.getLocalId());
        if (!(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90229qq(this.f192400h.field_localId) != null)) {
            Log.m105924i(this.f192401i, "start but not exist: " + this.f192400h.field_localId);
            return new C66961c(this.f192400h, 1);
        }
        Log.m105924i(this.f192401i, "doMvPostScene " + this.f192400h.field_localId);
        boolean isLongVideo = this.f192402j.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1718, 23, 1);
        if (isLongVideo) {
            nVar.mo175913w(1719, 23, 1);
        }
        this.f192402j.trackPost("doMvPostScene");
        FinderItem finderItem = this.f192402j;
        FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postStage = 7;
        }
        String str = finderItem.getPostInfo().f185645d;
        if (str == null || str.length() == 0) {
            this.f192402j.getPostInfo().f185645d = "FinderLocal_" + System.nanoTime();
        }
        C66166c.f190172a.mo90231b(this.f192400h);
        FinderObjectDesc finderObjectDesc = this.f192402j.getFeedObject().objectDesc;
        C64417hb1 hb12 = finderObjectDesc != null ? finderObjectDesc.mvInfo : null;
        if (hb12 == null) {
            return new C66961c(this.f192400h, 2);
        }
        C86709a0.m107524d().mo123455a(6649, this.f192407r);
        LinkedList<C64550mb1> linkedList = new LinkedList<>();
        if (hb12.f183461j == 1) {
            LinkedList<C64550mb1> linkedList2 = hb12.f183460i;
            C87412m.m108593f(linkedList2, "mvInfo.ordered_track_list_flex_clip");
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList2) {
                if (((C64550mb1) next).f184260f == 0) {
                    arrayList.add(next);
                }
            }
            linkedList.addAll(arrayList);
        } else {
            LinkedList<C64550mb1> linkedList3 = hb12.f183455d;
            C87412m.m108593f(linkedList3, "mvInfo.orderedTrackList");
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : linkedList3) {
                if (((C64550mb1) next2).f184260f == 0) {
                    arrayList2.add(next2);
                }
            }
            linkedList.addAll(arrayList2);
        }
        for (C64550mb1 mb12 : linkedList) {
            Iterator<T> it = this.f192402j.getClipListExt().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((FinderItem) t).getObjectNonceId(), mb12.f184261g)) {
                    break;
                }
            }
            FinderItem finderItem2 = (FinderItem) t;
            if (finderItem2 != null) {
                this.f192405p.add(new C60817z2(finderItem2, mb12, (C49712hj1) null, 4, (C8480h) null));
            }
        }
        if (!this.f192405p.isEmpty()) {
            Log.m105924i(this.f192401i, "start clip cgi, size:" + this.f192405p.size());
            Iterator<C60817z2> it4 = this.f192405p.iterator();
            while (it4.hasNext()) {
                C86709a0.m107524d().mo123460f(it4.next());
            }
        } else {
            mo90947h();
        }
        this.f192404o.await();
        return this.f192403n;
    }

    /* renamed from: h */
    public final void mo90947h() {
        if (((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90229qq(this.f192400h.field_localId) != null) {
            boolean isLongVideo = this.f192402j.isLongVideo();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1718, 23, 1);
            if (isLongVideo) {
                nVar.mo175913w(1719, 23, 1);
            }
            this.f192402j.trackPost("doMvPostScene");
            FinderFeedReportObject finderFeedReportObject = this.f192402j.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.postStage = 4;
            }
            C66166c.f190172a.mo90231b(this.f192400h);
            C65418l lVar = this.f192400h;
            String str = this.f192402j.getPostInfo().f185645d;
            if (str == null) {
                str = "";
            }
            C60814y2 y2Var = new C60814y2(lVar, str, (C49712hj1) null, (byte[]) null, 12, (C8480h) null);
            C37521f.f99374d.getClass();
            if (C37521f.f99562y.mo60266n().intValue() == 3) {
                this.f192403n = new C66961c(this.f192400h, 2);
                this.f192404o.countDown();
                return;
            }
            C86709a0.m107529k().f251779b.mo123455a(6649, this);
            C86709a0.m107524d().mo123461g(y2Var, 0);
            return;
        }
        String str2 = this.f192401i;
        Log.m105924i(str2, "post before doScene cancel because feed is deleted " + this.f192400h.field_localId);
        this.f192403n = new C66961c(this.f192400h, 2);
        this.f192404o.countDown();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        if (yVar2 instanceof C60814y2) {
            C86709a0.m107529k().f251779b.mo123470p(6649, this);
            C60814y2 y2Var = (C60814y2) yVar2;
            String str2 = y2Var.f173201h;
            boolean z = true;
            Log.m105925i(this.f192401i, "errType %d, errCode %d, errMsg %s, clientId %s", Integer.valueOf(i), Integer.valueOf(i2), str, str2);
            if (!str2.equals(this.f192402j.getPostInfo().f185645d)) {
                Log.m105928w(this.f192401i, "not my feed!");
                return;
            }
            this.f192402j.trackDraftPost("doPostSceneEnd");
            C47465a aVar = y2Var.f173202i.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
            FinderObject finderObject = ((C49705hh1) aVar).f134654d;
            String str3 = this.f192401i;
            StringBuilder sb = new StringBuilder();
            sb.append("svrFinderObj id:");
            sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
            sb.append(", localId:");
            sb.append(this.f192400h.field_localId);
            Log.m105924i(str3, sb.toString());
            if (i3 == 0 && i4 == 0 && finderObject != null) {
                FinderFeedReportObject finderFeedReportObject = this.f192402j.field_reportObject;
                if (finderFeedReportObject != null) {
                    int i5 = finderFeedReportObject.postTaskCost;
                    long j = this.f190193g;
                    if (j == 0) {
                        j = C31543z5.m39453c() - this.f190192f;
                    }
                    finderFeedReportObject.postTaskCost = i5 + ((int) j);
                }
                FinderFeedReportObject finderFeedReportObject2 = this.f192402j.field_reportObject;
                if (finderFeedReportObject2 != null) {
                    C65449m.f188332a.mo89571k(finderFeedReportObject2, "postSuccess");
                }
                C58381l.f167278a.mo83215a(this.f192400h);
                C66166c.f190172a.mo90232c(this.f192400h, finderObject);
                C65437f fVar = C65437f.f188296h;
                long j2 = this.f192400h.field_localId;
                long j3 = finderObject.f164794id;
                fVar.getClass();
                C61926c.m72668M(new C65444h(fVar, j2, j3, true));
                if (this.f192402j.getPostInfo().f185651j > 0) {
                    long a = C31543z5.m39451a() - this.f192402j.getPostInfo().f185651j;
                    boolean isLongVideo = this.f192402j.isLongVideo();
                    C58386m mVar = C58386m.f167284a;
                    mVar.mo83220a(1718, 11, 1, isLongVideo);
                    mVar.mo83220a(1718, 12, a, isLongVideo);
                }
                this.f192403n = new C66960b(this.f192400h);
                this.f192404o.countDown();
                return;
            }
            C58386m.C58388b bVar = C58386m.C58388b.f167286a;
            bVar.mo83223b(this.f192402j.isLongVideo());
            if (((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90229qq(this.f192400h.field_localId) != null) {
                if (i3 == 4) {
                    C65418l lVar = this.f192400h;
                    lVar.field_localFlag = (lVar.field_localFlag | 2) & -2;
                    C66166c.f190172a.mo90231b(lVar);
                    bVar.mo83222a(this.f192402j.isLongVideo());
                }
                C65418l lVar2 = this.f192400h;
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
                    C58381l.f167278a.mo83215a(this.f192400h);
                    C65437f fVar2 = C65437f.f188296h;
                    long j5 = this.f192400h.field_localId;
                    fVar2.getClass();
                    C61926c.m72668M(new C65443g(fVar2, j5, false));
                }
            } else {
                Log.m105924i(this.f192401i, "deleted when scene end.");
            }
            this.f192403n = new C66961c(this.f192400h, 2);
            this.f192404o.countDown();
        }
    }
}
