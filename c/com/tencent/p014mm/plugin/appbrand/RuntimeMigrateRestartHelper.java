package com.tencent.p014mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83435s;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import p206nj.C117627q;
import p225rc.C89925n;
import sx3.C110818d0;
import u24.C90599h;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper */
public final class RuntimeMigrateRestartHelper {

    /* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$a */
    public static final class C29094a extends C87413o implements C32226l<Map.Entry<String, String>, CharSequence> {

        /* renamed from: d */
        public static final C29094a f79673d = new C29094a();

        public C29094a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C87412m.m108594g(entry, LocaleUtil.ITALIAN);
            return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$b */
    public static final class C29095b extends C87413o implements C32226l<Map.Entry<String, String>, CharSequence> {

        /* renamed from: d */
        public static final C29095b f79674d = new C29095b();

        public C29095b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C87412m.m108594g(entry, LocaleUtil.ITALIAN);
            return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs */
    public static final class MigrateRestartPreLaunchArgs implements Parcelable {
        public static final Parcelable.Creator<MigrateRestartPreLaunchArgs> CREATOR = new C81102a();

        /* renamed from: d */
        public final String f238365d;

        /* renamed from: e */
        public final String f238366e;

        /* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs$a */
        public static final class C81102a implements Parcelable.Creator<MigrateRestartPreLaunchArgs> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new MigrateRestartPreLaunchArgs(parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new MigrateRestartPreLaunchArgs[i];
            }
        }

        public MigrateRestartPreLaunchArgs(String str, String str2) {
            C87412m.m108594g(str, "sourceInstanceId");
            C87412m.m108594g(str2, "targetAppId");
            this.f238365d = str;
            this.f238366e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MigrateRestartPreLaunchArgs)) {
                return false;
            }
            MigrateRestartPreLaunchArgs migrateRestartPreLaunchArgs = (MigrateRestartPreLaunchArgs) obj;
            return C87412m.m108589b(this.f238365d, migrateRestartPreLaunchArgs.f238365d) && C87412m.m108589b(this.f238366e, migrateRestartPreLaunchArgs.f238366e);
        }

        public int hashCode() {
            return (this.f238365d.hashCode() * 31) + this.f238366e.hashCode();
        }

        public String toString() {
            return "MigrateRestartPreLaunchArgs(sourceInstanceId=" + this.f238365d + ", targetAppId=" + this.f238366e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f238365d);
            parcel.writeString(this.f238366e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult */
    public static final class MigrateRestartPreLaunchResult implements Parcelable {
        public static final Parcelable.Creator<MigrateRestartPreLaunchResult> CREATOR = new C81103a();

        /* renamed from: d */
        public final boolean f238367d;

        /* renamed from: e */
        public final AppBrandInitConfigWC f238368e;

        /* renamed from: f */
        public final AppBrandStatObject f238369f;

        /* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult$a */
        public static final class C81103a implements Parcelable.Creator<MigrateRestartPreLaunchResult> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new MigrateRestartPreLaunchResult(parcel.readInt() != 0, (AppBrandInitConfigWC) parcel.readParcelable(MigrateRestartPreLaunchResult.class.getClassLoader()), (AppBrandStatObject) parcel.readParcelable(MigrateRestartPreLaunchResult.class.getClassLoader()));
            }

            public Object[] newArray(int i) {
                return new MigrateRestartPreLaunchResult[i];
            }
        }

