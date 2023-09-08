package androidx.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.p427v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media.d */
public class C113008d extends MediaBrowserServiceCompat.C112999h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113000i f338255d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f338256e;

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat.C112996f f338257f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113008d(MediaBrowserServiceCompat.C112996f fVar, Object obj, MediaBrowserServiceCompat.C113000i iVar, Bundle bundle) {
        super(obj);
        this.f338257f = fVar;
        this.f338255d = iVar;
        this.f338256e = bundle;
    }

    /* renamed from: a */
    public void mo165362a(Object obj) {
        List<MediaBrowserCompat.MediaItem> list = (List) obj;
        if (list == null) {
            this.f338255d.mo165364a(null);
            return;
        }
        if ((this.f338243c & 1) != 0) {
            list = MediaBrowserServiceCompat.this.mo165349a(list, this.f338256e);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaBrowserCompat.MediaItem writeToParcel : list) {
            Parcel obtain = Parcel.obtain();
            writeToParcel.writeToParcel(obtain, 0);
            arrayList.add(obtain);
        }
        this.f338255d.mo165364a(arrayList);
    }
}
