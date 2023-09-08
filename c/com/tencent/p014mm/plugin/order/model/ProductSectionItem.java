package com.tencent.p014mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.order.model.ProductSectionItem */
public class ProductSectionItem implements Parcelable {
    public static final Parcelable.Creator<ProductSectionItem> CREATER = new C70049a();

    /* renamed from: d */
    public String f202148d;

    /* renamed from: e */
    public String f202149e;

    /* renamed from: f */
    public List<Skus> f202150f;

    /* renamed from: g */
    public int f202151g;

    /* renamed from: h */
    public String f202152h;

    /* renamed from: i */
    public String f202153i;

    /* renamed from: j */
    public String f202154j;

    /* renamed from: n */
    public int f202155n;

    /* renamed from: com.tencent.mm.plugin.order.model.ProductSectionItem$Skus */
    public static class Skus implements Parcelable {
        public static final Parcelable.Creator<Skus> CREATER = new C70048a();

        /* renamed from: d */
        public String f202156d;

        /* renamed from: e */
        public String f202157e;

        /* renamed from: com.tencent.mm.plugin.order.model.ProductSectionItem$Skus$a */
        public class C70048a implements Parcelable.Creator<Skus> {
            public Object createFromParcel(Parcel parcel) {
                return new Skus(parcel);
            }

            public Object[] newArray(int i) {
                return new Skus[i];
            }
        }

        public Skus() {
        }

        /* renamed from: a */
        public static String m82532a(List<Skus> list) {
            if (list == null || list.size() == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                Skus skus = list.get(i);
                if (i != 0) {
                    sb.append("、");
                }
                sb.append(skus.f202157e);
            }
            return sb.toString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f202156d);
            parcel.writeString(this.f202157e);
        }

        public Skus(Parcel parcel) {
            this.f202156d = parcel.readString();
            this.f202157e = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.model.ProductSectionItem$a */
    public class C70049a implements Parcelable.Creator<ProductSectionItem> {
        public Object createFromParcel(Parcel parcel) {
            return new ProductSectionItem(parcel);
        }

        public Object[] newArray(int i) {
            return new ProductSectionItem[i];
        }
    }

    public ProductSectionItem() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f202148d);
        parcel.writeString(this.f202149e);
        List<Skus> list = this.f202150f;
        if (list != null) {
            parcel.writeInt(list.size());
            for (int i2 = 0; i2 < this.f202150f.size(); i2++) {
                Skus skus = this.f202150f.get(i2);
                parcel.writeString(skus.f202156d);
                parcel.writeString(skus.f202157e);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f202151g);
        parcel.writeString(this.f202152h);
        parcel.writeString(this.f202153i);
        parcel.writeString(this.f202154j);
        parcel.writeInt(this.f202155n);
    }

    public ProductSectionItem(Parcel parcel) {
        this.f202148d = parcel.readString();
        this.f202149e = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f202150f = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                Skus skus = new Skus();
                skus.f202156d = parcel.readString();
                skus.f202157e = parcel.readString();
                this.f202150f.add(skus);
            }
        }
        this.f202151g = parcel.readInt();
        this.f202152h = parcel.readString();
        this.f202153i = parcel.readString();
        this.f202154j = parcel.readString();
        this.f202155n = parcel.readInt();
    }
}
