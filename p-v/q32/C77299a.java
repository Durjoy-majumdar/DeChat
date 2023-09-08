package q32;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;

/* renamed from: q32.a */
public class C77299a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Set f225414d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference f225415e;

    /* renamed from: f */
    public final /* synthetic */ C77301c f225416f;

    public C77299a(C77301c cVar, Set set, WeakReference weakReference) {
        this.f225416f = cVar;
        this.f225414d = set;
        this.f225415e = weakReference;
    }

    public void run() {
        try {
            for (String str : this.f225414d) {
                if (this.f225415e.get() == null || this.f225416f.f225421d) {
                    Log.m105924i("AsyncSoundPool", "context = null or soundPool is stopped");
                    this.f225416f.f225418a.release();
                    this.f225416f.f225419b.clear();
                    ((HashMap) this.f225416f.f225420c).clear();
                    return;
                }
                AssetFileDescriptor openFd = ((Context) this.f225415e.get()).getResources().getAssets().openFd(str);
                C77301c cVar = this.f225416f;
                cVar.f225419b.put(str, Integer.valueOf(cVar.f225418a.load(openFd, 0)));
                openFd.close();
            }
        } catch (Exception e) {
            Log.m105920e("AsyncSoundPool", "load sound file error:" + e.getMessage());
        }
    }
}
