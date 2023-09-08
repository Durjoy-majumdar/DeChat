package rs1;

import a14.C0000n0;
import androidx.recyclerview.widget.RecyclerView;
import bi1.C0287e;
import fy3.C32227p;
import java.util.List;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckUIC$safeCheck$$inlined$success$1", mo125469f = "FinderFeedSafeCheckUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: rs1.x2 */
public final class C13528x2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f38359d;

    /* renamed from: e */
    public final /* synthetic */ C63654v2 f38360e;

    /* renamed from: f */
    public final /* synthetic */ boolean f38361f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView.C16613e f38362g;

    /* renamed from: h */
    public final /* synthetic */ List f38363h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13528x2(C0287e eVar, C15601d dVar, C63654v2 v2Var, boolean z, RecyclerView.C16613e eVar2, List list) {
        super(2, dVar);
        this.f38359d = eVar;
        this.f38360e = v2Var;
        this.f38361f = z;
        this.f38362g = eVar2;
        this.f38363h = list;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13528x2(this.f38359d, dVar, this.f38360e, this.f38361f, this.f38362g, this.f38363h);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13528x2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: tf1.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: cm1.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: cm1.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: cm1.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: cm1.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0293 A[LOOP:5: B:103:0x0267->B:116:0x0293, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d8 A[LOOP:6: B:119:0x02ae->B:131:0x02d8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0393 A[LOOP:7: B:148:0x036a->B:159:0x0393, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0290 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x02df A[EDGE_INSN: B:208:0x02df->B:133:0x02df ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0390 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.Class<ht1.y2> r1 = ht1.C8817y2.class
            kotlin.ResultKt.throwOnFailure(r23)
            bi1.e r2 = r0.f38359d
            bi1.f r2 = (bi1.C0288f) r2
            T r2 = r2.f855b
            te3.eh0 r2 = (te3.C49284eh0) r2
            rs1.v2 r3 = r0.f38360e
            long r4 = java.lang.System.currentTimeMillis()
            r3.f180456f = r4
            rs1.v2 r3 = r0.f38360e
            pe3.b r4 = r2.f132925g
            r3.f180455e = r4
            te3.ch0 r3 = r2.f132924f
            java.lang.String r4 = "FinderFeedSafeCheckUIC"
            if (r3 == 0) goto L_0x0075
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "check_config: interval_second="
            r5.append(r6)
            int r6 = r3.f131726d
            r5.append(r6)
            java.lang.String r6 = ", lastest_count="
            r5.append(r6)
            int r6 = r3.f131727e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            rs1.v2 r5 = r0.f38360e
            int r6 = r3.f131726d
            r5.f180461n = r6
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FEED_SAFE_CHECK_INTERVAL_SEC_INT_SYNC
            int r5 = r5.f180461n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.mo119677K(r7, r5)
            rs1.v2 r5 = r0.f38360e
            int r3 = r3.f131727e
            r5.f180462o = r3
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FEED_SAFE_CHECK_LAST_COUNT_INT_SYNC
            int r5 = r5.f180462o
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.mo119677K(r6, r5)
        L_0x0075:
            java.util.LinkedList<te3.tu> r2 = r2.f132922d
            java.lang.String r3 = "it.check_result"
            gy3.C87412m.m108593f(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0085:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x00a3
            java.lang.Object r5 = r2.next()
            r10 = r5
            te3.tu r10 = (te3.C51446tu) r10
            long r10 = r10.f142409e
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x009c
            r8 = 1
            goto L_0x009d
        L_0x009c:
            r8 = 0
        L_0x009d:
            if (r8 == 0) goto L_0x0085
            r3.add(r5)
            goto L_0x0085
        L_0x00a3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "spam list size = "
            r2.append(r5)
            int r5 = r3.size()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            rs1.v2 r2 = r0.f38360e
            rx3.g r2 = r2.f180463p
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L_0x00cf
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            goto L_0x00d0
        L_0x00cf:
            r2 = 0
        L_0x00d0:
            boolean r10 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r10 == 0) goto L_0x00d7
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            goto L_0x00d8
        L_0x00d7:
            r2 = 0
        L_0x00d8:
            if (r2 == 0) goto L_0x00df
            int r10 = r2.mo16957C()
            goto L_0x00e0
        L_0x00df:
            r10 = 0
        L_0x00e0:
            if (r2 == 0) goto L_0x00e7
            int r11 = r2.mo16959E()
            goto L_0x00e8
        L_0x00e7:
            r11 = 0
        L_0x00e8:
            java.lang.String r12 = ", lastVisibleIndex="
            if (r10 < 0) goto L_0x03df
            if (r11 >= 0) goto L_0x00f0
            goto L_0x03df
        L_0x00f0:
            java.util.Iterator r3 = r3.iterator()
        L_0x00f4:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x03fa
            java.lang.Object r13 = r3.next()
            te3.tu r13 = (te3.C51446tu) r13
            boolean r14 = r13.f142411g
            java.lang.String r15 = ""
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.IFinderLiveAdapter<*>"
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>"
            r17 = -1
            if (r14 == 0) goto L_0x024f
            boolean r14 = r0.f38361f
            if (r14 == 0) goto L_0x0155
            androidx.recyclerview.widget.RecyclerView$e r8 = r0.f38362g
            gy3.C87412m.m108592e(r8, r5)
            androidx.recyclerview.widget.RecyclerView$e r5 = r0.f38362g
            com.tencent.mm.plugin.finder.view.w6 r5 = (com.tencent.p014mm.plugin.finder.view.C4202w6) r5
            java.util.List r5 = r5.getData()
            java.util.Iterator r5 = r5.iterator()
            r8 = 0
        L_0x0122:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0152
            java.lang.Object r14 = r5.next()
            tf1.m r14 = (tf1.C13914m) r14
            r18 = r10
            long r9 = r13.f142408d
            int r19 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r19 == 0) goto L_0x0146
            boolean r6 = r14 instanceof al1.C54127h
            if (r6 == 0) goto L_0x0146
            al1.h r14 = (al1.C54127h) r14
            com.tencent.mm.live.api.LiveConfig r6 = r14.f151977d
            long r6 = r6.f157075s
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x0146
            r6 = 1
            goto L_0x0147
        L_0x0146:
            r6 = 0
        L_0x0147:
            if (r6 == 0) goto L_0x014b
            r6 = r8
            goto L_0x0195
        L_0x014b:
            int r8 = r8 + 1
            r10 = r18
            r6 = 0
            goto L_0x0122
        L_0x0152:
            r18 = r10
            goto L_0x0194
        L_0x0155:
            r18 = r10
            androidx.recyclerview.widget.RecyclerView$e r5 = r0.f38362g
            gy3.C87412m.m108592e(r5, r8)
            androidx.recyclerview.widget.RecyclerView$e r5 = r0.f38362g
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r5
            java.util.List r5 = r5.getData()
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x0169:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0194
            java.lang.Object r7 = r5.next()
            jq3.c r7 = (jq3.C9493c) r7
            long r8 = r13.f142408d
            r19 = 0
            int r10 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r10 == 0) goto L_0x018d
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x018d
            long r7 = r7.getItemId()
            long r9 = r13.f142408d
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x018d
            r7 = 1
            goto L_0x018e
        L_0x018d:
            r7 = 0
        L_0x018e:
            if (r7 == 0) goto L_0x0191
            goto L_0x0195
        L_0x0191:
            int r6 = r6 + 1
            goto L_0x0169
        L_0x0194:
            r6 = -1
        L_0x0195:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "deleteItem:allScene, id="
            r5.append(r7)
            long r7 = r13.f142408d
            java.lang.String r7 = o40.C61926c.m72691p(r7)
            r5.append(r7)
            java.lang.String r7 = ", current flow index="
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.autogen.events.FeedDeleteEvent r5 = new com.tencent.mm.autogen.events.FeedDeleteEvent
            r5.<init>()
            com.tencent.mm.autogen.events.FeedDeleteEvent$a r6 = r5.f9154d
            long r7 = r13.f142408d
            r6.f9155a = r7
            r5.publish()
            boolean r5 = r0.f38361f
            if (r5 == 0) goto L_0x01dc
            com.tencent.mm.autogen.events.FinderLiveUninterestedEvent r5 = new com.tencent.mm.autogen.events.FinderLiveUninterestedEvent
            r5.<init>()
            com.tencent.mm.autogen.events.FinderLiveUninterestedEvent$a r6 = r5.f9222d
            long r7 = r13.f142408d
            r6.f9223a = r7
            r7 = 0
            r6.f9224b = r7
            r5.publish()
            goto L_0x0246
        L_0x01dc:
            java.util.List r5 = r0.f38363h
            java.util.Iterator r5 = r5.iterator()
        L_0x01e2:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0205
            java.lang.Object r6 = r5.next()
            r7 = r6
            tf1.m r7 = (tf1.C13914m) r7
            boolean r8 = r7 instanceof cm1.C0797z
            if (r8 == 0) goto L_0x0201
            cm1.z r7 = (cm1.C0797z) r7
            long r7 = r7.getItemId()
            long r9 = r13.f142408d
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x0201
            r7 = 1
            goto L_0x0202
        L_0x0201:
            r7 = 0
        L_0x0202:
            if (r7 == 0) goto L_0x01e2
            goto L_0x0206
        L_0x0205:
            r6 = 0
        L_0x0206:
            boolean r5 = r6 instanceof cm1.C0797z
            if (r5 == 0) goto L_0x020d
            cm1.z r6 = (cm1.C0797z) r6
            goto L_0x020e
        L_0x020d:
            r6 = 0
        L_0x020e:
            if (r6 == 0) goto L_0x021e
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r6.mo3513o()
            if (r5 == 0) goto L_0x021e
            java.lang.String r5 = r5.getUserName()
            if (r5 != 0) goto L_0x021d
            goto L_0x021e
        L_0x021d:
            r15 = r5
        L_0x021e:
            int r5 = r15.length()
            if (r5 <= 0) goto L_0x0226
            r7 = 1
            goto L_0x0227
        L_0x0226:
            r7 = 0
        L_0x0227:
            if (r7 == 0) goto L_0x0246
            bl3.r r5 = bl3.C39818r.f106831a
            rs1.v2 r6 = r0.f38360e
            android.app.Activity r6 = r6.getContext()
            bl3.r$a r5 = r5.mo62443b(r6)
            bl3.c r5 = r5.mo62448d(r1)
            ht1.y2 r5 = (ht1.C8817y2) r5
            if (r5 == 0) goto L_0x0246
            ht1.z2 r5 = r5.mo9643v2()
            if (r5 == 0) goto L_0x0246
            r5.mo9653t(r15)
        L_0x0246:
            r10 = r2
            r14 = r3
            r9 = r18
            r3 = 1
            r19 = 0
            goto L_0x03d8
        L_0x024f:
            r18 = r10
            boolean r6 = r0.f38361f
            if (r6 == 0) goto L_0x029c
            androidx.recyclerview.widget.RecyclerView$e r6 = r0.f38362g
            gy3.C87412m.m108592e(r6, r5)
            androidx.recyclerview.widget.RecyclerView$e r5 = r0.f38362g
            com.tencent.mm.plugin.finder.view.w6 r5 = (com.tencent.p014mm.plugin.finder.view.C4202w6) r5
            java.util.List r5 = r5.getData()
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L_0x0267:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0297
            java.lang.Object r6 = r5.next()
            tf1.m r6 = (tf1.C13914m) r6
            long r9 = r13.f142408d
            r19 = 0
            int r14 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x028c
            boolean r14 = r6 instanceof al1.C54127h
            if (r14 == 0) goto L_0x028c
            al1.h r6 = (al1.C54127h) r6
            com.tencent.mm.live.api.LiveConfig r6 = r6.f151977d
            r14 = r5
            long r5 = r6.f157075s
            int r21 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r21 != 0) goto L_0x028d
            r5 = 1
            goto L_0x028e
        L_0x028c:
            r14 = r5
        L_0x028d:
            r5 = 0
        L_0x028e:
            if (r5 == 0) goto L_0x0293
            r17 = r7
            goto L_0x0297
        L_0x0293:
            int r7 = r7 + 1
            r5 = r14
            goto L_0x0267
        L_0x0297:
            r7 = r17
            r19 = 0
            goto L_0x02df
        L_0x029c:
            androidx.recyclerview.widget.RecyclerView$e r5 = r0.f38362g
            gy3.C87412m.m108592e(r5, r8)
            androidx.recyclerview.widget.RecyclerView$e r5 = r0.f38362g
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r5
            java.util.List r5 = r5.getData()
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L_0x02ae:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02dc
            java.lang.Object r6 = r5.next()
            jq3.c r6 = (jq3.C9493c) r6
            long r9 = r13.f142408d
            r19 = 0
            int r14 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x02d3
            boolean r9 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x02d3
            long r9 = r6.getItemId()
            r14 = r5
            long r5 = r13.f142408d
            int r21 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r21 != 0) goto L_0x02d4
            r5 = 1
            goto L_0x02d5
        L_0x02d3:
            r14 = r5
        L_0x02d4:
            r5 = 0
        L_0x02d5:
            if (r5 == 0) goto L_0x02d8
            goto L_0x02df
        L_0x02d8:
            int r7 = r7 + 1
            r5 = r14
            goto L_0x02ae
        L_0x02dc:
            r19 = 0
            r7 = -1
        L_0x02df:
            r9 = r18
            if (r7 < 0) goto L_0x02ef
            if (r2 == 0) goto L_0x02ed
            if (r7 < r9) goto L_0x02ed
            if (r7 > r11) goto L_0x02ed
            boolean r5 = r13.f142410f
            if (r5 == 0) goto L_0x02ef
        L_0x02ed:
            r5 = 1
            goto L_0x02f0
        L_0x02ef:
            r5 = 0
        L_0x02f0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "deleteItem:normal, needRemove="
            r6.append(r10)
            r6.append(r5)
            java.lang.String r10 = ", id="
            r6.append(r10)
            r10 = r2
            r14 = r3
            long r2 = r13.f142408d
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r6.append(r2)
            java.lang.String r2 = ", index="
            r6.append(r2)
            r6.append(r7)
            java.lang.String r2 = " firstVisibleIndex="
            r6.append(r2)
            r6.append(r9)
            r6.append(r12)
            r6.append(r11)
            java.lang.String r2 = ", hit_in_playing="
            r6.append(r2)
            boolean r2 = r13.f142410f
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            if (r5 == 0) goto L_0x03d7
            boolean r2 = r0.f38361f
            if (r2 == 0) goto L_0x034d
            com.tencent.mm.autogen.events.FinderLiveUninterestedEvent r2 = new com.tencent.mm.autogen.events.FinderLiveUninterestedEvent
            r2.<init>()
            com.tencent.mm.autogen.events.FinderLiveUninterestedEvent$a r3 = r2.f9222d
            long r5 = r13.f142408d
            r3.f9223a = r5
            r5 = 0
            r3.f9224b = r5
            r2.publish()
            goto L_0x03d7
        L_0x034d:
            r5 = 0
            androidx.recyclerview.widget.RecyclerView$e r2 = r0.f38362g
            gy3.C87412m.m108592e(r2, r8)
            androidx.recyclerview.widget.RecyclerView$e r2 = r0.f38362g
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r2
            java.util.List r2 = r2.getData()
            r2.remove(r7)
            androidx.recyclerview.widget.RecyclerView$e r2 = r0.f38362g
            r3 = 1
            r2.notifyItemRangeRemoved(r7, r3)
            java.util.List r2 = r0.f38363h
            java.util.Iterator r2 = r2.iterator()
        L_0x036a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0395
            java.lang.Object r6 = r2.next()
            r7 = r6
            tf1.m r7 = (tf1.C13914m) r7
            boolean r8 = r7 instanceof cm1.C0797z
            if (r8 == 0) goto L_0x038b
            cm1.z r7 = (cm1.C0797z) r7
            long r7 = r7.getItemId()
            r16 = r6
            long r5 = r13.f142408d
            int r17 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r17 != 0) goto L_0x038d
            r7 = 1
            goto L_0x038e
        L_0x038b:
            r16 = r6
        L_0x038d:
            r7 = 0
        L_0x038e:
            if (r7 == 0) goto L_0x0393
            r6 = r16
            goto L_0x0396
        L_0x0393:
            r5 = 0
            goto L_0x036a
        L_0x0395:
            r6 = 0
        L_0x0396:
            boolean r2 = r6 instanceof cm1.C0797z
            if (r2 == 0) goto L_0x039d
            cm1.z r6 = (cm1.C0797z) r6
            goto L_0x039e
        L_0x039d:
            r6 = 0
        L_0x039e:
            if (r6 == 0) goto L_0x03ae
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r6.mo3513o()
            if (r2 == 0) goto L_0x03ae
            java.lang.String r2 = r2.getUserName()
            if (r2 != 0) goto L_0x03ad
            goto L_0x03ae
        L_0x03ad:
            r15 = r2
        L_0x03ae:
            int r2 = r15.length()
            if (r2 <= 0) goto L_0x03b6
            r7 = 1
            goto L_0x03b7
        L_0x03b6:
            r7 = 0
        L_0x03b7:
            if (r7 == 0) goto L_0x03d8
            bl3.r r2 = bl3.C39818r.f106831a
            rs1.v2 r5 = r0.f38360e
            android.app.Activity r5 = r5.getContext()
            bl3.r$a r2 = r2.mo62443b(r5)
            bl3.c r2 = r2.mo62448d(r1)
            ht1.y2 r2 = (ht1.C8817y2) r2
            if (r2 == 0) goto L_0x03d8
            ht1.z2 r2 = r2.mo9643v2()
            if (r2 == 0) goto L_0x03d8
            r2.mo9653t(r15)
            goto L_0x03d8
        L_0x03d7:
            r3 = 1
        L_0x03d8:
            r2 = r10
            r3 = r14
            r6 = r19
            r10 = r9
            goto L_0x00f4
        L_0x03df:
            r9 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "recyclerView visible item is null, firstVisibleIndex="
            r1.append(r2)
            r1.append(r9)
            r1.append(r12)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
        L_0x03fa:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13528x2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
