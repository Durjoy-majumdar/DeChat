package ku3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import eu3.C116786g;
import gu3.C116992c;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ku3.C117409a;
import lu3.C117479j;
import zt3.C119146d;

/* renamed from: ku3.b */
public class C117411b extends C117409a implements Handler.Callback {

    /* renamed from: e */
    public final C117412a f351450e;

    /* renamed from: f */
    public final Handler f351451f = C116992c.m165057a("ColdPoolLeader", this);

    /* renamed from: ku3.b$a */
    public class C117412a extends ThreadPoolExecutor implements C117409a.C117410a {

        /* renamed from: d */
        public int f351452d;

        /* renamed from: e */
        public int f351453e;

        /* renamed from: f */
        public int f351454f = 1;

        /* renamed from: ku3.b$a$a */
        public class C117413a implements ThreadFactory {

            /* renamed from: d */
            public AtomicInteger f351456d = new AtomicInteger(0);

            /* renamed from: e */
            public final /* synthetic */ C117411b f351457e;

            public C117413a(C117411b bVar) {
                this.f351457e = bVar;
            }

            public Thread newThread(Runnable runnable) {
                StringBuilder sb = new StringBuilder();
                this.f351457e.getClass();
                sb.append("ColdPool");
                sb.append("#");
                sb.append(this.f351456d.getAndIncrement());
                return C116786g.m164739b(sb.toString(), runnable, 5);
            }
        }

        /* renamed from: ku3.b$a$b */
        public class C117414b implements RejectedExecutionHandler {
            public C117414b(C117411b bVar) {
            }

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        }

        public C117412a(int i, int i2) {
            super(i, i2, 10, TimeUnit.MINUTES, new LinkedBlockingQueue(), new C117413a(C117411b.this), new C117414b(C117411b.this));
            this.f351452d = i;
            this.f351453e = i2;
        }

        /* renamed from: a */
        public void mo182102a(C117479j<?> jVar) {
            long delay = jVar.getDelay(TimeUnit.MILLISECONDS);
            if (delay <= 0) {
                execute(jVar);
                return;
            }
            Handler handler = C117411b.this.f351451f;
            handler.sendMessageAtTime(handler.obtainMessage(0, jVar), SystemClock.uptimeMillis() + delay);
        }

        public void afterExecute(Runnable runnable, Throwable th) {
            int i;
            super.afterExecute(runnable, th);
            if (getQueue().isEmpty() && getCorePoolSize() > (i = this.f351452d)) {
                setCorePoolSize(i);
                this.f351454f = 1;
                C119146d.f356851c.mo125766w("ColdPool", "reset to corePoolSize(%s)", Integer.valueOf(this.f351452d));
            }
        }

        public void execute(Runnable runnable) {
            int i;
            int corePoolSize = getCorePoolSize();
            if (getQueue().size() >= this.f351454f * 10 && (i = corePoolSize + 1) <= this.f351453e) {
                setCorePoolSize(i);
                C119146d.f356851c.mo125766w("ColdPool", "increment to expand cold pool; queue size=%s currentCoreSize=%s bufferSizeFactor=%s", Integer.valueOf(getQueue().size()), Integer.valueOf(corePoolSize), Integer.valueOf(this.f351454f));
                this.f351454f++;
            }
            super.execute(runnable);
        }
    }

    public C117411b(int i, int i2) {
        this.f351450e = new C117412a(i, i2);
    }

    /* renamed from: a */
    public void mo182103a(C117479j<?> jVar) {
        this.f351451f.removeCallbacksAndMessages(jVar);
        this.f351450e.remove(jVar);
    }

    /* renamed from: b */
    public C117409a.C117410a mo182100b() {
        return this.f351450e;
    }

    /* renamed from: d */
    public List<String> mo182104d() {
        LinkedList linkedList = new LinkedList();
        for (Runnable next : this.f351450e.getQueue()) {
            if (next instanceof C117479j) {
                linkedList.add(((C117479j) next).getKey());
            } else {
                linkedList.add(next.toString());
            }
        }
        return linkedList;
    }

    /* renamed from: e */
    public void mo182105e() {
        this.f351450e.shutdown();
    }

    public String getName() {
        return "ColdPool";
    }

    public boolean handleMessage(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof C117479j)) {
            return false;
        }
        this.f351450e.execute((C117479j) obj);
        return true;
    }
}
