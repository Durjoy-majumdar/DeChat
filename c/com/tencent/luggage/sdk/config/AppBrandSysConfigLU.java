package com.tencent.luggage.sdk.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle;
import java.util.ArrayList;
import java.util.HashMap;
import wi0.C90988l;

public class AppBrandSysConfigLU extends C90988l implements Parcelable {
    public static final Parcelable.Creator<AppBrandSysConfigLU> CREATOR = new C80225a();

    /* renamed from: A */
    public LaunchWxaAppInfoParcelized f234856A;

    /* renamed from: B */
    public HashMap<String, AppRuntimeApiPermissionBundle> f234857B;

    /* renamed from: C */
    public HashMap<String, AppRuntimeAppidABTestPermissionBundle> f234858C;

    /* renamed from: D */
    public String f234859D;

    /* renamed from: E */
    public int f234860E;

    /* renamed from: F */
    public int f234861F;

    /* renamed from: G */
    public int f234862G;

    /* renamed from: H */
    public int f234863H;

    /* renamed from: I */
    public int f234864I;

    /* renamed from: J */
    public int f234865J;

    /* renamed from: K */
    public boolean f234866K;

    /* renamed from: L */
    public boolean f234867L;

    /* renamed from: M */
    public long f234868M;

    /* renamed from: N */
    public long f234869N;

    /* renamed from: P */
    public long f234870P;

    /* renamed from: Q */
    public int f234871Q;

    /* renamed from: Q0 */
    public long f234872Q0;

    /* renamed from: R */
    public byte[] f234873R;

    /* renamed from: R0 */
    public long f234874R0 = 0;

    /* renamed from: S */
    public int f234875S;

    /* renamed from: S0 */
    public AppBrandGlobalSystemConfig f234876S0;

    /* renamed from: T */
    public ArrayList<String> f234877T;

    /* renamed from: T0 */
    public String[] f234878T0 = new String[0];

    /* renamed from: U */
    public ArrayList<String> f234879U;

    /* renamed from: U0 */
    public long f234880U0;

    /* renamed from: V */
    public ArrayList<String> f234881V;

    /* renamed from: V0 */
    public String f234882V0 = "";

    /* renamed from: W */
    public ArrayList<String> f234883W;

    /* renamed from: X */
    public ArrayList<String> f234884X;

    /* renamed from: Y */
    public ArrayList<String> f234885Y;

    /* renamed from: Z */
    public boolean f234886Z;

    /* renamed from: p0 */
    public int f234887p0;

    /* renamed from: v */
    public String f234888v;

    /* renamed from: w */
    public boolean f234889w = false;

    /* renamed from: x */
    public boolean f234890x = false;

    /* renamed from: x0 */
    public int f234891x0;

    /* renamed from: y */
    public boolean f234892y = false;

    /* renamed from: y0 */
    public int f234893y0;

    /* renamed from: z */
    public boolean f234894z = false;

