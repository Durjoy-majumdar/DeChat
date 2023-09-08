package p875ci;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.p */
public class C113362p implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C113357m f339159a;

    public C113362p(C113357m mVar) {
        this.f339159a = mVar;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound finish, player: %s", this.f339159a.f339147g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339159a.f339147g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.f339159a.f339146f = false;
    }
}
