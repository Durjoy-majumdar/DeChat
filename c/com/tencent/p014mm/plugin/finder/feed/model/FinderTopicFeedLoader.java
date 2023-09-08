package com.tencent.p014mm.plugin.finder.feed.model;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import f40.C86709a0;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import it1.C60628i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import je1.C9376s3;
import kotlin.Metadata;
import o40.C11348f;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import os1.C11755t;
import pe3.C47465a;
import pe3.C89349b;
import pf1.C62273n;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49554gf3;
import te3.C49712hj1;
import te3.C50141kk1;
import te3.C50862pq3;
import te3.C50985qn1;
import te3.C51270sn1;
import te3.C51863wp0;
import te3.C52002xp0;
import te3.C64311db1;
import te3.C64726td1;
import tf1.C13897e;
import tf1.C13899f;
import tf1.C13900g;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13913l;
import tf1.C13923t;
import u60.C14121l;
import u60.C65233m;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "e", "f", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader */
public class FinderTopicFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: z */
    public static final /* synthetic */ int f13893z = 0;

    /* renamed from: d */
    public final int f13894d;

    /* renamed from: e */
    public final String f13895e;

    /* renamed from: f */
    public final String f13896f;

    /* renamed from: g */
    public C89349b f13897g;

    /* renamed from: h */
    public C2763a f13898h = new C2763a();

    /* renamed from: i */
    public C64311db1 f13899i;

    /* renamed from: j */
    public Long f13900j;

    /* renamed from: n */
    public String f13901n = "";

    /* renamed from: o */
    public C50141kk1 f13902o;

    /* renamed from: p */
    public boolean f13903p;

    /* renamed from: q */
    public String f13904q = "";

    /* renamed from: r */
    public long f13905r;

    /* renamed from: s */
    public String f13906s = "";

    /* renamed from: t */
    public int f13907t;

    /* renamed from: u */
    public int f13908u = -1;

    /* renamed from: v */
    public boolean f13909v;

    /* renamed from: w */
    public final C11755t f13910w;

    /* renamed from: x */
    public final ConcurrentLinkedQueue<C2768e> f13911x;

    /* renamed from: y */
    public C32224a<C13598b0> f13912y;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$a */
    public final class C2763a extends C13911k<C0740i2> implements C11385n {

        /* renamed from: d */
        public C13910j<C0740i2> f13913d;

        /* renamed from: e */
        public HashSet<C117747y> f13914e = new HashSet<>();

        /* renamed from: f */
        public C65233m f13915f;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$a$a */
        public static final class C2764a extends C87413o implements C32226l<C14121l, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Object f13917d;

            /* renamed from: e */
            public final /* synthetic */ C2763a f13918e;

            /* renamed from: f */
            public final /* synthetic */ C13910j<C0740i2> f13919f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2764a(Object obj, C2763a aVar, C13910j<C0740i2> jVar) {
                super(1);
                this.f13917d = obj;
                this.f13918e = aVar;
                this.f13919f = jVar;
            }

            public Object invoke(Object obj) {
                C14121l lVar = (C14121l) obj;
                C87412m.m108594g(lVar, "task");
                Object obj2 = this.f13917d;
                if (obj2 instanceof C2768e) {
                    C2763a aVar = this.f13918e;
                    aVar.f13913d = new C2813p0(this.f13919f, lVar);
                    if (obj2 instanceof C2767d) {
                        Log.m105924i(aVar.getTAG(), "fetch requestType is Refresh");
                    } else if (obj2 instanceof C2766c) {
                        Log.m105924i(aVar.getTAG(), "fetch requestType is LoadMore");
                    }
                    ((C2768e) this.f13917d).mo2817a();
                    this.f13918e.f13914e.add(((C2768e) this.f13917d).f13923b);
                }
                return C13598b0.f38549a;
            }
        }

        public C2763a() {
        }

        public void alive() {
            super.alive();
            FinderTopicFeedLoader.this.f13903p = false;
            C65233m mVar = new C65233m("FinderTopicFeedSingleTaskExecutor");
            mVar.mo89361d();
            this.f13915f = mVar;
            C86709a0.m107524d().mo123455a(817, this);
        }

        /* renamed from: b */
        public final void mo2815b(int i, int i2, String str, C117747y yVar) {
            List incrementList;
            C0740i2 i2Var;
            if (yVar instanceof C9376s3) {
                boolean remove = this.f13914e.remove(yVar);
                String tag = getTAG();
                Log.m105924i(tag, "isRemoved :" + remove);
                if (remove) {
                    int i3 = FinderTopicFeedLoader.this.f13894d;
                    if (i3 == 7 || i3 == 12) {
                        C9376s3 s3Var = (C9376s3) yVar;
                        if (s3Var.mo10097n1() != 7 || s3Var.mo10098o1() == FinderTopicFeedLoader.this.f13907t) {
                            if (s3Var.mo10097n1() == 12) {
                                C47465a aVar = s3Var.f29271g.f127055a.f127080a;
                                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
                                if (((C51863wp0) aVar).f144202s != FinderTopicFeedLoader.this.f13905r) {
                                    String tag2 = getTAG();
                                    Log.m105924i(tag2, "activity request ignore not my tab innerTabType:" + FinderTopicFeedLoader.this.f13907t + " eventTopicId:" + FinderTopicFeedLoader.this.f13905r + " tabType: " + s3Var.mo10098o1());
                                    return;
                                }
                            }
                            if (!(s3Var.mo10097n1() == 7 || s3Var.mo10097n1() == 12)) {
                                String tag3 = getTAG();
                                Log.m105924i(tag3, "other type request if current is activity ignore!! innerTabType:" + FinderTopicFeedLoader.this.f13907t + "  tabType: " + s3Var.mo10098o1());
                                return;
                            }
                        } else {
                            String tag4 = getTAG();
                            Log.m105924i(tag4, "activity request ignore not my tab innerTabType:" + FinderTopicFeedLoader.this.f13907t + "  tabType: " + s3Var.mo10098o1());
                            return;
                        }
                    }
                    C9376s3 s3Var2 = (C9376s3) yVar;
                    C47465a aVar2 = s3Var2.f29271g.f127056b.f127083a;
                    C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    C2769f fVar = new C2769f(i, i2, ((C52002xp0) aVar2).f144789h, str);
                    String tag5 = getTAG();
                    Log.m105924i(tag5, "handleScene errType:" + i + " errCode:" + i2);
                    if (i == 0 && i2 == 0) {
                        C47465a aVar3 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        fVar.setLastBuffer(((C52002xp0) aVar3).f144786e);
                        C47465a aVar4 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        fVar.f13925b = ((C52002xp0) aVar4).f144788g;
                        LinkedList<FinderObject> m1 = s3Var2.mo10096m1();
                        ArrayList arrayList = new ArrayList(C36907w.m41090l(m1, 10));
                        for (FinderObject a : m1) {
                            FinderItem a2 = FinderItem.Companion.mo79056a(a, 64);
                            FinderTopicFeedUI.f14881D.put(Long.valueOf(a2.getId()), a2);
                            arrayList.add(C15585f.f42211a.mo14348k(a2));
                        }
                        fVar.setIncrementList(arrayList);
                        String tag6 = getTAG();
                        StringBuilder sb = new StringBuilder();
                        sb.append("handleScene incrementList :");
                        List incrementList2 = fVar.getIncrementList();
                        int i4 = 0;
                        sb.append(incrementList2 != null ? incrementList2.size() : 0);
                        sb.append(", pullType: ");
                        sb.append(s3Var2.f29274j);
                        sb.append(", hasMore: ");
                        C47465a aVar5 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        boolean z = true;
                        sb.append(((C52002xp0) aVar5).f144787f != 0);
                        Log.m105924i(tag6, sb.toString());
                        C50985qn1 qn12 = null;
                        if (s3Var2.f29276o == 4) {
                            List incrementList3 = fVar.getIncrementList();
                            if (!((incrementList3 != null ? incrementList3.size() : 0) <= 0 || (incrementList = fVar.getIncrementList()) == null || (i2Var = (C0740i2) incrementList.get(0)) == null)) {
                                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                                String p = C61926c.m72691p(baseFinderFeed.mo3513o().field_id);
                                C47465a aVar6 = s3Var2.f29271g.f127056b.f127083a;
                                C87412m.m108592e(aVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                                C51270sn1 sn12 = ((C52002xp0) aVar6).f144789h;
                                C50985qn1 qn13 = sn12 != null ? sn12.f141629s : null;
                                int i5 = qn13 != null ? qn13.f140410g : null;
                                if (i5 == null) {
                                    i5 = 0;
                                }
                                baseFinderFeed.mo3504i0(C87412m.m108589b(p, i5));
                            }
                        }
                        fVar.setPullType(s3Var2.f29274j);
                        C47465a aVar7 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar7, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        if (((C52002xp0) aVar7).f144787f == 0) {
                            z = false;
                        }
                        fVar.setHasMore(z);
                        C47465a aVar8 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar8, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        fVar.f13926c = ((C52002xp0) aVar8).f144791j;
                        C47465a aVar9 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar9, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        C49554gf3 gf32 = ((C52002xp0) aVar9).f144792n;
                        fVar.f13927d = gf32 != null ? gf32.f134025d : null;
                        C47465a aVar10 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar10, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        C51270sn1 sn13 = ((C52002xp0) aVar10).f144789h;
                        fVar.f13929f = sn13 != null ? sn13.f141627q : null;
                        C47465a aVar11 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar11, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        C51270sn1 sn14 = ((C52002xp0) aVar11).f144789h;
                        if (sn14 != null) {
                            qn12 = sn14.f141629s;
                        }
                        fVar.setBgmInfo(qn12);
                        C47465a aVar12 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        C51270sn1 sn15 = ((C52002xp0) aVar12).f144789h;
                        fVar.f13930g = sn15 != null ? sn15.f141630t : 0;
                        C47465a aVar13 = s3Var2.f29271g.f127056b.f127083a;
                        C87412m.m108592e(aVar13, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                        C51270sn1 sn16 = ((C52002xp0) aVar13).f144789h;
                        if (sn16 != null) {
                            i4 = sn16.f141632v;
                        }
                        fVar.f13931h = i4;
                        String tag7 = getTAG();
                        Log.m105918d(tag7, "onSceneEnd (" + s3Var2.f29275n + ')');
                        fVar.f13928e = s3Var2.f29275n;
                    }
                    C13910j<C0740i2> jVar = this.f13913d;
                    if (jVar != null) {
                        jVar.onFetchDone(fVar);
                    }
                }
            }
        }

        public void dead() {
            super.dead();
            C65233m mVar = this.f13915f;
            if (mVar != null) {
                mVar.reset();
            }
            this.f13915f = null;
            C86709a0.m107524d().mo123470p(817, this);
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            C65233m mVar = this.f13915f;
            if (mVar != null) {
                mVar.mo11856a(new C14121l(new C2764a(obj, this, jVar), (String) null, 2, (C8480h) null));
            }
        }

        public void fetchInit(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
            FinderTopicFeedLoader finderTopicFeedLoader = FinderTopicFeedLoader.this;
            C11755t.C11756a c3 = FinderTopicFeedLoader.this.f13910w.mo11627c3(finderTopicFeedLoader.mo2812e(finderTopicFeedLoader.f13895e));
            if (c3.f34416c == null || !(!c3.f34415b.isEmpty())) {
                jVar.onFetchDone(new C13899f());
                return;
            }
            C2769f fVar = new C2769f(0, 0, c3.f34416c, "");
            fVar.setIncrementList(c3.f34415b);
            fVar.setPullType(1000);
            jVar.onFetchDone(fVar);
        }

        public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
        }

        public void fetchRefresh(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String tag = getTAG();
            Log.m105924i(tag, "errType " + i + ", errCode " + i2 + ", errMsg " + str + " activeTabType:" + FinderTopicFeedLoader.this.f13908u + " innerTabType:" + FinderTopicFeedLoader.this.f13907t);
            FinderTopicFeedLoader finderTopicFeedLoader = FinderTopicFeedLoader.this;
            int i3 = finderTopicFeedLoader.f13894d;
            if (i3 == 7 || i3 == 12) {
                int i4 = finderTopicFeedLoader.f13908u;
                if ((i4 == -1 || i4 == finderTopicFeedLoader.f13907t) && yVar != null) {
                    mo2815b(i, i2, str, yVar);
                }
            } else if (yVar != null) {
                mo2815b(i, i2, str, yVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$b */
    public interface C2765b extends C13913l {
        /* renamed from: a */
        void mo2816a(C51270sn1 sn12);
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$c */
    public static final class C2766c extends C2768e {

        /* renamed from: c */
        public final C2814q0 f13920c;

        public C2766c(C2814q0 q0Var) {
            C87412m.m108594g(q0Var, "params");
            this.f13920c = q0Var;
            this.f13922a = "Finder.FinderTopicFeedLoader.TopicLoadMoreRequest";
        }

        /* renamed from: a */
        public void mo2817a() {
            C60628i a = this.f13920c.mo2911a();
            this.f13923b = a;
            if (a != null) {
                C86709a0.m107524d().mo123460f(this.f13923b);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("hashCode: ");
            sb.append(hashCode());
            sb.append(", type:");
            sb.append(this.f13920c.f14052a);
            sb.append(", topic:");
            sb.append(this.f13920c.f14053b);
            sb.append(", lastBuffer:");
            C89349b bVar = this.f13920c.f14060i;
            String mD5String = bVar != null ? MD5Util.getMD5String(bVar.f257327a) : null;
            if (mD5String == null) {
                mD5String = "null";
            }
            sb.append(mD5String);
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$d */
    public static final class C2767d extends C2768e {

        /* renamed from: c */
        public final C2814q0 f13921c;

        public C2767d(C2814q0 q0Var) {
            C87412m.m108594g(q0Var, "params");
            this.f13921c = q0Var;
            this.f13922a = "Finder.FinderTopicFeedLoader.TopicRefreshRequest";
        }

        /* renamed from: a */
        public void mo2817a() {
            C60628i a = this.f13921c.mo2911a();
            this.f13923b = a;
            if (a != null) {
                C86709a0.m107524d().mo123460f(this.f13923b);
            }
        }

        public String toString() {
            return "hashCode: " + hashCode() + ", type:" + this.f13921c.f14052a + ", topic:" + this.f13921c.f14053b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$e */
    public static abstract class C2768e {

        /* renamed from: a */
        public String f13922a = "Finder.FinderTopicFeedLoader.TopicRequest";

        /* renamed from: b */
        public C60628i f13923b;

        /* renamed from: a */
        public abstract void mo2817a();

        public String toString() {
            return "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$f */
    public static final class C2769f extends IResponse<C0740i2> {

        /* renamed from: a */
        public final C51270sn1 f13924a;

        /* renamed from: b */
        public long f13925b;

        /* renamed from: c */
        public C50862pq3 f13926c = new C50862pq3();

        /* renamed from: d */
        public String f13927d;

        /* renamed from: e */
        public String f13928e;

        /* renamed from: f */
        public C64726td1 f13929f;

        /* renamed from: g */
        public int f13930g;

        /* renamed from: h */
        public int f13931h;

        public C2769f(int i, int i2, C51270sn1 sn12, String str) {
            super(i, i2, str);
            this.f13924a = sn12;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$g */
    public static final class C2770g extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderTopicFeedLoader f13932a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$g$a */
        public static final class C2771a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2770g f13933d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13934e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13935f;

            /* renamed from: g */
            public final /* synthetic */ FinderTopicFeedLoader f13936g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13937h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13938i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2771a(C2770g gVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderTopicFeedLoader finderTopicFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13933d = gVar;
                this.f13934e = tVar;
                this.f13935f = cVar;
                this.f13936g = finderTopicFeedLoader;
                this.f13937h = lVar;
                this.f13938i = iResponse;
            }

            public Object invoke() {
                this.f13933d.convertOpToReason(this.f13934e, this.f13935f);
                C13900g.m13322f(this.f13936g.dispatcher(), this.f13935f, false, 2, (Object) null);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13937h;
                if (lVar != null) {
                    lVar.invoke(this.f13938i);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$g$b */
        public static final class C2772b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2770g f13939d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13940e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13941f;

            /* renamed from: g */
            public final /* synthetic */ FinderTopicFeedLoader f13942g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13943h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13944i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2772b(C2770g gVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderTopicFeedLoader finderTopicFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13939d = gVar;
                this.f13940e = tVar;
                this.f13941f = cVar;
                this.f13942g = finderTopicFeedLoader;
                this.f13943h = lVar;
                this.f13944i = iResponse;
            }

            public Object invoke() {
                this.f13939d.convertOpToReason(this.f13940e, this.f13941f);
                this.f13942g.dispatcher().mo13381g(this.f13941f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13943h;
                if (lVar != null) {
                    lVar.invoke(this.f13944i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2770g(FinderTopicFeedLoader finderTopicFeedLoader) {
            super(finderTopicFeedLoader, false, 1, (C8480h) null);
            this.f13932a = finderTopicFeedLoader;
        }

        public int findMergeIndex(ArrayList<C0740i2> arrayList, List<? extends C0740i2> list, int i, Object obj) {
            C87412m.m108594g(arrayList, "srcList");
            C87412m.m108594g(list, "newList");
            if (this.f13932a.f13894d == 4 && list.size() == 1 && (list.get(0) instanceof BaseFinderFeed)) {
                Object obj2 = list.get(0);
                C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                if (((BaseFinderFeed) obj2).mo3513o().getFeedObject().f164794id == 0) {
                    return 1;
                }
            }
            return super.findMergeIndex(arrayList, list, i, obj);
        }

        public void mergeLoadMore(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            cVar.f24952g = incrementList != null ? incrementList.isEmpty() : true;
            cVar.f24951f = iResponse.getHasMore();
            cVar.f24950e = iResponse;
            C13923t tVar = new C13923t(iResponse.getHasMore() ? 1 : 5, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null);
            String tag = this.f13932a.getTAG();
            Log.m105924i(tag, "mergeLoadMore hasMore: " + iResponse.getHasMore());
            C61926c.m72668M(new C2771a(this, tVar, cVar, this.f13932a, lVar, iResponse));
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(iResponse.getPullType() == 1 ? 3 : 4);
            C13923t tVar = new C13923t(iResponse.getPullType() == 1 ? 3 : 4, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null);
            cVar.f24951f = iResponse.getHasMore();
            cVar.f24950e = iResponse;
            String tag = this.f13932a.getTAG();
            Log.m105924i(tag, "mergeRefresh hasMore: " + iResponse.getHasMore() + ", pullType = " + iResponse.getPullType());
            C61926c.m72668M(new C2772b(this, tVar, cVar, this.f13932a, lVar, iResponse));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$h */
    public static final class C2773h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C2773h f13945d = new C2773h();

        public C2773h() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "TopicFeedLoaderRefreshCheck refreshRequest get PULL_TYPE_BOTTOM";
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$i */
    public static final class C2774i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C2774i f13946d = new C2774i();

        public C2774i() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "TopicFeedLoaderRefreshCheck refreshRequest get PULL_TYPE_INIT";
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$j */
    public static final class C2775j extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C2775j f13947d = new C2775j();

        public C2775j() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "TopicFeedLoaderRefreshCheck no requestRefresh before loadMore";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTopicFeedLoader(int i, String str, C49712hj1 hj12, String str2) {
        super(hj12);
        C87412m.m108594g(str, "topic");
        this.f13894d = i;
        this.f13895e = str;
        this.f13896f = str2;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11755t.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…cFeedCacheVM::class.java)");
        this.f13910w = (C11755t) a;
        this.f13911x = new ConcurrentLinkedQueue<>();
    }

    public C13911k<C0740i2> createDataFetch() {
        return this.f13898h;
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2770g(this);
    }

    /* renamed from: d */
    public final C89349b mo2811d(String str) {
        return str == null || str.length() == 0 ? getLastBuffer() : this.f13897g;
    }

    /* renamed from: e */
    public final String mo2812e(String str) {
        int i = this.f13894d;
        if (i == 7 || i == 12) {
            if (this.f13905r == 0) {
                return this.f13907t + '_' + this.f13906s;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13907t);
            sb.append('_');
            sb.append(this.f13905r);
            return sb.toString();
        } else if (15 == i) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f13907t);
            sb4.append('_');
            sb4.append(this.f13905r);
            return sb4.toString();
        } else {
            return this.f13907t + '_' + str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r2 = (r2 = r15.f139904d).get(0);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2813f(int r26, te3.C50862pq3 r27) {
        /*
            r25 = this;
            r0 = r25
            r15 = r27
            boolean r1 = r0.f13903p
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = r25.getTAG()
            java.lang.String r2 = "already load more,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            return
        L_0x0012:
            r1 = 1
            r0.f13903p = r1
            r1 = 0
            if (r15 == 0) goto L_0x0027
            java.util.LinkedList<te3.sn1> r2 = r15.f139904d
            if (r2 == 0) goto L_0x0027
            java.lang.Object r2 = r2.get(r1)
            te3.sn1 r2 = (te3.C51270sn1) r2
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = r2.f141617d
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            pe3.b r11 = r0.mo2811d(r2)
            java.lang.String r2 = r25.getTAG()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestLoadMore tag: "
            r3.append(r4)
            if (r15 == 0) goto L_0x004c
            java.util.LinkedList<te3.sn1> r4 = r15.f139904d
            if (r4 == 0) goto L_0x004c
            java.lang.Object r1 = r4.get(r1)
            te3.sn1 r1 = (te3.C51270sn1) r1
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = r1.f141617d
            if (r1 != 0) goto L_0x004e
        L_0x004c:
            java.lang.String r1 = "null"
        L_0x004e:
            r3.append(r1)
            java.lang.String r1 = "  topic:"
            r3.append(r1)
            java.lang.String r1 = r0.f13895e
            r3.append(r1)
            java.lang.String r1 = " innerTabType:"
            r3.append(r1)
            int r1 = r0.f13907t
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.plugin.finder.feed.model.q0 r13 = new com.tencent.mm.plugin.finder.feed.model.q0
            r1 = r13
            int r2 = r0.f13894d
            java.lang.String r3 = r0.f13895e
            java.lang.String r4 = r0.f13904q
            long r5 = r0.f13905r
            java.lang.String r7 = r0.f13906s
            int r8 = r0.f13907t
            te3.db1 r9 = r0.f13899i
            java.lang.Long r10 = r0.f13900j
            te3.kk1 r12 = r0.f13902o
            java.lang.String r14 = r0.f13901n
            r24 = r13
            r13 = r14
            r16 = -1
            te3.hj1 r17 = r25.getContextObj()
            java.lang.String r14 = r0.f13896f
            r18 = r14
            r19 = 0
            r21 = 0
            r22 = 196608(0x30000, float:2.75506E-40)
            r23 = 0
            r14 = r26
            r15 = r27
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23)
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$c r1 = new com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$c
            r2 = r24
            r1.<init>(r2)
            java.lang.String r2 = r1.f13922a
            java.lang.String r3 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = 2
            r3 = 0
            com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.request$default(r0, r1, r3, r2, r3)
            java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$e> r2 = r0.f13911x
            r2.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader.mo2813f(int, te3.pq3):void");
    }

    /* renamed from: g */
    public final void mo2814g(int i, C50862pq3 pq32, int i2) {
        String str;
        LinkedList<C51270sn1> linkedList;
        C51270sn1 sn12;
        C50862pq3 pq33 = pq32;
        String tag = getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("requestRefresh tag: ");
        if (pq33 == null || (linkedList = pq33.f139904d) == null || (sn12 = linkedList.get(0)) == null || (str = sn12.f141617d) == null) {
            str = "null";
        }
        sb.append(str);
        sb.append("  topic:");
        sb.append(this.f13895e);
        sb.append(" innerTabType:");
        sb.append(this.f13907t);
        sb.append(" this:");
        sb.append(this);
        sb.append(" pullType:");
        sb.append(i2);
        Log.m105924i(tag, sb.toString());
        C2814q0 q0Var = r1;
        C2814q0 q0Var2 = new C2814q0(this.f13894d, this.f13895e, this.f13904q, this.f13905r, this.f13906s, this.f13907t, this.f13899i, this.f13900j, (C89349b) null, this.f13902o, this.f13901n, i, pq32, i2, getContextObj(), this.f13896f, 0, (C89349b) null, 196608, (C8480h) null);
        C2767d dVar = new C2767d(q0Var);
        Log.m105924i(dVar.f13922a, dVar.toString());
        BaseFeedLoader.request$default(this, dVar, (C13910j) null, 2, (Object) null);
        this.f13911x.add(dVar);
    }

    public boolean isObservePostEvent() {
        int i = this.f13894d;
        if (i == 4 || i == 7 || i == 12 || i == 15) {
            return true;
        }
        return super.isObservePostEvent();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        String str;
        LinkedList<C51270sn1> linkedList;
        C51270sn1 sn12;
        LinkedList<C51270sn1> linkedList2;
        C51270sn1 sn13;
        String str2;
        LinkedList<C51270sn1> linkedList3;
        C51270sn1 sn14;
        IResponse<C0740i2> iResponse2 = iResponse;
        C87412m.m108594g(iResponse2, "response");
        String tag = getTAG();
        boolean z = true;
        Object[] objArr = new Object[1];
        List<C0740i2> incrementList = iResponse.getIncrementList();
        String str3 = null;
        int i = 0;
        objArr[0] = incrementList != null ? Integer.valueOf(incrementList.size()) : null;
        Log.m105925i(tag, "onFetchDone %d feeds", objArr);
        if (iResponse2 instanceof C2769f) {
            String tag2 = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("incrementCount ");
            List<C0740i2> incrementList2 = iResponse.getIncrementList();
            sb.append(incrementList2 != null ? Integer.valueOf(incrementList2.size()) : null);
            sb.append(", totalCount ");
            C2769f fVar = (C2769f) iResponse2;
            sb.append(fVar.f13925b);
            sb.append(", lastBuffer ");
            String str4 = "null";
            if (getLastBuffer() == null) {
                str = str4;
            } else {
                C89349b lastBuffer = getLastBuffer();
                str = MD5Util.getMD5String(lastBuffer != null ? lastBuffer.f257327a : null);
            }
            sb.append(str);
            sb.append(", resp buffer ");
            if (iResponse.getLastBuffer() != null) {
                C89349b lastBuffer2 = iResponse.getLastBuffer();
                str4 = MD5Util.getMD5String(lastBuffer2 != null ? lastBuffer2.f257327a : null);
            }
            sb.append(str4);
            sb.append(", pullType = ");
            sb.append(iResponse.getPullType());
            Log.m105924i(tag2, sb.toString());
            C2768e eVar = (C2768e) C110818d0.m150915M(this.f13911x);
            if (eVar != null) {
                this.f13911x.remove();
            }
            boolean z2 = eVar instanceof C2767d;
            if (z2) {
                C50862pq3 pq32 = ((C2767d) eVar).f13921c.f14064m;
                String str5 = (pq32 == null || (linkedList3 = pq32.f139904d) == null || (sn14 = linkedList3.get(0)) == null) ? null : sn14.f141617d;
                C89349b lastBuffer3 = iResponse.getLastBuffer();
                if (str5 == null || str5.length() == 0) {
                    setLastBuffer(lastBuffer3);
                } else {
                    this.f13897g = lastBuffer3;
                }
                C51270sn1 sn15 = fVar.f13924a;
                List<C0740i2> incrementList3 = iResponse.getIncrementList();
                if (!(sn15 == null || (str2 = sn15.f141617d) == null || incrementList3 == null)) {
                    String e = mo2812e(str2);
                    C11755t tVar = this.f13910w;
                    tVar.getClass();
                    C87412m.m108594g(e, "keyWord");
                    C11755t.C11756a c3 = tVar.mo11627c3(e);
                    c3.f34415b = incrementList3;
                    c3.f34416c = sn15;
                }
            } else if (eVar instanceof C2766c) {
                C50862pq3 pq33 = ((C2766c) eVar).f13920c.f14064m;
                String str6 = (pq33 == null || (linkedList2 = pq33.f139904d) == null || (sn13 = linkedList2.get(0)) == null) ? null : sn13.f141617d;
                C89349b lastBuffer4 = iResponse.getLastBuffer();
                if (str6 == null || str6.length() == 0) {
                    setLastBuffer(lastBuffer4);
                } else {
                    this.f13897g = lastBuffer4;
                }
            }
            if (z2) {
                int pullType = iResponse.getPullType();
                if (pullType == 2) {
                    C11348f.C11349a.m11178b(C59319a.f169618b, "TopicFeedLoaderRefreshCheck", false, (C11348f.C11352b) null, false, false, C2773h.f13945d, 28, (Object) null);
                } else if (pullType != 1000) {
                    this.f13909v = true;
                } else {
                    C11348f.C11349a.m11178b(C59319a.f169618b, "TopicFeedLoaderRefreshCheck", false, (C11348f.C11352b) null, false, false, C2774i.f13946d, 28, (Object) null);
                }
                int i2 = ((C2767d) eVar).f13921c.f14065n;
                if (i2 != -1) {
                    iResponse2.setPullType(i2);
                } else {
                    iResponse2.setPullType(1);
                }
            } else if ((eVar instanceof C2766c) && iResponse.getPullType() != 1000) {
                C11348f.C11349a.m11178b(C59319a.f169618b, "TopicFeedLoaderRefreshCheck", this.f13909v, (C11348f.C11352b) null, false, false, C2775j.f13947d, 28, (Object) null);
                iResponse2.setPullType(2);
                this.f13903p = false;
            }
            String tag3 = getTAG();
            Log.m105924i(tag3, "resp tag: " + fVar.f13928e);
            if (z2) {
                C50862pq3 pq34 = ((C2767d) eVar).f13921c.f14064m;
                if (!(pq34 == null || (linkedList = pq34.f139904d) == null || (sn12 = linkedList.get(0)) == null)) {
                    str3 = sn12.f141617d;
                }
                if (!(str3 == null || str3.length() == 0)) {
                    String str7 = fVar.f13928e;
                    if (str7 == null || str7.equals(str3)) {
                        z = false;
                    }
                    if (z) {
                        String tag4 = getTAG();
                        Log.m105924i(tag4, "resp tag: " + fVar.f13928e + " ,not match current tag " + str3 + ",return");
                        return;
                    }
                    C32224a<C13598b0> aVar = this.f13912y;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    C32224a<C13598b0> aVar2 = this.f13912y;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            }
        }
        super.onFetchDone(iResponse);
        C62273n nVar = (C62273n) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
        List<C0740i2> incrementList4 = iResponse.getIncrementList();
        C49712hj1 contextObj = getContextObj();
        if (contextObj != null) {
            i = contextObj.f134675i;
        }
        nVar.mo87345n3(incrementList4, i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [tf1.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFetchInitDone(com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "initResponse"
            gy3.C87412m.m108594g(r5, r0)
            boolean r0 = r5 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader.C2769f
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r5
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$f r0 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader.C2769f) r0
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            if (r0 == 0) goto L_0x0023
            tf1.l r2 = r4.getInitDone()
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader.C2765b
            if (r3 == 0) goto L_0x001c
            r1 = r2
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader$b r1 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader.C2765b) r1
        L_0x001c:
            if (r1 == 0) goto L_0x0023
            te3.sn1 r0 = r0.f13924a
            r1.mo2816a(r0)
        L_0x0023:
            super.onFetchInitDone(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader.onFetchInitDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse):void");
    }

    public void onSaveLastBuffer(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
    }

    public void requestLoadMore(boolean z) {
    }

    public void requestRefresh() {
    }
}
