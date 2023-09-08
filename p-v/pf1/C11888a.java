package pf1;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import df1.C58259c;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import mf1.C10786a1;
import mf1.C10817f1;
import org.json.JSONObject;
import rs1.C13442s8;
import rs1.C13448t;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C64689rq2;
import z04.C112550d0;

/* renamed from: pf1.a */
public final class C11888a extends C11908k {

    /* renamed from: m */
    public long f34735m;

    /* renamed from: n */
    public long f34736n;

    /* renamed from: o */
    public long f34737o;

    /* renamed from: p */
    public final List<Integer> f34738p = new ArrayList();

    /* renamed from: q */
    public C11889a f34739q;

    /* renamed from: r */
    public C11889a f34740r;

    /* renamed from: s */
    public final List<Integer> f34741s = C64197v.m75539h(5, 58, 2, 1, 52);

    /* renamed from: t */
    public final List<String> f34742t = C64197v.m75537f(".ui.AppBrandPluginUI", ".launching.AppBrandLaunchProxyUI", ".ui.SnsAdNativeLandingPagesPreviewUI");

    /* renamed from: u */
    public boolean f34743u;

    /* renamed from: v */
    public boolean f34744v;

    /* renamed from: w */
    public boolean f34745w;

    /* renamed from: pf1.a$a */
    public static final class C11889a {

        /* renamed from: a */
        public final long f34746a;

        /* renamed from: b */
        public long f34747b;

        /* renamed from: c */
        public long f34748c;

        /* renamed from: d */
        public int f34749d;

        /* renamed from: e */
        public final HashSet<Integer> f34750e = new HashSet<>();

        public C11889a(long j) {
            this.f34746a = j;
        }
    }

