package com.tencent.p014mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem */
public class GalleryItem$VideoMediaItem extends GalleryItem$MediaItem {
    public static final Parcelable.Creator<GalleryItem$MediaItem> CREATOR = new C56790a();

    /* renamed from: A */
    public int f162761A = -1;

    /* renamed from: B */
    public int f162762B = -1;

    /* renamed from: C */
    public int f162763C = -1;

    /* renamed from: u */
    public String f162764u;

    /* renamed from: v */
    public String f162765v;

    /* renamed from: w */
    public int f162766w = -1;

    /* renamed from: x */
    public int f162767x = -1;

    /* renamed from: y */
    public int f162768y = -1;

    /* renamed from: z */
    public int f162769z = -1;

    /* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem$a */
    public class C56790a implements Parcelable.Creator<GalleryItem$MediaItem> {
        public Object createFromParcel(Parcel parcel) {
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = new GalleryItem$VideoMediaItem();
            galleryItem$VideoMediaItem.f162747d = parcel.readString();
            galleryItem$VideoMediaItem.f162750g = parcel.readString();
            galleryItem$VideoMediaItem.f162751h = parcel.readLong();
            galleryItem$VideoMediaItem.f162755o = parcel.readString();
            galleryItem$VideoMediaItem.f162768y = parcel.readInt();
            galleryItem$VideoMediaItem.f162767x = parcel.readInt();
            galleryItem$VideoMediaItem.f162766w = parcel.readInt();
            galleryItem$VideoMediaItem.f162764u = parcel.readString();
            galleryItem$VideoMediaItem.f162765v = parcel.readString();
            galleryItem$VideoMediaItem.f162761A = parcel.readInt();
            galleryItem$VideoMediaItem.f162762B = parcel.readInt();
            galleryItem$VideoMediaItem.f162769z = parcel.readInt();
            galleryItem$VideoMediaItem.f162763C = parcel.readInt();
            galleryItem$VideoMediaItem.f162752i = parcel.readLong();
            galleryItem$VideoMediaItem.f162753j = parcel.readString();
            galleryItem$VideoMediaItem.f162760t = (HashMap) parcel.readSerializable();
            return galleryItem$VideoMediaItem;
        }

        public Object[] newArray(int i) {
            return new GalleryItem$MediaItem[i];
        }
    }

    public GalleryItem$VideoMediaItem() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo80159e() {
        return !Util.isNullOrNil(this.f162750g) ? this.f162750g : this.f162747d;
    }

    public int getType() {
        return 2;
    }

    public String toString() {
        return "VideoMediaItem{base=" + super.toString() + ", videoTrackMime='" + this.f162764u + '\'' + ", audioTrackMime='" + this.f162765v + '\'' + ", durationMs=" + this.f162766w + ", videoHeight=" + this.f162767x + ", videoWidth=" + this.f162768y + ", videoBitRate=" + this.f162769z + ", videoIFrameInterval=" + this.f162761A + ", videoFrameRate=" + this.f162762B + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f162747d);
        parcel.writeString(this.f162750g);
        parcel.writeLong(this.f162751h);
        parcel.writeString(this.f162755o);
        parcel.writeInt(this.f162768y);
        parcel.writeInt(this.f162767x);
        parcel.writeInt(this.f162766w);
        parcel.writeString(this.f162764u);
        parcel.writeString(this.f162765v);
        parcel.writeInt(this.f162761A);
        parcel.writeInt(this.f162762B);
        parcel.writeInt(this.f162769z);
        parcel.writeInt(this.f162763C);
        parcel.writeLong(this.f162752i);
        parcel.writeString(this.f162753j);
        parcel.writeSerializable(this.f162760t);
    }

    public GalleryItem$VideoMediaItem(long j) {
        super(j);
    }

    public GalleryItem$VideoMediaItem(long j, String str, String str2, String str3) {
        super(j, str, str2, str3);
    }
}
