package com.tencent.p014mm.p136ui.widget.cedit.util;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ui.widget.cedit.util.ParcelableParcel */
public class ParcelableParcel implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<ParcelableParcel> CREATOR = new C106801a();

    /* renamed from: d */
    public final Parcel f319537d;

    /* renamed from: com.tencent.mm.ui.widget.cedit.util.ParcelableParcel$a */
    public class C106801a implements Parcelable.ClassLoaderCreator<ParcelableParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableParcel(parcel, (ClassLoader) null);
        }

        public Object[] newArray(int i) {
            return new ParcelableParcel[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ParcelableParcel(parcel, classLoader);
        }
    }

    public ParcelableParcel(Parcel parcel, ClassLoader classLoader) {
        int i;
        Parcel obtain = Parcel.obtain();
        this.f319537d = obtain;
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            int dataPosition = parcel.dataPosition();
            if (readInt == 0) {
                i = dataPosition;
            } else if ((readInt <= 0 || dataPosition > Integer.MAX_VALUE - readInt) && (readInt >= 0 || dataPosition < Integer.MIN_VALUE - readInt)) {
                throw new IllegalArgumentException("Addition overflow: " + dataPosition + " + " + readInt);
            } else {
                i = dataPosition + readInt;
            }
            parcel.setDataPosition(i);
            obtain.appendFrom(parcel, dataPosition, readInt);
            return;
        }
        throw new IllegalArgumentException("Negative size read from parcel");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f319537d.dataSize());
        Parcel parcel2 = this.f319537d;
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
    }
}
