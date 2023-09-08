package e21;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: e21.a0 */
public class C116639a0 implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ MediaPlayer f349742a;

    /* renamed from: b */
    public final /* synthetic */ MediaPlayer.OnErrorListener f349743b;

    public C116639a0(MediaPlayer mediaPlayer, MediaPlayer.OnErrorListener onErrorListener) {
        this.f349742a = mediaPlayer;
        this.f349743b = onErrorListener;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "onError, what: %d, extra: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception unused) {
            }
        }
        MediaPlayer mediaPlayer2 = this.f349742a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        MediaPlayer.OnErrorListener onErrorListener = this.f349743b;
        if (onErrorListener != null) {
            onErrorListener.onError(mediaPlayer, i, i2);
        }
        return false;
    }
}
