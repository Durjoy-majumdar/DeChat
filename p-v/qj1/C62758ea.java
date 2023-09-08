package qj1;

import ak1.C0074h0;
import ak1.C54067f0;
import ak1.C54116w;
import android.os.Bundle;
import android.text.TextUtils;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import d60.C58124b;
import di3.C86312j;
import dl1.C58321a;
import gi1.C59463a;
import gi1.C59464c;
import gi1.C59465f;
import gy3.C87412m;
import ik1.C33343g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ky2.C10432i;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p165hr.C60106t;
import rx3.C13604l;
import wg1.C66083t1;
import wg1.C66088u1;
import z04.C112550d0;

/* renamed from: qj1.ea */
public final class C62758ea extends C62660c {

    /* renamed from: p */
    public final C58124b f178152p;

    /* renamed from: q */
    public final ConcurrentHashMap<String, C13604l<C66083t1, C66088u1>> f178153q = new ConcurrentHashMap<>();

    /* renamed from: r */
    public FrameBubbleContentLayout f178154r;

    /* JADX WARNING: type inference failed for: r2v6, types: [android.view.ViewParent] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r2 = r2.f166287d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62758ea(android.view.ViewGroup r2, d60.C58124b r3) {
        /*
            r1 = this;
            java.lang.String r0 = "root"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "statusMonitor"
            gy3.C87412m.m108594g(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            r1.f178152p = r3
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f178153q = r2
            java.lang.Class<qj1.t9> r2 = qj1.C62993t9.class
            qj1.c r2 = r1.mo87687E0(r2)
            qj1.t9 r2 = (qj1.C62993t9) r2
            if (r2 == 0) goto L_0x002e
            android.view.ViewGroup r2 = r2.f166287d
            if (r2 == 0) goto L_0x002e
            r3 = 2131303830(0x7f091d96, float:1.8225785E38)
            android.view.View r2 = r2.findViewById(r3)
            goto L_0x002f
        L_0x002e:
            r2 = r0
        L_0x002f:
            if (r2 == 0) goto L_0x003e
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout
            if (r3 == 0) goto L_0x003c
            r0 = r2
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r0 = (com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout) r0
        L_0x003c:
            r1.f178154r = r0
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62758ea.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* renamed from: Z0 */
    public final String mo87756Z0(String str, C58321a aVar) {
        LinkedList<C59463a> linkedList;
        T t;
        C59464c value = ((C54963d0) mo87696x0(C54963d0.class)).f154077t.getValue();
        C59465f fVar = null;
        if (!(value == null || (linkedList = value.f169896a) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C59463a) t).mo84561a(), str)) {
                    break;
                }
            }
            C59463a aVar2 = (C59463a) t;
            if (aVar2 != null) {
                fVar = aVar2.f169895b;
            }
        }
        return str + '@' + aVar.ordinal() + '@' + (fVar != null ? fVar.f169901e : 1) + '@' + C61926c.m72696u(fVar != null ? fVar.f169905i : 0, 2);
    }

    /* renamed from: a1 */
    public final String mo87757a1(String str) {
        List U = C112550d0.m153785U(str, new String[]{"@"}, false, 0, 6, (Object) null);
        String str2 = U.isEmpty() ^ true ? (String) U.get(0) : "";
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: al1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: type inference failed for: r2v24, types: [wg1.k1] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002c, code lost:
        r2 = r2.f166287d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0256  */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87758b1(dl1.C58321a r35, boolean r36, java.lang.String r37) {
        /*
            r34 = this;
            r1 = r34
            r0 = r35
            r3 = r37
            java.lang.Class<cl1.d0> r15 = cl1.C54963d0.class
            java.lang.Class<cl1.u> r14 = cl1.C55001u.class
            java.lang.String r2 = "FinderLiveLuckyMoneyBubblePlugin"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "register sdkUserId:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.lang.Class<qj1.t9> r2 = qj1.C62993t9.class
            qj1.c r2 = r1.mo87687E0(r2)
            qj1.t9 r2 = (qj1.C62993t9) r2
            r29 = 0
            if (r2 == 0) goto L_0x0039
            android.view.ViewGroup r2 = r2.f166287d
            if (r2 == 0) goto L_0x0039
            r4 = 2131303830(0x7f091d96, float:1.8225785E38)
            android.view.View r2 = r2.findViewById(r4)
            r13 = r2
            goto L_0x003b
        L_0x0039:
            r13 = r29
        L_0x003b:
            java.lang.String r2 = r1.mo87756Z0(r3, r0)
            if (r13 != 0) goto L_0x0042
            return
        L_0x0042:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, rx3.l<wg1.t1, wg1.u1>> r4 = r1.f178153q
            boolean r4 = r4.containsKey(r2)
            if (r4 == 0) goto L_0x0068
            java.util.concurrent.ConcurrentHashMap<java.lang.String, rx3.l<wg1.t1, wg1.u1>> r4 = r1.f178153q
            java.lang.Object r2 = r4.get(r2)
            rx3.l r2 = (rx3.C13604l) r2
            if (r2 == 0) goto L_0x005f
            B r2 = r2.f38556e
            wg1.u1 r2 = (wg1.C66088u1) r2
            if (r2 == 0) goto L_0x005f
            android.view.View r2 = r2.mo90069e()
            goto L_0x0061
        L_0x005f:
            r2 = r29
        L_0x0061:
            boolean r2 = gy3.C87412m.m108589b(r2, r13)
            if (r2 == 0) goto L_0x0068
            return
        L_0x0068:
            androidx.lifecycle.i0 r2 = r1.mo87696x0(r14)
            cl1.u r2 = (cl1.C55001u) r2
            te3.bq2 r2 = r2.f154419p
            java.lang.String r2 = r2.f182319n
            boolean r2 = gy3.C87412m.m108589b(r3, r2)
            if (r2 == 0) goto L_0x00b8
            al1.j r30 = new al1.j
            r2 = r30
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r31 = r13
            r13 = r16
            r16 = 0
            r32 = r14
            r14 = r16
            r33 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 8388480(0x7fff80, float:1.1754764E-38)
            r28 = 0
            r0 = r3
            r3 = r37
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            r3 = r30
            r2 = r33
            goto L_0x00f9
        L_0x00b8:
            r0 = r3
            r31 = r13
            r32 = r14
            r2 = r15
            androidx.lifecycle.i0 r3 = r1.mo87696x0(r2)
            cl1.d0 r3 = (cl1.C54963d0) r3
            java.util.List<al1.j> r3 = r3.f154074q
            java.lang.String r4 = "audienceLinkMicUserList"
            gy3.C87412m.m108593f(r3, r4)
            monitor-enter(r3)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x028e }
            r4.<init>()     // Catch:{ all -> 0x028e }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x028e }
        L_0x00d5:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x028e }
            if (r6 == 0) goto L_0x00ee
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x028e }
            r7 = r6
            al1.j r7 = (al1.C54130j) r7     // Catch:{ all -> 0x028e }
            java.lang.String r7 = r7.f151997a     // Catch:{ all -> 0x028e }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r0)     // Catch:{ all -> 0x028e }
            if (r7 == 0) goto L_0x00d5
            r4.add(r6)     // Catch:{ all -> 0x028e }
            goto L_0x00d5
        L_0x00ee:
            monitor-exit(r3)
            java.lang.Object r3 = sx3.C110818d0.m150916N(r4)
            r30 = r3
            al1.j r30 = (al1.C54130j) r30
            r3 = r30
        L_0x00f9:
            java.lang.String r4 = "FinderLiveLuckyMoneyBubblePlugin"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "register bindMicUser:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            if (r3 == 0) goto L_0x028d
            wg1.v1 r12 = new wg1.v1
            fj1.b r4 = r34.mo87684A0()
            d60.b r5 = r1.f178152p
            cj1.n5 r6 = r34.mo14476D0()
            r12.<init>(r4, r5, r6, r3)
            java.lang.Class<ii1.e> r3 = ii1.C60291e.class
            qj1.c r3 = r1.mo87687E0(r3)
            ii1.e r3 = (ii1.C60291e) r3
            r4 = 0
            if (r3 == 0) goto L_0x018a
            java.lang.String r5 = "sdkUserId"
            gy3.C87412m.m108594g(r0, r5)
            li1.a r3 = r3.mo85276Z0()
            boolean r5 = r3.mo85558f()
            if (r5 != 0) goto L_0x013b
            goto L_0x018a
        L_0x013b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getLuckyMoneyRootView "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FinderLiveMicBaseRatioAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            com.tencent.mm.view.ratio.RatioLayout r5 = r3.mo85556d()
            int r5 = r5.getChildCount()
            r6 = 0
        L_0x015a:
            if (r6 >= r5) goto L_0x018a
            com.tencent.mm.view.ratio.RatioLayout r7 = r3.mo85556d()
            android.view.View r7 = r7.getChildAt(r6)
            boolean r8 = r7 instanceof si1.C63902g
            if (r8 == 0) goto L_0x016b
            si1.g r7 = (si1.C63902g) r7
            goto L_0x016d
        L_0x016b:
            r7 = r29
        L_0x016d:
            if (r7 == 0) goto L_0x0187
            al1.j r8 = r7.getCurBindLinkMicUser()
            if (r8 == 0) goto L_0x0179
            java.lang.String r8 = r8.f151997a
            if (r8 != 0) goto L_0x017b
        L_0x0179:
            java.lang.String r8 = ""
        L_0x017b:
            boolean r8 = gy3.C87412m.m108589b(r0, r8)
            if (r8 == 0) goto L_0x0187
            android.view.ViewGroup r3 = r7.getLuckyMoneyRootView()
            r13 = r3
            goto L_0x018c
        L_0x0187:
            int r6 = r6 + 1
            goto L_0x015a
        L_0x018a:
            r13 = r29
        L_0x018c:
            androidx.lifecycle.i0 r2 = r1.mo87696x0(r2)
            cl1.d0 r2 = (cl1.C54963d0) r2
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r2 = r2.f154077t
            java.lang.Object r2 = r2.getValue()
            gi1.c r2 = (gi1.C59464c) r2
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            if (r13 == 0) goto L_0x0256
            if (r2 == 0) goto L_0x0206
            int r5 = r2.f169898c
            r6 = 1
            if (r5 != r6) goto L_0x0206
            java.util.LinkedList<gi1.a> r2 = r2.f169896a
            java.util.Iterator r2 = r2.iterator()
        L_0x01ab:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x01c3
            java.lang.Object r5 = r2.next()
            r7 = r5
            gi1.a r7 = (gi1.C59463a) r7
            java.lang.String r7 = r7.mo84561a()
            boolean r7 = gy3.C87412m.m108589b(r7, r0)
            if (r7 == 0) goto L_0x01ab
            goto L_0x01c5
        L_0x01c3:
            r5 = r29
        L_0x01c5:
            gi1.a r5 = (gi1.C59463a) r5
            if (r5 == 0) goto L_0x01d4
            gi1.f r2 = r5.f169895b
            if (r2 == 0) goto L_0x01d4
            int r2 = r2.f169903g
            r7 = 2
            if (r2 != r7) goto L_0x01d4
            r2 = 1
            goto L_0x01d5
        L_0x01d4:
            r2 = 0
        L_0x01d5:
            if (r2 == 0) goto L_0x01d9
            r10 = r13
            goto L_0x01db
        L_0x01d9:
            r10 = r31
        L_0x01db:
            if (r5 == 0) goto L_0x01e6
            gi1.f r2 = r5.f169895b
            if (r2 == 0) goto L_0x01e6
            int r2 = r2.f169903g
            if (r2 != r6) goto L_0x01e6
            r4 = 1
        L_0x01e6:
            if (r4 == 0) goto L_0x01ec
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r2 = r1.f178154r
            r11 = r2
            goto L_0x01ee
        L_0x01ec:
            r11 = r29
        L_0x01ee:
            wg1.t r2 = new wg1.t
            android.view.ViewGroup r4 = r1.f166287d
            android.content.Context r4 = r4.getContext()
            gy3.C87412m.m108592e(r4, r3)
            r7 = r4
            com.tencent.mm.ui.MMActivity r7 = (com.tencent.p014mm.p136ui.MMActivity) r7
            fj1.b r9 = r34.mo87684A0()
            r6 = r2
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0270
        L_0x0206:
            r2 = r32
            androidx.lifecycle.i0 r2 = r1.mo87696x0(r2)
            cl1.u r2 = (cl1.C55001u) r2
            te3.bq2 r2 = r2.f154419p
            java.lang.String r2 = r2.f182319n
            boolean r2 = gy3.C87412m.m108589b(r0, r2)
            if (r2 == 0) goto L_0x0241
            java.lang.Class<cl1.c0> r2 = cl1.C54949c0.class
            androidx.lifecycle.i0 r2 = r1.mo87696x0(r2)
            cl1.c0 r2 = (cl1.C54949c0) r2
            boolean r2 = r2.mo75866g3()
            if (r2 != 0) goto L_0x0241
            wg1.t r2 = new wg1.t
            android.view.ViewGroup r4 = r1.f166287d
            android.content.Context r4 = r4.getContext()
            gy3.C87412m.m108592e(r4, r3)
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            fj1.b r6 = r34.mo87684A0()
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r8 = r1.f178154r
            r3 = r2
            r5 = r12
            r7 = r31
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0270
        L_0x0241:
            wg1.k1 r2 = new wg1.k1
            android.view.ViewGroup r4 = r1.f166287d
            android.content.Context r4 = r4.getContext()
            gy3.C87412m.m108592e(r4, r3)
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            fj1.b r3 = r34.mo87684A0()
            r2.<init>(r4, r12, r3, r13)
            goto L_0x0270
        L_0x0256:
            wg1.t r2 = new wg1.t
            android.view.ViewGroup r4 = r1.f166287d
            android.content.Context r4 = r4.getContext()
            gy3.C87412m.m108592e(r4, r3)
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            fj1.b r6 = r34.mo87684A0()
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r8 = r1.f178154r
            r3 = r2
            r5 = r12
            r7 = r31
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x0270:
            java.lang.String r3 = "Finder.FinderLiveLuckyMoneyBubblePresenter"
            java.lang.String r4 = "onAttach"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r12.f189997h = r2
            r2.mo90067a()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, rx3.l<wg1.t1, wg1.u1>> r3 = r1.f178153q
            r4 = r0
            r0 = r35
            java.lang.String r0 = r1.mo87756Z0(r4, r0)
            rx3.l r4 = new rx3.l
            r4.<init>(r12, r2)
            r3.put(r0, r4)
        L_0x028d:
            return
        L_0x028e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62758ea.mo87758b1(dl1.a, boolean, java.lang.String):void");
    }

    /* renamed from: c1 */
    public final void mo87759c1(String str) {
        C87412m.m108594g(str, "key");
        Log.m105924i("FinderLiveLuckyMoneyBubblePlugin", "unregister sdkUserId:" + str);
        C13604l lVar = this.f178153q.get(str);
        if (lVar != null) {
            ((C66083t1) lVar.f38555d).onDetach();
            ((C66088u1) lVar.f38556e).release();
            this.f178153q.remove(str);
        }
    }

    /* renamed from: d1 */
    public final void mo87760d1() {
        boolean z = false;
        String str = "";
        boolean z2 = false;
        for (Map.Entry next : this.f178153q.entrySet()) {
            if (((C66083t1) ((C13604l) next.getValue()).f38555d).mo90135d()) {
                String F0 = ((C66083t1) ((C13604l) next.getValue()).f38555d).mo90133F0();
                str = F0 == null ? "" : F0;
                z2 = true;
            }
        }
        char c = 8;
        if (z2) {
            mo10792g(0);
        } else {
            mo10792g(8);
        }
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        C0074h0 h0Var = TextUtils.isEmpty(str) ? C0074h0.ANCHOR : C0074h0.LINKMIC_VISITOR;
        if (z2) {
            c = 0;
        }
        wVar.getClass();
        if (!C62042e.f176370a.mo87027N0()) {
            if (!wVar.f151944h1 && c == 0) {
                Log.m105928w("HABBYGE-MALI.HellLiveVisitorReoprter", "doReportRedPacket, type=" + 1 + ", src" + h0Var.f453d);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, h0Var.f453d);
                C54116w.Ex0(wVar, C54067f0.C54076o0.RED_PACKET, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            }
            if (c == 0) {
                z = true;
            }
            wVar.f151944h1 = z;
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w("FinderLiveLuckyMoneyBubblePlugin", "setVisible return for isTeenMode");
            return;
        }
        super.mo10792g(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01dd A[SYNTHETIC] */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11992m0(java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r15) {
        /*
            r14 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.Class<cl1.c0> r1 = cl1.C54949c0.class
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            java.lang.String r3 = "micUserMap"
            gy3.C87412m.m108594g(r15, r3)
            java.lang.String r3 = "FinderLiveLuckyMoneyBubblePlugin"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onMicUserChanged: luckyMicMap.size:"
            r4.append(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, rx3.l<wg1.t1, wg1.u1>> r5 = r14.f178153q
            int r5 = r5.size()
            r4.append(r5)
            java.lang.String r5 = ", audienceLinkMicUserList.size:"
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r14.mo87696x0(r2)
            cl1.d0 r5 = (cl1.C54963d0) r5
            java.util.List<al1.j> r5 = r5.f154074q
            int r5 = r5.size()
            r4.append(r5)
            java.lang.String r5 = ", micUserMap:"
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            androidx.lifecycle.i0 r3 = r14.mo87696x0(r1)
            cl1.c0 r3 = (cl1.C54949c0) r3
            dl1.a r3 = r3.f153997g
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, rx3.l<wg1.t1, wg1.u1>> r5 = r14.f178153q
            monitor-enter(r5)
            java.util.Set r6 = r5.entrySet()     // Catch:{ all -> 0x01e8 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x01e8 }
        L_0x005b:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x01e8 }
            if (r7 == 0) goto L_0x00b1
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x01e8 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x01e8 }
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x01e8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e8 }
            java.lang.String r8 = r14.mo87757a1(r8)     // Catch:{ all -> 0x01e8 }
            androidx.lifecycle.i0 r9 = r14.mo87696x0(r0)     // Catch:{ all -> 0x01e8 }
            cl1.u r9 = (cl1.C55001u) r9     // Catch:{ all -> 0x01e8 }
            te3.bq2 r9 = r9.f154419p     // Catch:{ all -> 0x01e8 }
            java.lang.String r9 = r9.f182319n     // Catch:{ all -> 0x01e8 }
            boolean r9 = gy3.C87412m.m108589b(r8, r9)     // Catch:{ all -> 0x01e8 }
            if (r9 != 0) goto L_0x005b
            boolean r9 = r15.containsKey(r8)     // Catch:{ all -> 0x01e8 }
            if (r9 != 0) goto L_0x005b
            java.lang.String r9 = "FinderLiveLuckyMoneyBubblePlugin"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e8 }
            r10.<init>()     // Catch:{ all -> 0x01e8 }
            java.lang.String r11 = "old mic "
            r10.append(r11)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r11 = r7.getValue()     // Catch:{ all -> 0x01e8 }
            r10.append(r11)     // Catch:{ all -> 0x01e8 }
            java.lang.String r11 = " removed, sdkUserID:"
            r10.append(r11)     // Catch:{ all -> 0x01e8 }
            r10.append(r8)     // Catch:{ all -> 0x01e8 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x01e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r7 = r7.getKey()     // Catch:{ all -> 0x01e8 }
            r4.add(r7)     // Catch:{ all -> 0x01e8 }
            goto L_0x005b
        L_0x00b1:
            monitor-exit(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x00b6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00c6
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r14.mo87759c1(r5)
            goto L_0x00b6
        L_0x00c6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r5 = r15.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x00d3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x014b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, rx3.l<wg1.t1, wg1.u1>> r7 = r14.f178153q
            monitor-enter(r7)
            java.util.Set r8 = r7.entrySet()     // Catch:{ all -> 0x0148 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0148 }
        L_0x00f0:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0148 }
            if (r9 == 0) goto L_0x0146
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0148 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x0148 }
            java.lang.Object r10 = r9.getKey()     // Catch:{ all -> 0x0148 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0148 }
            java.lang.String r10 = r14.mo87757a1(r10)     // Catch:{ all -> 0x0148 }
            java.lang.String r11 = "FinderLiveLuckyMoneyBubblePlugin"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            r12.<init>()     // Catch:{ all -> 0x0148 }
            java.lang.String r13 = "micModeChangeRemove oldLuckyMicKey: "
            r12.append(r13)     // Catch:{ all -> 0x0148 }
            java.lang.Object r13 = r9.getKey()     // Catch:{ all -> 0x0148 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0148 }
            r12.append(r13)     // Catch:{ all -> 0x0148 }
            java.lang.String r13 = " micUserId: "
            r12.append(r13)     // Catch:{ all -> 0x0148 }
            r12.append(r10)     // Catch:{ all -> 0x0148 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0148 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)     // Catch:{ all -> 0x0148 }
            boolean r10 = gy3.C87412m.m108589b(r6, r10)     // Catch:{ all -> 0x0148 }
            if (r10 == 0) goto L_0x00f0
            java.lang.String r10 = r14.mo87756Z0(r6, r3)     // Catch:{ all -> 0x0148 }
            java.lang.Object r11 = r9.getKey()     // Catch:{ all -> 0x0148 }
            boolean r10 = gy3.C87412m.m108589b(r11, r10)     // Catch:{ all -> 0x0148 }
            if (r10 != 0) goto L_0x00f0
            java.lang.Object r9 = r9.getKey()     // Catch:{ all -> 0x0148 }
            r4.add(r9)     // Catch:{ all -> 0x0148 }
            goto L_0x00f0
        L_0x0146:
            monitor-exit(r7)
            goto L_0x00d3
        L_0x0148:
            r15 = move-exception
            monitor-exit(r7)
            throw r15
        L_0x014b:
            java.util.Iterator r4 = r4.iterator()
        L_0x014f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x015f
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r14.mo87759c1(r5)
            goto L_0x014f
        L_0x015f:
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0167:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x01e7
            java.lang.Object r4 = r15.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            androidx.lifecycle.i0 r5 = r14.mo87696x0(r2)
            cl1.d0 r5 = (cl1.C54963d0) r5
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r5 = r5.f154077t
            java.lang.Object r5 = r5.getValue()
            gi1.c r5 = (gi1.C59464c) r5
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x01c1
            int r8 = r5.f169898c
            if (r8 != r7) goto L_0x01c1
            java.util.LinkedList<gi1.a> r5 = r5.f169896a
            java.util.Iterator r5 = r5.iterator()
        L_0x018f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01b1
            java.lang.Object r8 = r5.next()
            r9 = r8
            gi1.a r9 = (gi1.C59463a) r9
            java.lang.String r9 = r9.mo84561a()
            androidx.lifecycle.i0 r10 = r14.mo87696x0(r0)
            cl1.u r10 = (cl1.C55001u) r10
            te3.bq2 r10 = r10.f154419p
            java.lang.String r10 = r10.f182319n
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x018f
            goto L_0x01b2
        L_0x01b1:
            r8 = 0
        L_0x01b2:
            gi1.a r8 = (gi1.C59463a) r8
            if (r8 == 0) goto L_0x01c1
            gi1.f r5 = r8.f169895b
            if (r5 == 0) goto L_0x01c1
            int r5 = r5.f169903g
            r8 = 2
            if (r5 != r8) goto L_0x01c1
            r5 = 1
            goto L_0x01c2
        L_0x01c1:
            r5 = 0
        L_0x01c2:
            if (r5 != 0) goto L_0x01dc
            androidx.lifecycle.i0 r5 = r14.mo87696x0(r2)
            cl1.d0 r5 = (cl1.C54963d0) r5
            boolean r5 = r5.mo75912T3()
            if (r5 != 0) goto L_0x01dc
            androidx.lifecycle.i0 r5 = r14.mo87696x0(r1)
            cl1.c0 r5 = (cl1.C54949c0) r5
            boolean r5 = r5.mo75866g3()
            if (r5 == 0) goto L_0x01dd
        L_0x01dc:
            r6 = 1
        L_0x01dd:
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r14.mo87758b1(r3, r6, r4)
            goto L_0x0167
        L_0x01e7:
            return
        L_0x01e8:
            r15 = move-exception
            monitor-exit(r5)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62758ea.mo11992m0(java.util.LinkedHashMap):void");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        String string;
        Class cls = C55001u.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        String str = "";
        if (ordinal == 7) {
            C58321a aVar = C58321a.NORMAL_4_MODE;
            String str2 = ((C55001u) mo87696x0(cls)).f154419p.f182319n;
            if (str2 != null) {
                str = str2;
            }
            mo87758b1(aVar, false, str);
        } else if (ordinal == 27) {
            long j = ((C55001u) mo87696x0(cls)).f154420q.f182392d;
            C33343g Ax0 = ((C60106t) C86312j.m106911c(C60106t.class)).Ax0();
            Ax0.getClass();
            Log.m105924i("Finder.FinderLiveLuckyMoneyStorage", "clearCache liveId:" + j);
            Ax0.f90384f.clear();
            ISQLiteDatabase iSQLiteDatabase = Ax0.f90383e;
            iSQLiteDatabase.delete("FinderLiveLuckyMoneyInfo", "liveId=?", new String[]{str + C61926c.m72691p(j)});
        } else if (ordinal == 162 && bundle != null && (string = bundle.getString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID")) != null) {
            for (Map.Entry<String, C13604l<C66083t1, C66088u1>> value : this.f178153q.entrySet()) {
                ((C66083t1) ((C13604l) value.getValue()).f38555d).mo90132D(string);
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C13604l<C66083t1, C66088u1>> concurrentHashMap = this.f178153q;
        synchronized (concurrentHashMap) {
            for (Map.Entry<String, C13604l<C66083t1, C66088u1>> key : concurrentHashMap.entrySet()) {
                arrayList.add(key.getKey());
            }
        }
        for (String c1 : arrayList) {
            mo87759c1(c1);
        }
    }
}
