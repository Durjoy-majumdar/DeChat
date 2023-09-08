package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p427v4.p1171os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.i */
public class C113013i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338275d;

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f338276e;

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338277f;

    public C113013i(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar, String str, ResultReceiver resultReceiver) {
        this.f338277f = jVar;
        this.f338275d = kVar;
        this.f338276e = resultReceiver;
    }

    public void run() {
        if (MediaBrowserServiceCompat.this.f338220g.getOrDefault(((MediaBrowserServiceCompat.C113003l) this.f338275d).mo165365a(), null) != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ResultReceiver resultReceiver = this.f338276e;
            mediaBrowserServiceCompat.getClass();
            if (true && true) {
                resultReceiver.mo164633b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", (Parcelable) null);
            resultReceiver.mo164633b(0, bundle);
        }
    }
}
