package com.tencent.p014mm.plugin.appbrand.jsapi;

import c30.C26827e;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import org.json.JSONObject;
import p170ic.C87689c;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q5 */
public final class C1844q5 extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 1088;
    private static final String NAME = "recordOperateUserDataInWa";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q5$a */
    public static final class C1845a<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C1845a<InputType, ResultType> f11655d = new C1845a<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            Log.m105924i("MicroMsg.AppBrand.JsApiRecordOperateUserDataInWa", "ipc invoke. data:" + iPCString);
            try {
                C87689c.m109089b(new C26827e(iPCString.f10315d), C1775p5.f11532d);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.JsApiRecordOperateUserDataInWa", e, (String) null, new Object[0]);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String string;
        Log.m105924i("MicroMsg.AppBrand.JsApiRecordOperateUserDataInWa", "invoke data " + jSONObject);
        if (!(jSONObject == null || (string = jSONObject.getString("datalist")) == null)) {
            C15618a.m14627c(new IPCString(string), C1845a.f11655d, (C1256g) null, 4, (Object) null);
        }
        if (fVar != null) {
            fVar.mo109647a(i, mo115109j("ok"));
        }
    }
}
