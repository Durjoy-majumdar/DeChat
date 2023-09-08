package com.tencent.p014mm.plugin.appbrand.collector;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.tencent.mm.plugin.appbrand.collector.TimePoint */
public class TimePoint implements Parcelable {
    public static final Parcelable.Creator<TimePoint> CREATOR = new C115241a();

    /* renamed from: d */
    public final AtomicInteger f345335d = new AtomicInteger();

    /* renamed from: e */
    public String f345336e = "";

    /* renamed from: f */
    public final AtomicLong f345337f = new AtomicLong();

    /* renamed from: g */
    public final AtomicReference<TimePoint> f345338g = new AtomicReference<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.collector.TimePoint$a */
    public class C115241a implements Parcelable.Creator<TimePoint> {
        public Object createFromParcel(Parcel parcel) {
            TimePoint timePoint = new TimePoint();
            timePoint.f345336e = parcel.readString();
            timePoint.f345337f.set(parcel.readLong());
            timePoint.f345335d.set(parcel.readInt());
            timePoint.f345338g.set((TimePoint) parcel.readParcelable(TimePoint.class.getClassLoader()));
            return timePoint;
        }

        public Object[] newArray(int i) {
            return new TimePoint[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f345336e);
        parcel.writeLong(this.f345337f.get());
        parcel.writeInt(this.f345335d.get());
        parcel.writeParcelable(this.f345338g.get(), i);
    }
}
