package com.tencent.p014mm.plugin.vlog.model;

import a70.C112760b;
import ai2.C92007a;
import android.graphics.Rect;
import c23.C92334b;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import d23.C106976a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sf0.C48374j0;
import sp3.C110801c;
import sx3.C36907w;
import te3.C101758az;
import te3.C64339ea;
import te3.C64346ep3;
import te3.C64536lu2;
import te3.C64869yy;
import te3.C64899zy;
import te3.lb4;
import te3.rr4;

/* renamed from: com.tencent.mm.plugin.vlog.model.i */
public final class C96543i implements C57465w {

    /* renamed from: f */
    public static final C96544a f282548f = new C96544a((C8480h) null);

    /* renamed from: a */
    public final C96552p0 f282549a;

    /* renamed from: b */
    public final C101758az f282550b = new C101758az();

    /* renamed from: c */
    public final C64869yy f282551c = new C64869yy();

    /* renamed from: d */
    public final LinkedList<C64536lu2> f282552d = new LinkedList<>();

    /* renamed from: e */
    public rr4 f282553e;

    /* renamed from: com.tencent.mm.plugin.vlog.model.i$a */
    public static final class C96544a {
        public C96544a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo134602a(C96529a aVar, C101758az azVar) {
            List<Integer> transToList;
            int i;
            int i2;
            C87412m.m108594g(aVar, "abaResult");
            C87412m.m108594g(azVar, "outputConfig");
            if (aVar.f282482a == 0) {
                int i3 = aVar.f282483b;
                if (i3 > 0 && (i = aVar.f282484c) > 0 && (i2 = aVar.f282485d) > 0) {
                    azVar.f297901i = i3;
                    azVar.f297902j = i;
                    azVar.f297903n = i2;
                    Log.m105924i("MicroMsg.CompositionInfoConverter", "video abaResult, width:" + azVar.f297901i + ", height:" + azVar.f297902j + ", " + azVar.f297903n);
                }
                ABAPrams aBAPrams = aVar.f282486e;
                if (aBAPrams != null && (transToList = aBAPrams.transToList()) != null) {
                    azVar.f297909t.addAll(transToList);
                }
            }
        }

