package p875ci;

import android.media.AudioManager;
import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.h */
public class C113352h implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ AudioManager f339140a;

    /* renamed from: b */
    public final /* synthetic */ C113348f f339141b;

    public C113352h(C113348f fVar, AudioManager audioManager) {
        this.f339141b = fVar;
        this.f339140a = audioManager;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105925i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound error, player: %s", this.f339141b.f339129b);
        this.f339140a.setMode(0);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339141b.f339129b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        return false;
    }
}
