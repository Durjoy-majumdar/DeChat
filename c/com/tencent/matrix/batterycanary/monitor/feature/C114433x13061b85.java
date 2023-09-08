package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies */
public class C114433x13061b85 implements Parcelable {
    public static final Parcelable.Creator<C114433x13061b85> CREATOR = new Parcelable.Creator<C114433x13061b85>() {
        public Object createFromParcel(Parcel parcel) {
            return new C114433x13061b85(parcel);
        }

        public Object[] newArray(int i) {
            return new C114433x13061b85[i];
        }
    };

    /* renamed from: d */
    public int f343087d;

    /* renamed from: e */
    public String f343088e;

    /* renamed from: f */
    public long f343089f;

    /* renamed from: g */
    public int f343090g;

    /* renamed from: h */
    public List<IpcThreadJiffies> f343091h;

    public C114433x13061b85(Parcel parcel) {
        this.f343087d = parcel.readInt();
        this.f343088e = parcel.readString();
        this.f343089f = parcel.readLong();
        this.f343090g = parcel.readInt();
        this.f343091h = parcel.createTypedArrayList(IpcThreadJiffies.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f343087d);
        parcel.writeString(this.f343088e);
        parcel.writeLong(this.f343089f);
        parcel.writeInt(this.f343090g);
        parcel.writeTypedList(this.f343091h);
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies$IpcThreadJiffies */
    public static class IpcThreadJiffies implements Parcelable {
        public static final Parcelable.Creator<IpcThreadJiffies> CREATOR = new Parcelable.Creator<IpcThreadJiffies>() {
            public Object createFromParcel(Parcel parcel) {
                return new IpcThreadJiffies(parcel);
            }

            public Object[] newArray(int i) {
                return new IpcThreadJiffies[i];
            }
        };

        /* renamed from: d */
        public int f343092d;

        /* renamed from: e */
        public String f343093e;

        /* renamed from: f */
        public String f343094f;

        /* renamed from: g */
        public long f343095g;

        public IpcThreadJiffies(Parcel parcel) {
            this.f343092d = parcel.readInt();
            this.f343093e = parcel.readString();
            this.f343094f = parcel.readString();
            this.f343095g = parcel.readLong();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f343092d);
            parcel.writeString(this.f343093e);
            parcel.writeString(this.f343094f);
            parcel.writeLong(this.f343095g);
        }

        public IpcThreadJiffies() {
        }
    }

    public C114433x13061b85() {
    }
}
