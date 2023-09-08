package p875ci;

import android.media.AudioManager;
import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.g */
public class C113351g implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ AudioManager f339138a;

    /* renamed from: b */
    public final /* synthetic */ C113348f f339139b;

    public C113351g(C113348f fVar, AudioManager audioManager) {
        this.f339139b = fVar;
        this.f339138a = audioManager;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.m105925i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound finish, player: %s", this.f339139b.f339129b);
        this.f339138a.setMode(0);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339139b.f339129b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
    }
}
