package ku3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import eu3.C116786g;
import gu3.C116992c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ku3.C117409a;
import lu3.C117479j;

/* renamed from: ku3.c */
public class C117415c extends C117409a implements Handler.Callback {

    /* renamed from: e */
    public final C117416a f351458e;

    /* renamed from: f */
    public final Handler f351459f = C116992c.m165057a("HotPoolLeader", this);

    /* renamed from: ku3.c$a */
    public class C117416a extends ThreadPoolExecutor implements C117409a.C117410a {

        /* renamed from: ku3.c$a$a */
        public class C117417a implements ThreadFactory {

            /* renamed from: d */
            public AtomicInteger f351461d = new AtomicInteger(0);

            /* renamed from: e */
            public final /* synthetic */ C117415c f351462e;

            public C117417a(C117415c cVar) {
                this.f351462e = cVar;
            }

            public Thread newThread(Runnable runnable) {
                StringBuilder sb = new StringBuilder();
                this.f351462e.getClass();
                sb.append("HotPool");
                sb.append("#");
                sb.append(this.f351461d.getAndIncrement());
                return C116786g.m164739b(sb.toString(), runnable, 7);
            }
        }

        /* renamed from: ku3.c$a$b */
        public class C117418b implements RejectedExecutionHandler {
            public C117418b(C117415c cVar) {
            }

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        }

        public C117416a(int i) {
            super(i, i, 2147483647L, TimeUnit.HOURS, new LinkedBlockingQueue(), new C117417a(C117415c.this), new C117418b(C117415c.this));
        }

        /* renamed from: a */
        public void mo182102a(C117479j<?> jVar) {
            long delay = jVar.getDelay(TimeUnit.MILLISECONDS);
            if (delay <= 0) {
                execute(jVar);
                return;
            }
            Handler handler = C117415c.this.f351459f;
            handler.sendMessageAtTime(handler.obtainMessage(0, jVar), SystemClock.uptimeMillis() + delay);
        }
    }

    public C117415c(int i) {
        this.f351458e = new C117416a(i);
    }

    /* renamed from: a */
    public void mo182103a(C117479j<?> jVar) {
        this.f351459f.removeCallbacksAndMessages(jVar);
        this.f351458e.remove(jVar);
    }

    /* renamed from: b */
    public C117409a.C117410a mo182100b() {
        return this.f351458e;
    }

    /* renamed from: d */
    public void mo182112d() {
        this.f351458e.shutdownNow();
    }

    public String getName() {
        return "HotPool";
    }

    public boolean handleMessage(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof C117479j)) {
            return false;
        }
        this.f351458e.execute((C117479j) obj);
        return true;
    }
}
