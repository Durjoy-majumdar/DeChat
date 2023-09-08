package com.tencent.p014mm.plugin.scanner;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.scanner.model.C42904e0;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import ei3.C86522b;
import vl2.C37756o;
import vl2.C37762p;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.scanner.r */
public class C30387r extends C86301e implements C115670k {
    public String Gp0() {
        C71030z.vx0().zx0();
        return C71030z.vx0().Gp0();
    }

    public String L40(String str) {
        C71030z.vx0().zx0();
        C71030z vx02 = C71030z.vx0();
        return vx02.yx0() + String.format("%s_%d.%s", new Object[]{"capture", Long.valueOf(System.currentTimeMillis()), str});
    }

    /* renamed from: PT */
    public String mo57346PT(String str, String str2) {
        C71030z.vx0().zx0();
        C71030z vx02 = C71030z.vx0();
        return vx02.yx0() + String.format("%s_%s.%s", new Object[]{"tmp", str, str2});
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        Log.m105924i("MicroMsg.PluginScanner", "PluginScanner onAccountInitialized");
        boolean a = C37756o.m41529a();
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("ScanDebug");
        C37756o.f100006c = mmkv;
        boolean z = false;
        if (a) {
            if (mmkv != null ? mmkv.getBoolean("scan_debug_show_debug_view", false) : false) {
                z = true;
            }
        }
        C37756o.f100005b = z;
        C37756o.m41532f();
        C42904e0.f116171a.mo67102c(MMApplicationContext.getContext(), true);
        C30650a.m39147b(new C37762p(), "//scan");
    }

    /* renamed from: wM */
    public String mo57347wM(String str) {
        C71030z.vx0().zx0();
        C71030z vx02 = C71030z.vx0();
        return vx02.yx0() + String.format("%s_%d.%s", new Object[]{"tmp", Long.valueOf(System.currentTimeMillis()), str});
    }
}
