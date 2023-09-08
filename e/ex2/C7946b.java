package ex2;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dx2.C31343d;
import dx2.C7533g;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import ke3.C88144b;
import o40.C61926c;
import sx3.C110821n;
import sx3.C110823p;
import yc3.C38992a;
import z04.C112550d0;

/* renamed from: ex2.b */
public final class C7946b implements C38992a {

    /* renamed from: a */
    public static final C7947a f26633a = new C7947a((C8480h) null);

    /* renamed from: ex2.b$a */
    public static final class C7947a {
        public C7947a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m8103a(C7947a aVar, String str) {
            aVar.getClass();
            if (Log.getLogLevel() == 0 && WeChatEnvironment.hasDebugger()) {
                C61926c.m72668M(new C7945a(str));
            }
            Log.m105924i("MicroMsg.SurfaceApp.SurfaceProcessorCommand", str);
        }
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(strArr, "args");
        C87412m.m108594g(str, "username");
        C7947a aVar = f26633a;
        boolean z = false;
        String str2 = "";
        if (!C87412m.m108589b(strArr.length > 0 ? strArr[0] : str2, "//surface")) {
            return false;
        }
        String str3 = strArr.length > 1 ? strArr[1] : str2;
        if (C87412m.m108589b(str3, "ui")) {
            Intent intent = new Intent();
            if (strArr.length > 2) {
                intent.putStringArrayListExtra("appIds", (ArrayList) C110823p.m151003c0(C110821n.m150967n(strArr, 2, strArr.length)));
            }
            C88144b.m109791i(context, "surface", ".test.TestUI", intent, (Bundle) null);
        } else if (C87412m.m108589b(str3, "downloadPkg")) {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_magic_livecard_mb2, 1) == 1) {
                z = true;
            }
            if (z) {
                C7533g.f25793a.mo8658a("wx2f3fb5db9f226462");
                C31343d.f83890a.mo58076a("wxe208ce76dfa39515");
            } else {
                C7533g.f25793a.mo8658a("wx4edd479d258d7f25");
                C31343d.f83890a.mo58076a("wx9e221f7828fa7482");
            }
        } else if (C87412m.m108589b(str3, "clearpkg")) {
            if (C86013q1.m106446g(C112760b.m154195C() + "surface/", true)) {
                String string = MMApplicationContext.getContext().getString(C0966R.string.ml9);
                C87412m.m108593f(string, "getContext().getString(R…r_biz_canvas_pkg_success)");
                C7947a.m8103a(aVar, string);
            } else {
                String string2 = MMApplicationContext.getContext().getString(C0966R.string.ml8);
                C87412m.m108593f(string2, "getContext().getString(R…lear_biz_canvas_pkg_fail)");
                C7947a.m8103a(aVar, string2);
            }
        } else {
            if (!(C112550d0.m153801u("mainProcess", str3, false) ? true : C87412m.m108589b(str3, "preloadPs") ? true : C87412m.m108589b(str3, "mainScriptParallel"))) {
                return false;
            }
            if (strArr.length > 2) {
                boolean z2 = Util.getBoolean(strArr[2], false);
                if (strArr.length > 1) {
                    str2 = strArr[1];
                }
                C87412m.m108594g(str2, "command");
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MagicBrushDebugStorage");
                mmkv.putBoolean("MagicBrushTestSwitch_" + str2, z2);
            }
        }
        return true;
    }
}
