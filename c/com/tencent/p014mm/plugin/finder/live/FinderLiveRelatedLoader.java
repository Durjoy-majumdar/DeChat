package com.tencent.p014mm.plugin.finder.live;

import al1.C54127h;
import al1.C54129i;
import al1.C54131l;
import android.content.Context;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di0.C86299o;
import eg1.C58598w;
import f40.C86709a0;
import fe1.C58961d;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import je1.C46523h2;
import je1.C46526n3;
import kotlin.Metadata;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C48965c71;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49876io0;
import te3.C50168kr0;
import te3.C50741ow;
import te3.C51395th0;
import te3.C51938x81;
import tf1.C13899f;
import tf1.C13910j;
import tf1.C13911k;
import vp1.C65834e;
import zk1.C66879r0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/FinderLiveRelatedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lal1/h;", "<init>", "()V", "a", "b", "c", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader */
public final class FinderLiveRelatedLoader extends BaseFeedLoader<C54127h> {

    /* renamed from: d */
    public C54131l f159187d = new C54131l((C89349b) null, 0, (String) null, (C50168kr0) null, (FinderObject) null, 0, (String) null, 0, 0.0f, 0.0f, 0, 0, (String) null, (C51395th0) null, 0, (LinkedList) null, 0, (C51938x81) null, false, 524287, (C8480h) null);

    /* renamed from: e */
    public C32226l<? super IResponse<C54127h>, C13598b0> f159188e;

    /* renamed from: f */
    public int f159189f;

    /* renamed from: g */
    public final C55877c f159190g = new C55877c();

    /* renamed from: h */
    public boolean f159191h = true;

    /* renamed from: i */
    public Context f159192i;

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader$a */
    public class C55875a extends C13911k<C54127h> implements C11385n {

        /* renamed from: d */
        public final Map<C117747y, C13910j<C54127h>> f159193d = new LinkedHashMap();

        public C55875a() {
        }

        public void alive() {
            super.alive();
            C86709a0.m107524d().mo123455a(mo77511b(), this);
        }

        /* renamed from: b */
        public int mo77511b() {
            throw null;
        }

        public void dead() {
            super.dead();
            C86709a0.m107524d().mo123470p(mo77511b(), this);
        }

        public void fetch(Object obj, C13910j<C54127h> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            if (obj != null && (obj instanceof C117747y)) {
                this.f159193d.put(obj, jVar);
                C86709a0.m107524d().mo123460f((C117747y) obj);
            }
        }

        public void fetchInit(C13910j<C54127h> jVar) {
            C87412m.m108594g(jVar, "callback");
            C13899f fVar = new C13899f();
            fVar.setPullType(1000);
            jVar.onFetchDone(fVar);
        }

        public void fetchLoadMore(C13910j<C54127h> jVar, boolean z) {
            C66879r0 r0Var;
            C87412m.m108594g(jVar, "callback");
            C117747y genLoadMoreNetScene = genLoadMoreNetScene();
            if (genLoadMoreNetScene instanceof C46526n3) {
                C54131l lVar = FinderLiveRelatedLoader.this.f159187d;
                C51395th0 th02 = lVar.f152034n;
                if (th02 != null && th02.f142216d == 3) {
                    ((C46526n3) genLoadMoreNetScene).f125346t = true;
                }
                if (lVar.f152039s) {
                    lVar.f152039s = false;
                    ((C46526n3) genLoadMoreNetScene).mo71877p1(3);
                } else {
                    ((C46526n3) genLoadMoreNetScene).mo71877p1(2);
                }
                Context context = FinderLiveRelatedLoader.this.f159192i;
                if (!(context == null || (r0Var = (C66879r0) C39818r.f106831a.mo62443b(context).mo62449e(C66879r0.class)) == null)) {
                    r0Var.mo90872c3((C46526n3) genLoadMoreNetScene);
                }
            }
            C13911k.fetch$default(this, genLoadMoreNetScene, jVar, false, 4, (Object) null);
        }

