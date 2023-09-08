package hw1;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.gallery.model.C93947c;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import hw1.C60218q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import qw1.C101316l;

/* renamed from: hw1.s */
public final class C98554s {

    /* renamed from: d */
    public static final C98554s f289007d = C98555a.f289011a;

    /* renamed from: a */
    public ArrayList<C98553p> f289008a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<GalleryItem$MediaItem> f289009b = new ArrayList<>();

    /* renamed from: c */
    public C60218q.C60219a f289010c = C60218q.C60219a.IDLE;

    /* renamed from: hw1.s$a */
    public static final class C98555a {

        /* renamed from: a */
        public static final C98554s f289011a = new C98554s((C8480h) null);
    }

    public C98554s(C8480h hVar) {
    }

    /* renamed from: a */
    public final void mo137927a(C98553p pVar) {
        C87412m.m108594g(pVar, "preload");
        this.f289008a.add(pVar);
    }

    /* renamed from: b */
    public final void mo137928b(C60218q.C60219a aVar, int i, int i2, int i3) {
        C87412m.m108594g(aVar, "state");
        Log.m105919d("MicroMsg.PreLoadManager", "dispatchPreload, %s %s %s %s.", aVar, this.f289010c, Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f289010c != aVar) {
            this.f289010c = aVar;
        }
        Iterator<C98553p> it = this.f289008a.iterator();
        while (it.hasNext()) {
            C98553p next = it.next();
            if (C60218q.C60219a.IDLE == aVar && next.mo85213a()) {
                mo137929c(next.mo85214b(aVar, this.f289010c, i, i2, i3));
            }
            if (!next.mo85213a()) {
                mo137929c(next.mo85214b(aVar, this.f289010c, i, i2, i3));
            }
        }
    }

    /* renamed from: c */
    public final void mo137929c(Set<Integer> set) {
        Log.m105919d("MicroMsg.PreLoadManager", "mediaItems.size: %s.", Integer.valueOf(this.f289009b.size()));
        for (Integer intValue : set) {
            int intValue2 = intValue.intValue();
            if (intValue2 < this.f289009b.size()) {
                C93947c g = C93958f.m118747g();
                String e = this.f289009b.get(intValue2).mo80159e();
                int type = this.f289009b.get(intValue2).getType();
                String str = this.f289009b.get(intValue2).f162747d;
                long j = this.f289009b.get(intValue2).f162751h;
                long j2 = this.f289009b.get(intValue2).f162752i;
                g.getClass();
                if (Util.isNullOrNil(e)) {
                    Log.m105928w("MicroMsg.CacheService", "trySubmitPreDecodeTask, file path is invalid.");
                } else {
                    String d = C101316l.m132905d(e, (C93974o.C93980f) null, -1);
                    Bitmap a = g.f271113a.mo128883a(C101316l.m132904c(e, (C93974o.C93980f) null, j2));
                    if (a == null || a.isRecycled()) {
                        Log.m105919d("MicroMsg.CacheService", "pre decode info: %s %s stack %s.", d, e, Util.getStack());
                        if (g.f271118f.size() > 82) {
                            Log.m105919d("MicroMsg.CacheService", "remove task: %s.", g.f271118f.mo137925f().f271120d);
                        }
                        g.f271118f.add(new C93947c.C93949b(e, type, str, j, 12288, j2));
                        g.mo128880h();
                    } else {
                        Log.m105926v("MicroMsg.CacheService", "trySubmitPreDecodeTask, no need decode.");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo137930d(List<? extends GalleryItem$MediaItem> list) {
        C87412m.m108594g(list, "mediaItems");
        Log.m105919d("MicroMsg.PreLoadManager", "syncMediaItems, size: %s.", Integer.valueOf(list.size()));
        this.f289009b.clear();
        this.f289009b.addAll(list);
    }
}
