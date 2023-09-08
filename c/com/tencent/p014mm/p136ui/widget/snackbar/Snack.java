package com.tencent.p014mm.p136ui.widget.snackbar;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ui.widget.snackbar.Snack */
class Snack implements Parcelable {
    public static final Parcelable.Creator<Snack> CREATOR = new C75013a();

    /* renamed from: d */
    public final String f220716d;

    /* renamed from: e */
    public final String f220717e;

    /* renamed from: f */
    public final int f220718f;

    /* renamed from: g */
    public final Parcelable f220719g;

    /* renamed from: h */
    public final int f220720h;

    /* renamed from: i */
    public final int f220721i;

    /* renamed from: com.tencent.mm.ui.widget.snackbar.Snack$a */
    public class C75013a implements Parcelable.Creator<Snack> {
        public Object createFromParcel(Parcel parcel) {
            return new Snack(parcel);
        }

        public Object[] newArray(int i) {
            return new Snack[i];
        }
    }

    public Snack(String str, String str2, int i, Parcelable parcelable, int i2, int i3) {
        this.f220716d = str;
        this.f220717e = str2;
        this.f220718f = i;
        this.f220719g = parcelable;
        this.f220720h = i2;
        this.f220721i = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f220716d);
        parcel.writeString(this.f220717e);
        parcel.writeInt(this.f220718f);
        parcel.writeParcelable(this.f220719g, 0);
        parcel.writeInt(this.f220720h);
        parcel.writeInt(this.f220721i);
    }

    public Snack(Parcel parcel) {
        this.f220716d = parcel.readString();
        this.f220717e = parcel.readString();
        this.f220718f = parcel.readInt();
        this.f220719g = parcel.readParcelable(parcel.getClass().getClassLoader());
        this.f220720h = (short) parcel.readInt();
        this.f220721i = parcel.readInt();
    }
}
