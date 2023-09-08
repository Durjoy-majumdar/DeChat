package p875ci;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.k */
public class C113355k implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C113348f f339144a;

    public C113355k(C113348f fVar) {
        this.f339144a = fVar;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.m105925i("MicroMsg.Notification.Tool.Sound", "play sound finish, player: %s", this.f339144a.f339129b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339144a.f339129b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            C113348f fVar = this.f339144a;
            Log.m105925i("MicroMsg.Notification.Tool.Sound", "play sound real finish, player: %s,playerIsInit:%s", fVar.f339129b, Boolean.valueOf(fVar.f339128a));
        }
    }
}
