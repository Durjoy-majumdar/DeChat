package com.tencent.p014mm.plugin.gallery.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.gallery.model.SelectedItem */
public class SelectedItem implements Parcelable {
    public static final Parcelable.Creator<SelectedItem> CREATOR = new C85193a();

    /* renamed from: d */
    public String f248203d;

    /* renamed from: e */
    public long f248204e;

    /* renamed from: com.tencent.mm.plugin.gallery.model.SelectedItem$a */
    public class C85193a implements Parcelable.Creator<SelectedItem> {
        public Object createFromParcel(Parcel parcel) {
            new SelectedItem(parcel);
            throw null;
        }

        public Object[] newArray(int i) {
            return new SelectedItem[i];
        }
    }

    public SelectedItem() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj instanceof SelectedItem ? ((SelectedItem) obj).f248204e == this.f248204e : super.equals(obj);
    }

    public int hashCode() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f248203d);
        parcel.writeLong(this.f248204e);
        throw null;
    }

    public SelectedItem(Parcel parcel) {
        this.f248203d = parcel.readString();
        this.f248204e = parcel.readLong();
        parcel.createFloatArray();
        throw null;
    }
}
