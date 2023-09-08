package com.tencent.p014mm.plugin.gallery.model;

import android.os.Parcelable;
import java.util.HashMap;
import x60.C15627c;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem */
public abstract class GalleryItem$MediaItem implements Parcelable, Comparable<GalleryItem$MediaItem>, C15627c {

    /* renamed from: d */
    public String f162747d;

    /* renamed from: e */
    public String f162748e;

    /* renamed from: f */
    public String f162749f;

    /* renamed from: g */
    public String f162750g;

    /* renamed from: h */
    public long f162751h;

    /* renamed from: i */
    public long f162752i;

    /* renamed from: j */
    public String f162753j;

    /* renamed from: n */
    public long f162754n;

    /* renamed from: o */
    public String f162755o;

    /* renamed from: p */
    public double f162756p;

    /* renamed from: q */
    public double f162757q;

    /* renamed from: r */
    public String f162758r;

    /* renamed from: s */
    public boolean f162759s;

    /* renamed from: t */
    public HashMap<String, Object> f162760t;

    public GalleryItem$MediaItem() {
        this(0, "", "", "");
    }

    /* renamed from: c */
    public static GalleryItem$MediaItem m65488c(int i, long j, String str, String str2, String str3) {
        return i == 1 ? new GalleryItem$ImageMediaItem(j, str, str2, str3) : new GalleryItem$VideoMediaItem(j, str, str2, str3);
    }

    /* renamed from: b */
    public String mo11841b() {
        return this.f162751h + "_" + this.f162747d.hashCode();
    }

    public int compareTo(Object obj) {
        return (int) ((this.f162752i - ((GalleryItem$MediaItem) obj).f162752i) / 1000);
    }

    /* renamed from: e */
    public abstract String mo80159e();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0 = r3.f162748e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = r3.f162755o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem
            r1 = 0
            if (r0 == 0) goto L_0x002c
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r4
            java.lang.String r0 = r3.f162747d
            if (r0 == 0) goto L_0x0013
            java.lang.String r2 = r4.f162747d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x002b
        L_0x0013:
            java.lang.String r0 = r3.f162755o
            if (r0 == 0) goto L_0x002c
            java.lang.String r2 = "edit"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r3.f162748e
            if (r0 == 0) goto L_0x002c
            java.lang.String r4 = r4.f162747d
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.equals(java.lang.Object):boolean");
    }

    public abstract int getType();

    public String toString() {
        return "MediaItem{mOriginalPath='" + this.f162747d + '\'' + ", mThumbPath='" + this.f162750g + '\'' + ", origId=" + this.f162751h + ", generateDate=" + this.f162752i + ", dateTag=" + this.f162753j + ", isChecked=" + this.f162759s + ", mMimeType='" + this.f162755o + '\'' + ", mLongitude='" + this.f162756p + '\'' + ", mLatitude='" + this.f162757q + '\'' + ", mBusinessTag='" + this.f162758r + '\'' + '}';
    }

    public GalleryItem$MediaItem(long j) {
        this(j, "", "", "");
    }

    public GalleryItem$MediaItem(long j, String str, String str2, String str3) {
        this.f162756p = 181.0d;
        this.f162757q = 91.0d;
        this.f162759s = false;
        this.f162760t = new HashMap<>();
        this.f162751h = j;
        this.f162747d = str;
        this.f162750g = str2;
        this.f162755o = str3;
    }
}
