package a43;

import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: a43.h */
public class C103309h implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C103310i f304596a;

    public C103309h(C103310i iVar) {
        this.f304596a = iVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f304596a.f304602f = 1;
        Log.m105928w("MicroMsg.RingPlayer", "RingPlayer startPlayCustomRing MediaPlayer onError, what: " + i + ":extra:" + i2);
        return false;
    }
}
