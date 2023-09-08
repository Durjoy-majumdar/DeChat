package com.tencent.p014mm.plugin.performance.diagnostic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import be2.C79693c;
import ce2.C28546c;
import com.tencent.matrix.hook.C80379a;
import com.tencent.matrix.hook.HookManager;
import com.tencent.matrix.hook.pthread.PthreadHook;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.expansions.C85178q;
import com.tencent.p014mm.plugin.performance.diagnostic.C30338e;
import com.tencent.p014mm.plugin.performance.diagnostic.C85311d.C85313b;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.file.XVFSFile;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kj2.C117407d;
import org.xwalk.core.XWalkEnvironment;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.diagnostic.d */
public abstract class C85311d<HOOK extends C80379a, CONFIG extends C85313b> implements C28546c, ICrashReporter.ICrashReportExtraMessageGetter, C30338e.C30339a {

    /* renamed from: e */
    public static String f248517e = "MicroMsg.BaseHookLogic";

    /* renamed from: f */
    public static C85314c f248518f = null;

    /* renamed from: d */
    public final C85315d f248519d = new C85315d(this);

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.d$a */
    public class C85312a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f248520d;

        /* renamed from: e */
        public final /* synthetic */ String f248521e;

        public C85312a(long j, String str) {
            this.f248520d = j;
            this.f248521e = str;
        }

