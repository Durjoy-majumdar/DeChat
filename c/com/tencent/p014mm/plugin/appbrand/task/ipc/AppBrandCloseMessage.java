package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC$$m;
import gy3.C87412m;
import kotlin.Metadata;
import p963fc.C86812g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandCloseMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandCloseMessage */
public final class AppBrandCloseMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> {
    public static final Parcelable.Creator<AppBrandCloseMessage> CREATOR = new C84293a();

    /* renamed from: e */
    public final String f246168e;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandCloseMessage$a */
    public static final class C84293a implements Parcelable.Creator<AppBrandCloseMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandCloseMessage(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new AppBrandCloseMessage[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandCloseMessage(String str) {
        super(str);
        C87412m.m108594g(str, "appId");
        this.f246168e = str;
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f246168e;
    }

    /* renamed from: c */
    public void mo893c(C86812g gVar) {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        AppBrandRuntimeWC appBrandRuntimeWC2 = ((AppBrandRuntimeWC$$m) appBrandRuntimeWC.f238277M1).f238330a;
        if (appBrandRuntimeWC2.f238122S) {
            appBrandRuntimeWC2.mo113063k();
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f246168e);
    }
}
