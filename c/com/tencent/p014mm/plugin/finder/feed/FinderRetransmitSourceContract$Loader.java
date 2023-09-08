package com.tencent.p014mm.plugin.finder.feed;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.List;
import je1.C9294a4;
import kotlin.Metadata;
import ob0.C117747y;
import sx3.C26236u;
import te3.C49712hj1;
import tf1.C13896d;
import tf1.C13908i;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderRetransmitSourceContract$Loader", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderRetransmitSourceContract$Loader */
public final class FinderRetransmitSourceContract$Loader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final String f13206d;

    /* renamed from: e */
    public final long f13207e;

    /* renamed from: f */
    public final String f13208f;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderRetransmitSourceContract$Loader$a */
    public final class C2553a extends C13896d {
        public C2553a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[LOOP:0: B:11:0x003a->B:13:0x0040, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r11, int r12, java.lang.String r13, ob0.C117747y r14) {
            /*
                r10 = this;
                java.lang.String r0 = "scene"
                gy3.C87412m.m108594g(r14, r0)
                je1.a4 r14 = (je1.C9294a4) r14
                java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOriginalUserFeedsResponse"
                r1 = 1
                if (r11 != 0) goto L_0x0021
                if (r12 != 0) goto L_0x0021
                ob0.c r2 = r14.f29065n
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                gy3.C87412m.m108592e(r2, r0)
                te3.ng1 r2 = (te3.C50538ng1) r2
                int r2 = r2.f138592e
                if (r2 == 0) goto L_0x001f
                goto L_0x0021
            L_0x001f:
                r2 = 0
                goto L_0x0022
            L_0x0021:
                r2 = 1
            L_0x0022:
                java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> r3 = r14.f29067p
                if (r3 != 0) goto L_0x002b
                java.util.LinkedList r3 = new java.util.LinkedList
                r3.<init>()
            L_0x002b:
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = sx3.C36907w.m41090l(r3, r5)
                r4.<init>(r5)
                java.util.Iterator r3 = r3.iterator()
            L_0x003a:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0050
                java.lang.Object r5 = r3.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r5
                wp1.f$a r6 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r6.mo14348k(r5)
                r4.add(r5)
                goto L_0x003a
            L_0x0050:
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
                if (r3 != 0) goto L_0x009f
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.Object r5 = sx3.C110818d0.m150914L(r4)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
                long r5 = r5.getId()
                long r7 = r14.f29062h
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 == 0) goto L_0x0084
                java.lang.Object r1 = sx3.C110818d0.m150914L(r4)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
                r5 = 2131826447(0x7f11170f, float:1.9285779E38)
                java.lang.String r3 = r3.getString(r5)
                java.lang.String r5 = "context.getString(R.string.finder_deleted_tip2)"
                gy3.C87412m.m108593f(r3, r5)
                r1.mo3496d0(r3)
                goto L_0x009f
            L_0x0084:
                int r5 = r4.size()
                if (r5 <= r1) goto L_0x009f
                java.lang.Object r1 = sx3.C110818d0.m150914L(r4)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
                r5 = 2131826448(0x7f111710, float:1.928578E38)
                java.lang.String r3 = r3.getString(r5)
                java.lang.String r5 = "context.getString(R.string.finder_deleted_tip3)"
                gy3.C87412m.m108593f(r3, r5)
                r1.mo3490X(r3)
            L_0x009f:
                kf1.v8 r1 = new kf1.v8
                r1.<init>(r11, r12, r13)
                r1.setIncrementList(r4)
                int r11 = r14.f29063i
                r1.setPullType(r11)
                ob0.c r11 = r14.f29065n
                ob0.c$d r11 = r11.f127056b
                pe3.a r11 = r11.f127083a
                gy3.C87412m.m108592e(r11, r0)
                te3.ng1 r11 = (te3.C50538ng1) r11
                pe3.b r11 = r11.f138593f
                r1.setLastBuffer(r11)
                r1.setHasMore(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderRetransmitSourceContract$Loader.C2553a.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            FinderRetransmitSourceContract$Loader finderRetransmitSourceContract$Loader = FinderRetransmitSourceContract$Loader.this;
            return new C9294a4(finderRetransmitSourceContract$Loader.f13206d, finderRetransmitSourceContract$Loader.f13207e, finderRetransmitSourceContract$Loader.f13208f, finderRetransmitSourceContract$Loader.getLastBuffer(), 2);
        }

        public C117747y genRefreshNetScene() {
            FinderRetransmitSourceContract$Loader finderRetransmitSourceContract$Loader = FinderRetransmitSourceContract$Loader.this;
            return new C9294a4(finderRetransmitSourceContract$Loader.f13206d, finderRetransmitSourceContract$Loader.f13207e, finderRetransmitSourceContract$Loader.f13208f, finderRetransmitSourceContract$Loader.getLastBuffer(), 0);
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3581);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRetransmitSourceContract$Loader(String str, long j, String str2, C13908i iVar, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "targetUsername");
        C87412m.m108594g(str2, "refObjectNonceId");
        C87412m.m108594g(iVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f13206d = str;
        this.f13207e = j;
        this.f13208f = str2;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2553a();
    }
}
