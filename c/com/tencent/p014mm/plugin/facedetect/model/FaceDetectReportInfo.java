package com.tencent.p014mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo */
class FaceDetectReportInfo implements Parcelable {
    public static final Parcelable.Creator<FaceDetectReportInfo> CREATOR = new C115420a();

    /* renamed from: A */
    public HashMap<Integer, Long> f345937A = new HashMap<>();

    /* renamed from: B */
    public HashMap<Integer, Long> f345938B = new HashMap<>();

    /* renamed from: d */
    public long f345939d = 0;

    /* renamed from: e */
    public int f345940e = 0;

    /* renamed from: f */
    public int f345941f = 0;

    /* renamed from: g */
    public int f345942g = 0;

    /* renamed from: h */
    public int f345943h = 0;

    /* renamed from: i */
    public int f345944i = 0;

    /* renamed from: j */
    public int f345945j = 0;

    /* renamed from: n */
    public int f345946n = 0;

    /* renamed from: o */
    public int f345947o = 0;

    /* renamed from: p */
    public int f345948p = 0;

    /* renamed from: q */
    public int f345949q = 0;

    /* renamed from: r */
    public int f345950r = 0;

    /* renamed from: s */
    public int f345951s = 0;

    /* renamed from: t */
    public int f345952t = 0;

    /* renamed from: u */
    public int f345953u = 0;

    /* renamed from: v */
    public int f345954v = 0;

    /* renamed from: w */
    public int f345955w = 0;

    /* renamed from: x */
    public int f345956x = 0;

    /* renamed from: y */
    public int f345957y = 0;

    /* renamed from: z */
    public int f345958z = 0;

    /* renamed from: com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo$a */
    public class C115420a implements Parcelable.Creator<FaceDetectReportInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new FaceDetectReportInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new FaceDetectReportInfo[i];
        }
    }

    public FaceDetectReportInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "detectOk: " + this.f345941f + ", " + "motionOk: " + this.f345942g + ", noFace: " + this.f345943h + ", systemErr: " + this.f345940e + ", noLiveFace: " + this.f345944i + ", tooDark: " + this.f345945j + ", tooLight: " + this.f345946n + ", backLight: " + this.f345947o + ", tooSmall: " + this.f345948p + ", tooBig: " + this.f345949q + ", tooActive: " + this.f345950r + ", poseNotValid: " + this.f345951s + ", timeOut: " + this.f345952t + ", totalFrame: " + this.f345955w + ", verifyTime: " + this.f345956x + ", processTimePerFrame: " + this.f345958z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f345939d);
        parcel.writeInt(this.f345940e);
        parcel.writeInt(this.f345941f);
        parcel.writeInt(this.f345942g);
        parcel.writeInt(this.f345943h);
        parcel.writeInt(this.f345944i);
        parcel.writeInt(this.f345945j);
        parcel.writeInt(this.f345946n);
        parcel.writeInt(this.f345947o);
        parcel.writeInt(this.f345948p);
        parcel.writeInt(this.f345949q);
        parcel.writeInt(this.f345950r);
        parcel.writeInt(this.f345951s);
        parcel.writeInt(this.f345952t);
        parcel.writeInt(this.f345953u);
        parcel.writeInt(this.f345954v);
        parcel.writeInt(this.f345955w);
        parcel.writeInt(this.f345956x);
        parcel.writeInt(this.f345957y);
        parcel.writeInt(this.f345958z);
        parcel.writeMap(this.f345937A);
        parcel.writeMap(this.f345938B);
    }

    public FaceDetectReportInfo(Parcel parcel) {
        this.f345939d = parcel.readLong();
        this.f345940e = parcel.readInt();
        this.f345941f = parcel.readInt();
        this.f345942g = parcel.readInt();
        this.f345943h = parcel.readInt();
        this.f345944i = parcel.readInt();
        this.f345945j = parcel.readInt();
        this.f345946n = parcel.readInt();
        this.f345947o = parcel.readInt();
        this.f345948p = parcel.readInt();
        this.f345949q = parcel.readInt();
        this.f345950r = parcel.readInt();
        this.f345951s = parcel.readInt();
        this.f345952t = parcel.readInt();
        this.f345953u = parcel.readInt();
        this.f345954v = parcel.readInt();
        this.f345955w = parcel.readInt();
        this.f345956x = parcel.readInt();
        this.f345957y = parcel.readInt();
        this.f345958z = parcel.readInt();
        try {
            this.f345937A = parcel.readHashMap(HashMap.class.getClassLoader());
            this.f345938B = parcel.readHashMap(HashMap.class.getClassLoader());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceDetectReportInfo", e, "", new Object[0]);
        }
    }
}
