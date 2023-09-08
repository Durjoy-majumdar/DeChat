package tm0;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: tm0.j */
public class C14027j extends C82268c {
    public static final int CTRL_INDEX = 169;
    public static final String NAME = "getClipboardData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        ClipboardManager clipboardManager = (ClipboardManager) MMApplicationContext.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            Log.m105924i("MicroMsg.JsApiGetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
            fVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            String str = "";
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt.getText() != null) {
                    str = itemAt.getText().toString();
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("data", str);
            fVar.mo109647a(i, mo115112m("ok", hashMap));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiGetClipboardData", "invoke with appId:%s, but get Exception:%s", fVar.getAppId(), e);
        }
    }
}
