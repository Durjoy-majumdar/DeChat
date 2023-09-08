package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes */
public final class WxaProfileAttributes implements Parcelable {
    public static final Parcelable.Creator<WxaProfileAttributes> CREATOR = new C81633a();

    /* renamed from: d */
    public String f239575d;

    /* renamed from: e */
    public String f239576e;

    /* renamed from: f */
    public String f239577f;

    /* renamed from: g */
    public String f239578g;

    /* renamed from: h */
    public String f239579h;

    /* renamed from: i */
    public List<Pair<String, String>> f239580i;

    /* renamed from: j */
    public List<WxaAttributes.WxaEntryInfo> f239581j;

    /* renamed from: n */
    public int f239582n;

    /* renamed from: o */
    public int f239583o;

    /* renamed from: p */
    public int f239584p;

    /* renamed from: q */
    public int f239585q;

    /* renamed from: r */
    public int f239586r;

    /* renamed from: s */
    public int f239587s;

    /* renamed from: t */
    public String f239588t;

    /* renamed from: u */
    public String f239589u;

    /* renamed from: v */
    public int f239590v;

    /* renamed from: w */
    public int f239591w;

    /* renamed from: x */
    public String f239592x = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes$a */
    public class C81633a implements Parcelable.Creator<WxaProfileAttributes> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaProfileAttributes(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaProfileAttributes[i];
        }
    }

    public WxaProfileAttributes(Parcel parcel) {
        this.f239575d = parcel.readString();
        this.f239576e = parcel.readString();
        this.f239577f = parcel.readString();
        this.f239578g = parcel.readString();
        this.f239579h = parcel.readString();
        this.f239581j = parcel.createTypedArrayList(WxaAttributes.WxaEntryInfo.CREATOR);
        this.f239582n = parcel.readInt();
        this.f239583o = parcel.readInt();
        this.f239584p = parcel.readInt();
        this.f239586r = parcel.readInt();
        this.f239587s = parcel.readInt();
        this.f239588t = parcel.readString();
        this.f239589u = parcel.readString();
        this.f239590v = parcel.readInt();
        this.f239591w = parcel.readInt();
        this.f239592x = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f239575d);
        parcel.writeString(this.f239576e);
        parcel.writeString(this.f239577f);
        parcel.writeString(this.f239578g);
        parcel.writeString(this.f239579h);
        parcel.writeTypedList(this.f239581j);
        parcel.writeInt(this.f239582n);
        parcel.writeInt(this.f239583o);
        parcel.writeInt(this.f239584p);
        parcel.writeInt(this.f239586r);
        parcel.writeInt(this.f239587s);
        parcel.writeString(this.f239588t);
        parcel.writeString(this.f239589u);
        parcel.writeInt(this.f239590v);
        parcel.writeInt(this.f239591w);
        parcel.writeString(this.f239592x);
    }

    public WxaProfileAttributes() {
    }
}
