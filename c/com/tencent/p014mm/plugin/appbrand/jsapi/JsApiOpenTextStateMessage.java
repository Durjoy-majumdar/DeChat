package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import p773yy.C79168k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage */
public final class JsApiOpenTextStateMessage extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 1028;
    private static final String NAME = "openTextStateMessage";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenTextStateMessage$OpenTextStateRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateRequest */
    public static final class OpenTextStateRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final C81988a CREATOR = new C81988a((C8480h) null);

        /* renamed from: d */
        public String f240423d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateRequest$a */
        public static final class C81988a implements Parcelable.Creator<OpenTextStateRequest> {
            public C81988a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
                return new OpenTextStateRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenTextStateRequest[i];
            }
        }

        public OpenTextStateRequest() {
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return C81990a.class;
        }

        public void readParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            this.f240423d = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeString(this.f240423d);
        }

        public OpenTextStateRequest(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            readParcel(parcel);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOpenTextStateMessage$OpenTextStateResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateResult */
    public static final class OpenTextStateResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final C81989a CREATOR = new C81989a((C8480h) null);

        /* renamed from: d */
        public String f240424d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateResult$a */
        public static final class C81989a implements Parcelable.Creator<OpenTextStateResult> {
            public C81989a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
                return new OpenTextStateResult(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenTextStateResult[i];
            }
        }

        public OpenTextStateResult() {
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            this.f240424d = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeString(this.f240424d);
        }

        public OpenTextStateResult(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$a */
    public static final class C81990a extends AppBrandProxyUIProcessTask {
        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            JSONObject jSONObject;
            C87412m.m108594g(processRequest, "request");
            OpenTextStateResult openTextStateResult = new OpenTextStateResult();
            if (!(processRequest instanceof OpenTextStateRequest)) {
                Log.m105928w("CheckStrangerTask", "handleRequest, request not instance of ProfileRequest");
                finishProcess(openTextStateResult);
            } else if (!C86709a0.m107523b().mo121115m()) {
                Log.m105920e("CheckStrangerTask", "handleRequest, MMKernel.account().hasLogin() is false");
                finishProcess(openTextStateResult);
            } else {
                String str = ((OpenTextStateRequest) processRequest).f240423d;
                if (str == null) {
                    str = "";
                }
                String str2 = null;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
                JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("param") : null;
                if (jSONObject != null) {
                    str2 = jSONObject.optString("action");
                }
                if (C87412m.m108589b(str2, "openChat")) {
                    Context activityContext = getActivityContext();
                    if (activityContext == null) {
                        activityContext = MMApplicationContext.getContext();
                    }
                    ((C79168k) C86312j.m106911c(C79168k.class)).mo74139we(activityContext, optJSONObject);
                    finishProcess(openTextStateResult);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$b */
    public static final class C81991b<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f240425a;

        /* renamed from: b */
        public final /* synthetic */ int f240426b;

        /* renamed from: c */
        public final /* synthetic */ JsApiOpenTextStateMessage f240427c;

        public C81991b(C82381f fVar, int i, JsApiOpenTextStateMessage jsApiOpenTextStateMessage) {
            this.f240425a = fVar;
            this.f240426b = i;
            this.f240427c = jsApiOpenTextStateMessage;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            JSONObject jSONObject;
            OpenTextStateResult openTextStateResult = (OpenTextStateResult) processResult;
            Log.m105924i("MicroMsg.TextStatus.JsApiOpenTextStateMessage", "onReceiveResult result:" + openTextStateResult.f240424d);
            try {
                jSONObject = new JSONObject(openTextStateResult.f240424d);
            } catch (Throwable unused) {
                jSONObject = null;
            }
            this.f240425a.mo109647a(this.f240426b, this.f240427c.mo115113n("ok", jSONObject));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.TextStatus.JsApiOpenTextStateMessage", "invoke JsApiOpenTextStateMessage! " + jSONObject);
        if ((fVar != null ? fVar.getContext() : null) != null) {
            OpenTextStateRequest openTextStateRequest = new OpenTextStateRequest();
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            openTextStateRequest.f240423d = optJSONObject != null ? optJSONObject.toString() : null;
            C81956c.m100675c(fVar.getContext(), openTextStateRequest, new C81991b(fVar, i, this), (Intent) null);
        }
    }
}
