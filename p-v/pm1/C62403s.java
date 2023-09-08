package pm1;

import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: pm1.s */
public final class C62403s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePlayerViewRecycler f177367d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62403s(NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler) {
        super(0);
        this.f177367d = nearbyLivePlayerViewRecycler;
    }

    public Object invoke() {
        Iterator<WeakReference<NearbyLivePreviewView>> it = this.f177367d.f160214e.iterator();
        while (it.hasNext()) {
            NearbyLivePreviewView nearbyLivePreviewView = (NearbyLivePreviewView) it.next().get();
            if (nearbyLivePreviewView != null) {
                Log.m105924i("NearbyLivePlayerViewRecycler", "checkStopAllView stop view:" + nearbyLivePreviewView + " isPlaying:" + nearbyLivePreviewView.isPlaying());
                if (nearbyLivePreviewView.isPlaying()) {
                    nearbyLivePreviewView.mo78397l();
                    nearbyLivePreviewView.mo78388g();
                }
            }
        }
        return C13598b0.f38549a;
    }
}
