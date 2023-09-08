package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p599lr.C61381b;
import qo1.C63293i;
import qo3.C12925w;

/* renamed from: com.tencent.mm.plugin.finder.ui.t */
public final class C56429t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderAlbumUI f161289d;

    /* renamed from: e */
    public final /* synthetic */ C12925w f161290e;

    /* renamed from: f */
    public final /* synthetic */ GalleryItem$VideoMediaItem f161291f;

    public C56429t(FinderAlbumUI finderAlbumUI, C12925w wVar, GalleryItem$VideoMediaItem galleryItem$VideoMediaItem) {
        this.f161289d = finderAlbumUI;
        this.f161290e = wVar;
        this.f161291f = galleryItem$VideoMediaItem;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderAlbumUI finderAlbumUI = this.f161289d;
        int i = FinderAlbumUI.f161014F1;
        finderAlbumUI.getClass();
        boolean z = System.currentTimeMillis() - finderAlbumUI.f161015A1 < 1000;
        finderAlbumUI.f161015A1 = System.currentTimeMillis();
        if (z) {
            Log.m105924i("Finder.AlbumUI", "onSendItemClick: long video btn hit double click check");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f161289d.f161016B1 = true;
        this.f161290e.mo5085n();
        C63293i Yp0 = ((C61381b) C86312j.m106911c(C61381b.class)).Yp0();
        FinderAlbumUI finderAlbumUI2 = this.f161289d;
        Intent intent = finderAlbumUI2.getIntent();
        GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f161291f;
        Yp0.mo88193d(finderAlbumUI2, intent, galleryItem$VideoMediaItem.f162747d, galleryItem$VideoMediaItem.f162768y, galleryItem$VideoMediaItem.f162767x, this.f161289d.f161020y1, true, 5);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
