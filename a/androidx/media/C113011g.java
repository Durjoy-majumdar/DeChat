package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;
import p329d3.C58104c;
import p379r3.C118217c;

/* renamed from: androidx.media.g */
public class C113011g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338266d;

    /* renamed from: e */
    public final /* synthetic */ String f338267e;

    /* renamed from: f */
    public final /* synthetic */ IBinder f338268f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f338269g;

    /* renamed from: h */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338270h;

    public C113011g(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar, String str, IBinder iBinder, Bundle bundle) {
        this.f338270h = jVar;
        this.f338266d = kVar;
        this.f338267e = str;
        this.f338268f = iBinder;
        this.f338269g = bundle;
    }

    public void run() {
        MediaBrowserServiceCompat.C112989b orDefault = MediaBrowserServiceCompat.this.f338220g.getOrDefault(((MediaBrowserServiceCompat.C113003l) this.f338266d).mo165365a(), null);
        if (orDefault != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            String str = this.f338267e;
            F f = this.f338268f;
            Bundle bundle = this.f338269g;
            mediaBrowserServiceCompat.getClass();
            List<C58104c> list = orDefault.f338228h.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            for (C58104c cVar : list) {
                if (f == cVar.f166179a && C118217c.m166771a(bundle, (Bundle) cVar.f166180b)) {
                    return;
                }
            }
            list.add(new C58104c(f, bundle));
            orDefault.f338228h.put(str, list);
            C113005a aVar = new C113005a(mediaBrowserServiceCompat, str, orDefault, str, bundle, (Bundle) null);
            if (bundle == null) {
                mediaBrowserServiceCompat.mo165351c(str, aVar);
            } else {
                aVar.f338243c = 1;
                mediaBrowserServiceCompat.mo165351c(str, aVar);
            }
            if (!aVar.f338242b) {
                throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + orDefault.f338224d + " id=" + str);
            }
        }
    }
}
