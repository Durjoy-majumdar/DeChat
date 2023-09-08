package pm1;

import android.os.MessageQueue;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pm1.u */
public final class C62404u implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePlayerViewRecycler f177368d;

    public C62404u(NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler) {
        this.f177368d = nearbyLivePlayerViewRecycler;
    }

    public final boolean queueIdle() {
        if (this.f177368d.f160213d.size() < 2) {
            NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler = this.f177368d;
            if (!nearbyLivePlayerViewRecycler.f160216g) {
                nearbyLivePlayerViewRecycler.f160213d.add(nearbyLivePlayerViewRecycler.mo78382c3());
                this.f177368d.f160217h++;
                return true;
            }
        }
        Log.m105924i("NearbyLivePlayerViewRecycler", "[preInflateVideoView] completed! preInflateCount=" + this.f177368d.f160217h + " isReleased=" + this.f177368d.f160216g);
        return false;
    }
}