        /* renamed from: b */
        public final C96529a mo134603b(C96552p0 p0Var, VideoTransPara videoTransPara, int i, int i2, boolean z) {
            C30513b bVar;
            C87412m.m108594g(p0Var, "composition");
            C87412m.m108594g(videoTransPara, "videoParams");
            ArrayList<C106205q0> arrayList = p0Var.f282570c;
            ArrayList arrayList2 = new ArrayList();
            Iterator<C106205q0> it = arrayList.iterator();
            while (it.hasNext()) {
                C106205q0 next = it.next();
                if (next.f316491b == 2) {
                    String str = next.f316490a;
                    C110801c cVar = next.f316501l;
                    bVar = new C30513b(str, cVar.f331466d, cVar.f331467e);
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            return C96534d.f282494a.mo134593a(arrayList2, videoTransPara, i, i2, z, 4);
        }

        /* renamed from: c */
        public final int mo134604c(int i) {
            return i % 2 != 0 ? i - 1 : i;
        }

        /* renamed from: d */
        public final void mo134605d(VideoTransPara videoTransPara, C101758az azVar) {
            C87412m.m108594g(videoTransPara, "videoParams");
            C87412m.m108594g(azVar, "outputConfig");
            azVar.f297903n = videoTransPara.f267169g;
            azVar.f297904o = videoTransPara.f267168f;
            azVar.f297905p = videoTransPara.f267172j;
            azVar.f297906q = videoTransPara.f267173n;
            azVar.f297907r = videoTransPara.f267174o;
            azVar.f297908s = videoTransPara.f267175p;
            azVar.f297910u = videoTransPara.f267180u;
        }
    }

    public C96543i(C96552p0 p0Var) {
        C87412m.m108594g(p0Var, "composition");
        this.f282549a = p0Var;
    }

    /* renamed from: a */
    public C64899zy mo81180a() {
        C64899zy a = C96551o.m123871a(this.f282549a, this.f282550b);
        a.f186906n = this.f282551c;
        a.f186907o.addAll(this.f282552d);
        rr4 rr4 = this.f282553e;
        a.f186908p = rr4;
        if (rr4 != null) {
            a.f186902g = false;
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x0307  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public te3.C101758az mo81181b(java.lang.String r19, com.tencent.p014mm.modelcontrol.VideoTransPara r20, android.util.Size r21, android.graphics.Rect r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r20
            r2 = r21
            r7 = r22
            java.lang.String r4 = "path"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "videoTransPara"
            gy3.C87412m.m108594g(r3, r4)
            java.lang.String r4 = "previewSize"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "cropRect"
            gy3.C87412m.m108594g(r7, r4)
            com.tencent.mm.modelcontrol.VideoTransPara r4 = new com.tencent.mm.modelcontrol.VideoTransPara
            r4.<init>((com.tencent.p014mm.modelcontrol.VideoTransPara) r3)
            int r5 = r4.f267166d
            float r6 = (float) r5
            int r8 = r21.getHeight()
            float r8 = (float) r8
            int r9 = r21.getWidth()
            float r9 = (float) r9
            float r8 = r8 / r9
            float r6 = r6 * r8
            int r6 = (int) r6
            r4.f267166d = r5
            r4.f267167e = r6
            te3.az r8 = r0.f282550b
            r8.f297896d = r1
            com.tencent.mm.plugin.vlog.model.i$a r1 = f282548f
            int r9 = r21.getWidth()
            int r9 = r1.mo134604c(r9)
            r8.f297897e = r9
            te3.az r8 = r0.f282550b
            int r9 = r21.getHeight()
            int r9 = r1.mo134604c(r9)
            r8.f297898f = r9
            te3.az r8 = r0.f282550b
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.f297900h = r9
            te3.ep3 r9 = new te3.ep3
            r9.<init>()
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r7, r9)
            r8.f297899g = r9
            if (r24 == 0) goto L_0x007a
            te3.az r8 = r0.f282550b
            int r9 = r1.mo134604c(r5)
            r8.f297901i = r9
            te3.az r8 = r0.f282550b
            int r9 = r1.mo134604c(r6)
            r8.f297902j = r9
            goto L_0x0099
        L_0x007a:
            te3.az r8 = r0.f282550b
            int r9 = r4.f267166d
            int r9 = r1.mo134604c(r9)
            r8.f297901i = r9
            te3.az r8 = r0.f282550b
            int r9 = r4.f267166d
            int r10 = r22.height()
            int r9 = r9 * r10
            int r10 = r22.width()
            int r9 = r9 / r10
            int r9 = r1.mo134604c(r9)
            r8.f297902j = r9
        L_0x0099:
            te3.az r8 = r0.f282550b
            r1.mo134605d(r3, r8)
            com.tencent.mm.plugin.vlog.model.p0 r1 = r0.f282549a
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r1 = r1.f282570c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ab:
            boolean r9 = r1.hasNext()
            r10 = 2
            r11 = 0
            r12 = 1
            if (r9 == 0) goto L_0x00c6
            java.lang.Object r9 = r1.next()
            r13 = r9
            com.tencent.mm.plugin.vlog.model.q0 r13 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r13
            int r13 = r13.f316491b
            if (r13 != r10) goto L_0x00c0
            r11 = 1
        L_0x00c0:
            if (r11 == 0) goto L_0x00ab
            r8.add(r9)
            goto L_0x00ab
        L_0x00c6:
            int r1 = r8.size()
            java.lang.String r8 = ", "
            java.lang.String r9 = "MicroMsg.CompositionInfoConverter"
            if (r1 != r12) goto L_0x029b
            com.tencent.mm.plugin.vlog.model.p0 r1 = r0.f282549a
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r1 = r1.f282570c
            java.util.Iterator r1 = r1.iterator()
        L_0x00d8:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x0293
            java.lang.Object r13 = r1.next()
            com.tencent.mm.plugin.vlog.model.q0 r13 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r13
            int r14 = r13.f316491b
            if (r14 != r10) goto L_0x00ea
            r14 = 1
            goto L_0x00eb
        L_0x00ea:
            r14 = 0
        L_0x00eb:
            if (r14 == 0) goto L_0x00d8
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r1 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r11 = r13.f316490a
            rw.m$a r1 = r1.mo129930b(r11)
            if (r1 == 0) goto L_0x02f4
            int r11 = r1.f180525a
            if (r11 <= 0) goto L_0x02f4
            int r12 = r1.f180526b
            if (r12 <= 0) goto L_0x02f4
            float r13 = r1.f180527c
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x02f4
            int r13 = r1.f180530f
            r14 = 180(0xb4, float:2.52E-43)
            if (r13 == 0) goto L_0x0110
            if (r13 != r14) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r11 = r12
        L_0x0110:
            te3.az r12 = r0.f282550b
            int r12 = r12.f297901i
            if (r12 <= r11) goto L_0x01b6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "outputConfig.targetWidth("
            r12.append(r15)
            te3.az r15 = r0.f282550b
            int r15 = r15.f297901i
            r12.append(r15)
            java.lang.String r15 = ") > widthLimit("
            r12.append(r15)
            r12.append(r11)
            r15 = 41
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r24 != 0) goto L_0x016c
            te3.az r5 = r0.f282550b
            com.tencent.mm.plugin.vlog.model.i$a r6 = f282548f
            int r12 = r6.mo134604c(r11)
            r5.f297901i = r12
            te3.az r5 = r0.f282550b
            int r12 = r22.height()
            double r13 = (double) r12
            double r13 = r13 * r15
            int r12 = r22.width()
            r17 = r11
            double r10 = (double) r12
            double r13 = r13 / r10
            te3.az r10 = r0.f282550b
            int r10 = r10.f297901i
            double r10 = (double) r10
            double r13 = r13 * r10
            int r10 = (int) r13
            int r6 = r6.mo134604c(r10)
            r5.f297902j = r6
            r12 = r17
            goto L_0x018d
        L_0x016c:
            r17 = r11
            te3.az r10 = r0.f282550b
            com.tencent.mm.plugin.vlog.model.i$a r11 = f282548f
            r12 = r17
            int r13 = r11.mo134604c(r12)
            r10.f297901i = r13
            te3.az r10 = r0.f282550b
            double r13 = (double) r6
            double r13 = r13 * r15
            double r5 = (double) r5
            double r13 = r13 / r5
            int r5 = r10.f297901i
            double r5 = (double) r5
            double r13 = r13 * r5
            int r5 = (int) r13
            int r5 = r11.mo134604c(r5)
            r10.f297902j = r5
        L_0x018d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "update targetSize:["
            r5.append(r6)
            te3.az r6 = r0.f282550b
            int r6 = r6.f297901i
            r5.append(r6)
            r5.append(r8)
            te3.az r6 = r0.f282550b
            int r6 = r6.f297902j
            r5.append(r6)
            r6 = 93
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            goto L_0x01b7
        L_0x01b6:
            r12 = r11
        L_0x01b7:
            int r5 = r1.f180530f
            if (r5 == 0) goto L_0x01c3
            r6 = 180(0xb4, float:2.52E-43)
            if (r5 != r6) goto L_0x01c0
            goto L_0x01c3
        L_0x01c0:
            int r5 = r1.f180525a
            goto L_0x01c5
        L_0x01c3:
            int r5 = r1.f180526b
        L_0x01c5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "previewSize:"
            r6.append(r10)
            r6.append(r2)
            java.lang.String r10 = ", videoParam.width:"
            r6.append(r10)
            int r10 = r4.f267166d
            r6.append(r10)
            java.lang.String r10 = ", heightLimit:"
            r6.append(r10)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            if (r24 == 0) goto L_0x025e
            if (r12 <= r5) goto L_0x025e
            int r4 = r4.f267166d
            int r4 = java.lang.Math.min(r5, r4)
            int r2 = r21.getHeight()
            if (r2 >= r4) goto L_0x021e
            te3.az r2 = r0.f282550b
            float r4 = (float) r4
            int r5 = r2.f297902j
            float r5 = (float) r5
            float r4 = r4 / r5
            r2.f297900h = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[widescreen] update outputScale:"
            r2.append(r4)
            te3.az r4 = r0.f282550b
            float r4 = r4.f297900h
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            goto L_0x025e
        L_0x021e:
            te3.az r2 = r0.f282550b
            com.tencent.mm.plugin.vlog.model.i$a r6 = f282548f
            int r10 = r6.mo134604c(r4)
            r2.f297902j = r10
            te3.az r2 = r0.f282550b
            float r4 = (float) r4
            float r10 = (float) r12
            float r4 = r4 * r10
            float r5 = (float) r5
            float r4 = r4 / r5
            int r4 = (int) r4
            int r4 = r6.mo134604c(r4)
            r2.f297901i = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[widescreen] update targetSize:["
            r2.append(r4)
            te3.az r4 = r0.f282550b
            int r4 = r4.f297901i
            r2.append(r4)
            r2.append(r8)
            te3.az r4 = r0.f282550b
            int r4 = r4.f297902j
            r2.append(r4)
            r4 = 93
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
        L_0x025e:
            com.tencent.mm.plugin.vlog.model.p0 r2 = r0.f282549a
            boolean r2 = r2.f282574g
            if (r2 != 0) goto L_0x027a
            te3.az r2 = r0.f282550b
            int r4 = r2.f297906q
            int r5 = r1.f180532h
            if (r4 <= r5) goto L_0x026e
            r2.f297906q = r5
        L_0x026e:
            int r4 = r2.f297907r
            int r5 = r1.f180534j
            if (r4 <= r5) goto L_0x027a
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r5 <= r4) goto L_0x027a
            r2.f297907r = r5
        L_0x027a:
            te3.az r2 = r0.f282550b
            int r4 = r2.f297904o
            float r5 = r1.f180527c
            int r5 = (int) r5
            int r4 = java.lang.Math.min(r4, r5)
            r2.f297904o = r4
            te3.az r2 = r0.f282550b
            int r1 = r1.f180533i
            r4 = 2
            int r1 = java.lang.Math.min(r1, r4)
            r2.f297908s = r1
            goto L_0x02f4
        L_0x0293:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        L_0x029b:
            com.tencent.mm.plugin.vlog.model.p0 r1 = r0.f282549a
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r1 = r1.f282570c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x02a8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02c3
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.tencent.mm.plugin.vlog.model.q0 r5 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r5
            int r5 = r5.f316491b
            r6 = 2
            if (r5 != r6) goto L_0x02bc
            r5 = 1
            goto L_0x02bd
        L_0x02bc:
            r5 = 0
        L_0x02bd:
            if (r5 == 0) goto L_0x02a8
            r2.add(r4)
            goto L_0x02a8
        L_0x02c3:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x02ca
            goto L_0x02ee
        L_0x02ca:
            java.util.Iterator r1 = r2.iterator()
        L_0x02ce:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02ee
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.vlog.model.q0 r2 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r2
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r4 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r2 = r2.f316490a
            rw.m$a r2 = r4.mo129930b(r2)
            if (r2 == 0) goto L_0x02ea
            int r2 = r2.f180533i
            if (r2 != r12) goto L_0x02ea
            r2 = 1
            goto L_0x02eb
        L_0x02ea:
            r2 = 0
        L_0x02eb:
            if (r2 == 0) goto L_0x02ce
            r11 = 1
        L_0x02ee:
            if (r11 == 0) goto L_0x02f6
            te3.az r1 = r0.f282550b
            r1.f297908s = r12
        L_0x02f4:
            r2 = 2
            goto L_0x02fb
        L_0x02f6:
            te3.az r1 = r0.f282550b
            r2 = 2
            r1.f297908s = r2
        L_0x02fb:
            te3.az r1 = r0.f282550b
            int r4 = r1.f297908s
            int r2 = java.lang.Math.min(r4, r2)
            r1.f297908s = r2
            if (r23 == 0) goto L_0x0325
            com.tencent.mm.plugin.vlog.model.i$a r10 = f282548f
            com.tencent.mm.plugin.vlog.model.p0 r2 = r0.f282549a
            te3.az r1 = r0.f282550b
            int r4 = r1.f297901i
            int r5 = r1.f297902j
            te3.yy r1 = r0.f282551c
            java.util.LinkedList<te3.ea> r1 = r1.f186611e
            boolean r6 = r1.isEmpty()
            r1 = r10
            r3 = r20
            com.tencent.mm.plugin.vlog.model.a r1 = r1.mo134603b(r2, r3, r4, r5, r6)
            te3.az r2 = r0.f282550b
            r10.mo134602a(r1, r2)
        L_0x0325:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getExportConfig: origin: "
            r1.append(r2)
            te3.az r2 = r0.f282550b
            int r2 = r2.f297897e
            r1.append(r2)
            r1.append(r8)
            te3.az r2 = r0.f282550b
            int r2 = r2.f297898f
            r1.append(r2)
            r1.append(r8)
            te3.az r2 = r0.f282550b
            te3.ep3 r2 = r2.f297899g
            r1.append(r2)
            java.lang.String r2 = " target: "
            r1.append(r2)
            te3.az r2 = r0.f282550b
            int r2 = r2.f297901i
            r1.append(r2)
            r1.append(r8)
            te3.az r2 = r0.f282550b
            int r2 = r2.f297902j
            r1.append(r2)
            java.lang.String r2 = ", audio:"
            r1.append(r2)
            te3.az r2 = r0.f282550b
            int r2 = r2.f297908s
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            te3.az r3 = r0.f282550b
            int r3 = r3.f297906q
            r1.append(r3)
            r1.append(r2)
            te3.az r2 = r0.f282550b
            int r2 = r2.f297907r
            r1.append(r2)
            java.lang.String r2 = ", cropRect:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            te3.az r1 = r0.f282550b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C96543i.mo81181b(java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, android.util.Size, android.graphics.Rect, boolean, boolean):te3.az");
    }

