package com.tencent.qbar;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/qbar/ScanDecodeFrameData;", "Landroid/os/Parcelable;", "scan-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class ScanDecodeFrameData implements Parcelable {
    public static final Parcelable.Creator<ScanDecodeFrameData> CREATOR = new C106886a();

    /* renamed from: d */
    public byte[] f320081d;

    /* renamed from: e */
    public int f320082e;

    /* renamed from: f */
    public int f320083f;

    /* renamed from: g */
    public int f320084g;

    /* renamed from: com.tencent.qbar.ScanDecodeFrameData$a */
    public static final class C106886a implements Parcelable.Creator<ScanDecodeFrameData> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new ScanDecodeFrameData(parcel);
        }

        public Object[] newArray(int i) {
            return new ScanDecodeFrameData[i];
        }
    }

    public ScanDecodeFrameData(byte[] bArr, int i, int i2, int i3) {
        this.f320081d = bArr;
        this.f320083f = i;
        this.f320084g = i2;
        this.f320082e = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeByteArray(this.f320081d);
        parcel.writeInt(this.f320082e);
        parcel.writeInt(this.f320083f);
        parcel.writeInt(this.f320084g);
    }

    public ScanDecodeFrameData(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        this.f320081d = parcel.createByteArray();
        this.f320082e = parcel.readInt();
        this.f320083f = parcel.readInt();
        this.f320084g = parcel.readInt();
    }
}
