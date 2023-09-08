package p875ci;

import android.media.AudioManager;
import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.o */
public class C113361o implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ AudioManager f339157a;

    /* renamed from: b */
    public final /* synthetic */ C113357m f339158b;

    public C113361o(C113357m mVar, AudioManager audioManager) {
        this.f339158b = mVar;
        this.f339157a = audioManager;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound error, player: %s", this.f339158b.f339147g);
        this.f339157a.setMode(0);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339158b.f339147g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.f339158b.f339146f = false;
        return false;
    }
}
