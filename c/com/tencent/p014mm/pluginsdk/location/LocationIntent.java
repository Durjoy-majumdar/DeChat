package com.tencent.p014mm.pluginsdk.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.location.LocationIntent */
public class LocationIntent implements Parcelable {
    public static final Parcelable.Creator<LocationIntent> CREATOR = new C72678a();

    /* renamed from: d */
    public double f211456d;

    /* renamed from: e */
    public double f211457e;

    /* renamed from: f */
    public int f211458f = 0;

    /* renamed from: g */
    public String f211459g = "";

    /* renamed from: h */
    public String f211460h = "";

    /* renamed from: i */
    public String f211461i = "";

    /* renamed from: j */
    public String f211462j;

    /* renamed from: n */
    public int f211463n = 0;

    /* renamed from: o */
    public Addr f211464o = null;

    /* renamed from: p */
    public String f211465p;

    /* renamed from: q */
    public boolean f211466q;

    /* renamed from: r */
    public String f211467r;

    /* renamed from: s */
    public String f211468s;

    /* renamed from: t */
    public String f211469t;

    /* renamed from: u */
    public float f211470u;

    /* renamed from: v */
    public String f211471v;

    /* renamed from: w */
    public String f211472w;

    /* renamed from: x */
    public String f211473x;

    /* renamed from: com.tencent.mm.pluginsdk.location.LocationIntent$a */
    public class C72678a implements Parcelable.Creator<LocationIntent> {
        public Object createFromParcel(Parcel parcel) {
            LocationIntent locationIntent = new LocationIntent();
            locationIntent.f211456d = parcel.readDouble();
            locationIntent.f211457e = parcel.readDouble();
            locationIntent.f211458f = parcel.readInt();
            locationIntent.f211459g = parcel.readString();
            locationIntent.f211460h = Util.nullAs(parcel.readString(), "");
            locationIntent.f211461i = Util.nullAs(parcel.readString(), "");
            locationIntent.f211462j = Util.nullAs(parcel.readString(), "");
            locationIntent.f211463n = parcel.readInt();
            locationIntent.f211464o = (Addr) parcel.readParcelable(Addr.class.getClassLoader());
            locationIntent.f211465p = Util.nullAs(parcel.readString(), "");
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            locationIntent.f211466q = z;
            locationIntent.f211467r = parcel.readString();
            locationIntent.f211468s = parcel.readString();
            locationIntent.f211469t = parcel.readString();
            locationIntent.f211470u = parcel.readFloat();
            locationIntent.f211471v = parcel.readString();
            locationIntent.f211472w = Util.nullAs(parcel.readString(), "");
            locationIntent.f211473x = Util.nullAs(parcel.readString(), "");
            return locationIntent;
        }

        public Object[] newArray(int i) {
            return new LocationIntent[i];
        }
    }

    /* renamed from: a */
    public String mo100133a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("lat " + this.f211456d + ";");
        stringBuffer.append("lng " + this.f211457e + ";");
        stringBuffer.append("scale " + this.f211458f + ";");
        stringBuffer.append("label " + this.f211459g + ";");
        stringBuffer.append("poiname " + this.f211460h + ";");
        stringBuffer.append("infourl " + this.f211461i + ";");
        stringBuffer.append("locTypeId " + this.f211462j + ";");
        stringBuffer.append("poiType " + this.f211463n + ";");
        if (this.f211464o != null) {
            stringBuffer.append("addr " + this.f211464o.toString() + ";");
        }
        stringBuffer.append("poiid " + this.f211465p + ";");
        stringBuffer.append("fromPoiList " + this.f211466q + ";");
        stringBuffer.append("categoryTips " + this.f211467r + ";");
        stringBuffer.append("businessHour " + this.f211468s + ";");
        stringBuffer.append("phone " + this.f211469t + ";");
        stringBuffer.append("priceTips " + this.f211470u + ";");
        stringBuffer.append("nearByPoiid " + this.f211471v + ";");
        stringBuffer.append("buildingID:" + this.f211472w + ";");
        stringBuffer.append("floorName:" + this.f211473x + ";");
        return stringBuffer.toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f211456d);
        parcel.writeDouble(this.f211457e);
        parcel.writeInt(this.f211458f);
        parcel.writeString(this.f211459g);
        parcel.writeString(this.f211460h);
        parcel.writeString(this.f211461i);
        parcel.writeString(this.f211462j);
        parcel.writeInt(this.f211463n);
        parcel.writeParcelable(this.f211464o, i);
        parcel.writeString(this.f211465p);
        parcel.writeInt(this.f211466q ? 1 : 0);
        parcel.writeString(this.f211467r);
        parcel.writeString(this.f211468s);
        parcel.writeString(this.f211469t);
        parcel.writeFloat(this.f211470u);
        parcel.writeString(this.f211471v);
        parcel.writeString(this.f211472w);
        parcel.writeString(this.f211473x);
    }
}
