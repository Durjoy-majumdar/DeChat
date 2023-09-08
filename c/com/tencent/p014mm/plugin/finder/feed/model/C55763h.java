package com.tencent.p014mm.plugin.finder.feed.model;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import c30.C79923f;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import ef1.C7637b;
import ef1.C7642k;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60190o1;
import ht1.C60200t1;
import it1.C60625c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import o40.C61926c;
import pf1.C62273n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import te3.C50397mg0;
import te3.C51533ue1;
import tf0.C13887q1;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.h */
public final class C55763h implements C55778t0<Long>, C60190o1 {

    /* renamed from: a */
    public final C13601g f158763a = C36568h.m40985a(C55765b.f158776d);

    /* renamed from: b */
    public final C55760e f158764b;

    /* renamed from: c */
    public final C55760e f158765c;

    /* renamed from: d */
    public Activity f158766d;

    /* renamed from: e */
    public Fragment f158767e;

    /* renamed from: f */
    public String f158768f;

    /* renamed from: g */
    public final List<Long> f158769g;

    /* renamed from: h */
    public final Set<Long> f158770h;

    /* renamed from: i */
    public C32227p<? super Integer, ? super Integer, ? extends LinkedList<C0740i2>> f158771i;

    /* renamed from: j */
    public int f158772j;

    /* renamed from: k */
    public C60625c<C50397mg0> f158773k;

    /* renamed from: l */
    public final C13601g f158774l;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.h$a */
    public static final class C55764a extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C55763h f158775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55764a(C55763h hVar) {
            super(0);
            this.f158775d = hVar;
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler("FinderAdInfoPreLoader", (MMHandler.Callback) new C55762g(this.f158775d));
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.h$b */
    public static final class C55765b extends C87413o implements C32224a<C62273n> {

        /* renamed from: d */
        public static final C55765b f158776d = new C55765b();

        public C55765b() {
            super(0);
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
            return (C62273n) a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.h$c */
    public static final class C55766c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55763h f158777d;

        /* renamed from: e */
        public final /* synthetic */ C7637b f158778e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList<C0740i2> f158779f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55766c(C55763h hVar, C7637b bVar, LinkedList<C0740i2> linkedList) {
            super(0);
            this.f158777d = hVar;
            this.f158778e = bVar;
            this.f158779f = linkedList;
        }

        public Object invoke() {
            this.f158777d.mo77377x().post(new C55768i(this.f158778e, this.f158779f, this.f158777d));
            return C13598b0.f38549a;
        }
    }

    public C55763h() {
        C55760e eVar = C55771j.f158788a;
        this.f158764b = C55771j.f158788a;
        this.f158765c = C55771j.f158789b;
        this.f158768f = "";
        this.f158769g = Collections.synchronizedList(new ArrayList());
        this.f158770h = Collections.synchronizedSet(new HashSet());
        this.f158774l = C36568h.m40985a(new C55764a(this));
    }

    /* renamed from: s */
    public static final void m63488s(C55763h hVar, Message message) {
        hVar.getClass();
        Object obj = message.obj;
        MMActivity mMActivity = null;
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            synchronized (hVar) {
                Log.m105924i("Finder.AdInfoPreLoader", "batchLoad request ids size = " + list.size());
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C13604l lVar = (C13604l) next;
                    boolean contains = hVar.f158770h.contains(Long.valueOf(((Number) lVar.f38555d).longValue()));
                    boolean contains2 = hVar.f158769g.contains(lVar.f38555d);
                    Log.m105924i("Finder.AdInfoPreLoader", "id: " + C61926c.m72691p(((Number) lVar.f38555d).longValue()) + " isInCache " + contains + " isInLoading:" + contains2);
                    if (contains2 || contains) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                LinkedList<C13604l> linkedList = new LinkedList<>(arrayList);
                Log.m105924i("Finder.AdInfoPreLoader", "filteredIds size = " + linkedList.size());
                if (!linkedList.isEmpty()) {
                    List<Long> list2 = hVar.f158769g;
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
                    for (C13604l lVar2 : linkedList) {
                        arrayList2.add(Long.valueOf(((Number) lVar2.f38555d).longValue()));
                    }
                    list2.addAll(arrayList2);
                    Context context = hVar.f158766d;
                    if (context == null) {
                        Fragment fragment = hVar.f158767e;
                        context = fragment != null ? fragment.getActivity() : null;
                    }
                    if (context instanceof MMActivity) {
                        mMActivity = (MMActivity) context;
                    }
                    MMActivity mMActivity2 = mMActivity;
                    if (mMActivity2 != null && !mMActivity2.isFinishing()) {
                        C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
                        int i = hVar.f158772j;
                        int i2 = 2;
                        if (i != 1) {
                            i2 = i != 2 ? -1 : 4;
                        }
                        int w = hVar.mo77376w();
                        String O5 = C66785b.f191882e.mo90662O5();
                        String y = hVar.mo77378y();
                        if (y == null) {
                            y = "";
                        }
                        C60625c<C50397mg0> LT = q1Var.mo13317LT(linkedList, i2, w, O5, y);
                        LT.mo9225i().mo123064p(new C55761f(hVar)).mo11397F(mMActivity2);
                        hVar.f158773k = LT;
                    }
                }
            }
            return;
        }
        Log.m105924i("Finder.AdInfoPreLoader", "type error: not list");
        C13598b0 b0Var = C13598b0.f38549a;
    }

