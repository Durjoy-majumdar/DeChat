package kd0;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kd0.c0 */
public class C21318c0 implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C21320e0 f60220a;

    public C21318c0(C21320e0 e0Var) {
        this.f60220a = e0Var;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.m105918d("MicroMsg.VoicePlayer", "OnCompletionListener");
        C21320e0 e0Var = this.f60220a;
        if (e0Var.f60226e != null && e0Var.f60228g) {
            Log.m105918d("MicroMsg.VoicePlayer", "OnCompletionListener abandonFocus");
            this.f60220a.f60226e.mo139414a();
        }
        if (this.f60220a.f60224c != null) {
            Log.m105918d("MicroMsg.VoicePlayer", "OnCompletionListener onCompletion");
            this.f60220a.f60224c.onCompletion();
        }
        try {
            Log.m105918d("MicroMsg.VoicePlayer", "OnCompletionListener release");
            this.f60220a.f60222a.reset();
            this.f60220a.f60222a.release();
            this.f60220a.f60227f = 0;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.VoicePlayer", "setCompletion File[" + this.f60220a.f60223b + "] ErrMsg[" + e.getStackTrace() + "]");
        }
    }
}
