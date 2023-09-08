package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle */
public class AppStartupPerformanceReportBundle implements Parcelable, C1727m {
    public static final Parcelable.Creator<AppStartupPerformanceReportBundle> CREATOR = new C83261a();

    /* renamed from: d */
    public final String f243287d;

    /* renamed from: e */
    public final List<WeAppQualitySystemGetDownloadCGIStruct> f243288e;

    /* renamed from: f */
    public final List<kv_14609> f243289f;

    /* renamed from: g */
    public long f243290g;

    /* renamed from: h */
    public long f243291h;

    /* renamed from: i */
    public long f243292i;

    /* renamed from: j */
    public long f243293j;

    /* renamed from: n */
    public long f243294n;

    /* renamed from: o */
    public long f243295o;

    /* renamed from: p */
    public long f243296p;

    /* renamed from: q */
    public long f243297q;

    /* renamed from: r */
    public long f243298r;

    /* renamed from: s */
    public long f243299s;

    /* renamed from: t */
    public int f243300t;

    /* renamed from: u */
    public boolean f243301u;

    /* renamed from: v */
    public boolean f243302v;

    /* renamed from: w */
    public boolean f243303w;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle$a */
    public class C83261a implements Parcelable.Creator<AppStartupPerformanceReportBundle> {
        public Object createFromParcel(Parcel parcel) {
            return new AppStartupPerformanceReportBundle(parcel, (C83261a) null);
        }

        public Object[] newArray(int i) {
            return new AppStartupPerformanceReportBundle[i];
        }
    }

    public AppStartupPerformanceReportBundle(String str) {
        this.f243287d = str;
        this.f243288e = new LinkedList();
        this.f243289f = new LinkedList();
    }

    /* renamed from: a */
    public boolean mo115530a() {
        List<kv_14609> list = this.f243289f;
        if (list == null) {
            return false;
        }
        for (kv_14609 next : list) {
            if (next != null) {
                if (next.f245678t > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f243287d);
        if (Util.isNullOrNil((List) this.f243288e)) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((LinkedList) this.f243288e).size());
            for (WeAppQualitySystemGetDownloadCGIStruct p : this.f243288e) {
                parcel.writeString(p.mo1005p());
            }
        }
        parcel.writeTypedList(this.f243289f);
        parcel.writeByte(this.f243301u ? (byte) 1 : 0);
        parcel.writeLong(this.f243290g);
        parcel.writeLong(this.f243291h);
        parcel.writeLong(this.f243292i);
        parcel.writeLong(this.f243293j);
        parcel.writeLong(this.f243294n);
        parcel.writeLong(this.f243295o);
        parcel.writeByte(this.f243302v ? (byte) 1 : 0);
        parcel.writeByte(this.f243303w ? (byte) 1 : 0);
        parcel.writeLong(this.f243296p);
        parcel.writeLong(this.f243297q);
        parcel.writeInt(this.f243300t);
    }

    public AppStartupPerformanceReportBundle(Parcel parcel, C83261a aVar) {
        this.f243287d = parcel.readString();
        this.f243288e = new LinkedList();
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt > 0) {
            for (int i = 0; i < readInt; i++) {
                ((LinkedList) this.f243288e).add(new WeAppQualitySystemGetDownloadCGIStruct(parcel.readString()));
            }
        }
        this.f243289f = parcel.createTypedArrayList(kv_14609.CREATOR);
        this.f243301u = parcel.readByte() > 0;
        this.f243290g = parcel.readLong();
        this.f243291h = parcel.readLong();
        this.f243292i = parcel.readLong();
        this.f243293j = parcel.readLong();
        this.f243294n = parcel.readLong();
        this.f243295o = parcel.readLong();
        this.f243302v = parcel.readByte() > 0;
        this.f243303w = parcel.readByte() > 0 ? true : z;
        this.f243296p = parcel.readLong();
        this.f243297q = parcel.readLong();
        this.f243300t = parcel.readInt();
    }
}