    /* renamed from: t */
    public static final void m63489t(C55763h hVar, ArrayList<Number> arrayList, int i) {
        hVar.getClass();
        if (arrayList != null) {
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                Log.m105924i("Finder.AdInfoPreLoader", "type: " + i + ", publishEvent size:" + arrayList.size());
                for (Number longValue : arrayList) {
                    long longValue2 = longValue.longValue();
                    Log.m105924i("Finder.AdInfoPreLoader", "type: " + i + " publishEvent id :" + longValue2);
                    FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                    FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
                    aVar.f9174a = longValue2;
                    aVar.f9175b = i;
                    feedUpdateEvent.publish();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo77365b(long j) {
        C104289g gVar = new C104289g();
        try {
            gVar.mo145953n("ad_type", 8);
            C2778b bVar = new C2778b(j, gVar);
            if (this.f158765c.mo77361b(j)) {
                this.f158765c.mo77363d(j);
            }
            this.f158765c.mo77360a(bVar);
        } catch (C79923f e) {
            Log.m105920e("Finder.AdInfoPreLoader", e.getMessage());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(j));
        mo77379z(arrayList, arrayList2);
    }

    /* renamed from: i */
    public C55779u0 mo77366i(Object obj, int i) {
        long longValue = ((Number) obj).longValue();
        if (i == 1) {
            return this.f158764b.mo77362c(longValue);
        }
        if (i != 2) {
            return null;
        }
        return this.f158765c.mo77362c(longValue);
    }

    /* renamed from: j */
    public void mo77367j(C32227p<? super Integer, ? super Integer, ? extends LinkedList<C0740i2>> pVar, RecyclerView recyclerView, int i) {
        Log.m105924i("Finder.AdInfoPreLoader", "onAttach");
        this.f158771i = pVar;
        this.f158772j = i;
    }

    /* renamed from: n */
    public void mo77368n(Fragment fragment) {
        C87412m.m108594g(fragment, "fragment");
        this.f158767e = fragment;
    }

    /* renamed from: o */
    public void mo77369o(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f158766d = activity;
    }

    public void onDetach() {
        Log.m105924i("Finder.AdInfoPreLoader", "onDetach");
        mo77377x().removeCallbacksAndMessages((Object) null);
        this.f158769g.clear();
        this.f158770h.clear();
        C60625c<C50397mg0> cVar = this.f158773k;
        if (cVar != null) {
            cVar.mo85581g();
        }
        this.f158766d = null;
        this.f158767e = null;
    }

    /* renamed from: p */
    public void mo77371p(C7637b bVar, LinkedList<C0740i2> linkedList) {
        C87412m.m108594g(bVar, "ev");
        if (bVar instanceof C7642k) {
            C61926c.m72668M(new C55766c(this, bVar, linkedList));
        }
    }

    /* renamed from: q */
    public void mo77372q(C7637b bVar) {
        C87412m.m108594g(bVar, "ev");
    }

    /* renamed from: r */
    public void mo77373r(Object obj, int i) {
        long longValue = ((Number) obj).longValue();
        if (i == 1) {
            this.f158764b.mo77363d(longValue);
        } else if (i != 2) {
            Log.m105924i("Finder.AdInfoPreLoader", "clearCache not match");
        } else {
            this.f158765c.mo77363d(longValue);
        }
    }

    /* renamed from: u */
    public final void mo77374u(C51533ue1 ue12, ArrayList<Long> arrayList) {
        LinkedList<String> linkedList = ue12.f142799f;
        C2776a aVar = null;
        if (linkedList != null) {
            for (String str : linkedList) {
                if (C87412m.m108589b("{}", str)) {
                    Log.m105924i("Finder.AdInfoPreLoader", "mutual info is empty return");
                    return;
                }
                C104289g gVar = new C104289g(str);
                if (!C87412m.m108589b("3021461725186497", gVar.opt("ad_posid"))) {
                    Log.m105924i("Finder.AdInfoPreLoader", "not h5 type pos id");
                }
                aVar = new C2776a(ue12.f142797d, gVar);
            }
        }
        Log.m105924i("Finder.AdInfoPreLoader", "save mutual cache and notify adCache:" + aVar);
        if (aVar != null) {
            long j = ue12.f142797d;
            if (this.f158764b.mo77361b(j)) {
                this.f158764b.mo77363d(j);
            }
            this.f158764b.mo77360a(aVar);
            arrayList.add(Long.valueOf(j));
        }
    }

    /* renamed from: v */
    public final void mo77375v(C51533ue1 ue12, ArrayList<Long> arrayList) {
        LinkedList<String> linkedList = ue12.f142800g;
        C2778b bVar = null;
        if (linkedList != null) {
            for (String str : linkedList) {
                if (C87412m.m108589b("{}", str)) {
                    Log.m105924i("Finder.AdInfoPreLoader", "sns info is empty return");
                    return;
                } else {
                    bVar = new C2778b(ue12.f142797d, new C104289g(str));
                }
            }
        }
        Log.m105924i("Finder.AdInfoPreLoader", "save sns cache and notify " + bVar);
        if (bVar != null) {
            long j = ue12.f142797d;
            if (this.f158765c.mo77361b(j)) {
                this.f158765c.mo77363d(j);
            }
            this.f158765c.mo77360a(bVar);
            arrayList.add(Long.valueOf(j));
        }
    }

    /* renamed from: w */
    public final int mo77376w() {
        C13442s8 f;
        Context context = this.f158766d;
        if (context == null) {
            Fragment fragment = this.f158767e;
            context = (fragment == null || fragment == null) ? null : fragment.getActivity();
        }
        int i = 0;
        if (!(context == null || (f = C13442s8.f38060Q0.mo12873f(context)) == null)) {
            i = f.mo12861q3().f134675i;
        }
        Log.m105924i("Finder.AdInfoPreLoader", "commentScene: " + i);
        return i;
    }

    /* renamed from: x */
    public final MMHandler mo77377x() {
        return (MMHandler) ((C36570n) this.f158774l).getValue();
    }

    /* renamed from: y */
    public final String mo77378y() {
        Activity activity = this.f158766d;
        String str = "";
        if (activity != null) {
            try {
                C13442s8 f = C13442s8.f38060Q0.mo12873f(activity);
                String str2 = null;
                String str3 = f != null ? f.f38107v : null;
                if (!Util.isNullOrNil(str3)) {
                    C104289g m = new C104289g(str3).optJSONObject("sns_ad");
                    if (m != null) {
                        str2 = m.optString("uxinfo");
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                }
            } catch (C79923f e) {
                Log.printErrStackTrace("Finder.AdInfoPreLoader", e, "parse json error", new Object[0]);
            }
        }
        Log.m105924i("Finder.AdInfoPreLoader", "getUxInfo: " + str);
        return !Util.isNullOrNil(str) ? str : this.f158768f;
    }

    /* renamed from: z */
    public final void mo77379z(ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        mo77377x().removeMessages(1001);
        mo77377x().sendMessage(mo77377x().obtainMessage(1001, new C13604l(arrayList, arrayList2)));
    }
}
