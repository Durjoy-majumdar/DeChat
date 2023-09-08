package androidx.media;

import android.os.Bundle;
import android.support.p427v4.p1171os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Objects;

/* renamed from: androidx.media.m */
public class C113017m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113002k f338290d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f338291e;

    /* renamed from: f */
    public final /* synthetic */ ResultReceiver f338292f;

    /* renamed from: g */
    public final /* synthetic */ MediaBrowserServiceCompat.C113001j f338293g;

    public C113017m(MediaBrowserServiceCompat.C113001j jVar, MediaBrowserServiceCompat.C113002k kVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f338293g = jVar;
        this.f338290d = kVar;
        this.f338291e = bundle;
        this.f338292f = resultReceiver;
    }

    public void run() {
        if (MediaBrowserServiceCompat.this.f338220g.getOrDefault(((MediaBrowserServiceCompat.C113003l) this.f338290d).mo165365a(), null) == null) {
            Objects.toString(this.f338291e);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        ResultReceiver resultReceiver = this.f338292f;
        mediaBrowserServiceCompat.getClass();
        resultReceiver.mo164633b(-1, (Bundle) null);
    }
}
