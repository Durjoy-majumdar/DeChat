package gh1;

import ai1.C54034b;
import aj1.C54037b;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.plugin.finder.live.controller.base.C41447a;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController;
import com.tencent.p014mm.plugin.finder.live.view.C56061i;
import com.tencent.p014mm.plugin.finder.live.view.C56074k;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import com.tencent.p014mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import fh1.C45788m2;
import fh1.C45793z0;
import fh1.C58989a;
import fh1.C58994a1;
import fh1.C58999c1;
import fh1.C59011e0;
import fh1.C59014f0;
import fh1.C59018f2;
import fh1.C59030i1;
import fh1.C59038k0;
import fh1.C59043k2;
import fh1.C59046m0;
import fh1.C59062p2;
import fh1.C59079s2;
import fh1.C8033c0;
import fh1.C8036f1;
import fh1.C8044g;
import fh1.C8048h;
import fh1.C8063l0;
import fh1.C8067n2;
import fh1.C8070p;
import fh1.C8083t2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ih1.C60284a;
import ih1.C8918b;
import ih1.C8919c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh1.C10079c;
import kh1.C10086f;
import ks3.C61162l;
import o40.C61926c;
import oh1.C11415c;
import oh1.C11421g;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64197v;
import te3.C52005xq0;
import vo1.C65821t0;
import xo1.C66378a;
import xo1.C66382b;
import xo1.C66388f;
import xo1.C66396l;
import zo1.C66913a0;

/* renamed from: gh1.j */
public final class C59447j {

    /* renamed from: a */
    public static final C59447j f169870a = new C59447j();

    /* renamed from: b */
    public static final List<Class<? extends LiveRoomController>> f169871b = C64197v.m75537f(C8063l0.class, C8070p.class, C8919c.class, C8918b.class, C59079s2.class, C45788m2.class);

    /* renamed from: c */
    public static final Map<Class<? extends LiveRoomController>, List<C61162l>> f169872c;

    /* renamed from: gh1.j$b */
    public static final class C8316b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f27267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8316b(LiveRoomControllerStore liveRoomControllerStore) {
            super(0);
            this.f27267d = liveRoomControllerStore;
        }

