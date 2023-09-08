package com.tencent.luggage.sdk.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.tencent.luggage.sdk.config.C0926a;
import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.luggage.sdk.launching.C80245f;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.MiniProgramNavigationBackResult;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandWeishiParams;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.JSONObject;
import wi0.C90973a0;
import wi0.C91003z;

public class AppBrandInitConfigLU extends AppBrandInitConfig {
    public static final Parcelable.Creator<AppBrandInitConfigLU> CREATOR = new C80223a();

    /* renamed from: A */
    public String f234797A;

    /* renamed from: B */
    public boolean f234798B;

    /* renamed from: C */
    public String f234799C;

    /* renamed from: D */
    public long f234800D;

    /* renamed from: E */
    public long f234801E;

    /* renamed from: F */
    public int f234802F;

    /* renamed from: G */
    public int f234803G;

    /* renamed from: H */
    public WxaAttributes.WxaVersionInfo f234804H;

    /* renamed from: I */
    public String f234805I;

    /* renamed from: J */
    public String f234806J;

    /* renamed from: K */
    public String f234807K;

    /* renamed from: L */
    public String f234808L;

    /* renamed from: M */
    public PersistableBundle f234809M;

    /* renamed from: N */
    public String f234810N;

    /* renamed from: P */
    public int f234811P;

    /* renamed from: Q */
    public boolean f234812Q;

    /* renamed from: Q0 */
    public int f234813Q0;

    /* renamed from: R */
    public boolean f234814R;

    /* renamed from: R0 */
    public HalfScreenConfig f234815R0;

    /* renamed from: S */
    public boolean f234816S;

    /* renamed from: S0 */
    public boolean f234817S0;

    /* renamed from: T */
    public int f234818T;

    /* renamed from: T0 */
    public int f234819T0;

    /* renamed from: U */
    public C80242c<?> f234820U;

    /* renamed from: U0 */
    public ArrayList<String> f234821U0;

    /* renamed from: V */
    public C80242c<?> f234822V;

    /* renamed from: V0 */
    public String f234823V0;

    /* renamed from: W */
    public C80242c<MiniProgramNavigationBackResult> f234824W;

    /* renamed from: W0 */
    public boolean f234825W0;

    /* renamed from: X */
    public boolean f234826X;

    /* renamed from: X0 */
    public boolean f234827X0;

    /* renamed from: Y */
    public AppBrandInitWindowConfig f234828Y;

    /* renamed from: Y0 */
    public C80247h f234829Y0;

    /* renamed from: Z */
    public String f234830Z;

    /* renamed from: Z0 */
    public WxAppLibServerMode f234831Z0;

    /* renamed from: a1 */
    public int f234832a1;

    /* renamed from: b1 */
    public AppBrandRuntimeReloadReportBundle f234833b1;

    /* renamed from: c1 */
    public transient AppBrandStatObject f234834c1;

    /* renamed from: p */
    public transient int f234835p;

    /* renamed from: p0 */
    public String f234836p0;

    /* renamed from: q */
    public String f234837q;

    /* renamed from: r */
    public String f234838r;

    /* renamed from: s */
    public String f234839s;

    /* renamed from: t */
    public String f234840t;

    /* renamed from: u */
    public int f234841u;

    /* renamed from: v */
    public Boolean f234842v;

    /* renamed from: w */
    public String f234843w;

    /* renamed from: x */
    public String f234844x;

    /* renamed from: x0 */
    public boolean f234845x0;

    /* renamed from: y */
    public final AppBrandLaunchReferrer f234846y;

    /* renamed from: y0 */
    public boolean f234847y0;

    /* renamed from: z */
    public final AppBrandWeishiParams f234848z;

