package pm1;

import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import sx3.C36907w;

/* renamed from: pm1.v */
public final class C62405v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePlayerViewRecycler f177369d;

    public C62405v(NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler) {
        this.f177369d = nearbyLivePlayerViewRecycler;
    }

    public final void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("onFinish createdViews ");
        ConcurrentLinkedQueue<WeakReference<NearbyLivePreviewView>> concurrentLinkedQueue = this.f177369d.f160214e;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(concurrentLinkedQueue, 10));
        for (WeakReference hashCode : concurrentLinkedQueue) {
            arrayList.add(Integer.valueOf(hashCode.hashCode()));
        }
        sb.append(arrayList);
        Log.m105924i("NearbyLivePlayerViewRecycler", sb.toString());
        for (WeakReference weakReference : this.f177369d.f160214e) {
            NearbyLivePreviewView nearbyLivePreviewView = (NearbyLivePreviewView) weakReference.get();
            if (nearbyLivePreviewView != null) {
                nearbyLivePreviewView.mo78397l();
                nearbyLivePreviewView.mo78388g();
            }
        }
        this.f177369d.f160214e.clear();
        this.f177369d.f160213d.clear();
        this.f177369d.f160215f.removeCallbacksAndMessages((Object) null);
    }
}
