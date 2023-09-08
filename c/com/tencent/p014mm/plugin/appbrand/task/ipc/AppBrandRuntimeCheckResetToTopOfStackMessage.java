package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p963fc.C86812g;
import ur0.C90727d;
import x20.C15618a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandRuntimeCheckResetToTopOfStackMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimeCheckResetToTopOfStackMessage */
public final class AppBrandRuntimeCheckResetToTopOfStackMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> {
    public static final Parcelable.Creator<AppBrandRuntimeCheckResetToTopOfStackMessage> CREATOR = new C84304b();

    /* renamed from: e */
    public final String f246187e;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimeCheckResetToTopOfStackMessage$a */
    public static final class C84303a {
        public C84303a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimeCheckResetToTopOfStackMessage$b */
    public static final class C84304b implements Parcelable.Creator<AppBrandRuntimeCheckResetToTopOfStackMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandRuntimeCheckResetToTopOfStackMessage(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new AppBrandRuntimeCheckResetToTopOfStackMessage[i];
        }
    }

    static {
        new C84303a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandRuntimeCheckResetToTopOfStackMessage(String str) {
        super(str);
        C87412m.m108594g(str, "appId");
        this.f246187e = str;
    }

    /* renamed from: d */
    public static final void m103926d(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandInitConfigWC appBrandInitConfigWC, AppBrandInitConfigWC appBrandInitConfigWC2) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        C87412m.m108594g(appBrandInitConfigWC, "oldConfig");
        C87412m.m108594g(appBrandInitConfigWC2, "newConfig");
        AppBrandLaunchReferrer appBrandLaunchReferrer = appBrandInitConfigWC.f234846y;
        if (appBrandLaunchReferrer.f239396d == 1) {
            String str = appBrandLaunchReferrer.f239397e;
            if (!(str == null || str.length() == 0)) {
                AppBrandLaunchReferrer appBrandLaunchReferrer2 = appBrandInitConfigWC2.f234846y;
                if (appBrandLaunchReferrer2.f239396d != 1 || !C87412m.m108589b(appBrandLaunchReferrer2.f239397e, appBrandInitConfigWC.f234846y.f239397e)) {
                    String str2 = appBrandInitConfigWC.f234846y.f239397e;
                    C87412m.m108593f(str2, "oldConfig.referrer.appId");
                    C15618a.m14626b(new IPCString(str2), new C84307b(), (C1256g) null);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f246187e;
    }

    /* renamed from: c */
    public void mo893c(C86812g gVar) {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        appBrandRuntimeWC.mo113024P0(new C90727d(appBrandRuntimeWC));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f246187e);
    }
}
