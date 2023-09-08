package wg1;

import ak1.C0074h0;
import ak1.C54090i0;
import ak1.C54116w;
import al1.C54130j;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.plugin.finder.live.component.LuckyMoneyResultReceiev;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ig1.C33319f;
import ik1.C33343g;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import o40.C61926c;
import og1.C62008a;
import p165hr.C60106t;
import p185kq.C10383h;
import p185kq.C61130g;
import p204mr.C61568m;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49372f31;
import te3.C51790w61;
import te3.C64273c21;

/* renamed from: wg1.v1 */
public final class C66093v1 implements C66083t1 {

    /* renamed from: n */
    public static final C38125a f189992n = new C38125a((C8480h) null);

    /* renamed from: d */
    public final C45795b f189993d;

    /* renamed from: e */
    public final C58124b f189994e;

    /* renamed from: f */
    public final C54795n5 f189995f;

    /* renamed from: g */
    public final C54130j f189996g;

    /* renamed from: h */
    public C66088u1 f189997h;

    /* renamed from: i */
    public final ConcurrentLinkedDeque<C66094b> f189998i = new ConcurrentLinkedDeque<>();

    /* renamed from: j */
    public LuckyMoneyResultReceiev f189999j;

    /* renamed from: wg1.v1$a */
    public static final class C38125a {
        public C38125a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo61526a(long j) {
            C33319f fVar;
            C33343g Ax0 = ((C60106t) C86312j.m106911c(C60106t.class)).Ax0();
            Ax0.getClass();
            Log.m105924i("Finder.FinderLiveLuckyMoneyStorage", "initCache: liveId:" + j);
            byte[] bArr = null;
            Cursor rawQuery = Ax0.f90383e.rawQuery("SELECT * FROM FinderLiveLuckyMoneyInfo where FinderLiveLuckyMoneyInfo.liveId=" + C61926c.m72691p(j), (String[]) null, 2);
            if (rawQuery.moveToNext()) {
                fVar = new C33319f();
                fVar.convertFrom(rawQuery);
            } else {
                fVar = null;
            }
            C49372f31 f312 = new C49372f31();
            if (fVar != null) {
                bArr = fVar.field_luckyMoneyData;
            }
            if (bArr != null) {
                try {
                    f312.parseFrom(bArr);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            Set synchronizedSet = Collections.synchronizedSet(new HashSet());
            LinkedList<String> linkedList = f312.f133263e;
            C87412m.m108593f(linkedList, "luckyMoneyData.openedIdList");
            synchronizedSet.addAll(linkedList);
            Ax0.f90384f.put(Long.valueOf(j), synchronizedSet);
            rawQuery.close();
        }
    }

    /* renamed from: wg1.v1$b */
    public static final class C66094b {

        /* renamed from: a */
        public final C51790w61 f190000a;

        /* renamed from: b */
        public final String f190001b;

        /* renamed from: c */
        public final String f190002c;

        /* renamed from: d */
        public C38124s1 f190003d;

        public C66094b(C51790w61 w612) {
            C87412m.m108594g(w612, "originData");
            this.f190000a = w612;
            String str = w612.f143878d;
            String str2 = "";
            this.f190001b = str == null ? str2 : str;
            String str3 = w612.f143882h;
            this.f190002c = str3 != null ? str3 : str2;
            this.f190003d = C38124s1.NEW;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C66094b) && C87412m.m108589b(this.f190000a, ((C66094b) obj).f190000a);
        }

        public int hashCode() {
            return this.f190000a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("id = " + this.f190001b);
            sb.append(", ");
            sb.append("micId = " + this.f190002c);
            sb.append(", ");
            sb.append("state = " + this.f190003d);
            sb.append("\n");
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "StringBuilder().append(\"…              .toString()");
            return sb4;
        }
    }

    /* renamed from: wg1.v1$c */
    public static final class C66095c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66093v1 f190004d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66095c(C66093v1 v1Var) {
            super(0);
            this.f190004d = v1Var;
        }

