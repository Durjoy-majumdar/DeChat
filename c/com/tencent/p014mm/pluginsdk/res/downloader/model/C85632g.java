package com.tencent.p014mm.pluginsdk.res.downloader.model;

import android.os.Process;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85632g.C85634b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import zt3.C119143b;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.g */
public abstract class C85632g<T extends C85634b> {

    /* renamed from: a */
    public final Map<String, C85634b> f249573a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map<String, Future<?>> f249574b = new ConcurrentHashMap();

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.g$a */
    public class C85633a extends C119143b {
        public C85633a(String str, int i, int i2, BlockingQueue<Runnable> blockingQueue) {
            super(str, i, i2, blockingQueue);
        }

        /* renamed from: b */
        public void mo72173b(Runnable runnable, Throwable th) {
            if (runnable instanceof C85635c) {
                C85635c cVar = (C85635c) runnable;
                ((ConcurrentHashMap) C85632g.this.f249574b).remove(cVar.f249576d.mo119169a());
                ((ConcurrentHashMap) C85632g.this.f249573a).remove(cVar.f249576d.mo119169a());
                return;
            }
            Log.m105925i("MicroMsg.ResDownloader.IOWorker", "r = %s is not RequestFutureTask<?>", runnable.getClass().getSimpleName());
        }

        /* renamed from: c */
        public void mo72174c(Thread thread, Runnable runnable) {
            if (runnable instanceof C85635c) {
                C85635c cVar = (C85635c) runnable;
                if (((ConcurrentHashMap) C85632g.this.f249574b).containsKey(cVar.f249576d.mo119169a())) {
                    cVar.cancel(false);
                    return;
                }
                ((ConcurrentHashMap) C85632g.this.f249574b).put(cVar.f249576d.mo119169a(), cVar);
                ((ConcurrentHashMap) C85632g.this.f249573a).remove(cVar.f249576d.mo119169a());
                return;
            }
            Log.m105925i("MicroMsg.ResDownloader.IOWorker", "r = %s is not RequestFutureTask<?>", runnable.getClass().getSimpleName());
        }

        /* renamed from: k */
        public void mo72175k() {
            ((ConcurrentHashMap) C85632g.this.f249574b).clear();
            super.mo72175k();
        }

        public <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
            return runnable instanceof C85636d ? new C85635c(runnable, v, ((C85636d) runnable).f249577d) : super.newTaskFor(runnable, v);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.g$b */
    public interface C85634b {
        /* renamed from: a */
        String mo119169a();
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.g$c */
    public static class C85635c<V> extends FutureTask<V> {

        /* renamed from: d */
        public final C85634b f249576d;

        public C85635c(Runnable runnable, V v, C85634b bVar) {
            super(runnable, v);
            this.f249576d = bVar;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.g$d */
    public static abstract class C85636d<Req extends C85634b> implements Runnable {

        /* renamed from: d */
        public final Req f249577d;

        public C85636d(Req req) {
            this.f249577d = req;
        }

        /* renamed from: c */
        public Req mo113638c() {
            return this.f249577d;
        }

        public void run() {
            if (Process.getThreadPriority(Process.myTid()) != 10) {
                Process.setThreadPriority(10);
            }
        }
    }

    /* renamed from: b */
    public final void mo119164b(String str) {
        Future future = (Future) ((ConcurrentHashMap) this.f249574b).remove(str);
        if (future != null) {
            future.cancel(true);
        }
        ((ConcurrentHashMap) this.f249573a).remove(str);
    }

    /* renamed from: c */
    public final void mo119165c() {
        for (String str : ((ConcurrentHashMap) this.f249574b).keySet()) {
            Future future = (Future) ((ConcurrentHashMap) this.f249574b).get(str);
            if (future != null) {
                future.cancel(true);
            }
        }
        ((ConcurrentHashMap) this.f249573a).clear();
        ((ConcurrentHashMap) this.f249574b).clear();
    }

    /* renamed from: d */
    public abstract C119143b mo119161d();

    /* renamed from: e */
    public synchronized boolean mo119166e(String str) {
        return ((ConcurrentHashMap) this.f249574b).containsKey(str) || ((ConcurrentHashMap) this.f249573a).containsKey(str);
    }

    /* renamed from: f */
    public abstract C85636d mo113633f(T t);

    /* renamed from: g */
    public final void mo119167g(T t) {
        ((ConcurrentHashMap) this.f249573a).put(t.mo119169a(), t);
        mo119161d().submit(mo113633f(t));
    }
}
