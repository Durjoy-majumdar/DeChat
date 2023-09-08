package com.tencent.p014mm.plugin.appbrand.openmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection */
public class AppBrandOpenMaterialCollection implements Parcelable {
    public static final Parcelable.Creator<AppBrandOpenMaterialCollection> CREATOR = new C104788a();

    /* renamed from: d */
    public final MaterialModel f311215d;

    /* renamed from: e */
    public final List<AppBrandOpenMaterialModel> f311216e;

    /* renamed from: f */
    public final List<AppBrandOpenMaterialDetailModel> f311217f;

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection$a */
    public class C104788a implements Parcelable.Creator<AppBrandOpenMaterialCollection> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandOpenMaterialCollection(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandOpenMaterialCollection[i];
        }
    }

    public AppBrandOpenMaterialCollection(MaterialModel materialModel, List<AppBrandOpenMaterialModel> list, List<AppBrandOpenMaterialDetailModel> list2) {
        this.f311215d = materialModel;
        this.f311216e = new ArrayList(list);
        this.f311217f = new ArrayList(list2);
    }

    /* renamed from: a */
    public static AppBrandOpenMaterialCollection m140439a(MaterialModel materialModel) {
        return new AppBrandOpenMaterialCollection(materialModel, Collections.emptyList(), Collections.emptyList());
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "AppBrandOpenMaterialCollection{materialModel=" + this.f311215d + ", appBrandOpenMaterialModels=" + Arrays.toString(this.f311216e.toArray()) + ", appBrandOpenMaterialDetailModels=" + Arrays.toString(this.f311217f.toArray()) + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f311215d, i);
        parcel.writeTypedList(this.f311216e);
        parcel.writeTypedList(this.f311217f);
    }

    public AppBrandOpenMaterialCollection(Parcel parcel) {
        MaterialModel materialModel = (MaterialModel) parcel.readParcelable(MaterialModel.class.getClassLoader());
        this.f311215d = materialModel == null ? new MaterialModel("", "", "") : materialModel;
        List<AppBrandOpenMaterialModel> createTypedArrayList = parcel.createTypedArrayList(AppBrandOpenMaterialModel.CREATOR);
        this.f311216e = createTypedArrayList == null ? Collections.emptyList() : createTypedArrayList;
        List<AppBrandOpenMaterialDetailModel> createTypedArrayList2 = parcel.createTypedArrayList(AppBrandOpenMaterialDetailModel.CREATOR);
        this.f311217f = createTypedArrayList2 == null ? Collections.emptyList() : createTypedArrayList2;
    }
}
