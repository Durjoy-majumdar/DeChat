package hm3;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import o40.C61926c;
import rx3.C13598b0;
import zl3.C79397a;

/* renamed from: hm3.a */
public abstract class C32951a {

    /* renamed from: c */
    public static WeakReference<Activity> f89541c;

    /* renamed from: a */
    public boolean f89542a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<Intent> f89543b = new ConcurrentLinkedQueue<>();

    /* renamed from: hm3.a$a */
    public static final class C32952a extends C80403e {

        /* renamed from: b */
        public final /* synthetic */ C32951a f89544b;

        /* renamed from: hm3.a$a$a */
        public static final class C32953a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32951a f89545d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C32953a(C32951a aVar) {
                super(0);
                this.f89545d = aVar;
            }

            public Object invoke() {
                while ((!this.f89545d.f89543b.isEmpty()) && AppUIForegroundOwner.INSTANCE.isForeground()) {
                    Intent poll = this.f89545d.f89543b.poll();
                    if (poll != null) {
                        this.f89545d.mo58885a(poll);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C32952a(C32951a aVar) {
            this.f89544b = aVar;
        }

        /* renamed from: a */
        public void mo56329a() {
            C61926c.m72668M(new C32953a(this.f89544b));
        }

        /* renamed from: b */
        public void mo56330b() {
        }
    }

    public C32951a() {
        AppUIForegroundOwner.INSTANCE.addLifecycleCallback((C80403e) new C32952a(this));
    }

    /* renamed from: a */
    public void mo58885a(Intent intent) {
        C13598b0 b0Var;
        Activity activity;
        C87412m.m108594g(intent, "intent");
        String c = mo58887c();
        WeakReference<Activity> weakReference = f89541c;
        Activity activity2 = null;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            b0Var = null;
        } else {
            C79397a.C79398a aVar = new C79397a.C79398a();
            aVar.f232918a.f232909a = activity;
            aVar.mo109373c(intent);
            aVar.mo109371a(c);
            aVar.mo109374d();
            Log.m105924i("MicroMsg.BaseHalfScreenWarningHelper", "start half screen warning activity: " + c);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("no valid src Activity, weak = ");
            sb.append(f89541c);
            sb.append(" -> ");
            WeakReference<Activity> weakReference2 = f89541c;
            if (weakReference2 != null) {
                activity2 = weakReference2.get();
            }
            sb.append(activity2);
            Log.m105920e("MicroMsg.BaseHalfScreenWarningHelper", sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo58886b(Intent intent) {
        C87412m.m108594g(intent, "intent");
        if (this.f89542a) {
            Log.m105920e("MicroMsg.BaseHalfScreenWarningHelper", "muted");
        } else if (AppUIForegroundOwner.INSTANCE.isForeground()) {
            mo58885a(intent);
        } else {
            this.f89543b.offer(intent);
        }
    }

    /* renamed from: c */
    public abstract String mo58887c();
}
