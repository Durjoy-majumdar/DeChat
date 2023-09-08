package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.l */
public final class C56398l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderAlbumUI f161235d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<GalleryItem$MediaItem> f161236e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56398l(FinderAlbumUI finderAlbumUI, ArrayList<GalleryItem$MediaItem> arrayList) {
        super(0);
        this.f161235d = finderAlbumUI;
        this.f161236e = arrayList;
    }

    public Object invoke() {
        FinderAlbumUI finderAlbumUI = this.f161235d;
        ArrayList<GalleryItem$MediaItem> arrayList = this.f161236e;
        int i = FinderAlbumUI.f161014F1;
        finderAlbumUI.mo79065f8(arrayList);
        return C13598b0.f38549a;
    }
}
