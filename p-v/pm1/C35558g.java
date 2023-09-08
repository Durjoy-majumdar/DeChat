package pm1;

import android.os.SystemClock;
import android.view.View;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pm1.g */
public final class C35558g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f95070d;

    /* renamed from: e */
    public final /* synthetic */ View f95071e;

    /* renamed from: f */
    public final /* synthetic */ NearbyLivePreviewView f95072f;

    /* renamed from: g */
    public final /* synthetic */ C62381d f95073g;

    /* renamed from: h */
    public final /* synthetic */ C0797z f95074h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35558g(C32224a<C13598b0> aVar, View view, NearbyLivePreviewView nearbyLivePreviewView, C62381d dVar, C0797z zVar) {
        super(0);
        this.f95070d = aVar;
        this.f95071e = view;
        this.f95072f = nearbyLivePreviewView;
        this.f95073g = dVar;
        this.f95074h = zVar;
    }

    public Object invoke() {
        C32224a<C13598b0> aVar = this.f95070d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f95071e.setTag(C0966R.C0970id.had, Boolean.valueOf(!this.f95072f.f160231o));
        this.f95071e.setTag(C0966R.C0970id.ha_, Long.valueOf(SystemClock.elapsedRealtime()));
        String r = this.f95073g.mo87439r();
        Log.m105924i(r, "checkAutoPlayByOutside onFirstFrameRendStartCallback feed=" + this.f95074h + " tabId:" + this.f95073g.f177289e);
        return C13598b0.f38549a;
    }
}
