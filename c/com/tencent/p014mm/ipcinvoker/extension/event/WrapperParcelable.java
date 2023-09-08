package com.tencent.p014mm.ipcinvoker.extension.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.extension.C80891a;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;

/* renamed from: com.tencent.mm.ipcinvoker.extension.event.WrapperParcelable */
class WrapperParcelable implements Parcelable {
    public static final Parcelable.Creator<WrapperParcelable> CREATOR = new C80895a();

    /* renamed from: d */
    public Object f237724d;

    /* renamed from: com.tencent.mm.ipcinvoker.extension.event.WrapperParcelable$a */
    public class C80895a implements Parcelable.Creator<WrapperParcelable> {
        public Object createFromParcel(Parcel parcel) {
            WrapperParcelable wrapperParcelable = new WrapperParcelable((C80895a) null);
            if (parcel.readInt() == 1) {
                wrapperParcelable.f237724d = C80893c.m98762c(parcel.readString(), parcel);
            }
            return wrapperParcelable;
        }

        public Object[] newArray(int i) {
            return new WrapperParcelable[i];
        }
    }

    public WrapperParcelable(C80895a aVar) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C80891a b;
        Object obj = this.f237724d;
        if (obj == null || (b = C80893c.m98761b(obj)) == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(b.getName());
        b.mo56344c(this.f237724d, parcel);
    }
}
