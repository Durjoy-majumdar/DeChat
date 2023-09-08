package com.tencent.p014mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceContextData */
public class FaceContextData implements Parcelable {
    public static final Parcelable.Creator<FaceContextData> CREATOR = new C105223a();

    /* renamed from: e */
    public static volatile FaceContextData f312602e;

    /* renamed from: d */
    public long f312603d = -1;

    /* renamed from: com.tencent.mm.plugin.facedetect.model.FaceContextData$a */
    public class C105223a implements Parcelable.Creator<FaceContextData> {
        public Object createFromParcel(Parcel parcel) {
            return new FaceContextData(parcel);
        }

        public Object[] newArray(int i) {
            return new FaceContextData[i];
        }
    }

    public FaceContextData(Parcel parcel) {
        this.f312603d = parcel.readLong();
    }

    /* renamed from: a */
    public static void m141308a(FaceContextData faceContextData) {
        Assert.assertTrue((f312602e == null || faceContextData == null) ? false : true);
        f312602e.f312603d = faceContextData.f312603d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f312603d);
    }

    public FaceContextData() {
    }
}
