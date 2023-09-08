package e21;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: e21.b0 */
public class C116640b0 implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ String f349744a;

    /* renamed from: b */
    public final /* synthetic */ MediaPlayer f349745b;

    /* renamed from: c */
    public final /* synthetic */ MediaPlayer.OnCompletionListener f349746c;

    public C116640b0(String str, MediaPlayer mediaPlayer, MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f349744a = str;
        this.f349745b = mediaPlayer;
        this.f349746c = onCompletionListener;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f349744a;
        Log.m105925i("MicroMsg.F2fRcvVoiceListener", "play completion mp:%d  path:%s", objArr);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = this.f349745b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        MediaPlayer.OnCompletionListener onCompletionListener = this.f349746c;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }
}
