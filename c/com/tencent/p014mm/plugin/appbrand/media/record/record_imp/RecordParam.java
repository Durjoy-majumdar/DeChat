package com.tencent.p014mm.plugin.appbrand.media.record.record_imp;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.media.record.C83624d;
import com.tencent.p014mm.plugin.appbrand.media.record.C83629j;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam */
public class RecordParam implements Parcelable {
    public static final Parcelable.Creator<RecordParam> CREATOR = new C83645a();

    /* renamed from: d */
    public int f244261d = 0;

    /* renamed from: e */
    public int f244262e = 0;

    /* renamed from: f */
    public int f244263f = 0;

    /* renamed from: g */
    public int f244264g = 0;

    /* renamed from: h */
    public String f244265h;

    /* renamed from: i */
    public String f244266i;

    /* renamed from: j */
    public int f244267j = 0;

    /* renamed from: n */
    public double f244268n = 0.0d;

    /* renamed from: o */
    public String f244269o = "";

    /* renamed from: p */
    public String f244270p = "";

    /* renamed from: q */
    public C83624d f244271q = C83624d.MIC;

    /* renamed from: r */
    public C83629j f244272r;

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam$a */
    public class C83645a implements Parcelable.Creator<RecordParam> {
        public Object createFromParcel(Parcel parcel) {
            return new RecordParam(parcel);
        }

        public Object[] newArray(int i) {
            return new RecordParam[0];
        }
    }

    public RecordParam() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f244261d);
        parcel.writeInt(this.f244262e);
        parcel.writeInt(this.f244263f);
        parcel.writeInt(this.f244264g);
        parcel.writeString(this.f244265h);
        parcel.writeString(this.f244266i);
        parcel.writeInt(this.f244267j);
        parcel.writeDouble(this.f244268n);
        parcel.writeString(this.f244269o);
        parcel.writeString(this.f244270p);
        parcel.writeInt(this.f244271q.ordinal());
    }

    public RecordParam(Parcel parcel) {
        this.f244261d = parcel.readInt();
        this.f244262e = parcel.readInt();
        this.f244263f = parcel.readInt();
        this.f244264g = parcel.readInt();
        this.f244265h = parcel.readString();
        this.f244266i = parcel.readString();
        this.f244267j = parcel.readInt();
        this.f244268n = parcel.readDouble();
        this.f244269o = parcel.readString();
        this.f244270p = parcel.readString();
        this.f244271q = C83624d.values()[parcel.readInt()];
    }
}
