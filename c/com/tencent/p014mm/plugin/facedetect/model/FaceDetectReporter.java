package com.tencent.p014mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceDetectReporter */
public class FaceDetectReporter implements Parcelable {
    public static final Parcelable.Creator<FaceDetectReporter> CREATOR = new C115421a();

    /* renamed from: s */
    public static FaceDetectReporter f345959s = new FaceDetectReporter();

    /* renamed from: d */
    public long f345960d;

    /* renamed from: e */
    public boolean f345961e;

    /* renamed from: f */
    public FaceDetectReportInfo f345962f;

    /* renamed from: g */
    public String f345963g;

    /* renamed from: h */
    public int f345964h;

    /* renamed from: i */
    public int f345965i;

    /* renamed from: j */
    public int f345966j;

    /* renamed from: n */
    public long f345967n;

    /* renamed from: o */
    public long f345968o;

    /* renamed from: p */
    public long f345969p;

    /* renamed from: q */
    public int f345970q;

    /* renamed from: r */
    public boolean f345971r;

    /* renamed from: com.tencent.mm.plugin.facedetect.model.FaceDetectReporter$a */
    public class C115421a implements Parcelable.Creator<FaceDetectReporter> {
        public Object createFromParcel(Parcel parcel) {
            return new FaceDetectReporter(parcel);
        }

        public Object[] newArray(int i) {
            return new FaceDetectReporter[i];
        }
    }

    public FaceDetectReporter(Parcel parcel) {
        this.f345960d = 0;
        boolean z = false;
        this.f345961e = false;
        this.f345962f = null;
        this.f345963g = "";
        this.f345964h = -1;
        this.f345965i = 0;
        this.f345966j = 0;
        this.f345967n = 0;
        this.f345968o = -1;
        this.f345969p = -1;
        this.f345970q = 0;
        this.f345971r = false;
        this.f345960d = parcel.readLong();
        this.f345961e = parcel.readByte() != 0;
        this.f345962f = (FaceDetectReportInfo) parcel.readParcelable(FaceDetectReportInfo.class.getClassLoader());
        this.f345963g = parcel.readString();
        this.f345964h = parcel.readInt();
        this.f345965i = parcel.readInt();
        this.f345966j = parcel.readInt();
        this.f345967n = parcel.readLong();
        this.f345968o = parcel.readLong();
        this.f345969p = parcel.readLong();
        this.f345970q = parcel.readInt();
        this.f345971r = parcel.readByte() != 0 ? true : z;
    }

    /* renamed from: a */
    public static FaceDetectReporter m162242a() {
        FaceDetectReporter faceDetectReporter;
        FaceDetectReporter faceDetectReporter2 = f345959s;
        if (faceDetectReporter2 != null) {
            return faceDetectReporter2;
        }
        synchronized (FaceDetectReporter.class) {
            if (f345959s == null) {
                f345959s = new FaceDetectReporter();
            }
            faceDetectReporter = f345959s;
        }
        return faceDetectReporter;
    }

