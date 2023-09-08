package nu3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import ny3.C89104m;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: nu3.c */
public final class C21691c implements C117639a {

    /* renamed from: d */
    public static final /* synthetic */ C89104m[] f61393d;

    /* renamed from: e */
    public static final Handler f61394e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public static final C13601g f61395f;

    /* renamed from: g */
    public static final C21691c f61396g = new C21691c();

    /* renamed from: nu3.c$b */
    public static final class C11275b extends C87413o implements C32224a<ArrayList<HandlerThread>> {

        /* renamed from: d */
        public static final C11275b f33203d = new C11275b();

        public C11275b() {
            super(0);
        }

        public Object invoke() {
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i <= 50; i++) {
                arrayList.add(new HandlerThread("#StubHT-" + i));
            }
            return arrayList;
        }
    }

    /* renamed from: nu3.c$a */
    public static final class C21692a extends C87413o implements C32224a<ScheduledExecutorService> {

        /* renamed from: d */
        public static final C21692a f61397d = new C21692a();

        public C21692a() {
            super(0);
        }

        public Object invoke() {
            return Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        }
    }

    static {
        Class<C21691c> cls = C21691c.class;
        f61393d = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "stubExecutor", "getStubExecutor()Ljava/util/concurrent/ScheduledExecutorService;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "stubHandlerThreads", "getStubHandlerThreads()Ljava/util/List;"))};
        C13602i iVar = C13602i.SYNCHRONIZED;
        f61395f = C36568h.m40986b(iVar, C21692a.f61397d);
        C36568h.m40986b(iVar, C11275b.f33203d);
        new LinkedHashMap();
    }

    /* renamed from: a */
    public Future<?> mo11331a(Runnable runnable) {
        C87412m.m108595h(runnable, "runnable");
        FutureTask futureTask = new FutureTask(runnable, (Object) null);
        f61394e.post(futureTask);
        return futureTask;
    }

    public Future<?> execute(Runnable runnable) {
        C87412m.m108595h(runnable, "runnable");
        FutureTask futureTask = new FutureTask(runnable, (Object) null);
        C13601g gVar = f61395f;
        C89104m mVar = f61393d[0];
        ((ScheduledExecutorService) gVar.getValue()).execute(futureTask);
        return futureTask;
    }
}
