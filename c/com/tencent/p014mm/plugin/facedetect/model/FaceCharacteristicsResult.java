package com.tencent.p014mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult */
public class FaceCharacteristicsResult implements Parcelable {
    public static final Parcelable.Creator<FaceCharacteristicsResult> CREATOR = new C115419a();

    /* renamed from: d */
    public FaceProNative.FaceStatus f345934d;

    /* renamed from: e */
    public int f345935e;

    /* renamed from: f */
    public String f345936f;

    /* renamed from: com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult$a */
    public class C115419a implements Parcelable.Creator<FaceCharacteristicsResult> {
        public Object createFromParcel(Parcel parcel) {
            return new FaceCharacteristicsResult(parcel);
        }

        public Object[] newArray(int i) {
            return new FaceCharacteristicsResult[i];
        }
    }

    public FaceCharacteristicsResult(Parcel parcel) {
        this.f345935e = parcel.readInt();
        this.f345936f = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "FaceCharacteristicsResult{mStatus=" + this.f345934d + ", errCode=" + this.f345935e + ", errMsg='" + this.f345936f + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f345934d, i);
        parcel.writeInt(this.f345935e);
        parcel.writeString(this.f345936f);
    }

    public FaceCharacteristicsResult() {
    }
}
