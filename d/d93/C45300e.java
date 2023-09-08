package d93;

import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import sf0.C90188n0;
import te3.C48904bt1;

/* renamed from: d93.e */
public class C45300e {

    /* renamed from: a */
    public Map<String, C45301a> f122723a = new HashMap();

    /* renamed from: b */
    public JsapiPermissionWrapper f122724b;

    /* renamed from: c */
    public GeneralControlWrapper f122725c;

    /* renamed from: d */
    public final JsapiPermissionWrapper f122726d = new JsapiPermissionWrapper(2);

    /* renamed from: e */
    public final GeneralControlWrapper f122727e = GeneralControlWrapper.f121045f;

    /* renamed from: d93.e$a */
    public static class C45301a {

        /* renamed from: a */
        public JsapiPermissionWrapper f122728a;

        /* renamed from: b */
        public GeneralControlWrapper f122729b;

        public C45301a(JsapiPermissionWrapper jsapiPermissionWrapper, GeneralControlWrapper generalControlWrapper) {
            this.f122728a = jsapiPermissionWrapper;
            this.f122729b = generalControlWrapper;
        }

        public String toString() {
            return "Permission: jsPerm = " + this.f122728a + ", genCtrl = " + this.f122729b;
        }
    }

    public C45300e(JsapiPermissionWrapper jsapiPermissionWrapper, GeneralControlWrapper generalControlWrapper) {
        this.f122724b = jsapiPermissionWrapper;
        String str = C90188n0.f258945m;
        if (str == null || str.length() == 0) {
            Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
        } else {
            try {
                int i = Util.getInt(C90188n0.f258945m, 0);
                if (i < 0) {
                    Log.m105928w("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
                } else {
                    this.f122724b = new JsapiPermissionWrapper(i);
                    Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.f122724b);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + e.getMessage());
                this.f122724b = null;
            }
        }
        this.f122725c = generalControlWrapper;
        String str2 = C90188n0.f258946n;
        if (str2 == null || str2.length() == 0) {
            Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
        } else {
            try {
                int i2 = Util.getInt(C90188n0.f258946n, 0);
                Log.m105925i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, permission = %d", Integer.valueOf(i2));
                C48904bt1 bt12 = new C48904bt1();
                bt12.f131299d = i2;
                this.f122725c = new GeneralControlWrapper(bt12);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl fail, ex = %s", e2.getMessage());
                this.f122725c = null;
            }
            Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.f122725c);
        }
        Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", "hardcodeJsPerm = " + jsapiPermissionWrapper + ", hardcodeGenCtrl = " + generalControlWrapper);
    }

    /* renamed from: a */
    public final String mo70854a(String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    /* renamed from: b */
    public boolean mo70855b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.LuggageGetA8KeyPermission", "has fail, url is null");
            return false;
        }
        C45301a aVar = (C45301a) ((HashMap) this.f122723a).get(mo70854a(str));
        return (aVar == null || aVar.f122728a == this.f122726d || aVar.f122729b == this.f122727e) ? false : true;
    }

    /* renamed from: c */
    public void mo70856c(String str, JsapiPermissionWrapper jsapiPermissionWrapper, GeneralControlWrapper generalControlWrapper) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.LuggageGetA8KeyPermission", "update fail, url is null");
            return;
        }
        String a = mo70854a(str);
        if (jsapiPermissionWrapper == null) {
            jsapiPermissionWrapper = this.f122726d;
        }
        if (generalControlWrapper == null) {
            generalControlWrapper = this.f122727e;
        }
        Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", "edw update, jsPerm = " + jsapiPermissionWrapper + ", genCtrl = " + generalControlWrapper + ", url = " + a);
        ((HashMap) this.f122723a).put(a, new C45301a(jsapiPermissionWrapper, generalControlWrapper));
    }
}
