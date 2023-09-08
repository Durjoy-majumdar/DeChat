package com.tencent.p014mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C80938z;
import java.util.Map;
import u20.C90594b;

/* renamed from: com.tencent.mm.ipcinvoker.extension.XParcelableWrapper */
public class XParcelableWrapper implements Parcelable {
    public static final Parcelable.Creator<XParcelableWrapper> CREATOR = new C80890a();

    /* renamed from: d */
    public C80896f f237718d;

    /* renamed from: com.tencent.mm.ipcinvoker.extension.XParcelableWrapper$a */
    public class C80890a implements Parcelable.Creator<XParcelableWrapper> {
        public Object createFromParcel(Parcel parcel) {
            XParcelableWrapper xParcelableWrapper = new XParcelableWrapper((C80890a) null);
            if (parcel.readInt() == 1) {
                String readString = parcel.readString();
                if (xParcelableWrapper.f237718d == null) {
                    Map<String, C80894e> map = C80938z.f237797a;
                    xParcelableWrapper.f237718d = (C80896f) C90594b.m113496d(readString, C80896f.class);
                }
                C80896f fVar = xParcelableWrapper.f237718d;
                if (fVar != null) {
                    fVar.mo112691a(parcel);
                }
            }
            return xParcelableWrapper;
        }

        public Object[] newArray(int i) {
            return new XParcelableWrapper[i];
        }
    }

    public XParcelableWrapper(C80890a aVar) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f237718d != null) {
            parcel.writeInt(1);
            parcel.writeString(this.f237718d.getClass().getName());
            this.f237718d.mo112692b(parcel);
            return;
        }
        parcel.writeInt(0);
    }
}