    /* renamed from: com.tencent.luggage.sdk.config.AppBrandInitConfigLU$a */
    public class C80223a implements Parcelable.Creator<AppBrandInitConfigLU> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandInitConfigLU(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandInitConfigLU[i];
        }
    }

    public AppBrandInitConfigLU() {
        this.f234842v = null;
        this.f234809M = new PersistableBundle();
        this.f234826X = false;
        this.f234828Y = null;
        this.f234836p0 = "";
        this.f234815R0 = HalfScreenConfig.f157929P;
        this.f234817S0 = false;
        this.f234825W0 = false;
        this.f234829Y0 = C80247h.LEGACY;
        this.f234831Z0 = WxAppLibServerMode.f244338f;
        this.f234832a1 = 4;
        this.f234846y = new AppBrandLaunchReferrer();
        this.f234848z = new AppBrandWeishiParams();
    }

    /* renamed from: c */
    public final JSONObject mo111291c() {
        Object obj;
        AppBrandLaunchReferrer appBrandLaunchReferrer = this.f234846y;
        appBrandLaunchReferrer.getClass();
        try {
            obj = new JSONObject(appBrandLaunchReferrer.f239398f);
        } catch (Exception unused) {
            obj = appBrandLaunchReferrer.f239398f;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", appBrandLaunchReferrer.f239397e);
            jSONObject.put("extraData", obj);
            int i = appBrandLaunchReferrer.f239396d;
            if ((i == 1 || i == 3 || i == 2 || i == 10) && !Util.isNullOrNil(appBrandLaunchReferrer.f239399g)) {
                jSONObject.put("privateExtraData", new JSONObject(appBrandLaunchReferrer.f239399g));
            }
            if (appBrandLaunchReferrer.f239396d == 6 && !Util.isNullOrNil(appBrandLaunchReferrer.f239400h)) {
                jSONObject.put("messageExtraData", new JSONObject(appBrandLaunchReferrer.f239400h));
            }
            if (appBrandLaunchReferrer.f239396d == 7 && !Util.isNullOrNil(appBrandLaunchReferrer.f239405p)) {
                jSONObject.put("openapiInvokeData", new JSONObject(appBrandLaunchReferrer.f239405p));
            }
            if (appBrandLaunchReferrer.f239396d == 7 && !Util.isNullOrNil(appBrandLaunchReferrer.f239406q)) {
                jSONObject.put("transitiveData", new JSONObject(appBrandLaunchReferrer.f239406q));
            }
            if (appBrandLaunchReferrer.f239396d == 9 && !Util.isNullOrNil(appBrandLaunchReferrer.f239407r)) {
                jSONObject.put("gameLiveInfo", new JSONObject(appBrandLaunchReferrer.f239407r));
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandLaunchReferrer", "toJsonObj exception: %s", e);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final boolean mo111293d() {
        return Util.nullAsNil(this.f234804H.f239450C).contains("skyline");
    }

    /* renamed from: e */
    public AppBrandInitConfigLU clone() {
        return (AppBrandInitConfigLU) super.clone();
    }

    /* renamed from: f */
    public AppBrandStatObject mo111295f() {
        return this.f234834c1;
    }

    /* renamed from: g */
    public final String mo111296g() {
        return this.f234837q;
    }

    /* renamed from: h */
    public final String mo111297h() {
        return this.f234838r;
    }

    /* renamed from: i */
    public final void mo111298i(String str) {
        Assert.assertFalse(TextUtils.isEmpty(str));
        Log.m105925i("Luggage.AppBrandInitConfigLU", "resetInstanceId(%s) %s", str, android.util.Log.getStackTraceString(new Throwable()));
        this.f234838r = str;
    }

    /* renamed from: j */
    public final void mo111299j() {
        Log.m105925i("Luggage.AppBrandInitConfigLU", "resetSession() %s", android.util.Log.getStackTraceString(new Throwable()));
        C0926a aVar = C0926a.C0928b.f2135a;
        if (aVar == null) {
            aVar = C0926a.f2134a;
        }
        this.f234837q = aVar.mo879a();
    }

    /* renamed from: k */
    public boolean mo111300k() {
        return this.f234841u == 4;
    }

    /* renamed from: m */
    public JSONObject mo111301m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shareKey", this.f234844x);
            jSONObject.put("shareName", this.f234843w);
            if (jSONObject.length() == 0) {
                return null;
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public final C91003z mo111302o() {
        AppBrandInitWindowConfig appBrandInitWindowConfig = this.f234828Y;
        return appBrandInitWindowConfig == null ? C91003z.DEFAULT : appBrandInitWindowConfig.f234854i;
    }

    /* renamed from: p */
    public final C91003z mo111303p() {
        AppBrandInitWindowConfig appBrandInitWindowConfig = this.f234828Y;
        return appBrandInitWindowConfig == null ? C91003z.DEFAULT : appBrandInitWindowConfig.f234855j;
    }

    /* renamed from: q */
    public final C90973a0 mo111304q() {
        AppBrandInitWindowConfig appBrandInitWindowConfig = this.f234828Y;
        return appBrandInitWindowConfig == null ? C90973a0.UNKNOWN : appBrandInitWindowConfig.f234851f;
    }

    public String toString() {
        return "AppBrandInitConfigLU {visitingSessionId='" + this.f234837q + '\'' + ", wxaLaunchInstanceId=" + this.f234838r + ", clickTimestamp=" + this.f234800D + ", username='" + this.f234839s + '\'' + ", appId='" + this.f239362d + '\'' + ", brandName='" + this.f239363e + '\'' + ", debugType=" + this.f239365g + ", orientation='" + this.f239366h + '\'' + ", enterPath='" + this.f239367i + '\'' + ", shareName='" + this.f234843w + '\'' + ", shareKey='" + this.f234844x + '\'' + ", startTime=" + this.f234800D + ", referrer=" + this.f234846y + ", extInfo=" + this.f234797A + ", appVersion=" + this.f234802F + ", wsEndpoint=" + this.f234799C + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f234837q);
        parcel.writeString(this.f234838r);
        parcel.writeString(this.f234839s);
        parcel.writeString(this.f234840t);
        parcel.writeString(this.f234843w);
        parcel.writeString(this.f234844x);
        parcel.writeParcelable(this.f234846y, i);
        parcel.writeParcelable(this.f234848z, i);
        parcel.writeInt(this.f234841u);
        parcel.writeByte(this.f234798B ? (byte) 1 : 0);
        parcel.writeString(this.f234797A);
        parcel.writeString(this.f234799C);
        parcel.writeLong(this.f234800D);
        parcel.writeLong(this.f234801E);
        parcel.writeInt(this.f234802F);
        parcel.writeInt(this.f234803G);
        parcel.writeParcelable(this.f234804H, i);
        parcel.writeString(this.f234805I);
        parcel.writeString(this.f234806J);
        parcel.writeString(this.f234807K);
        parcel.writeString(this.f234808L);
        parcel.writePersistableBundle(this.f234809M);
        parcel.writeString(this.f234810N);
        parcel.writeInt(this.f234818T);
        parcel.writeByte(this.f234825W0 ? (byte) 1 : 0);
        parcel.writeByte(this.f234827X0 ? (byte) 1 : 0);
        C80245f.m97633c(this.f234820U, parcel);
        C80245f.m97633c(this.f234822V, parcel);
        C80245f.m97633c(this.f234824W, parcel);
        parcel.writeInt(this.f234829Y0.ordinal());
        parcel.writeInt(this.f234811P);
        parcel.writeInt(this.f234812Q ? 1 : 0);
        parcel.writeByte(this.f234814R ? (byte) 1 : 0);
        parcel.writeByte(this.f234816S ? (byte) 1 : 0);
        parcel.writeParcelable(this.f234828Y, i);
        parcel.writeString(this.f234830Z);
        parcel.writeString(this.f234836p0);
        parcel.writeInt(this.f234845x0 ? 1 : 0);
        parcel.writeInt(this.f234847y0 ? 1 : 0);
        parcel.writeInt(this.f234813Q0);
        parcel.writeParcelable(this.f234815R0, i);
        parcel.writeByte(this.f234817S0 ? (byte) 1 : 0);
        parcel.writeInt(this.f234819T0);
        parcel.writeStringList(this.f234821U0);
        if (this.f234831Z0 == null) {
            this.f234831Z0 = WxAppLibServerMode.f244338f;
        }
        parcel.writeParcelable(this.f234831Z0, i);
        parcel.writeInt(this.f234832a1);
        parcel.writeString(this.f234823V0);
        parcel.writeParcelable(this.f234833b1, i);
    }

    public AppBrandInitConfigLU(Parcel parcel) {
        super(parcel);
        this.f234842v = null;
        this.f234809M = new PersistableBundle();
        boolean z = false;
        this.f234826X = false;
        this.f234828Y = null;
        this.f234836p0 = "";
        HalfScreenConfig halfScreenConfig = HalfScreenConfig.f157929P;
        this.f234815R0 = halfScreenConfig;
        this.f234817S0 = false;
        this.f234825W0 = false;
        this.f234829Y0 = C80247h.LEGACY;
        this.f234831Z0 = WxAppLibServerMode.f244338f;
        this.f234832a1 = 4;
        this.f234837q = parcel.readString();
        this.f234838r = parcel.readString();
        this.f234839s = parcel.readString();
        this.f234840t = parcel.readString();
        this.f234843w = parcel.readString();
        this.f234844x = parcel.readString();
        this.f234846y = (AppBrandLaunchReferrer) parcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader());
        this.f234848z = (AppBrandWeishiParams) parcel.readParcelable(AppBrandWeishiParams.class.getClassLoader());
        this.f234841u = parcel.readInt();
        this.f234798B = parcel.readByte() != 0;
        this.f234797A = parcel.readString();
        this.f234799C = parcel.readString();
        this.f234800D = parcel.readLong();
        this.f234801E = parcel.readLong();
        this.f234802F = parcel.readInt();
        this.f234803G = parcel.readInt();
        this.f234804H = (WxaAttributes.WxaVersionInfo) parcel.readParcelable(WxaAttributes.WxaVersionInfo.class.getClassLoader());
        this.f234805I = parcel.readString();
        this.f234806J = parcel.readString();
        this.f234807K = parcel.readString();
        this.f234808L = parcel.readString();
        this.f234809M = parcel.readPersistableBundle(AppBrandInitConfigLU.class.getClassLoader());
        this.f234810N = parcel.readString();
        this.f234818T = parcel.readInt();
        this.f234825W0 = parcel.readByte() != 0;
        this.f234827X0 = parcel.readByte() > 0;
        this.f234820U = C80245f.m97631a(parcel);
        this.f234822V = C80245f.m97631a(parcel);
        this.f234824W = C80245f.m97631a(parcel);
        this.f234829Y0 = C80247h.m97636c(parcel);
        this.f234811P = parcel.readInt();
        this.f234812Q = parcel.readInt() > 0;
        this.f234814R = parcel.readByte() > 0;
        this.f234816S = parcel.readByte() > 0;
        this.f234828Y = (AppBrandInitWindowConfig) parcel.readParcelable(AppBrandInitWindowConfig.class.getClassLoader());
        this.f234830Z = parcel.readString();
        this.f234836p0 = parcel.readString();
        this.f234845x0 = parcel.readInt() == 1;
        this.f234847y0 = parcel.readInt() == 1;
        this.f234813Q0 = parcel.readInt();
        HalfScreenConfig halfScreenConfig2 = (HalfScreenConfig) parcel.readParcelable(HalfScreenConfig.class.getClassLoader());
        this.f234815R0 = halfScreenConfig2 != null ? halfScreenConfig2 : halfScreenConfig;
        this.f234817S0 = parcel.readByte() > 0 ? true : z;
        this.f234819T0 = parcel.readInt();
        this.f234821U0 = parcel.createStringArrayList();
        this.f234831Z0 = (WxAppLibServerMode) parcel.readParcelable(WxAppLibServerMode.class.getClassLoader());
        this.f234832a1 = parcel.readInt();
        this.f234823V0 = parcel.readString();
        this.f234833b1 = (AppBrandRuntimeReloadReportBundle) parcel.readParcelable(AppBrandRuntimeReloadReportBundle.class.getClassLoader());
    }
}
