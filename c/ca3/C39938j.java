package ca3;

import android.provider.Settings;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONException;
import org.json.JSONObject;
import we0.C53156a;

/* renamed from: ca3.j */
public final class C39938j implements C53156a.C38082b {

    /* renamed from: d */
    public final /* synthetic */ WebViewVideoEventHandler f107075d;

    /* renamed from: ca3.j$a */
    public /* synthetic */ class C39939a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f107076a;

        static {
            int[] iArr = new int[C53156a.C53157a.values().length];
            iArr[2] = 1;
            iArr[4] = 2;
            iArr[1] = 3;
            iArr[3] = 4;
            f107076a = iArr;
        }
    }

    public C39938j(WebViewVideoEventHandler webViewVideoEventHandler) {
        this.f107075d = webViewVideoEventHandler;
    }

    /* renamed from: a */
    public final void mo12953a(C53156a.C53157a aVar, C53156a.C53157a aVar2) {
        int i;
        WebViewVideoEventHandler webViewVideoEventHandler = this.f107075d;
        int i2 = aVar2 == null ? -1 : C39939a.f107076a[aVar2.ordinal()];
        if (i2 == 1) {
            i = 90;
        } else if (i2 == 2) {
            i = -90;
        } else if (i2 == 3) {
            i = 0;
        } else if (i2 == 4) {
            i = 180;
        } else {
            return;
        }
        webViewVideoEventHandler.f119761j = i;
        WebViewVideoEventHandler webViewVideoEventHandler2 = this.f107075d;
        int i3 = webViewVideoEventHandler2.f119761j;
        if (i3 != webViewVideoEventHandler2.f119762k) {
            webViewVideoEventHandler2.f119762k = i3;
            String str = webViewVideoEventHandler2.f119752a;
            Log.m105924i(str, "onOrientationsChange currentOrientation=" + this.f107075d.f119761j);
            try {
                JSONObject c = this.f107075d.mo68859c();
                c.put("newOrientation", this.f107075d.f119761j);
                WebViewVideoEventHandler webViewVideoEventHandler3 = this.f107075d;
                webViewVideoEventHandler3.getClass();
                int i4 = Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "accelerometer_rotation", 0);
                String str2 = webViewVideoEventHandler3.f119752a;
                Log.m105924i(str2, "accRotation=" + i4);
                c.put("sysLock", i4 == 0 ? 1 : 0);
                this.f107075d.mo68857a("onOrientationsChange", c);
            } catch (JSONException e) {
                Log.m105921e(this.f107075d.f119752a, "OnXWebVideoError fail", e);
            }
        }
    }
}