        public Object invoke() {
            C66093v1 v1Var = this.f190004d;
            C66088u1 u1Var = v1Var.f189997h;
            if (u1Var != null) {
                u1Var.mo90066P(v1Var.f189998i.size());
            }
            return C13598b0.f38549a;
        }
    }

    public C66093v1(C45795b bVar, C58124b bVar2, C54795n5 n5Var, C54130j jVar) {
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f189993d = bVar;
        this.f189994e = bVar2;
        this.f189995f = n5Var;
        this.f189996g = jVar;
    }

    /* renamed from: D */
    public void mo90132D(String str) {
        T t;
        C87412m.m108594g(str, "sendId");
        Iterator<T> it = this.f189998i.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C66094b) t).f190001b.equals(str)) {
                break;
            }
        }
        C66094b bVar = (C66094b) t;
        if (bVar != null) {
            mo90139n(bVar);
        }
    }

    /* renamed from: F0 */
    public String mo90133F0() {
        C66094b peekFirst;
        if (!this.f189998i.isEmpty() && (peekFirst = this.f189998i.peekFirst()) != null) {
            return peekFirst.f190002c;
        }
        return null;
    }

    /* renamed from: b */
    public void mo90134b() {
        Log.m105924i("Finder.FinderLiveLuckyMoneyBubblePresenter", "onBubbleClick: current size:" + this.f189998i.size());
        C66094b peekFirst = this.f189998i.peekFirst();
        C66088u1 u1Var = this.f189997h;
        MMFragmentActivity mMFragmentActivity = null;
        C62008a aVar = u1Var instanceof C62008a ? (C62008a) u1Var : null;
        boolean z = false;
        if (aVar != null) {
            FrameBubbleContentLayout frameBubbleContentLayout = aVar.f176277f;
            if (frameBubbleContentLayout != null && frameBubbleContentLayout.f159272i == 2) {
                z = true;
            }
        }
        int i = z ? 2 : 1;
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C61568m.C61569a.m72264b((C61568m) c, C54090i0.CLICK_RED_PACKET, TextUtils.isEmpty(peekFirst != null ? peekFirst.f190002c : null) ? C0074h0.ANCHOR : C0074h0.LINKMIC_VISITOR, false, i, 4, (Object) null);
        C66088u1 u1Var2 = this.f189997h;
        if (u1Var2 != null) {
            mMFragmentActivity = u1Var2.getActivity();
        }
        if (peekFirst != null && mMFragmentActivity != null) {
            if (this.f189999j == null) {
                Handler createFreeHandler = MMHandler.createFreeHandler(Looper.getMainLooper());
                C87412m.m108593f(createFreeHandler, "createFreeHandler(Looper.getMainLooper())");
                this.f189999j = new LuckyMoneyResultReceiev(this, createFreeHandler);
            }
            LuckyMoneyResultReceiev luckyMoneyResultReceiev = this.f189999j;
            if (luckyMoneyResultReceiev != null) {
                luckyMoneyResultReceiev.f159298e = new WeakReference<>(peekFirst);
                Log.m105924i("Finder.FinderLiveLuckyMoneyBubblePresenter", "setLuckyMoneyShowInfo info:" + peekFirst);
            }
            C54795n5 n5Var = this.f189995f;
            if (n5Var != null) {
                n5Var.mo75697A(mMFragmentActivity, peekFirst.f190000a, this.f189999j, new C15360w1(this));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x004a A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo90135d() {
        /*
            r12 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "Finder.FinderLiveLuckyMoneyBubblePresenter"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateStatus bindMicUser:"
            r2.append(r3)
            al1.j r3 = r12.f189996g
            r2.append(r3)
            java.lang.String r3 = " liveData.business(LiveCommonSlice::class.java).luckyMoneyList.size:"
            r2.append(r3)
            fj1.b r3 = r12.f189993d
            androidx.lifecycle.i0 r3 = r3.mo71262a(r0)
            cl1.o r3 = (cl1.C54991o) r3
            java.util.List<te3.w61> r3 = r3.f154385x2
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            fj1.b r1 = r12.f189993d
            androidx.lifecycle.i0 r0 = r1.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.util.List<te3.w61> r0 = r0.f154385x2
            java.lang.String r1 = "liveData.business(LiveCo…lass.java).luckyMoneyList"
            gy3.C87412m.m108593f(r0, r1)
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0179 }
            r1.<init>()     // Catch:{ all -> 0x0179 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0179 }
        L_0x004a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0179 }
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0179 }
            r7 = r3
            te3.w61 r7 = (te3.C51790w61) r7     // Catch:{ all -> 0x0179 }
            java.lang.Class<hr.t> r8 = p165hr.C60106t.class
            di3.d r8 = di3.C86312j.m106911c(r8)     // Catch:{ all -> 0x0179 }
            hr.t r8 = (p165hr.C60106t) r8     // Catch:{ all -> 0x0179 }
            ik1.g r8 = r8.Ax0()     // Catch:{ all -> 0x0179 }
            fj1.b r9 = r12.f189993d     // Catch:{ all -> 0x0179 }
            java.lang.Class<cl1.u> r10 = cl1.C55001u.class
            androidx.lifecycle.i0 r9 = r9.mo71262a(r10)     // Catch:{ all -> 0x0179 }
            cl1.u r9 = (cl1.C55001u) r9     // Catch:{ all -> 0x0179 }
            te3.c21 r9 = r9.f154420q     // Catch:{ all -> 0x0179 }
            long r9 = r9.f182392d     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = r7.f143878d     // Catch:{ all -> 0x0179 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.Set<java.lang.String>> r8 = r8.f90384f     // Catch:{ all -> 0x0179 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0179 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0179 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ all -> 0x0179 }
            if (r8 == 0) goto L_0x0089
            boolean r8 = sx3.C110818d0.m150903D(r8, r11)     // Catch:{ all -> 0x0179 }
            goto L_0x008a
        L_0x0089:
            r8 = 0
        L_0x008a:
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x00a3
            al1.j r8 = r12.f189996g     // Catch:{ all -> 0x0179 }
            if (r8 == 0) goto L_0x0094
            java.lang.String r8 = r8.f152002f     // Catch:{ all -> 0x0179 }
            goto L_0x0095
        L_0x0094:
            r8 = r4
        L_0x0095:
            java.lang.String r9 = r7.f143882h     // Catch:{ all -> 0x0179 }
            r10 = 2
            boolean r4 = z04.C112551y.m153810j(r8, r9, r6, r10, r4)     // Catch:{ all -> 0x0179 }
            if (r4 == 0) goto L_0x00a3
            int r4 = r7.f143884j     // Catch:{ all -> 0x0179 }
            if (r4 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 == 0) goto L_0x004a
            r1.add(r3)     // Catch:{ all -> 0x0179 }
            goto L_0x004a
        L_0x00aa:
            monitor-exit(r0)
            java.lang.String r0 = "Finder.FinderLiveLuckyMoneyBubblePresenter"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateLuckyMoneyShowList: filtered remote luckyMoneyList.size:"
            r2.append(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r3 = ", local list size:"
            r2.append(r3)
            java.util.concurrent.ConcurrentLinkedDeque<wg1.v1$b> r3 = r12.f189998i
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.List r0 = sx3.C110818d0.m150936h0(r1)
            monitor-enter(r0)
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0176 }
        L_0x00dd:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0176 }
            if (r2 == 0) goto L_0x0163
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0176 }
            te3.w61 r2 = (te3.C51790w61) r2     // Catch:{ all -> 0x0176 }
            java.util.concurrent.ConcurrentLinkedDeque<wg1.v1$b> r3 = r12.f189998i     // Catch:{ all -> 0x0176 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0176 }
        L_0x00ef:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x0176 }
            if (r7 == 0) goto L_0x0107
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x0176 }
            r8 = r7
            wg1.v1$b r8 = (wg1.C66093v1.C66094b) r8     // Catch:{ all -> 0x0176 }
            java.lang.String r8 = r8.f190001b     // Catch:{ all -> 0x0176 }
            java.lang.String r9 = r2.f143878d     // Catch:{ all -> 0x0176 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0176 }
            if (r8 == 0) goto L_0x00ef
            goto L_0x0108
        L_0x0107:
            r7 = r4
        L_0x0108:
            wg1.v1$b r7 = (wg1.C66093v1.C66094b) r7     // Catch:{ all -> 0x0176 }
            if (r7 == 0) goto L_0x0124
            java.lang.String r2 = "Finder.FinderLiveLuckyMoneyBubblePresenter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r3.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r8 = "updateLuckyMoneyShowList: update local info: "
            r3.append(r8)     // Catch:{ all -> 0x0176 }
            r3.append(r7)     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0176 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0176 }
            goto L_0x00dd
        L_0x0124:
            java.util.concurrent.ConcurrentLinkedDeque<wg1.v1$b> r3 = r12.f189998i     // Catch:{ all -> 0x0176 }
            wg1.v1$b r6 = new wg1.v1$b     // Catch:{ all -> 0x0176 }
            r6.<init>(r2)     // Catch:{ all -> 0x0176 }
            java.lang.String r7 = "Finder.FinderLiveLuckyMoneyBubblePresenter"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r8.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r9 = "updateLuckyMoneyShowList: add local info: "
            r8.append(r9)     // Catch:{ all -> 0x0176 }
            r8.append(r6)     // Catch:{ all -> 0x0176 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0176 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x0176 }
            r3.offerFirst(r6)     // Catch:{ all -> 0x0176 }
            java.lang.String r2 = r2.f143882h     // Catch:{ all -> 0x0176 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0176 }
            if (r2 != 0) goto L_0x0160
            java.lang.Class<l31.e> r2 = l31.C61212e.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0176 }
            l31.e r2 = (l31.C61212e) r2     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = "finder_live_link_red_packet_success"
            java.util.Map r6 = r12.mo90138e()     // Catch:{ all -> 0x0176 }
            r7 = 25561(0x63d9, float:3.5819E-41)
            r2.mo86153W7(r3, r4, r6, r7)     // Catch:{ all -> 0x0176 }
        L_0x0160:
            r6 = 1
            goto L_0x00dd
        L_0x0163:
            monitor-exit(r0)
            if (r6 == 0) goto L_0x016e
            wg1.v1$c r0 = new wg1.v1$c
            r0.<init>(r12)
            o40.C61926c.m72668M(r0)
        L_0x016e:
            java.util.concurrent.ConcurrentLinkedDeque<wg1.v1$b> r0 = r12.f189998i
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            return r0
        L_0x0176:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0179:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66093v1.mo90135d():boolean");
    }

    /* renamed from: e */
    public final Map<String, Object> mo90138e() {
        Class cls = C10383h.class;
        Class cls2 = C55001u.class;
        C13604l[] lVarArr = new C13604l[11];
        C64273c21 c212 = ((C55001u) this.f189993d.mo71262a(cls2)).f154420q;
        String str = null;
        lVarArr[0] = new C13604l("live_id", c212 != null ? ((C10383h) C86312j.m106911c(cls)).mo10700XQ(c212.f182392d) : null);
        C64273c21 c213 = ((C55001u) this.f189993d.mo71262a(cls2)).f154420q;
        lVarArr[1] = new C13604l("live_start_time", c213 != null ? Integer.valueOf(c213.f182396h) : null);
        lVarArr[2] = new C13604l("feed_id", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(((C55001u) this.f189993d.mo71262a(cls2)).f154416j));
        C64273c21 c214 = ((C55001u) this.f189993d.mo71262a(cls2)).f154420q;
        lVarArr[3] = new C13604l("live_time", c214 != null ? Long.valueOf(System.currentTimeMillis() - (((long) c214.f182396h) * 1000)) : null);
        lVarArr[4] = new C13604l("session_buffer", ((C55001u) this.f189993d.mo71262a(cls2)).f154424u);
        lVarArr[5] = new C13604l("enter_session_id", Long.valueOf(((C54116w) C86312j.m106911c(C54116w.class)).f151950p));
        lVarArr[6] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
        lVarArr[7] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
        lVarArr[8] = new C13604l("comment_scene", ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK());
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar != null) {
            str = oVar.f154345o;
        }
        lVarArr[9] = new C13604l("finder_username", str);
        lVarArr[10] = new C13604l("behaviour_session_id", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb());
        return C90364q0.m113148g(lVarArr);
    }

    /* renamed from: n */
    public final void mo90139n(C66094b bVar) {
        Set set;
        C87412m.m108594g(bVar, "showInfo");
        C33343g Ax0 = ((C60106t) C86312j.m106911c(C60106t.class)).Ax0();
        long j = ((C55001u) this.f189993d.mo71262a(C55001u.class)).f154420q.f182392d;
        String str = bVar.f190001b;
        Ax0.getClass();
        Log.m105924i("Finder.FinderLiveLuckyMoneyStorage", "updateCache liveId:" + j + " sendId:" + str);
        if (!(str == null || (set = Ax0.f90384f.get(Long.valueOf(j))) == null)) {
            set.add(str);
        }
        this.f189998i.remove(bVar);
        C66088u1 u1Var = this.f189997h;
        if (u1Var != null) {
            u1Var.mo90066P(this.f189998i.size());
        }
    }

    public void onDetach() {
        Log.m105924i("Finder.FinderLiveLuckyMoneyBubblePresenter", "onDetach " + Util.getStack());
        C66088u1 u1Var = this.f189997h;
        if (u1Var != null) {
            u1Var.destroy();
        }
        this.f189997h = null;
    }
}
