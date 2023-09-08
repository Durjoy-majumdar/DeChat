package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;
import p749xh.C66261f3;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.e0 */
public class C5903e0 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.e0$a */
    public class C5904a implements C1256g<IPCString> {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22135d;

        public C5904a(C5903e0 e0Var, C53096b.C53097a aVar) {
            this.f22135d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bitmap decodeFile;
            IPCString iPCString = (IPCString) obj;
            if (iPCString == null || Util.isNullOrNil(iPCString.f10315d)) {
                Log.m105920e("MicroMsg.JsApiGetLocalImgData", "path is null");
                this.f22135d.mo73778c("fail", (JSONObject) null);
                return;
            }
            try {
                String str = iPCString.f10315d;
                if (!(str == null || (decodeFile = BitmapUtil.decodeFile(str)) == null || decodeFile.isRecycled())) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    decodeFile.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    String encodeToString = Base64.encodeToString(byteArray, 0);
                    Log.m105925i("MicroMsg.JsApiGetLocalImgData", "rawData lenght = %d, base64 lenght = %d", Integer.valueOf(byteArray.length), Integer.valueOf(encodeToString.length()));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("localData", encodeToString);
                    this.f22135d.mo73780e(jSONObject);
                    decodeFile.recycle();
                    return;
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.JsApiGetLocalImgData", e.getMessage());
            }
            this.f22135d.mo73778c("fail", (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.e0$b */
    public static class C5905b implements C80883e<IPCString, IPCString> {
        private C5905b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = new IPCString();
            iPCString.f10315d = C43702g2.m47531d(((IPCString) obj).f10315d);
            gVar.mo894a(iPCString);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "getLocalImgData";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        String optString = aVar.f148190b.f129368c.optString(C66261f3.COL_LOCALID);
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiGetLocalImgData", "localId is nil");
            aVar.mo73778c("invaild_localid", (JSONObject) null);
            return;
        }
        IPCString iPCString = new IPCString();
        iPCString.f10315d = optString;
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, iPCString, C5905b.class, new C5904a(this, aVar));
    }
}