    /* renamed from: A */
    public final void mo11767A(View view, C11916o oVar) {
        if (oVar.f34816l <= 0 || oVar.f34817m <= 0) {
            Integer valueOf = Integer.valueOf(view.getMeasuredWidth());
            Integer valueOf2 = Integer.valueOf(view.getMeasuredHeight());
            oVar.f34816l = valueOf.intValue();
            oVar.f34817m = valueOf2.intValue();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0142  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11768b(jq3.C60905o r42, android.view.View r43, pf1.C11920q r44) {
        /*
            r41 = this;
            r0 = r41
            r1 = r43
            r2 = r44
            java.lang.String r3 = "holder"
            r4 = r42
            gy3.C87412m.m108594g(r4, r3)
            java.lang.String r3 = "jumpView"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "infoEx"
            gy3.C87412m.m108594g(r2, r3)
            super.mo11768b(r42, r43, r44)
            java.lang.String r3 = r2.f34833g
            java.lang.String r4 = "timeline"
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x01a4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onJumpViewFocus feedId="
            r3.append(r4)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r2.f34830d
            r5 = 0
            if (r4 == 0) goto L_0x003d
            long r6 = r4.getItemId()
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            goto L_0x003e
        L_0x003d:
            r4 = r5
        L_0x003e:
            r3.append(r4)
            java.lang.String r4 = " isSkipNextFocus="
            r3.append(r4)
            boolean r4 = r0.f34743u
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.AdHardJumperEventHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            pf1.p r3 = r2.f34832f
            boolean r4 = r3 instanceof pf1.C11916o
            if (r4 == 0) goto L_0x005d
            pf1.o r3 = (pf1.C11916o) r3
            goto L_0x005e
        L_0x005d:
            r3 = r5
        L_0x005e:
            if (r3 != 0) goto L_0x0061
            return
        L_0x0061:
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            android.content.Context r6 = r43.getContext()
            java.lang.String r7 = "jumpView.context"
            gy3.C87412m.m108593f(r6, r7)
            rs1.s8 r6 = r4.mo12873f(r6)
            r8 = 0
            if (r6 == 0) goto L_0x0077
            int r6 = r6.f38096i
            r13 = r6
            goto L_0x0078
        L_0x0077:
            r13 = 0
        L_0x0078:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r2.f34830d
            if (r6 == 0) goto L_0x0081
            long r11 = r6.getItemId()
            goto L_0x0083
        L_0x0081:
            r11 = 0
        L_0x0083:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            boolean r14 = r0.f34743u
            java.lang.String r15 = "isSkipNextFocus"
            r6.put(r15, r14)
            bl3.r r15 = bl3.C39818r.f106831a
            android.content.Context r14 = r43.getContext()
            gy3.C87412m.m108593f(r14, r7)
            bl3.r$a r14 = r15.mo62443b(r14)
            java.lang.Class<rs1.t> r9 = rs1.C13448t.class
            bl3.t r9 = r14.mo62449e(r9)
            r14 = r9
            rs1.t r14 = (rs1.C13448t) r14
            if (r14 == 0) goto L_0x00b6
            long r9 = r3.f34786i
            java.lang.String r17 = "reportStartExpose-video"
            r40 = r15
            r15 = r11
            r18 = r6
            r19 = r9
            r14.mo12876c3(r15, r17, r18, r19)
            goto L_0x00b8
        L_0x00b6:
            r40 = r15
        L_0x00b8:
            boolean r6 = r0.f34743u
            if (r6 == 0) goto L_0x00bf
            r0.f34743u = r8
            return
        L_0x00bf:
            long r9 = android.os.SystemClock.uptimeMillis()
            r0.f34736n = r9
            pf1.a$a r6 = new pf1.a$a
            r6.<init>(r11)
            r9 = 1
            r6.f34749d = r9
            pf1.a$a r10 = r0.f34740r
            if (r10 == 0) goto L_0x00e7
            long r14 = r10.f34746a
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 != 0) goto L_0x00d9
            r14 = 1
            goto L_0x00da
        L_0x00d9:
            r14 = 0
        L_0x00da:
            if (r14 == 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r10 = r5
        L_0x00de:
            if (r10 == 0) goto L_0x00e7
            long r14 = r10.f34747b
            r6.f34747b = r14
            rx3.b0 r10 = rx3.C13598b0.f38549a
            goto L_0x00e8
        L_0x00e7:
            r10 = r5
        L_0x00e8:
            if (r10 != 0) goto L_0x00f0
            long r14 = eb0.C31543z5.m39453c()
            r6.f34747b = r14
        L_0x00f0:
            r0.f34740r = r5
            r0.f34739q = r6
            mf1.f1 r5 = r2.f34823A
            if (r5 == 0) goto L_0x00fd
            boolean r8 = r5.f32317a
            r35 = r8
            goto L_0x00ff
        L_0x00fd:
            r35 = 0
        L_0x00ff:
            r0.mo11767A(r1, r3)
            android.content.Context r5 = r43.getContext()
            gy3.C87412m.m108593f(r5, r7)
            rs1.s8 r4 = r4.mo12873f(r5)
            if (r4 == 0) goto L_0x0113
            java.lang.String r4 = r4.f38098n
            if (r4 != 0) goto L_0x0115
        L_0x0113:
            java.lang.String r4 = ""
        L_0x0115:
            r15 = r4
            android.content.Context r4 = r43.getContext()
            gy3.C87412m.m108593f(r4, r7)
            r5 = r40
            bl3.r$a r4 = r5.mo62443b(r4)
            java.lang.Class<mf1.a1> r5 = mf1.C10786a1.class
            bl3.t r4 = r4.mo62449e(r5)
            mf1.a1 r4 = (mf1.C10786a1) r4
            if (r4 == 0) goto L_0x0132
            long r4 = r4.f32261v
            r27 = r4
            goto L_0x0134
        L_0x0132:
            r27 = 0
        L_0x0134:
            java.lang.String r4 = r0.f34795j
            java.lang.String r5 = "comment"
            boolean r5 = gy3.C87412m.m108589b(r5, r4)
            if (r5 == 0) goto L_0x0142
            r4 = 2
            r29 = 2
            goto L_0x0150
        L_0x0142:
            java.lang.String r5 = "TWO_FLOW"
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 == 0) goto L_0x014e
            r4 = 4
            r29 = 4
            goto L_0x0150
        L_0x014e:
            r29 = 1
        L_0x0150:
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            java.lang.String r5 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            r9 = r4
            dp1.y0 r9 = (dp1.C58417y0) r9
            android.content.Context r10 = r43.getContext()
            gy3.C87412m.m108593f(r10, r7)
            r14 = 0
            r16 = 0
            r17 = 0
            c30.g r1 = r3.f34783f
            int r4 = r3.f34816l
            int r5 = r3.f34817m
            r21 = 0
            int r6 = com.tencent.p014mm.view.TouchableLayout.f24959d
            int r22 = com.tencent.p014mm.view.TouchableLayout.f24959d
            int r23 = com.tencent.p014mm.view.TouchableLayout.f24960e
            java.lang.String r6 = r3.f34787j
            long r7 = r3.f34786i
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            int r2 = r2.f34844r
            r37 = 1
            r38 = 4063232(0x3e0000, float:5.693801E-39)
            r39 = 0
            r18 = r1
            r19 = r4
            r20 = r5
            r24 = r6
            r25 = r7
            r36 = r2
            dp1.C58417y0.Ny0(r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.util.List<java.lang.Integer> r1 = r0.f34738p
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11888a.mo11768b(jq3.o, android.view.View, pf1.q):void");
    }

    /* renamed from: c */
    public void mo11769c(View view, C11920q qVar) {
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11769c(view, qVar);
        mo11776z(view, qVar, "OnPause");
    }

    /* renamed from: f */
    public void mo11770f(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11770f(oVar, view, qVar);
        mo11776z(view, qVar, "UnFocus");
    }

    /* renamed from: g */
    public void mo11771g(String str, C11920q qVar, View view) {
        C87412m.m108594g(str, "activityName");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(view, "jumpView");
        super.mo11771g(str, qVar, view);
        Log.m105924i("Finder.AdHardJumperEventHandler", "startActivity, activityName=" + str);
        for (String u : this.f34742t) {
            if (C112550d0.m153801u(str, u, false)) {
                this.f34745w = true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [pf1.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11772h(jq3.C60905o r43, android.view.View r44, pf1.C11920q r45) {
        /*
            r42 = this;
            r0 = r42
            r1 = r44
            r2 = r45
            java.lang.Class<rs1.t> r3 = rs1.C13448t.class
            java.lang.String r4 = "holder"
            r5 = r43
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "jumpView"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "infoEx"
            gy3.C87412m.m108594g(r2, r4)
            super.mo11772h(r43, r44, r45)
            java.lang.String r4 = r2.f34833g
            java.lang.String r5 = "timeline"
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x0197
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onRealShow feedId="
            r4.append(r5)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r2.f34830d
            r6 = 0
            if (r5 == 0) goto L_0x003f
            long r7 = r5.getItemId()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            goto L_0x0040
        L_0x003f:
            r5 = r6
        L_0x0040:
            r4.append(r5)
            java.lang.String r5 = " isSkipNextRealShow="
            r4.append(r5)
            boolean r5 = r0.f34744v
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.AdHardJumperEventHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            pf1.p r4 = r2.f34832f
            boolean r5 = r4 instanceof pf1.C11916o
            if (r5 == 0) goto L_0x005f
            r6 = r4
            pf1.o r6 = (pf1.C11916o) r6
        L_0x005f:
            if (r6 != 0) goto L_0x0062
            return
        L_0x0062:
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            android.content.Context r5 = r44.getContext()
            java.lang.String r7 = "jumpView.context"
            gy3.C87412m.m108593f(r5, r7)
            rs1.s8 r5 = r4.mo12873f(r5)
            if (r5 == 0) goto L_0x0077
            int r5 = r5.f38096i
            r13 = r5
            goto L_0x0078
        L_0x0077:
            r13 = 0
        L_0x0078:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r2.f34830d
            r40 = 0
            if (r5 == 0) goto L_0x0084
            long r9 = r5.getItemId()
            r11 = r9
            goto L_0x0086
        L_0x0084:
            r11 = r40
        L_0x0086:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            boolean r9 = r0.f34744v
            java.lang.String r10 = "isSkipNextRealShow"
            r5.put(r10, r9)
            bl3.r r10 = bl3.C39818r.f106831a
            android.content.Context r9 = r44.getContext()
            gy3.C87412m.m108593f(r9, r7)
            bl3.r$a r9 = r10.mo62443b(r9)
            bl3.t r9 = r9.mo62449e(r3)
            r14 = r9
            rs1.t r14 = (rs1.C13448t) r14
            if (r14 == 0) goto L_0x00b4
            long r8 = r6.f34786i
            java.lang.String r17 = "reportStartExpose-component"
            r15 = r11
            r18 = r5
            r19 = r8
            r14.mo12876c3(r15, r17, r18, r19)
        L_0x00b4:
            boolean r5 = r0.f34744v
            if (r5 == 0) goto L_0x00bc
            r5 = 0
            r0.f34744v = r5
            return
        L_0x00bc:
            r5 = 0
            long r8 = r0.f34735m
            int r14 = (r8 > r40 ? 1 : (r8 == r40 ? 0 : -1))
            if (r14 > 0) goto L_0x00c9
            long r8 = android.os.SystemClock.uptimeMillis()
            r0.f34735m = r8
        L_0x00c9:
            mf1.f1 r8 = r2.f34823A
            if (r8 == 0) goto L_0x00d2
            boolean r8 = r8.f32317a
            r35 = r8
            goto L_0x00d4
        L_0x00d2:
            r35 = 0
        L_0x00d4:
            r0.mo11767A(r1, r6)
            android.content.Context r5 = r44.getContext()
            gy3.C87412m.m108593f(r5, r7)
            rs1.s8 r4 = r4.mo12873f(r5)
            if (r4 == 0) goto L_0x00e8
            java.lang.String r4 = r4.f38098n
            if (r4 != 0) goto L_0x00ea
        L_0x00e8:
            java.lang.String r4 = ""
        L_0x00ea:
            r15 = r4
            android.content.Context r4 = r44.getContext()
            gy3.C87412m.m108593f(r4, r7)
            bl3.r$a r4 = r10.mo62443b(r4)
            java.lang.Class<mf1.a1> r5 = mf1.C10786a1.class
            bl3.t r4 = r4.mo62449e(r5)
            mf1.a1 r4 = (mf1.C10786a1) r4
            if (r4 == 0) goto L_0x0105
            long r4 = r4.f32261v
            r27 = r4
            goto L_0x0107
        L_0x0105:
            r27 = r40
        L_0x0107:
            java.lang.String r4 = r0.f34795j
            java.lang.String r5 = "comment"
            boolean r5 = gy3.C87412m.m108589b(r5, r4)
            if (r5 == 0) goto L_0x0115
            r4 = 2
            r29 = 2
            goto L_0x0124
        L_0x0115:
            java.lang.String r5 = "TWO_FLOW"
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 == 0) goto L_0x0121
            r4 = 4
            r29 = 4
            goto L_0x0124
        L_0x0121:
            r4 = 1
            r29 = 1
        L_0x0124:
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            java.lang.String r5 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            r9 = r4
            dp1.y0 r9 = (dp1.C58417y0) r9
            android.content.Context r4 = r44.getContext()
            r5 = r10
            r10 = r4
            gy3.C87412m.m108593f(r4, r7)
            r16 = 0
            r17 = 0
            c30.g r4 = r6.f34783f
            r18 = r4
            int r4 = r6.f34816l
            r19 = r4
            int r4 = r6.f34817m
            r20 = r4
            r21 = 0
            int r22 = com.tencent.p014mm.view.TouchableLayout.f24959d
            int r23 = com.tencent.p014mm.view.TouchableLayout.f24960e
            java.lang.String r4 = r6.f34787j
            r24 = r4
            long r0 = r6.f34786i
            r25 = r0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            int r0 = r2.f34844r
            r36 = r0
            r37 = 0
            r38 = 4063232(0x3e0000, float:5.693801E-39)
            r39 = 0
            r14 = 0
            dp1.C58417y0.Ny0(r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            android.content.Context r0 = r44.getContext()
            gy3.C87412m.m108593f(r0, r7)
            bl3.r$a r0 = r5.mo62443b(r0)
            bl3.t r0 = r0.mo62449e(r3)
            rs1.t r0 = (rs1.C13448t) r0
            if (r0 == 0) goto L_0x0197
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r2.f34830d
            if (r1 == 0) goto L_0x018c
            long r40 = r1.getItemId()
        L_0x018c:
            java.lang.Long r1 = java.lang.Long.valueOf(r40)
            java.util.Map<java.lang.Long, java.lang.Boolean> r0 = r0.f38119e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.put(r1, r2)
        L_0x0197:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11888a.mo11772h(jq3.o, android.view.View, pf1.q):void");
    }

    /* renamed from: l */
    public void mo11773l(C60905o oVar, View view, C11920q qVar, C58259c.C58260a aVar) {
        C11889a aVar2;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(aVar, "event");
        super.mo11773l(oVar, view, qVar, aVar);
        int i = aVar.f166811b;
        C11889a aVar3 = null;
        boolean z = false;
        if (i == 1) {
            C11889a aVar4 = this.f34739q;
            if (aVar4 == null) {
                aVar4 = new C11889a(aVar.f166817h);
                this.f34740r = aVar4;
            }
            if (aVar4.f34746a == aVar.f166817h) {
                z = true;
            }
            if (z) {
                aVar3 = aVar4;
            }
            if (aVar3 != null) {
                aVar3.f34747b = aVar.f25941a;
            }
        } else if (i == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f34737o >= 500) {
                this.f34737o = currentTimeMillis;
                C11889a aVar5 = this.f34739q;
                if (aVar5 != null) {
                    if (aVar5.f34746a == aVar.f166817h) {
                        z = true;
                    }
                    if (z) {
                        aVar3 = aVar5;
                    }
                    if (aVar3 != null) {
                        aVar3.f34749d++;
                    }
                }
            }
        } else if (i == 3) {
            C11889a aVar6 = this.f34739q;
            if (aVar6 != null) {
                if (aVar6.f34746a == aVar.f166817h) {
                    z = true;
                }
                if (z) {
                    aVar3 = aVar6;
                }
                if (aVar3 != null) {
                    aVar3.f34750e.add(Integer.valueOf(aVar.f166815f));
                }
            }
        } else if (i == 6) {
            C11889a aVar7 = this.f34739q;
            if (aVar7 != null) {
                if (aVar7.f34746a == aVar.f166817h) {
                    z = true;
                }
                if (z) {
                    aVar3 = aVar7;
                }
                if (aVar3 != null) {
                    long j = aVar3.f34747b;
                    if (j > 0) {
                        aVar3.f34748c += aVar.f25941a - j;
                        aVar3.f34747b = 0;
                    }
                }
            }
        } else if (i == 11 && (aVar2 = this.f34739q) != null) {
            if (aVar2.f34746a == aVar.f166817h) {
                z = true;
            }
            if (z) {
                aVar3 = aVar2;
            }
            if (aVar3 != null) {
                long j2 = aVar3.f34747b;
                if (j2 > 0) {
                    aVar3.f34748c += aVar.f25941a - j2;
                    aVar3.f34747b = 0;
                }
            }
        }
    }

    /* renamed from: m */
    public void mo11774m(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
        ((ArrayList) this.f34738p).add(Integer.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [pf1.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11775r(jq3.C60905o r41, android.view.View r42, pf1.C11920q r43) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r42
            r3 = r43
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "jumpView"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "infoEx"
            gy3.C87412m.m108594g(r3, r4)
            super.mo11775r(r41, r42, r43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onClickDo feedId="
            r4.append(r5)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r3.f34830d
            r6 = 0
            if (r5 == 0) goto L_0x0032
            long r7 = r5.getItemId()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            goto L_0x0033
        L_0x0032:
            r5 = r6
        L_0x0033:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.AdHardJumperEventHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            pf1.p r4 = r3.f34832f
            boolean r5 = r4 instanceof pf1.C11916o
            if (r5 == 0) goto L_0x0048
            r6 = r4
            pf1.o r6 = (pf1.C11916o) r6
        L_0x0048:
            if (r6 != 0) goto L_0x004b
            return
        L_0x004b:
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            android.content.Context r5 = r42.getContext()
            java.lang.String r7 = "jumpView.context"
            gy3.C87412m.m108593f(r5, r7)
            rs1.s8 r5 = r4.mo12873f(r5)
            if (r5 == 0) goto L_0x0060
            int r5 = r5.f38096i
            r13 = r5
            goto L_0x0061
        L_0x0060:
            r13 = 0
        L_0x0061:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r3.f34830d
            r9 = 0
            if (r5 == 0) goto L_0x006c
            long r11 = r5.getItemId()
            goto L_0x006d
        L_0x006c:
            r11 = r9
        L_0x006d:
            r0.mo11767A(r2, r6)
            android.content.Context r5 = r42.getContext()
            gy3.C87412m.m108593f(r5, r7)
            rs1.s8 r4 = r4.mo12873f(r5)
            if (r4 == 0) goto L_0x0081
            java.lang.String r4 = r4.f38098n
            if (r4 != 0) goto L_0x0083
        L_0x0081:
            java.lang.String r4 = ""
        L_0x0083:
            bl3.r r5 = bl3.C39818r.f106831a
            android.content.Context r14 = r42.getContext()
            gy3.C87412m.m108593f(r14, r7)
            bl3.r$a r14 = r5.mo62443b(r14)
            java.lang.Class<mf1.a1> r15 = mf1.C10786a1.class
            bl3.t r14 = r14.mo62449e(r15)
            mf1.a1 r14 = (mf1.C10786a1) r14
            if (r14 == 0) goto L_0x009c
            long r9 = r14.f32261v
        L_0x009c:
            r27 = r9
            java.lang.String r9 = r0.f34795j
            java.lang.String r10 = "comment"
            boolean r14 = gy3.C87412m.m108589b(r10, r9)
            r8 = 2
            if (r14 == 0) goto L_0x00ac
            r29 = 2
            goto L_0x00ba
        L_0x00ac:
            java.lang.String r14 = "TWO_FLOW"
            boolean r9 = gy3.C87412m.m108589b(r14, r9)
            if (r9 == 0) goto L_0x00b8
            r9 = 4
            r29 = 4
            goto L_0x00ba
        L_0x00b8:
            r29 = 1
        L_0x00ba:
            int r9 = r3.f34842p
            r14 = 14
            if (r9 != r14) goto L_0x00c7
            boolean r15 = r3.f34824B
            if (r15 == 0) goto L_0x00c7
            r8 = 125(0x7d, float:1.75E-43)
            goto L_0x00ff
        L_0x00c7:
            if (r9 != r14) goto L_0x00d0
            boolean r14 = r3.f34824B
            if (r14 != 0) goto L_0x00d0
            r8 = 124(0x7c, float:1.74E-43)
            goto L_0x00ff
        L_0x00d0:
            r14 = 16
            if (r9 != r14) goto L_0x00d7
            r8 = 122(0x7a, float:1.71E-43)
            goto L_0x00ff
        L_0x00d7:
            java.lang.String r9 = r3.f34833g
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x00e2
            r8 = 118(0x76, float:1.65E-43)
            goto L_0x00ff
        L_0x00e2:
            java.lang.String r9 = r3.f34833g
            java.lang.String r10 = "timeline"
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x00fd
            mf1.f1 r9 = r3.f34823A
            if (r9 == 0) goto L_0x00f7
            int r9 = r9.f32318b
            if (r9 != r8) goto L_0x00f7
            r8 = 1
            goto L_0x00f8
        L_0x00f7:
            r8 = 0
        L_0x00f8:
            if (r8 == 0) goto L_0x00fd
            r8 = 117(0x75, float:1.64E-43)
            goto L_0x00ff
        L_0x00fd:
            r8 = 116(0x74, float:1.63E-43)
        L_0x00ff:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "clickPos"
            r9.put(r10, r8)
            android.content.Context r1 = r1.f173499A
            java.lang.String r10 = "holder.context"
            gy3.C87412m.m108593f(r1, r10)
            bl3.r$a r1 = r5.mo62443b(r1)
            java.lang.Class<rs1.t> r5 = rs1.C13448t.class
            bl3.t r1 = r1.mo62449e(r5)
            r14 = r1
            rs1.t r14 = (rs1.C13448t) r14
            if (r14 == 0) goto L_0x012b
            long r0 = r6.f34786i
            java.lang.String r17 = "onClickDo"
            r15 = r11
            r18 = r9
            r19 = r0
            r14.mo12876c3(r15, r17, r18, r19)
        L_0x012b:
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r9 = r0
            dp1.y0 r9 = (dp1.C58417y0) r9
            android.content.Context r10 = r42.getContext()
            gy3.C87412m.m108593f(r10, r7)
            r14 = 0
            r16 = 0
            r17 = 1
            c30.g r0 = r6.f34783f
            int r1 = r6.f34816l
            int r2 = r6.f34817m
            int r5 = com.tencent.p014mm.view.TouchableLayout.f24959d
            int r22 = com.tencent.p014mm.view.TouchableLayout.f24959d
            int r23 = com.tencent.p014mm.view.TouchableLayout.f24960e
            java.lang.String r5 = r6.f34787j
            long r6 = r6.f34786i
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            int r3 = r3.f34844r
            r37 = 0
            r38 = 25034752(0x17e0000, float:4.6652432E-38)
            r39 = 0
            r15 = r4
            r18 = r0
            r19 = r1
            r20 = r2
            r21 = r8
            r24 = r5
            r25 = r6
            r36 = r3
            dp1.C58417y0.Ny0(r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11888a.mo11775r(jq3.o, android.view.View, pf1.q):void");
    }

    /* renamed from: z */
    public final void mo11776z(View view, C11920q qVar, String str) {
        boolean z;
        View view2;
        int i;
        FinderItem o;
        LinkedList<C64689rq2> mediaList;
        C64689rq2 rq22;
        HashSet<Integer> hashSet;
        String str2;
        C11920q qVar2 = qVar;
        String str3 = str;
        Class cls = C13448t.class;
        if (!C87412m.m108589b(qVar2.f34833g, "timeline")) {
            return;
        }
        if (this.f34735m > 0 || this.f34736n > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("reportStopExpose source=");
            sb.append(str3);
            sb.append(" feedId=");
            BaseFinderFeed baseFinderFeed = qVar2.f34830d;
            sb.append(baseFinderFeed != null ? Long.valueOf(baseFinderFeed.getItemId()) : null);
            Log.m105924i("Finder.AdHardJumperEventHandler", sb.toString());
            C11918p pVar = qVar2.f34832f;
            C11916o oVar = pVar instanceof C11916o ? (C11916o) pVar : null;
            if (oVar != null) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = view.getContext();
                C87412m.m108593f(context, "jumpView.context");
                C13442s8 f = aVar.mo12873f(context);
                int i2 = f != null ? f.f38096i : 0;
                BaseFinderFeed baseFinderFeed2 = qVar2.f34830d;
                long itemId = baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isStartingHalfScreenActivity", this.f34745w);
                jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, str3);
                C39818r rVar = C39818r.f106831a;
                Context context2 = view.getContext();
                C87412m.m108593f(context2, "jumpView.context");
                C13448t tVar = (C13448t) rVar.mo62443b(context2).mo62449e(cls);
                if (tVar != null) {
                    tVar.mo12876c3(itemId, "reportStopExpose", jSONObject, oVar.f34786i);
                }
                if (this.f34745w) {
                    this.f34743u = true;
                    this.f34744v = true;
                    this.f34745w = false;
                    return;
                }
                BaseFinderFeed baseFinderFeed3 = qVar2.f34830d;
                Context context3 = view.getContext();
                C87412m.m108593f(context3, "jumpView.context");
                C13442s8 f2 = aVar.mo12873f(context3);
                String str4 = (f2 == null || (str2 = f2.f38098n) == null) ? "" : str2;
                Context context4 = view.getContext();
                C87412m.m108593f(context4, "jumpView.context");
                C10786a1 a1Var = (C10786a1) rVar.mo62443b(context4).mo62449e(C10786a1.class);
                long j = a1Var != null ? a1Var.f32261v : 0;
                long uptimeMillis = this.f34735m > 0 ? SystemClock.uptimeMillis() - this.f34735m : 0;
                int i3 = C87412m.m108589b(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str3) ? 2 : C87412m.m108589b("TWO_FLOW", str3) ? 4 : 1;
                C10817f1 f1Var = qVar2.f34823A;
                if (f1Var != null) {
                    z = f1Var.f32317a;
                    view2 = view;
                } else {
                    view2 = view;
                    z = false;
                }
                mo11767A(view2, oVar);
                BaseFinderFeed baseFinderFeed4 = baseFinderFeed3;
                long uptimeMillis2 = SystemClock.uptimeMillis() - this.f34736n;
                C11889a aVar2 = this.f34739q;
                int i4 = aVar2 != null ? aVar2.f34749d : 1;
                String S = (aVar2 == null || (hashSet = aVar2.f34750e) == null) ? "" : C110818d0.m150921S(hashSet, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                int i5 = (baseFinderFeed4 == null || (o = baseFinderFeed4.mo3513o()) == null || (mediaList = o.getMediaList()) == null || (rq22 = (C64689rq2) C110818d0.m150916N(mediaList)) == null) ? 0 : (int) rq22.f185238E;
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var = (C58417y0) c;
                Context context5 = view.getContext();
                C87412m.m108593f(context5, "jumpView.context");
                Iterator<T> it = this.f34741s.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    }
                    i = ((Number) it.next()).intValue();
                    if (((ArrayList) this.f34738p).contains(Integer.valueOf(i))) {
                        break;
                    }
                    View view3 = view;
                }
                C58417y0.Ny0(y0Var, context5, itemId, i2, i, str4, true, false, oVar.f34783f, oVar.f34816l, oVar.f34817m, 0, TouchableLayout.f24959d, TouchableLayout.f24960e, oVar.f34787j, oVar.f34786i, j, i3, (int) uptimeMillis, i4, (int) uptimeMillis2, i5, S, z, qVar2.f34844r, 0, TPMediaCodecProfileLevel.HEVCMainTierLevel62, (Object) null);
                this.f34735m = 0;
                this.f34736n = 0;
                this.f34739q = null;
                ((ArrayList) this.f34738p).clear();
                C39818r rVar2 = C39818r.f106831a;
                Context context6 = view.getContext();
                C87412m.m108593f(context6, "jumpView.context");
                C13448t tVar2 = (C13448t) rVar2.mo62443b(context6).mo62449e(cls);
                if (tVar2 != null) {
                    BaseFinderFeed baseFinderFeed5 = qVar2.f34830d;
                    tVar2.f38119e.put(Long.valueOf(baseFinderFeed5 != null ? baseFinderFeed5.getItemId() : 0), Boolean.TRUE);
                }
            }
        }
    }
}
