package com.tencent.matrix.trace.tracer;

import com.tencent.p014mm.app.C80606m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import org.json.JSONObject;
import p1008mf.C88729a;
import p1029rf.C89960g;
import p1035sf.C90183c;
import p269xe.C91185g;
import p723vf.C118672d;
import p723vf.C90773a;
import p761yd.C91441c;
import p995kf.C88146a;

public class ThreadTracer extends C89960g {

    /* renamed from: e */
    public static C80548a f235591e;

    /* renamed from: f */
    public static boolean f235592f;

    /* renamed from: com.tencent.matrix.trace.tracer.ThreadTracer$a */
    public interface C80548a {
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("trace-canary");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/trace/tracer/ThreadTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/matrix/trace/tracer/ThreadTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: j */
    public static int m98151j() {
        return nativeGetPthreadKeySeq();
    }

    private static native int nativeGetPthreadKeySeq();

    private static native void nativeInitThreadHook(int i, int i2);

    private static void onMainThreadPriorityModified(int i, int i2) {
        C80548a aVar = f235591e;
        if (aVar != null) {
            ((C80606m0) aVar).getClass();
            Log.m105921e("MicroMsg.MMCrashReporter", "Main Thread Priority Changed, priorityBefore = %d, priorityAfter = %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i2 >= 10) {
                throw new RuntimeException("You Cannot set the the Main Thread to a background thread (nice value must be smaller than 10).");
            }
            return;
        }
        try {
            C88146a aVar2 = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
            if (aVar2 != null) {
                String b = C90183c.m112854b();
                JSONObject jSONObject = new JSONObject();
                C90773a.m113838d(jSONObject, C91441c.m114730d().f262168b);
                jSONObject.put("detail", C88729a.PRIORITY_MODIFIED);
                jSONObject.put("threadStack", b);
                jSONObject.put("processPriority", i2);
                C91185g gVar = new C91185g();
                gVar.f261444b = "Trace_EvilMethod";
                gVar.f261446d = jSONObject;
                aVar2.onDetectIssue(gVar);
                C118672d.m167352b("ThreadPriorityTracer", "happens MainThreadPriorityModified : %s ", jSONObject.toString());
            }
        } catch (Throwable th) {
            C118672d.m167352b("ThreadPriorityTracer", "onMainThreadPriorityModified error: %s", th.getMessage());
        }
    }

    private static void onMainThreadTimerSlackModified(long j) {
        try {
            C80548a aVar = f235591e;
            if (aVar != null) {
                aVar.getClass();
                return;
            }
            C88146a aVar2 = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
            if (aVar2 != null) {
                String b = C90183c.m112854b();
                JSONObject jSONObject = new JSONObject();
                C90773a.m113838d(jSONObject, C91441c.m114730d().f262168b);
                jSONObject.put("detail", C88729a.TIMERSLACK_MODIFIED);
                jSONObject.put("threadStack", b);
                jSONObject.put("processTimerSlack", j);
                C91185g gVar = new C91185g();
                gVar.f261444b = "Trace_EvilMethod";
                gVar.f261446d = jSONObject;
                aVar2.onDetectIssue(gVar);
                C118672d.m167352b("ThreadPriorityTracer", "happens MainThreadPriorityModified : %s ", jSONObject.toString());
            }
        } catch (Throwable th) {
            C118672d.m167352b("ThreadPriorityTracer", "onMainThreadPriorityModified error: %s", th.getMessage());
        }
    }

    private static void pthreadKeyCallback(int i, int i2, int i3, String str, String str2) {
    }

    /* renamed from: f */
    public void mo112123f() {
        super.mo112123f();
        boolean z = f235592f;
        if (z) {
            nativeInitThreadHook(z ? 1 : 0, 0);
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        super.mo112124h();
    }
}
