package com.tencent.p014mm.plugin.appbrand;

import bq0.C0366g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import java.util.HashSet;
import java.util.Set;
import sp0.C90280d;
import sp0.C90291h;
import sp0.C90302k;
import sp0.C90311n;

/* renamed from: com.tencent.mm.plugin.appbrand.q4 */
public final class C84081q4 {

    /* renamed from: a */
    public static C90311n.C90317f f245492a = new C84082a();

    /* renamed from: b */
    public static C90311n.C90317f f245493b = new C84083b();

    /* renamed from: c */
    public static C90291h.C90295d f245494c = new C84084c();

    /* renamed from: d */
    public static C90291h.C90295d f245495d = new C84085d();

    /* renamed from: e */
    public static C90280d.C90282b f245496e = new C84086e();

    /* renamed from: f */
    public static C90302k.C90305c f245497f = new C84087f();

    /* renamed from: com.tencent.mm.plugin.appbrand.q4$a */
    public class C84082a implements C90311n.C90317f {
        /* renamed from: a */
        public boolean mo116757a(String str) {
            return C84081q4.m103609b(1);
        }

        /* renamed from: x */
        public boolean mo116758x(String str) {
            boolean z;
            Set<String> set = C0366g.f960a;
            if (Util.isNullOrNil(str)) {
                z = true;
            } else {
                z = ((HashSet) C0366g.f960a).contains(MD5Util.getMD5String(str));
            }
            if (!z) {
                return C84081q4.m103608a(1);
            }
            Log.m105924i("MicroMsg.WcWssSwitchLogic", "isWcWssOpen : true for hardcode case");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q4$b */
    public class C84083b implements C90311n.C90317f {
        /* renamed from: a */
        public boolean mo116757a(String str) {
            return C84081q4.m103609b(1);
        }

        /* renamed from: x */
        public boolean mo116758x(String str) {
            return C84081q4.m103608a(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q4$c */
    public class C84084c implements C90291h.C90295d {
        /* renamed from: a */
        public boolean mo116759a(String str) {
            return C84081q4.m103609b(2);
        }

        /* renamed from: x */
        public boolean mo116760x(String str) {
            return C84081q4.m103608a(2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q4$d */
    public class C84085d implements C90291h.C90295d {
        /* renamed from: a */
        public boolean mo116759a(String str) {
            return true;
        }

        /* renamed from: x */
        public boolean mo116760x(String str) {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q4$e */
    public class C84086e implements C90280d.C90282b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q4$f */
    public class C84087f implements C90302k.C90305c {
    }

    /* renamed from: a */
    public static boolean m103608a(int i) {
        Boolean c = m103610c(i);
        if (c != null) {
            boolean booleanValue = c.booleanValue();
            Log.m105925i("MicroMsg.WcWssSwitchLogic", "isABTestOpen commandResult type:%d,flag: %b", Integer.valueOf(i), Boolean.valueOf(booleanValue));
            return booleanValue;
        }
        Log.m105925i("MicroMsg.WcWssSwitchLogic", "isABTestOpen type:%d,flag: %b", Integer.valueOf(i), Boolean.TRUE);
        return true;
    }

    /* renamed from: b */
    public static boolean m103609b(int i) {
        Boolean c = m103610c(i);
        if (c != null) {
            boolean booleanValue = c.booleanValue();
            Log.m105925i("MicroMsg.WcWssSwitchLogic", "isGameABTestOpen commandResult type:%d,flag: %b", Integer.valueOf(i), Boolean.valueOf(booleanValue));
            return booleanValue;
        }
        Log.m105925i("MicroMsg.WcWssSwitchLogic", "isGameABTestOpen type:%d,flag: %b", Integer.valueOf(i), Boolean.TRUE);
        return true;
    }

    /* renamed from: c */
    public static Boolean m103610c(int i) {
        if (i == 1) {
            String string = MMApplicationContext.getToolsProcesstPreference().getString("appbrandgame_open_wcwss", "");
            if (string != null && string.equalsIgnoreCase("wcwss")) {
                return Boolean.TRUE;
            }
            if (string == null || !string.equalsIgnoreCase("websocket")) {
                return null;
            }
            return Boolean.FALSE;
        } else if (i == 2) {
            String string2 = MMApplicationContext.getToolsProcesstPreference().getString("appbrandgame_open_cdnrequest", "");
            if (string2 != null && string2.equalsIgnoreCase("chromium")) {
                return Boolean.TRUE;
            }
            if (string2 == null || !string2.equalsIgnoreCase("request")) {
                return null;
            }
            return Boolean.FALSE;
        } else if (i == 3) {
            String string3 = MMApplicationContext.getToolsProcesstPreference().getString("appbrandgame_open_cronetdownload", "");
            if (string3 != null && string3.equalsIgnoreCase(WeChatBrands.Business.GROUP_OPEN)) {
                return Boolean.TRUE;
            }
            if (string3 == null || !string3.equalsIgnoreCase("close")) {
                return null;
            }
            return Boolean.FALSE;
        } else if (i != 5) {
            return null;
        } else {
            String string4 = MMApplicationContext.getToolsProcesstPreference().getString("appbrandgame_open_cronetupload", "");
            if (string4 != null && string4.equalsIgnoreCase(WeChatBrands.Business.GROUP_OPEN)) {
                return Boolean.TRUE;
            }
            if (string4 == null || !string4.equalsIgnoreCase("close")) {
                return null;
            }
            return Boolean.FALSE;
        }
    }
}
