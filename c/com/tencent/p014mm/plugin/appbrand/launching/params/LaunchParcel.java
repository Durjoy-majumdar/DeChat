package com.tencent.p014mm.plugin.appbrand.launching.params;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandInitWindowConfig;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.luggage.sdk.launching.C80245f;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandWeishiParams;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.coremedia.TimeUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import u24.C90599h;
import wi0.C66117m;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel */
public final class LaunchParcel implements Parcelable {
    public static final Parcelable.Creator<LaunchParcel> CREATOR = new C83408a();

    /* renamed from: A */
    public PersistableBundle f243709A;

    /* renamed from: B */
    public String f243710B;

    /* renamed from: C */
    public int f243711C;

    /* renamed from: D */
    public AppBrandLaunchFromNotifyReferrer f243712D;

    /* renamed from: E */
    public HalfScreenConfig f243713E;

    /* renamed from: F */
    public boolean f243714F;

    /* renamed from: G */
    public boolean f243715G;

    /* renamed from: H */
    public AppBrandInitWindowConfig f243716H;

    /* renamed from: I */
    public Parcelable f243717I;

    /* renamed from: J */
    public AppBrandRuntimeReloadReportBundle f243718J;

    /* renamed from: K */
    public List<String> f243719K;

    /* renamed from: L */
    public C80247h f243720L;

    /* renamed from: M */
    public int f243721M;

    /* renamed from: N */
    public String f243722N;

    /* renamed from: P */
    public String f243723P;

    /* renamed from: Q */
    public C66117m f243724Q;

    /* renamed from: R */
    public String f243725R;

    /* renamed from: S */
    public boolean f243726S;

    /* renamed from: T */
    public boolean f243727T;

    /* renamed from: U */
    public boolean f243728U;

    /* renamed from: V */
    public boolean f243729V;

    /* renamed from: d */
    public String f243730d;

    /* renamed from: e */
    public String f243731e;

    /* renamed from: f */
    public int f243732f;

    /* renamed from: g */
    public int f243733g;

    /* renamed from: h */
    public int f243734h;

    /* renamed from: i */
    public String f243735i;

    /* renamed from: j */
    public String f243736j;

    /* renamed from: n */
    public String f243737n;

    /* renamed from: o */
    public AppBrandStatObject f243738o;

    /* renamed from: p */
    public AppBrandLaunchReferrer f243739p;

    /* renamed from: q */
    public LaunchParamsOptional f243740q;

    /* renamed from: r */
    public long f243741r;

    /* renamed from: s */
    public long f243742s;

    /* renamed from: t */
    public String f243743t;

    /* renamed from: u */
    public PersistableBundle f243744u;

    /* renamed from: v */
    public ActivityStarterIpcDelegate f243745v;

    /* renamed from: w */
    public C80242c<?> f243746w;

    /* renamed from: x */
    public C80242c<?> f243747x;

    /* renamed from: y */
    public int f243748y;

