package com.tencent.p014mm.plugin.recordvideo.jumper;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo */
public class VideoCaptureReportInfo implements Parcelable {
    public static final Parcelable.Creator<VideoCaptureReportInfo> CREATOR = new C94407a();

    /* renamed from: d */
    public int f272940d = -1;

    /* renamed from: e */
    public int f272941e = -1;

    /* renamed from: f */
    public long f272942f = -1;

    /* renamed from: g */
    public int f272943g = 0;

    /* renamed from: h */
    public long f272944h = 0;

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo$a */
    public class C94407a implements Parcelable.Creator<VideoCaptureReportInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new VideoCaptureReportInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new VideoCaptureReportInfo[i];
        }
    }

    public VideoCaptureReportInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f272940d);
        parcel.writeInt(this.f272941e);
        parcel.writeLong(this.f272942f);
        parcel.writeInt(this.f272943g);
        parcel.writeLong(this.f272944h);
    }

    public VideoCaptureReportInfo(Parcel parcel) {
        this.f272940d = parcel.readInt();
        this.f272941e = parcel.readInt();
        this.f272942f = parcel.readLong();
        this.f272943g = parcel.readInt();
        this.f272944h = parcel.readLong();
    }
}
