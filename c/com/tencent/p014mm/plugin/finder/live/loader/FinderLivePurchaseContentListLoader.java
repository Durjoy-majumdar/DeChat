package com.tencent.p014mm.plugin.finder.live.loader;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C89132b;
import qg1.C12231u;
import rx3.C13598b0;
import te3.C49712hj1;
import tf1.C13893c;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/loader/FinderLivePurchaseContentListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "a", "b", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader */
public final class FinderLivePurchaseContentListLoader extends BaseFeedLoader<C0740i2> {

    /* renamed from: d */
    public final boolean f15074d;

    /* renamed from: e */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f15075e;

    /* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader$a */
    public final class C3150a extends C13893c {
        public C3150a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
            r14 = r14.liveInfo;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> mo2700b(int r17, int r18, java.lang.String r19, ob0.C89132b<? extends te3.C49335eu3> r20, te3.C49335eu3 r21) {
            /*
                r16 = this;
                r0 = r16
                r1 = r21
                com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader$b r2 = new com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader$b
                com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader r3 = com.tencent.p014mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader.this
                r4 = r17
                r5 = r18
                r6 = r19
                r2.<init>(r3, r4, r5, r6)
                boolean r3 = r1 instanceof te3.C49880ip0
                if (r3 == 0) goto L_0x0117
                java.util.LinkedList r3 = new java.util.LinkedList
                r3.<init>()
                com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader r4 = com.tencent.p014mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader.this
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r4 = r4.getDataListJustForAdapter()
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x0030
                r4 = r1
                te3.ip0 r4 = (te3.C49880ip0) r4
                java.util.LinkedList<te3.oc1> r4 = r4.f135566d
                r3.addAll(r4)
                goto L_0x00c3
            L_0x0030:
                com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader r4 = com.tencent.p014mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader.this
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r4 = r4.getDataListJustForAdapter()
                java.lang.Class<cm1.u0> r7 = cm1.C0782u0.class
                java.util.List r4 = sx3.C13798c0.m13102z(r4, r7)
                r7 = r1
                te3.ip0 r7 = (te3.C49880ip0) r7
                java.util.LinkedList<te3.oc1> r7 = r7.f135566d
                java.lang.String r8 = "resp.objects"
                gy3.C87412m.m108593f(r7, r8)
                java.util.Iterator r7 = r7.iterator()
            L_0x004a:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00c3
                java.lang.Object r8 = r7.next()
                te3.oc1 r8 = (te3.C50661oc1) r8
                r9 = r4
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                java.util.Iterator r9 = r9.iterator()
                r10 = 0
            L_0x005e:
                boolean r11 = r9.hasNext()
                r12 = 0
                r13 = -1
                if (r11 == 0) goto L_0x0094
                java.lang.Object r11 = r9.next()
                cm1.u0 r11 = (cm1.C0782u0) r11
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r8.f139088e
                if (r14 == 0) goto L_0x007b
                te3.c21 r14 = r14.liveInfo
                if (r14 == 0) goto L_0x007b
                long r14 = r14.f182392d
                java.lang.Long r14 = java.lang.Long.valueOf(r14)
                goto L_0x007c
            L_0x007b:
                r14 = r12
            L_0x007c:
                com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.f1833d
                te3.c21 r11 = r11.liveInfo
                if (r11 == 0) goto L_0x0089
                long r5 = r11.f182392d
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                goto L_0x008a
            L_0x0089:
                r5 = r12
            L_0x008a:
                boolean r5 = gy3.C87412m.m108589b(r14, r5)
                if (r5 == 0) goto L_0x0091
                goto L_0x0095
            L_0x0091:
                int r10 = r10 + 1
                goto L_0x005e
            L_0x0094:
                r10 = -1
            L_0x0095:
                if (r10 == r13) goto L_0x0099
                r5 = 1
                goto L_0x009a
            L_0x0099:
                r5 = 0
            L_0x009a:
                if (r5 == 0) goto L_0x00bf
                java.lang.String r5 = r16.getTAG()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "repeat feed:"
                r6.append(r9)
                com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f139088e
                if (r8 == 0) goto L_0x00b4
                sk1.a r9 = sk1.C63947a.f181274a
                java.lang.String r12 = r9.mo88735u(r8, r13)
            L_0x00b4:
                r6.append(r12)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                goto L_0x004a
            L_0x00bf:
                r3.add(r8)
                goto L_0x004a
            L_0x00c3:
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x00cc:
                boolean r5 = r3.hasNext()
                r6 = 2
                if (r5 == 0) goto L_0x00fb
                java.lang.Object r5 = r3.next()
                te3.oc1 r5 = (te3.C50661oc1) r5
                int r7 = r5.f139087d
                r8 = 1
                if (r7 == r8) goto L_0x00ee
                if (r7 == r6) goto L_0x00e1
                goto L_0x00cc
            L_0x00e1:
                te3.vj0 r5 = r5.f139089f
                if (r5 == 0) goto L_0x00cc
                cm1.t0 r6 = new cm1.t0
                r6.<init>(r5)
                r4.add(r6)
                goto L_0x00cc
            L_0x00ee:
                com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f139088e
                if (r5 == 0) goto L_0x00cc
                cm1.u0 r6 = new cm1.u0
                r6.<init>(r5)
                r4.add(r6)
                goto L_0x00cc
            L_0x00fb:
                r2.setIncrementList(r4)
                te3.ip0 r1 = (te3.C49880ip0) r1
                int r3 = r1.f135569g
                r2.f15077a = r3
                pe3.b r3 = r1.f135567e
                r2.setLastBuffer(r3)
                int r1 = r1.f135568f
                r3 = 1
                if (r1 != r3) goto L_0x0110
                r5 = 1
                goto L_0x0111
            L_0x0110:
                r5 = 0
            L_0x0111:
                r2.setHasMore(r5)
                r2.setPullType(r6)
            L_0x0117:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader.C3150a.mo2700b(int, int, java.lang.String, ob0.b, te3.eu3):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        /* renamed from: d */
        public C89132b mo2701d() {
            return new C12231u(FinderLivePurchaseContentListLoader.this.getLastBuffer());
        }

        /* renamed from: e */
        public C89132b mo2702e() {
            return new C12231u(FinderLivePurchaseContentListLoader.this.getLastBuffer());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader$b */
    public final class C3151b extends IResponse<C0740i2> {

        /* renamed from: a */
        public int f15077a;

        public C3151b(FinderLivePurchaseContentListLoader finderLivePurchaseContentListLoader, int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader$c */
    public static final class C3152c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePurchaseContentListLoader f15078d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<C0740i2> f15079e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3152c(FinderLivePurchaseContentListLoader finderLivePurchaseContentListLoader, IResponse<C0740i2> iResponse) {
            super(0);
            this.f15078d = finderLivePurchaseContentListLoader;
            this.f15079e = iResponse;
        }

        public Object invoke() {
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f15078d.f15075e;
            if (lVar != null) {
                lVar.invoke(this.f15079e);
            }
            return C13598b0.f38549a;
        }
    }

    public FinderLivePurchaseContentListLoader(boolean z) {
        super((C49712hj1) null, 1, (C8480h) null);
        this.f15074d = z;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C3150a();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/loader/FinderLivePurchaseContentListLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        if (this.f15074d) {
            super.onFetchDone(iResponse);
        }
        C61926c.m72668M(new C3152c(this, iResponse));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/loader/FinderLivePurchaseContentListLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
