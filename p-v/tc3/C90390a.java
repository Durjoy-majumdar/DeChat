package tc3;

import android.app.Application;
import android.app.Instrumentation;
import bp3.C104160f;
import bp3.C79756n;
import bp3.C79758p;
import com.tencent.p014mm.pluginguard.ActivityHookInstrumentation;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.lang.reflect.Field;
import p156gj.C87203t;

/* renamed from: tc3.a */
public final class C90390a implements C79756n {

    /* renamed from: a */
    public final /* synthetic */ Application f259400a;

    public C90390a(Application application) {
        this.f259400a = application;
    }

    /* renamed from: a */
    public void mo109877a() {
        if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ActivityHookEnable_Int, 1) == 1) {
            String k = C87203t.m108275k();
            if (!(k.equals("22061218C") || k.equals("22081281AC") || k.equals("SM-F9360"))) {
                C90391b bVar = C90391b.f259401a;
                Application application = this.f259400a;
                synchronized (bVar) {
                    C87412m.m108594g(application, MimeTypes.BASE_TYPE_APPLICATION);
                    System.currentTimeMillis();
                    try {
                        Object a = bVar.mo124603a(application);
                        Field declaredField = a.getClass().getDeclaredField("mInstrumentation");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(a);
                        C87412m.m108592e(obj, "null cannot be cast to non-null type android.app.Instrumentation");
                        Instrumentation instrumentation = (Instrumentation) obj;
                        if (!(instrumentation instanceof ActivityHookInstrumentation)) {
                            declaredField.set(a, new ActivityHookInstrumentation(instrumentation));
                        } else {
                            Log.m105924i("MicroMsg.ActivityHook", "ActivityHook has set?");
                        }
                        Log.m105924i("MicroMsg.ActivityHook", "ActivityHook success hack");
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ActivityHook", e, "ActivityHook hack error", new Object[0]);
                    }
                }
                Log.m105924i("MicroMsg.ActivityHook", "ActivityHook hack success");
                return;
            }
        }
        Log.m105924i("MicroMsg.ActivityHook", "ActivityHook safetyToHack but Repairer skip");
    }
}
