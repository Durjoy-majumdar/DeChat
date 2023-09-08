package mp0;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.concurrent.atomic.AtomicBoolean;
import k20.C60958c;
import k20.C9556a;
import lp0.C88620b;
import wi0.C90989n;

/* renamed from: mp0.h */
public class C88802h implements C88620b<C83928t1> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        String str2;
        C83928t1 t1Var = (C83928t1) d1Var;
        MultiProcessMMKV multiProcessMMKV = C90989n.f261076a;
        if (Util.isNullOrNil(multiProcessMMKV.getString("V8DebugFlags", ""))) {
            multiProcessMMKV.putString("V8DebugFlags", "--prof_cpp");
            str2 = context.getString(C0966R.string.f7650mo);
        } else {
            multiProcessMMKV.remove("V8DebugFlags");
            str2 = context.getString(C0966R.string.f7649mn);
        }
        AppBrandUI appBrandUI = (AppBrandUI) context;
        AtomicBoolean atomicBoolean = AppBrandProcessSuicideLogic.f238430g;
        AppBrandProcessSuicideLogic.RebootProcessAndTask rebootProcessAndTask = new AppBrandProcessSuicideLogic.RebootProcessAndTask();
        rebootProcessAndTask.f238435f = MMApplicationContext.getProcessName();
        Pair<AppBrandInitConfigWC, AppBrandStatObject> k8 = appBrandUI.mo117119k8(appBrandUI.getIntent());
        rebootProcessAndTask.f238436g = (AppBrandInitConfigWC) k8.first;
        rebootProcessAndTask.f238437h = (AppBrandStatObject) k8.second;
        rebootProcessAndTask.f238438i = str2;
        rebootProcessAndTask.mo114396f();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "rebootProcessAndTask", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUI;Ljava/lang/String;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        System.exit(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(obj, "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "rebootProcessAndTask", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUI;Ljava/lang/String;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        int myPid = Process.myPid();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(myPid));
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "rebootProcessAndTask", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUI;Ljava/lang/String;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(obj2, "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "rebootProcessAndTask", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUI;Ljava/lang/String;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return (Util.isNullOrNil(C90989n.f261076a.getString("V8DebugFlags", "")) ? context.getString(C0966R.string.f7673ni) : context.getString(C0966R.string.f7670nf)).toString();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return false;
    }
}
