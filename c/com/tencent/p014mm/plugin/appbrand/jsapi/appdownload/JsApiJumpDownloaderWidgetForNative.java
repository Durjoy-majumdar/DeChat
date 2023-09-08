package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative */
public class JsApiJumpDownloaderWidgetForNative extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 671;
    public static final String NAME = "jumpDownloaderWidgetForNative";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest */
    public static class JumpDownloadWidgetRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<JumpDownloadWidgetRequest> CREATOR = new C82020a();

        /* renamed from: d */
        public String f240487d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest$a */
        public class C82020a implements Parcelable.Creator<JumpDownloadWidgetRequest> {
            public Object createFromParcel(Parcel parcel) {
                return new JumpDownloadWidgetRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new JumpDownloadWidgetRequest[i];
            }
        }

        public JumpDownloadWidgetRequest() {
        }

        public int describeContents() {
            return 0;
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return C82021a.class;
        }

        public boolean oneShotForeground() {
            return true;
        }

        public void readParcel(Parcel parcel) {
            this.f240487d = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240487d);
        }

        public JumpDownloadWidgetRequest(Parcel parcel) {
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative$a */
    public static class C82021a extends AppBrandProxyUIProcessTask {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative$a$a */
        public class C82022a implements C45544c {
            public C82022a() {
            }

            /* renamed from: a */
            public void mo5407a() {
                C82021a.this.finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
            }
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            String str = processRequest != null ? ((JumpDownloadWidgetRequest) processRequest).f240487d : null;
            Intent intent = new Intent();
            intent.putExtra("appId", str);
            intent.putExtra("view_task", true);
            ((C45547h) C86312j.m106911c(C45547h.class)).p30(getActivityContext(), intent, new C82022a());
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        String optString = jSONObject.optString("appId");
        JumpDownloadWidgetRequest jumpDownloadWidgetRequest = new JumpDownloadWidgetRequest();
        jumpDownloadWidgetRequest.f240487d = optString;
        C81956c.m100675c(i2Var.mo114344o0(), jumpDownloadWidgetRequest, new C82027o(this, i2Var, i), (Intent) null);
    }
}
