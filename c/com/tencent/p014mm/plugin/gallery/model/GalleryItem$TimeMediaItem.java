package com.tencent.p014mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$TimeMediaItem */
public class GalleryItem$TimeMediaItem extends GalleryItem$MediaItem {
    public static final Parcelable.Creator<GalleryItem$MediaItem> CREATOR = new C56789a();

    /* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$TimeMediaItem$a */
    public class C56789a implements Parcelable.Creator<GalleryItem$MediaItem> {
        public Object createFromParcel(Parcel parcel) {
            GalleryItem$TimeMediaItem galleryItem$TimeMediaItem = new GalleryItem$TimeMediaItem();
            galleryItem$TimeMediaItem.f162752i = parcel.readLong();
            galleryItem$TimeMediaItem.f162753j = parcel.readString();
            return galleryItem$TimeMediaItem;
        }

        public Object[] newArray(int i) {
            return new GalleryItem$MediaItem[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo80159e() {
        return null;
    }

    public int getType() {
        return 5;
    }

    public String toString() {
        return "TimeMediaItem{base=" + super.toString() + ", generateDate='" + this.f162752i + '\'' + ", dateTag='" + this.f162753j + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f162752i);
        parcel.writeString(this.f162753j);
    }
}