    /* renamed from: com.tencent.luggage.sdk.config.AppBrandSysConfigLU$a */
    public class C80225a implements Parcelable.Creator<AppBrandSysConfigLU> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandSysConfigLU(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandSysConfigLU[i];
        }
    }

    public AppBrandSysConfigLU() {
    }

    /* renamed from: b */
    public final int mo111316b() {
        return this.f261072r.pkgVersion;
    }

    /* renamed from: c */
    public final AppRuntimeApiPermissionBundle mo111317c() {
        return this.f234856A.f234895d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppBrandSysConfigLU{, brandName='");
        sb.append(this.f261061d);
        sb.append('\'');
        sb.append(", appId='");
        sb.append(this.f261062e);
        sb.append('\'');
        sb.append(", appIconUrl='");
        sb.append(this.f261063f);
        sb.append('\'');
        sb.append(", debugEnabled=");
        sb.append(this.f234889w);
        sb.append(", performancePanelEnabled=");
        sb.append(this.f234890x);
        sb.append(", maxWebViewDepth=");
        sb.append(this.f261064g);
        sb.append(", maxBackgroundLifeSpan=");
        sb.append(this.f234860E);
        sb.append(", maxRequestConcurrent=");
        sb.append(this.f234861F);
        sb.append(", maxUploadConcurrent=");
        sb.append(this.f234862G);
        sb.append(", maxDownloadConcurrent=");
        sb.append(this.f234863H);
        sb.append(", maxWebsocketConnect=");
        sb.append(this.f234864I);
        sb.append(", websocketSkipPortCheck=");
        sb.append(this.f234866K);
        sb.append(", requestDomains=");
        sb.append(this.f234877T);
        sb.append(", socketDomains=");
        sb.append(this.f234879U);
        sb.append(", uploadDomains=");
        sb.append(this.f234881V);
        sb.append(", downloadDomains=");
        sb.append(this.f234883W);
        sb.append(", udpDomains=");
        sb.append(this.f234884X);
        sb.append(", tcpDomains=");
        sb.append(this.f234885Y);
        sb.append(", appPkgInfo=");
        sb.append(this.f261072r);
        sb.append(", systemSettings=");
        sb.append(this.f234876S0);
        sb.append(", runningFlag=");
        sb.append(this.f234880U0);
        sb.append(", operationInfo=");
        sb.append(this.f234859D);
        sb.append(", kvStorageScheme=");
        sb.append(this.f261073s);
        sb.append(", TLSSkipHostnameCheck=");
        sb.append(this.f234867L);
        sb.append(", kvStoragePerformanceReportOn=");
        sb.append(this.f261074t);
        sb.append(", pluginPermissionBundleMap=");
        HashMap<String, AppRuntimeApiPermissionBundle> hashMap = this.f234857B;
        sb.append(hashMap == null ? String.valueOf(0) : String.valueOf(hashMap.size()));
        sb.append(", appidABTestPermissionBundleMap=");
        HashMap<String, AppRuntimeAppidABTestPermissionBundle> hashMap2 = this.f234858C;
        sb.append(hashMap2 == null ? String.valueOf(0) : String.valueOf(hashMap2.size()));
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f261061d);
        parcel.writeString(this.f234888v);
        parcel.writeString(this.f261062e);
        parcel.writeString(this.f261063f);
        parcel.writeByte(this.f234889w ? (byte) 1 : 0);
        parcel.writeByte(this.f234890x ? (byte) 1 : 0);
        parcel.writeParcelable(this.f234856A, i);
        parcel.writeInt(this.f261064g);
        parcel.writeInt(this.f234860E);
        parcel.writeInt(this.f234861F);
        parcel.writeInt(this.f234862G);
        parcel.writeInt(this.f234863H);
        parcel.writeInt(this.f234864I);
        parcel.writeInt(this.f234865J);
        parcel.writeByte(this.f234866K ? (byte) 1 : 0);
        parcel.writeByte(this.f234867L ? (byte) 1 : 0);
        parcel.writeLong(this.f234870P);
        parcel.writeLong(this.f234868M);
        parcel.writeLong(this.f234869N);
        parcel.writeInt(this.f234871Q);
        parcel.writeStringList(this.f234877T);
        parcel.writeStringList(this.f234879U);
        parcel.writeStringList(this.f234881V);
        parcel.writeStringList(this.f234883W);
        parcel.writeStringList(this.f234884X);
        parcel.writeStringList(this.f234885Y);
        parcel.writeParcelable(this.f261072r, i);
        parcel.writeParcelable(this.f234876S0, i);
        parcel.writeByte(this.f261065h ? (byte) 1 : 0);
        parcel.writeByte(this.f261066i ? (byte) 1 : 0);
        parcel.writeByte(this.f261067j ? (byte) 1 : 0);
        parcel.writeInt(this.f261070p);
        parcel.writeInt(this.f261071q);
        parcel.writeInt(this.f234887p0);
        parcel.writeInt(this.f234886Z ? 1 : 0);
        parcel.writeLong(this.f234874R0);
        parcel.writeString(this.f234859D);
        parcel.writeInt(this.f234878T0.length);
        parcel.writeStringArray(this.f234878T0);
        parcel.writeInt(this.f234891x0);
        parcel.writeInt(this.f234893y0);
        parcel.writeInt(this.f261073s);
        parcel.writeInt(this.f261074t ? 1 : 0);
        parcel.writeInt(this.f261068n ? 1 : 0);
        parcel.writeInt(this.f261069o ? 1 : 0);
        parcel.writeLong(this.f234880U0);
        parcel.writeMap(this.f234857B);
        parcel.writeMap(this.f234858C);
        parcel.writeString(this.f261075u);
        parcel.writeInt(this.f234875S);
        parcel.writeByteArray(this.f234873R);
        parcel.writeString(this.f234882V0);
        parcel.writeLong(this.f234872Q0);
    }

    public AppBrandSysConfigLU(Parcel parcel) {
        boolean z = false;
        this.f261061d = parcel.readString();
        this.f234888v = parcel.readString();
        this.f261062e = parcel.readString();
        this.f261063f = parcel.readString();
        this.f234889w = parcel.readByte() != 0;
        this.f234890x = parcel.readByte() != 0;
        this.f234856A = (LaunchWxaAppInfoParcelized) parcel.readParcelable(LaunchWxaAppInfoParcelized.class.getClassLoader());
        this.f261064g = parcel.readInt();
        this.f234860E = parcel.readInt();
        this.f234861F = parcel.readInt();
        this.f234862G = parcel.readInt();
        this.f234863H = parcel.readInt();
        this.f234864I = parcel.readInt();
        this.f234865J = parcel.readInt();
        this.f234866K = parcel.readByte() != 0;
        this.f234867L = parcel.readByte() != 0;
        this.f234870P = parcel.readLong();
        this.f234868M = parcel.readLong();
        this.f234869N = parcel.readLong();
        this.f234871Q = parcel.readInt();
        this.f234877T = parcel.createStringArrayList();
        this.f234879U = parcel.createStringArrayList();
        this.f234881V = parcel.createStringArrayList();
        this.f234883W = parcel.createStringArrayList();
        this.f234884X = parcel.createStringArrayList();
        this.f234885Y = parcel.createStringArrayList();
        this.f261072r = (WxaPkgWrappingInfo) parcel.readParcelable(WxaPkgWrappingInfo.class.getClassLoader());
        this.f234876S0 = (AppBrandGlobalSystemConfig) parcel.readParcelable(AppBrandGlobalSystemConfig.class.getClassLoader());
        this.f261065h = parcel.readByte() > 0;
        this.f261066i = parcel.readByte() > 0;
        this.f261067j = parcel.readByte() > 0;
        this.f261070p = parcel.readInt();
        this.f261071q = parcel.readInt();
        this.f234887p0 = parcel.readInt();
        this.f234886Z = parcel.readInt() == 1;
        this.f234874R0 = parcel.readLong();
        this.f234859D = parcel.readString();
        String[] strArr = new String[parcel.readInt()];
        this.f234878T0 = strArr;
        parcel.readStringArray(strArr);
        this.f234891x0 = parcel.readInt();
        this.f234893y0 = parcel.readInt();
        this.f261073s = parcel.readInt();
        this.f261074t = parcel.readInt() == 1;
        this.f261068n = parcel.readInt() == 1;
        this.f261069o = parcel.readInt() == 1 ? true : z;
        this.f234880U0 = parcel.readLong();
        this.f234857B = parcel.readHashMap(AppRuntimeApiPermissionBundle.class.getClassLoader());
        this.f234858C = parcel.readHashMap(AppRuntimeAppidABTestPermissionBundle.class.getClassLoader());
        this.f261075u = parcel.readString();
        int readInt = parcel.readInt();
        this.f234875S = readInt;
        byte[] bArr = new byte[readInt];
        this.f234873R = bArr;
        parcel.readByteArray(bArr);
        this.f234882V0 = parcel.readString();
        this.f234872Q0 = parcel.readLong();
    }
}
