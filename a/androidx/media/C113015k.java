package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.k */
public class C113015k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338284d;

    /* renamed from: e */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338285e;

    public C113015k(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar) {
        this.f338285e = jVar;
        this.f338284d = kVar;
    }

    public void run() {
        IBinder a = ((MediaBrowserServiceCompat.C113003l) this.f338284d).mo165365a();
        MediaBrowserServiceCompat.C112989b remove = MediaBrowserServiceCompat.this.f338220g.remove(a);
        if (remove != null) {
            a.unlinkToDeath(remove, 0);
        }
    }
}
