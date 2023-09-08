package a43;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: a43.k */
public class C103317k implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C103310i f304622a;

    public C103317k(C103310i iVar) {
        this.f304622a = iVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f304622a.f304602f = 5;
            Log.m105929w("MicroMsg.RingPlayer", "RingPlayer playSound :onError", mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        }
        return false;
    }
}
