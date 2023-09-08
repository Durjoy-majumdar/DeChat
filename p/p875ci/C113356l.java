package p875ci;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.l */
public class C113356l implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C113348f f339145a;

    public C113356l(C113348f fVar) {
        this.f339145a = fVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105925i("MicroMsg.Notification.Tool.Sound", "play sound error, player: %s", this.f339145a.f339129b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339145a.f339129b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            C113348f fVar = this.f339145a;
            Log.m105925i("MicroMsg.Notification.Tool.Sound", "play sound real error, player: %s,playerIsInit:%s", fVar.f339129b, Boolean.valueOf(fVar.f339128a));
        }
        return false;
    }
}
