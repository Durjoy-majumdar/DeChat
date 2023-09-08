package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bp3.C28361q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.DebuggerShell */
public final class DebuggerShell extends BroadcastReceiver {

    /* renamed from: b */
    public static final C28361q<DebuggerShell> f239770b = new C81693a();

    /* renamed from: c */
    public static boolean f239771c = true;

    /* renamed from: d */
    public static boolean f239772d;

    /* renamed from: a */
    public final Map<String, C81694b> f239773a = new HashMap();

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.DebuggerShell$a */
    public class C81693a extends C28361q<DebuggerShell> {
        public Object create() {
            return new DebuggerShell();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.DebuggerShell$b */
    public interface C81694b {
        /* renamed from: a */
        void mo56728a(Intent intent);

        String name();
    }

    static {
        m100245a();
    }

    /* renamed from: a */
    public static void m100245a() {
        f239772d = false;
        Log.m105919d("MicroMsg.DebuggerShell", "<clinit> BuildConfig.ENABLE_APPBRAND_MONKEY_TEST=%b", false);
        if (!f239772d && (BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger())) {
            boolean z = MultiProcessMMKV.getMMKV("ENABLE_APPBRAND_DEBUGGER").getBoolean("ENABLE_APPBRAND_DEBUGGER", false);
            f239772d = z;
            Log.m105919d("MicroMsg.DebuggerShell", "<clinit> ENABLE_MONKEY from mmkv = %b", Boolean.valueOf(z));
        }
        if (f239772d) {
            f239771c = MultiProcessMMKV.getMMKV("ENABLE_APPBRAND_DEBUGGER").getBoolean("KEY_SKIP_APPBRAND_PROCESS_SUICIDE", true);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("action");
        if (!Util.isNullOrNil(stringExtra) && ((HashMap) this.f239773a).containsKey(stringExtra)) {
            ((C81694b) ((HashMap) this.f239773a).get(stringExtra)).mo56728a(intent);
        }
    }
}
