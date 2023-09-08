package kd0;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kd0.d0 */
public class C21319d0 implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C21320e0 f60221a;

    public C21319d0(C21320e0 e0Var) {
        this.f60221a = e0Var;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105918d("MicroMsg.VoicePlayer", "OnErrorListener");
        C21320e0 e0Var = this.f60221a;
        if (e0Var.f60226e != null && e0Var.f60228g) {
            Log.m105918d("MicroMsg.VoicePlayer", "OnErrorListener abandonFocus");
            this.f60221a.f60226e.mo139414a();
        }
        if (this.f60221a.f60225d != null) {
            Log.m105918d("MicroMsg.VoicePlayer", "OnErrorListener onError");
            this.f60221a.f60225d.mo35072a();
        }
        try {
            Log.m105918d("MicroMsg.VoicePlayer", "OnErrorListener release");
            this.f60221a.f60222a.reset();
            this.f60221a.f60222a.release();
            this.f60221a.f60227f = -1;
            return false;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.VoicePlayer", "setErrorListener File[" + this.f60221a.f60223b + "] ErrMsg[" + e.getStackTrace() + "]");
            return false;
        }
    }
}
