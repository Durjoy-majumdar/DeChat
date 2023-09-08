package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.q1$$a;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p963fc.C86812g;
import u24.C90599h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandLaunchWxaAppInfoNotifyMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "b", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage */
public final class AppBrandLaunchWxaAppInfoNotifyMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> {
    public static final Parcelable.Creator<AppBrandLaunchWxaAppInfoNotifyMessage> CREATOR = new C29649a();

    /* renamed from: e */
    public final String f246178e;

    /* renamed from: f */
    public final Parcelable f246179f;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage$a */
    public static final class C29649a implements Parcelable.Creator<AppBrandLaunchWxaAppInfoNotifyMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandLaunchWxaAppInfoNotifyMessage(parcel.readString(), parcel.readParcelable(AppBrandLaunchWxaAppInfoNotifyMessage.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new AppBrandLaunchWxaAppInfoNotifyMessage[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage$b */
    public static final class C84298b {

        /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage$b$a */
        public static final class C84299a extends C87413o implements C32226l<C80264l, LuggageClientProcessMessage<?>> {

            /* renamed from: d */
            public final /* synthetic */ String f246180d;

            /* renamed from: e */
            public final /* synthetic */ Parcelable f246181e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C84299a(String str, Parcelable parcelable) {
                super(1);
                this.f246180d = str;
                this.f246181e = parcelable;
            }

            public Object invoke(Object obj) {
                C80264l lVar = (C80264l) obj;
                C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
                if (C90599h.m113509b(lVar.f234965a, this.f246180d)) {
                    return new AppBrandLaunchWxaAppInfoNotifyMessage(this.f246180d, this.f246181e);
                }
                return null;
            }
        }

        /* renamed from: a */
        public static final void m103919a(String str, Parcelable parcelable) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(parcelable, "data");
            if (MMApplicationContext.isMainProcess()) {
                AppBrandProcessesManager.f246131g.mo116962a().mo116953R(new C84299a(str, parcelable));
                return;
            }
            throw new IllegalStateException("Main process env is required for notify call".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandLaunchWxaAppInfoNotifyMessage(String str, Parcelable parcelable) {
        super(str);
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(parcelable, "data");
        this.f246178e = str;
        this.f246179f = parcelable;
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f246178e;
    }

    /* renamed from: c */
    public void mo893c(C86812g gVar) {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        Parcelable parcelable = this.f246179f;
        Log.m105925i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "handleIPCNotifyMessage runtime(%s %d), destroyed %b", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.f238149o.f239365g), Boolean.valueOf(appBrandRuntimeWC.mo113064k0()));
        if (!appBrandRuntimeWC.mo113064k0()) {
            appBrandRuntimeWC.mo113171B1(new q1$$a(parcelable, appBrandRuntimeWC));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f246178e);
        parcel.writeParcelable(this.f246179f, i);
    }
}
