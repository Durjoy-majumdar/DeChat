package p70;

import com.tencent.matrix.lifecycle.C80411j;
import com.tencent.matrix.lifecycle.C80414k;
import com.tencent.matrix.lifecycle.supervisor.C80496l;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Pattern;
import p269xe.C91190k;
import p723vf.C118672d;
import p761yd.C38993b;
import rx3.C13598b0;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import z04.C112551y;
import zt3.C119143b;

/* renamed from: p70.a */
public final class C89315a {

    /* renamed from: a */
    public static final C80414k f257273a;

    /* renamed from: p70.a$a */
    public static final class C35392a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C35392a f94749d = new C35392a();

        public C35392a() {
            super(0);
        }

        public Object invoke() {
            Boolean valueOf = Boolean.valueOf(C38993b.m41993c(C32735h.C32737c.clicfg_matrix_lifecycle_ext_executor, true));
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.MatrixLifecycleBoot", "enable external executor: " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: p70.a$b */
    public static final class C89316b extends C119143b {
        public C89316b(LinkedBlockingQueue<Runnable> linkedBlockingQueue, C119143b.C91935a aVar) {
            super("matrix_x", 0, 20, linkedBlockingQueue, aVar);
        }

        public void execute(Runnable runnable) {
            C35393b bVar;
            if (runnable != null) {
                C80414k kVar = C89315a.f257273a;
                bVar = new C35393b(runnable);
            } else {
                bVar = null;
            }
            super.execute(bVar);
        }
    }

    /* renamed from: p70.a$c */
    public static final class C89317c extends C87413o implements C32227p<String, Long, C13598b0> {

        /* renamed from: d */
        public static final C89317c f257274d = new C89317c();

        public C89317c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            long j;
            String str2 = (String) obj;
            long longValue = ((Number) obj2).longValue();
            C87412m.m108594g(str2, "task");
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) {
                C91190k.C26537a aVar = C91190k.f261451a;
                Pattern compile = Pattern.compile("@[0-9a-z]+");
                C87412m.m108593f(compile, "compile(pattern)");
                String replaceAll = compile.matcher(str2).replaceAll("");
                C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                j = longValue;
                str = str2;
                aVar.mo53491a(new C91190k.C26538b(100, (String) null, 0, 0, longValue, 0, 0, 0, replaceAll, 0, (String) null, 0, (String) null, 0, 0, 0, (String) null, (String) null, 0, 0, 0, 0, 0, 0, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, 0, 0, -274, 1, (C8480h) null));
            } else {
                str = str2;
                j = longValue;
            }
            C118672d.m167352b("MicroMsg.MatrixLifecycleBoot", "heavy task(cost " + j + "ms):" + str, new Object[0]);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: p70.a$d */
    public static final class C89318d extends C87413o implements C32228q<String, String, Long, C13598b0> {

        /* renamed from: d */
        public static final C89318d f257275d = new C89318d();

        public C89318d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            String str2 = (String) obj2;
            long longValue = ((Number) obj3).longValue();
            C87412m.m108594g(str, "thread");
            C87412m.m108594g(str2, "stacktrace");
            C91190k.C26537a aVar = C91190k.f261451a;
            long j = longValue;
            C91190k.C26538b bVar = r0;
            String str3 = str2;
            C91190k.C26538b bVar2 = new C91190k.C26538b(101, (String) null, 0, 0, j, 0, 0, 0, C112551y.m153814n(C112551y.m153814n(str2, "\n", ";", false), "\t", "", false), 0, str, 0, (String) null, 0, 0, 0, (String) null, (String) null, 0, 0, 0, 0, 0, 0, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, 0, 0, -1298, 1, (C8480h) null);
            aVar.mo53491a(bVar);
            C118672d.m167352b("MicroMsg.MatrixLifecycleBoot", "thread: " + str + ", cost: " + j + ", " + str3, new Object[0]);
            return C13598b0.f38549a;
        }
    }

    static {
        String applicationId = MMApplicationContext.getApplicationId();
        boolean e = C38993b.m41995e("clicfg_matrix_lifecycle_process_supervisor_enable", true);
        C87412m.m108593f(applicationId, "pkgName");
        C80496l lVar = new C80496l(e, false, C64197v.m75534c(applicationId, applicationId + ":push", applicationId + ":tools", applicationId + ":appbrand0", applicationId + ":appbrand1", applicationId + ":appbrand2", applicationId + ":appbrand3", applicationId + ":appbrand4", applicationId + ":sandbox", applicationId + ":exdevice", applicationId + ":support", applicationId + ":cuploader", applicationId + ":patch", applicationId + ":hotpot..", applicationId + ":fallback", applicationId + ":dexopt", applicationId + ":recovery", applicationId + ":nospace", applicationId + ":jectl", applicationId + ":opengl_detector", applicationId + ":rubbishbin", applicationId + ":isolated_process0", applicationId + ":isolated_process1", applicationId + ":res_can_worker", applicationId + ":extmig", applicationId + ":backtrace__", applicationId + ":TMAssistantDownloadSDKService", applicationId + ":switch", applicationId + ":hld", applicationId + ":playcore_missing_splits_activity", applicationId + ":hldfl", applicationId + ":magic_emoji"));
        C80411j jVar = new C80411j(!((Boolean) ((C36570n) C36568h.m40985a(C35392a.f94749d)).getValue()).booleanValue() ? null : new C89316b(new LinkedBlockingQueue(), new C119143b.C91935a()), 5, 30, C89317c.f257274d, C89318d.f257275d);
        boolean e2 = C38993b.m41995e("clicfg_matrix_lifecycle_fg_service_monitor", true);
        C118672d.m167353c("MicroMsg.MatrixLifecycleBoot", "enableFgServiceMonitor = " + e2, new Object[0]);
        boolean e3 = C38993b.m41995e("clicfg_matrix_lifecycle_overlay_window_monitor", true);
        C118672d.m167353c("MicroMsg.MatrixLifecycleBoot", "overlayWindowMonitorEnable = " + e3, new Object[0]);
        C13598b0 b0Var = C13598b0.f38549a;
        f257273a = new C80414k(lVar, e2, e3, jVar, true);
    }
}
