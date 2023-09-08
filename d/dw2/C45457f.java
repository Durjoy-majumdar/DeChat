package dw2;

import android.os.Message;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import cw2.C97385h;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import pc0.C118000d0;
import pe3.C47465a;
import pe3.C89349b;
import qe3.C101126c1;
import te3.C50886px;
import te3.C51018qv3;
import te3.C51024qx;
import te3.nc4;
import te3.oc4;

/* renamed from: dw2.f */
public final class C45457f extends C117747y implements C1311n {

    /* renamed from: h */
    public static final LinkedList<C97385h> f123038h = new LinkedList<>();

    /* renamed from: d */
    public final C47350c f123039d;

    /* renamed from: e */
    public C45458a f123040e = new C45458a(this);

    /* renamed from: f */
    public final int f123041f = 10;

    /* renamed from: g */
    public C11385n f123042g;

    /* renamed from: dw2.f$a */
    public final class C45458a {

        /* renamed from: a */
        public LinkedList<C50886px> f123043a;

        /* renamed from: b */
        public MMHandler f123044b;

        /* renamed from: dw2.f$a$a */
        public static final class C45459a extends MMHandler {

            /* renamed from: a */
            public final /* synthetic */ C45458a f123045a;

            /* renamed from: b */
            public final /* synthetic */ C45457f f123046b;

            /* renamed from: dw2.f$a$a$a */
            public static final class C45460a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C45457f f123047d;

                /* renamed from: e */
                public final /* synthetic */ C50886px f123048e;

                /* renamed from: f */
                public final /* synthetic */ C45459a f123049f;

