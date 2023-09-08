package p1029rf;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p1002lf.C88491b;
import p1008mf.C88729a;
import p1035sf.C90178a;
import p1035sf.C90183c;
import p269xe.C91185g;
import p723vf.C118672d;
import p723vf.C90773a;
import p761yd.C91440a;
import p761yd.C91441c;
import p995kf.C88146a;

/* renamed from: rf.d */
public class C89949d extends C89960g {

    /* renamed from: e */
    public static C88491b f258494e;

    /* renamed from: f */
    public static HandlerThread f258495f;

    /* renamed from: g */
    public static Handler f258496g;

    /* renamed from: h */
    public static Runnable f258497h;

    /* renamed from: rf.d$a */
    public static class C89950a implements Runnable {
        public void run() {
            try {
                C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
                if (aVar != null) {
                    String b = C90183c.m112854b();
                    boolean a = C90178a.m112843a();
                    String a2 = C91440a.INSTANCE.mo125374a();
                    JSONObject jSONObject = new JSONObject();
                    C90773a.m113838d(jSONObject, C91441c.m114730d().f262168b);
                    jSONObject.put("detail", C88729a.LAG_IDLE_HANDLER);
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, a2);
                    jSONObject.put("threadStack", b);
                    jSONObject.put("isProcessForeground", a);
                    C91185g gVar = new C91185g();
                    gVar.f261444b = "Trace_EvilMethod";
                    gVar.f261446d = jSONObject;
                    aVar.onDetectIssue(gVar);
                    C118672d.m167352b("Matrix.IdleHandlerLagTracer", "happens idle handler Lag : %s ", jSONObject.toString());
                }
            } catch (Throwable th) {
                C118672d.m167352b("Matrix.IdleHandlerLagTracer", "Matrix error, error = " + th.getMessage(), new Object[0]);
            }
        }
    }

    /* renamed from: rf.d$b */
    public static class C89951b<T> extends ArrayList {

        /* renamed from: d */
        public Map<MessageQueue.IdleHandler, C89952c> f258498d = new HashMap();

        public boolean add(Object obj) {
            if (!(obj instanceof MessageQueue.IdleHandler)) {
                return super.add(obj);
            }
            MessageQueue.IdleHandler idleHandler = (MessageQueue.IdleHandler) obj;
            C89952c cVar = new C89952c(idleHandler);
            ((HashMap) this.f258498d).put(idleHandler, cVar);
            return super.add(cVar);
        }

        public boolean remove(Object obj) {
            if (obj instanceof C89952c) {
                ((HashMap) this.f258498d).remove(((C89952c) obj).f258499d);
                return super.remove(obj);
            }
            C89952c cVar = (C89952c) ((HashMap) this.f258498d).remove(obj);
            return cVar != null ? super.remove(cVar) : super.remove(obj);
        }
    }

    /* renamed from: rf.d$c */
    public static class C89952c implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final MessageQueue.IdleHandler f258499d;

        public C89952c(MessageQueue.IdleHandler idleHandler) {
            this.f258499d = idleHandler;
        }

        public boolean queueIdle() {
            Handler handler = C89949d.f258496g;
            Runnable runnable = C89949d.f258497h;
            C89949d.f258494e.getClass();
            handler.postDelayed(runnable, (long) 2000);
            boolean queueIdle = this.f258499d.queueIdle();
            C89949d.f258496g.removeCallbacks(C89949d.f258497h);
            return queueIdle;
        }
    }

    public C89949d(C88491b bVar) {
        f258494e = bVar;
    }

    /* renamed from: f */
    public void mo112123f() {
        super.mo112123f();
        if (f258494e.f255601f) {
            f258495f = new HandlerThread("IdleHandlerLagThread");
            f258497h = new C89950a();
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    MessageQueue queue = Looper.getMainLooper().getQueue();
                    Field declaredField = MessageQueue.class.getDeclaredField("mIdleHandlers");
                    declaredField.setAccessible(true);
                    declaredField.set(queue, new C89951b());
                    f258495f.start();
                    f258496g = new Handler(f258495f.getLooper());
                }
            } catch (Throwable th) {
                C118672d.m167352b("Matrix.IdleHandlerLagTracer", "reflect idle handler error = " + th.getMessage(), new Object[0]);
            }
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        super.mo112124h();
        if (f258494e.f255601f) {
            f258496g.removeCallbacksAndMessages((Object) null);
        }
    }
}
