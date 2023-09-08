package com.tencent.p014mm.plugin.scanner.model;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/model/OfflineScanContext;", "Landroid/os/Parcelable;", "CREATOR", "a", "scan-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.model.OfflineScanContext */
public final class OfflineScanContext implements Parcelable {
    public static final C85411a CREATOR = new C85411a((C8480h) null);

    /* renamed from: d */
    public Activity f248913d;

    /* renamed from: e */
    public int f248914e;

    /* renamed from: f */
    public String f248915f;

    /* renamed from: g */
    public int f248916g;

    /* renamed from: h */
    public int f248917h;

    /* renamed from: i */
    public int f248918i;

    /* renamed from: j */
    public Bundle f248919j;

    /* renamed from: n */
    public long f248920n;

    /* renamed from: o */
    public boolean f248921o;

    /* renamed from: p */
    public String f248922p;

    /* renamed from: q */
    public int f248923q;

    /* renamed from: com.tencent.mm.plugin.scanner.model.OfflineScanContext$a */
    public static final class C85411a implements Parcelable.Creator<OfflineScanContext> {
        public C85411a(C8480h hVar) {
        }

        /* renamed from: a */
        public final OfflineScanContext mo118756a(String str) {
            C87412m.m108594g(str, "value");
            Parcel obtain = Parcel.obtain();
            C87412m.m108593f(obtain, "obtain()");
            byte[] decode = Base64.decode(str, 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            return new OfflineScanContext(obtain);
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new OfflineScanContext(parcel);
        }

        public Object[] newArray(int i) {
            return new OfflineScanContext[i];
        }
    }

    public OfflineScanContext(Activity activity, int i, String str, int i2, int i3, int i4, String str2, boolean z, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "qBarString");
        C87412m.m108594g(str2, "typeName");
        this.f248915f = "";
        this.f248922p = "";
        this.f248913d = activity;
        this.f248923q = i;
        this.f248915f = str;
        this.f248916g = i2;
        this.f248917h = i3;
        this.f248918i = i4;
        this.f248922p = str2;
        this.f248919j = bundle;
        this.f248920n = System.currentTimeMillis();
        this.f248921o = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("codeString: ");
        sb.append(this.f248915f);
        sb.append(", source: ");
        sb.append(this.f248916g);
        sb.append(", codeType: ");
        sb.append(this.f248917h);
        sb.append(", codeVersion");
        sb.append(this.f248918i);
        sb.append(", statObj: ");
        Bundle bundle = this.f248919j;
        sb.append(bundle != null ? bundle.toString() : null);
        sb.append(", time: ");
        sb.append(this.f248920n);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f248914e);
        parcel.writeString(this.f248915f);
        parcel.writeInt(this.f248916g);
        parcel.writeInt(this.f248917h);
        parcel.writeInt(this.f248918i);
        parcel.writeString(this.f248922p);
        parcel.writeBundle(this.f248919j);
        parcel.writeLong(this.f248920n);
        parcel.writeByte(this.f248921o ? (byte) 1 : 0);
        parcel.writeInt(this.f248923q);
    }

    public OfflineScanContext(Activity activity, int i, String str, int i2, int i3, String str2, boolean z, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "qBarString");
        C87412m.m108594g(str2, "typeName");
        this.f248915f = "";
        this.f248922p = "";
        this.f248913d = activity;
        this.f248923q = i;
        this.f248915f = str;
        this.f248917h = i2;
        this.f248918i = i3;
        this.f248922p = str2;
        this.f248919j = bundle;
        this.f248920n = System.currentTimeMillis();
        this.f248921o = z;
    }

    public OfflineScanContext(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        String str = "";
        this.f248915f = str;
        this.f248922p = str;
        this.f248914e = parcel.readInt();
        String readString = parcel.readString();
        this.f248915f = readString == null ? str : readString;
        this.f248916g = parcel.readInt();
        this.f248917h = parcel.readInt();
        this.f248918i = parcel.readInt();
        String readString2 = parcel.readString();
        this.f248922p = readString2 != null ? readString2 : str;
        this.f248919j = parcel.readBundle(Bundle.class.getClassLoader());
        this.f248920n = parcel.readLong();
        this.f248921o = parcel.readByte() != 0;
        this.f248923q = parcel.readInt();
    }
}
