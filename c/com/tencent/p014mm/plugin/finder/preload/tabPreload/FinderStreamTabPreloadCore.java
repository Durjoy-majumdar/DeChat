package com.tencent.p014mm.plugin.finder.preload.tabPreload;

import androidx.lifecycle.C0120a0;
import bl3.C0327w;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import do1.C58337e;
import do1.C58338f;
import do1.C58339g;
import do1.C58341h;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.Iterator;
import java.util.List;
import os1.C11739f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C64777vl1;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore */
public final class FinderStreamTabPreloadCore extends C0327w<FinderCommonFeatureService> implements C0120a0<C2479n0.C2480a> {

    /* renamed from: e */
    public final List<C58341h> f160333e = C64197v.m75537f(new C58339g(this), new C58337e(this), new C58338f(this));

    /* renamed from: f */
    public final C13601g f160334f = C36568h.m40985a(C56188a.f160337d);

    /* renamed from: g */
    public final FinderStreamTabPreloadCore$mainUiIndexChangeListener$1 f160335g = new FinderStreamTabPreloadCore$mainUiIndexChangeListener$1(this, C40008f.f107254d);

    /* renamed from: h */
    public int f160336h = -1;

    /* renamed from: com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore$a */
    public static final class C56188a extends C87413o implements C32224a<C11739f> {

        /* renamed from: d */
        public static final C56188a f160337d = new C56188a();

        public C56188a() {
            super(0);
        }

