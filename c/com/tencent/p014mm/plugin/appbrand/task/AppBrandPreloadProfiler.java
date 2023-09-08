package com.tencent.p014mm.plugin.appbrand.task;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler */
public class AppBrandPreloadProfiler implements Parcelable {
    public static final Parcelable.Creator<AppBrandPreloadProfiler> CREATOR = new C84265a();

    /* renamed from: d */
    public long f246123d = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: e */
    public int f246124e;

    /* renamed from: f */
    public String f246125f;

    /* renamed from: g */
    public String f246126g;

    /* renamed from: h */
    public long f246127h = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: i */
    public long f246128i = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: j */
    public long f246129j = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: n */
    public long f246130n = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler$a */
    public class C84265a implements Parcelable.Creator<AppBrandPreloadProfiler> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandPreloadProfiler(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandPreloadProfiler[i];
        }
    }

    public AppBrandPreloadProfiler() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        long j = this.f246123d;
        if (j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
            long j2 = this.f246127h;
            if (!(j2 == MAlarmHandler.NEXT_FIRE_INTERVAL || this.f246128i == MAlarmHandler.NEXT_FIRE_INTERVAL || this.f246129j == MAlarmHandler.NEXT_FIRE_INTERVAL)) {
                return Util.safeFormatString("[AppBrandPreloadProfiler] process-start costs [%d]ms, trans-thread costs [%d]ms, preload component costs [%d]ms", Long.valueOf(j2 - j), Long.valueOf(this.f246128i - this.f246127h), Long.valueOf(this.f246129j - this.f246128i));
            }
        }
        return Util.safeFormatString("[AppBrandPreloadProfiler] in panic req = [%d]ms, process = [%d]ms, start = [%d]ms, end = [%d]ms", Long.valueOf(j), Long.valueOf(this.f246127h), Long.valueOf(this.f246128i), Long.valueOf(this.f246129j));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f246123d);
        parcel.writeLong(this.f246127h);
        parcel.writeLong(this.f246128i);
        parcel.writeLong(this.f246129j);
        parcel.writeLong(this.f246130n);
        parcel.writeString(this.f246125f);
        parcel.writeString(this.f246126g);
    }

    public AppBrandPreloadProfiler(Parcel parcel) {
        this.f246123d = parcel.readLong();
        this.f246127h = parcel.readLong();
        this.f246128i = parcel.readLong();
        this.f246129j = parcel.readLong();
        this.f246130n = parcel.readLong();
        this.f246125f = parcel.readString();
        this.f246126g = parcel.readString();
    }
}
