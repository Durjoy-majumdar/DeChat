package androidx.media;

import android.os.Bundle;
import android.support.p427v4.p1171os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.l */
public class C113016l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338286d;

    /* renamed from: e */
    public final /* synthetic */ String f338287e;

    /* renamed from: f */
    public final /* synthetic */ ResultReceiver f338288f;

    /* renamed from: g */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338289g;

    public C113016l(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f338289g = jVar;
        this.f338286d = kVar;
        this.f338287e = str;
        this.f338288f = resultReceiver;
    }

    public void run() {
        if (MediaBrowserServiceCompat.this.f338220g.getOrDefault(((MediaBrowserServiceCompat.C113003l) this.f338286d).mo165365a(), null) != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            String str = this.f338287e;
            ResultReceiver resultReceiver = this.f338288f;
            mediaBrowserServiceCompat.getClass();
            C113006b bVar = new C113006b(mediaBrowserServiceCompat, str, resultReceiver);
            bVar.f338243c = 4;
            bVar.mo165363b(null);
            if (!bVar.f338242b) {
                throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
            }
        }
    }
}
