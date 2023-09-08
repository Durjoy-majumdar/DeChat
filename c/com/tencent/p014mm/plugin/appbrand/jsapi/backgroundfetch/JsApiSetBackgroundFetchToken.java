package com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29445x;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import org.json.JSONObject;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken */
public class JsApiSetBackgroundFetchToken extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 641;
    public static final String NAME = "setBackgroundFetchToken";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$a */
    public class C29505a implements C1256g<IPCBoolean> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f80380d;

        /* renamed from: e */
        public final /* synthetic */ int f80381e;

        public C29505a(C82381f fVar, int i) {
            this.f80380d = fVar;
            this.f80381e = i;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            if (iPCBoolean == null || !iPCBoolean.f10312d) {
                Log.m105924i("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "setBackgroundFetchToken fail");
                this.f80380d.mo109647a(this.f80381e, JsApiSetBackgroundFetchToken.this.mo115109j("fail"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "setBackgroundFetchToken success");
            this.f80380d.mo109647a(this.f80381e, JsApiSetBackgroundFetchToken.this.mo115109j("ok"));
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$b */
    public static class C29506b implements C1255d<SetBackgroundFetchTokenParcel, IPCBoolean> {
        private C29506b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            SetBackgroundFetchTokenParcel setBackgroundFetchTokenParcel = (SetBackgroundFetchTokenParcel) obj;
            Class cls = C29445x.class;
            if (setBackgroundFetchTokenParcel != null && !Util.isNullOrNil(setBackgroundFetchTokenParcel.f80378d) && !Util.isNullOrNil(setBackgroundFetchTokenParcel.f80379e)) {
                String f = C81661j.m100181f(setBackgroundFetchTokenParcel.f80378d);
                if (!Util.isNullOrNil(f) && C86312j.m106911c(cls) != null) {
                    ((C29445x) C86312j.m106911c(cls)).mo56688B9(f, setBackgroundFetchTokenParcel.f80379e);
                    gVar.mo894a(new IPCBoolean(true));
                    return;
                }
            }
            gVar.mo894a(new IPCBoolean(false));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "fail:data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        String optString = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "fail:token is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else if (optString.length() > 1024) {
            Log.m105920e("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "fail:token is too long");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new SetBackgroundFetchTokenParcel(fVar.getAppId(), optString), C29506b.class, new C29505a(fVar, i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel */
    public static class SetBackgroundFetchTokenParcel implements Parcelable {
        public static final Parcelable.Creator<SetBackgroundFetchTokenParcel> CREATOR = new C29504a();

        /* renamed from: d */
        public String f80378d;

        /* renamed from: e */
        public String f80379e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiSetBackgroundFetchToken$SetBackgroundFetchTokenParcel$a */
        public class C29504a implements Parcelable.Creator<SetBackgroundFetchTokenParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new SetBackgroundFetchTokenParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new SetBackgroundFetchTokenParcel[i];
            }
        }

        public SetBackgroundFetchTokenParcel(String str, String str2) {
            this.f80378d = str;
            this.f80379e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f80378d);
            parcel.writeString(this.f80379e);
        }

        public SetBackgroundFetchTokenParcel(Parcel parcel) {
            this.f80378d = parcel.readString();
            this.f80379e = parcel.readString();
        }
    }
}
