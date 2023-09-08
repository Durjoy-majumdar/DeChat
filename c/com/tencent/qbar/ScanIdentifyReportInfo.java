package com.tencent.qbar;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/qbar/ScanIdentifyReportInfo;", "Landroid/os/Parcelable;", "scan-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class ScanIdentifyReportInfo implements Parcelable {

    /* renamed from: d */
    public byte[] f285785d;

    /* renamed from: e */
    public Point f285786e;

    /* renamed from: f */
    public String f285787f;

    public ScanIdentifyReportInfo(byte[] bArr, Point point, String str) {
        this.f285785d = bArr;
        this.f285786e = point;
        this.f285787f = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        try {
            parcel.writeByteArray(this.f285785d);
            parcel.writeParcelable(this.f285786e, i);
            parcel.writeString(this.f285787f);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ScanIdentifyReportInfo", "failed write reportinfo to parcel: " + e);
        }
    }
}
