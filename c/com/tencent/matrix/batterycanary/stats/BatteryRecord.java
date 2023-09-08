package com.tencent.matrix.batterycanary.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class BatteryRecord implements Parcelable {

    /* renamed from: d */
    public int f343324d;

    /* renamed from: e */
    public long f343325e;

    public static class DevStatRecord extends BatteryRecord {
        public static final Parcelable.Creator<DevStatRecord> CREATOR = new C114552a();

        /* renamed from: f */
        public int f343327f;

        /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$DevStatRecord$a */
        public class C114552a implements Parcelable.Creator<DevStatRecord> {
            public Object createFromParcel(Parcel parcel) {
                return new DevStatRecord(parcel);
            }

            public Object[] newArray(int i) {
                return new DevStatRecord[i];
            }
        }

        public DevStatRecord() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            BatteryRecord.super.writeToParcel(parcel, i);
            parcel.writeInt(this.f343327f);
        }

        public DevStatRecord(Parcel parcel) {
            super(parcel);
            this.f343327f = parcel.readInt();
        }
    }

    public static class ReportRecord extends EventStatRecord {
        public static final Parcelable.Creator<ReportRecord> CREATOR = new C114557a();

        /* renamed from: i */
        public String f343333i;

        /* renamed from: j */
        public long f343334j;

        /* renamed from: n */
        public List<ThreadInfo> f343335n = Collections.emptyList();

        /* renamed from: o */
        public List<EntryInfo> f343336o = Collections.emptyList();

        /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$a */
        public class C114557a implements Parcelable.Creator<ReportRecord> {
            public Object createFromParcel(Parcel parcel) {
                return new ReportRecord(parcel);
            }

            public Object[] newArray(int i) {
                return new ReportRecord[i];
            }
        }

        public ReportRecord() {
            this.f343324d = 1;
            this.f343329g = "REPORT";
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f343333i);
            parcel.writeLong(this.f343334j);
            parcel.writeTypedList(this.f343335n);
            parcel.writeTypedList(this.f343336o);
        }

        public static class EntryInfo implements Parcelable {
            public static final Parcelable.Creator<EntryInfo> CREATOR = new C114555a();

            /* renamed from: d */
            public String f343337d;

            /* renamed from: e */
            public String f343338e;

            /* renamed from: f */
            public Map<String, String> f343339f = Collections.emptyMap();

            /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo$a */
            public class C114555a implements Parcelable.Creator<EntryInfo> {
                public Object createFromParcel(Parcel parcel) {
                    return new EntryInfo(parcel);
                }

                public Object[] newArray(int i) {
                    return new EntryInfo[i];
                }
            }

            public EntryInfo() {
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f343337d);
                parcel.writeString(this.f343338e);
                parcel.writeMap(this.f343339f);
            }

            public EntryInfo(Parcel parcel) {
                this.f343337d = parcel.readString();
                this.f343338e = parcel.readString();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.f343339f = linkedHashMap;
                parcel.readMap(linkedHashMap, getClass().getClassLoader());
            }
        }

        public static class ThreadInfo implements Parcelable {
            public static final Parcelable.Creator<ThreadInfo> CREATOR = new C114556a();

            /* renamed from: d */
            public int f343340d;

            /* renamed from: e */
            public String f343341e;

            /* renamed from: f */
            public String f343342f;

            /* renamed from: g */
            public long f343343g;

            /* renamed from: h */
            public Map<String, String> f343344h = Collections.emptyMap();

            /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo$a */
            public class C114556a implements Parcelable.Creator<ThreadInfo> {
                public Object createFromParcel(Parcel parcel) {
                    return new ThreadInfo(parcel);
                }

                public Object[] newArray(int i) {
                    return new ThreadInfo[i];
                }
            }

            public ThreadInfo() {
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f343340d);
                parcel.writeString(this.f343341e);
                parcel.writeString(this.f343342f);
                parcel.writeLong(this.f343343g);
                parcel.writeMap(this.f343344h);
            }

            public ThreadInfo(Parcel parcel) {
                this.f343340d = parcel.readInt();
                this.f343341e = parcel.readString();
                this.f343342f = parcel.readString();
                this.f343343g = parcel.readLong();
                ArrayMap arrayMap = new ArrayMap();
                this.f343344h = arrayMap;
                parcel.readMap(arrayMap, getClass().getClassLoader());
            }
        }

        public ReportRecord(Parcel parcel) {
            super(parcel);
            this.f343333i = parcel.readString();
            this.f343334j = parcel.readLong();
            this.f343335n = parcel.createTypedArrayList(ThreadInfo.CREATOR);
            this.f343336o = parcel.createTypedArrayList(EntryInfo.CREATOR);
        }
    }

    public BatteryRecord() {
        this.f343324d = 0;
        this.f343325e = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static BatteryRecord m161169b(byte[] bArr) {
        Parcel parcel;
        Parcelable.Creator creator;
        try {
            parcel = Parcel.obtain();
            try {
                parcel.unmarshall(bArr, 0, bArr.length);
                parcel.setDataPosition(0);
                int readInt = parcel.readInt();
                switch (readInt) {
                    case 1:
                        creator = ProcStatRecord.CREATOR;
                        break;
                    case 2:
                        creator = DevStatRecord.CREATOR;
                        break;
                    case 3:
                        creator = AppStatRecord.CREATOR;
                        break;
                    case 4:
                        creator = SceneStatRecord.CREATOR;
                        break;
                    case 5:
                        creator = EventStatRecord.CREATOR;
                        break;
                    case 6:
                        creator = ReportRecord.CREATOR;
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown record type: " + readInt);
                }
                BatteryRecord batteryRecord = (BatteryRecord) creator.createFromParcel(parcel);
                parcel.recycle();
                return batteryRecord;
            } catch (Throwable th) {
                th = th;
                parcel.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            parcel = null;
            parcel.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public static byte[] m161170c(BatteryRecord batteryRecord) {
        int i;
        Class<?> cls = batteryRecord.getClass();
        if (cls == ProcStatRecord.class) {
            i = 1;
        } else if (cls == DevStatRecord.class) {
            i = 2;
        } else if (cls == AppStatRecord.class) {
            i = 3;
        } else if (cls == SceneStatRecord.class) {
            i = 4;
        } else if (cls == EventStatRecord.class) {
            i = 5;
        } else if (cls == ReportRecord.class) {
            i = 6;
        } else {
            throw new UnsupportedOperationException("Unknown record type: " + batteryRecord);
        }
        Parcel parcel = null;
        try {
            Parcel obtain = Parcel.obtain();
            obtain.writeInt(i);
            batteryRecord.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            if (parcel != null) {
                parcel.recycle();
            }
            throw th;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f343324d);
        parcel.writeLong(this.f343325e);
    }

    public static class AppStatRecord extends BatteryRecord {
        public static final Parcelable.Creator<AppStatRecord> CREATOR = new C114551a();

        /* renamed from: f */
        public int f343326f;

        /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$AppStatRecord$a */
        public class C114551a implements Parcelable.Creator<AppStatRecord> {
            public Object createFromParcel(Parcel parcel) {
                return new AppStatRecord(parcel);
            }

            public Object[] newArray(int i) {
                return new AppStatRecord[i];
            }
        }

        public AppStatRecord() {
            this.f343324d = 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            BatteryRecord.super.writeToParcel(parcel, i);
            parcel.writeInt(this.f343326f);
        }

        public AppStatRecord(Parcel parcel) {
            super(parcel);
            this.f343326f = parcel.readInt();
        }
    }

    public static class SceneStatRecord extends BatteryRecord {
        public static final Parcelable.Creator<SceneStatRecord> CREATOR = new C114558a();

        /* renamed from: f */
        public String f343345f;

        /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$SceneStatRecord$a */
        public class C114558a implements Parcelable.Creator<SceneStatRecord> {
            public Object createFromParcel(Parcel parcel) {
                return new SceneStatRecord(parcel);
            }

            public Object[] newArray(int i) {
                return new SceneStatRecord[i];
            }
        }

        public SceneStatRecord() {
            this.f343324d = 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            BatteryRecord.super.writeToParcel(parcel, i);
            parcel.writeString(this.f343345f);
        }

        public SceneStatRecord(Parcel parcel) {
            super(parcel);
            this.f343345f = parcel.readString();
        }
    }

    public static class ProcStatRecord extends BatteryRecord {
        public static final Parcelable.Creator<ProcStatRecord> CREATOR = new C114554a();

        /* renamed from: f */
        public int f343331f = 1;

        /* renamed from: g */
        public int f343332g;

        /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$ProcStatRecord$a */
        public class C114554a implements Parcelable.Creator<ProcStatRecord> {
            public Object createFromParcel(Parcel parcel) {
                return new ProcStatRecord(parcel);
            }

            public Object[] newArray(int i) {
                return new ProcStatRecord[i];
            }
        }

        public ProcStatRecord() {
            this.f343324d = 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            BatteryRecord.super.writeToParcel(parcel, i);
            parcel.writeInt(this.f343331f);
            parcel.writeInt(this.f343332g);
        }

        public ProcStatRecord(Parcel parcel) {
            super(parcel);
            this.f343331f = parcel.readInt();
            this.f343332g = parcel.readInt();
        }
    }

    public static class EventStatRecord extends BatteryRecord {
        public static final Parcelable.Creator<EventStatRecord> CREATOR = new C114553a();

        /* renamed from: f */
        public long f343328f;

        /* renamed from: g */
        public String f343329g;

        /* renamed from: h */
        public Map<String, Object> f343330h;

        /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$EventStatRecord$a */
        public class C114553a implements Parcelable.Creator<EventStatRecord> {
            public Object createFromParcel(Parcel parcel) {
                return new EventStatRecord(parcel);
            }

            public Object[] newArray(int i) {
                return new EventStatRecord[i];
            }
        }

        public EventStatRecord() {
            this.f343330h = Collections.emptyMap();
            this.f343328f = 0;
            this.f343324d = 1;
        }

        /* renamed from: d */
        public boolean mo173719d(String str, boolean z) {
            if (this.f343330h.containsKey(str)) {
                try {
                    return Boolean.parseBoolean(String.valueOf(this.f343330h.get(str)));
                } catch (Exception unused) {
                }
            }
            return z;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public long mo173720e(String str, long j) {
            try {
                if (this.f343330h.containsKey(str)) {
                    return Long.parseLong(String.valueOf(this.f343330h.get(str)));
                }
            } catch (Exception unused) {
            }
            return j;
        }

        public void writeToParcel(Parcel parcel, int i) {
            BatteryRecord.super.writeToParcel(parcel, i);
            parcel.writeLong(this.f343328f);
            parcel.writeString(this.f343329g);
            parcel.writeMap(this.f343330h);
        }

        public EventStatRecord(Parcel parcel) {
            super(parcel);
            this.f343330h = Collections.emptyMap();
            this.f343328f = parcel.readLong();
            this.f343329g = parcel.readString();
            if (this.f343324d >= 1) {
                HashMap hashMap = new HashMap();
                this.f343330h = hashMap;
                parcel.readMap(hashMap, getClass().getClassLoader());
            }
        }
    }

    public BatteryRecord(Parcel parcel) {
        this.f343324d = parcel.readInt();
        this.f343325e = parcel.readLong();
    }
}
