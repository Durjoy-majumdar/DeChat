package rs1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32226l;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: rs1.k7 */
public final class C13305k7 extends C87413o implements C32226l<BaseFinderFeed, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13502w6 f37756d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f37757e;

    /* renamed from: f */
    public final /* synthetic */ int f37758f;

    /* renamed from: g */
    public final /* synthetic */ boolean f37759g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13305k7(C13502w6 w6Var, C60905o oVar, int i, boolean z) {
        super(1);
        this.f37756d = w6Var;
        this.f37757e = oVar;
        this.f37758f = i;
        this.f37759g = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        if (r5 != 4) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        if ((r15 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFollowTimelineUI) != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
        if ((r0 & r8) == 0) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020a, code lost:
        if (r14.f36877c == r28) goto L_0x020c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0232 A[EDGE_INSN: B:132:0x0232->B:96:0x0232 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0224 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x013f A[EDGE_INSN: B:134:0x013f->B:62:0x013f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013b A[LOOP:1: B:50:0x011a->B:60:0x013b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0212 A[LOOP:0: B:44:0x00f1->B:94:0x0212, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r1, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.re1> r2 = rs1.C13502w6.f38270u
            long r3 = r1.getItemId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r3 = "Finder.FinderNpsSurveyUIC"
            if (r2 == 0) goto L_0x0041
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "tryMatchAndShowSurvey feedId="
            r2.append(r4)
            long r4 = r1.getItemId()
            java.lang.String r1 = o40.C61926c.m72691p(r4)
            r2.append(r1)
            java.lang.String r1 = " has matched config"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            goto L_0x0400
        L_0x0041:
            rs1.w6 r2 = r0.f37756d
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.mo3513o()
            if (r4 == 0) goto L_0x004e
            int r4 = r4.getMediaType()
            goto L_0x004f
        L_0x004e:
            r4 = -1
        L_0x004f:
            r2.getClass()
            r2 = 4
            r5 = 2
            if (r4 == r5) goto L_0x006d
            if (r4 == r2) goto L_0x006a
            r8 = 9
            if (r4 == r8) goto L_0x0067
            r8 = 3001(0xbb9, float:4.205E-42)
            if (r4 == r8) goto L_0x006d
            r8 = 3002(0xbba, float:4.207E-42)
            if (r4 == r8) goto L_0x006a
            r8 = 0
            goto L_0x006f
        L_0x0067:
            r8 = 4
            goto L_0x006f
        L_0x006a:
            r8 = 2
            goto L_0x006f
        L_0x006d:
            r8 = 1
        L_0x006f:
            qn1.c$b r4 = qn1.C12883c.f36861h
            qn1.c r4 = r4.mo12405a()
            long r10 = r1.getItemId()
            rs1.w6 r12 = r0.f37756d
            int r12 = r12.f38275g
            jq3.o r13 = r0.f37757e
            int r13 = r13.mo17363j()
            rs1.w6 r14 = r0.f37756d
            jq3.o r15 = r0.f37757e
            android.content.Context r15 = r15.f173499A
            java.lang.String r5 = "holder.context"
            gy3.C87412m.m108593f(r15, r5)
            r14.getClass()
            boolean r5 = r15 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            r16 = 0
            r14 = 1
            if (r5 == 0) goto L_0x00b8
            bl3.r r5 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r15 = (androidx.appcompat.app.AppCompatActivity) r15
            bl3.r$a r5 = r5.mo62444c(r15)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r15 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            androidx.lifecycle.i0 r5 = r5.mo75002a(r15)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r5 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r5
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r5 = r5.getActiveFragment()
            int r5 = r5.f17334o
            if (r5 == r14) goto L_0x00b6
            r15 = 3
            if (r5 == r15) goto L_0x00df
            if (r5 == r2) goto L_0x00e2
            goto L_0x00e1
        L_0x00b6:
            r2 = 2
            goto L_0x00e2
        L_0x00b8:
            boolean r2 = r15 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI
            if (r2 == 0) goto L_0x00db
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r2.mo12873f(r15)
            if (r2 == 0) goto L_0x00cb
            int r2 = r2.f38096i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00cc
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            r5 = 156(0x9c, float:2.19E-43)
            if (r2 != 0) goto L_0x00d1
            goto L_0x00d8
        L_0x00d1:
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            r2 = 8
            goto L_0x00e2
        L_0x00db:
            boolean r2 = r15 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFollowTimelineUI
            if (r2 == 0) goto L_0x00e1
        L_0x00df:
            r2 = 1
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            int r5 = r0.f37758f
            boolean r15 = r0.f37759g
            r4.mo12398b()
            int r12 = r12 + r14
            int r13 = r13 + r14
            java.util.LinkedList<qn1.j> r14 = r4.f36863a
            java.util.Iterator r14 = r14.iterator()
        L_0x00f1:
            boolean r17 = r14.hasNext()
            java.lang.String r6 = "conf.feed_pos"
            java.lang.String r7 = "Finder.NpsSurveyConfMgr"
            r18 = 1000(0x3e8, double:4.94E-321)
            if (r17 == 0) goto L_0x0224
            java.lang.Object r17 = r14.next()
            r20 = r14
            r14 = r17
            qn1.j r14 = (qn1.C12892j) r14
            r21 = r3
            te3.re1 r3 = r14.f36875a
            boolean r0 = r14.f36876b
            if (r0 != 0) goto L_0x01f8
            if (r15 != 0) goto L_0x01eb
            java.util.LinkedList<java.lang.Integer> r0 = r3.f140855f
            gy3.C87412m.m108593f(r0, r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x011a:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x013e
            java.lang.Object r14 = r0.next()
            r22 = r14
            java.lang.Integer r22 = (java.lang.Integer) r22
            if (r22 != 0) goto L_0x012d
            r23 = r0
            goto L_0x0137
        L_0x012d:
            r23 = r0
            int r0 = r22.intValue()
            if (r0 != r12) goto L_0x0137
            r0 = 1
            goto L_0x0138
        L_0x0137:
            r0 = 0
        L_0x0138:
            if (r0 == 0) goto L_0x013b
            goto L_0x013f
        L_0x013b:
            r0 = r23
            goto L_0x011a
        L_0x013e:
            r14 = 0
        L_0x013f:
            if (r14 == 0) goto L_0x01eb
            int r0 = r3.f140856g
            r0 = r0 & r2
            if (r0 == 0) goto L_0x01eb
            int r0 = r3.f140854e
            r0 = r0 & r5
            if (r0 == 0) goto L_0x01eb
            long r22 = eb0.C31543z5.m39453c()
            r24 = r1
            long r0 = r22 / r18
            f40.o r14 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r14 = r14.mo121142i()
            r22 = r5
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_NPS_SURVEY_LAST_SHOW_TIME_LONG_SYNC
            r23 = r6
            long r5 = r14.mo119673G(r5, r0)
            long r25 = r0 - r5
            r14 = 86400(0x15180, float:1.21072E-40)
            r27 = r13
            long r13 = (long) r14
            long r13 = r25 / r13
            r25 = r2
            int r2 = r3.f140859j
            r28 = r10
            if (r2 == 0) goto L_0x017e
            long r10 = (long) r2
            int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x017e
            r2 = 1
            goto L_0x017f
        L_0x017e:
            r2 = 0
        L_0x017f:
            if (r2 == 0) goto L_0x0186
            long r10 = r3.f140853d
            r4.mo12404h(r10)
        L_0x0186:
            boolean r10 = r4.mo12400d(r3)
            if (r10 != 0) goto L_0x0190
            if (r2 != 0) goto L_0x0190
            r2 = 1
            goto L_0x0191
        L_0x0190:
            r2 = 0
        L_0x0191:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "isConfigValid nowSec: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = " lastShowTime: "
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = " conf.start: "
            r10.append(r0)
            long r0 = r3.f140857h
            r10.append(r0)
            java.lang.String r0 = " conf.expire: "
            r10.append(r0)
            long r0 = r3.f140858i
            r10.append(r0)
            java.lang.String r0 = " diffDays: "
            r10.append(r0)
            r10.append(r13)
            java.lang.String r0 = " conf.exclude: "
            r10.append(r0)
            int r0 = r3.f140859j
            r10.append(r0)
            java.lang.String r0 = " result: "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            if (r2 == 0) goto L_0x020e
            long r0 = r3.f140863q
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x020c
            long r0 = r0 & r8
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x020e
            goto L_0x020c
        L_0x01eb:
            r24 = r1
            r25 = r2
            r22 = r5
            r23 = r6
            r28 = r10
            r27 = r13
            goto L_0x020e
        L_0x01f8:
            r24 = r1
            r25 = r2
            r22 = r5
            r23 = r6
            r28 = r10
            r27 = r13
            if (r15 == 0) goto L_0x020e
            long r0 = r14.f36877c
            int r2 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r2 != 0) goto L_0x020e
        L_0x020c:
            r0 = 1
            goto L_0x020f
        L_0x020e:
            r0 = 0
        L_0x020f:
            if (r0 == 0) goto L_0x0212
            goto L_0x0232
        L_0x0212:
            r0 = r35
            r14 = r20
            r3 = r21
            r5 = r22
            r1 = r24
            r2 = r25
            r13 = r27
            r10 = r28
            goto L_0x00f1
        L_0x0224:
            r24 = r1
            r25 = r2
            r21 = r3
            r22 = r5
            r23 = r6
            r27 = r13
            r17 = 0
        L_0x0232:
            r0 = r17
            qn1.j r0 = (qn1.C12892j) r0
            if (r0 == 0) goto L_0x023b
            te3.re1 r14 = r0.f36875a
            goto L_0x023c
        L_0x023b:
            r14 = 0
        L_0x023c:
            java.lang.String r0 = " condition: "
            java.lang.String r1 = " scene: "
            java.lang.String r2 = " real_pos: "
            if (r14 == 0) goto L_0x02ab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "tryMatchConfig hit, relative_pos(index+1): "
            r3.append(r4)
            r3.append(r12)
            r3.append(r2)
            r13 = r27
            r3.append(r13)
            java.lang.String r2 = " conf.pos: "
            r3.append(r2)
            java.util.LinkedList<java.lang.Integer> r2 = r14.f140855f
            r4 = r23
            gy3.C87412m.m108593f(r2, r4)
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 63
            r34 = 0
            r26 = r2
            java.lang.String r2 = sx3.C110818d0.m150921S(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.append(r2)
            r3.append(r1)
            r4 = r25
            r3.append(r4)
            java.lang.String r1 = " conf.scene: "
            r3.append(r1)
            int r1 = r14.f140856g
            r3.append(r1)
            r3.append(r0)
            r5 = r22
            r3.append(r5)
            java.lang.String r0 = " conf.condition: "
            r3.append(r0)
            int r0 = r14.f140854e
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x02d8
        L_0x02ab:
            r5 = r22
            r4 = r25
            r13 = r27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "tryMatchConfig can't match config, pos(index+1): "
            r3.append(r6)
            r3.append(r12)
            r3.append(r2)
            r3.append(r13)
            r3.append(r1)
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x02d8:
            if (r14 == 0) goto L_0x02e7
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.re1> r0 = rs1.C13502w6.f38270u
            long r1 = r24.getItemId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.put(r1, r14)
        L_0x02e7:
            if (r14 != 0) goto L_0x02ed
            r0 = r35
            goto L_0x0400
        L_0x02ed:
            r0 = r35
            rs1.w6 r1 = r0.f37756d
            jq3.o r2 = r0.f37757e
            boolean r1 = rs1.C13502w6.m12824d3(r1, r2)
            if (r1 == 0) goto L_0x0400
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99505r7
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0315
            float r1 = r14.f140861o
            r2 = 1000(0x3e8, float:1.401E-42)
            float r2 = (float) r2
            float r1 = r1 * r2
            long r1 = (long) r1
            goto L_0x0318
        L_0x0315:
            long r1 = (long) r1
            long r1 = r1 * r18
        L_0x0318:
            rs1.w6 r6 = r0.f37756d
            long r4 = r24.getItemId()
            jq3.o r3 = r0.f37757e
            r6.getClass()
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "surveyGet feedId = "
            r3.append(r8)
            java.lang.Class<kq.h> r8 = p185kq.C10383h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            kq.h r8 = (p185kq.C10383h) r8
            java.lang.String r8 = r8.mo10700XQ(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r9 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.pe1> r10 = rs1.C13502w6.f38269t
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            boolean r3 = r10.contains(r3)
            if (r3 == 0) goto L_0x035e
            java.lang.String r3 = "surveyGet hit cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            goto L_0x03a3
        L_0x035e:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.re1> r3 = rs1.C13502w6.f38270u
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.get(r8)
            r8 = r3
            te3.re1 r8 = (te3.C51096re1) r8
            if (r8 != 0) goto L_0x036e
            goto L_0x03a3
        L_0x036e:
            long r11 = r8.f140853d
            androidx.appcompat.app.AppCompatActivity r3 = r6.getActivity()
            boolean r3 = r3 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x0390
            je1.n0 r3 = new je1.n0
            r3.<init>(r4, r11)
            nr3.e r3 = r3.mo9225i()
            androidx.appcompat.app.AppCompatActivity r11 = r6.getActivity()
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r11, r12)
            com.tencent.mm.ui.MMActivity r11 = (com.tencent.p014mm.p136ui.MMActivity) r11
            r3.mo11397F(r11)
            goto L_0x0399
        L_0x0390:
            je1.n0 r3 = new je1.n0
            r3.<init>(r4, r11)
            nr3.e r3 = r3.mo9225i()
        L_0x0399:
            r11 = r3
            rs1.h7 r12 = new rs1.h7
            r3 = r12
            r3.<init>(r4, r6, r7, r8)
            r11.mo123062e(r12)
        L_0x03a3:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x03de
            rs1.w6 r3 = r0.f37756d
            r4 = 1
            r3.f38281p = r4
            long r4 = java.lang.System.currentTimeMillis()
            r3.f38282q = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onFeedFocused timerHandler.postDelayed "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " ms"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            rs1.w6 r3 = r0.f37756d
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r3.f38274f
            rs1.j7 r5 = new rs1.j7
            jq3.o r6 = r0.f37757e
            r7 = r24
            r5.<init>(r7, r3, r6)
            r4.postDelayed(r5, r1)
            goto L_0x0400
        L_0x03de:
            r7 = r24
            long r1 = r7.getItemId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r10.get(r1)
            if (r1 == 0) goto L_0x0400
            rs1.w6 r1 = r0.f37756d
            jq3.o r2 = r0.f37757e
            r1.getClass()
            java.lang.System.currentTimeMillis()
            rs1.g7 r3 = new rs1.g7
            r3.<init>(r1, r2)
            r1.mo12911P3(r2, r3)
        L_0x0400:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13305k7.invoke(java.lang.Object):java.lang.Object");
    }
}
