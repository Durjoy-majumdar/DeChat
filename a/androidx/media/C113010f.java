package androidx.media;

import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.f */
public class C113010f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338264d;

    /* renamed from: e */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338265e;

    public C113010f(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar) {
        this.f338265e = jVar;
        this.f338264d = kVar;
    }

    public void run() {
        MediaBrowserServiceCompat.C112989b remove = MediaBrowserServiceCompat.this.f338220g.remove(((MediaBrowserServiceCompat.C113003l) this.f338264d).mo165365a());
        if (remove != null) {
            ((MediaBrowserServiceCompat.C113003l) remove.f338227g).mo165365a().unlinkToDeath(remove, 0);
        }
    }
}
