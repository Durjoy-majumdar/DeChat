package com.tencent.p014mm.plugin.gallery.model;

import android.database.Cursor;
import android.net.Uri;
import com.tencent.map.geolocation.sapp.TencentLocationUtils;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import p143ds.C97527l;
import p447aw.C103918d;
import zt3.C119143b;

/* renamed from: com.tencent.mm.plugin.gallery.model.n */
public final class C93970n implements C97527l {

    /* renamed from: a */
    public HashSet<C93964k.C93965a> f271191a = new HashSet<>();

    /* renamed from: b */
    public HashSet<C93964k.C93965a> f271192b = new HashSet<>();

    /* renamed from: c */
    public HashSet<C93964k.C93967c> f271193c = new HashSet<>();

    /* renamed from: d */
    public HashSet<C93964k.C93966b> f271194d = new HashSet<>();

    /* renamed from: e */
    public C93964k f271195e;

    /* renamed from: f */
    public int f271196f = 3;

    /* renamed from: g */
    public int f271197g = 1;

    /* renamed from: com.tencent.mm.plugin.gallery.model.n$a */
    public class C93971a implements Runnable {
        public C93971a() {
        }

        public void run() {
            LinkedList<GalleryItem$AlbumItem> linkedList;
            Log.m105925i("MicroMsg.MediaQueryService", "real run, %s.", this);
            LinkedList<GalleryItem$AlbumItem> a = C93970n.this.f271195e.mo128866a();
            C93970n nVar = C93970n.this;
            int size = nVar.f271191a.size();
            C93964k.C93965a[] aVarArr = new C93964k.C93965a[size];
            nVar.f271191a.toArray(aVarArr);
            for (int i = 0; i < size; i++) {
                aVarArr[i].mo86519z7(a);
            }
            Uri uri = C93974o.f271204e;
            C93974o oVar = C93974o.C93984j.f271235a;
            oVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "queryAlbum without READ_EXTERNAL_STORAGE.");
                linkedList = oVar.mo128916a(arrayList);
            } else {
                Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "has permiss.");
                Cursor query = oVar.f271205a.query(C93974o.f271204e.buildUpon().appendEncodedPath("private").build(), oVar.mo128917b(), (String) null, (String[]) null, (String) null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("categoryID");
                    int columnIndex2 = query.getColumnIndex("categoryName");
                    int columnIndex3 = query.getColumnIndex("albumID");
                    int columnIndex4 = query.getColumnIndex("albumName");
                    int columnIndex5 = query.getColumnIndex("albumCapacity");
                    int columnIndex6 = query.getColumnIndex("coverID");
                    int columnIndex7 = query.getColumnIndex("coverData");
                    int columnIndex8 = query.getColumnIndex("albumTag");
                    while (query.moveToNext()) {
                        C93974o.C93976b bVar = new C93974o.C93976b();
                        if (!(columnIndex == -1 || columnIndex2 == -1)) {
                            bVar.f271209b = new C93974o.C93979e(query.getString(columnIndex), query.getString(columnIndex2));
                        }
                        bVar.f271210c = query.getString(columnIndex3);
                        bVar.f271211d = query.getString(columnIndex4);
                        bVar.f271212e = Util.safeParseInt(query.getString(columnIndex5));
                        bVar.f271213f = Util.safeParseLong(query.getString(columnIndex6));
                        bVar.f271214g = query.getString(columnIndex7);
                        if (columnIndex8 != -1) {
                            String string = query.getString(columnIndex8);
                            if (!Util.isNullOrNil(string)) {
                                bVar.f271215h = oVar.mo128920e(string, bVar.f271210c);
                            }
                        }
                        arrayList.add(bVar);
                    }
                    query.close();
                }
                linkedList = oVar.mo128916a(arrayList);
            }
            C93970n nVar2 = C93970n.this;
            int size2 = nVar2.f271192b.size();
            C93964k.C93965a[] aVarArr2 = new C93964k.C93965a[size2];
            nVar2.f271192b.toArray(aVarArr2);
            for (int i2 = 0; i2 < size2; i2++) {
                aVarArr2[i2].mo86519z7(linkedList);
            }
        }

        public String toString() {
            return super.toString() + "|queryAlbums";
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.n$b */
    public class C93972b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f271199d;

        /* renamed from: e */
        public final /* synthetic */ int f271200e;

        /* renamed from: f */
        public final /* synthetic */ long f271201f;

        /* renamed from: com.tencent.mm.plugin.gallery.model.n$b$a */
        public class C93973a implements C93964k.C93967c {
            public C93973a() {
            }

            /* renamed from: B3 */
            public void mo80207B3(LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
                Log.m105925i("MicroMsg.MediaQueryService", "queryMediaItemsInAlbum callback, size: %d.", Integer.valueOf(linkedList.size()));
                C93970n.m118776c(C93970n.this, linkedList, j, z);
            }
        }

        public C93972b(String str, int i, long j) {
            this.f271199d = str;
            this.f271200e = i;
            this.f271201f = j;
        }

        public void run() {
            try {
                Log.m105924i("MicroMsg.MediaQueryService", "queryMediaItemsInAlbum Begin...");
                C93970n.this.f271195e.mo128867b(this.f271199d, this.f271200e, new C93973a(), this.f271201f);
            } catch (SecurityException e) {
                Log.printErrStackTrace("MicroMsg.MediaQueryService", e, "", new Object[0]);
                C93970n.m118776c(C93970n.this, new LinkedList(), this.f271201f, false);
            }
        }

        public String toString() {
            return super.toString() + "|queryMediaInAlbums";
        }
    }

    /* renamed from: c */
    public static void m118776c(C93970n nVar, LinkedList linkedList, long j, boolean z) {
        C93964k.C93966b[] bVarArr;
        int i;
        int i2;
        C93970n nVar2 = nVar;
        LinkedList linkedList2 = linkedList;
        long j2 = j;
        int size = nVar2.f271194d.size();
        C93964k.C93966b[] bVarArr2 = new C93964k.C93966b[size];
        nVar2.f271194d.toArray(bVarArr2);
        char c = 0;
        int i3 = 0;
        while (i3 < size) {
            AlbumPreviewUI.C93991f fVar = (AlbumPreviewUI.C93991f) bVarArr2[i3];
            fVar.getClass();
            Log.m105918d("MicroMsg.AlbumPreviewUI", "onQueryMediaBusinessDoing");
            if (j2 != AlbumPreviewUI.this.f271293i1) {
                Object[] objArr = new Object[2];
                objArr[c] = Long.valueOf(j);
                objArr[1] = Long.valueOf(AlbumPreviewUI.this.f271293i1);
                Log.m105929w("MicroMsg.AlbumPreviewUI", "%s %s, not my query, ignore.", objArr);
                Log.m105928w("MicroMsg.AlbumPreviewUI", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
                i = size;
                bVarArr = bVarArr2;
                i2 = i3;
            } else if (linkedList2 == null || linkedList.isEmpty()) {
                i = size;
                bVarArr = bVarArr2;
                i2 = i3;
                Log.m105918d("MicroMsg.AlbumPreviewUI", "mediaItems is invalid.");
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) it.next();
                    AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
                    int i4 = i3;
                    double d = albumPreviewUI.f271260Q0;
                    int i5 = size;
                    C93964k.C93966b[] bVarArr3 = bVarArr2;
                    if (TencentLocationUtils.distanceBetween(d, albumPreviewUI.f271262R0, galleryItem$MediaItem.f162757q, galleryItem$MediaItem.f162756p) <= fVar.f271332a) {
                        galleryItem$MediaItem.f162758r = "album_business_bubble_media_by_coordinate";
                        arrayList.add(galleryItem$MediaItem);
                    }
                    long j3 = j;
                    i3 = i4;
                    size = i5;
                    bVarArr2 = bVarArr3;
                }
                i = size;
                bVarArr = bVarArr2;
                i2 = i3;
                linkedList2.removeAll(arrayList);
                Log.m105919d("MicroMsg.AlbumPreviewUI", "target media size=%d", Integer.valueOf(arrayList.size()));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Log.m105919d("MicroMsg.AlbumPreviewUI", "target media item=%s", ((GalleryItem$MediaItem) it4.next()).toString());
                }
                if (!linkedList.isEmpty() && !arrayList.isEmpty()) {
                    linkedList2.addAll(0, arrayList);
                }
            }
            i3 = i2 + 1;
            j2 = j;
            size = i;
            bVarArr2 = bVarArr;
            c = 0;
        }
        int size2 = nVar2.f271193c.size();
        C93964k.C93967c[] cVarArr = new C93964k.C93967c[size2];
        nVar2.f271193c.toArray(cVarArr);
        for (int i6 = 0; i6 < size2; i6++) {
            cVarArr[i6].mo80207B3(linkedList2, j, z);
        }
    }

    /* renamed from: C5 */
    public void mo128902C5(C93964k.C93967c cVar) {
        this.f271193c.add(cVar);
    }

    /* renamed from: I */
    public void mo128903I(int i) {
        this.f271197g = i;
        mo128907d();
    }

    /* renamed from: M2 */
    public void mo128904M2(int i) {
        this.f271196f = i;
    }

    /* renamed from: a */
    public int mo128905a() {
        return this.f271196f;
    }

    /* renamed from: b */
    public int mo128906b() {
        return this.f271197g;
    }

    /* renamed from: d */
    public final void mo128907d() {
        Log.m105925i("MicroMsg.MediaQueryService", "initQueryType: %d", Integer.valueOf(this.f271197g));
        int i = this.f271197g;
        if (i == 1) {
            this.f271195e = new C93968l();
        } else if (i != 2) {
            this.f271195e = new C93945a();
        } else {
            this.f271195e = new C93985p();
        }
    }

    /* renamed from: e */
    public void mo128908e() {
        Log.m105925i("MicroMsg.MediaQueryService", "queryAlbums, %s.", this);
        if (this.f271195e == null) {
            Log.m105922f("MicroMsg.MediaQueryService", "media query not init, init again");
            mo128907d();
        }
        C93963i m = C93958f.m118753m();
        C93971a aVar = new C93971a();
        ExecutorService executorService = m.f271182f;
        if (executorService != null) {
            ((C119143b) executorService).execute(aVar);
        }
    }

    /* renamed from: f */
    public void mo128909f(String str, int i, long j) {
        if (this.f271195e == null) {
            Log.m105920e("MicroMsg.MediaQueryService", "media query not init, init again");
            mo128907d();
        }
        Log.m105925i("MicroMsg.MediaQueryService", "queryMediaInAlbums, albumName: %s ticket: %d, stack: %s.", str, Long.valueOf(j), Util.getStack().toString());
        ((C93946b) this.f271195e).f271112g = true;
        C93958f.m118753m().mo128896d(new C93972b(str, i, j));
    }

    /* renamed from: i0 */
    public void mo128910i0(C93964k.C93967c cVar) {
        this.f271193c.remove(cVar);
    }

    /* renamed from: o1 */
    public void mo128911o1(String str, long j) {
        mo128909f(str, this.f271197g, j);
    }
}
