package com.tencent.p014mm.plugin.appbrand.collector;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.collector.CollectSession */
public class CollectSession implements Parcelable {
    public static final Parcelable.Creator<CollectSession> CREATOR = new C115240a();

    /* renamed from: d */
    public String f345329d;

    /* renamed from: e */
    public String f345330e;

    /* renamed from: f */
    public TimePoint f345331f;

    /* renamed from: g */
    public final Map<String, TimePoint> f345332g = new HashMap();

    /* renamed from: h */
    public String f345333h;

    /* renamed from: i */
    public final Bundle f345334i = new Bundle();

    /* renamed from: com.tencent.mm.plugin.appbrand.collector.CollectSession$a */
    public class C115240a implements Parcelable.Creator<CollectSession> {
        public Object createFromParcel(Parcel parcel) {
            CollectSession collectSession = new CollectSession();
            collectSession.f345329d = parcel.readString();
            collectSession.f345330e = parcel.readString();
            collectSession.f345331f = (TimePoint) parcel.readParcelable(CollectSession.class.getClassLoader());
            collectSession.f345333h = parcel.readString();
            Bundle readBundle = parcel.readBundle();
            if (readBundle != null) {
                collectSession.f345334i.putAll(readBundle);
            }
            TimePoint timePoint = collectSession.f345331f;
            if (timePoint != null) {
                ((HashMap) collectSession.f345332g).put(timePoint.f345336e, timePoint);
                while (timePoint.f345338g.get() != null) {
                    timePoint = timePoint.f345338g.get();
                    ((HashMap) collectSession.f345332g).put(timePoint.f345336e, timePoint);
                }
            }
            return collectSession;
        }

        public Object[] newArray(int i) {
            return new CollectSession[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f345329d);
        parcel.writeString(this.f345330e);
        parcel.writeParcelable(this.f345331f, i);
        parcel.writeString(this.f345333h);
        parcel.writeBundle(this.f345334i);
    }
}
