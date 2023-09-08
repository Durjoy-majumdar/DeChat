package com.tencent.matrix.battery.accumulate;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import p1195ge.C116951c;
import p269xe.C118872b;

public class AccPowerStats implements Parcelable {
    public static final Parcelable.Creator<AccPowerStats> CREATOR = new C114424a();

    /* renamed from: d */
    public int f343029d = 5;

    /* renamed from: e */
    public String f343030e;

    /* renamed from: f */
    public long f343031f;

    /* renamed from: g */
    public int f343032g = 0;

    /* renamed from: h */
    public long f343033h = 0;

    /* renamed from: i */
    public long f343034i = 0;

    /* renamed from: j */
    public long f343035j = 0;

    /* renamed from: n */
    public long f343036n = 0;

    /* renamed from: o */
    public long f343037o = 0;

    /* renamed from: p */
    public long f343038p = 0;

    /* renamed from: q */
    public int f343039q = 0;

    /* renamed from: r */
    public long f343040r = 0;

    /* renamed from: s */
    public long f343041s = 0;

    /* renamed from: t */
    public Map<String, Object> f343042t;

    /* renamed from: u */
    public Bundle f343043u;

    /* renamed from: v */
    public Bundle f343044v;

    /* renamed from: w */
    public Bundle f343045w;

    /* renamed from: x */
    public Bundle f343046x;

    /* renamed from: y */
    public Bundle f343047y;

    /* renamed from: com.tencent.matrix.battery.accumulate.AccPowerStats$a */
    public class C114424a implements Parcelable.Creator<AccPowerStats> {
        public Object createFromParcel(Parcel parcel) {
            return new AccPowerStats(parcel);
        }

        public Object[] newArray(int i) {
            return new AccPowerStats[i];
        }
    }

    public AccPowerStats(String str) {
        this.f343030e = str;
        this.f343031f = System.currentTimeMillis();
        this.f343042t = new LinkedHashMap();
        this.f343043u = new Bundle();
        this.f343044v = new Bundle();
        this.f343045w = new Bundle();
        this.f343046x = new Bundle();
        this.f343047y = new Bundle();
    }

    /* renamed from: a */
    public void mo173592a() {
        StringBuilder sb = new StringBuilder("accStatsPower ");
        sb.append(this.f343030e);
        sb.append(": ");
        StringBuilder sb4 = new StringBuilder("accStatsMeta ");
        sb4.append(this.f343030e);
        sb4.append(": ");
        sb4.append("count=");
        sb4.append(this.f343032g);
        sb4.append(",pidJiffies=");
        sb4.append(this.f343037o);
        sb4.append(",uidJiffies=");
        sb4.append(this.f343038p);
        sb4.append("");
        int i = 0;
        for (Map.Entry entry : ((LinkedHashMap) this.f343042t).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str.startsWith("power-") && (value instanceof Map)) {
                String substring = str.substring(str.indexOf("power-") + 6);
                for (Map.Entry entry2 : ((Map) value).entrySet()) {
                    String valueOf = String.valueOf(entry2.getKey());
                    Object value2 = entry2.getValue();
                    String str2 = ",";
                    if (!valueOf.equals("power")) {
                        sb4.append(str2);
                        sb4.append(substring);
                        sb4.append(C118872b.m167604a(valueOf));
                        sb4.append("=");
                        if (value2 instanceof Double) {
                            value2 = Long.valueOf(((Double) value2).longValue());
                        }
                        sb4.append(value2);
                    } else if (value2 instanceof Double) {
                        if (i == 0) {
                            str2 = "";
                        }
                        sb.append(str2);
                        sb.append(substring);
                        sb.append("Power=");
                        sb.append(C116951c.m165015p(((Double) value2).doubleValue(), 2));
                    }
                }
            }
            i++;
        }
        Log.m105924i("MicroMsg.AccPowerMonitor", sb.toString());
        Log.m105924i("MicroMsg.AccPowerMonitor", sb4.toString());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f343029d);
        parcel.writeString(this.f343030e);
        parcel.writeLong(this.f343031f);
        parcel.writeInt(this.f343032g);
        parcel.writeLong(this.f343033h);
        parcel.writeLong(this.f343034i);
        parcel.writeLong(this.f343035j);
        parcel.writeLong(this.f343036n);
        parcel.writeLong(this.f343037o);
        parcel.writeLong(this.f343038p);
        parcel.writeInt(this.f343039q);
        parcel.writeLong(this.f343040r);
        parcel.writeLong(this.f343041s);
        parcel.writeMap(this.f343042t);
        parcel.writeBundle(this.f343043u);
        parcel.writeBundle(this.f343044v);
        parcel.writeBundle(this.f343045w);
        parcel.writeBundle(this.f343046x);
        parcel.writeBundle(this.f343047y);
    }

    public AccPowerStats(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f343029d = readInt;
        if (readInt == 5) {
            this.f343030e = parcel.readString();
            this.f343031f = parcel.readLong();
            this.f343032g = parcel.readInt();
            this.f343033h = parcel.readLong();
            this.f343034i = parcel.readLong();
            this.f343035j = parcel.readLong();
            this.f343036n = parcel.readLong();
            this.f343037o = parcel.readLong();
            this.f343038p = parcel.readLong();
            this.f343039q = parcel.readInt();
            this.f343040r = parcel.readLong();
            this.f343041s = parcel.readLong();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f343042t = linkedHashMap;
            parcel.readMap(linkedHashMap, getClass().getClassLoader());
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            this.f343043u = readBundle;
            if (readBundle == null) {
                this.f343043u = new Bundle();
            }
            Bundle readBundle2 = parcel.readBundle(getClass().getClassLoader());
            this.f343044v = readBundle2;
            if (readBundle2 == null) {
                this.f343044v = new Bundle();
            }
            Bundle readBundle3 = parcel.readBundle(getClass().getClassLoader());
            this.f343045w = readBundle3;
            if (readBundle3 == null) {
                this.f343045w = new Bundle();
            }
            Bundle readBundle4 = parcel.readBundle(getClass().getClassLoader());
            this.f343046x = readBundle4;
            if (readBundle4 == null) {
                this.f343046x = new Bundle();
            }
            Bundle readBundle5 = parcel.readBundle(getClass().getClassLoader());
            this.f343047y = readBundle5;
            if (readBundle5 == null) {
                this.f343047y = new Bundle();
            }
        }
    }
}
