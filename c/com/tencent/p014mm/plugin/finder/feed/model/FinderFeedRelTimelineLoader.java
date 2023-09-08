package com.tencent.p014mm.plugin.finder.feed.model;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46511c0;
import kf1.C9845l9;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C89132b;
import os1.C62165o;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49165dm1;
import te3.C49203dy1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50159kp0;
import te3.C50294lp0;
import te3.C51449tu2;
import te3.C64441i93;
import te3.C64629pl1;
import te3.C64654qd;
import te3.db4;
import te3.op4;
import tf1.C13893c;
import tf1.C13910j;
import tf1.C13911k;
import wp1.C15585f;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader */
public class FinderFeedRelTimelineLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final long f13539d;

    /* renamed from: e */
    public final String f13540e;

    /* renamed from: f */
    public final int f13541f;

    /* renamed from: g */
    public String f13542g;

    /* renamed from: h */
    public int f13543h;

    /* renamed from: i */
    public boolean f13544i;

    /* renamed from: j */
    public C49203dy1 f13545j;

    /* renamed from: n */
    public C89349b f13546n;

    /* renamed from: o */
    public db4 f13547o;

    /* renamed from: p */
    public int f13548p;

    /* renamed from: q */
    public C50159kp0 f13549q;

    /* renamed from: r */
    public final float f13550r;

    /* renamed from: s */
    public final float f13551s;

    /* renamed from: t */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13552t;

    /* renamed from: u */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13553u;

    /* renamed from: v */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13554v;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader$a */
    public class C2663a extends C13893c {
        public C2663a() {
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            FinderFeedRelTimelineLoader.this.getClass();
            if (!(eu32 instanceof C50294lp0) || !(bVar instanceof C46511c0)) {
                return null;
            }
            boolean z = (i == 0 && i2 == 0 && ((C50294lp0) eu32).f137562f == 0) ? false : true;
            C50294lp0 lp02 = (C50294lp0) eu32;
            String str2 = lp02.f137565i;
            if (str2 == null) {
                str2 = "";
            }
            C2664b bVar2 = new C2664b(str2, i, i2, str);
            LinkedList<FinderObject> linkedList = lp02.f137560d;
            C87412m.m108593f(linkedList, "resp.`object`");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                FinderItem.C56324a aVar = FinderItem.Companion;
                C87412m.m108593f(finderObject, "feed");
                arrayList.add(C15585f.f42211a.mo14348k(aVar.mo79056a(finderObject, 256)));
            }
            LinkedList linkedList2 = new LinkedList(arrayList);
            LinkedList<C49165dm1> linkedList3 = lp02.f137567n;
            C87412m.m108593f(linkedList3, "resp.txt_card");
            C49165dm1 dm12 = (C49165dm1) C110818d0.m150916N(linkedList3);
            if (dm12 != null) {
                C87412m.m108594g(bVar2.f13556a, "streamCardTitle");
                linkedList2.add(new C9845l9(dm12));
            }
            bVar2.setIncrementList(linkedList2);
            bVar2.f13558c.addAll(lp02.f137566j);
            bVar2.f13557b = new LinkedList(lp02.f137560d);
            bVar2.setPullType(((C46511c0) bVar).f125308x);
            bVar2.setLastBuffer(lp02.f137561e);
            bVar2.setHasMore(z);
            C15585f.C15586a aVar2 = C15585f.f42211a;
            LinkedList<FinderObject> linkedList4 = lp02.f137560d;
            C87412m.m108593f(linkedList4, "resp.`object`");
            aVar2.mo14343f(linkedList4, 1, FinderFeedRelTimelineLoader.this.getContextObj());
            return bVar2;
        }

        public IResponse<C0740i2> callInit() {
            C2664b bVar = new C2664b("", 0, 0, "");
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = FinderFeedRelTimelineLoader.this;
            C2819w0 cache = finderFeedRelTimelineLoader.getCache();
            C89349b bVar2 = null;
            bVar.setIncrementList(cache != null ? cache.f14079a : null);
            C2819w0 cache2 = finderFeedRelTimelineLoader.getCache();
            if (cache2 != null) {
                bVar2 = cache2.f14080b;
            }
            bVar.setLastBuffer(bVar2);
            bVar.setHasMore(FinderFeedRelTimelineLoader.this.f13544i);
            return bVar;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = FinderFeedRelTimelineLoader.this;
            long j = finderFeedRelTimelineLoader.f13539d;
            String str = finderFeedRelTimelineLoader.f13540e;
            int i = finderFeedRelTimelineLoader.f13541f;
            C89349b lastBuffer = finderFeedRelTimelineLoader.getLastBuffer();
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader2 = FinderFeedRelTimelineLoader.this;
            String str2 = finderFeedRelTimelineLoader2.f13542g;
            int i2 = finderFeedRelTimelineLoader2.f13543h;
            C49712hj1 contextObj = finderFeedRelTimelineLoader2.getContextObj();
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader3 = FinderFeedRelTimelineLoader.this;
            C46511c0 c0Var = r1;
            C46511c0 c0Var2 = new C46511c0(j, str, i, lastBuffer, str2, i2, (String) null, (String) null, (String) null, (C89349b) null, contextObj, finderFeedRelTimelineLoader3.f13550r, finderFeedRelTimelineLoader3.f13551s, 0, 0, (Integer) null, 58304, (C8480h) null);
            c0Var.f125308x = 2;
            return c0Var;
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = FinderFeedRelTimelineLoader.this;
            long j = finderFeedRelTimelineLoader.f13539d;
            String str = finderFeedRelTimelineLoader.f13540e;
            int i = finderFeedRelTimelineLoader.f13541f;
            C89349b lastBuffer = finderFeedRelTimelineLoader.getLastBuffer();
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader2 = FinderFeedRelTimelineLoader.this;
            String str2 = finderFeedRelTimelineLoader2.f13542g;
            int i2 = finderFeedRelTimelineLoader2.f13543h;
            C49712hj1 contextObj = finderFeedRelTimelineLoader2.getContextObj();
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader3 = FinderFeedRelTimelineLoader.this;
            C46511c0 c0Var = r1;
            C46511c0 c0Var2 = new C46511c0(j, str, i, lastBuffer, str2, i2, (String) null, (String) null, (String) null, (C89349b) null, contextObj, finderFeedRelTimelineLoader3.f13550r, finderFeedRelTimelineLoader3.f13551s, 0, 0, (Integer) null, 58304, (C8480h) null);
            c0Var.f125308x = 0;
            return c0Var;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            FinderFeedRelTimelineLoader.this.getClass();
            super.fetch(obj, jVar, z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader$b */
    public static final class C2664b extends IResponse<C0740i2> {

        /* renamed from: a */
        public final String f13556a;

        /* renamed from: b */
        public List<? extends FinderObject> f13557b;

        /* renamed from: c */
        public LinkedList<C64629pl1> f13558c = new LinkedList<>();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2664b(String str, int i, int i2, String str2) {
            super(i, i2, str2);
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f13556a = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader$c */
    public class C2665c extends C2663a {
        public C2665c() {
            super();
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            List<C0740i2> incrementList;
            IResponse<C0740i2> b = super.mo2700b(i, i2, str, bVar, eu32);
            if ((eu32 instanceof C50294lp0) && (bVar instanceof C46511c0)) {
                boolean z = false;
                if (i == 0 && i2 == 0) {
                    C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62165o.class);
                    C87412m.m108593f(a, "UICProvider.of(FinderCom…StreamCardVM::class.java)");
                    ((C62165o) a).mo87217c3(false);
                }
                String tag = getTAG();
                StringBuilder sb = new StringBuilder();
                sb.append("[dealOnSceneEnd] errType=");
                sb.append(i);
                sb.append(" errCode=");
                sb.append(str);
                sb.append(" pullType=");
                sb.append(((C46511c0) bVar).f125308x);
                sb.append(" lastBuffer=");
                sb.append(FinderFeedRelTimelineLoader.this.getLastBuffer() != null);
                sb.append(" cardBuffer=");
                if (FinderFeedRelTimelineLoader.this.f13546n != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(" stats=");
                db4 db4 = FinderFeedRelTimelineLoader.this.f13547o;
                long j = 0;
                sb.append(C61926c.m72691p(db4 != null ? db4.f182676d : 0));
                sb.append(" get_column_feed_info=");
                C49203dy1 dy12 = FinderFeedRelTimelineLoader.this.f13545j;
                if (dy12 != null) {
                    j = dy12.f132565d;
                }
                sb.append(C61926c.m72691p(j));
                sb.append(" hasMore=");
                Integer num = null;
                sb.append(b != null ? Boolean.valueOf(b.getHasMore()) : null);
                sb.append(" size=");
                if (!(b == null || (incrementList = b.getIncrementList()) == null)) {
                    num = Integer.valueOf(incrementList.size());
                }
                sb.append(num);
                Log.m105924i(tag, sb.toString());
            }
            return b;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            C62165o oVar = (C62165o) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62165o.class);
            oVar.getClass();
            LinkedList<C51449tu2> linkedList = new LinkedList<>();
            synchronized (oVar.f176743g) {
                linkedList.addAll(oVar.f176743g);
            }
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C51449tu2 tu22 : linkedList) {
                db4 db4 = new db4();
                db4.f182678f = new op4();
                db4.f182677e = new C64654qd();
                db4.f182679g = new C64441i93();
                db4.f182676d = tu22.f142417d;
                db4.f182686q = tu22.f142420g;
                db4.f182684o = tu22.f142421h;
                db4.f182681i = C66785b.f191882e.mo90662O5();
                db4.f182682j = C31543z5.m39453c();
                db4.f182689t = 11;
                arrayList.add(db4);
            }
            C89349b lastBuffer = FinderFeedRelTimelineLoader.this.getLastBuffer();
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = FinderFeedRelTimelineLoader.this;
            C46511c0 c0Var = new C46511c0(lastBuffer, finderFeedRelTimelineLoader.f13548p, arrayList, finderFeedRelTimelineLoader.f13545j, finderFeedRelTimelineLoader.getContextObj());
            c0Var.f125308x = 2;
            return c0Var;
        }

        public void dead() {
            super.dead();
            ((C62165o) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62165o.class)).mo87217c3(true);
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = FinderFeedRelTimelineLoader.this;
            C89349b bVar = finderFeedRelTimelineLoader.f13546n;
            int i = finderFeedRelTimelineLoader.f13548p;
            db4 db4 = finderFeedRelTimelineLoader.f13547o;
            List b = db4 != null ? C26236u.m33719b(db4) : null;
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader2 = FinderFeedRelTimelineLoader.this;
            C46511c0 c0Var = new C46511c0(bVar, i, b, finderFeedRelTimelineLoader2.f13545j, finderFeedRelTimelineLoader2.getContextObj());
            c0Var.f125308x = 0;
            return c0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedRelTimelineLoader(long j, String str, int i, String str2, int i2, boolean z, C89349b bVar, C49203dy1 dy12, C89349b bVar2, db4 db4, int i3, C50159kp0 kp02, C49712hj1 hj12, float f, float f2, int i4, C8480h hVar) {
        super(hj12);
        int i5 = i4;
        long j2 = (i5 & 1) != 0 ? 0 : j;
        String str3 = "";
        String str4 = (i5 & 2) != 0 ? str3 : str;
        int i6 = 0;
        int i7 = (i5 & 4) != 0 ? 0 : i;
        str3 = (i5 & 8) == 0 ? str2 : str3;
        int i8 = (i5 & 16) != 0 ? 0 : i2;
        boolean z2 = (i5 & 32) != 0 ? true : z;
        C50159kp0 kp03 = null;
        C49203dy1 dy13 = (i5 & 128) != 0 ? null : dy12;
        C89349b bVar3 = (i5 & 256) != 0 ? null : bVar2;
        db4 db42 = (i5 & 512) != 0 ? null : db4;
        i6 = (i5 & 1024) == 0 ? i3 : i6;
        kp03 = (i5 & 2048) == 0 ? kp02 : kp03;
        float f3 = 0.0f;
        float f4 = (i5 & 8192) != 0 ? 0.0f : f;
        f3 = (i5 & 16384) == 0 ? f2 : f3;
        C87412m.m108594g(str4, "nonceId");
        this.f13539d = j2;
        this.f13540e = str4;
        this.f13541f = i7;
        this.f13542g = str3;
        this.f13543h = i8;
        this.f13544i = z2;
        this.f13545j = dy13;
        this.f13546n = bVar3;
        this.f13547o = db42;
        this.f13548p = i6;
        this.f13549q = kp03;
        this.f13550r = f4;
        this.f13551s = f3;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2663a();
    }

    public boolean isObservePostEvent() {
        return !(this instanceof FinderStreamCardAlbumConvert$fetchContent$loader$1);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse) && !iResponse.getHasMore() && (lVar = this.f13552t) != null) {
            lVar.invoke(iResponse);
        }
    }

    public void onFetchInitDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "initResponse");
        super.onFetchInitDone(iResponse);
        if (!iResponse.getHasMore() && (lVar = this.f13552t) != null) {
            lVar.invoke(iResponse);
        }
    }

    public void onFetchLoadMoreDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchLoadMoreDone(iResponse);
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13554v;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
    }

    public void onFetchRefreshDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchRefreshDone(iResponse);
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13553u;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
    }
}
