package p875ci;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.j */
public class C113354j implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C113348f f339143a;

    public C113354j(C113348f fVar) {
        this.f339143a = fVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105925i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound error, player: %s", this.f339143a.f339129b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339143a.f339129b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        return false;
    }
}