        public MigrateRestartPreLaunchResult(boolean z, AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
            this.f238367d = z;
            this.f238368e = appBrandInitConfigWC;
            this.f238369f = appBrandStatObject;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MigrateRestartPreLaunchResult)) {
                return false;
            }
            MigrateRestartPreLaunchResult migrateRestartPreLaunchResult = (MigrateRestartPreLaunchResult) obj;
            return this.f238367d == migrateRestartPreLaunchResult.f238367d && C87412m.m108589b(this.f238368e, migrateRestartPreLaunchResult.f238368e) && C87412m.m108589b(this.f238369f, migrateRestartPreLaunchResult.f238369f);
        }

        public int hashCode() {
            boolean z = this.f238367d;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            AppBrandInitConfigWC appBrandInitConfigWC = this.f238368e;
            int i2 = 0;
            int hashCode = (i + (appBrandInitConfigWC == null ? 0 : appBrandInitConfigWC.hashCode())) * 31;
            AppBrandStatObject appBrandStatObject = this.f238369f;
            if (appBrandStatObject != null) {
                i2 = appBrandStatObject.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "MigrateRestartPreLaunchResult(succeed=" + this.f238367d + ", config=" + this.f238368e + ", stat=" + this.f238369f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f238367d ? 1 : 0);
            parcel.writeParcelable(this.f238368e, i);
            parcel.writeParcelable(this.f238369f, i);
        }
    }

    /* renamed from: a */
    public static final void m99332a(LaunchParcel launchParcel, String str, String str2) {
        LaunchParcel launchParcel2 = launchParcel;
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(launchParcel2, "<this>");
        C87412m.m108594g(str3, "sourceInstanceId");
        C87412m.m108594g(str4, "migrateTargetAppId");
        AppBrandStatObject appBrandStatObject = launchParcel2.f243738o;
        boolean z = appBrandStatObject != null && appBrandStatObject.f245535h == 1;
        if (appBrandStatObject == null) {
            Log.m105920e("MicroMsg.AppBrand.RuntimeMigrateRestartHelper", "resetForMigrateStart, sourceInstanceId:" + str3 + ", migrateTargetAppId:" + str4 + ", missing statObj in old LaunchParcel");
            AppBrandStatObject appBrandStatObject2 = new AppBrandStatObject();
            launchParcel2.f243738o = appBrandStatObject2;
            appBrandStatObject2.f245533f = 1000;
        }
        HashMap hashMap = new HashMap();
        String str5 = launchParcel2.f243731e;
        if (str5 == null || str5.length() == 0) {
            launchParcel2.f243731e = C83435s.m102390g(launchParcel);
        }
        String str6 = launchParcel2.f243731e;
        if (!(str6 == null || str6.length() == 0)) {
            String str7 = launchParcel2.f243731e;
            C87412m.m108593f(str7, "this.appId");
            hashMap.put("migrateSourceAppId", str7);
        }
        String str8 = launchParcel2.f243735i;
        String str9 = "";
        if (str8 == null) {
            str8 = str9;
        }
        if (C112550d0.m153799i0(str8).toString().length() > 0) {
            String a = C89925n.m112488a(launchParcel2.f243735i);
            if (a != null) {
                str9 = a;
            }
            if (!C90599h.m113511d(str9) && !C90599h.m113511d(".html") && str9.endsWith(".html")) {
                str9 = str9.substring(0, str9.length() - 5);
            }
            String S = C110818d0.m150921S(((HashMap) C89925n.m112489b(launchParcel2.f243735i)).entrySet(), "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C29095b.f79674d, 30, (Object) null);
            String a2 = C117627q.m165908a(str9);
            C87412m.m108593f(a2, "encode(path)");
            hashMap.put("migrateSourcePath", a2);
            String a3 = C117627q.m165908a(S);
            C87412m.m108593f(a3, "encode(query)");
            hashMap.put("migrateSourceQuery", a3);
        }
        hashMap.put("migrateSourceScene", String.valueOf(launchParcel2.f243738o.f245533f));
        hashMap.put("migrateSourceAppIdIsStared", z ? "1" : "0");
        launchParcel2.f243730d = null;
        launchParcel2.f243731e = str4;
        launchParcel2.f243729V = true;
        launchParcel2.f243718J = new AppBrandRuntimeReloadReportBundle(str3, "WxaMigrate");
        launchParcel2.f243738o.f245533f = 1248;
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        Set entrySet = hashMap.entrySet();
        C87412m.m108593f(entrySet, "newQueries.entries");
        sb.append(C110818d0.m150921S(entrySet, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C29094a.f79673d, 30, (Object) null));
        launchParcel2.f243735i = sb.toString();
    }
}
