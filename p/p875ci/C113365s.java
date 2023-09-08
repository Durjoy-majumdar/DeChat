package p875ci;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ci.s */
public class C113365s implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C113357m f339162a;

    public C113365s(C113357m mVar) {
        this.f339162a = mVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "play sound error, player: %s", this.f339162a.f339147g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f339162a.f339147g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            C113357m mVar = this.f339162a;
            Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "play sound real error, player: %s,playerIsInit:%s", mVar.f339147g, Boolean.valueOf(mVar.f339146f));
        }
        this.f339162a.f339146f = false;
        return false;
    }
}
