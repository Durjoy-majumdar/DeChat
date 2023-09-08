package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.internal.C113896kq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mapsdk.internal.kb */
public final class C113865kb {

    /* renamed from: a */
    private static final Handler f340651a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static C113873c f340652b;

    /* renamed from: c */
    private static AtomicInteger f340653c = new AtomicInteger();

    /* renamed from: d */
    private static volatile boolean f340654d;

    /* renamed from: com.tencent.mapsdk.internal.kb$a */
    public static abstract class C113868a<T> implements Callback<T>, Runnable {
        public abstract void callback(T t);

        public void run() {
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.kb$b */
    public static class C113869b extends HandlerThread {

        /* renamed from: a */
        public static final String f340656a = "tms-dsp";

        /* renamed from: h */
        private static final int f340657h = 1;

        /* renamed from: i */
        private static final int f340658i = 300;

        /* renamed from: b */
        private boolean f340659b;

        /* renamed from: c */
        private boolean f340660c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public volatile boolean f340661d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Handler f340662e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final ConcurrentLinkedQueue<C113871a> f340663f = new ConcurrentLinkedQueue<>();

        /* renamed from: g */
        private final List<C113871a> f340664g = new LinkedList();

        /* renamed from: com.tencent.mapsdk.internal.kb$b$a */
        public class C113871a<T> {

            /* renamed from: a */
            public static final int f340666a = 0;

            /* renamed from: b */
            public static final int f340667b = 1;

            /* renamed from: c */
            public static final int f340668c = 2;

            /* renamed from: d */
            public static final int f340669d = 3;

            /* renamed from: e */
            public static final int f340670e = 4;

            /* renamed from: f */
            public boolean f340671f;

            /* renamed from: g */
            public C113876d<T> f340672g;

            /* renamed from: h */
            public final C113879g<T> f340673h;

            /* renamed from: i */
            public C113868a<T> f340674i;

            /* renamed from: j */
            public Future<T> f340675j;

            /* renamed from: k */
            public T f340676k;

            /* renamed from: l */
            public int f340677l;

            /* renamed from: m */
            public int f340678m;

            public /* synthetic */ C113871a(C113869b bVar, C113879g gVar, byte b) {
                this(gVar);
            }

            /* renamed from: b */
            private void m157417b(C113876d<T> dVar) {
                this.f340672g = dVar;
                C113879g<T> gVar = this.f340673h;
                if (gVar != null) {
                    C113868a unused = gVar.f340688a = new C113868a<T>() {
                        public final void callback(T t) {
                            C113871a.this.f340676k = t;
                        }
                    };
                }
            }

            /* renamed from: c */
            private void m157418c() {
                mo172276a(new C113877e(null)).mo172277a();
            }

            /* renamed from: d */
            private boolean m157419d() {
                this.f340677l++;
                C113896kq.m157677f(C0949kl.f2249s).mo172332a("try time:" + this.f340677l);
                if (this.f340677l >= 2) {
                    return false;
                }
                this.f340671f = false;
                mo172277a();
                return true;
            }

            /* renamed from: e */
            private void m157420e() {
                C113879g<T> gVar;
                C113896kq.m157677f(C0949kl.f2249s).mo172332a(new Object[0]);
                C113876d<T> dVar = this.f340672g;
                if (!(dVar == null || (gVar = this.f340673h) == null)) {
                    this.f340675j = dVar.mo172284a(gVar);
                }
                C113896kq.m157677f(C0949kl.f2249s).mo172332a(new Object[0]);
                this.f340678m = 2;
            }

            /* renamed from: f */
            private void m157421f() {
                C113896kq.C113898a f = C113896kq.m157677f(C0949kl.f2249s);
                f.mo172332a("result:" + this.f340676k, "userCallback:" + this.f340674i);
                C113868a<T> aVar = this.f340674i;
                if (aVar != null) {
                    aVar.callback(this.f340676k);
                }
            }

            /* renamed from: g */
            private void m157422g() {
                C113896kq.m157677f(C0949kl.f2249s).mo172332a(new Object[0]);
                Future<T> future = this.f340675j;
                if (future != null && !this.f340671f) {
                    if (future.isDone()) {
                        this.f340678m = 3;
                    } else if (this.f340675j.isCancelled()) {
                        this.f340676k = this.f340675j.get();
                        mo172281b();
                    }
                }
            }

            private C113871a(C113879g<T> gVar) {
                this.f340678m = 0;
                this.f340673h = gVar;
                if (gVar == null || C113869b.this.f340661d) {
                    this.f340671f = true;
                }
            }

            /* renamed from: a */
            public final C113871a<T> mo172276a(C113876d<T> dVar) {
                C113869b.this.f340663f.add(this);
                C113896kq.C113898a f = C113896kq.m157677f(C0949kl.f2249s);
                f.mo172332a("dispatchHandler:" + C113869b.this.f340662e);
                m157417b(dVar);
                return this;
            }

            /* renamed from: b */
            public final void mo172282b(C113868a<T> aVar) {
                this.f340674i = aVar;
                mo172277a();
            }

            /* renamed from: b */
            public final void mo172281b() {
                C113896kq.m157677f(C0949kl.f2249s).mo172332a(new Object[0]);
                this.f340671f = true;
                Future<T> future = this.f340675j;
                if (future != null) {
                    future.cancel(false);
                }
                this.f340678m = 4;
            }

            /* renamed from: a */
            public final void mo172279a(T t) {
                if (!C113869b.this.f340661d) {
                    mo172276a(new C113878f(t)).mo172277a();
                }
            }

            /* renamed from: a */
            public final void mo172278a(C113868a<T> aVar) {
                if (!C113869b.this.f340661d) {
                    mo172276a(new C113878f(null)).mo172282b(aVar);
                }
            }

            /* renamed from: a */
            public final void mo172280a(T t, C113868a<T> aVar) {
                mo172276a(new C113877e(t)).mo172282b(aVar);
            }

            /* renamed from: a */
            public final void mo172277a() {
                C113896kq.m157677f(C0949kl.f2249s).mo172332a(new Object[0]);
                if (this.f340671f || C113869b.this.f340661d) {
                    C113896kq.m157677f(C0949kl.f2249s).mo172332a("cancelled...");
                    return;
                }
                this.f340678m = 1;
                if (C113869b.this.f340662e != null) {
                    C113869b.this.f340662e.sendEmptyMessage(1);
                }
            }
        }

        public C113869b() {
            super(f340656a);
        }

        public final void onLooperPrepared() {
            super.onLooperPrepared();
            this.f340659b = true;
            this.f340662e = new Handler(getLooper()) {
                public final void dispatchMessage(Message message) {
                    super.dispatchMessage(message);
                    if (message.what == 1) {
                        try {
                            if (C113869b.this.m157408a()) {
                                C113869b.this.f340662e.sendEmptyMessageDelayed(1, 300);
                            }
                        } catch (Throwable th) {
                            C113889km.m157540a("MSG_SYNC_CHECK ERR:", th);
                        }
                    }
                }
            };
            C113896kq.m157677f(C0949kl.f2249s).mo172332a("looper is prepared...");
            this.f340662e.sendEmptyMessage(1);
        }

        public final boolean quit() {
            boolean quit = super.quit();
            if (quit) {
                m157411b();
                this.f340661d = true;
            }
            return quit;
        }

        public final boolean quitSafely() {
            boolean quitSafely = super.quitSafely();
            if (quitSafely) {
                m157411b();
                this.f340661d = true;
            }
            return quitSafely;
        }

        /* renamed from: a */
        private void m157407a(C113873c cVar) {
            cVar.mo172283a(f340656a, this);
        }

        /* renamed from: b */
        private void m157411b() {
            Iterator<C113871a> it = this.f340663f.iterator();
            while (it.hasNext()) {
                C113871a next = it.next();
                if (next != null) {
                    next.mo172281b();
                }
            }
            for (C113871a next2 : this.f340664g) {
                if (next2 != null) {
                    next2.mo172281b();
                }
            }
            this.f340663f.clear();
            this.f340664g.clear();
            C113896kq.m157677f(C0949kl.f2249s).mo172332a("cancelAll...");
            Handler handler = this.f340662e;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m157408a() {
            boolean z;
            C113871a poll;
            C113879g<T> gVar;
            if (!this.f340663f.isEmpty() && (poll = this.f340663f.poll()) != null && poll.f340678m == 1) {
                C113896kq.m157677f(C0949kl.f2249s).mo172332a(new Object[0]);
                C113876d<T> dVar = poll.f340672g;
                if (!(dVar == null || (gVar = poll.f340673h) == null)) {
                    poll.f340675j = dVar.mo172284a(gVar);
                }
                C113896kq.m157677f(C0949kl.f2249s).mo172332a(new Object[0]);
                poll.f340678m = 2;
                this.f340664g.add(poll);
            }
            Iterator<C113871a> it = this.f340664g.iterator();
            while (it.hasNext()) {
                C113871a next = it.next();
                if (next != null) {
                    int i = next.f340678m;
                    if (i == 2) {
                        try {
                            C113896kq.m157677f(C0949kl.f2249s).mo172332a(new Object[0]);
                            Future<T> future = next.f340675j;
                            if (future != null && !next.f340671f) {
                                if (future.isDone()) {
                                    next.f340678m = 3;
                                } else if (next.f340675j.isCancelled()) {
                                    next.f340676k = next.f340675j.get();
                                    next.mo172281b();
                                }
                            }
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    } else if (i == 3) {
                        C113896kq.m157677f(C0949kl.f2249s).mo172332a("result:" + next.f340676k, "userCallback:" + next.f340674i);
                        C113868a<T> aVar = next.f340674i;
                        if (aVar != null) {
                            aVar.callback(next.f340676k);
                        }
                        it.remove();
                    } else if (i == 4) {
                        next.f340677l++;
                        C113896kq.m157677f(C0949kl.f2249s).mo172332a("try time:" + next.f340677l);
                        if (next.f340677l < 2) {
                            next.f340671f = false;
                            next.mo172277a();
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            this.f340663f.offer(next);
                        }
                        it.remove();
                    }
                }
            }
            return !this.f340664g.isEmpty();
        }

        /* renamed from: a */
        public final synchronized <T> C113871a<T> mo172271a(C113879g<T> gVar) {
            C113896kq.C113898a f = C113896kq.m157677f(C0949kl.f2249s);
            f.mo172332a("prepared:" + this.f340659b);
            if (!this.f340659b && !this.f340660c && !this.f340661d) {
                start();
                this.f340660c = true;
            }
            return new C113871a<>(this, gVar, (byte) 0);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.kb$c */
    public static class C113873c {

        /* renamed from: a */
        public final Map<String, HandlerThread> f340681a = new HashMap();

        /* renamed from: b */
        public final C113869b f340682b = new C113869b();

        /* renamed from: b */
        private C113869b m157433b() {
            return this.f340682b;
        }

        /* renamed from: c */
        private void m157434c() {
            if (!this.f340681a.isEmpty()) {
                final ArrayList arrayList = new ArrayList();
                Util.foreach(this.f340681a.entrySet(), new C113868a<Map.Entry<String, HandlerThread>>() {
                    /* renamed from: a */
                    private void m157436a(Map.Entry<String, HandlerThread> entry) {
                        HandlerThread value;
                        if (entry != null && (value = entry.getValue()) != null) {
                            value.quitSafely();
                            arrayList.add(entry.getKey());
                        }
                    }

                    public final /* synthetic */ void callback(Object obj) {
                        HandlerThread handlerThread;
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry != null && (handlerThread = (HandlerThread) entry.getValue()) != null) {
                            handlerThread.quitSafely();
                            arrayList.add(entry.getKey());
                        }
                    }
                });
                Util.foreach(arrayList, new C113868a<String>() {
                    /* renamed from: a */
                    private void m157437a(String str) {
                        if (str != null) {
                            C113873c.this.f340681a.remove(str);
                        }
                    }

                    public final /* synthetic */ void callback(Object obj) {
                        String str = (String) obj;
                        if (str != null) {
                            C113873c.this.f340681a.remove(str);
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        private void m157432a() {
            mo172283a(C113869b.f340656a, this.f340682b);
        }

        /* renamed from: a */
        public final void mo172283a(String str, HandlerThread handlerThread) {
            if (str != null && !str.isEmpty()) {
                this.f340681a.put(str, handlerThread);
            }
        }

        /* renamed from: a */
        private Looper m157430a(String str) {
            String concat = "tms-".concat(String.valueOf(str));
            HandlerThread handlerThread = this.f340681a.get(concat);
            if (handlerThread == null || handlerThread.getThreadId() == -1) {
                handlerThread = new HandlerThread(concat);
                handlerThread.start();
                mo172283a(concat, handlerThread);
            }
            return handlerThread.getLooper();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.kb$d */
    public interface C113876d<T> {
        /* renamed from: a */
        Future<T> mo172284a(C113879g<T> gVar);
    }

    /* renamed from: com.tencent.mapsdk.internal.kb$e */
    public static class C113877e<T> implements C113876d<T> {

        /* renamed from: a */
        public T f340686a;

        public C113877e(T t) {
            this.f340686a = t;
        }

        /* renamed from: a */
        public final Future<T> mo172284a(C113879g<T> gVar) {
            return C113802hg.m157151a().submit(gVar, this.f340686a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.kb$f */
    public static class C113878f<T> implements C113876d<T> {

        /* renamed from: a */
        public T f340687a;

        public C113878f(T t) {
            this.f340687a = t;
        }

        /* renamed from: a */
        public final Future<T> mo172284a(C113879g<T> gVar) {
            return C113802hg.m157153b().submit(gVar, this.f340687a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.kb$g */
    public static abstract class C113879g<T> implements Runnable, Callable<T> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C113868a<T> f340688a;

        public final void run() {
            try {
                Object call = call();
                C113868a<T> aVar = this.f340688a;
                if (aVar != null) {
                    aVar.callback(call);
                }
            } catch (Exception unused) {
            }
        }
    }

    static {
        C113896kq.m157679g(C0949kl.f2249s);
    }

    /* renamed from: a */
    public static void m157399a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            f340651a.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    public static void m157402b(final Runnable runnable) {
        m157396a(new C113879g<Void>() {
            /* renamed from: a */
            private Void m157406a() {
                runnable.run();
                return null;
            }

            public final /* synthetic */ Object call() {
                runnable.run();
                return null;
            }
        }).mo172276a(new C113877e(null)).mo172277a();
    }

    /* renamed from: c */
    public static void m157403c() {
        f340653c.decrementAndGet();
    }

    /* renamed from: d */
    public static void m157404d() {
        if (f340653c.get() <= 0) {
            C113889km.m157550c(C0949kl.f2249s, "sDispatcher clean quit finally curCnt: " + f340653c);
            C113873c cVar = f340652b;
            if (cVar != null) {
                if (!cVar.f340681a.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Util.foreach(cVar.f340681a.entrySet(), new C113868a<Map.Entry<String, HandlerThread>>(arrayList) {
                        /* renamed from: a */
                        private void m157436a(Map.Entry<String, HandlerThread> entry) {
                            HandlerThread value;
                            if (entry != null && (value = entry.getValue()) != null) {
                                value.quitSafely();
                                arrayList.add(entry.getKey());
                            }
                        }

                        public final /* synthetic */ void callback(Object obj) {
                            HandlerThread handlerThread;
                            Map.Entry entry = (Map.Entry) obj;
                            if (entry != null && (handlerThread = (HandlerThread) entry.getValue()) != null) {
                                handlerThread.quitSafely();
                                arrayList.add(entry.getKey());
                            }
                        }
                    });
                    Util.foreach(arrayList, new C113868a<String>() {
                        /* renamed from: a */
                        private void m157437a(String str) {
                            if (str != null) {
                                C113873c.this.f340681a.remove(str);
                            }
                        }

                        public final /* synthetic */ void callback(Object obj) {
                            String str = (String) obj;
                            if (str != null) {
                                C113873c.this.f340681a.remove(str);
                            }
                        }
                    });
                }
                f340654d = true;
            }
            f340653c.set(0);
        } else {
            C113889km.m157550c(C0949kl.f2249s, "sDispatcher clean quiting curCnt: " + f340653c);
        }
        f340651a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: e */
    private static Looper m157405e() {
        C113873c cVar = f340652b;
        if (cVar == null) {
            return null;
        }
        return cVar.f340682b.getLooper();
    }

    /* renamed from: b */
    public static void m157401b() {
        f340653c.incrementAndGet();
    }

    /* renamed from: a */
    public static void m157400a(Runnable runnable, long j) {
        if (runnable != null) {
            f340651a.postDelayed(runnable, j);
        }
    }

    /* renamed from: a */
    public static Looper m157395a(String str) {
        C113873c cVar = f340652b;
        if (cVar == null) {
            return null;
        }
        String concat = "tms-".concat(String.valueOf(str));
        HandlerThread handlerThread = cVar.f340681a.get(concat);
        if (handlerThread == null || handlerThread.getThreadId() == -1) {
            handlerThread = new HandlerThread(concat);
            handlerThread.start();
            cVar.mo172283a(concat, handlerThread);
        }
        return handlerThread.getLooper();
    }

    /* renamed from: a */
    public static C113873c m157397a() {
        return new C113873c();
    }

    /* renamed from: a */
    public static void m157398a(C113873c cVar) {
        C113889km.m157545b(C0949kl.f2249s, "sDispatcher registerDispatcher refCnt: " + f340653c.get());
        if (cVar != null && f340653c.get() <= 1) {
            C113873c cVar2 = f340652b;
            if (cVar2 == null || (cVar2 != null && f340654d)) {
                f340652b = cVar;
                cVar.mo172283a(C113869b.f340656a, cVar.f340682b);
                f340654d = false;
            }
            Looper looper = f340652b.f340682b.getLooper();
            if (looper != null) {
                looper.setMessageLogging(new Printer() {
                    public final void println(String str) {
                        C113889km.m157550c(C0949kl.f2249s, str);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static <T> C113869b.C113871a<T> m157396a(C113879g<T> gVar) {
        C113896kq.m157677f(C0949kl.f2249s).mo172332a(gVar);
        return f340652b.f340682b.mo172271a(gVar);
    }
}
