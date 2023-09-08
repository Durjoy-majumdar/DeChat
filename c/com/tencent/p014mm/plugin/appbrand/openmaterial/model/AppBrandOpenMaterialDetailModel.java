package com.tencent.p014mm.plugin.appbrand.openmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel */
public class AppBrandOpenMaterialDetailModel implements Parcelable {
    public static final Parcelable.Creator<AppBrandOpenMaterialDetailModel> CREATOR = new C104789a();

    /* renamed from: d */
    public final AppBrandOpenMaterialModel f311218d;

    /* renamed from: e */
    public final List<String> f311219e;

    /* renamed from: f */
    public final float f311220f;

    /* renamed from: g */
    public final String f311221g;

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel$a */
    public class C104789a implements Parcelable.Creator<AppBrandOpenMaterialDetailModel> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandOpenMaterialDetailModel(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandOpenMaterialDetailModel[i];
        }
    }

    public AppBrandOpenMaterialDetailModel(String str, int i, String str2, String str3, String str4, List<String> list, float f, String str5) {
        this.f311218d = new AppBrandOpenMaterialModel(str, i, str2, str3, str4);
        this.f311219e = list;
        this.f311220f = f;
        this.f311221g = str5;
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
        AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = (AppBrandOpenMaterialDetailModel) obj;
        return Float.compare(appBrandOpenMaterialDetailModel.f311220f, this.f311220f) == 0 && this.f311218d.equals(appBrandOpenMaterialDetailModel.f311218d) && this.f311219e.equals(appBrandOpenMaterialDetailModel.f311219e) && this.f311221g.equals(appBrandOpenMaterialDetailModel.f311221g);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f311218d, this.f311219e, Float.valueOf(this.f311220f), this.f311221g});
    }

    public String toString() {
        return "AppBrandOpenMaterialDetailModel{model=" + this.f311218d + ", categories='" + Arrays.toString(this.f311219e.toArray()) + '\'' + ", score=" + this.f311220f + ", functionDesc='" + this.f311221g + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.f311218d.writeToParcel(parcel, i);
        parcel.writeStringList(this.f311219e);
        parcel.writeFloat(this.f311220f);
        parcel.writeString(this.f311221g);
    }

    public AppBrandOpenMaterialDetailModel(Parcel parcel) {
        this.f311218d = new AppBrandOpenMaterialModel(parcel);
        ArrayList arrayList = new ArrayList();
        this.f311219e = arrayList;
        parcel.readStringList(arrayList);
        this.f311220f = parcel.readFloat();
        this.f311221g = Util.nullAs(parcel.readString(), "");
    }
}
