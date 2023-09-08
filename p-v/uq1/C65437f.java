package uq1;

import android.os.Process;
import bd1.C54446b;
import bl3.C39818r;
import com.tencent.p014mm.autogen.events.FeedPostProgressEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dp1.C58408t0;
import eb0.C31543z5;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fp1.C59266a;
import fp1.C59267b;
import fp1.C59268c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.LinkedList;
import o40.C61926c;
import os1.C62153d;
import p707tz.C65002h;
import qo1.C12899g;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64267br2;
import te3.C64447ih1;
import te3.C64477jr2;
import te3.C64532lq2;
import te3.C64589nq2;
import te3.C64621p23;
import te3.C64689rq2;
import te3.C64736tq2;
import tf0.C13887q1;
import u60.C65220d;
import u60.C65222f;
import u60.C65231j;
import u60.C65234n;
import up1.C65418l;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;
import vp1.C65840n;
import w60.C102354f;
import wp1.C15585f;
import wp1.C66166c;
import wq1.C66175d;
import xq1.C66408e;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: uq1.f */
public final class C65437f implements C12899g {

    /* renamed from: h */
    public static final C65437f f188296h = new C65437f();

    /* renamed from: i */
    public static int f188297i;

    /* renamed from: a */
    public C65222f<C14373s> f188298a = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "finderUpload"));

    /* renamed from: b */
    public C65222f<C65220d> f188299b = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "finderUploadImage"));

    /* renamed from: c */
    public final C66175d f188300c;

    /* renamed from: d */
    public final String f188301d;

    /* renamed from: e */
    public final C65442e f188302e;

    /* renamed from: f */
    public final HashSet<C65464w> f188303f;

    /* renamed from: g */
    public final HashSet<C65463v> f188304g;

    /* renamed from: uq1.f$a */
    public static final class C65438a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65463v f188305d;

        /* renamed from: e */
        public final /* synthetic */ C65437f f188306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65438a(C65463v vVar, C65437f fVar) {
            super(0);
            this.f188305d = vVar;
            this.f188306e = fVar;
        }

        public Object invoke() {
            C65463v vVar = this.f188305d;
            if (vVar != null) {
                this.f188306e.f188304g.add(vVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uq1.f$b */
    public static final class C65439b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65464w f188307d;

        /* renamed from: e */
        public final /* synthetic */ C65437f f188308e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65439b(C65464w wVar, C65437f fVar) {
            super(0);
            this.f188307d = wVar;
            this.f188308e = fVar;
        }

        public Object invoke() {
            C65464w wVar = this.f188307d;
            if (wVar != null) {
                this.f188308e.f188303f.add(wVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uq1.f$c */
    public static final class C65440c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65463v f188309d;

        /* renamed from: e */
        public final /* synthetic */ C65437f f188310e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65440c(C65463v vVar, C65437f fVar) {
            super(0);
            this.f188309d = vVar;
            this.f188310e = fVar;
        }

        public Object invoke() {
            C65463v vVar = this.f188309d;
            if (vVar != null) {
                this.f188310e.f188304g.remove(vVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uq1.f$d */
    public static final class C65441d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65464w f188311d;

        /* renamed from: e */
        public final /* synthetic */ C65437f f188312e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65441d(C65464w wVar, C65437f fVar) {
            super(0);
            this.f188311d = wVar;
            this.f188312e = fVar;
        }

        public Object invoke() {
            C65464w wVar = this.f188311d;
            if (wVar != null) {
                this.f188312e.f188303f.remove(wVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uq1.f$e */
    public static final class C65442e implements C65231j<C14373s> {
        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C87412m.m108594g((C14373s) dVar, "task");
            C87412m.m108594g(nVar, "status");
        }
    }

    public C65437f() {
        new C102354f(100);
        new LinkedList();
        new LinkedList();
        new LinkedList();
        new C102354f(100);
        new LinkedList();
        new LinkedList();
        new LinkedList();
        this.f188300c = new C66175d();
        this.f188301d = "Finder.LogPost.FinderPostManager";
        this.f188302e = new C65442e();
        this.f188303f = new HashSet<>();
        this.f188304g = new HashSet<>();
    }

    /* renamed from: a */
    public void mo12408a(String str, Object obj) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(obj, "callback");
        this.f188299b.mo89349c(new C65453p(str), (C65231j) obj);
    }

    /* renamed from: b */
    public void mo12409b(Object obj) {
        C87412m.m108594g(obj, "draft");
        if (obj instanceof C65418l) {
            String str = this.f188301d;
            StringBuilder sb = new StringBuilder();
            sb.append("Finder.PostLog repost draft ");
            C65418l lVar = (C65418l) obj;
            sb.append(lVar.field_localId);
            sb.append(", ");
            sb.append(lVar.field_objectId);
            Log.m105924i(str, sb.toString());
            C65418l qq = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90229qq(lVar.field_localId);
            if (qq == null) {
                Log.m105920e(this.f188301d, "repost draftItem empty, " + lVar.mo89515m2());
                return;
            }
            qq.field_localFlag = 1;
            FinderItem l2 = qq.mo89514l2();
            C64736tq2 postInfo = l2.getPostInfo();
            postInfo.f185646e = 0;
            postInfo.f185649h = 0;
            if (postInfo.f185647f == 2) {
                postInfo.f185647f = 0;
            }
            for (C64689rq2 rq22 : l2.getMediaList()) {
                C64477jr2 jr22 = rq22.f185281u;
                if (jr22 != null) {
                    jr22.f183837n = 0;
                }
            }
            FinderFeedReportObject finderFeedReportObject = l2.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.clickRepostCount++;
                C65449m.f188332a.mo89571k(finderFeedReportObject, "clickRepost");
            }
            if (l2.isMvFeed()) {
                for (FinderItem mediaList : l2.getClipListExt()) {
                    for (C64689rq2 rq23 : mediaList.getMediaList()) {
                        C64477jr2 jr23 = rq23.f185281u;
                        if (jr23 != null) {
                            jr23.f183837n = 0;
                        }
                    }
                }
            }
            C66166c.f190172a.mo90231b(qq);
            mo12419l();
            boolean isLongVideo = qq.mo89514l2().isLongVideo();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1718, 15, 1);
            if (isLongVideo) {
                nVar.mo175913w(1719, 15, 1);
            }
            boolean isLongVideo2 = qq.mo89514l2().isLongVideo();
            nVar.mo175913w(1718, 42, 1);
            if (isLongVideo2) {
                nVar.mo175913w(1719, 42, 1);
            }
            if (qq.mo89514l2().isLongVideo()) {
                nVar.mo175913w(1718, 53, 1);
                nVar.mo175913w(1719, 53, 1);
            }
            FeedPostProgressEvent feedPostProgressEvent = new FeedPostProgressEvent();
            FeedPostProgressEvent.C55119a aVar = feedPostProgressEvent.f154751d;
            aVar.f154752a = qq.field_localId;
            aVar.f154753b = qq.getPostInfo().f185649h;
            feedPostProgressEvent.publish();
        }
    }

    /* renamed from: c */
    public long mo12410c(Object obj, long j) {
        FinderContact finderContact;
        int i;
        LinkedList<FinderMedia> linkedList;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia first;
        String str;
        String str2;
        String str3;
        Object obj2 = obj;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(obj2, "musicData");
        if (!(obj2 instanceof C64621p23)) {
            return -1;
        }
        C64621p23 p232 = (C64621p23) obj2;
        FinderObject finderObject = p232.f184739d;
        LinkedList<FinderObject> linkedList3 = p232.f184740e;
        String str4 = p232.f184741f;
        FinderObjectDesc finderObjectDesc = finderObject != null ? finderObject.objectDesc : null;
        C58961d.C58963b bVar = C58961d.f168673a;
        C66785b bVar2 = C66785b.f191882e;
        C58969q b = bVar.mo84155b(bVar2.mo90662O5());
        C64447ih1 ih12 = new C64447ih1();
        if (finderObject == null || finderObjectDesc == null) {
            return -1;
        }
        finderObjectDesc.draftObjectId = j;
        FinderObject finderObject2 = p232.f184739d;
        if (finderObject2 != null) {
            finderObject2.f164794id = 0;
        }
        LinkedList linkedList4 = new LinkedList();
        if (!(str4 == null || str4.length() == 0)) {
            FinderMedia finderMedia = new FinderMedia();
            finderMedia.url = str4;
            finderMedia.thumbUrl = str4;
            finderMedia.mediaType = 2;
            finderObjectDesc.media.add(finderMedia);
            C64689rq2 d = C65840n.m77568d(finderMedia);
            String str5 = d.f185266d;
            if (str5 != null && C112551y.m153819s(str5, "http", false)) {
                StringBuilder sb = new StringBuilder();
                String str6 = d.f185266d;
                if (str6 == null) {
                    str6 = "";
                }
                sb.append(str6);
                String str7 = d.f185286y;
                if (str7 == null) {
                    str7 = "";
                }
                sb.append(str7);
                d.f185278r = sb.toString();
            }
            String str8 = d.f185267e;
            if (str8 != null && C112551y.m153819s(str8, "http", false)) {
                StringBuilder sb4 = new StringBuilder();
                String str9 = d.f185267e;
                if (str9 == null) {
                    str9 = "";
                }
                sb4.append(str9);
                String str10 = d.f185288z;
                if (str10 == null) {
                    str10 = "";
                }
                sb4.append(str10);
                d.f185279s = sb4.toString();
            }
            String str11 = d.f185242I;
            if (str11 != null && C112551y.m153819s(str11, "http", false)) {
                String str12 = d.f185242I;
                if (str12 == null) {
                    str12 = "";
                }
                d.f185249Q = str12;
            }
            String str13 = d.f185239F;
            if (str13 != null && C112551y.m153819s(str13, "http", false)) {
                StringBuilder sb5 = new StringBuilder();
                String str14 = d.f185239F;
                if (str14 == null) {
                    str14 = "";
                }
                sb5.append(str14);
                String str15 = d.f185240G;
                if (str15 == null) {
                    str15 = "";
                }
                sb5.append(str15);
                d.f185241H = sb5.toString();
            }
            String str16 = d.f185283w;
            if (str16 != null && C112551y.m153819s(str16, "http", false)) {
                StringBuilder sb6 = new StringBuilder();
                String str17 = d.f185283w;
                if (str17 == null) {
                    str17 = "";
                }
                sb6.append(str17);
                String str18 = d.f185234A;
                if (str18 == null) {
                    str18 = "";
                }
                sb6.append(str18);
                d.f185237D = sb6.toString();
            }
            C13598b0 b0Var = C13598b0.f38549a;
            linkedList4.add(d);
        }
        finderObject.objectType = 2;
        C58784w3.f168295a.getClass();
        finderObject.createtime = (int) (C31543z5.m39451a() / ((long) 1000));
        if (b != null) {
            finderContact = C58960c.m68835g(b);
        } else {
            finderContact = new FinderContact();
            finderContact.username = bVar2.mo90662O5();
            C54446b c = C66783a.C66784a.m78800c(bVar2, false, 1, (Object) null);
            if (c == null || (str = c.field_nickname) == null) {
                str = "";
            }
            finderContact.nickname = str;
            C54446b c2 = C66783a.C66784a.m78800c(bVar2, false, 1, (Object) null);
            if (c2 == null || (str2 = c2.field_avatarUrl) == null) {
                str2 = "";
            }
            finderContact.headUrl = str2;
            if (b == null || (str3 = b.field_signature) == null) {
                str3 = "";
            }
            finderContact.signature = str3;
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            finderContact.coverImgUrl = (String) f;
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
        finderObject.contact = finderContact;
        if (C58739j4.f168176a.mo83687P()) {
            finderObject.permissionFlag = 131;
        }
        FinderItem finderItem = new FinderItem();
        finderItem.updateFinderObject(finderObject);
        finderItem.field_clipList = new C64532lq2();
        C87412m.m108593f(linkedList3, "clipFinderObjects");
        for (FinderObject finderObject3 : linkedList3) {
            if (finderObject3 != null) {
                FinderObjectDesc finderObjectDesc2 = finderObject3.objectDesc;
                if ((finderObjectDesc2 == null || (linkedList2 = finderObjectDesc2.media) == null || (first = linkedList2.getFirst()) == null || first.mediaType != 0) ? false : true) {
                    FinderObjectDesc finderObjectDesc3 = finderObject3.objectDesc;
                    FinderMedia first2 = (finderObjectDesc3 == null || (linkedList = finderObjectDesc3.media) == null) ? null : linkedList.getFirst();
                    if (first2 != null) {
                        first2.mediaType = 4;
                    }
                }
                FinderObjectDesc finderObjectDesc4 = finderObject3.objectDesc;
                if ((finderObjectDesc4 != null && finderObjectDesc4.mediaType == 0) && finderObjectDesc4 != null) {
                    finderObjectDesc4.mediaType = 4;
                }
                FinderItem a = FinderItem.Companion.mo79056a(finderObject3, 0);
                a.setCreateTime(finderObject.createtime);
                FinderObjectDesc finderObjectDesc5 = a.getFeedObject().objectDesc;
                LinkedList<FinderMedia> linkedList5 = finderObjectDesc5 != null ? finderObjectDesc5.media : null;
                if (linkedList5 != null && linkedList5.size() > 0) {
                    C64267br2 br22 = new C64267br2();
                    for (C64689rq2 rq22 : C65840n.m77567c(linkedList5)) {
                        String str19 = rq22.f185266d;
                        if (str19 != null && C112551y.m153819s(str19, "http", false)) {
                            StringBuilder sb7 = new StringBuilder();
                            String str20 = rq22.f185266d;
                            if (str20 == null) {
                                str20 = "";
                            }
                            sb7.append(str20);
                            String str21 = rq22.f185286y;
                            if (str21 == null) {
                                str21 = "";
                            }
                            sb7.append(str21);
                            rq22.f185278r = sb7.toString();
                        }
                        String str22 = rq22.f185267e;
                        if (str22 != null && C112551y.m153819s(str22, "http", false)) {
                            StringBuilder sb8 = new StringBuilder();
                            String str23 = rq22.f185267e;
                            if (str23 == null) {
                                str23 = "";
                            }
                            sb8.append(str23);
                            String str24 = rq22.f185288z;
                            if (str24 == null) {
                                str24 = "";
                            }
                            sb8.append(str24);
                            rq22.f185279s = sb8.toString();
                        }
                        String str25 = rq22.f185242I;
                        if (str25 != null && C112551y.m153819s(str25, "http", false)) {
                            String str26 = rq22.f185242I;
                            if (str26 == null) {
                                str26 = "";
                            }
                            rq22.f185249Q = str26;
                        }
                        String str27 = rq22.f185239F;
                        if (str27 != null && C112551y.m153819s(str27, "http", false)) {
                            StringBuilder sb9 = new StringBuilder();
                            String str28 = rq22.f185239F;
                            if (str28 == null) {
                                str28 = "";
                            }
                            sb9.append(str28);
                            String str29 = rq22.f185240G;
                            if (str29 == null) {
                                str29 = "";
                            }
                            sb9.append(str29);
                            rq22.f185241H = sb9.toString();
                        }
                        String str30 = rq22.f185283w;
                        if (str30 != null && C112551y.m153819s(str30, "http", false)) {
                            StringBuilder sb10 = new StringBuilder();
                            String str31 = rq22.f185283w;
                            if (str31 == null) {
                                str31 = "";
                            }
                            sb10.append(str31);
                            String str32 = rq22.f185234A;
                            if (str32 == null) {
                                str32 = "";
                            }
                            sb10.append(str32);
                            rq22.f185237D = sb10.toString();
                        }
                        br22.f182328d.add(rq22);
                    }
                    a.field_mediaExtList = br22;
                }
                finderItem.field_clipList.f184151d.add(FinderItem.Companion.mo79059e(a));
            }
        }
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        C58408t0.f167337b = null;
        finderItem.field_reportObject = finderFeedReportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.sendOrExitButtonTime = C31543z5.m39453c();
            finderFeedReportObject.videoPostType = 2;
            i = 1;
            finderFeedReportObject.postStage = 1;
            C13598b0 b0Var3 = C13598b0.f38549a;
        } else {
            i = 1;
        }
        FinderFeedReportObject finderFeedReportObject2 = finderItem.field_reportObject;
        if (finderFeedReportObject2 != null) {
            String str33 = finderObjectDesc.description;
            finderFeedReportObject2.descCount = str33 != null ? str33.length() : 0;
            if (finderItem.field_reportObject.descCount <= 0) {
                i = 0;
            }
            finderFeedReportObject2.existDesc = i;
            C13598b0 b0Var4 = C13598b0.f38549a;
        }
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(cls).mo75002a(C62153d.class)).mo9104X0();
        ih12.f183690d = ((Number) X0.f38555d).floatValue();
        ih12.f183691e = ((Number) X0.f38556e).floatValue();
        C13598b0 b0Var5 = C13598b0.f38549a;
        C64736tq2 tq22 = new C64736tq2();
        tq22.f185645d = "FinderLocal_" + System.nanoTime();
        tq22.f185651j = C31543z5.m39451a();
        LinkedList<C64589nq2> linkedList6 = tq22.f185656r;
        if (linkedList6 != null) {
            linkedList6.clear();
            tq22.f185656r.addAll(linkedList6);
        }
        finderItem.setPostInfo(tq22);
        finderItem.setMediaExtList(linkedList4);
        finderItem.setPostWaiting();
        long Yt = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Dx0().mo13663Yt(finderItem);
        String str34 = this.f188301d;
        Log.m105924i(str34, "MV insertNewFeed " + Yt + " localId:" + Yt);
        finderItem.setLocalId(Yt);
        C61926c.m72668M(new C65448l(this, Yt));
        mo12419l();
        boolean isLongVideo = finderItem.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 15, 1);
        if (isLongVideo) {
            nVar.mo175913w(1523, 15, 1);
        }
        ((C65002h) C86312j.m106911c(C65002h.class)).mo89215pm();
        finderItem.trackPost("doMvPost");
        return Yt;
    }

    /* renamed from: d */
    public void mo12411d(String str, String str2, Object obj) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "userName");
        C87412m.m108594g(obj, "callback");
        this.f188299b.mo89349c(((C13887q1) C86312j.m106911c(C13887q1.class)).gq0(str, str2), (C65231j) obj);
    }

    /* renamed from: e */
    public void mo12412e(C65464w wVar) {
        C61926c.m72668M(new C65439b(wVar, this));
    }

    /* renamed from: f */
    public void mo12413f(Object obj) {
        Object obj2 = obj;
        C87412m.m108594g(obj2, "feed");
        if (obj2 instanceof FinderItem) {
            String str = this.f188301d;
            StringBuilder sb = new StringBuilder();
            sb.append("Finder.PostLog repost ");
            FinderItem finderItem = (FinderItem) obj2;
            sb.append(finderItem.getLocalId());
            Log.m105924i(str, sb.toString());
            FinderItem d = C15585f.f42211a.mo14341d(finderItem.getLocalId());
            if (d != null) {
                finderItem = d;
            }
            C59266a aVar = C59266a.f169452a;
            C59268c cVar = C59267b.f169453a;
            C59266a.m69196d(aVar, C59267b.f169454b, finderItem, 0, 0, 12, (Object) null);
            finderItem.setPostWaiting();
            C64736tq2 postInfo = finderItem.getPostInfo();
            postInfo.f185646e = 0;
            postInfo.f185649h = 0;
            if (postInfo.f185647f == 2) {
                postInfo.f185647f = 0;
            }
            for (C64689rq2 rq22 : finderItem.getMediaList()) {
                C64477jr2 jr22 = rq22.f185281u;
                if (jr22 != null) {
                    jr22.f183837n = 0;
                }
            }
            FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.clickRepostCount++;
                C65449m.f188332a.mo89571k(finderFeedReportObject, "clickRepost");
            }
            if (finderItem.isMvFeed()) {
                for (FinderItem mediaList : finderItem.getClipListExt()) {
                    for (C64689rq2 rq23 : mediaList.getMediaList()) {
                        C64477jr2 jr23 = rq23.f185281u;
                        if (jr23 != null) {
                            jr23.f183837n = 0;
                        }
                    }
                }
                C15585f.f42211a.mo14347j(finderItem);
            } else {
                C15585f.f42211a.mo14345h(finderItem);
            }
            mo12419l();
            boolean isLongVideo = finderItem.isLongVideo();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1253, 15, 1);
            if (isLongVideo) {
                if ((1253 == 1253 ? 1523 : 0) > 0) {
                    nVar.mo175913w(1253 == 1253 ? 1523 : 0, 15, 1);
                }
            }
            boolean isLongVideo2 = finderItem.isLongVideo();
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo175913w(1253, 42, 1);
            if (isLongVideo2) {
                nVar2.mo175913w(1523, 42, 1);
            }
            if (finderItem.isLongVideo()) {
                nVar2.mo175913w(1253, 53, 1);
                nVar2.mo175913w(1523, 53, 1);
            }
            FeedPostProgressEvent feedPostProgressEvent = new FeedPostProgressEvent();
            feedPostProgressEvent.f154751d.f154752a = finderItem.getLocalId();
            feedPostProgressEvent.f154751d.f154753b = finderItem.getPostInfo().f185649h;
            feedPostProgressEvent.publish();
        }
    }

    /* renamed from: g */
    public void mo12414g() {
        int myPid = Process.myPid();
        if (f188297i != myPid) {
            f188296h.mo12419l();
            f188297i = myPid;
        }
    }

    /* renamed from: h */
    public void mo12415h(C65463v vVar) {
        C61926c.m72668M(new C65440c(vVar, this));
    }

    /* renamed from: i */
    public void mo12416i(String str, String str2, Object obj) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "userName");
        C87412m.m108594g(obj, "callback");
        this.f188299b.mo89349c(new C65455q(str, str2), (C65231j) obj);
    }

    /* renamed from: j */
    public void mo12417j(C65464w wVar) {
        C61926c.m72668M(new C65441d(wVar, this));
    }

    /* renamed from: k */
    public void mo12418k(C65463v vVar) {
        C61926c.m72668M(new C65438a(vVar, this));
    }

    /* renamed from: l */
    public void mo12419l() {
        this.f188300c.mo90271b((C66408e) null);
    }
}
