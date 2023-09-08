package com.tencent.p014mm.plugin.appbrand.openmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Objects;
import p225rc.C89925n;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel */
public class AppBrandOpenMaterialModel implements Parcelable {
    public static final Parcelable.Creator<AppBrandOpenMaterialModel> CREATOR = new C104790a();

    /* renamed from: d */
    public final String f311222d;

    /* renamed from: e */
    public final int f311223e;

    /* renamed from: f */
    public final String f311224f;

    /* renamed from: g */
    public final String f311225g;

    /* renamed from: h */
    public final String f311226h;

    /* renamed from: i */
    public String f311227i;

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel$a */
    public class C104790a implements Parcelable.Creator<AppBrandOpenMaterialModel> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandOpenMaterialModel(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandOpenMaterialModel[i];
        }
    }

    public AppBrandOpenMaterialModel(String str, int i, String str2, String str3, String str4) {
        String str5;
        this.f311222d = str;
        this.f311223e = i;
        if (!Util.isNullOrNil(str2)) {
            String a = C89925n.m112488a(str2);
            if (!a.endsWith(".html")) {
                str5 = str2.replace(a, a + ".html");
                Log.m105925i("MicroMsg.AppBrand.BaseAppBrandOpenMaterialModel", "fixPath, path: %s, fixedPath: %s", str2, str5);
                this.f311224f = str5;
                this.f311225g = str3;
                this.f311226h = str4;
            }
        }
        str5 = str2;
        Log.m105925i("MicroMsg.AppBrand.BaseAppBrandOpenMaterialModel", "fixPath, path: %s, fixedPath: %s", str2, str5);
        this.f311224f = str5;
        this.f311225g = str3;
        this.f311226h = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppBrandOpenMaterialModel appBrandOpenMaterialModel = (AppBrandOpenMaterialModel) obj;
        return this.f311223e == appBrandOpenMaterialModel.f311223e && this.f311222d.equals(appBrandOpenMaterialModel.f311222d) && this.f311224f.equals(appBrandOpenMaterialModel.f311224f) && Objects.equals(this.f311225g, appBrandOpenMaterialModel.f311225g) && this.f311226h.equals(appBrandOpenMaterialModel.f311226h) && Objects.equals(this.f311227i, appBrandOpenMaterialModel.f311227i);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f311222d, Integer.valueOf(this.f311223e), this.f311224f, this.f311225g, this.f311226h, this.f311227i});
    }

    public String toString() {
        return "AppBrandOpenMaterialModel{iconUrl='" + this.f311225g + '\'' + ", functionName='" + this.f311226h + '\'' + ", appName='" + this.f311227i + '\'' + ", appId='" + this.f311222d + '\'' + ", versionType=" + this.f311223e + ", enterPath='" + this.f311224f + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311222d);
        parcel.writeInt(this.f311223e);
        parcel.writeString(this.f311224f);
        parcel.writeString(this.f311225g);
        parcel.writeString(this.f311226h);
        parcel.writeString(this.f311227i);
    }

    public AppBrandOpenMaterialModel(Parcel parcel) {
        this.f311222d = Util.nullAs(parcel.readString(), "");
        this.f311223e = parcel.readInt();
        this.f311224f = Util.nullAs(parcel.readString(), "");
        this.f311225g = parcel.readString();
        this.f311226h = Util.nullAs(parcel.readString(), "");
        this.f311227i = parcel.readString();
    }
}
