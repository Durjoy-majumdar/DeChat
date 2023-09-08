package com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29445x;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81556c;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import js0.C88024r;
import kr0.C88267e;
import org.json.JSONObject;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch */
public class JsApiTriggerBackgroundFetch extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 685;
    public static final String NAME = "triggerBackgroundFetch";

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$a */
    public static class C1632a implements C1255d<TriggerBackgroundFetchParcel, IPCString> {
        private C1632a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            String str;
            AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel;
            TriggerBackgroundFetchParcel triggerBackgroundFetchParcel = (TriggerBackgroundFetchParcel) obj;
            String str2 = triggerBackgroundFetchParcel.f11251e;
            String str3 = triggerBackgroundFetchParcel.f11250d;
            Class cls = C29445x.class;
            Log.m105925i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "forcePeriodFetchData, userName:%s, appId:%s", str2, str3);
            if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "forcePeriodFetchData, not wifi network");
                str = "fail:not wifi network";
            } else if (C86312j.m106911c(cls) == null || ((appBrandBackgroundFetchDataTokenParcel = ((C29445x) C86312j.m106911c(cls)).get(str2)) != null && !Util.isNullOrNil(appBrandBackgroundFetchDataTokenParcel.f80235e))) {
                C88024r.m109571a().postToWorker(new C81556c(str2, str3));
                str = "ok";
            } else {
                Log.m105929w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "forcePeriodFetchData, app(%s) token is empty", str2);
                str = "fail:token not set";
            }
            if (gVar != null) {
                gVar.mo894a(new IPCString(str));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        AppBrandInitConfigWC M1 = eVar.getRuntime().mo113210l1();
        String str = M1.f239362d;
        String str2 = M1.f234839s;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            eVar.mo109647a(i, mo115109j("fail"));
        } else {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new TriggerBackgroundFetchParcel(str, str2), C1632a.class, new C1636b(this, eVar, i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel */
    public static class TriggerBackgroundFetchParcel implements Parcelable {
        public static final Parcelable.Creator<TriggerBackgroundFetchParcel> CREATOR = new C1631a();

        /* renamed from: d */
        public String f11250d;

        /* renamed from: e */
        public String f11251e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.JsApiTriggerBackgroundFetch$TriggerBackgroundFetchParcel$a */
        public class C1631a implements Parcelable.Creator<TriggerBackgroundFetchParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new TriggerBackgroundFetchParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new TriggerBackgroundFetchParcel[i];
            }
        }

        public TriggerBackgroundFetchParcel(String str, String str2) {
            this.f11250d = str;
            this.f11251e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11250d);
            parcel.writeString(this.f11251e);
        }

        public TriggerBackgroundFetchParcel(Parcel parcel) {
            this.f11250d = parcel.readString();
            this.f11251e = parcel.readString();
        }
    }
}
