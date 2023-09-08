package kd0;

import android.media.AudioTrack;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.Future;
import kd0.C21323o;
import zt3.C119157j;

public class o$c$$c implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ Future f60270a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f60271b;

    /* renamed from: c */
    public final /* synthetic */ C21323o.C21326c f60272c;

    public o$c$$c(C21323o.C21326c cVar, Future future, Runnable runnable) {
        this.f60272c = cVar;
        this.f60270a = future;
        this.f60271b = runnable;
    }

    public void onMarkerReached(AudioTrack audioTrack) {
        Log.m105924i("MicroMsg.SilkPlayer", "onMarkerReached: ");
        Future future = this.f60270a;
        if (future == null || future.cancel(false)) {
            Future<?> future2 = C21323o.this.f60237D;
            if (future2 != null && !future2.isDone()) {
                Log.m105920e("MicroMsg.SilkPlayer", "has uncomplete task");
            }
            C21323o.this.f60234A = null;
            C21323o.this.f60264z = false;
            C21323o.this.f60237D = ((C119157j) C119157j.f356862d).mo183875f(this.f60271b);
            return;
        }
        Log.m105920e("MicroMsg.SilkPlayer", "onMarkerReached: reached too late");
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
