package p875ci;

import android.media.AudioManager;
import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.n */
public class C113360n implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ AudioManager f339155a;

    /* renamed from: b */
    public final /* synthetic */ C113357m f339156b;

    public C113360n(C113357m mVar, AudioManager audioManager) {
        this.f339156b = mVar;
        this.f339155a = audioManager;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound finish, player: %s", this.f339156b.f339147g);
        this.f339155a.setMode(0);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339156b.f339147g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.f339156b.f339146f = false;
    }
}