        public Object invoke() {
            return (C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo78454c3(int r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r8 == r0) goto L_0x008d
            r0 = 2
            if (r8 == r0) goto L_0x0065
            r0 = 3
            if (r8 == r0) goto L_0x003d
            r0 = 4
            if (r8 == r0) goto L_0x0013
            r3 = r1
            goto L_0x00b8
        L_0x0013:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99194I2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x0035
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x00ad
        L_0x0035:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185927G
            goto L_0x00b5
        L_0x003d:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99176G2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x005e
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x00ad
        L_0x005e:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185925E
            goto L_0x00b5
        L_0x0065:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99203J2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x0086
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x00ad
        L_0x0086:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185928H
            goto L_0x00b5
        L_0x008d:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99185H2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x00af
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L_0x00ad:
            long r3 = (long) r0
            goto L_0x00b8
        L_0x00af:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185926F
        L_0x00b5:
            long r5 = (long) r0
            long r3 = r3 * r5
        L_0x00b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "[getCacheValidTime] tabType="
            r0.append(r5)
            r0.append(r8)
            java.lang.String r8 = " time="
            r0.append(r8)
            r0.append(r3)
            java.lang.String r8 = "ms "
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "Finder.StreamTabPreloadCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x00e4
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00e4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.mo78454c3(int):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x019c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019d A[RETURN] */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo78455d3(int r8, boolean r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r8 == r0) goto L_0x0116
            r0 = 2
            if (r8 == r0) goto L_0x00c2
            r0 = 3
            if (r8 == r0) goto L_0x006c
            r0 = 4
            if (r8 == r0) goto L_0x0016
            r3 = r1
            goto L_0x016b
        L_0x0016:
            if (r9 != 0) goto L_0x0042
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99574z2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x003a
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0160
        L_0x003a:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185950u
            goto L_0x0168
        L_0x0042:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99536v2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x0064
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0160
        L_0x0064:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185946q
            goto L_0x0168
        L_0x006c:
            if (r9 != 0) goto L_0x0098
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99555x2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x0090
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0160
        L_0x0090:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185948s
            goto L_0x0168
        L_0x0098:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99518t2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x00ba
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0160
        L_0x00ba:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185944o
            goto L_0x0168
        L_0x00c2:
            if (r9 != 0) goto L_0x00ee
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99122A2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x00e6
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0160
        L_0x00e6:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185951v
            goto L_0x0168
        L_0x00ee:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99545w2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x010f
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0160
        L_0x010f:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185947r
            goto L_0x0168
        L_0x0116:
            if (r9 != 0) goto L_0x0140
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99565y2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x0139
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0160
        L_0x0139:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185949t
            goto L_0x0168
        L_0x0140:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99527u2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x0162
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L_0x0160:
            long r3 = (long) r0
            goto L_0x016b
        L_0x0162:
            te3.vl1 r0 = r7.mo78458g3()
            int r0 = r0.f185945p
        L_0x0168:
            long r5 = (long) r0
            long r3 = r3 * r5
        L_0x016b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "[getInnerTime] tabType="
            r0.append(r5)
            r0.append(r8)
            java.lang.String r8 = " withRedDot="
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = " time="
            r0.append(r8)
            r0.append(r3)
            r8 = 115(0x73, float:1.61E-43)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "Finder.StreamTabPreloadCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x019d
            return r1
        L_0x019d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.mo78455d3(int, boolean):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo78456e3(int r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "ms "
            r1 = 0
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = "Finder.StreamTabPreloadCore"
            if (r14 == 0) goto L_0x0116
            r6 = 1
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r13 == r6) goto L_0x008d
            r6 = 2
            if (r13 == r6) goto L_0x0068
            r6 = 3
            if (r13 == r6) goto L_0x0043
            r6 = 4
            if (r13 == r6) goto L_0x001e
            r6 = r1
            goto L_0x00b5
        L_0x001e:
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99158E2
            java.lang.Object r9 = r6.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < 0) goto L_0x003c
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L_0x00aa
        L_0x003c:
            te3.vl1 r6 = r12.mo78458g3()
            int r6 = r6.f185923C
            goto L_0x00b2
        L_0x0043:
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99140C2
            java.lang.Object r9 = r6.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < 0) goto L_0x0061
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L_0x00aa
        L_0x0061:
            te3.vl1 r6 = r12.mo78458g3()
            int r6 = r6.f185921A
            goto L_0x00b2
        L_0x0068:
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99167F2
            java.lang.Object r9 = r6.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < 0) goto L_0x0086
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L_0x00aa
        L_0x0086:
            te3.vl1 r6 = r12.mo78458g3()
            int r6 = r6.f185924D
            goto L_0x00b2
        L_0x008d:
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99149D2
            java.lang.Object r9 = r6.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < 0) goto L_0x00ac
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
        L_0x00aa:
            long r6 = (long) r6
            goto L_0x00b5
        L_0x00ac:
            te3.vl1 r6 = r12.mo78458g3()
            int r6 = r6.f185922B
        L_0x00b2:
            long r9 = (long) r6
            long r6 = r9 * r7
        L_0x00b5:
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f1
            if (r15 == 0) goto L_0x00f1
            long r8 = r12.mo78454c3(r13)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "getNewRedDotPreloadInterval: get cache valid time, tabType="
            r10.append(r11)
            r10.append(r13)
            java.lang.String r11 = " prefetchInterval="
            r10.append(r11)
            r10.append(r6)
            java.lang.String r11 = "ms cacheValidTime="
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = "ms"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f1
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f1
            r6 = r8
        L_0x00f1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getNewRedDotPreloadInterval: tabType="
            r8.append(r9)
            r8.append(r13)
            java.lang.String r9 = " time="
            r8.append(r9)
            r8.append(r6)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x011a
            r6 = r3
            goto L_0x011a
        L_0x0116:
            long r6 = r12.mo78460j3(r13, r15)
        L_0x011a:
            if (r14 == 0) goto L_0x0138
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0138
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getOutsideIntervalTime: redDotInterval is 0, tabType="
            r6.append(r7)
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            long r6 = r12.mo78460j3(r13, r15)
        L_0x0138:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getOutsideIntervalTime: tabType="
            r8.append(r9)
            r8.append(r13)
            java.lang.String r13 = " isRedDotPreload="
            r8.append(r13)
            r8.append(r14)
            java.lang.String r13 = " hasCache = "
            r8.append(r13)
            r8.append(r15)
            java.lang.String r13 = ", time="
            r8.append(r13)
            r8.append(r6)
            r8.append(r0)
            java.lang.String r13 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            int r13 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r13 > 0) goto L_0x016c
            return r3
        L_0x016c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.mo78456e3(int, boolean, boolean):long");
    }

    /* renamed from: f3 */
    public final C58341h mo78457f3(int i) {
        T t;
        boolean z;
        Iterator<T> it = this.f160333e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C58341h) t).f167025a == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C58341h) t;
    }

    /* renamed from: g3 */
    public final C64777vl1 mo78458g3() {
        C64777vl1 vl12 = new C64777vl1();
        try {
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC, "");
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            vl12.parseFrom(Util.decodeHexString((String) f));
            C37521f.f99374d.getClass();
            if (C37521f.f99523t7.mo60266n().intValue() > 0) {
                vl12.f185933M = true;
                vl12.f185934N = 30;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.StreamTabPreloadCore", e, "", new Object[0]);
        }
        return vl12;
    }

    /* renamed from: i3 */
    public final int mo78459i3() {
        return ((C11739f) ((C36570n) this.f160334f).getValue()).mo11602e3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x011b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo78460j3(int r9, boolean r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = 0
            if (r9 == r0) goto L_0x008d
            r0 = 2
            if (r9 == r0) goto L_0x0065
            r0 = 3
            if (r9 == r0) goto L_0x003d
            r0 = 4
            if (r9 == r0) goto L_0x0013
            r0 = r3
            goto L_0x00b8
        L_0x0013:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99500r2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x0035
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x00ad
        L_0x0035:
            te3.vl1 r0 = r8.mo78458g3()
            int r0 = r0.f185942j
            goto L_0x00b5
        L_0x003d:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99482p2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x005e
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x00ad
        L_0x005e:
            te3.vl1 r0 = r8.mo78458g3()
            int r0 = r0.f185940h
            goto L_0x00b5
        L_0x0065:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99509s2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x0086
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x00ad
        L_0x0086:
            te3.vl1 r0 = r8.mo78458g3()
            int r0 = r0.f185943n
            goto L_0x00b5
        L_0x008d:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99491q2
            java.lang.Object r6 = r5.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x00af
            r0.getClass()
            java.lang.Object r0 = r5.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L_0x00ad:
            long r0 = (long) r0
            goto L_0x00b8
        L_0x00af:
            te3.vl1 r0 = r8.mo78458g3()
            int r0 = r0.f185941i
        L_0x00b5:
            long r5 = (long) r0
            long r0 = r5 * r1
        L_0x00b8:
            java.lang.String r2 = "Finder.StreamTabPreloadCore"
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f6
            if (r10 == 0) goto L_0x00f6
            long r5 = r8.mo78454c3(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = "getTimeOutPreloadInterval: get cache valid time, tabType="
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = " prefetchInterval="
            r10.append(r7)
            r10.append(r0)
            java.lang.String r7 = "ms cacheValidTime="
            r10.append(r7)
            r10.append(r5)
            java.lang.String r7 = "ms"
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f6
            int r10 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f6
            r0 = r5
        L_0x00f6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r5 = "getTimeOutPreloadInterval: tabType="
            r10.append(r5)
            r10.append(r9)
            java.lang.String r9 = " originInterval="
            r10.append(r9)
            r10.append(r0)
            java.lang.String r9 = "ms "
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0120
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0120:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.mo78460j3(int, boolean):long");
    }

    /* renamed from: k3 */
    public final boolean mo78461k3(C58341h.C58344f fVar) {
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        if (!((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76873sF()) {
            Log.m105924i("Finder.StreamTabPreloadCore", "finder entry close then return");
            return false;
        } else if (fVar == C58341h.C58344f.EnterLoad) {
            C37521f.f99374d.getClass();
            return C37521f.f99520t4.mo60266n().intValue() == 1;
        } else {
            if ((C75592q0.m90781k() & 34359738368L) != 0) {
                Log.m105924i("Finder.StreamTabPreloadCore", "finder find more ui entry close then return");
                return false;
            }
            C37521f.f99374d.getClass();
            boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_preload_tab_refresh_enable, 1) == 1;
            Log.m105924i("FinderConfig", "[GET] isEnablePreloadStreamRefresh=" + z);
            if (z) {
                return true;
            }
            Log.m105924i("Finder.StreamTabPreloadCore", "isEnablePreloadStreamRefresh false then return");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78462l3(com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 r13, boolean r14) {
        /*
            r12 = this;
            java.lang.String r0 = "ctrInfo"
            gy3.C87412m.m108594g(r13, r0)
            te3.xi1 r13 = r13.field_ctrInfo
            int r13 = r13.f144670e
            r0 = 7
            r1 = 0
            r2 = 1
            if (r13 == r0) goto L_0x0026
            r0 = 8
            if (r13 == r0) goto L_0x0024
            r0 = 17
            if (r13 == r0) goto L_0x0026
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r13 == r0) goto L_0x0022
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r13 == r0) goto L_0x0020
            r13 = 0
            goto L_0x0027
        L_0x0020:
            r13 = 4
            goto L_0x0027
        L_0x0022:
            r13 = 2
            goto L_0x0027
        L_0x0024:
            r13 = 3
            goto L_0x0027
        L_0x0026:
            r13 = 1
        L_0x0027:
            do1.h r0 = r12.mo78457f3(r13)
            if (r0 == 0) goto L_0x0043
            if (r14 == 0) goto L_0x0036
            boolean r14 = r0.f167028d
            if (r14 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r14 = 0
            goto L_0x0037
        L_0x0036:
            r14 = 1
        L_0x0037:
            if (r14 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r0 == 0) goto L_0x0043
            java.lang.String r14 = "RedDotRevoke"
            boolean r1 = r0.mo83089e(r2, r14)
        L_0x0043:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "[onRedDotRevoke] tabType="
            r14.append(r0)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "Finder.StreamTabPreloadCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            if (r1 == 0) goto L_0x006a
            do1.b r2 = do1.C58332b.f167018a
            r3 = 0
            r4 = 0
            r5 = 3
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 115(0x73, float:1.61E-43)
            r11 = 0
            do1.C58332b.m67542a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.mo78462l3(com.tencent.mm.plugin.finder.extension.reddot.s0, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(java.lang.Object r27) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            com.tencent.mm.plugin.finder.extension.reddot.n0$a r0 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.C2480a) r0
            if (r0 != 0) goto L_0x000a
            goto L_0x021e
        L_0x000a:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r0 = r0.f12910c
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.field_tipsId
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = ""
        L_0x0016:
            int r2 = r26.mo78459i3()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[onChanged] currentTipsId="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " lastTargetEnterTabType="
            r3.append(r4)
            int r4 = r1.f160336h
            r3.append(r4)
            java.lang.String r4 = " targetEnterTabType="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.StreamTabPreloadCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.util.List<do1.h> r3 = r1.f160333e
            java.util.Iterator r3 = r3.iterator()
        L_0x0048:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x021c
            java.lang.Object r4 = r3.next()
            do1.h r4 = (do1.C58341h) r4
            int r5 = r1.f160336h
            r4.getClass()
            java.lang.Class<tf0.p1> r6 = tf0.C64916p1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            tf0.p1 r6 = (tf0.C64916p1) r6
            boolean r6 = r6.mo59665N()
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r7 = r4.f167026b
            int r8 = r4.f167025a
            rx3.g r7 = r7.f160334f
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            os1.f r7 = (os1.C11739f) r7
            boolean r7 = r7.mo11603f3(r8)
            if (r6 == 0) goto L_0x0082
            java.lang.String r4 = r4.f167027c
            java.lang.String r5 = "[performChangeEnterTargetTab] it is in finder now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            goto L_0x0214
        L_0x0082:
            do1.a r6 = r4.f167029e
            java.lang.String r8 = "performChangeEnterTargetTab"
            r6.mo83080c(r8)
            int r6 = r4.f167025a
            if (r6 != r2) goto L_0x0214
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r6 = r4.mo83092i()
            java.lang.String r8 = "FinderEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r6 = r6.mo77227G5(r8)
            r8 = 0
            if (r6 == 0) goto L_0x00a1
            te3.yi1 r9 = r6.f158585F
            if (r9 == 0) goto L_0x00a1
            int r9 = r9.f186541C
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            r10 = 1
            if (r9 == r10) goto L_0x00a9
            if (r6 == 0) goto L_0x00a9
            r11 = 1
            goto L_0x00aa
        L_0x00a9:
            r11 = 0
        L_0x00aa:
            r12 = 0
            if (r6 != 0) goto L_0x00c1
            do1.h$a r6 = r4.f167040p
            do1.h$d r6 = r6.f167046d
            if (r6 == 0) goto L_0x00c1
            long r14 = r6.f167055a
            int r6 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x00bc
            r6 = 1
            goto L_0x00bd
        L_0x00bc:
            r6 = 0
        L_0x00bd:
            if (r6 != 0) goto L_0x00c1
            r6 = 1
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            if (r11 != 0) goto L_0x00c9
            if (r6 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r14 = 0
            goto L_0x00ca
        L_0x00c9:
            r14 = 1
        L_0x00ca:
            r15 = 2
            if (r9 != r15) goto L_0x00ce
            r8 = 1
        L_0x00ce:
            if (r14 == 0) goto L_0x0117
            java.util.concurrent.locks.ReentrantLock r15 = r4.f167038n
            r15.lock()
            je1.n1 r15 = r4.f167041q     // Catch:{ all -> 0x0110 }
            if (r15 == 0) goto L_0x00dc
            r15.mo10079a()     // Catch:{ all -> 0x0110 }
        L_0x00dc:
            java.util.concurrent.locks.ReentrantLock r15 = r4.f167038n
            r15.unlock()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "newRedDotStatus="
            r15.append(r12)
            r15.append(r9)
            java.lang.String r12 = r15.toString()
            boolean r10 = r4.mo83089e(r10, r12)
            if (r10 == 0) goto L_0x0117
            do1.b r16 = do1.C58332b.f167018a
            r17 = 3
            r18 = 3
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 124(0x7c, float:1.74E-43)
            r25 = 0
            do1.C58332b.m67542a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0117
        L_0x0110:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = r4.f167038n
            r2.unlock()
            throw r0
        L_0x0117:
            long r12 = r4.mo83090f()
            boolean r10 = r4.mo83095m()
            if (r10 == 0) goto L_0x012c
            java.util.concurrent.atomic.AtomicBoolean r10 = r4.f167032h
            boolean r10 = r10.get()
            if (r10 != 0) goto L_0x012c
            do1.a$a r10 = do1.C58329a.C58330a.WxForeground
            goto L_0x012e
        L_0x012c:
            do1.a$a r10 = do1.C58329a.C58330a.Normal
        L_0x012e:
            java.lang.String r15 = r4.f167027c
            r27 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "performChangeEnterTargetTab: isNeedClear="
            r3.append(r1)
            r3.append(r14)
            java.lang.String r1 = ", isRedDotChangeClear="
            r3.append(r1)
            r3.append(r11)
            java.lang.String r1 = ", isRedDotDisposeClear="
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = ", tipsId="
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = ", refreshPrefetchStatus="
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = ", interval="
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = ", lastTab="
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = ", isWithoutConsumeQuota="
            r3.append(r1)
            r3.append(r8)
            java.lang.String r1 = ", isEnableScene="
            r3.append(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f167031g
            r3.append(r1)
            java.lang.String r1 = ", isBackground="
            r3.append(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f167030f
            boolean r1 = r1.get()
            r3.append(r1)
            java.lang.String r1 = ", triggerSource="
            r3.append(r1)
            r3.append(r10)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            if (r7 != 0) goto L_0x01a9
            java.lang.String r1 = r4.f167027c
            java.lang.String r3 = "[performChangeEnterTargetTab] it is not auto refresh!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
            goto L_0x0216
        L_0x01a9:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f167031g
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x01ba
            java.lang.String r1 = r4.f167027c
            java.lang.String r3 = "[performChangeEnterTargetTab] it is not enable scene!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
            goto L_0x0216
        L_0x01ba:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f167030f
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x01ca
            java.lang.String r1 = r4.f167027c
            java.lang.String r3 = "[performChangeEnterTargetTab] it is in background!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
            goto L_0x0216
        L_0x01ca:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x01d4
            goto L_0x0216
        L_0x01d4:
            r5 = 0
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ea
            if (r8 == 0) goto L_0x01dd
            goto L_0x01ea
        L_0x01dd:
            do1.a r1 = r4.f167029e
            do1.h$j r5 = r4.f167036l
            java.lang.String r8 = "performChangeEnterTargetTab"
            r4 = r1
            r6 = r12
            r9 = r10
            r4.mo83079a(r5, r6, r8, r9)
            goto L_0x0216
        L_0x01ea:
            do1.h$f r5 = r4.mo83091h()
            r5.f167071e = r9
            do1.a r5 = r4.f167029e
            do1.h$j r6 = r4.f167036l
            r18 = 0
            java.lang.String r20 = "performChangeEnterTargetTab"
            r16 = r5
            r17 = r6
            r21 = r10
            r16.mo83079a(r17, r18, r20, r21)
            if (r8 == 0) goto L_0x0216
            if (r3 <= 0) goto L_0x0216
            if (r1 == 0) goto L_0x0216
            do1.a r1 = r4.f167029e
            do1.h$j r5 = r4.f167036l
            java.lang.String r8 = "performChangeEnterTargetTab"
            r4 = r1
            r6 = r12
            r9 = r10
            r4.mo83079a(r5, r6, r8, r9)
            goto L_0x0216
        L_0x0214:
            r27 = r3
        L_0x0216:
            r1 = r26
            r3 = r27
            goto L_0x0048
        L_0x021c:
            r1.f160336h = r2
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.onChanged(java.lang.Object):void");
    }
}