                public C45460a(C45457f fVar, C50886px pxVar, C45459a aVar) {
                    this.f123047d = fVar;
                    this.f123048e = pxVar;
                    this.f123049f = aVar;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
                    r2 = r2.f140574f;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x00e8 A[Catch:{ Exception -> 0x0118 }] */
                /* JADX WARNING: Removed duplicated region for block: B:25:0x0109 A[LOOP:0: B:23:0x0103->B:25:0x0109, LOOP_END] */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x0120  */
                /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r17 = this;
                        r0 = r17
                        dw2.f r1 = r0.f123047d
                        te3.px r2 = r0.f123048e
                        java.lang.String r3 = "item"
                        gy3.C87412m.m108593f(r2, r3)
                        dw2.f$a$a r3 = r0.f123049f
                        r1.getClass()
                        java.lang.String r1 = "MicroMsg.StoryCgi.NetSceneStorySync"
                        java.lang.String r4 = "h"
                        gy3.C87412m.m108594g(r3, r4)
                        r4 = 0
                        te3.lc4 r5 = new te3.lc4     // Catch:{ Exception -> 0x0118 }
                        r5.<init>()     // Catch:{ Exception -> 0x0118 }
                        te3.qv3 r2 = r2.f140038e     // Catch:{ Exception -> 0x0118 }
                        r6 = 0
                        if (r2 == 0) goto L_0x002c
                        pe3.b r2 = r2.f140574f     // Catch:{ Exception -> 0x0118 }
                        if (r2 == 0) goto L_0x002c
                        byte[] r2 = r2.mo123703f()     // Catch:{ Exception -> 0x0118 }
                        goto L_0x002d
                    L_0x002c:
                        r2 = r6
                    L_0x002d:
                        pe3.a r2 = r5.parseFrom(r2)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg"
                        gy3.C87412m.m108592e(r2, r5)     // Catch:{ Exception -> 0x0118 }
                        te3.lc4 r2 = (te3.lc4) r2     // Catch:{ Exception -> 0x0118 }
                        te3.mc4 r5 = r2.f184074f     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r14 = r5.f298800e     // Catch:{ Exception -> 0x0118 }
                        int r11 = r5.f298806n     // Catch:{ Exception -> 0x0118 }
                        long r9 = r2.f184072d     // Catch:{ Exception -> 0x0118 }
                        cw2.p$a r7 = cw2.C97393p.f285894a     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = "username"
                        gy3.C87412m.m108593f(r14, r5)     // Catch:{ Exception -> 0x0118 }
                        te3.mc4 r5 = r2.f184074f     // Catch:{ Exception -> 0x0118 }
                        te3.hc4 r12 = r5.f298811s     // Catch:{ Exception -> 0x0118 }
                        r13 = 0
                        r8 = r14
                        kw2.i r5 = r7.mo136664h(r8, r9, r11, r12, r13)     // Catch:{ Exception -> 0x0118 }
                        cw2.n r7 = cw2.C97390n.f285891a     // Catch:{ Exception -> 0x0118 }
                        if (r5 == 0) goto L_0x00b7
                        te3.pc4 r8 = r5.mo138657p2()     // Catch:{ Exception -> 0x0118 }
                        te3.sb4 r9 = r8.f299136h     // Catch:{ Exception -> 0x0118 }
                        java.util.LinkedList<te3.bc4> r9 = r9.f299398e     // Catch:{ Exception -> 0x0118 }
                        int r9 = r9.size()     // Catch:{ Exception -> 0x0118 }
                        if (r9 <= 0) goto L_0x00b7
                        te3.sb4 r9 = r8.f299136h     // Catch:{ Exception -> 0x0118 }
                        java.util.LinkedList<te3.bc4> r9 = r9.f299398e     // Catch:{ Exception -> 0x0118 }
                        java.lang.Object r9 = r9.get(r4)     // Catch:{ Exception -> 0x0118 }
                        te3.bc4 r9 = (te3.bc4) r9     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r9 = r9.f297963h     // Catch:{ Exception -> 0x0118 }
                        if (r9 == 0) goto L_0x00b7
                        te3.sb4 r9 = r8.f299136h     // Catch:{ Exception -> 0x0118 }
                        java.util.LinkedList<te3.bc4> r9 = r9.f299398e     // Catch:{ Exception -> 0x0118 }
                        java.lang.Object r9 = r9.get(r4)     // Catch:{ Exception -> 0x0118 }
                        te3.bc4 r9 = (te3.bc4) r9     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r9 = r9.f297961f     // Catch:{ Exception -> 0x0118 }
                        if (r9 == 0) goto L_0x00b7
                        long r9 = r5.field_storyID     // Catch:{ Exception -> 0x0118 }
                        int r11 = r5.field_createTime     // Catch:{ Exception -> 0x0118 }
                        te3.sb4 r12 = r8.f299136h     // Catch:{ Exception -> 0x0118 }
                        java.util.LinkedList<te3.bc4> r12 = r12.f299398e     // Catch:{ Exception -> 0x0118 }
                        java.lang.Object r12 = r12.get(r4)     // Catch:{ Exception -> 0x0118 }
                        te3.bc4 r12 = (te3.bc4) r12     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r12 = r12.f297963h     // Catch:{ Exception -> 0x0118 }
                        te3.sb4 r13 = r8.f299136h     // Catch:{ Exception -> 0x0118 }
                        java.util.LinkedList<te3.bc4> r13 = r13.f299398e     // Catch:{ Exception -> 0x0118 }
                        java.lang.Object r13 = r13.get(r4)     // Catch:{ Exception -> 0x0118 }
                        te3.bc4 r13 = (te3.bc4) r13     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r13 = r13.f297961f     // Catch:{ Exception -> 0x0118 }
                        te3.sb4 r8 = r8.f299136h     // Catch:{ Exception -> 0x0118 }
                        java.util.LinkedList<te3.bc4> r8 = r8.f299398e     // Catch:{ Exception -> 0x0118 }
                        java.lang.Object r8 = r8.get(r4)     // Catch:{ Exception -> 0x0118 }
                        te3.bc4 r8 = (te3.bc4) r8     // Catch:{ Exception -> 0x0118 }
                        float r8 = r8.f297978z     // Catch:{ Exception -> 0x0118 }
                        r15 = 1000(0x3e8, float:1.401E-42)
                        float r15 = (float) r15     // Catch:{ Exception -> 0x0118 }
                        float r8 = r8 * r15
                        r16 = r5
                        long r4 = (long) r8     // Catch:{ Exception -> 0x0118 }
                        r8 = r14
                        r14 = r4
                        r7.mo136647a(r8, r9, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0118 }
                        goto L_0x00b9
                    L_0x00b7:
                        r16 = r5
                    L_0x00b9:
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118 }
                        r4.<init>()     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = "processStoryPost username:"
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        te3.mc4 r5 = r2.f184074f     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = r5.f298800e     // Catch:{ Exception -> 0x0118 }
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = " createTime:"
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        te3.mc4 r5 = r2.f184074f     // Catch:{ Exception -> 0x0118 }
                        int r5 = r5.f298806n     // Catch:{ Exception -> 0x0118 }
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = " id:"
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        long r7 = r2.f184072d     // Catch:{ Exception -> 0x0118 }
                        r4.append(r7)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = " scope:"
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        if (r16 == 0) goto L_0x00f2
                        te3.pc4 r5 = r16.mo138657p2()     // Catch:{ Exception -> 0x0118 }
                        int r5 = r5.f299139n     // Catch:{ Exception -> 0x0118 }
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0118 }
                    L_0x00f2:
                        r4.append(r6)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0118 }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x0118 }
                        r1 = 1
                        java.util.LinkedList<cw2.h> r4 = dw2.C45457f.f123038h
                        java.util.Iterator r4 = r4.iterator()
                    L_0x0103:
                        boolean r5 = r4.hasNext()
                        if (r5 == 0) goto L_0x0113
                        java.lang.Object r5 = r4.next()
                        cw2.h r5 = (cw2.C97385h) r5
                        r5.mo136645a(r2)
                        goto L_0x0103
                    L_0x0113:
                        r5 = 0
                        r3.sendEmptyMessage(r5)
                        goto L_0x011e
                    L_0x0118:
                        java.lang.String r2 = "StorySyncMsg parse error!"
                        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
                        r1 = 0
                    L_0x011e:
                        if (r1 != 0) goto L_0x0126
                        dw2.f$a$a r1 = r0.f123049f
                        r2 = 0
                        r1.sendEmptyMessage(r2)
                    L_0x0126:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dw2.C45457f.C45458a.C45459a.C45460a.run():void");
                }
            }

            /* renamed from: dw2.f$a$a$b */
            public static final class C45461b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C45457f f123050d;

                /* renamed from: e */
                public final /* synthetic */ C50886px f123051e;

                /* renamed from: f */
                public final /* synthetic */ C45459a f123052f;

                public C45461b(C45457f fVar, C50886px pxVar, C45459a aVar) {
                    this.f123050d = fVar;
                    this.f123051e = pxVar;
                    this.f123052f = aVar;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
                    r2 = r2.f140574f;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r20 = this;
                        r0 = r20
                        dw2.f r1 = r0.f123050d
                        te3.px r2 = r0.f123051e
                        java.lang.String r3 = "item"
                        gy3.C87412m.m108593f(r2, r3)
                        dw2.f$a$a r3 = r0.f123052f
                        r1.getClass()
                        java.lang.String r1 = "MicroMsg.StoryCgi.NetSceneStorySync"
                        java.lang.String r4 = "h"
                        gy3.C87412m.m108594g(r3, r4)
                        r4 = 0
                        te3.lc4 r5 = new te3.lc4     // Catch:{ Exception -> 0x0118 }
                        r5.<init>()     // Catch:{ Exception -> 0x0118 }
                        te3.qv3 r2 = r2.f140038e     // Catch:{ Exception -> 0x0118 }
                        r6 = 0
                        if (r2 == 0) goto L_0x002c
                        pe3.b r2 = r2.f140574f     // Catch:{ Exception -> 0x0118 }
                        if (r2 == 0) goto L_0x002c
                        byte[] r2 = r2.mo123703f()     // Catch:{ Exception -> 0x0118 }
                        goto L_0x002d
                    L_0x002c:
                        r2 = r6
                    L_0x002d:
                        pe3.a r2 = r5.parseFrom(r2)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg"
                        gy3.C87412m.m108592e(r2, r5)     // Catch:{ Exception -> 0x0118 }
                        te3.lc4 r2 = (te3.lc4) r2     // Catch:{ Exception -> 0x0118 }
                        te3.mc4 r5 = r2.f184074f     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r14 = r5.f298800e     // Catch:{ Exception -> 0x0118 }
                        int r5 = r5.f298806n     // Catch:{ Exception -> 0x0118 }
                        long r12 = r2.f184072d     // Catch:{ Exception -> 0x0118 }
                        cw2.p$a r15 = cw2.C97393p.f285894a     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r7 = "username"
                        gy3.C87412m.m108593f(r14, r7)     // Catch:{ Exception -> 0x0118 }
                        r16 = 0
                        r17 = 1
                        r7 = r15
                        r8 = r14
                        r9 = r12
                        r11 = r5
                        r18 = r12
                        r12 = r16
                        r13 = r17
                        r7.mo136664h(r8, r9, r11, r12, r13)     // Catch:{ Exception -> 0x0118 }
                        kw2.i r15 = r15.mo136659c(r14)     // Catch:{ Exception -> 0x0118 }
                        te3.pc4 r7 = r15.mo138657p2()     // Catch:{ Exception -> 0x0118 }
                        te3.sb4 r8 = r7.f299136h     // Catch:{ Exception -> 0x0118 }
                        if (r8 == 0) goto L_0x0076
                        java.util.LinkedList<te3.bc4> r8 = r8.f299398e     // Catch:{ Exception -> 0x0118 }
                        if (r8 == 0) goto L_0x0076
                        java.lang.Object r8 = sx3.C110818d0.m150917O(r8, r4)     // Catch:{ Exception -> 0x0118 }
                        te3.bc4 r8 = (te3.bc4) r8     // Catch:{ Exception -> 0x0118 }
                        if (r8 == 0) goto L_0x0076
                        java.lang.String r8 = r8.f297963h     // Catch:{ Exception -> 0x0118 }
                        r12 = r8
                        goto L_0x0077
                    L_0x0076:
                        r12 = r6
                    L_0x0077:
                        te3.sb4 r8 = r7.f299136h     // Catch:{ Exception -> 0x0118 }
                        if (r8 == 0) goto L_0x0089
                        java.util.LinkedList<te3.bc4> r8 = r8.f299398e     // Catch:{ Exception -> 0x0118 }
                        if (r8 == 0) goto L_0x0089
                        java.lang.Object r8 = sx3.C110818d0.m150917O(r8, r4)     // Catch:{ Exception -> 0x0118 }
                        te3.bc4 r8 = (te3.bc4) r8     // Catch:{ Exception -> 0x0118 }
                        if (r8 == 0) goto L_0x0089
                        java.lang.String r6 = r8.f297961f     // Catch:{ Exception -> 0x0118 }
                    L_0x0089:
                        r13 = r6
                        te3.sb4 r6 = r7.f299136h     // Catch:{ Exception -> 0x0118 }
                        if (r6 == 0) goto L_0x009d
                        java.util.LinkedList<te3.bc4> r6 = r6.f299398e     // Catch:{ Exception -> 0x0118 }
                        if (r6 == 0) goto L_0x009d
                        java.lang.Object r6 = sx3.C110818d0.m150917O(r6, r4)     // Catch:{ Exception -> 0x0118 }
                        te3.bc4 r6 = (te3.bc4) r6     // Catch:{ Exception -> 0x0118 }
                        if (r6 == 0) goto L_0x009d
                        float r6 = r6.f297978z     // Catch:{ Exception -> 0x0118 }
                        goto L_0x009e
                    L_0x009d:
                        r6 = 0
                    L_0x009e:
                        cw2.n r7 = cw2.C97390n.f285891a     // Catch:{ Exception -> 0x0118 }
                        long r9 = r15.field_storyID     // Catch:{ Exception -> 0x0118 }
                        int r11 = r15.field_createTime     // Catch:{ Exception -> 0x0118 }
                        r8 = 1000(0x3e8, float:1.401E-42)
                        float r8 = (float) r8     // Catch:{ Exception -> 0x0118 }
                        float r6 = r6 * r8
                        r17 = r5
                        long r4 = (long) r6     // Catch:{ Exception -> 0x0118 }
                        r8 = r14
                        r6 = r14
                        r0 = r15
                        r14 = r4
                        r7.mo136647a(r8, r9, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0118 }
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118 }
                        r4.<init>()     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = "processStoryPostDel username:"
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        r4.append(r6)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = " createTime:"
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        r5 = r17
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r5 = " id:"
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        r5 = r18
                        r4.append(r5)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r7 = " lastCreateTime:"
                        r4.append(r7)     // Catch:{ Exception -> 0x0118 }
                        int r7 = r0.field_createTime     // Catch:{ Exception -> 0x0118 }
                        r4.append(r7)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r7 = " lastId:"
                        r4.append(r7)     // Catch:{ Exception -> 0x0118 }
                        long r7 = r0.field_storyID     // Catch:{ Exception -> 0x0118 }
                        r4.append(r7)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r0 = "   ulonglong "
                        r4.append(r0)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r0 = o40.C61926c.m72691p(r5)     // Catch:{ Exception -> 0x0118 }
                        r4.append(r0)     // Catch:{ Exception -> 0x0118 }
                        java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0118 }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x0118 }
                        r0 = 1
                        java.util.LinkedList<cw2.h> r1 = dw2.C45457f.f123038h
                        java.util.Iterator r1 = r1.iterator()
                    L_0x0103:
                        boolean r4 = r1.hasNext()
                        if (r4 == 0) goto L_0x0113
                        java.lang.Object r4 = r1.next()
                        cw2.h r4 = (cw2.C97385h) r4
                        r4.mo136645a(r2)
                        goto L_0x0103
                    L_0x0113:
                        r4 = 0
                        r3.sendEmptyMessage(r4)
                        goto L_0x011e
                    L_0x0118:
                        java.lang.String r0 = "StorySyncMsg parse error!"
                        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
                        r0 = 0
                    L_0x011e:
                        if (r0 != 0) goto L_0x0129
                        r0 = r20
                        dw2.f$a$a r1 = r0.f123052f
                        r2 = 0
                        r1.sendEmptyMessage(r2)
                        goto L_0x012b
                    L_0x0129:
                        r0 = r20
                    L_0x012b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dw2.C45457f.C45458a.C45459a.C45461b.run():void");
                }
            }

            /* renamed from: dw2.f$a$a$c */
            public static final class C45462c implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C45457f f123053d;

                /* renamed from: e */
                public final /* synthetic */ C50886px f123054e;

                /* renamed from: f */
                public final /* synthetic */ C45459a f123055f;

                public C45462c(C45457f fVar, C50886px pxVar, C45459a aVar) {
                    this.f123053d = fVar;
                    this.f123054e = pxVar;
                    this.f123055f = aVar;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
                    r1 = r1.f140574f;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r10 = this;
                        dw2.f r0 = r10.f123053d
                        te3.px r1 = r10.f123054e
                        java.lang.String r2 = "item"
                        gy3.C87412m.m108593f(r1, r2)
                        dw2.f$a$a r2 = r10.f123055f
                        r0.getClass()
                        java.lang.String r0 = "MicroMsg.StoryCgi.NetSceneStorySync"
                        java.lang.String r3 = "h"
                        gy3.C87412m.m108594g(r2, r3)
                        r3 = 0
                        te3.lc4 r4 = new te3.lc4     // Catch:{ Exception -> 0x008f }
                        r4.<init>()     // Catch:{ Exception -> 0x008f }
                        te3.qv3 r1 = r1.f140038e     // Catch:{ Exception -> 0x008f }
                        if (r1 == 0) goto L_0x0029
                        pe3.b r1 = r1.f140574f     // Catch:{ Exception -> 0x008f }
                        if (r1 == 0) goto L_0x0029
                        byte[] r1 = r1.mo123703f()     // Catch:{ Exception -> 0x008f }
                        goto L_0x002a
                    L_0x0029:
                        r1 = 0
                    L_0x002a:
                        pe3.a r1 = r4.parseFrom(r1)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg"
                        gy3.C87412m.m108592e(r1, r4)     // Catch:{ Exception -> 0x008f }
                        te3.lc4 r1 = (te3.lc4) r1     // Catch:{ Exception -> 0x008f }
                        te3.mc4 r4 = r1.f184074f     // Catch:{ Exception -> 0x008f }
                        java.lang.String r5 = r4.f298800e     // Catch:{ Exception -> 0x008f }
                        int r4 = r4.f298806n     // Catch:{ Exception -> 0x008f }
                        long r6 = r1.f184072d     // Catch:{ Exception -> 0x008f }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
                        r8.<init>()     // Catch:{ Exception -> 0x008f }
                        java.lang.String r9 = "processStoryComment username:"
                        r8.append(r9)     // Catch:{ Exception -> 0x008f }
                        r8.append(r5)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r5 = " createTime:"
                        r8.append(r5)     // Catch:{ Exception -> 0x008f }
                        r8.append(r4)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = " id:"
                        r8.append(r4)     // Catch:{ Exception -> 0x008f }
                        r8.append(r6)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = " ulonglong "
                        r8.append(r4)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = o40.C61926c.m72691p(r6)     // Catch:{ Exception -> 0x008f }
                        r8.append(r4)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x008f }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x008f }
                        ew2.b r4 = ew2.C97758b.f286820d     // Catch:{ Exception -> 0x008f }
                        r4.mo137088b(r1)     // Catch:{ Exception -> 0x008f }
                        r0 = 1
                        java.util.LinkedList<cw2.h> r4 = dw2.C45457f.f123038h
                        java.util.Iterator r4 = r4.iterator()
                    L_0x007b:
                        boolean r5 = r4.hasNext()
                        if (r5 == 0) goto L_0x008b
                        java.lang.Object r5 = r4.next()
                        cw2.h r5 = (cw2.C97385h) r5
                        r5.mo136645a(r1)
                        goto L_0x007b
                    L_0x008b:
                        r2.sendEmptyMessage(r3)
                        goto L_0x00a9
                    L_0x008f:
                        r1 = move-exception
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "StorySyncMsg parse error: "
                        r2.append(r4)
                        java.lang.String r1 = r1.getMessage()
                        r2.append(r1)
                        java.lang.String r1 = r2.toString()
                        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                        r0 = 0
                    L_0x00a9:
                        if (r0 != 0) goto L_0x00b0
                        dw2.f$a$a r0 = r10.f123055f
                        r0.sendEmptyMessage(r3)
                    L_0x00b0:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dw2.C45457f.C45458a.C45459a.C45462c.run():void");
                }
            }

            /* renamed from: dw2.f$a$a$d */
            public static final class C45463d implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C45457f f123056d;

                /* renamed from: e */
                public final /* synthetic */ C50886px f123057e;

                /* renamed from: f */
                public final /* synthetic */ C45459a f123058f;

                public C45463d(C45457f fVar, C50886px pxVar, C45459a aVar) {
                    this.f123056d = fVar;
                    this.f123057e = pxVar;
                    this.f123058f = aVar;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
                    r1 = r1.f140574f;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r10 = this;
                        dw2.f r0 = r10.f123056d
                        te3.px r1 = r10.f123057e
                        java.lang.String r2 = "item"
                        gy3.C87412m.m108593f(r1, r2)
                        dw2.f$a$a r2 = r10.f123058f
                        r0.getClass()
                        java.lang.String r0 = "MicroMsg.StoryCgi.NetSceneStorySync"
                        java.lang.String r3 = "h"
                        gy3.C87412m.m108594g(r2, r3)
                        r3 = 0
                        te3.lc4 r4 = new te3.lc4     // Catch:{ Exception -> 0x008f }
                        r4.<init>()     // Catch:{ Exception -> 0x008f }
                        te3.qv3 r1 = r1.f140038e     // Catch:{ Exception -> 0x008f }
                        if (r1 == 0) goto L_0x0029
                        pe3.b r1 = r1.f140574f     // Catch:{ Exception -> 0x008f }
                        if (r1 == 0) goto L_0x0029
                        byte[] r1 = r1.mo123703f()     // Catch:{ Exception -> 0x008f }
                        goto L_0x002a
                    L_0x0029:
                        r1 = 0
                    L_0x002a:
                        pe3.a r1 = r4.parseFrom(r1)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg"
                        gy3.C87412m.m108592e(r1, r4)     // Catch:{ Exception -> 0x008f }
                        te3.lc4 r1 = (te3.lc4) r1     // Catch:{ Exception -> 0x008f }
                        te3.mc4 r4 = r1.f184074f     // Catch:{ Exception -> 0x008f }
                        java.lang.String r5 = r4.f298800e     // Catch:{ Exception -> 0x008f }
                        int r4 = r4.f298806n     // Catch:{ Exception -> 0x008f }
                        long r6 = r1.f184072d     // Catch:{ Exception -> 0x008f }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
                        r8.<init>()     // Catch:{ Exception -> 0x008f }
                        java.lang.String r9 = "processStoryVisit username:"
                        r8.append(r9)     // Catch:{ Exception -> 0x008f }
                        r8.append(r5)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r5 = " createTime:"
                        r8.append(r5)     // Catch:{ Exception -> 0x008f }
                        r8.append(r4)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = " id:"
                        r8.append(r4)     // Catch:{ Exception -> 0x008f }
                        r8.append(r6)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = " ulonglong "
                        r8.append(r4)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = o40.C61926c.m72691p(r6)     // Catch:{ Exception -> 0x008f }
                        r8.append(r4)     // Catch:{ Exception -> 0x008f }
                        java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x008f }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x008f }
                        ew2.b r4 = ew2.C97758b.f286820d     // Catch:{ Exception -> 0x008f }
                        r4.mo137089c(r1)     // Catch:{ Exception -> 0x008f }
                        r0 = 1
                        java.util.LinkedList<cw2.h> r4 = dw2.C45457f.f123038h
                        java.util.Iterator r4 = r4.iterator()
                    L_0x007b:
                        boolean r5 = r4.hasNext()
                        if (r5 == 0) goto L_0x008b
                        java.lang.Object r5 = r4.next()
                        cw2.h r5 = (cw2.C97385h) r5
                        r5.mo136645a(r1)
                        goto L_0x007b
                    L_0x008b:
                        r2.sendEmptyMessage(r3)
                        goto L_0x00a9
                    L_0x008f:
                        r1 = move-exception
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "StorySyncMsg parse error:  "
                        r2.append(r4)
                        java.lang.String r1 = r1.getMessage()
                        r2.append(r1)
                        java.lang.String r1 = r2.toString()
                        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                        r0 = 0
                    L_0x00a9:
                        if (r0 != 0) goto L_0x00b0
                        dw2.f$a$a r0 = r10.f123058f
                        r0.sendEmptyMessage(r3)
                    L_0x00b0:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dw2.C45457f.C45458a.C45459a.C45463d.run():void");
                }
            }

            /* renamed from: dw2.f$a$a$e */
            public static final class C45464e implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C45457f f123059d;

                /* renamed from: e */
                public final /* synthetic */ C50886px f123060e;

                /* renamed from: f */
                public final /* synthetic */ C45459a f123061f;

                public C45464e(C45457f fVar, C50886px pxVar, C45459a aVar) {
                    this.f123059d = fVar;
                    this.f123060e = pxVar;
                    this.f123061f = aVar;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
                    r1 = r1.f140574f;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r10 = this;
                        dw2.f r0 = r10.f123059d
                        te3.px r1 = r10.f123060e
                        java.lang.String r2 = "item"
                        gy3.C87412m.m108593f(r1, r2)
                        dw2.f$a$a r2 = r10.f123061f
                        r0.getClass()
                        java.lang.String r0 = "MicroMsg.StoryCgi.NetSceneStorySync"
                        java.lang.String r3 = "h"
                        gy3.C87412m.m108594g(r2, r3)
                        r3 = 0
                        te3.lc4 r4 = new te3.lc4     // Catch:{ Exception -> 0x0083 }
                        r4.<init>()     // Catch:{ Exception -> 0x0083 }
                        te3.qv3 r1 = r1.f140038e     // Catch:{ Exception -> 0x0083 }
                        if (r1 == 0) goto L_0x0029
                        pe3.b r1 = r1.f140574f     // Catch:{ Exception -> 0x0083 }
                        if (r1 == 0) goto L_0x0029
                        byte[] r1 = r1.mo123703f()     // Catch:{ Exception -> 0x0083 }
                        goto L_0x002a
                    L_0x0029:
                        r1 = 0
                    L_0x002a:
                        pe3.a r1 = r4.parseFrom(r1)     // Catch:{ Exception -> 0x0083 }
                        java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg"
                        gy3.C87412m.m108592e(r1, r4)     // Catch:{ Exception -> 0x0083 }
                        te3.lc4 r1 = (te3.lc4) r1     // Catch:{ Exception -> 0x0083 }
                        te3.mc4 r4 = r1.f184074f     // Catch:{ Exception -> 0x0083 }
                        java.lang.String r5 = r4.f298800e     // Catch:{ Exception -> 0x0083 }
                        int r4 = r4.f298806n     // Catch:{ Exception -> 0x0083 }
                        long r6 = r1.f184072d     // Catch:{ Exception -> 0x0083 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0083 }
                        r8.<init>()     // Catch:{ Exception -> 0x0083 }
                        java.lang.String r9 = "processStoryCommentDel username:"
                        r8.append(r9)     // Catch:{ Exception -> 0x0083 }
                        r8.append(r5)     // Catch:{ Exception -> 0x0083 }
                        java.lang.String r5 = " createTime:"
                        r8.append(r5)     // Catch:{ Exception -> 0x0083 }
                        r8.append(r4)     // Catch:{ Exception -> 0x0083 }
                        java.lang.String r4 = " id:"
                        r8.append(r4)     // Catch:{ Exception -> 0x0083 }
                        r8.append(r6)     // Catch:{ Exception -> 0x0083 }
                        java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x0083 }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x0083 }
                        ew2.b r4 = ew2.C97758b.f286820d     // Catch:{ Exception -> 0x0083 }
                        r4.mo137090d(r1)     // Catch:{ Exception -> 0x0083 }
                        r0 = 1
                        java.util.LinkedList<cw2.h> r4 = dw2.C45457f.f123038h
                        java.util.Iterator r4 = r4.iterator()
                    L_0x006f:
                        boolean r5 = r4.hasNext()
                        if (r5 == 0) goto L_0x007f
                        java.lang.Object r5 = r4.next()
                        cw2.h r5 = (cw2.C97385h) r5
                        r5.mo136645a(r1)
                        goto L_0x006f
                    L_0x007f:
                        r2.sendEmptyMessage(r3)
                        goto L_0x0089
                    L_0x0083:
                        java.lang.String r1 = "StorySyncMsg parse error!"
                        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                        r0 = 0
                    L_0x0089:
                        if (r0 != 0) goto L_0x0090
                        dw2.f$a$a r0 = r10.f123061f
                        r0.sendEmptyMessage(r3)
                    L_0x0090:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dw2.C45457f.C45458a.C45459a.C45464e.run():void");
                }
            }

            public C45459a(C45458a aVar, C45457f fVar) {
                this.f123045a = aVar;
                this.f123046b = fVar;
            }

            public void handleMessage(Message message) {
                C87412m.m108594g(message, "msg");
                if (C86709a0.m107523b().mo121114l()) {
                    LinkedList<C50886px> linkedList = this.f123045a.f123043a;
                    if (linkedList != null) {
                        C87412m.m108591d(linkedList);
                        if (!linkedList.isEmpty()) {
                            LinkedList<C50886px> linkedList2 = this.f123045a.f123043a;
                            C87412m.m108591d(linkedList2);
                            C50886px first = linkedList2.getFirst();
                            LinkedList<C97385h> linkedList3 = C45457f.f123038h;
                            Log.m105918d("MicroMsg.StoryCgi.NetSceneStorySync", "cmdId = " + first.f140037d);
                            LinkedList<C50886px> linkedList4 = this.f123045a.f123043a;
                            C87412m.m108591d(linkedList4);
                            linkedList4.removeFirst();
                            int i = first.f140037d;
                            if (i == 1) {
                                StoryCore.f281736t.mo134194l().post(new C45460a(this.f123046b, first, this));
                                return;
                            } else if (i == 2) {
                                StoryCore.f281736t.mo134194l().post(new C45461b(this.f123046b, first, this));
                                return;
                            } else if (i == 3) {
                                StoryCore.f281736t.mo134194l().post(new C45462c(this.f123046b, first, this));
                                return;
                            } else if (i == 4) {
                                StoryCore.f281736t.mo134194l().post(new C45464e(this.f123046b, first, this));
                                return;
                            } else if (i != 7) {
                                sendEmptyMessage(0);
                                return;
                            } else {
                                StoryCore.f281736t.mo134194l().post(new C45463d(this.f123046b, first, this));
                                return;
                            }
                        }
                    }
                    C45457f fVar = this.f123046b;
                    C47465a aVar = fVar.f123039d.f127056b.f127083a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncResponse");
                    oc4 oc4 = (oc4) aVar;
                    C47465a aVar2 = fVar.f123039d.f127055a.f127080a;
                    C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
                    nc4 nc4 = (nc4) aVar2;
                    byte[] c = C101126c1.m132546c(nc4.f138540e.f140574f.mo123703f(), oc4.f139094f.f140574f.mo123703f());
                    if (c != null && c.length > 0) {
                        C118000d0.f352701a.mo182758c(c, true);
                    }
                    nc4.f138540e.mo73350k(c);
                    if ((oc4.f139093e & nc4.f138539d) == 0) {
                        C11385n nVar = fVar.f123042g;
                        if (nVar != null) {
                            nVar.onSceneEnd(0, 0, "", fVar);
                        } else {
                            C87412m.m108603p("callback");
                            throw null;
                        }
                    } else {
                        C114770g dispatcher = fVar.dispatcher();
                        C87412m.m108593f(dispatcher, "dispatcher()");
                        C11385n nVar2 = fVar.f123042g;
                        if (nVar2 != null) {
                            fVar.doScene(dispatcher, nVar2);
                        } else {
                            C87412m.m108603p("callback");
                            throw null;
                        }
                    }
                }
            }
        }

        public C45458a(C45457f fVar) {
            this.f123044b = new C45459a(this, fVar);
        }
    }

    public C45457f(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new nc4();
        bVar.f127067b = new oc4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmstorysync";
        bVar.f127069d = 513;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123039d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
        ((nc4) aVar).f138539d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        byte[] a = C118000d0.f352701a.mo182756a();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(a);
        C47465a aVar = this.f123039d.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
        ((nc4) aVar).f138540e = qv32;
        this.f123042g = nVar;
        return dispatch(gVar, this.f123039d, this);
    }

    public int getType() {
        return 513;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C89349b bVar;
        Log.m105918d("MicroMsg.StoryCgi.NetSceneStorySync", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f123039d.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncResponse");
            oc4 oc4 = (oc4) aVar;
            C51024qx qxVar = oc4.f139092d;
            LinkedList<C50886px> linkedList = qxVar != null ? qxVar.f140594e : null;
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            boolean z = false;
            if (linkedList.size() > 0) {
                C45458a aVar2 = this.f123040e;
                aVar2.getClass();
                aVar2.f123043a = linkedList;
                aVar2.f123044b.sendEmptyMessage(0);
                return;
            }
            C51018qv3 qv32 = oc4.f139094f;
            if (!(qv32 == null || (bVar = qv32.f140574f) == null)) {
                byte[] f = bVar.mo123703f();
                C47465a aVar3 = this.f123039d.f127055a.f127080a;
                C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
                byte[] c = C101126c1.m132546c(((nc4) aVar3).f138540e.f140574f.mo123703f(), f);
                if (c != null) {
                    if (c.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        C118000d0.f352701a.mo182758c(c, true);
                    }
                }
            }
            C11385n nVar = this.f123042g;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
            } else {
                C87412m.m108603p("callback");
                throw null;
            }
        } else {
            C11385n nVar2 = this.f123042g;
            if (nVar2 != null) {
                nVar2.onSceneEnd(i2, i3, str, this);
            } else {
                C87412m.m108603p("callback");
                throw null;
            }
        }
    }

    public int securityLimitCount() {
        return this.f123041f;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
