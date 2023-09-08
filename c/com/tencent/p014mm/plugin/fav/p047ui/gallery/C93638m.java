package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.m */
public class C93638m {

    /* renamed from: a */
    public ArrayList<C93637l> f270389a = new ArrayList<>();

    /* renamed from: b */
    public boolean f270390b = false;

    /* renamed from: c */
    public ArrayList<C93641c> f270391c = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.m$b */
    public static final class C93640b {

        /* renamed from: a */
        public static final C93638m f270392a = new C93638m((C93639a) null);
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.m$c */
    public interface C93641c {
        /* renamed from: c */
        void mo128563c(C93637l lVar, boolean z);

        void clear();
    }

    public C93638m(C93639a aVar) {
    }

    /* renamed from: a */
    public void mo128561a() {
        Log.m105924i("MicroMsg.ImageGallerySelectedHandle", "clear..");
        this.f270389a.clear();
        Iterator<C93641c> it = this.f270391c.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    /* renamed from: b */
    public C93637l mo128562b(String str) {
        Iterator<C93637l> it = this.f270389a.iterator();
        while (it.hasNext()) {
            C93637l next = it.next();
            if (next.f270388b.f299280T.equals(str)) {
                return next;
            }
        }
        return null;
    }
}
