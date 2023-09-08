package nj0;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: nj0.f */
public final class C88966f extends C88986z<Float> {

    /* renamed from: c */
    public static final C88966f f256550c = new C88966f();

    /* renamed from: d */
    public static final String f256551d;

    /* renamed from: e */
    public static Float f256552e;

    /* renamed from: f */
    public static final C13601g f256553f = C36568h.m40985a(C34853b.f93634d);

    /* renamed from: g */
    public static final C13601g f256554g = C36568h.m40985a(C34852a.f93633d);

    /* renamed from: h */
    public static final C13601g f256555h = C36568h.m40985a(C34854c.f93635d);

    /* renamed from: i */
    public static ActivityManager.MemoryInfo f256556i;

    /* renamed from: nj0.f$a */
    public static final class C34852a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C34852a f93633d = new C34852a();

        public C34852a() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i(C88966f.f256551d, "clicfg_magicbrush_autogcfactor_max_canvas 600.0");
            return Float.valueOf(600.0f);
        }
    }

    /* renamed from: nj0.f$b */
    public static final class C34853b extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C34853b f93634d = new C34853b();

        public C34853b() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i(C88966f.f256551d, "clicfg_magicbrush_autogcfactor_min_canvas 100.0");
            return Float.valueOf(100.0f);
        }
    }

    /* renamed from: nj0.f$c */
    public static final class C34854c extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C34854c f93635d = new C34854c();

        public C34854c() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i(C88966f.f256551d, "clicfg_magicbrush_autogcfactor_total_memory_ratio 0.5");
            return Float.valueOf(0.5f);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("MicroMsg.WAGameGcFactor");
        String processName = MMApplicationContext.getProcessName();
        C87412m.m108593f(processName, "getProcessName()");
        String packageName = MMApplicationContext.getPackageName();
        C87412m.m108593f(packageName, "getPackageName()");
        sb.append(C112551y.m153814n(processName, packageName, "", false));
        f256551d = sb.toString();
    }

    /* renamed from: b */
    public C32735h.C32737c mo123346b() {
        return C32735h.C32737c.clicfg_magicbrush_gcfactor;
    }

    /* renamed from: d */
    public String mo123349d() {
        return "gcfactor";
    }

    /* renamed from: f */
    public Object mo123347f() {
        return Float.valueOf(0.0f);
    }

    /* renamed from: g */
    public Object mo123348g(String str) {
        return Float.valueOf(0.0f);
    }

    /* renamed from: i */
    public final float mo123350i(Context context) {
        C87412m.m108594g(context, "context");
        Float f = f256552e;
        if (f != null) {
            C87412m.m108591d(f);
            return f.floatValue();
        }
        float floatValue = ((Number) mo123353e()).floatValue();
        if (!(floatValue == -1.0f)) {
            String str = f256551d;
            Log.m105924i(str, "rawConfig == [" + floatValue + "] != -1, just return");
            f256552e = Float.valueOf(floatValue);
            return floatValue;
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        float f3 = (((float) context.getResources().getDisplayMetrics().widthPixels) / f2) * (((float) context.getResources().getDisplayMetrics().heightPixels) / f2) * ((float) 4) * ((float) 2);
        if (f256556i == null) {
            Object systemService = context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            f256556i = memoryInfo;
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            String str2 = f256551d;
            StringBuilder sb = new StringBuilder();
            sb.append("getAvailableMemory avail = [");
            ActivityManager.MemoryInfo memoryInfo2 = f256556i;
            C87412m.m108591d(memoryInfo2);
            sb.append(memoryInfo2.availMem);
            sb.append("] total = [");
            ActivityManager.MemoryInfo memoryInfo3 = f256556i;
            C87412m.m108591d(memoryInfo3);
            sb.append(memoryInfo3.totalMem);
            sb.append(']');
            Log.m105924i(str2, sb.toString());
        }
        ActivityManager.MemoryInfo memoryInfo4 = f256556i;
        C87412m.m108591d(memoryInfo4);
        long floatValue2 = (long) (((float) memoryInfo4.totalMem) * ((Number) ((C36570n) f256555h).getValue()).floatValue());
        float f4 = ((float) floatValue2) / f3;
        float min = Math.min(((Number) ((C36570n) f256554g).getValue()).floatValue(), Math.max(((Number) ((C36570n) f256553f).getValue()).floatValue(), f4));
        float f5 = ((float) 67108864) / (min * f3);
        String str3 = f256551d;
        Log.m105924i(str3, "calculate gc_factor automatically unit = [" + (f3 / 1024.0f) + "]kb limit = [" + 65536 + "]kb system = [" + (floatValue2 / ((long) 1024)) + "]kb raw = [" + min + XVFSFile.PATH_SEPARATOR_CHAR + f4 + "] actually = [" + f5 + ']');
        Float valueOf = Float.valueOf(f5);
        f256552e = valueOf;
        C87412m.m108591d(valueOf);
        return valueOf.floatValue();
    }
}