    /* renamed from: d */
    public static void m162243d(long j, int i, int i2) {
        Log.m105925i("MicroMsg.FaceDetectReporter", "hy: report video: bioId: %d, errType: %d, errCode: %d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
        C117407d.INSTANCE.mo160131h(14121, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: b */
    public void mo175298b(String str, int i) {
        long j = this.f345968o;
        long j2 = -1;
        if (j != -1) {
            long j3 = this.f345969p;
            if (j3 != -1 && j3 >= j) {
                j2 = j3 - j;
                Log.m105925i("MicroMsg.FaceDetectReporter", "alvinluo report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", Long.valueOf(this.f345967n), str, -1, Integer.valueOf(i), Long.valueOf(j2), Boolean.valueOf(this.f345971r), this.f345963g, Integer.valueOf(this.f345970q));
                C117407d.INSTANCE.mo160131h(14560, Long.valueOf(this.f345967n), str, -1, Integer.valueOf(i), this.f345963g, Integer.valueOf(this.f345971r ? 1 : 0), Long.valueOf(j2), Integer.valueOf(this.f345970q));
            }
        }
        Log.m105921e("MicroMsg.FaceDetectReporter", "alvinluo not set calledStartTime:%d or calledEndTime: %d, total time is not valid", Long.valueOf(j), Long.valueOf(this.f345969p));
        Log.m105925i("MicroMsg.FaceDetectReporter", "alvinluo report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", Long.valueOf(this.f345967n), str, -1, Integer.valueOf(i), Long.valueOf(j2), Boolean.valueOf(this.f345971r), this.f345963g, Integer.valueOf(this.f345970q));
        C117407d.INSTANCE.mo160131h(14560, Long.valueOf(this.f345967n), str, -1, Integer.valueOf(i), this.f345963g, Integer.valueOf(this.f345971r ? 1 : 0), Long.valueOf(j2), Integer.valueOf(this.f345970q));
    }

    /* renamed from: c */
    public void mo175299c(int i, boolean z, int i2, int i3, int i4) {
        int i5;
        int i6;
        Log.m105927v("MicroMsg.FaceDetectReporter", "reportFaceDetectVerifyResult sessionId: %d, hasReported: %b, businessType: %d, isRetry: %b, result: %d, errType: %d, errCode: %d", Long.valueOf(this.f345960d), Boolean.valueOf(this.f345961e), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        FaceDetectReportInfo faceDetectReportInfo = this.f345962f;
        if (faceDetectReportInfo != null && !this.f345961e) {
            Log.m105927v("MicroMsg.FaceDetectReporter", "info: %s", faceDetectReportInfo.toString());
            this.f345961e = true;
            FaceDetectReportInfo faceDetectReportInfo2 = this.f345962f;
            faceDetectReportInfo2.f345956x = 0;
            int i7 = faceDetectReportInfo2.f345955w;
            if (i7 != 0) {
                faceDetectReportInfo2.f345958z = faceDetectReportInfo2.f345957y / i7;
            }
            if (!faceDetectReportInfo2.f345937A.containsKey(0) || !this.f345962f.f345938B.containsKey(0)) {
                i5 = 0;
            } else {
                i5 = (int) (this.f345962f.f345938B.get(0).longValue() - this.f345962f.f345937A.get(0).longValue());
                Log.m105924i("MicroMsg.FaceDetectReporter", "normalMotionTime : " + i5 + "  hashCode :" + hashCode());
            }
            if (!this.f345962f.f345937A.containsKey(4) || !this.f345962f.f345938B.containsKey(4)) {
                i6 = 0;
            } else {
                i6 = (int) (this.f345962f.f345938B.get(4).longValue() - this.f345962f.f345937A.get(4).longValue());
                Log.m105924i("MicroMsg.FaceDetectReporter", "readNumberMotionTime : " + i6 + "  hashCode :" + hashCode());
            }
            if (this.f345962f.f345937A.containsKey(6) && this.f345962f.f345938B.containsKey(6)) {
                i6 = (int) (this.f345962f.f345938B.get(6).longValue() - this.f345962f.f345937A.get(6).longValue());
                Log.m105924i("MicroMsg.FaceDetectReporter", "MOTION_REFLECTION : " + i6 + "  hashCode :" + hashCode());
            }
            Log.m105927v("MicroMsg.FaceDetectReporter", "alvinluo normal motion time: %d ms, read number motion time: %d ms ,hashcode %d", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(hashCode()));
            C117407d.INSTANCE.mo160131h(14006, Long.valueOf(this.f345960d), Integer.valueOf(i), Integer.valueOf(z ? 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(this.f345962f.f345941f), Integer.valueOf(this.f345962f.f345942g), Integer.valueOf(this.f345962f.f345943h), Integer.valueOf(this.f345962f.f345940e), Integer.valueOf(this.f345962f.f345944i), Integer.valueOf(this.f345962f.f345945j), Integer.valueOf(this.f345962f.f345946n), Integer.valueOf(this.f345962f.f345947o), Integer.valueOf(this.f345962f.f345948p), Integer.valueOf(this.f345962f.f345949q), Integer.valueOf(this.f345962f.f345950r), Integer.valueOf(this.f345962f.f345951s), Integer.valueOf(this.f345962f.f345952t), Integer.valueOf(this.f345962f.f345956x), Integer.valueOf(this.f345962f.f345953u), Integer.valueOf(this.f345962f.f345954v), Integer.valueOf(this.f345962f.f345958z), Integer.valueOf(i5), Integer.valueOf(i6), this.f345963g, Integer.valueOf(this.f345964h), Integer.valueOf(this.f345965i), Integer.valueOf(this.f345966j));
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo175301e(int i, long j) {
        if (this.f345962f != null) {
            Log.m105924i("MicroMsg.FaceDetectReporter", "hashCode :" + hashCode() + " endTime:" + j);
            this.f345962f.f345938B.put(Integer.valueOf(i), Long.valueOf(j));
        }
    }

    /* renamed from: f */
    public void mo175302f(int i, long j) {
        if (this.f345962f != null) {
            Log.m105924i("MicroMsg.FaceDetectReporter", "hashCode :" + hashCode() + " startTime" + j);
            this.f345962f.f345937A.put(Integer.valueOf(i), Long.valueOf(j));
        }
    }

    /* renamed from: g */
    public void mo175303g(FaceDetectReporter faceDetectReporter) {
        Log.m105927v("MicroMsg.FaceDetectReporter", "alvinluo setReporter, stack: %s", Util.getStack().toString());
        this.f345962f = faceDetectReporter.f345962f;
        this.f345961e = faceDetectReporter.f345961e;
        long j = faceDetectReporter.f345960d;
        this.f345960d = j;
        this.f345965i = faceDetectReporter.f345965i;
        this.f345966j = faceDetectReporter.f345966j;
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(j);
        FaceDetectReportInfo faceDetectReportInfo = this.f345962f;
        objArr[1] = faceDetectReportInfo != null ? faceDetectReportInfo.toString() : "null";
        Log.m105927v("MicroMsg.FaceDetectReporter", "alvinluo sessionId: %d, info: %s", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f345960d);
        parcel.writeByte(this.f345961e ? (byte) 1 : 0);
        parcel.writeParcelable(this.f345962f, i);
        parcel.writeString(this.f345963g);
        parcel.writeInt(this.f345964h);
        parcel.writeInt(this.f345965i);
        parcel.writeInt(this.f345966j);
        parcel.writeLong(this.f345967n);
        parcel.writeLong(this.f345968o);
        parcel.writeLong(this.f345969p);
        parcel.writeInt(this.f345970q);
        parcel.writeByte(this.f345971r ? (byte) 1 : 0);
    }

    public FaceDetectReporter() {
        this.f345960d = 0;
        this.f345961e = false;
        this.f345962f = null;
        this.f345963g = "";
        this.f345964h = -1;
        this.f345965i = 0;
        this.f345966j = 0;
        this.f345967n = 0;
        this.f345968o = -1;
        this.f345969p = -1;
        this.f345970q = 0;
        this.f345971r = false;
    }
}