    /* renamed from: z */
    public C80242c<Bundle> f243749z;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel$a */
    public class C83408a implements Parcelable.Creator<LaunchParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new LaunchParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new LaunchParcel[i];
        }
    }

    public LaunchParcel() {
        this.f243748y = -1;
        this.f243709A = null;
        this.f243710B = null;
        this.f243713E = HalfScreenConfig.f157929P;
        this.f243714F = false;
        this.f243715G = false;
        this.f243716H = null;
        this.f243719K = new ArrayList();
        this.f243720L = C80247h.LEGACY;
        this.f243721M = 0;
        this.f243722N = "";
        this.f243723P = "";
        this.f243724Q = C66117m.NORMAL;
        this.f243725R = "";
        this.f243728U = false;
    }

    /* renamed from: a */
    public static String m102355a(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        String i = C81412d0.m99875i(str);
        int lastIndexOf = i.lastIndexOf("?");
        if (lastIndexOf != -1) {
            String substring = i.substring(0, lastIndexOf);
            str2 = i.substring(lastIndexOf);
            i = substring;
        }
        if (TextUtils.isEmpty(i) || i.endsWith(".html")) {
            sb.append(i);
            sb.append(str2);
        } else {
            sb.append(i);
            sb.append(".html");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void mo115681b(AppBrandInitConfigLU appBrandInitConfigLU) {
        AppBrandWeishiParams appBrandWeishiParams;
        if (appBrandInitConfigLU != null) {
            if (TextUtils.isEmpty(appBrandInitConfigLU.f234839s)) {
                appBrandInitConfigLU.f234839s = this.f243730d;
            }
            LaunchParamsOptional launchParamsOptional = this.f243740q;
            if (!(launchParamsOptional == null || (appBrandWeishiParams = launchParamsOptional.f237921g) == null)) {
                AppBrandWeishiParams appBrandWeishiParams2 = appBrandInitConfigLU.f234848z;
                appBrandWeishiParams2.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.setDataPosition(0);
                appBrandWeishiParams.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                appBrandWeishiParams2.mo113929a(obtain);
                obtain.recycle();
            }
            appBrandInitConfigLU.f239367i = C81412d0.m99875i(this.f243735i);
            appBrandInitConfigLU.f234840t = C90599h.m113523p(this.f243736j);
            AppBrandLaunchReferrer appBrandLaunchReferrer = this.f243739p;
            if (appBrandLaunchReferrer == null) {
                AppBrandLaunchReferrer appBrandLaunchReferrer2 = appBrandInitConfigLU.f234846y;
                appBrandLaunchReferrer2.getClass();
                appBrandLaunchReferrer2.mo113921b(new AppBrandLaunchReferrer());
            } else {
                appBrandInitConfigLU.f234846y.mo113921b(appBrandLaunchReferrer);
            }
            LaunchParamsOptional launchParamsOptional2 = this.f243740q;
            appBrandInitConfigLU.f234843w = launchParamsOptional2 == null ? null : launchParamsOptional2.f237918d;
            appBrandInitConfigLU.f234844x = launchParamsOptional2 == null ? null : launchParamsOptional2.f237919e;
            appBrandInitConfigLU.f234799C = launchParamsOptional2 == null ? null : launchParamsOptional2.f237923i;
            appBrandInitConfigLU.f234800D = this.f243741r;
            appBrandInitConfigLU.f234801E = this.f243742s;
            appBrandInitConfigLU.f234820U = this.f243746w;
            appBrandInitConfigLU.f234822V = this.f243747x;
            appBrandInitConfigLU.f234829Y0 = this.f243720L;
            appBrandInitConfigLU.f234814R = this.f243714F;
            appBrandInitConfigLU.f234816S = this.f243715G;
            appBrandInitConfigLU.f234826X = this.f243728U;
            appBrandInitConfigLU.f234828Y = this.f243716H;
            appBrandInitConfigLU.f234827X0 = this.f243729V;
            String str = this.f243737n;
            Log.m105925i("Luggage.AppBrandInitConfigLU", "resetSession(%s) %s", str, android.util.Log.getStackTraceString(new Throwable()));
            appBrandInitConfigLU.f234837q = str;
            appBrandInitConfigLU.f234807K = this.f243743t;
            appBrandInitConfigLU.f234810N = null;
            AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = this.f243718J;
            if (appBrandRuntimeReloadReportBundle != null) {
                appBrandInitConfigLU.f234833b1 = appBrandRuntimeReloadReportBundle;
            }
        }
    }

    /* renamed from: c */
    public void mo115682c() {
        C80245f.m97632b(this.f243746w);
        C80245f.m97632b(this.f243747x);
        C80245f.m97632b(this.f243749z);
    }

    public Object clone() {
        Parcel obtain = Parcel.obtain();
        obtain.setDataPosition(0);
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        LaunchParcel launchParcel = new LaunchParcel(obtain);
        obtain.recycle();
        return launchParcel;
    }

    /* renamed from: d */
    public void mo115684d() {
        this.f243741r = Util.nowMilliSecond();
        this.f243742s = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) + (System.nanoTime() % TimeUtil.SECOND_TO_US);
    }

    public int describeContents() {
        return 0;
    }

    public void finalize() {
        try {
            mo115682c();
        } finally {
            super.finalize();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LaunchParcel{username='");
        sb.append(this.f243730d);
        sb.append('\'');
        sb.append(", appId='");
        sb.append(this.f243731e);
        sb.append('\'');
        sb.append(", version=");
        sb.append(this.f243732f);
        sb.append(", versionType=");
        sb.append(this.f243733g);
        sb.append(", enterPath='");
        sb.append(this.f243735i);
        sb.append('\'');
        sb.append(", statObj=");
        sb.append(this.f243738o);
        sb.append(", referrer=");
        sb.append(this.f243739p);
        sb.append(", startClickTimestamp=");
        sb.append(this.f243741r);
        sb.append(", windowConfig=");
        AppBrandInitWindowConfig appBrandInitWindowConfig = this.f243716H;
        sb.append(appBrandInitWindowConfig == null ? "null" : appBrandInitWindowConfig.toString());
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f243730d);
        parcel.writeString(this.f243731e);
        parcel.writeInt(this.f243732f);
        parcel.writeInt(this.f243733g);
        parcel.writeInt(this.f243734h);
        parcel.writeString(this.f243735i);
        parcel.writeString(this.f243736j);
        parcel.writeString(this.f243737n);
        parcel.writeParcelable(this.f243738o, i);
        parcel.writeParcelable(this.f243739p, i);
        parcel.writeParcelable(this.f243740q, i);
        parcel.writeLong(this.f243741r);
        parcel.writeLong(this.f243742s);
        parcel.writeString(this.f243743t);
        parcel.writePersistableBundle(this.f243744u);
        parcel.writeParcelable(this.f243745v, i);
        C80245f.m97633c(this.f243746w, parcel);
        C80245f.m97633c(this.f243747x, parcel);
        parcel.writeInt(this.f243748y);
        C80245f.m97633c(this.f243749z, parcel);
        parcel.writePersistableBundle(this.f243709A);
        parcel.writeString(this.f243710B);
        parcel.writeInt(this.f243711C);
        parcel.writeParcelable(this.f243712D, i);
        parcel.writeParcelable(this.f243717I, i);
        parcel.writeParcelable(this.f243718J, i);
        parcel.writeStringList(this.f243719K);
        parcel.writeParcelable(this.f243713E, i);
        parcel.writeInt(this.f243720L.ordinal());
        parcel.writeInt(this.f243721M);
        parcel.writeString(this.f243722N);
        parcel.writeByte(this.f243714F ? (byte) 1 : 0);
        parcel.writeByte(this.f243715G ? (byte) 1 : 0);
        parcel.writeParcelable(this.f243716H, i);
        parcel.writeString(this.f243723P);
        parcel.writeString(this.f243725R);
        parcel.writeString(this.f243724Q.name());
        parcel.writeInt(this.f243726S ? 1 : 0);
        parcel.writeInt(this.f243727T ? 1 : 0);
        parcel.writeInt(this.f243728U ? 1 : 0);
        parcel.writeByte(this.f243729V ? (byte) 1 : 0);
    }

    public LaunchParcel(Parcel parcel) {
        this.f243748y = -1;
        this.f243709A = null;
        this.f243710B = null;
        this.f243713E = HalfScreenConfig.f157929P;
        boolean z = false;
        this.f243714F = false;
        this.f243715G = false;
        this.f243716H = null;
        this.f243719K = new ArrayList();
        this.f243720L = C80247h.LEGACY;
        this.f243721M = 0;
        this.f243722N = "";
        this.f243723P = "";
        C66117m mVar = C66117m.NORMAL;
        this.f243724Q = mVar;
        this.f243725R = "";
        this.f243728U = false;
        this.f243730d = parcel.readString();
        this.f243731e = parcel.readString();
        this.f243732f = parcel.readInt();
        this.f243733g = parcel.readInt();
        this.f243734h = parcel.readInt();
        this.f243735i = parcel.readString();
        this.f243736j = parcel.readString();
        this.f243737n = parcel.readString();
        this.f243738o = (AppBrandStatObject) parcel.readParcelable(AppBrandStatObject.class.getClassLoader());
        this.f243739p = (AppBrandLaunchReferrer) parcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader());
        this.f243740q = (LaunchParamsOptional) parcel.readParcelable(LaunchParamsOptional.class.getClassLoader());
        this.f243741r = parcel.readLong();
        this.f243742s = parcel.readLong();
        this.f243743t = parcel.readString();
        this.f243744u = parcel.readPersistableBundle(LaunchParcel.class.getClassLoader());
        this.f243745v = (ActivityStarterIpcDelegate) parcel.readParcelable(ActivityStarterIpcDelegate.class.getClassLoader());
        this.f243746w = C80245f.m97631a(parcel);
        this.f243747x = C80245f.m97631a(parcel);
        this.f243748y = parcel.readInt();
        this.f243749z = C80245f.m97631a(parcel);
        this.f243709A = parcel.readPersistableBundle(LaunchParcel.class.getClassLoader());
        this.f243710B = parcel.readString();
        this.f243711C = parcel.readInt();
        this.f243712D = (AppBrandLaunchFromNotifyReferrer) parcel.readParcelable(AppBrandLaunchFromNotifyReferrer.class.getClassLoader());
        this.f243717I = parcel.readParcelable(LaunchParcel.class.getClassLoader());
        this.f243718J = (AppBrandRuntimeReloadReportBundle) parcel.readParcelable(LaunchParcel.class.getClassLoader());
        parcel.readStringList(this.f243719K);
        this.f243713E = (HalfScreenConfig) parcel.readParcelable(HalfScreenConfig.class.getClassLoader());
        this.f243720L = C80247h.m97636c(parcel);
        this.f243721M = parcel.readInt();
        this.f243722N = parcel.readString();
        this.f243714F = parcel.readByte() > 0;
        this.f243715G = parcel.readByte() > 0;
        this.f243716H = (AppBrandInitWindowConfig) parcel.readParcelable(AppBrandInitWindowConfig.class.getClassLoader());
        this.f243723P = parcel.readString();
        this.f243725R = parcel.readString();
        String readString = parcel.readString();
        this.f243724Q = !TextUtils.isEmpty(readString) ? C66117m.valueOf(readString) : mVar;
        this.f243726S = parcel.readInt() == 1;
        this.f243727T = parcel.readInt() == 1;
        this.f243728U = parcel.readInt() == 1;
        this.f243729V = parcel.readByte() > 0 ? true : z;
    }
}
