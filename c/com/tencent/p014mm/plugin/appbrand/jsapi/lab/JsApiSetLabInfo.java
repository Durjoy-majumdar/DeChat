package com.tencent.p014mm.plugin.appbrand.jsapi.lab;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import na3.C88908g;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo */
public class JsApiSetLabInfo extends C82268c {
    public static final int CTRL_INDEX = 558;
    public static final String NAME = "setLabInfo";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$IPCSetLabInfoRequest */
    public static final class IPCSetLabInfoRequest implements Parcelable {
        public static final Parcelable.Creator<IPCSetLabInfoRequest> CREATOR = new C82568a();

        /* renamed from: d */
        public String f241674d;

        /* renamed from: e */
        public boolean f241675e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$IPCSetLabInfoRequest$a */
        public class C82568a implements Parcelable.Creator<IPCSetLabInfoRequest> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCSetLabInfoRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCSetLabInfoRequest[i];
            }
        }

        public IPCSetLabInfoRequest() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f241674d);
            parcel.writeByte(this.f241675e ? (byte) 1 : 0);
        }

        public IPCSetLabInfoRequest(String str, boolean z) {
            this.f241674d = str;
            this.f241675e = z;
        }

        public IPCSetLabInfoRequest(Parcel parcel) {
            this.f241674d = parcel.readString();
            this.f241675e = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$a */
    public class C82569a implements C1256g<IPCBoolean> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241676d;

        /* renamed from: e */
        public final /* synthetic */ int f241677e;

        public C82569a(C82381f fVar, int i) {
            this.f241676d = fVar;
            this.f241677e = i;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            if (iPCBoolean == null || !iPCBoolean.f10312d) {
                this.f241676d.mo109647a(this.f241677e, JsApiSetLabInfo.this.mo115109j("fail"));
            } else {
                this.f241676d.mo109647a(this.f241677e, JsApiSetLabInfo.this.mo115109j("ok"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$b */
    public static final class C82570b implements C80883e<IPCSetLabInfoRequest, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            IPCSetLabInfoRequest iPCSetLabInfoRequest = (IPCSetLabInfoRequest) obj;
            C88908g gVar2 = (C88908g) C86312j.m106911c(C88908g.class);
            if (iPCSetLabInfoRequest == null || Util.isNullOrNil(iPCSetLabInfoRequest.f241674d) || gVar2 == null) {
                gVar.mo894a(null);
            } else if (!gVar2.xl0(iPCSetLabInfoRequest.f241674d)) {
                gVar.mo894a(new IPCBoolean(false));
            } else {
                gVar2.o20(iPCSetLabInfoRequest.f241674d, iPCSetLabInfoRequest.f241675e);
                gVar.mo894a(new IPCBoolean(true));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetLabInfo", "fail:data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        String optString = jSONObject.optString("labId");
        if (Util.isNullOrNil(optString) || !jSONObject.has("enabled")) {
            Log.m105920e("MicroMsg.JsApiSetLabInfo", "fail:labId is null or no enabled");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCSetLabInfoRequest(optString, jSONObject.optBoolean("enabled")), C82570b.class, new C82569a(fVar, i));
    }
}
