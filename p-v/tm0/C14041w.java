package tm0;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;

/* renamed from: tm0.w */
public final class C14041w extends C87413o implements C32226l<Context, Boolean> {

    /* renamed from: d */
    public static final C14041w f39392d = new C14041w();

    public C14041w() {
        super(1);
    }

    public Object invoke(Object obj) {
        Context context = (Context) obj;
        C87412m.m108594g(context, "context");
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        boolean z = true;
        boolean z2 = false;
        if (Util.isIntentAvailable(context, intent, true)) {
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiOpenSystemSetting$Companion$openActions$2$2", "invoke", "(Landroid/content/Context;)Ljava/lang/Boolean;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiOpenSystemSetting$Companion$openActions$2$2", "invoke", "(Landroid/content/Context;)Ljava/lang/Boolean;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.JsApiOpenSystemSetting", e, "", new Object[0]);
                z = false;
            }
            z2 = z;
        }
        return Boolean.valueOf(z2);
    }
}
