package p875ci;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.i */
public class C113353i implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C113348f f339142a;

    public C113353i(C113348f fVar) {
        this.f339142a = fVar;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.m105925i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound finish, player: %s", this.f339142a.f339129b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339142a.f339129b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
    }
}
