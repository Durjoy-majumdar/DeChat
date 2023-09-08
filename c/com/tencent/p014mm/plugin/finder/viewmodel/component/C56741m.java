package com.tencent.p014mm.plugin.finder.viewmodel.component;

import di3.C86312j;
import eb0.C31543z5;
import ej0.C58608e;
import ej0.C86525c;
import ej0.C86530d;
import fy3.C32224a;
import gy3.C87413o;
import l31.C61212e;
import o40.C61926c;
import rs1.C13442s8;
import rs1.C63561k8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.m */
public final class C56741m implements C86530d {

    /* renamed from: a */
    public final /* synthetic */ C56711j f162645a;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.m$a */
    public static final class C56742a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f162646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56742a(C56711j jVar) {
            super(0);
            this.f162646d = jVar;
        }

        public Object invoke() {
            C56711j jVar = this.f162646d;
            C86525c cVar = jVar.f162605w;
            if (cVar != null) {
                cVar.f251386e.f167798a = C58608e.C58609a.Stopped;
            }
            C13442s8 f = C13442s8.f38060Q0.mo12873f(jVar.getContext());
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[5];
            lVarArr[0] = new C13604l("view_id", "projection_type");
            lVarArr[1] = new C13604l("feed_id", C61926c.m72691p(this.f162646d.f162606x));
            lVarArr[2] = new C13604l("comment_scene", q3 != null ? Integer.valueOf(q3.f134675i) : null);
            lVarArr[3] = new C13604l("projection_time", Long.valueOf(C31543z5.m39453c() - this.f162646d.f162581E));
            lVarArr[4] = new C13604l("break_source", 1);
            eVar.mo86168ix("break_projection", C90364q0.m113147f(lVarArr), 25496);
            C56711j jVar2 = this.f162646d;
            C61926c.m72668M(new C63561k8(jVar2.f162605w, jVar2, false));
            C56711j jVar3 = this.f162646d;
            jVar3.f162605w = null;
            jVar3.f162606x = 0;
            return C13598b0.f38549a;
        }
    }

    public C56741m(C56711j jVar) {
        this.f162645a = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = r4.f251382a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80108a(ej0.C86525c r4, boolean r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "subEventListener: onMute mute="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " device["
            r0.append(r5)
            r5 = 0
            if (r4 == 0) goto L_0x001d
            ej0.b r1 = r4.f251382a
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = r1.f251378g
            goto L_0x001e
        L_0x001d:
            r1 = r5
        L_0x001e:
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            if (r4 == 0) goto L_0x002f
            ej0.b r2 = r4.f251382a
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.f251380i
            goto L_0x0030
        L_0x002f:
            r2 = r5
        L_0x0030:
            r0.append(r2)
            java.lang.String r2 = "] selectedDevice["
            r0.append(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.j r2 = r3.f162645a
            ej0.c r2 = r2.f162605w
            if (r2 == 0) goto L_0x0045
            ej0.b r2 = r2.f251382a
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = r2.f251378g
            goto L_0x0046
        L_0x0045:
            r2 = r5
        L_0x0046:
            r0.append(r2)
            r0.append(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.j r1 = r3.f162645a
            ej0.c r1 = r1.f162605w
            if (r1 == 0) goto L_0x0058
            ej0.b r1 = r1.f251382a
            if (r1 == 0) goto L_0x0058
            java.lang.String r5 = r1.f251380i
        L_0x0058:
            r0.append(r5)
            r5 = 93
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "FinderProjectionScreenUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.plugin.finder.viewmodel.component.j r5 = r3.f162645a
            ej0.c r5 = r5.f162605w
            gy3.C87412m.m108589b(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56741m.mo80108a(ej0.c, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r5.f251382a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80109b(ej0.C86525c r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "subEventListener: onPlay device["
            r0.append(r1)
            r1 = 0
            if (r5 == 0) goto L_0x0015
            ej0.b r2 = r5.f251382a
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f251378g
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            r0.append(r2)
            r2 = 44
            r0.append(r2)
            if (r5 == 0) goto L_0x0027
            ej0.b r3 = r5.f251382a
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = r3.f251380i
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            r0.append(r3)
            java.lang.String r3 = "] selectedDevice["
            r0.append(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.j r3 = r4.f162645a
            ej0.c r3 = r3.f162605w
            if (r3 == 0) goto L_0x003d
            ej0.b r3 = r3.f251382a
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r3.f251378g
            goto L_0x003e
        L_0x003d:
            r3 = r1
        L_0x003e:
            r0.append(r3)
            r0.append(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.j r2 = r4.f162645a
            ej0.c r2 = r2.f162605w
            if (r2 == 0) goto L_0x0050
            ej0.b r2 = r2.f251382a
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = r2.f251380i
        L_0x0050:
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderProjectionScreenUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r4.f162645a
            ej0.c r0 = r0.f162605w
            gy3.C87412m.m108589b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56741m.mo80109b(ej0.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r5.f251382a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80110c(ej0.C86525c r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "subEventListener: onPause device["
            r0.append(r1)
            r1 = 0
            if (r5 == 0) goto L_0x0015
            ej0.b r2 = r5.f251382a
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f251378g
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            r0.append(r2)
            r2 = 44
            r0.append(r2)
            if (r5 == 0) goto L_0x0027
            ej0.b r3 = r5.f251382a
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = r3.f251380i
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            r0.append(r3)
            java.lang.String r3 = "] selectedDevice["
            r0.append(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.j r3 = r4.f162645a
            ej0.c r3 = r3.f162605w
            if (r3 == 0) goto L_0x003d
            ej0.b r3 = r3.f251382a
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r3.f251378g
            goto L_0x003e
        L_0x003d:
            r3 = r1
        L_0x003e:
            r0.append(r3)
            r0.append(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.j r2 = r4.f162645a
            ej0.c r2 = r2.f162605w
            if (r2 == 0) goto L_0x0050
            ej0.b r2 = r2.f251382a
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = r2.f251380i
        L_0x0050:
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderProjectionScreenUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r4.f162645a
            ej0.c r0 = r0.f162605w
            gy3.C87412m.m108589b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56741m.mo80110c(ej0.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r5.f251382a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80111d(ej0.C86525c r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "subEventListener: onStop device["
            r0.append(r1)
            r1 = 0
            if (r5 == 0) goto L_0x0015
            ej0.b r2 = r5.f251382a
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f251378g
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            r0.append(r2)
            r2 = 44
            r0.append(r2)
            if (r5 == 0) goto L_0x0027
            ej0.b r3 = r5.f251382a
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = r3.f251380i
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            r0.append(r3)
            java.lang.String r3 = "] selectedDevice["
            r0.append(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.j r3 = r4.f162645a
            ej0.c r3 = r3.f162605w
            if (r3 == 0) goto L_0x003d
            ej0.b r3 = r3.f251382a
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r3.f251378g
            goto L_0x003e
        L_0x003d:
            r3 = r1
        L_0x003e:
            r0.append(r3)
            r0.append(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.j r2 = r4.f162645a
            ej0.c r2 = r2.f162605w
            if (r2 == 0) goto L_0x0050
            ej0.b r2 = r2.f251382a
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = r2.f251380i
        L_0x0050:
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderProjectionScreenUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r4.f162645a
            ej0.c r0 = r0.f162605w
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0075
            com.tencent.mm.plugin.finder.viewmodel.component.m$a r5 = new com.tencent.mm.plugin.finder.viewmodel.component.m$a
            com.tencent.mm.plugin.finder.viewmodel.component.j r0 = r4.f162645a
            r5.<init>(r0)
            o40.C61926c.m72668M(r5)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56741m.mo80111d(ej0.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = r4.f251382a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80112e(ej0.C86525c r4, int r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "subEventListener: onVolume vol="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " device["
            r0.append(r5)
            r5 = 0
            if (r4 == 0) goto L_0x001d
            ej0.b r1 = r4.f251382a
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = r1.f251378g
            goto L_0x001e
        L_0x001d:
            r1 = r5
        L_0x001e:
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            if (r4 == 0) goto L_0x002f
            ej0.b r2 = r4.f251382a
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.f251380i
            goto L_0x0030
        L_0x002f:
            r2 = r5
        L_0x0030:
            r0.append(r2)
            java.lang.String r2 = "] selectedDevice["
            r0.append(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.j r2 = r3.f162645a
            ej0.c r2 = r2.f162605w
            if (r2 == 0) goto L_0x0045
            ej0.b r2 = r2.f251382a
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = r2.f251378g
            goto L_0x0046
        L_0x0045:
            r2 = r5
        L_0x0046:
            r0.append(r2)
            r0.append(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.j r1 = r3.f162645a
            ej0.c r1 = r1.f162605w
            if (r1 == 0) goto L_0x0058
            ej0.b r1 = r1.f251382a
            if (r1 == 0) goto L_0x0058
            java.lang.String r5 = r1.f251380i
        L_0x0058:
            r0.append(r5)
            r5 = 93
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "FinderProjectionScreenUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.plugin.finder.viewmodel.component.j r5 = r3.f162645a
            ej0.c r5 = r5.f162605w
            gy3.C87412m.m108589b(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56741m.mo80112e(ej0.c, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = r4.f251382a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80113f(ej0.C86525c r4, int r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "subEventListener: onProgress progress="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " device["
            r0.append(r5)
            r5 = 0
            if (r4 == 0) goto L_0x001d
            ej0.b r1 = r4.f251382a
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = r1.f251378g
            goto L_0x001e
        L_0x001d:
            r1 = r5
        L_0x001e:
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            if (r4 == 0) goto L_0x002f
            ej0.b r2 = r4.f251382a
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.f251380i
            goto L_0x0030
        L_0x002f:
            r2 = r5
        L_0x0030:
            r0.append(r2)
            java.lang.String r2 = "] selectedDevice["
            r0.append(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.j r2 = r3.f162645a
            ej0.c r2 = r2.f162605w
            if (r2 == 0) goto L_0x0045
            ej0.b r2 = r2.f251382a
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = r2.f251378g
            goto L_0x0046
        L_0x0045:
            r2 = r5
        L_0x0046:
            r0.append(r2)
            r0.append(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.j r1 = r3.f162645a
            ej0.c r1 = r1.f162605w
            if (r1 == 0) goto L_0x0058
            ej0.b r1 = r1.f251382a
            if (r1 == 0) goto L_0x0058
            java.lang.String r5 = r1.f251380i
        L_0x0058:
            r0.append(r5)
            r5 = 93
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "FinderProjectionScreenUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.plugin.finder.viewmodel.component.j r5 = r3.f162645a
            ej0.c r5 = r5.f162605w
            gy3.C87412m.m108589b(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C56741m.mo80113f(ej0.c, int):void");
    }
}
