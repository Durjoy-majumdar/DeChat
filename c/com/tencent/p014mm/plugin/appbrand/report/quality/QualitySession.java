package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.QualitySession */
public class QualitySession implements Parcelable {
    public static final Parcelable.Creator<QualitySession> CREATOR = new C84179a();

    /* renamed from: d */
    public final String f245832d;

    /* renamed from: e */
    public String f245833e;

    /* renamed from: f */
    public int f245834f;

    /* renamed from: g */
    public int f245835g;

    /* renamed from: h */
    public int f245836h;

    /* renamed from: i */
    public int f245837i;

    /* renamed from: j */
    public long f245838j = 0;

    /* renamed from: n */
    public boolean f245839n = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.QualitySession$a */
    public class C84179a implements Parcelable.Creator<QualitySession> {
        public Object createFromParcel(Parcel parcel) {
            return new QualitySession(parcel);
        }

        public Object[] newArray(int i) {
            return new QualitySession[i];
        }
    }

    public QualitySession(String str, AppBrandInitConfigLU appBrandInitConfigLU, AppBrandStatObject appBrandStatObject) {
        this.f245832d = str;
        this.f245833e = appBrandInitConfigLU.f239362d;
        int i = appBrandInitConfigLU.f239365g;
        if (i == 0) {
            this.f245834f = 1;
        } else if (i == 1) {
            this.f245834f = 2;
        } else if (i == 2) {
            this.f245834f = 3;
        }
        int i2 = appBrandInitConfigLU.f234841u + 1000;
        this.f245835g = i2;
        this.f245836h = appBrandStatObject.f245533f;
        this.f245837i = appBrandInitConfigLU.f234802F;
        Log.m105925i("MicroMsg.AppBrand.QualitySession", "primary <init> instanceId[%s] apptype[%d] scene[%d] appversion[%d]", str, Integer.valueOf(i2), Integer.valueOf(this.f245836h), Integer.valueOf(this.f245837i));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f245832d);
        parcel.writeString(this.f245833e);
        parcel.writeInt(this.f245834f);
        parcel.writeInt(this.f245835g);
        parcel.writeInt(this.f245836h);
        parcel.writeInt(this.f245837i);
        parcel.writeLong(this.f245838j);
        parcel.writeByte(this.f245839n ? (byte) 1 : 0);
    }

    public QualitySession(Parcel parcel) {
        String readString = parcel.readString();
        this.f245832d = readString;
        this.f245833e = parcel.readString();
        this.f245834f = parcel.readInt();
        this.f245835g = parcel.readInt();
        this.f245836h = parcel.readInt();
        this.f245837i = parcel.readInt();
        this.f245838j = parcel.readLong();
        this.f245839n = parcel.readByte() > 0;
        Log.m105925i("MicroMsg.AppBrand.QualitySession", "secondary <init> instanceId[%s] apptype[%d] scene[%d] appversion[%d] UIReadyT[%d] isNewUser[%b]", readString, Integer.valueOf(this.f245835g), Integer.valueOf(this.f245836h), Integer.valueOf(this.f245837i), Long.valueOf(this.f245838j), Boolean.valueOf(this.f245839n));
    }
}
