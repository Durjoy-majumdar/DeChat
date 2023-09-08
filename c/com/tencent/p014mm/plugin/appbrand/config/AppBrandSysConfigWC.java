package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC */
public class AppBrandSysConfigWC extends AppBrandSysConfigLU {
    public static final Parcelable.Creator<AppBrandSysConfigWC> CREATOR = new C81619a();

    /* renamed from: W0 */
    public boolean f239408W0;

    /* renamed from: X0 */
    public boolean f239409X0;

    /* renamed from: Y0 */
    public boolean f239410Y0;

    /* renamed from: Z0 */
    public int f239411Z0;

    /* renamed from: a1 */
    public byte[] f239412a1;

    /* renamed from: b1 */
    public int f239413b1;

    /* renamed from: c1 */
    public int f239414c1;

    /* renamed from: d1 */
    public int f239415d1;

    /* renamed from: e1 */
    public int f239416e1;

    /* renamed from: f1 */
    public int f239417f1;

    /* renamed from: g1 */
    public String f239418g1;

    /* renamed from: h1 */
    public String f239419h1;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC$a */
    public class C81619a implements Parcelable.Creator<AppBrandSysConfigWC> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandSysConfigWC(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandSysConfigWC[i];
        }
    }

    public AppBrandSysConfigWC() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f239408W0 ? (byte) 1 : 0);
        parcel.writeInt(this.f239409X0 ? 1 : 0);
        parcel.writeInt(this.f239411Z0);
        parcel.writeInt(this.f239410Y0 ? 1 : 0);
        parcel.writeByteArray(this.f239412a1);
        parcel.writeInt(this.f239413b1);
        parcel.writeInt(this.f239414c1);
        parcel.writeInt(this.f239415d1);
        parcel.writeInt(this.f239416e1);
        parcel.writeInt(this.f239417f1);
        parcel.writeString(this.f239418g1);
        parcel.writeString(this.f239419h1);
    }

    public AppBrandSysConfigWC(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.f239408W0 = parcel.readByte() != 0;
        this.f239409X0 = parcel.readInt() == 1;
        this.f239411Z0 = parcel.readInt();
        this.f239410Y0 = parcel.readInt() == 1 ? true : z;
        this.f239412a1 = parcel.createByteArray();
        this.f239413b1 = parcel.readInt();
        this.f239414c1 = parcel.readInt();
        this.f239415d1 = parcel.readInt();
        this.f239416e1 = parcel.readInt();
        this.f239417f1 = parcel.readInt();
        this.f239418g1 = parcel.readString();
        this.f239419h1 = parcel.readString();
    }
}
