package bl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import bl1.C39786k;
import f14.C58901s;
import fy3.C32227p;
import java.util.List;
import kotlin.ResultKt;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C51836wi;
import te3.C52013xs0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxDataStore$MsgPollingTask$processResp$1$2", mo125469f = "BoxDataStore.kt", mo125470l = {433}, mo125471m = "invokeSuspend")
/* renamed from: bl1.l */
public final class C39796l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f106786d;

    /* renamed from: e */
    public final /* synthetic */ C39786k.C39789c f106787e;

    /* renamed from: f */
    public final /* synthetic */ boolean f106788f;

    /* renamed from: g */
    public final /* synthetic */ C89349b f106789g;

    /* renamed from: h */
    public final /* synthetic */ List<C52013xs0> f106790h;

    /* renamed from: i */
    public final /* synthetic */ List<C52013xs0> f106791i;

    /* renamed from: j */
    public final /* synthetic */ List<C51836wi> f106792j;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxDataStore$MsgPollingTask$processResp$1$2$1", mo125469f = "BoxDataStore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: bl1.l$a */
    public static final class C39797a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C39786k.C39789c f106793d;

        /* renamed from: e */
        public final /* synthetic */ boolean f106794e;

        /* renamed from: f */
        public final /* synthetic */ C89349b f106795f;

        /* renamed from: g */
        public final /* synthetic */ List<C52013xs0> f106796g;

        /* renamed from: h */
        public final /* synthetic */ List<C52013xs0> f106797h;

        /* renamed from: i */
        public final /* synthetic */ List<C51836wi> f106798i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39797a(C39786k.C39789c cVar, boolean z, C89349b bVar, List<? extends C52013xs0> list, List<? extends C52013xs0> list2, List<? extends C51836wi> list3, C15601d<? super C39797a> dVar) {
            super(2, dVar);
            this.f106793d = cVar;
            this.f106794e = z;
            this.f106795f = bVar;
            this.f106796g = list;
            this.f106797h = list2;
            this.f106798i = list3;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C39797a(this.f106793d, this.f106794e, this.f106795f, this.f106796g, this.f106797h, this.f106798i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C39797a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:136:0x0393  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x03af  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x01ba A[EDGE_INSN: B:180:0x01ba->B:73:0x01ba ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x0300 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x0300 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01ac A[LOOP:5: B:61:0x0181->B:71:0x01ac, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x024d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                kotlin.ResultKt.throwOnFailure(r23)
                bl1.k$c r1 = r0.f106793d
                boolean r2 = r0.f106794e
                pe3.b r3 = r0.f106795f
                java.util.List<te3.xs0> r4 = r0.f106796g
                java.util.List<te3.xs0> r5 = r0.f106797h
                java.util.List<te3.wi> r6 = r0.f106798i
                bl1.k r7 = r1.f106773d
                te3.lw0 r8 = r1.f106770a
                java.lang.String r8 = r8.f137677e
                java.lang.String r9 = ""
                if (r8 != 0) goto L_0x001c
                r8 = r9
            L_0x001c:
                bl1.u r7 = r7.mo62413d(r8)
                if (r7 != 0) goto L_0x0024
                goto L_0x0454
            L_0x0024:
                bl1.k r8 = r1.f106773d
                java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.k$a> r8 = r8.f106765d
                te3.lw0 r10 = r1.f106770a
                java.lang.String r10 = r10.f137677e
                if (r10 != 0) goto L_0x002f
                r10 = r9
            L_0x002f:
                java.lang.Object r8 = r8.get(r10)
                bl1.k$a r8 = (bl1.C39786k.C39787a) r8
                r15 = 0
                r14 = 0
                if (r2 == 0) goto L_0x005f
                te3.xi r2 = r1.f106771b
                java.util.LinkedList<te3.dj> r2 = r2.f144667g
                r2.clear()
                java.util.ArrayList<bl1.b> r2 = r7.f106815b
                int r2 = r2.size()
                java.util.ArrayList<bl1.b> r10 = r7.f106815b
                r10.clear()
                if (r2 <= 0) goto L_0x005f
                if (r8 == 0) goto L_0x005f
                bl1.k$d r10 = new bl1.k$d
                te3.lw0 r11 = r1.f106770a
                java.lang.String r11 = r11.f137677e
                if (r11 != 0) goto L_0x0058
                goto L_0x0059
            L_0x0058:
                r9 = r11
            L_0x0059:
                r10.<init>(r9, r14, r2, r15)
                r8.mo62417a(r10)
            L_0x005f:
                te3.xi r2 = r1.f106771b
                r2.f144665e = r3
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.ArrayList<bl1.b> r9 = r7.f106815b
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x0078:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x008d
                java.lang.Object r11 = r9.next()
                r12 = r11
                bl1.b r12 = (bl1.C39775b) r12
                boolean r12 = r12.f106733d
                if (r12 == 0) goto L_0x0078
                r10.add(r11)
                goto L_0x0078
            L_0x008d:
                java.util.Iterator r4 = r4.iterator()
            L_0x0091:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x00de
                java.lang.Object r9 = r4.next()
                te3.xs0 r9 = (te3.C52013xs0) r9
                java.lang.String r12 = r9.f144915t
                if (r12 == 0) goto L_0x00aa
                int r12 = r12.length()
                if (r12 != 0) goto L_0x00a8
                goto L_0x00aa
            L_0x00a8:
                r13 = 0
                goto L_0x00ab
            L_0x00aa:
                r13 = 1
            L_0x00ab:
                if (r13 != 0) goto L_0x00d9
                java.util.Iterator r12 = r10.iterator()
                r13 = 0
            L_0x00b2:
                boolean r16 = r12.hasNext()
                if (r16 == 0) goto L_0x00d2
                java.lang.Object r16 = r12.next()
                r11 = r16
                bl1.b r11 = (bl1.C39775b) r11
                te3.xs0 r11 = r11.f106734e
                java.lang.String r11 = r11.f144904f
                java.lang.String r15 = r9.f144915t
                boolean r11 = gy3.C87412m.m108589b(r11, r15)
                if (r11 == 0) goto L_0x00ce
                r11 = r13
                goto L_0x00d3
            L_0x00ce:
                int r13 = r13 + 1
                r15 = 0
                goto L_0x00b2
            L_0x00d2:
                r11 = -1
            L_0x00d3:
                if (r11 < 0) goto L_0x00d9
                r3.add(r9)
                goto L_0x00dc
            L_0x00d9:
                r2.add(r9)
            L_0x00dc:
                r15 = 0
                goto L_0x0091
            L_0x00de:
                bl1.k$b r4 = bl1.C39786k.f106760i
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "curSize:"
                r4.append(r9)
                java.util.ArrayList<bl1.b> r9 = r7.f106815b
                int r9 = r9.size()
                r4.append(r9)
                java.lang.String r9 = ", svr selfPostList:"
                r4.append(r9)
                int r9 = r3.size()
                r4.append(r9)
                java.lang.String r9 = ", appendList:"
                r4.append(r9)
                int r9 = r2.size()
                r4.append(r9)
                java.lang.String r9 = ", updateList:"
                r4.append(r9)
                int r9 = r5.size()
                r4.append(r9)
                java.lang.String r9 = ", bulletList:"
                r4.append(r9)
                int r9 = r6.size()
                r4.append(r9)
                java.lang.String r4 = r4.toString()
                java.lang.String r9 = "Finder.BoxDataStore"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
                bl1.k r4 = r1.f106773d
                java.util.Iterator r3 = r3.iterator()
            L_0x0132:
                boolean r10 = r3.hasNext()
                if (r10 == 0) goto L_0x026d
                java.lang.Object r10 = r3.next()
                te3.xs0 r10 = (te3.C52013xs0) r10
                java.util.ArrayList<bl1.b> r11 = r7.f106815b
                java.util.Iterator r11 = r11.iterator()
                r12 = 0
            L_0x0145:
                boolean r15 = r11.hasNext()
                if (r15 == 0) goto L_0x0161
                java.lang.Object r15 = r11.next()
                bl1.b r15 = (bl1.C39775b) r15
                te3.xs0 r15 = r15.f106734e
                java.lang.String r15 = r15.f144904f
                java.lang.String r13 = r10.f144915t
                boolean r13 = gy3.C87412m.m108589b(r15, r13)
                if (r13 == 0) goto L_0x015e
                goto L_0x0162
            L_0x015e:
                int r12 = r12 + 1
                goto L_0x0145
            L_0x0161:
                r12 = -1
            L_0x0162:
                if (r12 < 0) goto L_0x025e
                java.util.ArrayList<bl1.b> r11 = r7.f106815b
                java.lang.Object r11 = sx3.C110818d0.m150917O(r11, r12)
                bl1.b r11 = (bl1.C39775b) r11
                if (r11 == 0) goto L_0x025e
                java.lang.String r13 = "<set-?>"
                gy3.C87412m.m108594g(r10, r13)
                r11.f106734e = r10
                r11.f106733d = r14
                te3.xi r13 = r1.f106771b
                java.util.LinkedList<te3.dj> r13 = r13.f144667g
                if (r13 == 0) goto L_0x020e
                java.util.Iterator r13 = r13.iterator()
            L_0x0181:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto L_0x01b5
                java.lang.Object r15 = r13.next()
                r14 = r15
                te3.dj r14 = (te3.C49153dj) r14
                te3.xs0 r14 = r14.f132361d
                if (r14 == 0) goto L_0x01a3
                te3.xs0 r0 = r11.f106734e
                r19 = r5
                r20 = r6
                long r5 = r0.f144913r
                r0 = r13
                long r13 = r14.f144913r
                int r21 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r21 != 0) goto L_0x01a8
                r5 = 1
                goto L_0x01a9
            L_0x01a3:
                r19 = r5
                r20 = r6
                r0 = r13
            L_0x01a8:
                r5 = 0
            L_0x01a9:
                if (r5 == 0) goto L_0x01ac
                goto L_0x01ba
            L_0x01ac:
                r13 = r0
                r5 = r19
                r6 = r20
                r14 = 0
                r0 = r22
                goto L_0x0181
            L_0x01b5:
                r19 = r5
                r20 = r6
                r15 = 0
            L_0x01ba:
                te3.dj r15 = (te3.C49153dj) r15
                if (r15 == 0) goto L_0x0212
                r15.f132361d = r10
                r0 = 0
                r15.f132362e = r0
                bl1.k$b r5 = bl1.C39786k.f106760i
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "updateBySvr, seq:"
                r5.append(r6)
                te3.xs0 r6 = r15.f132361d
                if (r6 == 0) goto L_0x01db
                long r13 = r6.f144913r
                java.lang.Long r6 = java.lang.Long.valueOf(r13)
                goto L_0x01dc
            L_0x01db:
                r6 = 0
            L_0x01dc:
                r5.append(r6)
                java.lang.String r6 = ", client_msg_id:"
                r5.append(r6)
                te3.xs0 r6 = r15.f132361d
                if (r6 == 0) goto L_0x01eb
                java.lang.String r6 = r6.f144915t
                goto L_0x01ec
            L_0x01eb:
                r6 = 0
            L_0x01ec:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "str"
                gy3.C87412m.m108594g(r5, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r10 = "memDataLog "
                r6.append(r10)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
                goto L_0x0213
            L_0x020e:
                r19 = r5
                r20 = r6
            L_0x0212:
                r0 = 0
            L_0x0213:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "local update to svr, "
                r5.append(r6)
                java.lang.String r6 = r11.mo62406i()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r4.mo62411b(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "notifier update index:"
                r5.append(r6)
                r5.append(r12)
                java.lang.String r6 = ", msg:"
                r5.append(r6)
                java.lang.String r6 = r11.mo62406i()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r4.mo62411b(r5)
                if (r8 == 0) goto L_0x0263
                bl1.k$d r5 = new bl1.k$d
                java.lang.String r6 = r7.f106814a
                r10 = 2
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r13 = 1
                r5.<init>(r6, r12, r13, r10)
                r8.mo62418b(r5)
                goto L_0x0264
            L_0x025e:
                r19 = r5
                r20 = r6
                r0 = 0
            L_0x0263:
                r13 = 1
            L_0x0264:
                r0 = r22
                r5 = r19
                r6 = r20
                r14 = 0
                goto L_0x0132
            L_0x026d:
                r19 = r5
                r20 = r6
                r0 = 0
                r13 = 1
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = sx3.C36907w.m41090l(r2, r4)
                r3.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L_0x0282:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0298
                java.lang.Object r4 = r2.next()
                te3.xs0 r4 = (te3.C52013xs0) r4
                bl1.k$b r5 = bl1.C39786k.f106760i
                bl1.b r4 = r5.mo62421b(r4)
                r3.add(r4)
                goto L_0x0282
            L_0x0298:
                java.util.List r12 = sx3.C110818d0.m150912J(r3)
                bl1.k r10 = r1.f106773d
                te3.xi r2 = r1.f106771b
                java.lang.String r11 = "polling"
                r3 = 1
                r13 = r2
                r14 = r7
                r2 = 0
                r15 = r8
                bl1.C39786k.m42575a(r10, r11, r12, r13, r14, r15)
                bl1.k r4 = r1.f106773d
                java.util.Iterator r5 = r19.iterator()
            L_0x02b0:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x02cb
                java.lang.Object r6 = r5.next()
                r14 = r6
                te3.xs0 r14 = (te3.C52013xs0) r14
                te3.xi r12 = r1.f106771b
                r16 = 0
                java.lang.String r11 = "svr"
                r10 = r4
                r13 = r7
                r15 = r8
                r10.mo62415f(r11, r12, r13, r14, r15, r16)
                goto L_0x02b0
            L_0x02cb:
                te3.lw0 r4 = r1.f106770a
                java.lang.String r4 = r4.f137677e
                if (r4 == 0) goto L_0x0454
                bl1.k r1 = r1.f106773d
                bl1.f r1 = r1.f106763b
                r1.getClass()
                int r5 = r4.length()
                if (r5 != 0) goto L_0x02e0
                r14 = 1
                goto L_0x02e1
            L_0x02e0:
                r14 = 0
            L_0x02e1:
                if (r14 == 0) goto L_0x02e6
                sx3.k<te3.wi> r1 = r1.f106742b
                goto L_0x02ee
            L_0x02e6:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, sx3.k<te3.wi>> r1 = r1.f106741a
                java.lang.Object r1 = r1.get(r4)
                sx3.k r1 = (sx3.C64190k) r1
            L_0x02ee:
                if (r1 != 0) goto L_0x02f2
                goto L_0x0454
            L_0x02f2:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r6 = r20.iterator()
            L_0x0300:
                boolean r7 = r6.hasNext()
                java.lang.String r15 = "Finder.BoxBulletStore"
                if (r7 == 0) goto L_0x03bd
                java.lang.Object r7 = r6.next()
                te3.wi r7 = (te3.C51836wi) r7
                int r8 = r7.f144065n
                if (r8 != r3) goto L_0x0379
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "remove if id:"
                r8.append(r9)
                long r9 = r7.f144058d
                r8.append(r9)
                java.lang.String r9 = ", username:"
                r8.append(r9)
                java.lang.String r9 = r7.f144060f
                r8.append(r9)
                java.lang.String r9 = "; before waitting:"
                r8.append(r9)
                int r9 = r1.f181916f
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r8)
                bl1.c r8 = new bl1.c
                r8.<init>(r7)
                java.util.Iterator r7 = r1.iterator()
            L_0x0345:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x035c
                java.lang.Object r9 = r7.next()
                java.lang.Object r10 = r8.invoke(r9)
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x0345
                goto L_0x035d
            L_0x035c:
                r9 = r2
            L_0x035d:
                if (r9 == 0) goto L_0x0362
                r1.remove(r9)
            L_0x0362:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "remove if afterwaitting:"
                r7.append(r8)
                int r8 = r1.f181916f
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r7)
                goto L_0x0300
            L_0x0379:
                java.lang.String r8 = r7.f144061g
                if (r8 == 0) goto L_0x0390
                int r9 = r8.length()
                if (r9 != 0) goto L_0x0385
                r9 = 1
                goto L_0x0386
            L_0x0385:
                r9 = 0
            L_0x0386:
                if (r9 != 0) goto L_0x0390
                boolean r8 = z04.C112551y.m153811k(r8)
                if (r8 != 0) goto L_0x0390
                r8 = 1
                goto L_0x0391
            L_0x0390:
                r8 = 0
            L_0x0391:
                if (r8 == 0) goto L_0x0300
                java.lang.String r8 = r7.f144062h
                if (r8 == 0) goto L_0x03aa
                int r9 = r8.length()
                if (r9 != 0) goto L_0x039f
                r9 = 1
                goto L_0x03a0
            L_0x039f:
                r9 = 0
            L_0x03a0:
                if (r9 != 0) goto L_0x03aa
                boolean r8 = z04.C112551y.m153811k(r8)
                if (r8 != 0) goto L_0x03aa
                r8 = 1
                goto L_0x03ab
            L_0x03aa:
                r8 = 0
            L_0x03ab:
                if (r8 != 0) goto L_0x03af
                goto L_0x0300
            L_0x03af:
                int r8 = r7.f144064j
                if (r8 == 0) goto L_0x03b8
                r5.add(r7)
                goto L_0x0300
            L_0x03b8:
                r14.add(r7)
                goto L_0x0300
            L_0x03bd:
                java.util.Iterator r2 = r14.iterator()
            L_0x03c1:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x03d1
                java.lang.Object r3 = r2.next()
                te3.wi r3 = (te3.C51836wi) r3
                r1.addLast(r3)
                goto L_0x03c1
            L_0x03d1:
                int r2 = r1.f181916f
                int r2 = r2 + -200
            L_0x03d5:
                if (r0 >= r2) goto L_0x03e4
                boolean r3 = r1.isEmpty()
                if (r3 == 0) goto L_0x03de
                goto L_0x03e1
            L_0x03de:
                r1.removeFirst()
            L_0x03e1:
                int r0 = r0 + 1
                goto L_0x03d5
            L_0x03e4:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "waittingBulletComments, add comments:"
                r0.append(r2)
                int r2 = r20.size()
                r0.append(r2)
                java.lang.String r2 = ", afterSize:"
                r0.append(r2)
                int r1 = r1.f181916f
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "box:"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = ", produce, friends:"
                r0.append(r1)
                r6 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                bl1.d r11 = bl1.C39777d.f106739d
                r16 = 31
                r17 = 0
                r7 = 0
                r18 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r12 = 31
                r13 = 0
                java.lang.String r5 = sx3.C110818d0.m150921S(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r0.append(r5)
                java.lang.String r5 = ",normal:"
                r0.append(r5)
                bl1.e r12 = bl1.C39778e.f106740d
                r6 = r14
                r7 = r1
                r8 = r2
                r9 = r18
                r10 = r3
                r11 = r4
                r13 = r16
                r14 = r17
                java.lang.String r1 = sx3.C110818d0.m150921S(r6, r7, r8, r9, r10, r11, r12, r13, r14)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            L_0x0454:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bl1.C39796l.C39797a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39796l(C39786k.C39789c cVar, boolean z, C89349b bVar, List<? extends C52013xs0> list, List<? extends C52013xs0> list2, List<? extends C51836wi> list3, C15601d<? super C39796l> dVar) {
        super(2, dVar);
        this.f106787e = cVar;
        this.f106788f = z;
        this.f106789g = bVar;
        this.f106790h = list;
        this.f106791i = list2;
        this.f106792j = list3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C39796l(this.f106787e, this.f106788f, this.f106789g, this.f106790h, this.f106791i, this.f106792j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C39796l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f106786d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C39797a aVar2 = new C39797a(this.f106787e, this.f106788f, this.f106789g, this.f106790h, this.f106791i, this.f106792j, (C15601d<? super C39797a>) null);
            this.f106786d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
