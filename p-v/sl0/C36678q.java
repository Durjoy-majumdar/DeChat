package sl0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p1058wb.C90915h;

/* renamed from: sl0.q */
public class C36678q implements C90915h {
    /* renamed from: Wv */
    public boolean mo60802Wv() {
        String string = MMApplicationContext.getToolsProcesstPreference().getString("appbrandgame_open_nativelibuv", "");
        if (!((string == null || !string.equalsIgnoreCase("close")) ? Boolean.FALSE : Boolean.TRUE).booleanValue()) {
            return true;
        }
        Log.m105924i("MicroMsg.AppBrand.NativeInstallHelperSwitchDelegateImpl", "use libuv Command close");
        return false;
    }
}
