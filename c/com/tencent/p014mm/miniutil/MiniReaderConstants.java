package com.tencent.p014mm.miniutil;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.miniutil.MiniReaderConstants */
public class MiniReaderConstants {

    /* renamed from: com.tencent.mm.miniutil.MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent */
    public static final class MiniQbFloatBallMenuActionBrandEvent implements Parcelable {
        public static final Parcelable.Creator<MiniQbFloatBallMenuActionBrandEvent> CREATOR = new C17788a();

        /* renamed from: d */
        public int f48957d;

        /* renamed from: e */
        public String f48958e;

        /* renamed from: com.tencent.mm.miniutil.MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent$a */
        public class C17788a implements Parcelable.Creator<MiniQbFloatBallMenuActionBrandEvent> {
            public Object createFromParcel(Parcel parcel) {
                return new MiniQbFloatBallMenuActionBrandEvent(parcel);
            }

            public Object[] newArray(int i) {
                return new MiniQbFloatBallMenuActionBrandEvent[i];
            }
        }

        public MiniQbFloatBallMenuActionBrandEvent(int i, String str) {
            this.f48957d = i;
            this.f48958e = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f48957d);
            parcel.writeString(this.f48958e);
        }

        public MiniQbFloatBallMenuActionBrandEvent(Parcel parcel) {
            this.f48957d = parcel.readInt();
            this.f48958e = parcel.readString();
        }
    }
}
