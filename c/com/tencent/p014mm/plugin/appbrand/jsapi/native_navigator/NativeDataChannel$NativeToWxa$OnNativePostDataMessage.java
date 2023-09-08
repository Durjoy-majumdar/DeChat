package com.tencent.p014mm.plugin.appbrand.jsapi.native_navigator;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import gy3.C87412m;
import kotlin.Metadata;
import kr0.C88267e;
import p963fc.C86812g;
import rl0.C90001a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/native_navigator/NativeDataChannel$NativeToWxa$OnNativePostDataMessage", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$NativeToWxa$OnNativePostDataMessage */
public final class NativeDataChannel$NativeToWxa$OnNativePostDataMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> {
    public static final Parcelable.Creator<NativeDataChannel$NativeToWxa$OnNativePostDataMessage> CREATOR = new C82843a();

    /* renamed from: e */
    public final String f242259e;

    /* renamed from: f */
    public final String f242260f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$NativeToWxa$OnNativePostDataMessage$a */
    public static final class C82843a implements Parcelable.Creator<NativeDataChannel$NativeToWxa$OnNativePostDataMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new NativeDataChannel$NativeToWxa$OnNativePostDataMessage(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new NativeDataChannel$NativeToWxa$OnNativePostDataMessage[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeDataChannel$NativeToWxa$OnNativePostDataMessage(String str, String str2) {
        super(str);
        C87412m.m108594g(str, "appId");
        this.f242259e = str;
        this.f242260f = str2;
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f242259e;
    }

    /* renamed from: c */
    public void mo893c(C86812g gVar) {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        C88267e eVar = (C88267e) appBrandRuntimeWC.f238150p;
        if (eVar != null) {
            C90001a aVar = new C90001a();
            aVar.f242407f = this.f242260f;
            aVar.mo115194p(eVar);
            aVar.mo115158h();
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f242259e);
        parcel.writeString(this.f242260f);
    }
}
