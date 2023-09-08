package p875ci;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.q */
public class C113363q implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C113357m f339160a;

    public C113363q(C113357m mVar) {
        this.f339160a = mVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound error, player: %s", this.f339160a.f339147g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339160a.f339147g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.f339160a.f339146f = false;
        return false;
    }
}
