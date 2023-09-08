package com.tencent.p014mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem */
public class GalleryItem$ImageMediaItem extends GalleryItem$MediaItem {
    public static final Parcelable.Creator<GalleryItem$MediaItem> CREATOR = new C56788a();

    /* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem$a */
    public class C56788a implements Parcelable.Creator<GalleryItem$MediaItem> {
        public Object createFromParcel(Parcel parcel) {
            GalleryItem$ImageMediaItem galleryItem$ImageMediaItem = new GalleryItem$ImageMediaItem();
            galleryItem$ImageMediaItem.f162747d = parcel.readString();
            galleryItem$ImageMediaItem.f162750g = parcel.readString();
            galleryItem$ImageMediaItem.f162751h = parcel.readLong();
            galleryItem$ImageMediaItem.f162752i = parcel.readLong();
            galleryItem$ImageMediaItem.f162753j = parcel.readString();
            galleryItem$ImageMediaItem.f162755o = parcel.readString();
            galleryItem$ImageMediaItem.f162760t = (HashMap) parcel.readSerializable();
            return galleryItem$ImageMediaItem;
        }

        public Object[] newArray(int i) {
            return new GalleryItem$MediaItem[i];
        }
    }

    public GalleryItem$ImageMediaItem() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo80159e() {
        return !Util.isNullOrNil(this.f162750g) ? this.f162750g : this.f162747d;
    }

    public int getType() {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f162747d);
        parcel.writeString(this.f162750g);
        parcel.writeLong(this.f162751h);
        parcel.writeLong(this.f162752i);
        parcel.writeString(this.f162753j);
        parcel.writeString(this.f162755o);
        parcel.writeSerializable(this.f162760t);
    }

    public GalleryItem$ImageMediaItem(long j) {
        super(j);
    }

    public GalleryItem$ImageMediaItem(long j, String str, String str2, String str3) {
        super(j, str, str2, str3);
    }
}
