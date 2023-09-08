package com.tencent.p014mm.modelgeo;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.modelgeo.Addr */
public class Addr implements Parcelable {
    public static final Parcelable.Creator<Addr> CREATOR = new C114732a();

    /* renamed from: d */
    public String f343956d;

    /* renamed from: e */
    public String f343957e;

    /* renamed from: f */
    public String f343958f;

    /* renamed from: g */
    public String f343959g;

    /* renamed from: h */
    public String f343960h;

    /* renamed from: i */
    public String f343961i;

    /* renamed from: j */
    public String f343962j;

    /* renamed from: n */
    public String f343963n;

    /* renamed from: o */
    public String f343964o;

    /* renamed from: p */
    public String f343965p;

    /* renamed from: q */
    public String f343966q;

    /* renamed from: r */
    public String f343967r;

    /* renamed from: s */
    public String f343968s;

    /* renamed from: t */
    public float f343969t;

    /* renamed from: u */
    public float f343970u;

    /* renamed from: v */
    public String f343971v;

    /* renamed from: w */
    public Object f343972w = "";

    /* renamed from: x */
    public String f343973x;

    /* renamed from: y */
    public String f343974y;

    /* renamed from: com.tencent.mm.modelgeo.Addr$a */
    public class C114732a implements Parcelable.Creator<Addr> {
        public Object createFromParcel(Parcel parcel) {
            Addr addr = new Addr();
            addr.f343956d = parcel.readString();
            addr.f343957e = parcel.readString();
            addr.f343958f = parcel.readString();
            addr.f343959g = parcel.readString();
            addr.f343960h = parcel.readString();
            addr.f343961i = parcel.readString();
            addr.f343962j = parcel.readString();
            addr.f343963n = parcel.readString();
            addr.f343964o = parcel.readString();
            addr.f343965p = parcel.readString();
            addr.f343966q = parcel.readString();
            addr.f343967r = parcel.readString();
            addr.f343969t = parcel.readFloat();
            addr.f343970u = parcel.readFloat();
            addr.f343971v = parcel.readString();
            addr.f343973x = parcel.readString();
            return addr;
        }

        public Object[] newArray(int i) {
            return new Addr[i];
        }
    }

    /* renamed from: a */
    public String mo174342a() {
        StringBuilder sb = new StringBuilder();
        if (!Util.isNullOrNil(this.f343959g)) {
            sb.append(this.f343959g);
        } else if (!Util.isNullOrNil(this.f343960h)) {
            sb.append(this.f343960h);
        } else {
            Log.m105920e("MicroMsg.Addr", "wtf!!! locality & locality_shi all invalid!!!");
        }
        sb.append(Util.nullAs(this.f343961i, ""));
        sb.append(Util.nullAs(this.f343962j, ""));
        sb.append(Util.nullAs(this.f343963n, ""));
        sb.append(Util.nullAs(this.f343964o, ""));
        Log.m105919d("MicroMsg.Addr", "little addr res: [%s].", sb);
        return sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("address='" + this.f343956d + '\'');
        sb.append(", country='" + this.f343957e + '\'');
        sb.append(", administrative_area_level_1='" + this.f343958f + '\'');
        sb.append(", locality='" + this.f343959g + '\'');
        sb.append(", locality_shi='" + this.f343960h + '\'');
        sb.append(", sublocality='" + this.f343961i + '\'');
        sb.append(", neighborhood='" + this.f343962j + '\'');
        sb.append(", route='" + this.f343963n + '\'');
        sb.append(", streetNum='" + this.f343964o + '\'');
        sb.append(", town='" + this.f343965p + '\'');
        sb.append(", roughAddr='" + this.f343966q + '\'');
        sb.append(", poi_name='" + this.f343967r + '\'');
        StringBuilder sb4 = new StringBuilder();
        sb4.append(", lat=");
        sb4.append(this.f343969t);
        sb.append(sb4.toString());
        sb.append(", lng=" + this.f343970u);
        sb.append(", tag=" + this.f343972w);
        sb.append(", cityCode=" + this.f343974y);
        sb.append(", nationalCode=" + this.f343971v);
        sb.append(", addressNameId=" + this.f343973x);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Util.nullAs(this.f343956d, ""));
        parcel.writeString(Util.nullAs(this.f343957e, ""));
        parcel.writeString(Util.nullAs(this.f343958f, ""));
        parcel.writeString(Util.nullAs(this.f343959g, ""));
        parcel.writeString(Util.nullAs(this.f343960h, ""));
        parcel.writeString(Util.nullAs(this.f343961i, ""));
        parcel.writeString(Util.nullAs(this.f343962j, ""));
        parcel.writeString(Util.nullAs(this.f343963n, ""));
        parcel.writeString(Util.nullAs(this.f343964o, ""));
        parcel.writeString(Util.nullAs(this.f343965p, ""));
        parcel.writeString(Util.nullAs(this.f343966q, ""));
        parcel.writeString(Util.nullAs(this.f343967r, ""));
        parcel.writeFloat(this.f343969t);
        parcel.writeFloat(this.f343970u);
        parcel.writeString(Util.nullAs(this.f343971v, ""));
        parcel.writeString(Util.nullAs(this.f343973x, ""));
    }
}
