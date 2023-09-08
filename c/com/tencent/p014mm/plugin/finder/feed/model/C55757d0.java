package com.tencent.p014mm.plugin.finder.feed.model;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39815b;
import bl3.C39818r;
import cj1.C0539f6;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import ef1.C58555d;
import ef1.C7637b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60190o1;
import ht1.C8819z2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArraySet;
import jp3.C9486a;
import jp3.C9487b;
import kf1.C9818k2;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C26236u;
import te3.C49098d51;
import tf0.C64916p1;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.d0 */
public final class C55757d0 extends C58555d implements C9487b<C9486a>, C8819z2 {

    /* renamed from: y */
    public static long f158739y = -1;

    /* renamed from: g */
    public final String f158740g = "FinderLiveNoticePreLoader";

    /* renamed from: h */
    public final int f158741h = 5;

    /* renamed from: i */
    public final CopyOnWriteArraySet<C9486a> f158742i = new CopyOnWriteArraySet<>();

    /* renamed from: j */
    public C32227p<? super Integer, ? super Integer, ? extends LinkedList<C0740i2>> f158743j;

    /* renamed from: n */
    public Vector<Long> f158744n = new Vector<>();

    /* renamed from: o */
    public final Vector<Long> f158745o = new Vector<>();

    /* renamed from: p */
    public Activity f158746p;

    /* renamed from: q */
    public Fragment f158747q;

    /* renamed from: r */
    public C9818k2 f158748r;

    /* renamed from: s */
    public final HashMap<Integer, C55778t0<Long>> f158749s;

    /* renamed from: t */
    public final int f158750t;

    /* renamed from: u */
    public final int f158751u;

    /* renamed from: v */
    public final int f158752v;

    /* renamed from: w */
    public final int f158753w;

    /* renamed from: x */
    public final C13601g f158754x;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.d0$a */
    public static final class C55758a extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C55757d0 f158755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55758a(C55757d0 d0Var) {
            super(0);
            this.f158755d = d0Var;
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler("FinderLiveNoticePreLoader", (MMHandler.Callback) new C41414c0(this.f158755d));
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.d0$b */
    public static final class C55759b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55757d0 f158756d;

        /* renamed from: e */
        public final /* synthetic */ int f158757e;

        /* renamed from: f */
        public final /* synthetic */ int f158758f;

        /* renamed from: g */
        public final /* synthetic */ C7637b f158759g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55759b(C55757d0 d0Var, int i, int i2, C7637b bVar) {
            super(0);
            this.f158756d = d0Var;
            this.f158757e = i;
            this.f158758f = i2;
            this.f158759g = bVar;
        }

        public Object invoke() {
            C58555d dVar;
            long currentTimeMillis = System.currentTimeMillis();
            C32227p<? super Integer, ? super Integer, ? extends LinkedList<C0740i2>> pVar = this.f158756d.f158743j;
            LinkedList linkedList = pVar != null ? (LinkedList) pVar.invoke(Integer.valueOf(this.f158757e), Integer.valueOf(this.f158758f)) : null;
            String str = this.f158756d.f158740g;
            Log.m105924i(str, "getData duration:" + (System.currentTimeMillis() - currentTimeMillis));
            this.f158756d.mo77358E1().post(new C2782e0(linkedList, this.f158756d));
            HashMap<Integer, C55778t0<Long>> hashMap = this.f158756d.f158749s;
            C7637b bVar = this.f158759g;
            for (Map.Entry<Integer, C55778t0<Long>> value : hashMap.entrySet()) {
                ((C55778t0) value.getValue()).mo77371p(bVar, linkedList);
            }
            C9818k2 k2Var = this.f158756d.f158748r;
            if (!(k2Var == null || (dVar = k2Var.f30364i) == null)) {
                dVar.mo2331B1(this.f158759g);
            }
            return C13598b0.f38549a;
        }
    }

