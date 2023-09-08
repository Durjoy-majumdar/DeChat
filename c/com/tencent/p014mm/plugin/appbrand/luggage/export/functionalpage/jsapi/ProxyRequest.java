package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/jsapi/ProxyRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.ProxyRequest */
final class ProxyRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final C83566a CREATOR = new C83566a((C8480h) null);

    /* renamed from: d */
    public int f244115d;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.ProxyRequest$a */
    public static final class C83566a implements Parcelable.Creator<ProxyRequest> {
        public C83566a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new ProxyRequest(parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new ProxyRequest[i];
        }
    }

    public ProxyRequest(int i) {
        this.f244115d = i;
    }

    public Class<C83587s> getTaskClass() {
        return C83587s.class;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f244115d);
    }
}
