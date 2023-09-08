package com.tencent.p014mm.plugin.finder.feed.model;

import a14.C0000n0;
import a14.C53930o0;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bo1.C54505r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2489s;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2490t;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import do1.C58341h;
import er1.C58784w3;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9342n1;
import je1.C9360p1;
import jp3.C9486a;
import jp3.C9487b;
import ke1.C9603s;
import ke1.C9610x;
import kotlin.Metadata;
import o40.C11348f;
import o40.C61926c;
import os1.C11739f;
import p749xh.C66261f3;
import pe3.C89349b;
import pl1.C11980l0;
import pl1.C11981m0;
import rs1.C13383r;
import rs1.C13424s;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import te3.C48736am1;
import te3.C48878bm1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C51847wl1;
import tf1.C13897e;
import tf1.C13900g;
import tf1.C13908i;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import u60.C14120b;
import u60.C14121l;
import u60.C65233m;
import u60.C65234n;
import up1.C37521f;
import vp1.C65834e;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderTimelineFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader */
public class FinderTimelineFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final C13908i f13841d;

    /* renamed from: e */
    public int f13842e;

    /* renamed from: f */
    public C9603s f13843f;

    /* renamed from: g */
    public C32227p<? super String, ? super BaseFinderFeed, C13598b0> f13844g;

    /* renamed from: h */
    public final C9610x f13845h;

    /* renamed from: i */
    public boolean f13846i;

    /* renamed from: j */
    public WeakReference<RecyclerView> f13847j;

    /* renamed from: n */
    public boolean f13848n;

    /* renamed from: o */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13849o;

    /* renamed from: p */
    public final C13601g f13850p;

    /* renamed from: q */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13851q;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$a */
    public static final class C2751a implements C9360p1.C9362b {

        /* renamed from: a */
        public final C14120b f13852a;

        /* renamed from: b */
        public final C14121l f13853b;

        public C2751a(C14120b bVar, C14121l lVar) {
            C87412m.m108594g(lVar, "task");
            this.f13852a = bVar;
            this.f13853b = lVar;
        }

        /* renamed from: a */
        public boolean mo2804a(int i, int i2, String str, C49335eu3 eu32) {
            C87412m.m108594g(eu32, "resp");
            C14120b bVar = this.f13852a;
            if (bVar == null) {
                return false;
            }
            int token = bVar.getToken();
            C14121l lVar = this.f13853b;
            if (token == lVar.f39521h) {
                return false;
            }
            lVar.mo11853b(C65234n.OK);
            Log.m105928w("CgiConsumeCallback", "[isFetchConsume] executorToken=" + this.f13852a.getToken() + " taskToken=" + this.f13853b.f39521h);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$b */
    public final class C2752b extends C13911k<C0740i2> implements C9487b<C9486a>, C9360p1.C9361a {

        /* renamed from: d */
        public final C9610x f13854d;

        /* renamed from: e */
        public final C13908i f13855e;

        /* renamed from: f */
        public C14120b f13856f;

        /* renamed from: g */
        public final C13601g f13857g = C36568h.m40985a(C2755c.f13867d);

        /* renamed from: h */
        public final /* synthetic */ FinderTimelineFeedLoader f13858h;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$b$a */
        public static final class C2753a extends C87413o implements C32226l<C14121l, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2752b f13859d;

            /* renamed from: e */
            public final /* synthetic */ Object f13860e;

            /* renamed from: f */
            public final /* synthetic */ boolean f13861f;

            /* renamed from: g */
            public final /* synthetic */ C13910j<C0740i2> f13862g;

            /* renamed from: h */
            public final /* synthetic */ FinderTimelineFeedLoader f13863h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2753a(C2752b bVar, Object obj, boolean z, C13910j<C0740i2> jVar, FinderTimelineFeedLoader finderTimelineFeedLoader) {
                super(1);
                this.f13859d = bVar;
                this.f13860e = obj;
                this.f13861f = z;
                this.f13862g = jVar;
                this.f13863h = finderTimelineFeedLoader;
            }

            public Object invoke(Object obj) {
                C14121l lVar = (C14121l) obj;
                C87412m.m108594g(lVar, "task");
                String tag = this.f13859d.getTAG();
                Log.m105924i(tag, "[call] pullType=" + ((C2756c) this.f13860e).f13868a);
                C2751a aVar = new C2751a(this.f13859d.f13856f, lVar);
                C2752b bVar = this.f13859d;
                C9610x xVar = bVar.f13854d;
                Object obj2 = this.f13860e;
                C2810n0 n0Var = new C2810n0(bVar, obj2, this.f13862g, lVar, this.f13863h);
                C2756c cVar = (C2756c) obj2;
                int i = cVar.f13868a;
                cVar.getClass();
                C9610x.m9284y1(xVar, n0Var, i, aVar, (C89349b) null, false, this.f13861f, ((C2756c) this.f13860e).f13869b, 8, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$b$b */
        public static final class C2754b extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public final /* synthetic */ C2752b f13864d;

            /* renamed from: e */
            public final /* synthetic */ List<FinderObject> f13865e;

            /* renamed from: f */
            public final /* synthetic */ C9342n1.C9346d f13866f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2754b(C2752b bVar, List<? extends FinderObject> list, C9342n1.C9346d dVar) {
                super(0);
                this.f13864d = bVar;
                this.f13865e = list;
                this.f13866f = dVar;
            }

            public Object invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("ShowPreloadCacheDirectly: tabType=");
                sb.append(this.f13864d.f13855e.f39109d);
                sb.append(" pullType=0 valid=");
                sb.append(this.f13865e.size());
                sb.append(" raw=");
                sb.append(this.f13866f.f146069d.size());
                sb.append(' ');
                StringBuilder sb4 = new StringBuilder();
                sb4.append("invalidFeed=");
                LinkedList<FinderObject> linkedList = this.f13866f.f146069d;
                C87412m.m108593f(linkedList, "resp.`object`");
                ArrayList arrayList = new ArrayList();
                for (T next : linkedList) {
                    FinderObject finderObject = (FinderObject) next;
                    C58784w3 w3Var = C58784w3.f168295a;
                    C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                    if (!w3Var.mo83866E0(finderObject)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FinderObject finderObject2 = (FinderObject) it.next();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(C61926c.m72691p(finderObject2.f164794id));
                    sb5.append('#');
                    FinderObjectDesc finderObjectDesc = finderObject2.objectDesc;
                    sb5.append(finderObjectDesc != null ? Integer.valueOf(finderObjectDesc.mediaType) : null);
                    arrayList2.add(sb5.toString());
                }
                sb4.append(arrayList2);
                sb.append(C112551y.m153816p(sb4.toString(), ",", ";", false, 4, (Object) null));
                return sb.toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$b$c */
        public static final class C2755c extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public static final C2755c f13867d = new C2755c();

            public C2755c() {
                super(0);
            }

            public Object invoke() {
                C37521f.f99374d.getClass();
                boolean z = true;
                if (C37521f.f99483p3.mo60266n().intValue() != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C2752b(FinderTimelineFeedLoader finderTimelineFeedLoader, C9610x xVar, C13908i iVar) {
            C87412m.m108594g(xVar, "streamFetcher");
            C87412m.m108594g(iVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            this.f13858h = finderTimelineFeedLoader;
            this.f13854d = xVar;
            this.f13855e = iVar;
        }

        /* renamed from: a */
        public void mo2805a(C2781d dVar, int i) {
            C87412m.m108594g(dVar, "info");
            C49712hj1 contextObj = this.f13858h.getContextObj();
            mo2806b(contextObj != null ? contextObj.f134675i : 0, dVar.f13968e);
        }

        public void alive() {
            C11981m0 m0Var;
            super.alive();
            if (((Boolean) ((C36570n) this.f13857g).getValue()).booleanValue()) {
                m0Var = new C11981m0("FinderSingleTaskExecutor#TabType=" + this.f13854d.f29912g);
            } else {
                C65233m mVar = new C65233m("SingleExecutor#TabType=" + this.f13854d.f29912g);
                mVar.mo89361d();
                m0Var = mVar;
            }
            this.f13856f = m0Var;
        }

        /* renamed from: b */
        public final void mo2806b(int i, List<? extends C0740i2> list) {
            C13383r.C13386c cVar;
            for (C0740i2 i2Var : list) {
                if (i2Var instanceof BaseFinderFeed) {
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    if (C58784w3.f168295a.mo83872H0(baseFinderFeed.mo3513o().getFeedObject())) {
                        C13383r a = C13383r.f37907d.mo12791a();
                        FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
                        a.getClass();
                        C87412m.m108594g(feedObject, "feed");
                        if (C13383r.f37908e.contains(Integer.valueOf(i)) && !a.f37912c.contains(Long.valueOf(feedObject.f164794id)) && (cVar = a.f37910a.get(new C13383r.C13387d(feedObject.f164794id, i))) != null) {
                            if (cVar.f37919f < 2) {
                                cVar.f37919f = 2;
                            }
                            cVar.f37921h = System.currentTimeMillis();
                            Log.m105924i("Finder.AdTraceMgr", "onFeedLoaderConsume dispatchFeed=" + cVar + " [consume-dispatch]=" + (cVar.f37921h - cVar.f37920g) + LocaleUtil.MALAY);
                            a.f37912c.add(Long.valueOf(feedObject.f164794id));
                        }
                    }
                }
            }
            C13383r a2 = C13383r.f37907d.mo12791a();
            a2.getClass();
            if (C13383r.f37908e.contains(Integer.valueOf(i))) {
                C119179t tVar = C119157j.f356862d;
                C13424s sVar = new C13424s(a2, i);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(sVar, 1000, false);
            }
        }

        public void dead() {
            super.dead();
            C14120b bVar = this.f13856f;
            if (bVar != null) {
                bVar.reset();
            }
            this.f13856f = null;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            if (obj instanceof C2756c) {
                C2753a aVar = new C2753a(this, obj, z, jVar, this.f13858h);
                C14120b bVar = this.f13856f;
                if (bVar != null) {
                    bVar.mo11856a(((Boolean) ((C36570n) this.f13857g).getValue()).booleanValue() ? new C11980l0(aVar, (String) null, 2, (C8480h) null) : new C14121l(aVar, (String) null, 2, (C8480h) null));
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: sx3.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v62, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v63, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: sx3.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v68, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: sx3.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v69, resolved type: sx3.f0} */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x04a5, code lost:
            if (r10.mo3513o().isUrlValid() != false) goto L_0x04cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x04c7, code lost:
            if ((r10 instanceof cm1.C0729f0) != false) goto L_0x04cc;
         */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x037a  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x037e  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x03b9  */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x03bb  */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x03ca  */
        /* JADX WARNING: Removed duplicated region for block: B:166:0x03d5  */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x03e6  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x03eb  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x0403  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x041a  */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x0467  */
        /* JADX WARNING: Removed duplicated region for block: B:219:0x04cf  */
        /* JADX WARNING: Removed duplicated region for block: B:323:0x06c9  */
        /* JADX WARNING: Removed duplicated region for block: B:324:0x06cb  */
        /* JADX WARNING: Removed duplicated region for block: B:327:0x06d6  */
        /* JADX WARNING: Removed duplicated region for block: B:344:0x0700  */
        /* JADX WARNING: Removed duplicated region for block: B:345:0x0703  */
        /* JADX WARNING: Removed duplicated region for block: B:353:0x073e  */
        /* JADX WARNING: Removed duplicated region for block: B:370:0x0461 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x010e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void fetchInit(tf1.C13910j<cm1.C0740i2> r38) {
            /*
                r37 = this;
                r0 = r37
                r1 = r38
                java.lang.Class<os1.f> r2 = os1.C11739f.class
                java.lang.Class<com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore> r3 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                java.lang.String r5 = "callback"
                gy3.C87412m.m108594g(r1, r5)
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$d r5 = new com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$d
                r7 = 0
                r8 = 0
                java.lang.String r9 = ""
                r10 = 0
                r11 = 8
                r12 = 0
                r6 = r5
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r6 = 1000(0x3e8, float:1.401E-42)
                r5.setPullType(r6)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                bl3.r r7 = bl3.C39818r.f106831a
                bl3.r$a r8 = r7.mo62446e(r4)
                androidx.lifecycle.i0 r8 = r8.mo75002a(r2)
                java.lang.String r9 = "UICProvider.of(FinderCom…meTabStateVM::class.java)"
                gy3.C87412m.m108593f(r8, r9)
                os1.f r8 = (os1.C11739f) r8
                ke1.x r10 = r0.f13854d
                int r10 = r10.f29912g
                boolean r8 = r8.mo11603f3(r10)
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r10 = r0.f13858h
                ke1.s r11 = r10.f13843f
                r12 = 1
                if (r11 == 0) goto L_0x004a
                boolean r11 = r11.f29879l
                if (r11 != r12) goto L_0x004a
                r11 = 1
                goto L_0x004b
            L_0x004a:
                r11 = 0
            L_0x004b:
                com.tencent.mm.plugin.finder.feed.model.w0 r10 = r10.getCache()
                if (r10 == 0) goto L_0x0092
                java.util.ArrayList<cm1.i2> r15 = r10.f14079a
                r5.setIncrementList(r15)
                pe3.b r10 = r10.f14080b
                r5.setLastBuffer(r10)
                java.lang.String r10 = r37.getTAG()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r14 = "fetchInit from cache tabType="
                r15.append(r14)
                ke1.x r14 = r0.f13854d
                int r14 = r14.f29912g
                r15.append(r14)
                java.lang.String r14 = ", size = "
                r15.append(r14)
                java.util.List r14 = r5.getIncrementList()
                if (r14 == 0) goto L_0x0084
                int r14 = r14.size()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                goto L_0x0085
            L_0x0084:
                r14 = 0
            L_0x0085:
                r15.append(r14)
                java.lang.String r14 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
                rx3.b0 r10 = rx3.C13598b0.f38549a
                goto L_0x0093
            L_0x0092:
                r10 = 0
            L_0x0093:
                r14 = 4
                if (r10 != 0) goto L_0x04d9
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r10 = r0.f13858h
                ke1.s r6 = r10.f13843f
                if (r6 == 0) goto L_0x00a2
                int r6 = r6.f29876i
                if (r6 != r12) goto L_0x00a2
                r6 = 1
                goto L_0x00a3
            L_0x00a2:
                r6 = 0
            L_0x00a3:
                if (r6 == 0) goto L_0x00ad
                ke1.x r6 = r0.f13854d
                int r6 = r6.f29912g
                if (r6 != r14) goto L_0x00ad
                r6 = 1
                goto L_0x00ae
            L_0x00ad:
                r6 = 0
            L_0x00ae:
                if (r11 != 0) goto L_0x010b
                if (r8 == 0) goto L_0x010b
                if (r6 != 0) goto L_0x010b
                int r14 = r10.f13842e
                if (r14 != 0) goto L_0x010b
                ke1.x r14 = r0.f13854d
                int r14 = r14.f29912g
                up1.f r16 = up1.C37521f.f99374d
                r16.getClass()
                pe1.c<java.lang.Integer> r16 = up1.C37521f.f99347Z5
                java.lang.Object r16 = r16.mo60266n()
                java.lang.Number r16 = (java.lang.Number) r16
                int r13 = r16.intValue()
                if (r13 != r12) goto L_0x00f9
                bl3.r$a r13 = r7.mo62446e(r4)
                androidx.lifecycle.i0 r13 = r13.mo75002a(r3)
                com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r13 = (com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) r13
                do1.h r13 = r13.mo78457f3(r14)
                if (r13 == 0) goto L_0x00f4
                do1.h$a r13 = r13.f167040p
                if (r13 == 0) goto L_0x00f4
                je1.n1$d r13 = r13.f167044b
                if (r13 == 0) goto L_0x00f4
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r13 = r13.f146069d
                if (r13 == 0) goto L_0x00f4
                boolean r13 = r13.isEmpty()
                r13 = r13 ^ r12
                if (r13 != r12) goto L_0x00f4
                r13 = 1
                goto L_0x00f5
            L_0x00f4:
                r13 = 0
            L_0x00f5:
                if (r13 == 0) goto L_0x00f9
                r13 = 1
                goto L_0x00fa
            L_0x00f9:
                r13 = 0
            L_0x00fa:
                if (r13 == 0) goto L_0x010b
                ke1.s r13 = r10.f13843f
                if (r13 == 0) goto L_0x0106
                boolean r13 = r13.f29878k
                if (r13 != 0) goto L_0x0106
                r13 = 1
                goto L_0x0107
            L_0x0106:
                r13 = 0
            L_0x0107:
                if (r13 == 0) goto L_0x010b
                r13 = 1
                goto L_0x010c
            L_0x010b:
                r13 = 0
            L_0x010c:
                if (r13 == 0) goto L_0x02c7
                bl3.r$a r2 = r7.mo62446e(r4)
                androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
                com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r2 = (com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) r2
                ke1.x r6 = r0.f13854d
                int r6 = r6.f29912g
                do1.h r17 = r2.mo78457f3(r6)
                if (r17 == 0) goto L_0x0131
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 4
                r22 = 0
                je1.n1$d r2 = do1.C58341h.m67553t(r17, r18, r19, r20, r21, r22)
                goto L_0x0132
            L_0x0131:
                r2 = 0
            L_0x0132:
                if (r2 == 0) goto L_0x0160
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r2.f146069d
                if (r6 == 0) goto L_0x0160
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x0141:
                boolean r9 = r6.hasNext()
                if (r9 == 0) goto L_0x0162
                java.lang.Object r9 = r6.next()
                r14 = r9
                com.tencent.mm.protocal.protobuf.FinderObject r14 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r14
                er1.w3 r12 = er1.C58784w3.f168295a
                java.lang.String r15 = "it"
                gy3.C87412m.m108593f(r14, r15)
                boolean r12 = r12.mo83866E0(r14)
                if (r12 == 0) goto L_0x015e
                r7.add(r9)
            L_0x015e:
                r12 = 1
                goto L_0x0141
            L_0x0160:
                sx3.f0 r7 = sx3.C64186f0.f181907d
            L_0x0162:
                if (r2 == 0) goto L_0x0286
                le1.b r6 = new le1.b
                r6.<init>()
                ke1.x r9 = r0.f13854d
                int r9 = r9.f29912g
                int r12 = r10.f13842e
                r6.mo10788c(r2, r9, r12)
                te3.bm1 r6 = r2.f146066D
                r5.f13874c = r6
                te3.wl1 r6 = r2.f146068F
                r5.f13875d = r6
                java.lang.String r6 = r37.getTAG()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r12 = "fetchInit tipsId="
                r9.append(r12)
                te3.bm1 r12 = r2.f146066D
                if (r12 == 0) goto L_0x018f
                java.lang.String r12 = r12.f131203h
                goto L_0x0190
            L_0x018f:
                r12 = 0
            L_0x0190:
                r9.append(r12)
                java.lang.String r12 = " title=["
                r9.append(r12)
                te3.bm1 r12 = r2.f146066D
                if (r12 == 0) goto L_0x01a3
                te3.nn1 r12 = r12.f131200e
                if (r12 == 0) goto L_0x01a3
                java.lang.String r12 = r12.f184504f
                goto L_0x01a4
            L_0x01a3:
                r12 = 0
            L_0x01a4:
                r9.append(r12)
                r12 = 45
                r9.append(r12)
                te3.bm1 r12 = r2.f146066D
                if (r12 == 0) goto L_0x01bf
                te3.nn1 r12 = r12.f131200e
                if (r12 == 0) goto L_0x01bf
                te3.s7 r12 = r12.f184519x
                if (r12 == 0) goto L_0x01bf
                te3.f00 r12 = r12.f185355d
                if (r12 == 0) goto L_0x01bf
                java.lang.String r12 = r12.f183065d
                goto L_0x01c0
            L_0x01bf:
                r12 = 0
            L_0x01c0:
                r9.append(r12)
                java.lang.String r12 = "] "
                r9.append(r12)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                int r6 = r7.size()
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r9 = r2.f146069d
                int r9 = r9.size()
                if (r6 >= r9) goto L_0x021f
                java.lang.String r6 = r37.getTAG()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r12 = "ShowPreloadCacheDirectly: has filter some feed. valid="
                r9.append(r12)
                int r12 = r7.size()
                r9.append(r12)
                java.lang.String r12 = " raw="
                r9.append(r12)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r12 = r2.f146069d
                int r12 = r12.size()
                r9.append(r12)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
                ft1.a r18 = ft1.C59319a.f169618b
                r20 = 1
                r21 = 0
                r22 = 0
                r23 = 0
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$b$b r6 = new com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$b$b
                r6.<init>(r0, r7, r2)
                r25 = 28
                r26 = 0
                java.lang.String r19 = "finderStreamReturnInvalidFeed"
                r24 = r6
                o40.C11348f.C11349a.m11177a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            L_0x021f:
                dp1.e0 r6 = dp1.C20480e0.f57583a
                ke1.x r9 = r0.f13854d
                int r9 = r9.f29912g
                r29 = 0
                te3.hj1 r30 = r10.getContextObj()
                r31 = 0
                r33 = 0
                r34 = 24
                r35 = 0
                r27 = r6
                r28 = r9
                dp1.C20480e0.m22095r(r27, r28, r29, r30, r31, r33, r34, r35)
                ke1.x r9 = r0.f13854d
                int r9 = r9.f29912g
                r29 = 1
                r30 = 0
                r31 = 0
                r32 = 0
                r34 = 0
                r35 = 60
                r36 = 0
                r28 = r9
                dp1.C20480e0.m22094n(r27, r28, r29, r30, r31, r32, r34, r35, r36)
                java.lang.Object r9 = sx3.C110818d0.m150916N(r7)
                com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
                if (r9 == 0) goto L_0x0268
                er1.j4 r12 = er1.C58739j4.f168176a
                int r9 = r12.mo83711h(r9)
                r12 = 2
                if (r9 != r12) goto L_0x0264
                r9 = 1
                goto L_0x0265
            L_0x0264:
                r9 = 0
            L_0x0265:
                r32 = r9
                goto L_0x026a
            L_0x0268:
                r32 = 0
            L_0x026a:
                ke1.x r9 = r0.f13854d
                int r9 = r9.f29912g
                pe3.b r12 = r2.f146063A
                java.lang.String r14 = r2.f29213Q
                te3.iq r2 = r2.f29214R
                r33 = 1
                r27 = r6
                r28 = r9
                r29 = r12
                r30 = r14
                r31 = r2
                r27.mo32042p(r28, r29, r30, r31, r32, r33)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                goto L_0x0287
            L_0x0286:
                r2 = 0
            L_0x0287:
                if (r2 != 0) goto L_0x028c
                rx3.b0 r2 = rx3.C13598b0.f38549a
                r13 = 0
            L_0x028c:
                wp1.f$a r2 = wp1.C15585f.f42211a
                er1.w3 r6 = er1.C58784w3.f168295a
                ke1.x r9 = r0.f13854d
                int r9 = r9.f29912g
                int r6 = r6.mo83887M1(r9)
                te3.hj1 r9 = r10.getContextObj()
                java.util.List r2 = r2.mo14343f(r7, r6, r9)
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r7 = sx3.C36907w.m41090l(r2, r7)
                r6.<init>(r7)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.util.Iterator r2 = r2.iterator()
            L_0x02b1:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x0367
                java.lang.Object r7 = r2.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r7
                wp1.f$a r9 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r9.mo14348k(r7)
                r6.add(r7)
                goto L_0x02b1
            L_0x02c7:
                kf1.o9 r12 = kf1.C9912o9.f30536a
                ke1.x r14 = r0.f13854d
                int r14 = r14.f29912g
                bl3.r$a r7 = r7.mo62446e(r4)
                androidx.lifecycle.i0 r2 = r7.mo75002a(r2)
                gy3.C87412m.m108593f(r2, r9)
                os1.f r2 = (os1.C11739f) r2
                boolean r2 = r2.mo11603f3(r14)
                if (r2 == 0) goto L_0x02f4
                boolean r2 = r12.mo10448b(r14)
                if (r2 != 0) goto L_0x02f2
                boolean r2 = r12.mo10449c(r14)
                if (r2 == 0) goto L_0x02f4
                boolean r2 = r12.mo10447a(r14)
                if (r2 == 0) goto L_0x02f4
            L_0x02f2:
                r2 = 1
                goto L_0x02f5
            L_0x02f4:
                r2 = 0
            L_0x02f5:
                if (r2 != 0) goto L_0x033a
                if (r6 == 0) goto L_0x02fa
                goto L_0x033a
            L_0x02fa:
                int r2 = r10.f13842e
                if (r2 != 0) goto L_0x0301
                r23 = 1
                goto L_0x0303
            L_0x0301:
                r23 = 0
            L_0x0303:
                if (r2 != 0) goto L_0x0307
                r2 = 1
                goto L_0x0308
            L_0x0307:
                r2 = 0
            L_0x0308:
                er1.w3 r18 = er1.C58784w3.f168295a
                tf1.i r6 = r0.f13855e
                int r6 = r6.f39109d
                te3.hj1 r20 = r10.getContextObj()
                int r21 = r10.getPageName()
                r22 = 0
                if (r23 == 0) goto L_0x032d
                rx3.g r7 = r10.f13850p
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L_0x032d
                r24 = 1
                goto L_0x032f
            L_0x032d:
                r24 = 0
            L_0x032f:
                r25 = 8
                r26 = 0
                r19 = r6
                java.util.List r6 = er1.C58784w3.m68434Z(r18, r19, r20, r21, r22, r23, r24, r25, r26)
                goto L_0x0368
            L_0x033a:
                if (r6 == 0) goto L_0x0365
                ke1.s r2 = r10.f13843f
                if (r2 == 0) goto L_0x0347
                boolean r2 = r2.f29878k
                r6 = 1
                if (r2 != r6) goto L_0x0347
                r2 = 1
                goto L_0x0348
            L_0x0347:
                r2 = 0
            L_0x0348:
                if (r2 == 0) goto L_0x0365
                er1.w3 r18 = er1.C58784w3.f168295a
                r19 = 114(0x72, float:1.6E-43)
                te3.hj1 r20 = r10.getContextObj()
                int r21 = r10.getPageName()
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 56
                r26 = 0
                java.util.List r6 = er1.C58784w3.m68434Z(r18, r19, r20, r21, r22, r23, r24, r25, r26)
                goto L_0x0367
            L_0x0365:
                sx3.f0 r6 = sx3.C64186f0.f181907d
            L_0x0367:
                r2 = 0
            L_0x0368:
                dp1.e0 r7 = dp1.C20480e0.f57583a
                ke1.x r9 = r0.f13854d
                int r9 = r9.f29912g
                boolean r12 = r6.isEmpty()
                r14 = 1
                r12 = r12 ^ r14
                dp1.e0$a r7 = r7.mo32032e(r9)
                if (r7 == 0) goto L_0x037c
                r7.f57610T = r12
            L_0x037c:
                if (r13 == 0) goto L_0x0389
                r7 = 0
                r5.setPullType(r7)
                int r7 = r10.f13842e
                if (r7 != 0) goto L_0x0389
                r7 = 1
                r10.f13842e = r7
            L_0x0389:
                java.lang.Object r7 = sx3.C110818d0.m150916N(r6)
                cm1.i2 r7 = (cm1.C0740i2) r7
                java.lang.String r9 = r37.getTAG()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "fetchInit: tabType="
                r12.append(r13)
                ke1.x r13 = r0.f13854d
                int r13 = r13.f29912g
                r12.append(r13)
                java.lang.String r13 = " callInitData scene="
                r12.append(r13)
                tf1.i r13 = r0.f13855e
                r12.append(r13)
                java.lang.String r13 = ", contextObj="
                r12.append(r13)
                te3.hj1 r10 = r10.getContextObj()
                if (r10 != 0) goto L_0x03bb
                r10 = 1
                goto L_0x03bc
            L_0x03bb:
                r10 = 0
            L_0x03bc:
                r12.append(r10)
                java.lang.String r10 = " list first="
                r12.append(r10)
                boolean r10 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                java.lang.String r13 = ""
                if (r10 == 0) goto L_0x03d5
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
                java.lang.String r7 = r7.getNickName()
                goto L_0x03d6
            L_0x03d5:
                r7 = r13
            L_0x03d6:
                r12.append(r7)
                java.lang.String r7 = " => "
                r12.append(r7)
                java.lang.Object r7 = sx3.C110818d0.m150916N(r6)
                cm1.i2 r7 = (cm1.C0740i2) r7
                if (r7 == 0) goto L_0x03eb
                long r14 = r7.getItemId()
                goto L_0x03ed
            L_0x03eb:
                r14 = 0
            L_0x03ed:
                java.lang.String r7 = o40.C61926c.m72691p(r14)
                r12.append(r7)
                java.lang.String r7 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
                ke1.x r7 = r0.f13854d
                int r7 = r7.f29912g
                int r9 = ve1.C14486c8.f40164d
                if (r9 != r7) goto L_0x0417
                java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> r7 = ve1.C14486c8.f40162b
                if (r7 == 0) goto L_0x0412
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0410
                goto L_0x0412
            L_0x0410:
                r7 = 0
                goto L_0x0413
            L_0x0412:
                r7 = 1
            L_0x0413:
                if (r7 != 0) goto L_0x0417
                r7 = 1
                goto L_0x0418
            L_0x0417:
                r7 = 0
            L_0x0418:
                if (r7 == 0) goto L_0x0458
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> r7 = ve1.C14486c8.f40162b
                if (r7 == 0) goto L_0x0458
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.util.Iterator r7 = r7.iterator()
                r9 = 0
            L_0x042a:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto L_0x0458
                int r10 = r9 + 1
                java.lang.Object r12 = r7.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r12
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r12.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r14 = r14.objectDesc
                if (r14 == 0) goto L_0x0456
                int r14 = r14.mediaType
                r15 = 2
                if (r15 != r14) goto L_0x044e
                cm1.x r14 = new cm1.x
                r14.<init>(r12)
                r6.add(r9, r14)
                goto L_0x0456
            L_0x044e:
                cm1.j0 r14 = new cm1.j0
                r14.<init>(r12)
                r6.add(r9, r14)
            L_0x0456:
                r9 = r10
                goto L_0x042a
            L_0x0458:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x0461:
                boolean r9 = r6.hasNext()
                if (r9 == 0) goto L_0x04d3
                java.lang.Object r9 = r6.next()
                r10 = r9
                cm1.i2 r10 = (cm1.C0740i2) r10
                boolean r12 = r10 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r12 == 0) goto L_0x04cc
                if (r8 == 0) goto L_0x04a8
                if (r11 == 0) goto L_0x04a8
                ke1.x r12 = r0.f13854d
                int r12 = r12.f29912g
                r14 = 4
                if (r12 != r14) goto L_0x04a8
                er1.w3 r12 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
                com.tencent.mm.plugin.finder.storage.FinderItem r14 = r10.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.getFeedObject()
                boolean r14 = r12.mo83866E0(r14)
                if (r14 == 0) goto L_0x04ca
                com.tencent.mm.plugin.finder.storage.FinderItem r14 = r10.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.getFeedObject()
                boolean r12 = r12.mo83863D0(r14, r13)
                if (r12 != 0) goto L_0x04ca
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
                boolean r10 = r10.isUrlValid()
                if (r10 == 0) goto L_0x04ca
                goto L_0x04cc
            L_0x04a8:
                er1.w3 r12 = er1.C58784w3.f168295a
                r14 = r10
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r14
                com.tencent.mm.plugin.finder.storage.FinderItem r15 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r15 = r15.getFeedObject()
                boolean r12 = r12.mo83866E0(r15)
                if (r12 == 0) goto L_0x04ca
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r14.mo3513o()
                boolean r12 = r12.isUrlValid()
                if (r12 != 0) goto L_0x04cc
                boolean r10 = r10 instanceof cm1.C0729f0
                if (r10 == 0) goto L_0x04ca
                goto L_0x04cc
            L_0x04ca:
                r10 = 0
                goto L_0x04cd
            L_0x04cc:
                r10 = 1
            L_0x04cd:
                if (r10 == 0) goto L_0x0461
                r7.add(r9)
                goto L_0x0461
            L_0x04d3:
                r5.setIncrementList(r7)
                rx3.b0 r6 = rx3.C13598b0.f38549a
                goto L_0x04da
            L_0x04d9:
                r2 = 0
            L_0x04da:
                java.util.List r6 = r5.getIncrementList()
                if (r6 == 0) goto L_0x04f7
                java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
                cm1.i2 r6 = (cm1.C0740i2) r6
                if (r6 == 0) goto L_0x04f7
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r7 = r0.f13858h
                boolean r9 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r9 == 0) goto L_0x04f7
                fy3.p<? super java.lang.String, ? super com.tencent.mm.plugin.finder.model.BaseFinderFeed, rx3.b0> r7 = r7.f13844g
                if (r7 == 0) goto L_0x04f7
                java.lang.String r9 = "fetchInit"
                r7.invoke(r9, r6)
            L_0x04f7:
                if (r2 == 0) goto L_0x0531
                java.util.List r2 = r5.getIncrementList()
                if (r2 == 0) goto L_0x0531
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0508:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x051a
                java.lang.Object r7 = r2.next()
                boolean r9 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r9 == 0) goto L_0x0508
                r6.add(r7)
                goto L_0x0508
            L_0x051a:
                java.util.Iterator r2 = r6.iterator()
            L_0x051e:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x052f
                java.lang.Object r6 = r2.next()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
                r7 = 0
                r6.mo3501h0(r7)
                goto L_0x051e
            L_0x052f:
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0531:
                java.util.List r2 = r5.getIncrementList()
                if (r11 == 0) goto L_0x0737
                if (r8 == 0) goto L_0x0737
                ke1.x r6 = r0.f13854d
                int r6 = r6.f29912g
                r7 = 4
                if (r6 != r7) goto L_0x0737
                java.lang.Class<tf0.p1> r6 = tf0.C64916p1.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                tf0.p1 r6 = (tf0.C64916p1) r6
                te3.vl1 r6 = r6.mo76676RO()
                int r6 = r6.f185935P
                r7 = 1000(0x3e8, float:1.401E-42)
                int r6 = r6 * 1000
                r7 = -1
                if (r2 == 0) goto L_0x05bf
                java.util.Iterator r8 = r2.iterator()
                r9 = 0
            L_0x055a:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x05bf
                java.lang.Object r10 = r8.next()
                cm1.i2 r10 = (cm1.C0740i2) r10
                boolean r11 = r10 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r11 == 0) goto L_0x056e
                r12 = r10
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
                goto L_0x056f
            L_0x056e:
                r12 = 0
            L_0x056f:
                if (r12 == 0) goto L_0x0576
                boolean r12 = r12.mo3515p()
                goto L_0x0577
            L_0x0576:
                r12 = 0
            L_0x0577:
                if (r11 == 0) goto L_0x057d
                r13 = r10
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
                goto L_0x057e
            L_0x057d:
                r13 = 0
            L_0x057e:
                if (r13 == 0) goto L_0x0589
                boolean r13 = r13.mo3481O()
                r14 = 1
                if (r13 != r14) goto L_0x0589
                r13 = 1
                goto L_0x058a
            L_0x0589:
                r13 = 0
            L_0x058a:
                if (r11 == 0) goto L_0x058f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
                goto L_0x0590
            L_0x058f:
                r10 = 0
            L_0x0590:
                if (r10 == 0) goto L_0x05a5
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
                if (r10 == 0) goto L_0x05a5
                com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
                if (r10 == 0) goto L_0x05a5
                te3.xe1 r10 = r10.client_local_buffer
                if (r10 == 0) goto L_0x05a5
                long r10 = r10.f186293d
                goto L_0x05a7
            L_0x05a5:
                r10 = 0
            L_0x05a7:
                if (r12 != 0) goto L_0x05b7
                if (r13 == 0) goto L_0x05b7
                long r12 = (long) r6
                long r10 = r10 + r12
                long r12 = eb0.C31543z5.m39453c()
                int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r14 <= 0) goto L_0x05b7
                r10 = 1
                goto L_0x05b8
            L_0x05b7:
                r10 = 0
            L_0x05b8:
                if (r10 == 0) goto L_0x05bc
                r7 = r9
                goto L_0x05bf
            L_0x05bc:
                int r9 = r9 + 1
                goto L_0x055a
            L_0x05bf:
                java.lang.String r8 = r37.getTAG()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "fetchInit: showUnreadCacheFeed, incrementList="
                r9.append(r10)
                if (r2 == 0) goto L_0x05d8
                int r10 = r2.size()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                goto L_0x05d9
            L_0x05d8:
                r10 = 0
            L_0x05d9:
                r9.append(r10)
                java.lang.String r10 = " unreadPosition="
                r9.append(r10)
                r9.append(r7)
                java.lang.String r11 = ", cacheFeedValidTimeMs="
                r9.append(r11)
                r9.append(r6)
                java.lang.String r6 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                if (r2 == 0) goto L_0x05fe
                boolean r6 = r2.isEmpty()
                if (r6 == 0) goto L_0x05fc
                goto L_0x05fe
            L_0x05fc:
                r6 = 0
                goto L_0x05ff
            L_0x05fe:
                r6 = 1
            L_0x05ff:
                if (r6 != 0) goto L_0x0723
                if (r7 < 0) goto L_0x0723
                java.lang.Object r2 = r2.get(r7)
                cm1.i2 r2 = (cm1.C0740i2) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                boolean r8 = r2 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r8 == 0) goto L_0x0616
                r8 = r2
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8
                goto L_0x0617
            L_0x0616:
                r8 = 0
            L_0x0617:
                if (r8 != 0) goto L_0x061a
                goto L_0x061e
            L_0x061a:
                r9 = 0
                r8.mo3514o0(r9)
            L_0x061e:
                je1.e r8 = new je1.e
                ke1.x r9 = r0.f13854d
                int r9 = r9.f29912g
                long r11 = r2.getItemId()
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                java.util.List r11 = sx3.C26236u.m33719b(r11)
                r12 = 2
                r13 = 0
                r8.<init>(r12, r9, r11, r13)
                r8.mo9225i()
                r6.add(r2)
                r5.setIncrementList(r6)
                java.lang.String r6 = r37.getTAG()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "fetchInit: cacheFeedId="
                r8.append(r9)
                long r11 = r2.getItemId()
                java.lang.String r9 = o40.C61926c.m72691p(r11)
                r8.append(r9)
                r8.append(r10)
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                dp1.e0 r6 = dp1.C20480e0.f57583a
                ke1.x r7 = r0.f13854d
                int r7 = r7.f29912g
                r20 = 0
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r8 = r0.f13858h
                te3.hj1 r21 = r8.getContextObj()
                r22 = 0
                r24 = 0
                r25 = 24
                r26 = 0
                r18 = r6
                r19 = r7
                dp1.C20480e0.m22095r(r18, r19, r20, r21, r22, r24, r25, r26)
                ke1.x r7 = r0.f13854d
                int r7 = r7.f29912g
                r20 = 1
                r21 = 0
                r22 = 0
                r23 = 0
                r25 = 0
                r26 = 60
                r27 = 0
                r19 = r7
                dp1.C20480e0.m22094n(r18, r19, r20, r21, r22, r23, r25, r26, r27)
                bl3.r r7 = bl3.C39818r.f106831a
                bl3.r$a r4 = r7.mo62446e(r4)
                androidx.lifecycle.i0 r3 = r4.mo75002a(r3)
                com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r3 = (com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) r3
                ke1.x r4 = r0.f13854d
                int r4 = r4.f29912g
                do1.h r3 = r3.mo78457f3(r4)
                if (r3 == 0) goto L_0x06b9
                do1.h$e r4 = r3.f167042r
                if (r4 == 0) goto L_0x06b9
                boolean r4 = r4.f25557a
                r7 = 1
                if (r4 != r7) goto L_0x06ba
                r4 = 1
                goto L_0x06bb
            L_0x06b9:
                r7 = 1
            L_0x06ba:
                r4 = 0
            L_0x06bb:
                if (r4 == 0) goto L_0x06cb
                do1.h$e r3 = r3.f167042r
                do1.h$f r3 = r3.f25558b
                do1.h$f r4 = do1.C58341h.C58344f.RefreshContinue
                if (r3 == r4) goto L_0x06cb
                do1.h$f r4 = do1.C58341h.C58344f.EnterLoad
                if (r3 == r4) goto L_0x06cb
                r3 = 1
                goto L_0x06cc
            L_0x06cb:
                r3 = 0
            L_0x06cc:
                ke1.x r4 = r0.f13854d
                int r4 = r4.f29912g
                dp1.e0$a r4 = r6.mo32032e(r4)
                if (r4 == 0) goto L_0x06f9
                boolean r8 = r4.f57617a
                if (r8 == 0) goto L_0x06e0
                boolean r8 = r4.f57619b
                if (r8 != 0) goto L_0x06e0
                r8 = 1
                goto L_0x06e1
            L_0x06e0:
                r8 = 0
            L_0x06e1:
                if (r8 == 0) goto L_0x06e5
                r14 = r4
                goto L_0x06e6
            L_0x06e5:
                r14 = r13
            L_0x06e6:
                if (r14 == 0) goto L_0x06f9
                long r8 = eb0.C31543z5.m39453c()
                r14.f57639l = r8
                if (r3 == 0) goto L_0x06f2
                r12 = 2
                goto L_0x06f3
            L_0x06f2:
                r12 = 0
            L_0x06f3:
                r14.f57611U = r12
                r3 = 5
                r14.f57594D = r3
            L_0x06f9:
                int r3 = r2.mo75c()
                r4 = 2
                if (r3 != r4) goto L_0x0703
                r22 = 1
                goto L_0x0705
            L_0x0703:
                r22 = 0
            L_0x0705:
                ke1.x r3 = r0.f13854d
                int r3 = r3.f29912g
                r20 = 0
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r4 = r0.f13858h
                te3.hj1 r21 = r4.getContextObj()
                long r23 = r2.getItemId()
                r25 = 0
                r26 = 32
                r27 = 0
                r18 = r6
                r19 = r3
                dp1.C20480e0.m22094n(r18, r19, r20, r21, r22, r23, r25, r26, r27)
                goto L_0x0737
            L_0x0723:
                java.lang.String r2 = r37.getTAG()
                java.lang.String r3 = "fetchInit: do not have unread cache feed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13858h
                ke1.s r2 = r2.f13843f
                if (r2 != 0) goto L_0x0733
                goto L_0x0737
            L_0x0733:
                r3 = 0
                r2.f29879l = r3
                goto L_0x0738
            L_0x0737:
                r3 = 0
            L_0x0738:
                java.util.List r2 = r5.getIncrementList()
                if (r2 == 0) goto L_0x074f
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r4 = r0.f13858h
                te3.hj1 r4 = r4.getContextObj()
                if (r4 == 0) goto L_0x0749
                int r13 = r4.f134675i
                goto L_0x074a
            L_0x0749:
                r13 = 0
            L_0x074a:
                r0.mo2806b(r13, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x074f:
                r1.onFetchDone(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader.C2752b.fetchInit(tf1.j):void");
        }

        public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            fetch(new C2756c(2, (List) null, 2, (C8480h) null), jVar, z);
        }

        public void fetchRefresh(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
            FinderTimelineFeedLoader finderTimelineFeedLoader = this.f13858h;
            int i = finderTimelineFeedLoader.f13842e;
            C2756c cVar = new C2756c(i, (List) null, 2, (C8480h) null);
            cVar.f13868a = i;
            if (i == 0) {
                finderTimelineFeedLoader.f13842e = 1;
            }
            String tag = getTAG();
            Log.m105924i(tag, "[requestRefresh] pullType=" + cVar.f13868a);
            C13911k.fetch$default(this, cVar, jVar, false, 4, (Object) null);
        }

        public void keep(C9486a aVar) {
            C87412m.m108594g(aVar, "p0");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$c */
    public static class C2756c {

        /* renamed from: a */
        public int f13868a;

        /* renamed from: b */
        public List<? extends BaseFinderFeed> f13869b;

        /* renamed from: c */
        public long f13870c;

        /* renamed from: d */
        public C48736am1 f13871d;

        public C2756c(int i, List<? extends BaseFinderFeed> list) {
            this.f13868a = i;
            this.f13869b = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2756c(int i, List list, int i2, C8480h hVar) {
            this(i, (i2 & 2) != 0 ? null : list);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$d */
    public static final class C2757d extends IResponse<C0740i2> {

        /* renamed from: a */
        public Object f13872a;

        /* renamed from: b */
        public ArrayList<C0740i2> f13873b;

        /* renamed from: c */
        public C48878bm1 f13874c;

        /* renamed from: d */
        public C51847wl1 f13875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2757d(int i, int i2, String str, Object obj, int i3, C8480h hVar) {
            super(i, i2, str);
            obj = (i3 & 8) != 0 ? null : obj;
            this.f13872a = obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$e */
    public static final class C2758e extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final boolean f13876a;

        /* renamed from: b */
        public final /* synthetic */ FinderTimelineFeedLoader f13877b;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$e$a */
        public static final class C2759a extends C87413o implements C32226l<C0740i2, CharSequence> {

            /* renamed from: d */
            public static final C2759a f13878d = new C2759a();

            public C2759a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C0740i2 i2Var = (C0740i2) obj;
                C87412m.m108594g(i2Var, "feed");
                return C61926c.m72691p(i2Var.getItemId());
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$e$b */
        public static final class C2760b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2758e f13879d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13880e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13881f;

            /* renamed from: g */
            public final /* synthetic */ FinderTimelineFeedLoader f13882g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13883h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13884i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2760b(C2758e eVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderTimelineFeedLoader finderTimelineFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13879d = eVar;
                this.f13880e = tVar;
                this.f13881f = cVar;
                this.f13882g = finderTimelineFeedLoader;
                this.f13883h = lVar;
                this.f13884i = iResponse;
            }

            public Object invoke() {
                this.f13879d.convertOpToReason(this.f13880e, this.f13881f);
                C13900g.m13322f(this.f13882g.dispatcher(), this.f13881f, false, 2, (Object) null);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13883h;
                if (lVar != null) {
                    lVar.invoke(this.f13884i);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$e$c */
        public static final class C2761c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2758e f13885d;

            /* renamed from: e */
            public final /* synthetic */ IResponse<C0740i2> f13886e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13887f;

            /* renamed from: g */
            public final /* synthetic */ boolean f13888g;

            /* renamed from: h */
            public final /* synthetic */ C13923t<C0740i2> f13889h;

            /* renamed from: i */
            public final /* synthetic */ FinderTimelineFeedLoader f13890i;

            /* renamed from: j */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13891j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2761c(C2758e eVar, IResponse<C0740i2> iResponse, RefreshLoadMoreLayout.C7080c<Object> cVar, boolean z, C54505r rVar, C13923t<C0740i2> tVar, FinderTimelineFeedLoader finderTimelineFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
                super(0);
                this.f13885d = eVar;
                this.f13886e = iResponse;
                this.f13887f = cVar;
                this.f13888g = z;
                this.f13889h = tVar;
                this.f13890i = finderTimelineFeedLoader;
                this.f13891j = lVar;
            }

            public Object invoke() {
                C2758e eVar = this.f13885d;
                IResponse<C0740i2> iResponse = this.f13886e;
                boolean z = this.f13888g;
                eVar.getClass();
                List<C0740i2> incrementList = iResponse.getIncrementList();
                if (incrementList != null) {
                    FinderTimelineFeedLoader finderTimelineFeedLoader = eVar.f13877b;
                    if (!incrementList.isEmpty()) {
                        boolean z2 = false;
                        C0740i2 i2Var = incrementList.get(0);
                        if (z) {
                            C9603s sVar = finderTimelineFeedLoader.f13843f;
                            if (sVar != null && i2Var.getItemId() == sVar.f29872e) {
                                z2 = true;
                            }
                            if (!z2) {
                                if (!finderTimelineFeedLoader.getDataList().isEmpty()) {
                                    finderTimelineFeedLoader.getDataList().clear();
                                    finderTimelineFeedLoader.dispatcher().mo13376a();
                                }
                                C9603s sVar2 = finderTimelineFeedLoader.f13843f;
                                long j = sVar2 != null ? sVar2.f29872e : 0;
                                String tag = finderTimelineFeedLoader.getTAG();
                                Log.m105924i(tag, "finder stream no return share feed feedId=" + j);
                                C11348f.C11349a.m11178b(C59319a.f169618b, "ShareFeedNoReturnError", false, (C11348f.C11352b) null, false, false, new C2811o0(j), 28, (Object) null);
                            }
                        }
                    }
                }
                this.f13885d.convertOpToReason(this.f13889h, this.f13887f);
                this.f13890i.dispatcher().mo13381g(this.f13887f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13891j;
                if (lVar != null) {
                    lVar.invoke(this.f13886e);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2758e(FinderTimelineFeedLoader finderTimelineFeedLoader) {
            super(finderTimelineFeedLoader, false, 1, (C8480h) null);
            this.f13877b = finderTimelineFeedLoader;
            boolean z = false;
            this.f13876a = (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || CrashReportFactory.hasDebuger()) ? true : z;
        }

        /* renamed from: a */
        public final void mo2807a(int i, String str) {
            if (!(str == null || str.length() == 0)) {
                FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
                aVar.f9177d = 0;
                aVar.f9182i = i;
                aVar.f9181h = str;
                aVar.f9175b = 9;
                feedUpdateEvent.publish();
            }
        }

        public void cleanDataList(DataBuffer<C0740i2> dataBuffer) {
            C87412m.m108594g(dataBuffer, "dataList");
            super.cleanDataList(dataBuffer);
        }

        /* JADX WARNING: Removed duplicated region for block: B:115:0x0231  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x0246  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x03f9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public tf1.C13921q mergeDataAndNotify(int r26, java.util.List<? extends cm1.C0740i2> r27, boolean r28, java.lang.Object r29) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                r3 = r28
                r4 = r29
                java.lang.String r5 = ""
                r7 = 0
                r8 = 1
                if (r3 != 0) goto L_0x023d
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r9 = r0.f13877b
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r9 = r9.getDataList()
                java.util.Iterator r9 = r9.iterator()
                r10 = 0
            L_0x001b:
                boolean r11 = r9.hasNext()
                r12 = -1
                if (r11 == 0) goto L_0x0030
                java.lang.Object r11 = r9.next()
                cm1.i2 r11 = (cm1.C0740i2) r11
                boolean r11 = r11 instanceof cm1.C0707a0
                if (r11 == 0) goto L_0x002d
                goto L_0x0031
            L_0x002d:
                int r10 = r10 + 1
                goto L_0x001b
            L_0x0030:
                r10 = -1
            L_0x0031:
                if (r2 == 0) goto L_0x004c
                java.util.Iterator r9 = r27.iterator()
                r11 = 0
            L_0x0038:
                boolean r13 = r9.hasNext()
                if (r13 == 0) goto L_0x004c
                java.lang.Object r13 = r9.next()
                cm1.i2 r13 = (cm1.C0740i2) r13
                boolean r13 = r13 instanceof cm1.C0707a0
                if (r13 == 0) goto L_0x0049
                goto L_0x004d
            L_0x0049:
                int r11 = r11 + 1
                goto L_0x0038
            L_0x004c:
                r11 = -1
            L_0x004d:
                java.lang.String r9 = "array.toString()"
                java.lang.String r13 = ", live update:"
                if (r10 != r12) goto L_0x00ea
                if (r11 == r12) goto L_0x00ea
                if (r2 == 0) goto L_0x023d
                java.lang.Object r10 = r2.get(r11)
                cm1.i2 r10 = (cm1.C0740i2) r10
                if (r10 == 0) goto L_0x023d
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r11 = r0.f13877b
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r12 = r11.getDataList()
                r12.add(r7, r10)
                tf1.g r12 = r11.dispatcher()
                r12.mo13379d(r7, r8)
                boolean r12 = r10 instanceof cm1.C0707a0
                if (r12 == 0) goto L_0x0077
                r12 = r10
                cm1.a0 r12 = (cm1.C0707a0) r12
                goto L_0x0078
            L_0x0077:
                r12 = 0
            L_0x0078:
                if (r12 == 0) goto L_0x007f
                java.util.ArrayList r12 = r12.mo683j()
                goto L_0x0080
            L_0x007f:
                r12 = 0
            L_0x0080:
                if (r12 == 0) goto L_0x008b
                boolean r14 = r12.isEmpty()
                if (r14 == 0) goto L_0x0089
                goto L_0x008b
            L_0x0089:
                r14 = 0
                goto L_0x008c
            L_0x008b:
                r14 = 1
            L_0x008c:
                if (r14 == 0) goto L_0x0090
                r6 = r5
                goto L_0x00be
            L_0x0090:
                org.json.JSONArray r14 = new org.json.JSONArray
                r14.<init>()
                java.util.Iterator r12 = r12.iterator()
            L_0x0099:
                boolean r15 = r12.hasNext()
                if (r15 == 0) goto L_0x00b7
                java.lang.Object r15 = r12.next()
                cm1.b0 r15 = (cm1.C0712b0) r15
                boolean r6 = r15 instanceof cm1.C0712b0
                if (r6 == 0) goto L_0x0099
                com.tencent.mm.protocal.protobuf.FinderObject r6 = r15.f1709d
                com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.contact
                if (r6 == 0) goto L_0x00b2
                java.lang.String r6 = r6.username
                goto L_0x00b3
            L_0x00b2:
                r6 = 0
            L_0x00b3:
                r14.put(r6)
                goto L_0x0099
            L_0x00b7:
                java.lang.String r6 = r14.toString()
                gy3.C87412m.m108593f(r6, r9)
            L_0x00be:
                r0.mo2807a(r8, r6)
                java.lang.String r9 = r11.getTAG()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "[updateLiveList] add "
                r11.append(r12)
                r11.append(r10)
                r11.append(r13)
                r11.append(r8)
                java.lang.String r10 = ", incrementUsernameString:"
                r11.append(r10)
                r11.append(r6)
                java.lang.String r6 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
                r14 = 1
                goto L_0x023e
            L_0x00ea:
                r6 = 2
                if (r10 == r12) goto L_0x0185
                if (r11 != r12) goto L_0x0185
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r11 = r0.f13877b
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r11 = r11.getDataList()
                java.lang.Object r11 = r11.remove(r10)
                java.lang.String r12 = "dataList.removeAt(oriLiveItemIndex)"
                gy3.C87412m.m108593f(r11, r12)
                cm1.i2 r11 = (cm1.C0740i2) r11
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r12 = r0.f13877b
                tf1.g r12 = r12.dispatcher()
                r12.mo13380e(r10, r8)
                boolean r10 = r11 instanceof cm1.C0707a0
                if (r10 == 0) goto L_0x0111
                r10 = r11
                cm1.a0 r10 = (cm1.C0707a0) r10
                goto L_0x0112
            L_0x0111:
                r10 = 0
            L_0x0112:
                if (r10 == 0) goto L_0x0119
                java.util.ArrayList r10 = r10.mo683j()
                goto L_0x011a
            L_0x0119:
                r10 = 0
            L_0x011a:
                if (r10 == 0) goto L_0x0125
                boolean r12 = r10.isEmpty()
                if (r12 == 0) goto L_0x0123
                goto L_0x0125
            L_0x0123:
                r12 = 0
                goto L_0x0126
            L_0x0125:
                r12 = 1
            L_0x0126:
                if (r12 == 0) goto L_0x012a
                r10 = r5
                goto L_0x0158
            L_0x012a:
                org.json.JSONArray r12 = new org.json.JSONArray
                r12.<init>()
                java.util.Iterator r10 = r10.iterator()
            L_0x0133:
                boolean r14 = r10.hasNext()
                if (r14 == 0) goto L_0x0151
                java.lang.Object r14 = r10.next()
                cm1.b0 r14 = (cm1.C0712b0) r14
                boolean r15 = r14 instanceof cm1.C0712b0
                if (r15 == 0) goto L_0x0133
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.f1709d
                com.tencent.mm.protocal.protobuf.FinderContact r14 = r14.contact
                if (r14 == 0) goto L_0x014c
                java.lang.String r14 = r14.username
                goto L_0x014d
            L_0x014c:
                r14 = 0
            L_0x014d:
                r12.put(r14)
                goto L_0x0133
            L_0x0151:
                java.lang.String r10 = r12.toString()
                gy3.C87412m.m108593f(r10, r9)
            L_0x0158:
                r0.mo2807a(r6, r10)
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r6 = r0.f13877b
                java.lang.String r6 = r6.getTAG()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r12 = "[updateLiveList] remove "
                r9.append(r12)
                r9.append(r11)
                r9.append(r13)
                r9.append(r7)
                java.lang.String r11 = ", removeUsernameString:"
                r9.append(r11)
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                goto L_0x023d
            L_0x0185:
                if (r10 == r12) goto L_0x023d
                if (r11 == r12) goto L_0x023d
                if (r2 == 0) goto L_0x023d
                java.lang.Object r9 = r2.get(r11)
                cm1.i2 r9 = (cm1.C0740i2) r9
                if (r9 == 0) goto L_0x023d
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r11 = r0.f13877b
                cm1.d$a r12 = cm1.C0721d.f1732e
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r14 = r11.getDataList()
                java.lang.Object r14 = r14.get(r10)
                boolean r15 = r14 instanceof cm1.C0707a0
                if (r15 == 0) goto L_0x01a6
                cm1.a0 r14 = (cm1.C0707a0) r14
                goto L_0x01a7
            L_0x01a6:
                r14 = 0
            L_0x01a7:
                if (r14 == 0) goto L_0x01ae
                java.util.ArrayList r14 = r14.mo683j()
                goto L_0x01af
            L_0x01ae:
                r14 = 0
            L_0x01af:
                boolean r15 = r9 instanceof cm1.C0707a0
                if (r15 == 0) goto L_0x01b7
                r15 = r9
                cm1.a0 r15 = (cm1.C0707a0) r15
                goto L_0x01b8
            L_0x01b7:
                r15 = 0
            L_0x01b8:
                if (r15 == 0) goto L_0x01bf
                java.util.ArrayList r15 = r15.mo683j()
                goto L_0x01c0
            L_0x01bf:
                r15 = 0
            L_0x01c0:
                cm1.d r12 = r12.mo697a(r14, r15)
                java.util.ArrayList<cm1.b0> r14 = r12.f1733a
                if (r14 == 0) goto L_0x01d1
                boolean r14 = r14.isEmpty()
                if (r14 == 0) goto L_0x01cf
                goto L_0x01d1
            L_0x01cf:
                r14 = 0
                goto L_0x01d2
            L_0x01d1:
                r14 = 1
            L_0x01d2:
                if (r14 == 0) goto L_0x01e7
                java.util.ArrayList<cm1.b0> r14 = r12.f1734b
                if (r14 == 0) goto L_0x01e1
                boolean r14 = r14.isEmpty()
                if (r14 == 0) goto L_0x01df
                goto L_0x01e1
            L_0x01df:
                r14 = 0
                goto L_0x01e2
            L_0x01e1:
                r14 = 1
            L_0x01e2:
                if (r14 != 0) goto L_0x01e5
                goto L_0x01e7
            L_0x01e5:
                r14 = 0
                goto L_0x01e8
            L_0x01e7:
                r14 = 1
            L_0x01e8:
                java.lang.String r15 = r12.f1735c
                r0.mo2807a(r8, r15)
                java.lang.String r15 = r12.f1736d
                r0.mo2807a(r6, r15)
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r11.getDataList()
                r6.set(r10, r9)
                java.lang.String r6 = r11.getTAG()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r7 = "[updateLiveList] replace "
                r15.append(r7)
                r15.append(r9)
                r15.append(r13)
                r15.append(r14)
                java.lang.String r7 = ", incrememnt username:"
                r15.append(r7)
                java.lang.String r7 = r12.f1735c
                r15.append(r7)
                java.lang.String r7 = ",remove username:"
                r15.append(r7)
                java.lang.String r7 = r12.f1736d
                r15.append(r7)
                java.lang.String r7 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                tf1.g r6 = r11.dispatcher()
                if (r14 == 0) goto L_0x0235
                r6.mo13377b(r10, r8)
                goto L_0x023e
            L_0x0235:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r6.mo13378c(r10, r8, r7)
                goto L_0x023e
            L_0x023d:
                r14 = 0
            L_0x023e:
                java.util.ArrayList r6 = new java.util.ArrayList
                if (r2 == 0) goto L_0x0246
                r6.<init>(r2)
                goto L_0x0249
            L_0x0246:
                r6.<init>()
            L_0x0249:
                r7 = 10
                if (r1 != r7) goto L_0x03d7
                up1.f r9 = up1.C37521f.f99374d
                r9.getClass()
                pe1.c<java.lang.Integer> r9 = up1.C37521f.f99225L6
                java.lang.Object r9 = r9.mo60266n()
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r9 != r8) goto L_0x03d7
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r9 = r0.f13877b
                java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r9 = r9.f13847j
                if (r9 == 0) goto L_0x03d7
                java.lang.Object r9 = r9.get()
                androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
                if (r9 == 0) goto L_0x03d7
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r10 = r0.f13877b
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r11 = r10.getDataList()
                int r11 = r11.size()
                if (r11 > 0) goto L_0x027c
                goto L_0x03d7
            L_0x027c:
                java.lang.Object r11 = sx3.C110818d0.m150916N(r6)
                boolean r11 = r11 instanceof cm1.C0745k0
                if (r11 == 0) goto L_0x028f
                java.lang.String r9 = r10.getTAG()
                java.lang.String r10 = "mergeDataAndNotify: first item is FinderFoldedFeed, do not add history feed"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r10)
                goto L_0x03d7
            L_0x028f:
                androidx.recyclerview.widget.RecyclerView$LayoutManager r9 = r9.getLayoutManager()
                boolean r11 = r9 instanceof androidx.recyclerview.widget.LinearLayoutManager
                if (r11 == 0) goto L_0x029a
                androidx.recyclerview.widget.LinearLayoutManager r9 = (androidx.recyclerview.widget.LinearLayoutManager) r9
                goto L_0x029b
            L_0x029a:
                r9 = 0
            L_0x029b:
                if (r9 == 0) goto L_0x03d7
                int r9 = r9.mo16957C()
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r11 = r10.getDataList()
                int r11 = r11.size()
                int r11 = r11 - r8
                int r9 = java.lang.Math.min(r9, r11)
                if (r9 >= 0) goto L_0x02b1
                r9 = 0
            L_0x02b1:
                java.lang.String r11 = r10.getTAG()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "mergeDataAndNotify: leaveIndex = "
                r12.append(r13)
                r12.append(r9)
                java.lang.String r13 = ", size = "
                r12.append(r13)
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r13 = r10.getDataList()
                int r13 = r13.size()
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                if (r9 < 0) goto L_0x02fe
                r12 = 0
            L_0x02e1:
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r13 = r10.getDataList()
                java.lang.Object r13 = r13.get(r12)
                boolean r15 = r13 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r15 == 0) goto L_0x02f0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
                goto L_0x02f1
            L_0x02f0:
                r13 = 0
            L_0x02f1:
                if (r13 == 0) goto L_0x02f9
                r13.mo3497e0(r8)
                r11.add(r13)
            L_0x02f9:
                if (r12 == r9) goto L_0x02fe
                int r12 = r12 + 1
                goto L_0x02e1
            L_0x02fe:
                boolean r9 = r11.isEmpty()
                r9 = r9 ^ r8
                if (r9 == 0) goto L_0x03d7
                java.lang.String r9 = r10.getTAG()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "mergeDataAndNotify: historySize = "
                r12.append(r13)
                int r13 = r11.size()
                r12.append(r13)
                java.lang.String r13 = ", feedIds = "
                r12.append(r13)
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$e$a r22 = com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader.C2758e.C2759a.f13878d
                r23 = 31
                r24 = 0
                r16 = r11
                java.lang.String r13 = sx3.C110818d0.m150921S(r16, r17, r18, r19, r20, r21, r22, r23, r24)
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)
                int r9 = r11.size()
                r12 = 0
            L_0x0344:
                if (r12 >= r9) goto L_0x03d3
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r15 = r6.iterator()
            L_0x034f:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x037c
                java.lang.Object r7 = r15.next()
                r17 = r7
                cm1.i2 r17 = (cm1.C0740i2) r17
                long r17 = r17.getItemId()
                java.lang.Object r19 = r11.get(r12)
                cm1.i2 r19 = (cm1.C0740i2) r19
                long r19 = r19.getItemId()
                int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                if (r21 != 0) goto L_0x0372
                r17 = 1
                goto L_0x0374
            L_0x0372:
                r17 = 0
            L_0x0374:
                if (r17 == 0) goto L_0x0379
                r13.add(r7)
            L_0x0379:
                r7 = 10
                goto L_0x034f
            L_0x037c:
                boolean r7 = r13.isEmpty()
                r7 = r7 ^ r8
                if (r7 == 0) goto L_0x03cc
                java.lang.String r7 = r10.getTAG()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r8 = "mergeDataAndNotify: repeat feed deleted, feedId = "
                r15.append(r8)
                java.lang.Object r8 = r11.get(r12)
                cm1.i2 r8 = (cm1.C0740i2) r8
                long r18 = r8.getItemId()
                java.lang.String r8 = o40.C61926c.m72691p(r18)
                r15.append(r8)
                java.lang.String r8 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                r6.removeAll(r13)
                java.lang.Object r7 = sx3.C110818d0.m150914L(r13)
                r8 = r7
                cm1.i2 r8 = (cm1.C0740i2) r8
                boolean r13 = r8 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r13 == 0) goto L_0x03ba
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8
                goto L_0x03bb
            L_0x03ba:
                r8 = 0
            L_0x03bb:
                if (r8 != 0) goto L_0x03be
                goto L_0x03c2
            L_0x03be:
                r13 = 1
                r8.mo3497e0(r13)
            L_0x03c2:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                java.lang.String r8 = "filterFeeds.first().appl…                        }"
                gy3.C87412m.m108593f(r7, r8)
                r11.set(r12, r7)
            L_0x03cc:
                int r12 = r12 + 1
                r7 = 10
                r8 = 1
                goto L_0x0344
            L_0x03d3:
                r7 = 0
                r6.addAll(r7, r11)
            L_0x03d7:
                tf1.q r7 = super.mergeDataAndNotify(r1, r6, r3, r4)
                r8 = 4
                if (r2 == 0) goto L_0x03f5
                if (r3 != 0) goto L_0x03f5
                if (r1 != r8) goto L_0x03f5
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13877b
                java.lang.String r2 = r2.getTAG()
                java.lang.String r3 = "isNeedClear false, manual merge..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                r2 = 1
                tf1.q r7 = r0.merge(r6, r2, r4)
                r2 = 0
                r7.f39116b = r2
            L_0x03f5:
                boolean r2 = r0.f13876a
                if (r2 == 0) goto L_0x04bf
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13877b
                ke1.x r2 = r2.f13845h
                int r2 = r2.f29912g
                if (r2 != r8) goto L_0x045e
                r3 = 1
                if (r1 != r3) goto L_0x045e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13877b
                java.lang.String r2 = r2.getTAG()
                r1.append(r2)
                java.lang.String r2 = "#loadMore"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13877b
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataList()
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = sx3.C36907w.m41090l(r2, r4)
                r3.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L_0x0430:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0456
                java.lang.Object r4 = r2.next()
                cm1.i2 r4 = (cm1.C0740i2) r4
                boolean r6 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r6 == 0) goto L_0x0451
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                long r8 = r4.f164794id
                java.lang.String r4 = o40.C61926c.m72691p(r8)
                goto L_0x0452
            L_0x0451:
                r4 = r5
            L_0x0452:
                r3.add(r4)
                goto L_0x0430
            L_0x0456:
                java.lang.String r2 = java.lang.String.valueOf(r3)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                goto L_0x04bf
            L_0x045e:
                if (r2 != r8) goto L_0x04bf
                if (r1 == r8) goto L_0x0466
                r2 = 10
                if (r1 != r2) goto L_0x04bf
            L_0x0466:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13877b
                java.lang.String r2 = r2.getTAG()
                r1.append(r2)
                java.lang.String r2 = "#refresh"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13877b
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataList()
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = sx3.C36907w.m41090l(r2, r4)
                r3.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L_0x0492:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x04b8
                java.lang.Object r4 = r2.next()
                cm1.i2 r4 = (cm1.C0740i2) r4
                boolean r6 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r6 == 0) goto L_0x04b3
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                long r8 = r4.f164794id
                java.lang.String r4 = o40.C61926c.m72691p(r8)
                goto L_0x04b4
            L_0x04b3:
                r4 = r5
            L_0x04b4:
                r3.add(r4)
                goto L_0x0492
            L_0x04b8:
                java.lang.String r2 = java.lang.String.valueOf(r3)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            L_0x04bf:
                boolean r1 = r7.f39119e
                r1 = r1 | r14
                r7.f39119e = r1
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader.C2758e.mergeDataAndNotify(int, java.util.List, boolean, java.lang.Object):tf1.q");
        }

        public void mergeLoadMore(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            if (iResponse instanceof C2757d) {
                this.f13877b.getDataListJustForAdapter().setBuffer(((C2757d) iResponse).f13873b);
            }
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(iResponse.getPullType());
            cVar.f24951f = iResponse.getHasMore();
            cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.es6);
            cVar.f24947b = 2;
            cVar.f24952g = !iResponse.getHasMore();
            String tag = this.f13877b.getTAG();
            Log.m105924i(tag, "[onFetchLoadMoreDone] tabtype=" + this.f13877b.f13841d.f39109d + " reason=" + cVar);
            C61926c.m72668M(new C2760b(this, new C13923t(iResponse.getHasMore() ? 1 : 5, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null), cVar, this.f13877b, lVar, iResponse));
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            int i;
            IResponse<C0740i2> iResponse2 = iResponse;
            C87412m.m108594g(iResponse2, "response");
            int pullType = iResponse.getPullType();
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(pullType);
            boolean z = true;
            if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
                cVar.f24947b = 1;
            } else {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.esd);
                cVar.f24947b = -1;
            }
            cVar.f24950e = iResponse2;
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar2 = this.f13877b.f13851q;
            if (lVar2 != null) {
                lVar2.invoke(iResponse2);
            }
            cVar.f24952g = iResponse.getPullType() != 0;
            cVar.f24951f = iResponse.getHasMore();
            if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0 && (pullType == 0 || pullType == 4 || pullType == 1)) {
                if (cVar.f24953h > 0 || this.f13877b.getDataListJustForAdapter().size() <= 0) {
                    cVar.f24948c = null;
                } else {
                    cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.ese);
                }
            }
            String tag = this.f13877b.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone] tabtype=" + this.f13877b.f13841d.f39109d + " reason=" + cVar);
            C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C54505r.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…ePreloadCore::class.java)");
            C54505r rVar = (C54505r) a;
            FinderTimelineFeedLoader finderTimelineFeedLoader = this.f13877b;
            C9603s sVar = finderTimelineFeedLoader.f13843f;
            boolean z2 = (sVar != null && sVar.f29876i == 1) && finderTimelineFeedLoader.f13841d.f39109d == 4 && !finderTimelineFeedLoader.f13848n;
            boolean z3 = C65834e.f189316a.mo89871e(sVar != null ? sVar.f29872e : 0) != null;
            if (z2 && z3) {
                cVar.f24955j = true;
                i = 9;
            } else if (iResponse.getHasMore()) {
                cVar.f24955j = false;
                if (iResponse.getPullType() == 0) {
                    FinderTimelineFeedLoader finderTimelineFeedLoader2 = this.f13877b;
                    C9603s sVar2 = finderTimelineFeedLoader2.f13843f;
                    if (sVar2 == null || !sVar2.f29879l) {
                        z = false;
                    }
                    i = (!z || finderTimelineFeedLoader2.f13841d.f39109d != 4) ? 10 : 11;
                } else {
                    i = 4;
                }
            } else {
                cVar.f24955j = false;
                i = 6;
            }
            C61926c.m72668M(new C2761c(this, iResponse, cVar, z2, rVar, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), this.f13877b, lVar));
        }

        public boolean needCleanWhenRefresh(List<? extends C0740i2> list) {
            C87412m.m108594g(list, "newList");
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
            if ((r3 == null || r3.isEmpty()) == false) goto L_0x004d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onDataReplace(tf1.C13914m r8, int r9) {
            /*
                r7 = this;
                cm1.i2 r8 = (cm1.C0740i2) r8
                java.lang.String r0 = "feed"
                gy3.C87412m.m108594g(r8, r0)
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r0 = r7.f13877b
                java.lang.Object r0 = r0.safeGet(r9)
                cm1.i2 r0 = (cm1.C0740i2) r0
                boolean r1 = r8 instanceof cm1.C0707a0
                r2 = 0
                if (r1 == 0) goto L_0x00aa
                boolean r1 = r0 instanceof cm1.C0707a0
                if (r1 == 0) goto L_0x00aa
                cm1.d$a r1 = cm1.C0721d.f1732e
                r3 = r0
                cm1.a0 r3 = (cm1.C0707a0) r3
                java.util.ArrayList r3 = r3.mo683j()
                r4 = r8
                cm1.a0 r4 = (cm1.C0707a0) r4
                java.util.ArrayList r4 = r4.mo683j()
                cm1.d r1 = r1.mo697a(r3, r4)
                java.util.ArrayList<cm1.b0> r3 = r1.f1733a
                r4 = 1
                if (r3 == 0) goto L_0x003a
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0038
                goto L_0x003a
            L_0x0038:
                r3 = 0
                goto L_0x003b
            L_0x003a:
                r3 = 1
            L_0x003b:
                if (r3 == 0) goto L_0x004d
                java.util.ArrayList<cm1.b0> r3 = r1.f1734b
                if (r3 == 0) goto L_0x004a
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0048
                goto L_0x004a
            L_0x0048:
                r3 = 0
                goto L_0x004b
            L_0x004a:
                r3 = 1
            L_0x004b:
                if (r3 != 0) goto L_0x004e
            L_0x004d:
                r2 = 1
            L_0x004e:
                java.lang.String r3 = r1.f1735c
                r7.mo2807a(r4, r3)
                r3 = 2
                java.lang.String r5 = r1.f1736d
                r7.mo2807a(r3, r5)
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r3 = r7.f13877b
                java.lang.String r3 = r3.getTAG()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "[updateLiveList] onDataReplace oriData:"
                r5.append(r6)
                r5.append(r0)
                java.lang.String r0 = " newData:"
                r5.append(r0)
                r5.append(r8)
                java.lang.String r8 = ", update:"
                r5.append(r8)
                r5.append(r2)
                java.lang.String r8 = ", increment username:"
                r5.append(r8)
                java.lang.String r8 = r1.f1735c
                r5.append(r8)
                java.lang.String r8 = ", remove username:"
                r5.append(r8)
                java.lang.String r8 = r1.f1736d
                r5.append(r8)
                java.lang.String r8 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r8 = r7.f13877b
                tf1.g r8 = r8.dispatcher()
                if (r2 == 0) goto L_0x00a3
                r8.mo13377b(r9, r4)
                goto L_0x00aa
            L_0x00a3:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                r8.mo13378c(r9, r4, r0)
            L_0x00aa:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader.C2758e.onDataReplace(tf1.m, int):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$f */
    public static final class C2762f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C2762f f13892d = new C2762f();

        public C2762f() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99425i6.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderTimelineFeedLoader(C13908i iVar, int i, C49712hj1 hj12, C9603s sVar, C32227p pVar, int i2, C8480h hVar) {
        this(iVar, (i2 & 2) != 0 ? 0 : i, hj12, (i2 & 8) != 0 ? null : sVar, (i2 & 16) != 0 ? null : pVar);
    }

    public List<Integer> colletExtraPageName() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(4);
        return arrayList;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2752b(this, this.f13845h, this.f13841d);
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2758e(this);
    }

    /* renamed from: d */
    public final void mo2802d() {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        getDataList().clear();
        WeakReference<RecyclerView> weakReference = this.f13847j;
        if (weakReference != null && (recyclerView = weakReference.get()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public final void mo2803e(List<? extends BaseFinderFeed> list) {
        int i = this.f13842e;
        C2756c cVar = new C2756c(i, list);
        cVar.f13868a = i;
        String tag = getTAG();
        Log.m105924i(tag, "[requestRefresh] tabtype=" + this.f13841d.f39109d + " pullType=" + cVar.f13868a);
        super.request(cVar, this);
        if (this.f13842e == 0) {
            this.f13842e = 1;
            if (this.f13841d.f39109d == 4) {
                C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
                C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
                C11739f fVar = (C11739f) a;
                C11739f.C11740a c3 = fVar.mo11600c3(4);
                if (c3.f34374g >= 0 && fVar.mo11603f3(4)) {
                    c3.f34377j = false;
                    String tag2 = getTAG();
                    Log.m105924i(tag2, "stateCache=" + c3.f34368a + " reset isAtAppPush");
                }
            }
        }
    }

    public int getPageName() {
        C58784w3 w3Var = C58784w3.f168295a;
        return w3Var.mo83884L1(w3Var.mo83887M1(this.f13841d.f39109d));
    }

    public boolean isObservePostEvent() {
        if (this.f13841d == C13908i.FEED_TIMELINE_FOLLOW) {
            return true;
        }
        C37521f.f99374d.getClass();
        return C37521f.f99420i1.mo60266n().intValue() != 1;
    }

    public void onDataChanged() {
        super.onDataChanged();
    }

    public void onDead() {
        super.onDead();
        if (this.f13845h.f29921s && (this.f13845h.f29922t == 0 || this.f13845h.f29922t == 4 || this.f13845h.f29922t == 1)) {
            int i = this.f13841d.f39109d;
            C58341h f3 = ((FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class)).mo78457f3(i);
            if (f3 != null) {
                f3.mo83098u(true, C58341h.C58344f.RefreshContinue);
            }
            String tag = getTAG();
            Log.m105928w(tag, "[onDead] but finderstream is running. tabType=" + i + " pullType=" + this.f13845h.f29922t);
        }
        this.f13845h.f29915j.dead();
        C0000n0 n0Var = this.f13845h.f29916n;
        C53930o0.m60557d(n0Var, getTAG() + ":onDead", (Throwable) null, 2, (Object) null);
        this.f13844g = null;
    }

    public void onFetchLoadMoreDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchLoadMoreDone(iResponse);
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13849o;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
    }

    public void onFetchRefreshDone(IResponse<C0740i2> iResponse) {
        List incrementList;
        BaseFinderFeed baseFinderFeed;
        IResponse<C0740i2> iResponse2 = iResponse;
        C87412m.m108594g(iResponse2, "response");
        super.onFetchRefreshDone(iResponse);
        C9603s sVar = this.f13843f;
        if ((sVar != null && sVar.f29876i == 1) && this.f13841d.f39109d == 4) {
            this.f13848n = true;
        }
        BaseFinderFeed baseFinderFeed2 = null;
        C2757d dVar = iResponse2 instanceof C2757d ? (C2757d) iResponse2 : null;
        if (!(dVar == null || dVar.getPullType() != 0 || (incrementList = dVar.getIncrementList()) == null)) {
            Iterator it = incrementList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0740i2 i2Var = (C0740i2) it.next();
                if (i2Var instanceof BaseFinderFeed) {
                    baseFinderFeed = (BaseFinderFeed) i2Var;
                    continue;
                } else {
                    baseFinderFeed = null;
                    continue;
                }
                if (baseFinderFeed != null) {
                    baseFinderFeed2 = baseFinderFeed;
                    break;
                }
            }
            if (baseFinderFeed2 != null) {
                C2490t tVar = C2490t.f13006a;
                FinderObject feedObject = baseFinderFeed2.mo3513o().getFeedObject();
                int i = this.f13841d.f39109d;
                tVar.getClass();
                C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
                if (C2490t.f13008c != 0 && i == C2490t.f13007b) {
                    C11348f.C11349a.m11178b(C59319a.f169618b, "finderEnterRefreshWrongRedDotFeed", feedObject.f164794id == C2490t.f13008c, (C11348f.C11352b) null, false, false, new C2489s(feedObject, i), 28, (Object) null);
                    C2490t.f13007b = -1;
                    C2490t.f13008c = 0;
                    C2490t.f13009d = "";
                }
            }
        }
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13849o;
        if (lVar != null) {
            lVar.invoke(iResponse2);
        }
    }

    public BaseFinderFeed onPostStart(long j, boolean z) {
        BaseFinderFeed onPostStart = super.onPostStart(j, z);
        this.f13846i = true;
        return onPostStart;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTimelineFeedLoader(C13908i iVar, int i, C49712hj1 hj12, C9603s sVar, C32227p<? super String, ? super BaseFinderFeed, C13598b0> pVar) {
        super(hj12);
        C87412m.m108594g(iVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f13841d = iVar;
        this.f13842e = i;
        this.f13843f = sVar;
        this.f13844g = pVar;
        this.f13845h = new C9610x(iVar.f39109d, hj12, sVar);
        this.f13850p = C36568h.m40985a(C2762f.f13892d);
    }

    public void onPostStart(long j) {
        super.onPostStart(j);
        this.f13846i = true;
        Log.m105924i(getTAG(), "onPostStart postFeedFlag true");
    }
}
