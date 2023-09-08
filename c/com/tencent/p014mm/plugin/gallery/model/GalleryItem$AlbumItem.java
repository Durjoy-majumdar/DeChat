package com.tencent.p014mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem */
public class GalleryItem$AlbumItem implements Parcelable, Comparable<GalleryItem$AlbumItem> {
    public static final Parcelable.Creator<GalleryItem$AlbumItem> CREATOR = new C93944a();

    /* renamed from: d */
    public String f271096d;

    /* renamed from: e */
    public String f271097e;

    /* renamed from: f */
    public int f271098f;

    /* renamed from: g */
    public String f271099g;

    /* renamed from: h */
    public int f271100h = 0;

    /* renamed from: i */
    public GalleryItem$MediaItem f271101i;

    /* renamed from: j */
    public boolean f271102j = false;

    /* renamed from: n */
    public boolean f271103n = false;

    /* renamed from: o */
    public boolean f271104o = false;

    /* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem$a */
    public class C93944a implements Parcelable.Creator<GalleryItem$AlbumItem> {
        public Object createFromParcel(Parcel parcel) {
            return new GalleryItem$AlbumItem(parcel);
        }

        public Object[] newArray(int i) {
            return new GalleryItem$AlbumItem[i];
        }
    }

    public GalleryItem$AlbumItem(String str, int i) {
        String nullAsNil = Util.nullAsNil(str);
        this.f271096d = nullAsNil;
        this.f271098f = i;
        this.f271097e = nullAsNil;
    }

    /* renamed from: a */
    public String mo128856a() {
        GalleryItem$MediaItem galleryItem$MediaItem = this.f271101i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.f162747d;
        }
        Log.m105920e("MicroMsg.AlbumItem", "getOriginalPath mediaItem is null");
        return null;
    }

    /* renamed from: b */
    public long mo128857b() {
        GalleryItem$MediaItem galleryItem$MediaItem = this.f271101i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.f162751h;
        }
        Log.m105920e("MicroMsg.AlbumItem", "getThumbMediaOrigId mediaItem is null");
        return -1;
    }

    /* renamed from: c */
    public long mo128858c() {
        GalleryItem$MediaItem galleryItem$MediaItem = this.f271101i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.f162752i;
        }
        Log.m105920e("MicroMsg.AlbumItem", "getThumbModifyDate mediaItem is null");
        return -1;
    }

    public int compareTo(Object obj) {
        GalleryItem$MediaItem galleryItem$MediaItem;
        GalleryItem$AlbumItem galleryItem$AlbumItem = (GalleryItem$AlbumItem) obj;
        GalleryItem$MediaItem galleryItem$MediaItem2 = this.f271101i;
        if (galleryItem$MediaItem2 != null && (galleryItem$MediaItem = galleryItem$AlbumItem.f271101i) != null) {
            int i = (galleryItem$MediaItem2.f162752i > galleryItem$MediaItem.f162752i ? 1 : (galleryItem$MediaItem2.f162752i == galleryItem$MediaItem.f162752i ? 0 : -1));
            return i == 0 ? Long.compare(galleryItem$MediaItem.f162754n, galleryItem$MediaItem2.f162754n) : i > 0 ? -1 : 1;
        } else if (galleryItem$MediaItem2 == null) {
            return galleryItem$AlbumItem.f271101i != null ? 1 : 0;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo128861e() {
        GalleryItem$MediaItem galleryItem$MediaItem = this.f271101i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.mo80159e();
        }
        Log.m105920e("MicroMsg.AlbumItem", "getThumbPath mediaItem is null");
        return null;
    }

    /* renamed from: f */
    public int mo128862f() {
        GalleryItem$MediaItem galleryItem$MediaItem = this.f271101i;
        if (galleryItem$MediaItem != null) {
            return galleryItem$MediaItem.getType();
        }
        Log.m105920e("MicroMsg.AlbumItem", "getThumbType mediaItem is null");
        return -1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f271096d);
        parcel.writeInt(this.f271098f);
        parcel.writeParcelable(this.f271101i, i);
    }

    public GalleryItem$AlbumItem(Parcel parcel) {
        this.f271096d = parcel.readString();
        this.f271098f = parcel.readInt();
        this.f271101i = (GalleryItem$MediaItem) parcel.readParcelable(GalleryItem$MediaItem.class.getClassLoader());
    }
}
