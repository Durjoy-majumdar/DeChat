package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fav.ui.m0 */
public class C93675m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f270457d;

    /* renamed from: e */
    public final /* synthetic */ FavImgGalleryUI f270458e;

    public C93675m0(FavImgGalleryUI favImgGalleryUI, int i) {
        this.f270458e = favImgGalleryUI;
        this.f270457d = i;
    }

    public void run() {
        int i = this.f270457d;
        if (i != -1) {
            Log.m105919d("MicroMsg.FavImgGalleryUI", "match selection %d", Integer.valueOf(i));
            this.f270458e.f269721e.setSelection(this.f270457d);
            this.f270458e.f269720d = this.f270457d;
            return;
        }
        FavImgGalleryUI favImgGalleryUI = this.f270458e;
        int i2 = favImgGalleryUI.f269720d;
        if (i2 - 1 >= 0 && i2 - 1 < favImgGalleryUI.f269723g.size()) {
            Log.m105919d("MicroMsg.FavImgGalleryUI", "adjust selection %d, list size %d", Integer.valueOf(this.f270458e.f269720d - 1), Integer.valueOf(this.f270458e.f269723g.size()));
            FavImgGalleryUI favImgGalleryUI2 = this.f270458e;
            favImgGalleryUI2.f269721e.setSelection(favImgGalleryUI2.f269720d - 1);
            this.f270458e.f269720d--;
        } else if (this.f270458e.f269723g.size() > 0) {
            Log.m105919d("MicroMsg.FavImgGalleryUI", "adjust selection fail, set selection 0, list size %d", Integer.valueOf(this.f270458e.f269723g.size()));
            this.f270458e.f269721e.setSelection(0);
            this.f270458e.f269720d = 0;
        } else {
            Log.m105929w("MicroMsg.FavImgGalleryUI", "data list size %d, empty, finish", Integer.valueOf(this.f270458e.f269723g.size()));
            this.f270458e.finish();
        }
    }
}
