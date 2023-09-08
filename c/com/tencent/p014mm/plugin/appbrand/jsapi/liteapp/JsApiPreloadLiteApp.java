package com.tencent.p014mm.plugin.appbrand.jsapi.liteapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiPreloadLiteApp */
public class JsApiPreloadLiteApp extends C82268c<C82381f> {
    public static final int CTRL_INDEX = -2;
    private static final String NAME = "preloadLiteApp";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiPreloadLiteApp$a */
    public class C1722a implements C1256g<IPCBoolean> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f11421d;

        /* renamed from: e */
        public final /* synthetic */ int f11422e;

        public C1722a(C82381f fVar, int i) {
            this.f11421d = fVar;
            this.f11422e = i;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            if (iPCBoolean == null) {
                Log.m105928w("MicroMsg.JsApiPreloadLiteApp", "Preload LiteApp fail");
            } else if (iPCBoolean.f10312d) {
                this.f11421d.mo109647a(this.f11422e, JsApiPreloadLiteApp.this.mo115109j("ok"));
            } else {
                this.f11421d.mo109647a(this.f11422e, JsApiPreloadLiteApp.this.mo115109j("fail"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiPreloadLiteApp$b */
    public static class C1723b implements C80883e<PreloadLiteAppData, IPCBoolean> {
        private C1723b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            PreloadLiteAppData preloadLiteAppData = (PreloadLiteAppData) obj;
            Log.m105926v("MicroMsg.JsApiPreloadLiteApp", "PreloadLiteApp in mm process");
            Boolean[] boolArr = {Boolean.TRUE};
            try {
                ((C14088e) C86312j.m106911c(C14088e.class)).fh0(preloadLiteAppData.f11419e, preloadLiteAppData.f11420f, preloadLiteAppData.f11418d.booleanValue() ? "updateBaseLibPath" : JsApiPreloadLiteApp.NAME);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiPreloadLiteApp", e, "jsApiPreloadLiteApp fail", new Object[0]);
                boolArr[0] = Boolean.FALSE;
            }
            gVar.mo894a(new IPCBoolean(boolArr[0].booleanValue()));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        String str2 = "";
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("invalid_data"));
            return;
        }
        Boolean bool = Boolean.FALSE;
        try {
            if (jSONObject.has("onlyPreLoadBaseLib")) {
                bool = Boolean.valueOf(jSONObject.getBoolean("onlyPreLoadBaseLib"));
            }
            if (bool.booleanValue()) {
                str = str2;
            } else if (!jSONObject.has("appId")) {
                fVar.mo109647a(i, mo115109j("invalid_appId"));
                return;
            } else {
                String string = jSONObject.getString("appId");
                if (jSONObject.has("page")) {
                    str2 = jSONObject.getString("page");
                }
                str = str2;
                str2 = string;
            }
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new PreloadLiteAppData(bool, str2, str), C1723b.class, new C1722a(fVar, i));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.JsApiPreloadLiteApp", e, str2, new Object[0]);
            fVar.mo109647a(i, mo115109j("fail"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiPreloadLiteApp$PreloadLiteAppData */
    public static class PreloadLiteAppData implements Parcelable {
        public static final Parcelable.Creator<PreloadLiteAppData> CREATOR = new C1721a();

        /* renamed from: d */
        public Boolean f11418d;

        /* renamed from: e */
        public String f11419e;

        /* renamed from: f */
        public String f11420f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiPreloadLiteApp$PreloadLiteAppData$a */
        public class C1721a implements Parcelable.Creator<PreloadLiteAppData> {
            public Object createFromParcel(Parcel parcel) {
                return new PreloadLiteAppData(parcel);
            }

            public Object[] newArray(int i) {
                return new PreloadLiteAppData[i];
            }
        }

        public PreloadLiteAppData(Boolean bool, String str, String str2) {
            this.f11418d = bool;
            this.f11419e = str;
            this.f11420f = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f11418d.booleanValue() ? (byte) 1 : 0);
            parcel.writeString(this.f11419e);
            parcel.writeString(this.f11420f);
        }

        public PreloadLiteAppData(Parcel parcel) {
            this.f11418d = Boolean.FALSE;
            this.f11419e = "";
            this.f11420f = "";
            this.f11418d = Boolean.valueOf(parcel.readByte() != 0);
            this.f11419e = parcel.readString();
            this.f11420f = parcel.readString();
        }
    }
}