        public void fetchPreload(C13910j<C54127h> jVar) {
            C66879r0 r0Var;
            C87412m.m108594g(jVar, "callback");
            C117747y genLoadMoreNetScene = genLoadMoreNetScene();
            if (genLoadMoreNetScene instanceof C46526n3) {
                C51395th0 th02 = FinderLiveRelatedLoader.this.f159187d.f152034n;
                boolean z = false;
                if (th02 != null && th02.f142216d == 3) {
                    z = true;
                }
                if (z) {
                    ((C46526n3) genLoadMoreNetScene).f125346t = true;
                }
                C46526n3 n3Var = (C46526n3) genLoadMoreNetScene;
                n3Var.mo71877p1(3);
                Context context = FinderLiveRelatedLoader.this.f159192i;
                if (!(context == null || (r0Var = (C66879r0) C39818r.f106831a.mo62443b(context).mo62449e(C66879r0.class)) == null)) {
                    r0Var.mo90872c3(n3Var);
                }
            }
            C13911k.fetch$default(this, genLoadMoreNetScene, jVar, false, 4, (Object) null);
        }

        public void fetchRefresh(C13910j<C54127h> jVar) {
            C87412m.m108594g(jVar, "callback");
            C117747y genLoadMoreNetScene = genLoadMoreNetScene();
            if (genLoadMoreNetScene instanceof C46526n3) {
                C51395th0 th02 = FinderLiveRelatedLoader.this.f159187d.f152034n;
                boolean z = false;
                if (th02 != null && th02.f142216d == 3) {
                    z = true;
                }
                if (z) {
                    ((C46526n3) genLoadMoreNetScene).f125346t = true;
                }
                ((C46526n3) genLoadMoreNetScene).mo71877p1(4);
            }
            C13911k.fetch$default(this, genLoadMoreNetScene, jVar, false, 4, (Object) null);
        }

