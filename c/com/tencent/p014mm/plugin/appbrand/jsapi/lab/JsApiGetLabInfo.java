package com.tencent.p014mm.plugin.appbrand.jsapi.lab;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import java.util.HashMap;
import na3.C88908g;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo */
public class JsApiGetLabInfo extends C82268c {
    public static final int CTRL_INDEX = 557;
    public static final String NAME = "getLabInfo";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$a */
    public class C82566a implements C1256g<GetLabInfoResult> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241671d;

        /* renamed from: e */
        public final /* synthetic */ int f241672e;

        public C82566a(C82381f fVar, int i) {
            this.f241671d = fVar;
            this.f241672e = i;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            GetLabInfoResult getLabInfoResult = (GetLabInfoResult) obj;
            if (getLabInfoResult != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("exist", Boolean.valueOf(getLabInfoResult.f241669d));
                hashMap.put("enabled", Boolean.valueOf(getLabInfoResult.f241670e));
                this.f241671d.mo109647a(this.f241672e, JsApiGetLabInfo.this.mo115112m("ok", hashMap));
                return;
            }
            this.f241671d.mo109647a(this.f241672e, JsApiGetLabInfo.this.mo115109j("fail"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$b */
    public static final class C82567b implements C80883e<IPCString, GetLabInfoResult> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C88908g gVar2 = (C88908g) C86312j.m106911c(C88908g.class);
            if (iPCString == null || Util.isNullOrNil(iPCString.f10315d) || gVar2 == null) {
                gVar.mo894a(null);
                return;
            }
            GetLabInfoResult getLabInfoResult = new GetLabInfoResult();
            getLabInfoResult.f241669d = gVar2.xl0(iPCString.f10315d);
            getLabInfoResult.f241670e = gVar2.mo123296x(iPCString.f10315d);
            gVar.mo894a(getLabInfoResult);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetLabInfo", "fail:data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        String optString = jSONObject.optString("labId");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiGetLabInfo", "fail:labId is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(optString), C82567b.class, new C82566a(fVar, i));
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$GetLabInfoResult */
    public static final class GetLabInfoResult implements Parcelable {
        public static final Parcelable.Creator<GetLabInfoResult> CREATOR = new C82565a();

        /* renamed from: d */
        public boolean f241669d = false;

        /* renamed from: e */
        public boolean f241670e = false;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$GetLabInfoResult$a */
        public class C82565a implements Parcelable.Creator<GetLabInfoResult> {
            public Object createFromParcel(Parcel parcel) {
                return new GetLabInfoResult(parcel);
            }

            public Object[] newArray(int i) {
                return new GetLabInfoResult[i];
            }
        }

        public GetLabInfoResult() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f241669d ? (byte) 1 : 0);
            parcel.writeByte(this.f241670e ? (byte) 1 : 0);
        }

        public GetLabInfoResult(Parcel parcel) {
            boolean z = false;
            this.f241669d = parcel.readByte() != 0;
            this.f241670e = parcel.readByte() != 0 ? true : z;
        }
    }
}