        public Object invoke() {
            for (LiveRoomController onFloatMode : this.f27267d.getControllers()) {
                onFloatMode.onFloatMode();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gh1.j$d */
    public static final class C8317d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f27268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8317d(LiveRoomControllerStore liveRoomControllerStore) {
            super(0);
            this.f27268d = liveRoomControllerStore;
        }

        public Object invoke() {
            for (LiveRoomController onNormalMode : this.f27268d.getControllers()) {
                onNormalMode.onNormalMode();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gh1.j$e */
    public static final class C8318e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f27269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8318e(LiveRoomControllerStore liveRoomControllerStore) {
            super(0);
            this.f27269d = liveRoomControllerStore;
        }

        public Object invoke() {
            for (LiveRoomController onLivePause : this.f27269d.getControllers()) {
                onLivePause.onLivePause();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gh1.j$f */
    public static final class C8319f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f27270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8319f(LiveRoomControllerStore liveRoomControllerStore) {
            super(0);
            this.f27270d = liveRoomControllerStore;
        }

        public Object invoke() {
            for (LiveRoomController onLiveResume : this.f27270d.getControllers()) {
                onLiveResume.onLiveResume();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gh1.j$a */
    public static final class C59448a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f169873d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59448a(LiveRoomControllerStore liveRoomControllerStore) {
            super(0);
            this.f169873d = liveRoomControllerStore;
        }

        public Object invoke() {
            for (LiveRoomController onLiveEnd : this.f169873d.getControllers()) {
                onLiveEnd.onLiveEnd();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gh1.j$c */
    public static final class C59449c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61162l f169874d;

        /* renamed from: e */
        public final /* synthetic */ LiveRoomControllerStore f169875e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59449c(C61162l lVar, LiveRoomControllerStore liveRoomControllerStore) {
            super(0);
            this.f169874d = lVar;
            this.f169875e = liveRoomControllerStore;
        }

        public Object invoke() {
            if (this.f169874d == C61162l.Invalid) {
                LiveRoomControllerStore.Companion.getClass();
                String access$getTAG$cp = LiveRoomControllerStore.TAG;
                Log.m105924i(access$getTAG$cp, ShareConstants.RES_STORE_TITLE + this.f169875e.hashCode() + " mode invalid, skip initController");
            } else if (this.f169875e.hasInitialized()) {
                LiveRoomControllerStore.Companion.getClass();
                String access$getTAG$cp2 = LiveRoomControllerStore.TAG;
                Log.m105924i(access$getTAG$cp2, ShareConstants.RES_STORE_TITLE + this.f169875e.hashCode() + " hasInitialized, skip initController");
            } else {
                C59447j jVar = C59447j.f169870a;
                C61162l lVar = this.f169874d;
                C87412m.m108594g(lVar, "mode");
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C59447j.f169871b);
                Map<Class<? extends LiveRoomController>, List<C61162l>> map = C59447j.f169872c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (((List) entry.getValue()).contains(lVar)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                arrayList.addAll(linkedHashMap.keySet());
                LiveRoomControllerStore liveRoomControllerStore = this.f169875e;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Class cls = (Class) it.next();
                    LiveRoomControllerStore.Companion.getClass();
                    C87412m.m108594g(liveRoomControllerStore, "owner");
                    C41447a aVar = new C41447a(liveRoomControllerStore);
                    C39630m0 viewModelStore = liveRoomControllerStore.getViewModelStore();
                    String key = liveRoomControllerStore.getKey(cls);
                    C39622i0 i0Var = viewModelStore.f106390a.get(key);
                    if (!cls.isInstance(i0Var)) {
                        i0Var = aVar instanceof C54209k0.C54211c ? ((C54209k0.C54211c) aVar).mo75004b(key, cls) : aVar.create(cls);
                        C39622i0 put = viewModelStore.f106390a.put(key, i0Var);
                        if (put != null) {
                            put.onCleared();
                        }
                    } else if (aVar instanceof C54209k0.C54212e) {
                        ((C54209k0.C54212e) aVar).mo75005a(i0Var);
                    }
                    liveRoomControllerStore.getControllers().add((LiveRoomController) i0Var);
                }
                for (LiveRoomController onLiveActivate : this.f169875e.getControllers()) {
                    onLiveActivate.onLiveActivate();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gh1.j$g */
    public static final class C59450g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f169876d;

        /* renamed from: e */
        public final /* synthetic */ C52005xq0 f169877e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59450g(LiveRoomControllerStore liveRoomControllerStore, C52005xq0 xq02) {
            super(0);
            this.f169876d = liveRoomControllerStore;
            this.f169877e = xq02;
        }

        public Object invoke() {
            HashSet<LiveRoomController> controllers = this.f169876d.getControllers();
            C52005xq0 xq02 = this.f169877e;
            for (LiveRoomController onLiveStart : controllers) {
                onLiveStart.onLiveStart(xq02);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gh1.j$h */
    public static final class C59451h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f169878d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f169879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59451h(LiveRoomControllerStore liveRoomControllerStore, C32224a<C13598b0> aVar) {
            super(0);
            this.f169878d = liveRoomControllerStore;
            this.f169879e = aVar;
        }

        public Object invoke() {
            LiveRoomControllerStore liveRoomControllerStore = this.f169878d;
            C32224a<C13598b0> aVar = this.f169879e;
            synchronized (liveRoomControllerStore) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C61162l lVar = C61162l.Anchor;
        linkedHashMap.put(C60284a.class, C26236u.m33719b(lVar));
        C61162l lVar2 = C61162l.Visitor;
        linkedHashMap.put(C59014f0.class, C64197v.m75537f(lVar, lVar2));
        linkedHashMap.put(C59038k0.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(C59062p2.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(C58989a.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(EventSubscribeController.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(C10079c.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(C10086f.class, C26236u.m33719b(lVar2));
        C61162l lVar3 = C61162l.Secondary;
        linkedHashMap.put(C8067n2.class, C64197v.m75537f(lVar, lVar3, lVar2));
        C61162l lVar4 = C61162l.Replay;
        linkedHashMap.put(C8033c0.class, C64197v.m75537f(lVar2, lVar4));
        linkedHashMap.put(C8048h.class, C26236u.m33719b(lVar));
        linkedHashMap.put(C8044g.class, C26236u.m33719b(lVar));
        linkedHashMap.put(C59030i1.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(C59018f2.class, C64197v.m75537f(lVar, lVar3, lVar2));
        linkedHashMap.put(C65821t0.class, C26236u.m33719b(lVar4));
        linkedHashMap.put(C8083t2.class, C64197v.m75537f(lVar, lVar3, lVar2));
        linkedHashMap.put(C59011e0.class, C64197v.m75537f(lVar, lVar3, lVar2));
        linkedHashMap.put(C54034b.class, C64197v.m75537f(lVar, lVar2, lVar3));
        linkedHashMap.put(C66913a0.class, C26236u.m33719b(lVar4));
        linkedHashMap.put(C66382b.class, C26236u.m33719b(lVar4));
        linkedHashMap.put(C66378a.class, C26236u.m33719b(lVar4));
        linkedHashMap.put(C66396l.class, C26236u.m33719b(lVar4));
        linkedHashMap.put(C45793z0.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(C59046m0.class, C64197v.m75537f(lVar2, lVar, lVar3));
        linkedHashMap.put(C66388f.class, C26236u.m33719b(lVar4));
        linkedHashMap.put(C59043k2.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(C11421g.class, C64197v.m75537f(lVar2, lVar));
        linkedHashMap.put(C11415c.class, C26236u.m33719b(lVar2));
        linkedHashMap.put(C58999c1.class, C64197v.m75537f(lVar2, lVar3));
        linkedHashMap.put(C8036f1.class, C64197v.m75537f(lVar2, lVar3));
        linkedHashMap.put(C54037b.class, C64197v.m75537f(lVar2, lVar3));
        linkedHashMap.put(C58994a1.class, C64197v.m75537f(lVar2, lVar3));
        f169872c = linkedHashMap;
    }

    /* renamed from: a */
    public final void mo84549a(LiveRoomControllerStore liveRoomControllerStore) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        mo84557i(liveRoomControllerStore, new C59448a(liveRoomControllerStore));
    }

    /* renamed from: b */
    public final void mo84550b(LiveRoomControllerStore liveRoomControllerStore) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        mo84557i(liveRoomControllerStore, new C8316b(liveRoomControllerStore));
    }

    /* renamed from: c */
    public final C61162l mo84551c(ViewGroup viewGroup) {
        return viewGroup instanceof C56061i ? C61162l.Anchor : viewGroup instanceof C56074k ? C61162l.Secondary : viewGroup instanceof FinderLiveVisitorPluginLayout ? C61162l.Visitor : viewGroup instanceof FinderLiveReplayPluginLayout ? C61162l.Replay : viewGroup instanceof FinderLiveShoppingReplayPluginLayout ? C61162l.ShopReplay : C61162l.Invalid;
    }

    /* renamed from: d */
    public final void mo84552d(LiveRoomControllerStore liveRoomControllerStore, C61162l lVar) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C87412m.m108594g(lVar, "mode");
        mo84557i(liveRoomControllerStore, new C59449c(lVar, liveRoomControllerStore));
    }

    /* renamed from: e */
    public final void mo84553e(LiveRoomControllerStore liveRoomControllerStore) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        mo84557i(liveRoomControllerStore, new C8317d(liveRoomControllerStore));
    }

    /* renamed from: f */
    public final void mo84554f(LiveRoomControllerStore liveRoomControllerStore) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        mo84557i(liveRoomControllerStore, new C8318e(liveRoomControllerStore));
    }

    /* renamed from: g */
    public final void mo84555g(LiveRoomControllerStore liveRoomControllerStore) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        mo84557i(liveRoomControllerStore, new C8319f(liveRoomControllerStore));
    }

    /* renamed from: h */
    public final void mo84556h(LiveRoomControllerStore liveRoomControllerStore, C52005xq0 xq02) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        mo84557i(liveRoomControllerStore, new C59450g(liveRoomControllerStore, xq02));
    }

    /* renamed from: i */
    public final void mo84557i(LiveRoomControllerStore liveRoomControllerStore, C32224a<C13598b0> aVar) {
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C87412m.m108594g(aVar, "block");
        C61926c.m72668M(new C59451h(liveRoomControllerStore, aVar));
    }
}
