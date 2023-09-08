package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper */
public class PathActionArgWrapper extends BaseDrawActionArg {
    public static final Parcelable.Creator<PathActionArgWrapper> CREATOR = new C104775a();

    /* renamed from: e */
    public List<BasePathActionArg> f311155e = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper$a */
    public class C104775a implements Parcelable.Creator<PathActionArgWrapper> {
        public Object createFromParcel(Parcel parcel) {
            return new PathActionArgWrapper(parcel);
        }

        public Object[] newArray(int i) {
            return new PathActionArgWrapper[i];
        }
    }

    public PathActionArgWrapper(Parcel parcel) {
        super(parcel, (Object) null);
        this.f311155e = parcel.readArrayList(PathActionArgWrapper.class.getClassLoader());
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof PathActionArgWrapper)) {
            return this.f311155e.equals(((PathActionArgWrapper) obj).f311155e);
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeList(this.f311155e);
    }

    public PathActionArgWrapper() {
    }
}
