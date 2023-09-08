package com.tencent.p014mm.plugin.appbrand.jsapi.p947ui.launcher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c00.C0406o;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import u73.C101982p;
import u73.C14134p0;
import u73.C14135q;
import wm0.C91037d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch */
public final class API_openWeAppSearch extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 647;
    @Deprecated
    public static final String NAME = "openWeAppSearch";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ui/launcher/API_openWeAppSearch$OpenSearchRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchRequest */
    public static final class OpenSearchRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<OpenSearchRequest> CREATOR = new C83043a();

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchRequest$a */
        public static final class C83043a implements Parcelable.Creator<OpenSearchRequest> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                parcel.readInt();
                return new OpenSearchRequest();
            }

            public Object[] newArray(int i) {
                return new OpenSearchRequest[i];
            }
        }

        public Class<C83045a> getTaskClass() {
            return C83045a.class;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ui/launcher/API_openWeAppSearch$OpenSearchResponse;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$DefaultProcessResult;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchResponse */
    public static final class OpenSearchResponse extends AppBrandProxyUIProcessTask.DefaultProcessResult {
        public static final Parcelable.Creator<OpenSearchResponse> CREATOR = new C83044a();

        /* renamed from: d */
        public final boolean f242771d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchResponse$a */
        public static final class C83044a implements Parcelable.Creator<OpenSearchResponse> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenSearchResponse(parcel.readInt() != 0);
            }

            public Object[] newArray(int i) {
                return new OpenSearchResponse[i];
            }
        }

        public OpenSearchResponse(boolean z) {
            this.f242771d = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f242771d ? 1 : 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$a */
    public static final class C83045a extends AppBrandProxyUIProcessTask {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$a$a */
        public static final class C83046a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C83045a f242772d;

            public C83046a(C83045a aVar) {
                this.f242772d = aVar;
            }

            public final void run() {
                C14134p0 p0Var = new C14134p0();
                p0Var.f39545b = 201;
                p0Var.f39546c = 262208;
                p0Var.f39565v = !((C0406o) C86312j.m106911c(C0406o.class)).yv0(201, 262208);
                C83045a aVar = this.f242772d;
                ((C101982p) C86312j.m106911c(C101982p.class)).mo6883yJ(aVar.getActivityContext(), p0Var);
                aVar.finishProcess(new OpenSearchResponse(true));
            }
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            if (processRequest instanceof OpenSearchRequest) {
                ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(getActivityContext(), new C83046a(this));
            } else {
                finishProcess(new OpenSearchResponse(false));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null && jSONObject != null) {
            Context context = gVar.getContext();
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            C81956c.m100675c(context, new OpenSearchRequest(), new C91037d(gVar, i, this), (Intent) null);
        }
    }
}