        public C117747y genLoadMoreNetScene() {
            throw null;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C55876b bVar;
            C117747y yVar2 = yVar;
            C87412m.m108594g(yVar2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C13910j jVar = (C13910j) ((LinkedHashMap) this.f159193d).get(yVar2);
            if (jVar != null) {
                FinderLiveRelatedLoader finderLiveRelatedLoader = FinderLiveRelatedLoader.this;
                this.f159193d.remove(yVar2);
                if (yVar2 instanceof C46526n3) {
                    boolean z = true;
                    boolean I0 = (i == 0 && i2 == 0) ? ((C46526n3) yVar2).mo71874I0() : true;
                    C51395th0 th02 = FinderLiveRelatedLoader.this.f159187d.f152034n;
                    if (th02 == null || th02.f142216d != 3) {
                        z = false;
                    }
                    if (z) {
                        if (th02 != null) {
                            th02.f142217e = null;
                        }
                        if (th02 != null) {
                            th02.f142216d = 0;
                        }
                    }
                    C46526n3 n3Var = (C46526n3) yVar2;
                    bVar = new C55876b(n3Var.f125340n, i, i2, str, n3Var.f125346t);
                    LinkedList<FinderObject> n1 = n3Var.mo71875n1();
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(n1, 10));
                    for (FinderObject finderObject : n1) {
                        C58961d.C58963b.m68837m(C58961d.f168673a, finderObject.contact, false, 2, (Object) null);
                        C65834e.f189316a.mo89878l(FinderItem.Companion.mo79056a(finderObject, 16384), C65834e.C65836b.f189330j);
                        arrayList.add(new C54127h(finderObject));
                    }
                    bVar.setIncrementList(arrayList);
                    bVar.setPullType(n3Var.f125341o);
                    C47350c cVar = n3Var.f125336g;
                    if (cVar != null) {
                        C47465a aVar = cVar.f127056b.f127083a;
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                        bVar.setLastBuffer(((C49876io0) aVar).f135530e);
                        bVar.setHasMore(I0);
                        HashMap<Integer, C86299o> hashMap = C54129i.f151984l;
                        C47350c cVar2 = n3Var.f125336g;
                        if (cVar2 != null) {
                            C47465a aVar2 = cVar2.f127056b.f127083a;
                            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                            C54129i.f151985m = ((C49876io0) aVar2).f135533h * 1000;
                            String tag = getTAG();
                            StringBuilder sb = new StringBuilder();
                            sb.append("incrementList size: ");
                            List incrementList = bVar.getIncrementList();
                            sb.append(incrementList != null ? Integer.valueOf(incrementList.size()) : null);
                            sb.append(",refresh_interval:");
                            sb.append(C54129i.f151985m);
                            Log.m105924i(tag, sb.toString());
                        } else {
                            C87412m.m108603p("rr");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("rr");
                        throw null;
                    }
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    jVar.onFetchDone(bVar);
                    return;
                }
                C32226l<? super IResponse<C54127h>, C13598b0> lVar = finderLiveRelatedLoader.f159188e;
                if (lVar != null) {
                    lVar.invoke(null);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader$b */
    public static final class C55876b extends IResponse<C54127h> {

        /* renamed from: a */
        public final int f159195a;

        /* renamed from: b */
        public final boolean f159196b;

        public C55876b(int i, int i2, int i3, String str, boolean z) {
            super(i2, i3, str);
            this.f159195a = i;
            this.f159196b = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader$c */
    public final class C55877c extends C55875a {
        public C55877c() {
            super();
        }

        /* renamed from: b */
        public int mo77511b() {
            return 6479;
        }

        public C117747y genLoadMoreNetScene() {
            C50168kr0 kr02;
            C49842ig0 a = C46523h2.f125330a.mo71859a(6479);
            FinderLiveRelatedLoader finderLiveRelatedLoader = FinderLiveRelatedLoader.this;
            a.f135313e = finderLiveRelatedLoader.f159187d.f152031k;
            C50741ow owVar = new C50741ow();
            owVar.f139396d = finderLiveRelatedLoader.f159187d.f152033m;
            a.f135316h = owVar;
            C49712hj1 hj12 = new C49712hj1();
            FinderLiveRelatedLoader finderLiveRelatedLoader2 = FinderLiveRelatedLoader.this;
            C54131l lVar = finderLiveRelatedLoader2.f159187d;
            int i = lVar.f152031k;
            hj12.f134677n = i;
            hj12.f134675i = i;
            C89349b bVar = null;
            if (finderLiveRelatedLoader2.f159191h) {
                C50168kr0 kr03 = lVar.f152024d;
                FinderObject finderObject = lVar.f152025e;
                if (finderObject != null) {
                    bVar = finderObject.live_related_last_buffer;
                }
                lVar.f152021a = bVar;
                finderLiveRelatedLoader2.f159191h = false;
                kr02 = kr03;
            } else {
                kr02 = null;
            }
            long j = lVar.f152022b;
            String str = lVar.f152027g;
            String str2 = lVar.f152023c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C89349b bVar2 = lVar.f152021a;
            float f = lVar.f152029i;
            float f2 = lVar.f152030j;
            C51395th0 th02 = lVar.f152034n;
            LinkedList<C48965c71> linkedList = lVar.f152036p;
            int i2 = lVar.f152037q;
            int i3 = C58598w.f167764h;
            C46526n3 n3Var = new C46526n3(j, str, str3, bVar2, i, f, f2, a, kr02, hj12, th02, linkedList, i2, C58598w.f167767k, lVar.f152038r);
            FinderLiveRelatedLoader finderLiveRelatedLoader3 = FinderLiveRelatedLoader.this;
            n3Var.mo71877p1(2);
            n3Var.f125345s = finderLiveRelatedLoader3.f159187d.f152035o;
            n3Var.f125340n = finderLiveRelatedLoader3.f159189f;
            StringBuilder sb = new StringBuilder();
            for (C48965c71 c712 : FinderLiveRelatedLoader.this.f159187d.f152036p) {
                sb.append("objectId:" + c712.f131557d + ',');
            }
            sb.append("curIndex:" + FinderLiveRelatedLoader.this.f159187d.f152037q);
            Log.m105918d(getTAG(), "genLoadMoreNetScene " + sb);
            return n3Var;
        }
    }

    public FinderLiveRelatedLoader() {
        super((C49712hj1) null, 1, (C8480h) null);
    }

    public C13911k<C54127h> createDataFetch() {
        return this.f159190g;
    }

    public void onFetchDone(IResponse<C54127h> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/FinderLiveRelatedLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        C32226l<? super IResponse<C54127h>, C13598b0> lVar = this.f159188e;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/FinderLiveRelatedLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
