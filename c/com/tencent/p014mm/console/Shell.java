package com.tencent.p014mm.console;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import ce2.C28545b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.HashMap;

/* renamed from: com.tencent.mm.console.Shell */
public class Shell {

    /* renamed from: b */
    public static HashMap<String, Shell$$s1> f79321b = new HashMap<>();

    /* renamed from: c */
    public static IntentFilter f79322c = new IntentFilter();

    /* renamed from: a */
    public Receiver f79323a = null;

    /* renamed from: com.tencent.mm.console.Shell$Receiver */
    public static class Receiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Shell$$s1 shell$$s1 = Shell.f79321b.get(action);
            if (shell$$s1 == null) {
                Log.m105921e("MicroMsg.Shell", "no action found for %s", action);
            } else if (MMApplicationContext.isMainProcess() || (shell$$s1 instanceof Shell$$t1)) {
                Log.m105921e("MicroMsg.Shell", "shell action %s", action);
                shell$$s1.mo56303a(intent);
            } else {
                Log.m105921e("MicroMsg.Shell", "action[%s] can only run in mm process", action);
            }
        }
    }

    static {
        m38416b("wechat.shell.SET_NEXTRET", new Shell$$n(), true);
        m38416b("wechat.shell.SET_LOGLEVEL", new Shell$$y(), true);
        m38416b("wechat.shell.SET_CDNTRANS", new Shell$$j0(), true);
        m38416b("wechat.shell.SET_DKTEST", new Shell$$u0(), true);
        m38416b("wechat.shell.NET_DNS_TEST", new Shell$$f1(), true);
        m38416b("wechat.shell.IDC_ERROR", new Shell$$o1(), true);
        m38416b("wechat.shell.OPENGL_HOOK_DUMP", new Shell$$p1(), true);
        m38416b("wechat.shell.SET_DK_WT_TEST", new Shell$$q1(), true);
        m38416b("wechat.shell.SET_MUTE_ROOM_TEST", new Shell$$r1(), true);
        m38416b("wechat.shell.HOTPATCH_TEST", new Shell$$d(), true);
        m38416b("wechat.shell.EXEC_STATUSDB_SQL", new Shell$$e(), true);
        m38416b("wechat.shell.EXEC_SQL", new Shell$$f(), true);
        m38416b("wechat.shell.GC", new Shell$$g(), true);
        m38416b("wechat.shell.OOM", new Shell$$h(), true);
        m38416b("wechat.shell.DUMP_AND_PUBLISH", new Shell$$i(), true);
        m38416b("wechat.shell.DUMP_SMAPS", new Shell$$j(), true);
        m38416b("wechat.shell.DUMP_HPROF", new Shell$$k(), true);
        m38416b("wechat.shell.HOOK_ALL", new Shell$$l(), true);
        m38416b("wechat.shell.HOOK_MM", new Shell$$m(), true);
        m38416b("wechat.shell.DISABLE_HOOK_TOAST", new Shell$$o(), true);
        m38416b("wechat.shell.HOOK_DISABLE", new Shell$$p(), true);
        m38416b("wechat.shell.HOOK_REPORT", new Shell$$q(), true);
        m38416b("wechat.shell.MEMORY_HOOK", new Shell$$r(), true);
        m38416b("wechat.shell." + C28545b.m38262a(""), new Shell$$s(), true);
        m38416b("wechat.shell." + C28545b.m38262a(""), new Shell$$t(), true);
        m38416b("wechat.shell." + C28545b.m38262a(""), new Shell$$u(), true);
        m38416b("wechat.shell." + C28545b.m38262a(""), new Shell$$v(), true);
        m38416b("wechat.shell." + C28545b.m38262a(""), new Shell$$w(), true);
        m38416b("wechat.shell.RECOVERY_LAUNCH_UI", new Shell$$x(), true);
        m38416b("wechat.shell.RECOVERY_FETCH_PATCH", new Shell$$z(), true);
        m38416b("wechat.shell.RECOVERY_EXERCISE_START", new Shell$$a0(), true);
        m38416b("wechat.shell.RECOVERY_EXERCISE_START_TIMER", new Shell$$b0(), true);
        m38416b("wechat.shell.RECOVERY_EXERCISE_SET_TIMER_RATIO", new Shell$$c0(), true);
        m38416b("wechat.shell.MATRIX_BATTERY_DUMP_THREAD", new Shell$$d0(), true);
        m38416b("wechat.shell.THREAD_HOOK", new Shell$$e0(), true);
        m38416b("wechat.shell.THREAD_DUMP", new Shell$$f0(), true);
        m38416b("wechat.shell.FINDER_SHELL", new Shell$$g0(), true);
        m38416b("wechat.shell.WATCH_MEM", new Shell$$h0(), true);
        m38416b("wechat.shell.TRIM_MEM", new Shell$$i0(), true);
        m38416b("wechat.shell.WATCH_PROC", new Shell$$k0(), true);
        m38416b("wechat.shell.MOVE_XLOG", new Shell$$l0(), false);
        Shell$$m0 shell$$m0 = new Shell$$m0();
        m38416b("wechat.shell.OpenWeApp", shell$$m0, true);
        m38416b("wechat.shell.KillWeApp", shell$$m0, true);
        m38416b("wechat.shell.FINDER_VIDEO_TEST", new Shell$$n0(), true);
        m38416b("wechat.shell.EXPT_TEST", new Shell$$o0(), true);
        m38416b("wechat.shell.DUMP_MAPS", new Shell$$p0(), true);
        m38416b("wechat.shell.BRANDS_XID", new Shell$$q0(), true);
        m38416b("wechat.shell.BRANDS_BIZ", new Shell$$r0(), true);
        m38416b("wechat.shell.BRANDS_CLEAR", new Shell$$s0(), true);
        m38416b("wechat.shell.BRANDS_DUMP", new Shell$$t0(), true);
        m38416b("wechat.shell.WATCH_FD", new Shell$$v0(), true);
        m38416b("wechat.shell.DISABLE_ACTIVITY_NOTIFIER", new Shell$$w0(), true);
        m38416b("wechat.shell.WATCH_THREAD", new Shell$$x0(), true);
        m38416b("wechat.shell.CLASSLOADER_DUMP", new Shell$$y0(), true);
        m38416b("wechat.shell.LIVE_STREAM_LOCAL_VIDEO", new Shell$$z0(), true);
        m38416b("wechat.shell.LIVE_BEAUTY_DEGREE", new Shell$$a1(), true);
        m38416b("wechat.shell.LIVE_MAKEUP_DEGREE", new Shell$$b1(), true);
        m38416b("wechat.shell.LRU_KILL", new Shell$$c1(), true);
        m38416b("wechat.shell.WATCH_TASK", new Shell$$d1(), true);
        m38416b("wechat.shell.WATCH_ACTIVITY", new Shell$$a(), true);
        m38416b("wechat.shell.CLEAR_TASK", new Shell$$e1(), true);
        m38416b("wechat.shell.DUMP_VIEW", new Shell$$g1(), true);
        m38416b("wechat.shell.TEST_REPORT", new Shell$$b(), true);
        m38416b("wechat.shell.TEST_HALF", new Shell$$c(), true);
        m38416b("wechat.shell.FINDER_LIVE_NEW_ENTRANCE", new Shell$$h1(), true);
        m38416b("wechat.shell.FINDER_LIVE_DELETE_MULTI_STREAM", new Shell$$i1(), true);
        m38416b("wechat.shell.FINDER_LIVE_CHANGE_MULTI_STREAM", new Shell$$j1(), true);
        m38416b("wechat.shell.FINDER_LIVE_CHEER_UPDATE", new Shell$$k1(), true);
        m38416b("wechat.shell.FINDER_SUPPORT_FIND_PAGE_LIVE", new Shell$$l1(), true);
        m38416b("wechat.shell.SET_VOIP_SETTING_CUSTOM", new Shell$$m1(), true);
        m38416b("wechat.shell.RUN_XWEB_COMMAND", new Shell$$n1(), true);
    }

    /* renamed from: a */
    public static String m38415a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: b */
    public static void m38416b(String str, Shell$$s1 shell$$s1, boolean z) {
        boolean z2 = true;
        if (!(shell$$s1 instanceof Shell$$t1) && !MMApplicationContext.isMainProcess()) {
            z2 = false;
        }
        if (z2) {
            if (!z || WeChatEnvironment.hasDebugger()) {
                f79322c.addAction(str);
                f79321b.put(str, shell$$s1);
            }
        }
    }
}
