package androidx.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.p427v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* renamed from: androidx.media.a */
public class C113005a extends MediaBrowserServiceCompat.C112999h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C112989b f338248d;

    /* renamed from: e */
    public final /* synthetic */ String f338249e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f338250f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f338251g;

    /* renamed from: h */
    public final /* synthetic */ MediaBrowserServiceCompat f338252h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113005a(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, MediaBrowserServiceCompat.C112989b bVar, String str, Bundle bundle, Bundle bundle2) {
        super(obj);
        this.f338252h = mediaBrowserServiceCompat;
        this.f338248d = bVar;
        this.f338249e = str;
        this.f338250f = bundle;
        this.f338251g = bundle2;
    }

    /* renamed from: a */
    public void mo165362a(Object obj) {
        List<MediaBrowserCompat.MediaItem> list = (List) obj;
        MediaBrowserServiceCompat.C112989b orDefault = this.f338252h.f338220g.getOrDefault(((MediaBrowserServiceCompat.C113003l) this.f338248d.f338227g).mo165365a(), null);
        MediaBrowserServiceCompat.C112989b bVar = this.f338248d;
        if (orDefault == bVar) {
            if ((this.f338243c & 1) != 0) {
                list = this.f338252h.mo165349a(list, this.f338250f);
            }
            try {
                ((MediaBrowserServiceCompat.C113003l) this.f338248d.f338227g).mo165366b(this.f338249e, list, this.f338250f, this.f338251g);
            } catch (RemoteException unused) {
                String str = this.f338248d.f338224d;
            }
        } else if (MediaBrowserServiceCompat.f338216i) {
            String str2 = bVar.f338224d;
        }
    }
}
