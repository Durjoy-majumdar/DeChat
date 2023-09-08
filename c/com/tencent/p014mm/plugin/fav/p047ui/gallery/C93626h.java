package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.h */
public class C93626h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f270350d;

    /* renamed from: e */
    public final /* synthetic */ FavMediaGalleryUI f270351e;

    public C93626h(FavMediaGalleryUI favMediaGalleryUI, int i) {
        this.f270351e = favMediaGalleryUI;
        this.f270350d = i;
    }

    public void run() {
        int i = this.f270350d;
        if (i != -1) {
            Log.m105919d("MicroMsg.FavMediaGalleryUI", "match selection %d", Integer.valueOf(i));
            this.f270351e.f270307f.setSelection(this.f270350d);
            this.f270351e.f270305d = this.f270350d;
            return;
        }
        FavMediaGalleryUI favMediaGalleryUI = this.f270351e;
        int i2 = favMediaGalleryUI.f270305d;
        if (i2 - 1 >= 0 && i2 - 1 < favMediaGalleryUI.f270309h.size()) {
            Log.m105919d("MicroMsg.FavMediaGalleryUI", "adjust selection %d, list size %d", Integer.valueOf(this.f270351e.f270305d - 1), Integer.valueOf(this.f270351e.f270309h.size()));
            FavMediaGalleryUI favMediaGalleryUI2 = this.f270351e;
            favMediaGalleryUI2.f270307f.setSelection(favMediaGalleryUI2.f270305d - 1);
            this.f270351e.f270305d--;
        } else if (this.f270351e.f270309h.size() > 0) {
            Log.m105919d("MicroMsg.FavMediaGalleryUI", "adjust selection fail, set selection 0, list size %d", Integer.valueOf(this.f270351e.f270309h.size()));
            this.f270351e.f270307f.setSelection(0);
            this.f270351e.f270305d = 0;
        } else {
            Log.m105929w("MicroMsg.FavMediaGalleryUI", "data list size %d, empty, finish", Integer.valueOf(this.f270351e.f270309h.size()));
            this.f270351e.finish();
        }
    }
}
