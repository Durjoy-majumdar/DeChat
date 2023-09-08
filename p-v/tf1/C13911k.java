package tf1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import tf1.C13914m;

/* renamed from: tf1.k */
public abstract class C13911k<D extends C13914m> {
    public static final C13912a Companion = new C13912a((C8480h) null);
    /* access modifiers changed from: private */
    public static final boolean DEBUG = false;
    private String TAG = ("Finder." + getClass().getSimpleName() + '_' + hashCode());

    /* renamed from: tf1.k$a */
    public static final class C13912a {
        public C13912a(C8480h hVar) {
        }
    }

    public static /* synthetic */ void fetch$default(C13911k kVar, Object obj, C13910j jVar, boolean z, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            kVar.fetch(obj, jVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
    }

    public static /* synthetic */ void fetchLoadMore$default(C13911k kVar, C13910j jVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            kVar.fetchLoadMore(jVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLoadMore");
    }

    public void alive() {
        Log.m105924i(getTAG(), "alive.");
    }

    public void dead() {
        Log.m105924i(getTAG(), "dead.");
    }

    public void fetch(Object obj, C13910j<D> jVar, boolean z) {
        C87412m.m108594g(jVar, "callback");
    }

    public abstract void fetchInit(C13910j<D> jVar);

    public abstract void fetchLoadMore(C13910j<D> jVar, boolean z);

    public void fetchPreload(C13910j<D> jVar) {
        C87412m.m108594g(jVar, "callback");
    }

    public abstract void fetchRefresh(C13910j<D> jVar);

    public String getTAG() {
        return this.TAG;
    }

    public void setTAG(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.TAG = str;
    }
}
