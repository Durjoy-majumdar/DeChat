package com.tencent.p014mm.plugin.gallery.model;

import com.tencent.p014mm.plugin.gallery.model.C93974o;

/* renamed from: com.tencent.mm.plugin.gallery.model.PrivateAlbumItem */
public class PrivateAlbumItem extends GalleryItem$AlbumItem {

    /* renamed from: p */
    public C93974o.C93976b f271105p;

    public PrivateAlbumItem(C93974o.C93976b bVar) {
        super(bVar.f271211d, bVar.f271212e);
        this.f271105p = bVar;
    }

    /* renamed from: a */
    public String mo128856a() {
        return this.f271105p.f271214g;
    }

    /* renamed from: b */
    public long mo128857b() {
        return this.f271105p.f271213f;
    }

    /* renamed from: e */
    public String mo128861e() {
        return this.f271105p.f271214g;
    }

    /* renamed from: f */
    public int mo128862f() {
        C93974o.C93977c cVar = this.f271105p.f271215h;
        return (cVar == null || !cVar.f271218c) ? 1 : 2;
    }
}