        public void run() {
            if (C85311d.this.mo118533g().mo118547e()) {
                C85311d.this.mo118541p(false);
                ((C119157j) C119157j.f356862d).mo183879j(this, this.f248520d, this.f248521e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.d$b */
    public static abstract class C85313b {

        /* renamed from: a */
        public MultiProcessMMKV f248523a = MultiProcessMMKV.getMMKV("diagnostic_storage");

        /* renamed from: b */
        public final String f248524b;

        /* renamed from: c */
        public final String f248525c;

        /* renamed from: d */
        public final String f248526d;

        /* renamed from: e */
        public final String f248527e;

        /* renamed from: f */
        public final String f248528f;

        /* renamed from: g */
        public final String f248529g;

        /* renamed from: h */
        public final String f248530h;

        /* renamed from: i */
        public final String f248531i;

        /* renamed from: j */
        public final String f248532j;

        /* renamed from: k */
        public final String f248533k;

        public C85313b(C85311d<? extends C80379a, ? extends C85313b> dVar) {
            this.f248533k = dVar.mo118534h();
            this.f248524b = dVar.mo56049b() + ".$source";
            this.f248525c = dVar.mo56049b() + ".$enable";
            this.f248526d = dVar.mo56049b() + ".$duration";
            this.f248527e = dVar.mo56049b() + ".begin";
            this.f248528f = dVar.mo56049b() + ".$multiprocess";
            this.f248529g = dVar.mo56049b() + ".$process";
            this.f248530h = dVar.mo56049b() + ".clientversion";
            this.f248531i = dVar.mo56049b() + ".crash";
            this.f248532j = dVar.mo56049b() + ".$dumpcycle";
        }

        /* renamed from: a */
        public void mo118543a(Map<String, String> map) {
            Log.m105924i(C85311d.f248517e, "convert and save config");
            MultiProcessMMKV multiProcessMMKV = this.f248523a;
            String str = this.f248525c;
            multiProcessMMKV.encode(str, "1".equals(map.get(str)));
            MultiProcessMMKV multiProcessMMKV2 = this.f248523a;
            String str2 = this.f248526d;
            multiProcessMMKV2.encode(str2, Util.getInt(map.get(str2), 0));
            this.f248523a.encode(this.f248527e, System.currentTimeMillis());
            MultiProcessMMKV multiProcessMMKV3 = this.f248523a;
            String str3 = this.f248528f;
            multiProcessMMKV3.encode(str3, "1".equals(map.get(str3)));
            MultiProcessMMKV multiProcessMMKV4 = this.f248523a;
            String str4 = this.f248529g;
            multiProcessMMKV4.encode(str4, map.get(str4));
            this.f248523a.encode(this.f248530h, BuildInfo.CLIENT_VERSION_INT);
        }

        /* renamed from: b */
        public boolean mo118544b() {
            boolean decodeBool = this.f248523a.decodeBool(this.f248528f, false);
            String d = mo118546d();
            Log.m105925i(C85311d.f248517e, "[%s] filterProcess: target process is %s, current process is %s", this.f248533k, d, MMApplicationContext.getProcessName());
            if (d.contains("all") || (TextUtils.isEmpty(d) && decodeBool)) {
                return true;
            }
            if ((d.contains(XWalkEnvironment.MODULE_MM) || TextUtils.isEmpty(d)) && MMApplicationContext.isMainProcess()) {
                return true;
            }
            if (!d.contains(XWalkEnvironment.MODULE_APPBRAND) || !MMApplicationContext.isAppBrandProcess()) {
                return d.contains(XWalkEnvironment.MODULE_TOOLS) && MMApplicationContext.isToolsProcess();
            }
            return true;
        }

        /* renamed from: c */
        public long mo118545c() {
            return TimeUnit.MINUTES.toMillis(this.f248523a.decodeLong(this.f248532j, 30));
        }

        /* renamed from: d */
        public String mo118546d() {
            return this.f248523a.decodeString(this.f248529g, "");
        }

        /* renamed from: e */
        public boolean mo118547e() {
            return this.f248523a.decodeBool(this.f248525c, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.d$c */
    public interface C85314c {
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.d$d */
    public static class C85315d extends BroadcastReceiver {

        /* renamed from: a */
        public final String f248534a;

        /* renamed from: b */
        public boolean f248535b;

        /* renamed from: c */
        public final C85311d<? extends C80379a, ? extends C85313b> f248536c;

        /* renamed from: d */
        public long f248537d;

        /* renamed from: com.tencent.mm.plugin.performance.diagnostic.d$d$a */
        public class C85316a implements Runnable {
            public C85316a() {
            }

            public void run() {
                Log.m105919d(C85311d.f248517e, "[%s] report async", C85315d.this.f248536c.mo118534h());
                C85315d.this.f248536c.mo118541p(false);
                Log.m105919d(C85311d.f248517e, "[%s] report done.", C85315d.this.f248536c.mo118534h());
            }
        }

        public C85315d(C85311d<? extends C80379a, ? extends C85313b> dVar) {
            this.f248536c = dVar;
            this.f248534a = "com.tencent.mm.report." + dVar.mo118534h();
        }

        /* renamed from: a */
        public synchronized void mo118548a() {
            if (!this.f248535b) {
                MMApplicationContext.getContext().registerReceiver(this, new IntentFilter(this.f248534a), ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION, (Handler) null);
                this.f248535b = true;
                Log.m105925i(C85311d.f248517e, "register Reporter for [%s]", this.f248536c.mo118534h());
            }
        }

        public void onReceive(Context context, Intent intent) {
            long longExtra = intent.getLongExtra("PARAM_KEY_TOKEN", 0);
            String action = intent.getAction();
            Log.m105925i(C85311d.f248517e, "[%s] received token [%s], action [%s]", this.f248536c.mo118534h(), Long.valueOf(longExtra), action);
            if (longExtra == 0) {
                Log.m105921e(C85311d.f248517e, "[%s] ERR: report token should not be 0", this.f248536c.mo118534h());
            } else if (longExtra <= this.f248537d) {
                Log.m105925i(C85311d.f248517e, "[%s] already reported, xfer to next process, token [%s]", this.f248536c.mo118534h(), Long.valueOf(longExtra));
            } else {
                this.f248537d = longExtra;
                ((C119157j) C119157j.f356862d).mo183876g(new C85316a(), "HookReporter");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.d$e */
    public enum C85317e {
        PUSH,
        AUTO,
        EXPT
    }

    static {
        f248517e += m105270m();
    }

    public C85311d() {
        C30338e.f81885e.mo57287a(mo118534h(), this);
        CrashReportFactory.addCrashReportExtraMessageGetter(this);
    }

    /* renamed from: m */
    public static String m105270m() {
        String processName = MMApplicationContext.getProcessName();
        if (MMApplicationContext.isMainProcess()) {
            return "_MM_";
        }
        if (MMApplicationContext.isToolsProcess()) {
            return "_tools_";
        }
        if (processName.contains(":appbrand0")) {
            return "_appbrand0_";
        }
        if (processName.contains(":appbrand1")) {
            return "_appbrand1_";
        }
        if (processName.contains(":appbrand2")) {
            return "_appbrand2_";
        }
        if (processName.contains(":appbrand3")) {
            return "_appbrand3_";
        }
        if (processName.contains(":appbrand4")) {
            return "_appbrand4_";
        }
        String[] split = processName.split(XVFSFile.PATH_SEPARATOR);
        if (split == null || split.length < 2) {
            return "_others_";
        }
        return "_" + split[1] + "_";
    }

    /* renamed from: q */
    public static void m105271q(C80379a... aVarArr) {
        HookManager hookManager = HookManager.f235267e;
        boolean z = true;
        for (C80379a aVar : aVarArr) {
            if (aVar != null) {
                z = false;
            }
            hookManager.mo111829a(aVar);
        }
        if (!z) {
            C85314c cVar = f248518f;
            if (cVar != null) {
                try {
                    C115654a.m162678b(true);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.BacktraceLogic", th, "", new Object[0]);
                }
            }
            hookManager.mo111830b();
            if (cVar != null && C115654a.f346918c) {
                PthreadHook.f235303h.mo111844e(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo57288a() {
        if (mo118533g().mo118547e()) {
            C85315d dVar = this.f248519d;
            dVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105919d(f248517e, "[%s] report token: %s", dVar.f248536c.mo118534h(), Long.valueOf(currentTimeMillis));
            Intent intent = new Intent(dVar.f248534a);
            intent.putExtra("PARAM_KEY_TOKEN", currentTimeMillis);
            MMApplicationContext.getContext().sendBroadcast(intent, ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION);
        }
    }

    /* renamed from: b */
    public final String mo56049b() {
        return ".cmd.diagnostic." + mo118534h();
    }

    /* renamed from: c */
    public final void mo56050c(Map<String, String> map) {
        Log.m105921e(f248517e, "[%s] onReceiveCmd", mo118534h());
        String str = map.get(mo118533g().f248524b);
        if (TextUtils.isEmpty(str) || "PUSH".equalsIgnoreCase(str)) {
            mo118537k(map, C85317e.PUSH);
            return;
        }
        if (!mo118533g().mo118547e()) {
            C85317e eVar = C85317e.AUTO;
            if ("AUTO".equalsIgnoreCase(str)) {
                mo118538l(map, eVar);
                return;
            }
        }
        if (!mo118533g().mo118547e()) {
            C85317e eVar2 = C85317e.EXPT;
            if ("EXPT".equalsIgnoreCase(str)) {
                mo118538l(map, eVar2);
            }
        }
    }

    /* renamed from: d */
    public void mo56051d() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0105  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final HOOK mo118531e() {
        /*
            r13 = this;
            java.lang.String r0 = f248517e
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r13.mo118534h()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "[%s] boot"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            boolean r0 = r13.mo118532f()
            r2 = 2
            if (r0 == 0) goto L_0x00f8
            com.tencent.mm.plugin.performance.diagnostic.d$b r0 = r13.mo118533g()
            boolean r0 = r0.mo118547e()
            if (r0 == 0) goto L_0x00f8
            com.tencent.mm.plugin.performance.diagnostic.d$b r0 = r13.mo118533g()
            boolean r0 = r0.mo118544b()
            if (r0 == 0) goto L_0x00f8
            com.tencent.mm.plugin.performance.diagnostic.d$b r0 = r13.mo118533g()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r0.f248523a
            java.lang.String r0 = r0.f248526d
            int r0 = r3.decodeInt(r0, r4)
            long r5 = (long) r0
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 * r7
            com.tencent.mm.plugin.performance.diagnostic.d$b r0 = r13.mo118533g()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r0.f248523a
            java.lang.String r0 = r0.f248527e
            r7 = 0
            long r9 = r3.decodeLong(r0, r7)
            java.lang.String r0 = f248517e
            r3 = 3
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r12 = r13.mo118534h()
            r11[r4] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            r11[r1] = r12
            java.lang.String r12 = be2.C79693c.m96812f(r9)
            r11[r2] = r12
            java.lang.String r12 = "[%s] hook duration = %s, hook begin time = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r11)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            long r5 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.performance.diagnostic.d$b r0 = r13.mo118533g()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r0.f248523a
            java.lang.String r0 = r0.f248527e
            r3.encode((java.lang.String) r0, (long) r5)
            java.lang.String r0 = f248517e
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r7 = r13.mo118534h()
            r3[r4] = r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r1] = r5
            java.lang.String r5 = "[%s] update hookBeginTime = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r3)
            goto L_0x00ac
        L_0x0091:
            com.tencent.mm.plugin.performance.diagnostic.d$b r0 = r13.mo118533g()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = r0.f248523a
            java.lang.String r0 = r0.f248530h
            r8 = -1
            int r0 = r7.decodeInt(r0, r8)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x00ae
            int r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            if (r0 == r9) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r0 = 1
            goto L_0x00e5
        L_0x00ae:
            com.tencent.mm.plugin.performance.diagnostic.d$b r9 = r13.mo118533g()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = r9.f248523a
            java.lang.String r9 = r9.f248525c
            r10.encode((java.lang.String) r9, (boolean) r4)
            java.lang.String r9 = f248517e
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = r13.mo118534h()
            r10[r4] = r11
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r10[r1] = r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r10[r2] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10[r3] = r0
            r0 = 4
            int r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10[r0] = r3
            java.lang.String r0 = "[%s] time out, disable hook: (%s > %s || 0x%x != 0x%x)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r10)
            r0 = 0
        L_0x00e5:
            if (r0 == 0) goto L_0x00f8
            byte[] r0 = com.tencent.p014mm.plugin.expansions.C85178q.f248171a
            com.tencent.matrix.hook.a r0 = r13.mo118539n()
            if (r0 == 0) goto L_0x00f9
            r13.mo118540o()
            com.tencent.mm.plugin.performance.diagnostic.d$d r3 = r13.f248519d
            r3.mo118548a()
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            java.lang.String r3 = f248517e
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r13.mo118534h()
            r2[r4] = r5
            if (r0 == 0) goto L_0x0106
            r4 = 1
        L_0x0106:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r1] = r4
            java.lang.String r1 = "[%s] boot enable=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.diagnostic.C85311d.mo118531e():com.tencent.matrix.hook.a");
    }

    /* renamed from: f */
    public final boolean mo118532f() {
        int i = BuildInfo.CLIENT_VERSION_INT;
        C85313b g = mo118533g();
        if (i != g.f248523a.decodeInt(g.f248530h, -1)) {
            C85313b g2 = mo118533g();
            g2.f248523a.encode(g2.f248531i, 0);
        }
        C85313b g3 = mo118533g();
        boolean z = g3.f248523a.decodeInt(g3.f248531i, 0) >= 3 && !BuildInfo.DEBUG && !WeChatEnvironment.hasDebugger();
        if (z) {
            Log.m105921e(f248517e, "[%s] crash too many times, disable hook", mo118534h());
            C85313b g4 = mo118533g();
            g4.f248523a.encode(g4.f248525c, false);
        }
        return !z;
    }

    /* renamed from: g */
    public abstract CONFIG mo118533g();

    public final String getCrashReportExtraMessage() {
        Log.m105921e(f248517e, "[%s] crash happened", mo118534h());
        boolean e = mo118533g().mo118547e();
        C85313b g = mo118533g();
        int decodeInt = g.f248523a.decodeInt(g.f248531i, 0);
        StringBuilder sb = new StringBuilder(mo118534h());
        sb.append(XVFSFile.PATH_SEPARATOR);
        sb.append("\n");
        sb.append("enable=");
        sb.append(e);
        if (e) {
            try {
                mo118541p(true);
            } catch (Throwable th) {
                Log.printErrStackTrace(f248517e, th, "error onCrash", new Object[0]);
            }
            String i = mo118535i();
            sb.append(",");
            sb.append(i);
            sb.append(",");
            sb.append("begin:");
            C85313b g2 = mo118533g();
            sb.append(C79693c.m96812f(g2.f248523a.decodeLong(g2.f248527e, 0)));
            sb.append(",");
            sb.append("crash times:");
            decodeInt++;
            sb.append(decodeInt);
            C85313b g3 = mo118533g();
            g3.f248523a.encode(g3.f248531i, decodeInt);
        }
        if (e && decodeInt >= 3) {
            C85313b g4 = mo118533g();
            g4.f248523a.encode(g4.f248525c, false);
            Log.m105921e(f248517e, "[%s] crash happens 3 times, disable hook: %s", mo118534h(), mo118534h());
            C117407d.INSTANCE.mo182089r(1376, 1, 1);
        }
        return sb.toString();
    }

    /* renamed from: h */
    public String mo118534h() {
        return null;
    }

    /* renamed from: i */
    public abstract String mo118535i();

    /* renamed from: j */
    public void mo118536j(C85317e eVar) {
    }

    /* renamed from: k */
    public final void mo118537k(Map<String, String> map, C85317e eVar) {
        Log.m105925i(f248517e, "[%s] processCmd: [%s]", mo118534h(), map);
        boolean e = mo118533g().mo118547e();
        mo118533g().mo118543a(map);
        boolean e2 = mo118533g().mo118547e();
        mo118533g().mo118544b();
        if (!e && e2 && mo118533g().mo118544b()) {
            byte[] bArr = C85178q.f248171a;
            Log.m105925i(f248517e, "[%s] hook immediately", mo118534h());
            try {
                m105271q(mo118539n());
                mo118536j(eVar);
                mo118540o();
                this.f248519d.mo118548a();
            } catch (Throwable th) {
                Log.printErrStackTrace(f248517e, th, "[%s] do hook error", mo118534h());
            }
        }
    }

    /* renamed from: l */
    public final void mo118538l(Map<String, String> map, C85317e eVar) {
        if (mo118532f()) {
            mo118537k(map, eVar);
            return;
        }
        Log.m105921e(f248517e, "[%s] crash too many times, disable the hook", mo118534h());
        C85313b g = mo118533g();
        g.f248523a.encode(g.f248525c, false);
    }

    /* renamed from: n */
    public abstract HOOK mo118539n();

    /* renamed from: o */
    public final void mo118540o() {
        String str = f248517e + "-repeat";
        long c = mo118533g().mo118545c();
        ((C119157j) C119157j.f356862d).mo183894y(str);
        if (c < 0) {
            Log.m105925i(f248517e, "[%s] dump cycle is negative. just disable repeating dump", mo118534h());
            return;
        }
        ((C119157j) C119157j.f356862d).mo183879j(new C85312a(c, str), c, str);
    }

    /* renamed from: p */
    public abstract void mo118541p(boolean z);
}
