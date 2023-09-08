package kd0;

import android.media.MediaPlayer;
import com.tencent.p014mm.modelvoice.MediaRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import kd0.C21323o;
import p375qh.C22086d;

public final /* synthetic */ class o$c$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21323o.C21326c f60268d;

    public /* synthetic */ o$c$$a(C21323o.C21326c cVar) {
        this.f60268d = cVar;
    }

    public final void run() {
        C21322l lVar;
        C21323o.C21326c cVar = this.f60268d;
        cVar.getClass();
        synchronized (C21323o.f60231F) {
            try {
                int i = C21323o.f60233H;
                C21323o oVar = C21323o.this;
                if (i == oVar.f60250l && (lVar = oVar.f60256r) != null) {
                    MediaRecorder.SilkDecUnInit(lVar.f60230a);
                    Log.m105925i("MicroMsg.SilkPlayer", "[%d] SilkDecUnInit", Integer.valueOf(C21323o.this.f60250l));
                    C21323o.f60233H = -1;
                    C21323o.this.f60248j = 0;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (C21323o.this.f60247i != 3) {
            C22086d.C22087a aVar = C21323o.this.f60242d;
            if (aVar != null) {
                aVar.onCompletion();
            }
            MediaPlayer.OnCompletionListener onCompletionListener = C21323o.this.f60235B;
            if (onCompletionListener != null) {
                ((C21323o.C21324a) onCompletionListener).onCompletion((MediaPlayer) null);
            }
        } else if (C21323o.this.f60239a != null) {
            Log.m105924i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            try {
                C21323o.this.mo33350u();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SilkPlayer", "mAudioTrack.stop() error: %s", e.getMessage());
            }
        }
    }
}
