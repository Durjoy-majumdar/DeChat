package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.e */
public class C113009e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338258d;

    /* renamed from: e */
    public final /* synthetic */ String f338259e;

    /* renamed from: f */
    public final /* synthetic */ int f338260f;

    /* renamed from: g */
    public final /* synthetic */ int f338261g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f338262h;

    /* renamed from: i */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338263i;

    public C113009e(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar, String str, int i, int i2, Bundle bundle) {
        this.f338263i = jVar;
        this.f338258d = kVar;
        this.f338259e = str;
        this.f338260f = i;
        this.f338261g = i2;
        this.f338262h = bundle;
    }

    public void run() {
        IBinder a = ((MediaBrowserServiceCompat.C113003l) this.f338258d).mo165365a();
        MediaBrowserServiceCompat.this.f338220g.remove(a);
        MediaBrowserServiceCompat.C112989b bVar = new MediaBrowserServiceCompat.C112989b(this.f338259e, this.f338260f, this.f338261g, this.f338262h, this.f338258d);
        MediaBrowserServiceCompat.this.getClass();
        bVar.f338229i = MediaBrowserServiceCompat.this.mo165350b(this.f338259e, this.f338261g, this.f338262h);
        MediaBrowserServiceCompat.this.getClass();
        if (bVar.f338229i == null) {
            Class<C113009e> cls = C113009e.class;
            try {
                MediaBrowserServiceCompat.C113003l lVar = (MediaBrowserServiceCompat.C113003l) this.f338258d;
                lVar.getClass();
                Message obtain = Message.obtain();
                obtain.what = 2;
                obtain.arg1 = 2;
                obtain.setData((Bundle) null);
                lVar.f338246a.send(obtain);
            } catch (RemoteException unused) {
            }
        } else {
            try {
                MediaBrowserServiceCompat.this.f338220g.put(a, bVar);
                a.linkToDeath(bVar, 0);
                MediaBrowserServiceCompat.this.getClass();
            } catch (RemoteException unused2) {
                MediaBrowserServiceCompat.this.f338220g.remove(a);
            }
        }
    }
}