    /* renamed from: c */
    public final void mo134599c(Rect rect, float[] fArr, List<? extends C92007a> list) {
        C87412m.m108594g(rect, "drawingRect");
        C87412m.m108594g(fArr, "validRect");
        C87412m.m108594g(list, "editItems");
        this.f282551c.f186610d = new C64346ep3();
        C64346ep3 ep32 = this.f282551c.f186610d;
        C87412m.m108593f(ep32, "editData.drawingRect");
        C96551o.m123877g(rect, ep32);
        this.f282551c.f186613g = new C64346ep3();
        Rect rect2 = new Rect((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        C64346ep3 ep33 = this.f282551c.f186613g;
        C87412m.m108593f(ep33, "editData.validRect");
        C96551o.m123877g(rect2, ep33);
        LinkedList<C64339ea> linkedList = this.f282551c.f186611e;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C92007a aVar : list) {
            C64339ea eaVar = new C64339ea();
            eaVar.f182947d = aVar.f263402a.f263445d;
            eaVar.f182948e = C48374j0.m53712a(aVar.toProtoBuf().toByteArray());
            arrayList.add(eaVar);
        }
        linkedList.addAll(arrayList);
    }

    /* renamed from: d */
    public final void mo134600d(List<C92334b> list) {
        C87412m.m108594g(list, "magicList");
        for (C92334b bVar : list) {
            LinkedList<C64536lu2> linkedList = this.f282552d;
            C64536lu2 lu22 = new C64536lu2();
            lu22.f184157d = bVar.f264196b.f264194a;
            lu22.f184158e = bVar.f264198d;
            lu22.f184159f = bVar.f264199e;
            linkedList.add(lu22);
        }
    }

    /* renamed from: e */
    public final void mo134601e(C106976a.C31054c cVar) {
        C87412m.m108594g(cVar, "template");
        List<lb4> list = C96551o.f282567a;
        rr4 rr4 = new rr4();
        cVar.getClass();
        rr4.f185289d = null;
        String str = C112760b.m154225d() + System.currentTimeMillis() + ".mp3";
        cVar.getClass();
        C86013q1.m106442c((String) null, str);
        rr4.f185290e = str;
        cVar.getClass();
        rr4.f185291f = 0;
        cVar.getClass();
        rr4.f185292g = false;
        this.f282553e = rr4;
    }
}
