package androidx.media;

import android.os.Parcel;
import android.support.p427v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media.c */
public class C113007c extends MediaBrowserServiceCompat.C112999h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C113000i f338254d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113007c(MediaBrowserServiceCompat.C112992d dVar, Object obj, MediaBrowserServiceCompat.C113000i iVar) {
        super(obj);
        this.f338254d = iVar;
    }

    /* renamed from: a */
    public void mo165362a(Object obj) {
        ArrayList arrayList;
        List<MediaBrowserCompat.MediaItem> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                Parcel obtain = Parcel.obtain();
                writeToParcel.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        this.f338254d.mo165364a(arrayList);
    }
}
