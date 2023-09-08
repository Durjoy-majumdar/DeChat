package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82805k;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;
import org.json.JSONObject;
import te3.C64287ci1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare */
public final class JsApiNavigateToMiniProgramForFinderProductShare extends C82805k {
    public static final int CTRL_INDEX = 1149;
    public static final String NAME = "navigateToMiniProgramForFinderProductShare";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask */
    public static final class NotifyClickTask extends AppBrandProxyUIProcessTask {
        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            C64287ci1 ci12;
            NotifyClickRequest notifyClickRequest = processRequest instanceof NotifyClickRequest ? (NotifyClickRequest) processRequest : null;
            if (notifyClickRequest == null || (ci12 = notifyClickRequest.f158092d) == null) {
                finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
                return;
            }
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            C60200t1.C60201a.m70372j((C60200t1) c, activityContext, ci12, (C32226l) null, 4, (Object) null);
            getActivityContext().getLifecycle().addObserver(new C55503xe3890d3f(this));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/finder/JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest */
    public static final class NotifyClickRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final C55502a CREATOR = new C55502a((C8480h) null);

        /* renamed from: d */
        public C64287ci1 f158092d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest$a */
        public static final class C55502a implements Parcelable.Creator<NotifyClickRequest> {
            public C55502a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
                return new NotifyClickRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new NotifyClickRequest[i];
            }
        }

        public NotifyClickRequest() {
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return NotifyClickTask.class;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            super.writeToParcel(parcel, i);
            C80893c.m98763d(this.f158092d, parcel);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public NotifyClickRequest(Parcel parcel) {
            this();
            C87412m.m108594g(parcel, "parcel");
            readParcel(parcel);
            Object c = C80893c.m98762c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
            C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderProductShareObject");
            this.f158092d = (C64287ci1) c;
        }
    }

    /* renamed from: x */
    public void mo77028x(HalfScreenConfig.C55452b bVar, JSONObject jSONObject) {
        C87412m.m108594g(bVar, "builder");
        C87412m.m108594g(jSONObject, "data");
        JSONObject optJSONObject = jSONObject.optJSONObject("uiParam");
        if (optJSONObject == null) {
            optJSONObject = jSONObject.optJSONObject("halfPage");
        }
        C87412m.m108591d(optJSONObject);
        if (!optJSONObject.has("width")) {
            bVar.f157991c = -1;
        }
        if (!optJSONObject.has("height")) {
            bVar.f157990b = -1;
            bVar.f158007s = false;
        }
        String valueOf = String.valueOf(jSONObject.hashCode());
        bVar.f158002n = true;
        bVar.f158008t = new HalfScreenConfig.ShareActionConfig(true, valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = r5.optJSONObject("extraData");
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c.C82798c mo77029y(com.tencent.p014mm.plugin.appbrand.C81879g r4, org.json.JSONObject r5, int r6) {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c$c r6 = super.mo77029y(r4, r5, r6)
            if (r4 != 0) goto L_0x0007
            return r6
        L_0x0007:
            if (r5 == 0) goto L_0x0019
            java.lang.String r0 = "extraData"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.String r1 = "shareProductItem"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x001d
            return r6
        L_0x001d:
            int r5 = r5.hashCode()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            te3.ci1 r1 = new te3.ci1
            r1.<init>()
            java.lang.String r2 = "appId"
            java.lang.String r2 = r0.optString(r2)
            r1.f182500i = r2
            java.lang.String r2 = "pagePath"
            java.lang.String r2 = r0.optString(r2)
            r1.f182501j = r2
            java.lang.String r2 = "finderUsername"
            java.lang.String r2 = r0.optString(r2)
            r1.f182496e = r2
            java.lang.String r2 = "productId"
            java.lang.String r2 = r0.optString(r2)
            r1.f182502n = r2
            java.lang.String r2 = "coverUrl"
            java.lang.String r2 = r0.optString(r2)
            r1.f182503o = r2
            java.lang.String r2 = "marketPrice"
            int r2 = r0.optInt(r2)
            r1.f182505q = r2
            java.lang.String r2 = "sellingPrice"
            int r2 = r0.optInt(r2)
            r1.f182506r = r2
            java.lang.String r2 = "platformName"
            java.lang.String r2 = r0.optString(r2)
            r1.f182508t = r2
            java.lang.String r2 = "ecSource"
            java.lang.String r2 = r0.optString(r2)
            r1.f182512x = r2
            java.lang.String r2 = "sellingPriceWording"
            java.lang.String r0 = r0.optString(r2)
            r1.f182513y = r0
            com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1 r0 = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1
            r0.<init>(r6, r4, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare.mo77029y(com.tencent.mm.plugin.appbrand.g, org.json.JSONObject, int):com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r1 != false) goto L_0x003e;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.C81879g r5, org.json.JSONObject r6, int r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invoke data:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ",callbackId:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.JsApiNavigateToMiniProgramForFinderProductShare"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = "halfPage"
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x002c
            boolean r3 = r6.has(r0)
            if (r3 != r1) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            if (r3 != 0) goto L_0x003e
            if (r6 == 0) goto L_0x003b
            java.lang.String r3 = "uiParam"
            boolean r3 = r6.has(r3)
            if (r3 != r1) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            if (r1 == 0) goto L_0x0043
        L_0x003e:
            java.lang.String r1 = "mode"
            r6.put(r1, r0)
        L_0x0043:
            super.mo1505u(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare.mo1505u(com.tencent.mm.plugin.appbrand.g, org.json.JSONObject, int):void");
    }
}
