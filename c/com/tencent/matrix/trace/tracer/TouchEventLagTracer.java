package com.tencent.matrix.trace.tracer;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import k20.C9556a;
import org.json.JSONObject;
import p1002lf.C88491b;
import p1008mf.C88729a;
import p1029rf.C89960g;
import p1035sf.C90178a;
import p1035sf.C90183c;
import p269xe.C91185g;
import p723vf.C118672d;
import p723vf.C90773a;
import p723vf.C90778c;
import p761yd.C91440a;
import p761yd.C91441c;
import p995kf.C88146a;

public class TouchEventLagTracer extends C89960g {

    /* renamed from: e */
    public static C88491b f235593e;

    /* renamed from: f */
    public static long f235594f;

    /* renamed from: g */
    public static String f235595g;

    /* renamed from: com.tencent.matrix.trace.tracer.TouchEventLagTracer$a */
    public class C80549a implements Runnable {
        public void run() {
            try {
                if (System.currentTimeMillis() - TouchEventLagTracer.f235594f >= 4000) {
                    C118672d.m167353c("Matrix.TouchEventLagTracer", "onTouchEventLag report", new Object[0]);
                    TouchEventLagTracer.f235594f = System.currentTimeMillis();
                    C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
                    if (aVar != null) {
                        String str = TouchEventLagTracer.f235595g;
                        boolean a = C90178a.m112843a();
                        String a2 = C91440a.INSTANCE.mo125374a();
                        JSONObject jSONObject = new JSONObject();
                        C90773a.m113838d(jSONObject, C91441c.m114730d().f262168b);
                        jSONObject.put("detail", C88729a.LAG_TOUCH);
                        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, a2);
                        jSONObject.put("threadStack", str);
                        jSONObject.put("isProcessForeground", a);
                        C91185g gVar = new C91185g();
                        gVar.f261444b = "Trace_EvilMethod";
                        gVar.f261446d = jSONObject;
                        aVar.onDetectIssue(gVar);
                    }
                }
            } catch (Throwable th) {
                C118672d.m167352b("Matrix.TouchEventLagTracer", "Matrix error, error = " + th.getMessage(), new Object[0]);
            }
        }
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("trace-canary");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/trace/tracer/TouchEventLagTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/matrix/trace/tracer/TouchEventLagTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public TouchEventLagTracer(C88491b bVar) {
        f235593e = bVar;
    }

    public static native void nativeInitTouchEventLagDetective(int i);

    private static void onTouchEventLag(int i) {
        C118672d.m167352b("Matrix.TouchEventLagTracer", "onTouchEventLag, fd = " + i, new Object[0]);
        C90778c.m113843a().post(new C80549a());
    }

    private static void onTouchEventLagDumpTrace(int i) {
        C118672d.m167352b("Matrix.TouchEventLagTracer", "onTouchEventLagDumpTrace, fd = " + i, new Object[0]);
        f235595g = C90183c.m112854b();
    }

    /* renamed from: f */
    public synchronized void mo112123f() {
        super.mo112123f();
        C88491b bVar = f235593e;
        if (bVar.f255602g) {
            bVar.getClass();
            nativeInitTouchEventLagDetective(2000);
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        super.mo112124h();
    }
}
