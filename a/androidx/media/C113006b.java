package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p427v4.media.MediaBrowserCompat;
import android.support.p427v4.p1171os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* renamed from: androidx.media.b */
public class C113006b extends MediaBrowserServiceCompat.C112999h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: d */
    public final /* synthetic */ ResultReceiver f338253d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113006b(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f338253d = resultReceiver;
    }

    /* renamed from: a */
    public void mo165362a(Object obj) {
        List list = (List) obj;
        if ((this.f338243c & 4) != 0 || list == null) {
            this.f338253d.mo164633b(-1, (Bundle) null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
        this.f338253d.mo164633b(0, bundle);
    }
}
