package a43;

import android.media.MediaPlayer;
import androidx.camera.core.FocusMeteringAction;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ou0.C110066a;
import ou0.C110071c;
import pu0.C110248b;

/* renamed from: a43.j */
public class C103316j implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C103310i f304621a;

    public C103316j(C103310i iVar) {
        this.f304621a = iVar;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        Class cls = C110248b.class;
        mediaPlayer.release();
        long currentTimeMillis = System.currentTimeMillis();
        C103310i iVar = this.f304621a;
        if (currentTimeMillis - iVar.f304604h > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            iVar.f304602f = 8;
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
            C110066a aVar = ((C110248b) c).f329779e;
            if (aVar == null) {
                aVar = new C110071c();
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
                ((C110248b) c2).f329781g[0] = "music";
            }
            aVar.mo157511t();
        }
    }
}
