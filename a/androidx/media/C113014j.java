package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;

/* renamed from: androidx.media.j */
public class C113014j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338278d;

    /* renamed from: e */
    public final /* synthetic */ int f338279e;

    /* renamed from: f */
    public final /* synthetic */ String f338280f;

    /* renamed from: g */
    public final /* synthetic */ int f338281g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f338282h;

    /* renamed from: i */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338283i;

    public C113014j(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar, int i, String str, int i2, Bundle bundle) {
        this.f338283i = jVar;
        this.f338278d = kVar;
        this.f338279e = i;
        this.f338280f = str;
        this.f338281g = i2;
        this.f338282h = bundle;
    }

    public void run() {
        MediaBrowserServiceCompat.C112989b bVar;
        IBinder a = ((MediaBrowserServiceCompat.C113003l) this.f338278d).mo165365a();
        MediaBrowserServiceCompat.this.f338220g.remove(a);
        Iterator<MediaBrowserServiceCompat.C112989b> it = MediaBrowserServiceCompat.this.f338219f.iterator();
        while (true) {
            bVar = null;
            if (!it.hasNext()) {
                break;
            }
            MediaBrowserServiceCompat.C112989b next = it.next();
            if (next.f338226f == this.f338279e) {
                if (TextUtils.isEmpty(this.f338280f) || this.f338281g <= 0) {
                    bVar = new MediaBrowserServiceCompat.C112989b(next.f338224d, next.f338225e, next.f338226f, this.f338282h, this.f338278d);
                }
                it.remove();
            }
        }
        if (bVar == null) {
            bVar = new MediaBrowserServiceCompat.C112989b(this.f338280f, this.f338281g, this.f338279e, this.f338282h, this.f338278d);
        }
        MediaBrowserServiceCompat.this.f338220g.put(a, bVar);
        try {
            a.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
        }
    }
}