    public C55757d0(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        HashMap<Integer, C55778t0<Long>> hashMap = new HashMap<>();
        this.f158749s = hashMap;
        this.f158750t = 1;
        this.f158751u = 2;
        this.f158752v = 3;
        this.f158753w = 4;
        this.f158754x = C36568h.m40985a(new C55758a(this));
        this.f158746p = activity;
        C39815b a = C39818r.f106831a.mo62442a(C60190o1.class);
        ((C60190o1) a).mo77369o(activity);
        hashMap.put(2, (C55778t0) a);
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (mMActivity != null) {
            this.f158748r = ((C64916p1) C86312j.m106911c(C64916p1.class)).Zg0(mMActivity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = (ef1.C7642k) r8;
     */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2331B1(ef1.C7637b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r8, r0)
            boolean r0 = r8 instanceof ef1.C7642k
            r1 = 1
            if (r0 == 0) goto L_0x005d
            r0 = r8
            ef1.k r0 = (ef1.C7642k) r0
            int r2 = r0.f25951b
            r3 = 9
            if (r2 == r3) goto L_0x005d
            r3 = -1
            if (r2 != r1) goto L_0x0019
            f158739y = r3
        L_0x0019:
            long r5 = f158739y
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0027
            java.lang.String r8 = r7.f158740g
            java.lang.String r0 = "isIgnorePreloadForFeedId"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            return
        L_0x0027:
            int r0 = r0.f25953d
            int r2 = r7.f158741h
            int r2 = r2 + r0
            java.lang.String r3 = r7.f158740g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onEventHappen :"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = " firstItemPos:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = " lastItemPos:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            if (r0 <= r2) goto L_0x0055
            return
        L_0x0055:
            com.tencent.mm.plugin.finder.feed.model.d0$b r3 = new com.tencent.mm.plugin.finder.feed.model.d0$b
            r3.<init>(r7, r0, r2, r8)
            o40.C61926c.m72668M(r3)
        L_0x005d:
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.finder.feed.model.t0<java.lang.Long>> r0 = r7.f158749s
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.plugin.finder.feed.model.t0 r0 = (com.tencent.p014mm.plugin.finder.feed.model.C55778t0) r0
            if (r0 == 0) goto L_0x006e
            r0.mo77372q(r8)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.C55757d0.mo2331B1(ef1.b):void");
    }

    /* renamed from: E1 */
    public final MMHandler mo77358E1() {
        return (MMHandler) this.f158754x.getValue();
    }

    /* renamed from: F1 */
    public final void mo77359F1(List<String> list) {
        FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        C87412m.m108594g(list, "nameList");
        StringBuilder sb = new StringBuilder("");
        for (String append : list) {
            sb.append(append);
            sb.append(",");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "strBuilder.toString()");
        aVar.f9181h = C112550d0.m153780P(sb4, ",");
        feedUpdateEvent.f9173d.f9175b = 11;
        feedUpdateEvent.publish();
    }

    /* renamed from: N */
    public void mo9644N(long j, int i) {
        String str = this.f158740g;
        Log.m105924i(str, "clearCache: id:" + j + " type:" + i);
        C55778t0 t0Var = this.f158749s.get(Integer.valueOf(i));
        if (t0Var != null) {
            t0Var.mo77373r(Long.valueOf(j), i);
        }
    }

    /* renamed from: S0 */
    public void mo9645S0(int i, long j) {
        C55778t0 t0Var;
        if (this.f158749s.containsKey(Integer.valueOf(i)) && (t0Var = this.f158749s.get(Integer.valueOf(i))) != null) {
            t0Var.mo77365b(j);
        }
    }

    /* renamed from: T0 */
    public void mo9646T0(C32227p<? super Integer, ? super Integer, ? extends LinkedList<C0740i2>> pVar, RecyclerView recyclerView) {
        Log.m105924i(this.f158740g, "onAttach");
        this.f158743j = pVar;
        for (Map.Entry next : this.f158749s.entrySet()) {
            ((C55778t0) next.getValue()).mo77367j(pVar, recyclerView, ((Number) next.getKey()).intValue());
        }
        C9818k2 k2Var = this.f158748r;
        if (k2Var != null) {
            k2Var.mo2498a(recyclerView);
        }
    }

    /* renamed from: a1 */
    public C0539f6 mo9647a1(String str) {
        C87412m.m108594g(str, "userName");
        return C2816v.f14072a.mo2916e(str);
    }

    /* renamed from: f0 */
    public void mo9648f0(String str) {
        C87412m.m108594g(str, "userName");
        mo77358E1().removeMessages(this.f158752v);
        mo77358E1().sendMessage(mo77358E1().obtainMessage(this.f158752v, str));
    }

    /* renamed from: j0 */
    public void mo9649j0(Long l, String str) {
        if (l != null && str != null) {
            mo77358E1().sendMessage(mo77358E1().obtainMessage(this.f158750t, new LinkedList(C26236u.m33719b(new C13604l(Long.valueOf(l.longValue()), str)))));
        }
    }

    public void keep(C9486a aVar) {
        this.f158742i.add(aVar);
    }

    /* renamed from: n */
    public C58555d mo9650n() {
        return this;
    }

    public void onDetach() {
        Log.m105924i(this.f158740g, "onDetach");
        this.f158743j = null;
        for (Map.Entry<Integer, C55778t0<Long>> value : this.f158749s.entrySet()) {
            ((C55778t0) value.getValue()).onDetach();
        }
        C9818k2 k2Var = this.f158748r;
        if (k2Var != null) {
            k2Var.mo2500c();
        }
        this.f158748r = null;
        for (C9486a dead : this.f158742i) {
            dead.dead();
        }
        this.f158742i.clear();
        this.f158744n.clear();
        mo77358E1().removeMessages(this.f158750t);
        mo77358E1().removeMessages(this.f158751u);
        mo77358E1().removeMessages(this.f158753w);
        this.f158745o.clear();
        this.f158747q = null;
        this.f158746p = null;
    }

    /* renamed from: q */
    public C49098d51 mo9652q(String str) {
        C87412m.m108594g(str, "userName");
        return C2816v.f14072a.mo2914c(str);
    }

    /* renamed from: t */
    public void mo9653t(String str) {
        C87412m.m108594g(str, "finderUsername");
        String str2 = this.f158740g;
        Log.m105924i(str2, "notifyLiveEnd: finderUsername=" + str);
        C0539f6 e = C2816v.f14072a.mo2916e(str);
        if (e != null) {
            e.f1309c = true;
            mo77359F1(C26236u.m33719b(str));
        }
    }

    /* renamed from: t1 */
    public C55779u0 mo9654t1(long j, int i) {
        C55778t0 t0Var;
        if (!this.f158749s.containsKey(Integer.valueOf(i)) || (t0Var = this.f158749s.get(Integer.valueOf(i))) == null) {
            return null;
        }
        return t0Var.mo77366i(Long.valueOf(j), i);
    }

    public C55757d0(Fragment fragment) {
        C87412m.m108594g(fragment, "fragment");
        HashMap<Integer, C55778t0<Long>> hashMap = new HashMap<>();
        this.f158749s = hashMap;
        this.f158750t = 1;
        this.f158751u = 2;
        this.f158752v = 3;
        this.f158753w = 4;
        this.f158754x = C36568h.m40985a(new C55758a(this));
        this.f158747q = fragment;
        C39815b a = C39818r.f106831a.mo62442a(C60190o1.class);
        ((C60190o1) a).mo77368n(fragment);
        hashMap.put(2, (C55778t0) a);
        FragmentActivity activity = fragment.getActivity();
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (mMActivity != null) {
            this.f158748r = ((C64916p1) C86312j.m106911c(C64916p1.class)).Zg0(mMActivity);
        }
    }
}
