package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e2 */
public final class C1671e2 extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 983;
    private static final String NAME = "checkStrangerContactListIsFriend";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/e2$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e2$a */
    public static final class C1672a implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            JSONObject jSONObject;
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(gVar, "callback");
            Bundle bundle2 = new Bundle();
            if (bundle == null) {
                Log.m105924i("MicroMsg.IPCCheckStrangerRequest", "data is null");
                bundle2.putString("resJo", "fail:IPCCheckStrangerRequest data is null");
                gVar.mo894a(bundle2);
            } else if (!C86709a0.m107523b().mo121115m()) {
                Log.m105920e("MicroMsg.IPCCheckStrangerRequest", "handleRequest, MMKernel.account().hasLogin() is false");
            } else {
                try {
                    jSONObject = new JSONObject(bundle.getString(FFmpegMetadataRetriever.METADATA_KEY_DATE));
                } catch (Throwable unused) {
                    jSONObject = null;
                }
                C61926c.m72657B("MicroMsg.IPCCheckStrangerRequest", true, new C1669d2(jSONObject, bundle2, gVar));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e2$b */
    public static final class C1673b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C82381f f11346d;

        /* renamed from: e */
        public final /* synthetic */ int f11347e;

        /* renamed from: f */
        public final /* synthetic */ C1671e2 f11348f;

        public C1673b(C82381f fVar, int i, C1671e2 e2Var) {
            this.f11346d = fVar;
            this.f11347e = i;
            this.f11348f = e2Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            JSONObject jSONObject;
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                try {
                    jSONObject = new JSONObject(bundle.getString("resJo", ""));
                } catch (Throwable unused) {
                    jSONObject = null;
                }
                Log.m105925i("MicroMsg.JsApiCheckStrangerIsFriend", "onCallback，result ：%s", jSONObject);
                this.f11346d.mo109647a(this.f11347e, this.f11348f.mo115113n("ok", jSONObject));
                return;
            }
            Log.m105924i("MicroMsg.JsApiCheckStrangerIsFriend", "onCallback，data == null");
            this.f11346d.mo109647a(this.f11347e, this.f11348f.mo115109j("fail data == null "));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.JsApiCheckStrangerIsFriend", "invoke JsApiCheckStrangerIsFriend! " + jSONObject);
        String str = null;
        if ((fVar != null ? fVar.getContext() : null) != null) {
            Bundle bundle = new Bundle();
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                str = optJSONObject.toString();
            }
            bundle.putString(FFmpegMetadataRetriever.METADATA_KEY_DATE, str);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C1672a.class, new C1673b(fVar, i, this));
        }
    }
}
