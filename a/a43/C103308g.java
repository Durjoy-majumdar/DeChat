package a43;

import android.media.MediaPlayer;

/* renamed from: a43.g */
public class C103308g implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C103310i f304595a;

    public C103308g(C103310i iVar) {
        this.f304595a = iVar;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        long currentTimeMillis = System.currentTimeMillis();
        C103310i iVar = this.f304595a;
        if (currentTimeMillis - iVar.f304603g > 70000) {
            iVar.f304602f = 4;
        }
    }
}
