package com.tencent.p014mm.plugin.appbrand.networking;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p963fc.C86812g;
import p963fc.g$$a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/networking/AppBrandWeakNetReceiver$WeakNetNotifyMessage", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.networking.AppBrandWeakNetReceiver$WeakNetNotifyMessage */
public final class AppBrandWeakNetReceiver$WeakNetNotifyMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> {
    public static final Parcelable.Creator<AppBrandWeakNetReceiver$WeakNetNotifyMessage> CREATOR = new C83707a();

    /* renamed from: e */
    public final String f244332e;

    /* renamed from: f */
    public final boolean f244333f;

    /* renamed from: g */
    public final int f244334g;

    /* renamed from: com.tencent.mm.plugin.appbrand.networking.AppBrandWeakNetReceiver$WeakNetNotifyMessage$a */
    public static final class C83707a implements Parcelable.Creator<AppBrandWeakNetReceiver$WeakNetNotifyMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandWeakNetReceiver$WeakNetNotifyMessage(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new AppBrandWeakNetReceiver$WeakNetNotifyMessage[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandWeakNetReceiver$WeakNetNotifyMessage(String str, boolean z, int i) {
        super(str);
        C87412m.m108594g(str, "appId");
        this.f244332e = str;
        this.f244333f = z;
        this.f244334g = i;
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f244332e;
    }

    /* renamed from: c */
    public void mo893c(C86812g gVar) {
        QualitySessionRuntime a;
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        boolean z = this.f244333f;
        int i = this.f244334g;
        if (z && (a = C84185b.m103768a(appBrandRuntimeWC)) != null) {
            a.f245844E = i;
        }
        WxAppLibServerMode wxAppLibServerMode = appBrandRuntimeWC.f251969g1;
        WxAppLibServerMode wxAppLibServerMode2 = new WxAppLibServerMode(z, WxAppLibServerMode.C83709b.Offline);
        boolean z2 = false;
        if (wxAppLibServerMode != null && wxAppLibServerMode2.f244339d == wxAppLibServerMode.f244339d) {
            z2 = true;
        }
        if (!z2) {
            appBrandRuntimeWC.mo113020N0(new g$$a(appBrandRuntimeWC, wxAppLibServerMode2));
            Log.m105924i("MicroMsg.AppBrandWeakNetReceiver.AppBrandReceiver", "dispatchWxAppLibServerModeChanged " + wxAppLibServerMode2);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f244332e);
        parcel.writeInt(this.f244333f ? 1 : 0);
        parcel.writeInt(this.f244334g);
    }
}
