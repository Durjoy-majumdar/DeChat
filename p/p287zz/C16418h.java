package p287zz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C74928u;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: zz.h */
public final /* synthetic */ class C16418h {
    /* renamed from: a */
    public static String m15245a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EnterScene", i);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static void m15246b(Context context, String str, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z);
        intent.putExtra(C74928u.C45093i.f122326r, true);
        intent.putExtra("allow_mix_content_mode", false);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
