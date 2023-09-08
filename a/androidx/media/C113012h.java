package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;
import java.util.List;
import p329d3.C58104c;

/* renamed from: androidx.media.h */
public class C113012h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338271d;

    /* renamed from: e */
    public final /* synthetic */ String f338272e;

    /* renamed from: f */
    public final /* synthetic */ IBinder f338273f;

    /* renamed from: g */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338274g;

    public C113012h(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar, String str, IBinder iBinder) {
        this.f338274g = jVar;
        this.f338271d = kVar;
        this.f338272e = str;
        this.f338273f = iBinder;
    }

    public void run() {
        MediaBrowserServiceCompat.C112989b orDefault = MediaBrowserServiceCompat.this.f338220g.getOrDefault(((MediaBrowserServiceCompat.C113003l) this.f338271d).mo165365a(), null);
        if (orDefault != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            String str = this.f338272e;
            F f = this.f338273f;
            mediaBrowserServiceCompat.getClass();
            if (f == null) {
                orDefault.f338228h.remove(str);
                return;
            }
            List list = orDefault.f338228h.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (f == ((C58104c) it.next()).f166179a) {
                        it.remove();
                    }
                }
                if (list.size() == 0) {
                    orDefault.f338228h.remove(str);
                }
            }
        }
    }
}
