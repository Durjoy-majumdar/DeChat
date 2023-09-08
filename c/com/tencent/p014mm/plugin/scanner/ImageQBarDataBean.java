package com.tencent.p014mm.plugin.scanner;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.scanner.ImageQBarDataBean */
public class ImageQBarDataBean implements Parcelable {
    public static final Parcelable.Creator<ImageQBarDataBean> CREATOR = new C94456a();

    /* renamed from: d */
    public String f273113d;

    /* renamed from: e */
    public int f273114e;

    /* renamed from: f */
    public int f273115f;

    /* renamed from: g */
    public String f273116g;

    /* renamed from: h */
    public float f273117h;

    /* renamed from: i */
    public float f273118i;

    /* renamed from: j */
    public int f273119j;

    /* renamed from: n */
    public int f273120n;

    /* renamed from: o */
    public String f273121o;

    /* renamed from: p */
    public int f273122p;

    /* renamed from: com.tencent.mm.plugin.scanner.ImageQBarDataBean$a */
    public class C94456a implements Parcelable.Creator<ImageQBarDataBean> {
        public Object createFromParcel(Parcel parcel) {
            return new ImageQBarDataBean(parcel);
        }

        public Object[] newArray(int i) {
            return new ImageQBarDataBean[i];
        }
    }

    public ImageQBarDataBean() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f273113d);
        parcel.writeInt(this.f273114e);
        parcel.writeInt(this.f273115f);
        parcel.writeString(this.f273116g);
        parcel.writeFloat(this.f273117h);
        parcel.writeFloat(this.f273118i);
        parcel.writeInt(this.f273119j);
        parcel.writeInt(this.f273120n);
        parcel.writeString(this.f273121o);
        parcel.writeInt(this.f273122p);
    }

    public ImageQBarDataBean(Parcel parcel) {
        this.f273113d = parcel.readString();
        this.f273114e = parcel.readInt();
        this.f273115f = parcel.readInt();
        this.f273116g = parcel.readString();
        this.f273117h = parcel.readFloat();
        this.f273118i = parcel.readFloat();
        this.f273119j = parcel.readInt();
        this.f273120n = parcel.readInt();
        this.f273121o = parcel.readString();
        this.f273122p = parcel.readInt();
    }
}
