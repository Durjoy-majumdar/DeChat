package sl0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;
import p1058wb.C90928k;

/* renamed from: sl0.r */
public class C36679r implements C90928k.C90938h {
    public boolean isOpen() {
        String string = MMApplicationContext.getToolsProcesstPreference().getString("appbrandgame_open_nativewss", "");
        if (!((string == null || !string.equalsIgnoreCase("close")) ? Boolean.FALSE : Boolean.TRUE).booleanValue()) {
            return true;
        }
        Log.m105924i("MicroMsg.AppBrand.WcWssNativeSwitchDelegateImpl", "createWcWssBinding Command close");
        return false;
    }

    public boolean tf0() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_wcwss_binding_close_when_suspend, 1) > 0;
    }
}
