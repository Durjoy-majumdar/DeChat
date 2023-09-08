package cr1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58384l1;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import je1.C60799f4;
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
import up1.C65420m;
import uq1.C65437f;
import uq1.C65446j;
import uq1.C65447k;
import wp1.C15585f;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: cr1.c */
public final class C57979c extends C66177f implements C11385n {

    /* renamed from: h */
    public final FinderItem f165909h;

    /* renamed from: i */
    public final String f165910i = "LogPost.MvPostCgiStage";

    /* renamed from: j */
    public C66408e f165911j;

    /* renamed from: n */
    public CountDownLatch f165912n;

    /* renamed from: o */
    public final HashSet<C60817z2> f165913o;

    /* renamed from: p */
    public boolean f165914p;

    /* renamed from: q */
    public final C11385n f165915q;

    /* renamed from: cr1.c$a */
    public static final class C57980a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C57979c f165916d;

        public C57980a(C57979c cVar) {
            this.f165916d = cVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2;
            T t;
            if ((yVar instanceof C60817z2) && this.f165916d.f165913o.contains(yVar)) {
                this.f165916d.f165913o.remove(yVar);
                if (i == 0 && i2 == 0) {
                    C60817z2 z2Var = (C60817z2) yVar;
                    C47465a aVar = z2Var.f173218i.f127056b.f127083a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
                    FinderObject finderObject = ((C49705hh1) aVar).f134654d;
                    Iterator<T> it = this.f165916d.f165909h.getClipListExt().iterator();
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
                    C57979c cVar = this.f165916d;
                    cVar.getClass();
                    C15585f.f42211a.mo14347j(cVar.f165909h);
                } else {
                    this.f165916d.f165914p = true;
                }
                if (this.f165916d.f165913o.isEmpty()) {
                    C57979c cVar2 = this.f165916d;
                    if (!cVar2.f165914p) {
                        cVar2.mo82773h();
                        return;
                    }
                }
                if (this.f165916d.f165913o.isEmpty()) {
                    C57979c cVar3 = this.f165916d;
                    if (cVar3.f165914p) {
                        cVar3.f165911j = new C57985h(cVar3.f165909h, 2);
                        cVar3.f165912n.countDown();
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57979c(FinderItem finderItem) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        this.f165909h = finderItem;
        this.f165911j = new C57985h(finderItem, 2);
        this.f165912n = new CountDownLatch(1);
        this.f165913o = new HashSet<>();
        this.f165915q = new C57980a(this);
    }

    /* renamed from: a */
    public int mo75100a() {
        return 4;
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        C86709a0.m107524d().mo123470p(6649, this.f165915q);
    }

    /* renamed from: e */
    public void mo75103e(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        C86709a0.m107524d().mo123470p(6649, this.f165915q);
    }

    /* renamed from: f */
    public void mo75104f(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        C86709a0.m107524d().mo123470p(6649, this.f165915q);
    }

    /* renamed from: g */
    public C66408e mo75105g() {
        T t;
        Log.m105924i(this.f165910i, "start localId:" + this.f165909h.getLocalId());
        C15585f.C15586a aVar = C15585f.f42211a;
        if (!aVar.mo14344g(this.f165909h.getLocalId())) {
            return new C57985h(this.f165909h, 1);
        }
        Log.m105924i(this.f165910i, "doMvPostScene " + this.f165909h.getLocalId());
        boolean isLongVideo = this.f165909h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 23, 1);
        if (isLongVideo) {
            nVar.mo175913w(1523, 23, 1);
        }
        this.f165909h.trackPost("doMvPostScene");
        FinderItem finderItem = this.f165909h;
        FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postStage = 7;
        }
        aVar.mo14347j(finderItem);
        FinderObjectDesc finderObjectDesc = this.f165909h.getFeedObject().objectDesc;
        C64417hb1 hb12 = finderObjectDesc != null ? finderObjectDesc.mvInfo : null;
        if (hb12 == null) {
            return new C57985h(this.f165909h, 2);
        }
        C86709a0.m107524d().mo123455a(6649, this.f165915q);
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
            Iterator<T> it = this.f165909h.getClipListExt().iterator();
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
                this.f165913o.add(new C60817z2(finderItem2, mb12, (C49712hj1) null, 4, (C8480h) null));
            }
        }
        if (!this.f165913o.isEmpty()) {
            Iterator<C60817z2> it4 = this.f165913o.iterator();
            while (it4.hasNext()) {
                C86709a0.m107524d().mo123460f(it4.next());
            }
        } else {
            mo82773h();
        }
        this.f165912n.await();
        return this.f165911j;
    }

    /* renamed from: h */
    public final void mo82773h() {
        C15585f.C15586a aVar = C15585f.f42211a;
        if (aVar.mo14344g(this.f165909h.getLocalId())) {
            boolean isLongVideo = this.f165909h.isLongVideo();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1253, 23, 1);
            if (isLongVideo) {
                nVar.mo175913w(1523, 23, 1);
            }
            this.f165909h.trackPost("doMvPostScene");
            FinderItem finderItem = this.f165909h;
            FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.postStage = 4;
            }
            aVar.mo14347j(finderItem);
            FinderItem finderItem2 = this.f165909h;
            String str = finderItem2.getPostInfo().f185645d;
            if (str == null) {
                str = "";
            }
            C60799f4 f4Var = new C60799f4(finderItem2, str, this.f165909h.getLocalId(), (byte[]) null);
            C37521f.f99374d.getClass();
            if (C37521f.f99562y.mo60266n().intValue() == 3) {
                this.f165911j = new C57985h(this.f165909h, 2);
                this.f165912n.countDown();
                return;
            }
            C86709a0.m107529k().f251779b.mo123455a(3585, this);
            C86709a0.m107524d().mo123461g(f4Var, 0);
            return;
        }
        Log.m105924i(this.f165910i, "post before doScene cancel because feed is deleted");
        this.f165911j = new C57985h(this.f165909h, 2);
        this.f165912n.countDown();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        C86709a0.m107529k().f251779b.mo123470p(3585, this);
        C87412m.m108592e(yVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderPost");
        C60799f4 f4Var = (C60799f4) yVar2;
        String str2 = f4Var.f173171h;
        Log.m105925i(this.f165910i, "errType %d, errCode %d, errMsg %s, clientId %s", Integer.valueOf(i), Integer.valueOf(i2), str, str2);
        if (!str2.equals(this.f165909h.getPostInfo().f185645d)) {
            Log.m105928w(this.f165910i, "not my feed!");
            return;
        }
        this.f165909h.trackPost("doPostSceneEnd");
        if (i3 == 0 && i4 == 0) {
            C65437f fVar = C65437f.f188296h;
            long localId = this.f165909h.getLocalId();
            long j = f4Var.f173176p.f164794id;
            fVar.getClass();
            C61926c.m72668M(new C65447k(fVar, localId, j, true));
            long j2 = 0;
            if (this.f165909h.getPostInfo().f185651j > 0) {
                long a = C31543z5.m39451a() - this.f165909h.getPostInfo().f185651j;
                boolean isLongVideo = this.f165909h.isLongVideo();
                C58384l1 l1Var = C58384l1.f167282a;
                l1Var.mo83217a(1253, 11, 1, isLongVideo);
                l1Var.mo83217a(1253, 12, a, isLongVideo);
            }
            FinderObjectDesc finderObjectDesc = f4Var.f173175o.f185018e;
            if ((finderObjectDesc != null ? finderObjectDesc.draftObjectId : 0) != 0) {
                C65420m mVar = C65420m.f188268a;
                if (finderObjectDesc != null) {
                    j2 = finderObjectDesc.draftObjectId;
                }
                mVar.mo89521c(j2);
            }
            this.f165911j = new C57982e(this.f165909h);
            this.f165912n.countDown();
            return;
        }
        long localId2 = this.f165909h.getLocalId();
        Log.m105924i("Finder.FinderPostReportLogic", "savePostError " + localId2 + ", " + i3 + ", " + i4);
        C15585f.C15586a aVar = C15585f.f42211a;
        FinderItem d = aVar.mo14341d(localId2);
        if (d != null) {
            FinderFeedReportObject finderFeedReportObject = d.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.cgiErrorType = i3;
            }
            if (finderFeedReportObject != null) {
                finderFeedReportObject.cgiErrorCode = i4;
            }
            aVar.mo14345h(d);
        }
        if (this.f165909h.isPostFailed()) {
            C65437f fVar2 = C65437f.f188296h;
            long localId3 = this.f165909h.getLocalId();
            fVar2.getClass();
            C61926c.m72668M(new C65446j(fVar2, localId3, false));
        }
        this.f165911j = new C57985h(this.f165909h, 2);
        this.f165912n.countDown();
    }
}
