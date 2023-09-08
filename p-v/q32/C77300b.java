package q32;

import android.media.SoundPool;
import java.util.HashMap;

/* renamed from: q32.b */
public class C77300b implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ C77301c f225417a;

    public C77300b(C77301c cVar) {
        this.f225417a = cVar;
    }

    public void onLoadComplete(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            ((HashMap) this.f225417a.f225420c).put(Integer.valueOf(i), Boolean.TRUE);
            return;
        }
        ((HashMap) this.f225417a.f225420c).put(Integer.valueOf(i), Boolean.FALSE);
    }
}
