package h31;

import android.view.View;
import c31.C79924b;
import com.tencent.p014mm.plugin.crashfix.jni.JNIEnvNewWeakGlobalRefHook;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import h81.C32735h;
import java.lang.reflect.Method;

/* renamed from: h31.a */
public class C32696a implements C79924b {
    /* renamed from: a */
    public boolean mo58760a(int i) {
        if (i != 24 && i != 25) {
            return false;
        }
        Log.m105924i("MicroMsg.WeakGlobalRefFix", "api " + i);
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_weakglobal_fix, 1);
        Log.m105924i("MicroMsg.WeakGlobalRefFix", "Expt : " + Qe);
        if (Qe == 0) {
            return false;
        }
        if (Qe == 2) {
            MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("weakglobal_fix");
            singleMMKV.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
            singleMMKV.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", false);
            singleMMKV.commit();
        }
        return true;
    }

    /* renamed from: b */
    public void mo58761b() {
        MultiProcessMMKV.getSingleMMKV("weakglobal_fix").putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", true).commit();
    }

    /* renamed from: c */
    public boolean mo58762c() {
        boolean z = MultiProcessMMKV.getSingleMMKV("weakglobal_fix").getBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", false);
        boolean z2 = MultiProcessMMKV.getSingleMMKV("weakglobal_fix").getBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
        Log.m105924i("MicroMsg.WeakGlobalRefFix", "start " + z);
        Log.m105924i("MicroMsg.WeakGlobalRefFix", "end " + z2);
        if (z == z2) {
            if (z2) {
                C115669n.INSTANCE.idkeyStat(1113, 2, 1, false);
            }
            return false;
        } else if (MultiProcessMMKV.getSingleMMKV("weakglobal_fix").getInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", 0) == -5) {
            C115669n.INSTANCE.idkeyStat(1113, 0, 1, false);
            return true;
        } else {
            C115669n.INSTANCE.idkeyStat(1113, 1, 1, false);
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo58763d() {
        JNIEnvNewWeakGlobalRefHook.init();
        try {
            JNIEnvNewWeakGlobalRefHook.calculateOffset();
            new View(MMApplicationContext.getContext());
            Log.m105924i("MicroMsg.WeakGlobalRefFix", "init finish");
            Method declaredMethod = Class.forName("android.view.RenderNode").getDeclaredMethod("nCreate", new Class[]{String.class});
            Method method = JNIEnvNewWeakGlobalRefHook.class.getMethod("calculateOffset", new Class[0]);
            Log.m105924i("MicroMsg.WeakGlobalRefFix", "reflect finish");
            JNIEnvNewWeakGlobalRefHook.hook(declaredMethod, method);
            new View(MMApplicationContext.getContext());
            Log.m105924i("MicroMsg.WeakGlobalRefFix", "succ");
        } catch (Exception unused) {
            MultiProcessMMKV.getSingleMMKV("weakglobal_fix").putInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", -5).commit();
        }
        return true;
    }

    /* renamed from: e */
    public long mo58764e() {
        return 0;
    }

    public void start() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("weakglobal_fix");
        singleMMKV.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
        singleMMKV.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", true);
        singleMMKV.putInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", 0);
        singleMMKV.commit();
    }
}
