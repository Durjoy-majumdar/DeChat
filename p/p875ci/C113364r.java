package p875ci;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.r */
public class C113364r implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C113357m f339161a;

    public C113364r(C113357m mVar) {
        this.f339161a = mVar;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "play sound finish, player: %s", this.f339161a.f339147g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339161a.f339147g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            C113357m mVar = this.f339161a;
            Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "play sound real finish, player: %s,playerIsInit:%s", mVar.f339147g, Boolean.valueOf(mVar.f339146f));
        }
        this.f339161a.f339146f = false;
    }
}
