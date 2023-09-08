package com.tencent.p014mm.plugin.facedetectlight.Utils;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectResult */
public class YTAGFaceReflectResult implements Parcelable {
    public static final Parcelable.Creator<YTAGFaceReflectResult> CREATOR = new C115440a();
    public byte[] data;
    public int result;
    public byte[] sidedata;

    /* renamed from: com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectResult$a */
    public class C115440a implements Parcelable.Creator<YTAGFaceReflectResult> {
        public Object createFromParcel(Parcel parcel) {
            return new YTAGFaceReflectResult(parcel);
        }

        public Object[] newArray(int i) {
            return new YTAGFaceReflectResult[i];
        }
    }

    public YTAGFaceReflectResult(int i) {
        this.result = i;
        this.data = null;
        this.sidedata = null;
    }

    public int describeContents() {
        return 0;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setResult(int i) {
        this.result = i;
    }

    public void setSidedata(byte[] bArr) {
        this.sidedata = bArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.result);
        parcel.writeByteArray(this.data);
        parcel.writeByteArray(this.sidedata);
    }

    public YTAGFaceReflectResult(Parcel parcel) {
        this.result = parcel.readInt();
        this.data = parcel.createByteArray();
        this.sidedata = parcel.createByteArray();
    }
}
