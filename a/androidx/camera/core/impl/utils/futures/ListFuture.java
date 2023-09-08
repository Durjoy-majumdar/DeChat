package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;

class ListFuture<V> implements C112608f<List<V>> {
    private final boolean mAllMustSucceed;
    public List<? extends C112608f<? extends V>> mFutures;
    private final AtomicInteger mRemaining;
    private final C112608f<List<V>> mResult = C117512b.m165760a(new C117512b.C117515c<List<V>>() {
        public Object attachCompleter(C117512b.C117513a<List<V>> aVar) {
            C20434g.m22021e(ListFuture.this.mResultNotifier == null, "The result can only set once!");
            ListFuture.this.mResultNotifier = aVar;
            return "ListFuture[" + this + "]";
        }
    });
    public C117512b.C117513a<List<V>> mResultNotifier;
    public List<V> mValues;

    public ListFuture(List<? extends C112608f<? extends V>> list, boolean z, Executor executor) {
        list.getClass();
        this.mFutures = list;
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z;
        this.mRemaining = new AtomicInteger(list.size());
        init(executor);
    }

    private void callAllGets() {
        List<? extends C112608f<? extends V>> list = this.mFutures;
        if (list != null && !isDone()) {
            for (C112608f fVar : list) {
                while (true) {
                    if (!fVar.isDone()) {
                        try {
                            fVar.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (Throwable unused) {
                            if (this.mAllMustSucceed) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private void init(Executor executor) {
        addListener(new Runnable() {
            public void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.mo182231a(new ArrayList(this.mValues));
            return;
        }
        for (int i = 0; i < this.mFutures.size(); i++) {
            this.mValues.add((Object) null);
        }
        List<? extends C112608f<? extends V>> list = this.mFutures;
        for (final int i2 = 0; i2 < list.size(); i2++) {
            final C112608f fVar = (C112608f) list.get(i2);
            fVar.addListener(new Runnable() {
                public void run() {
                    ListFuture.this.setOneValue(i2, fVar);
                }
            }, executor);
        }
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        List<? extends C112608f<? extends V>> list = this.mFutures;
        if (list != null) {
            for (C112608f cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.mResult.cancel(z);
    }

    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    public boolean isDone() {
        return this.mResult.isDone();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00bb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOneValue(int r8, java.util.concurrent.Future<? extends V> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Less than 0 remaining futures"
            java.util.List<V> r1 = r7.mValues
            boolean r2 = r7.isDone()
            if (r2 != 0) goto L_0x0105
            if (r1 != 0) goto L_0x000e
            goto L_0x0105
        L_0x000e:
            r2 = 0
            r3 = 1
            r4 = 0
            boolean r5 = r9.isDone()     // Catch:{ CancellationException -> 0x00bb, ExecutionException -> 0x0092, RuntimeException -> 0x006d, Error -> 0x004c }
            java.lang.String r6 = "Tried to set value from future which is not done"
            p329d3.C20434g.m22021e(r5, r6)     // Catch:{ CancellationException -> 0x00bb, ExecutionException -> 0x0092, RuntimeException -> 0x006d, Error -> 0x004c }
            java.lang.Object r9 = androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(r9)     // Catch:{ CancellationException -> 0x00bb, ExecutionException -> 0x0092, RuntimeException -> 0x006d, Error -> 0x004c }
            r1.set(r8, r9)     // Catch:{ CancellationException -> 0x00bb, ExecutionException -> 0x0092, RuntimeException -> 0x006d, Error -> 0x004c }
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            p329d3.C20434g.m22021e(r3, r0)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            m2.b$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
        L_0x003b:
            r9.mo182231a(r0)
            goto L_0x00de
        L_0x0040:
            boolean r8 = r7.isDone()
            p329d3.C20434g.m22021e(r8, r2)
            goto L_0x00de
        L_0x0049:
            r8 = move-exception
            goto L_0x00df
        L_0x004c:
            r8 = move-exception
            m2.b$a<java.util.List<V>> r9 = r7.mResultNotifier     // Catch:{ all -> 0x0049 }
            r9.mo182232b(r8)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            p329d3.C20434g.m22021e(r3, r0)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            m2.b$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L_0x003b
        L_0x006d:
            r8 = move-exception
            boolean r9 = r7.mAllMustSucceed     // Catch:{ all -> 0x0049 }
            if (r9 == 0) goto L_0x0077
            m2.b$a<java.util.List<V>> r9 = r7.mResultNotifier     // Catch:{ all -> 0x0049 }
            r9.mo182232b(r8)     // Catch:{ all -> 0x0049 }
        L_0x0077:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            p329d3.C20434g.m22021e(r3, r0)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            m2.b$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L_0x003b
        L_0x0092:
            r8 = move-exception
            boolean r9 = r7.mAllMustSucceed     // Catch:{ all -> 0x0049 }
            if (r9 == 0) goto L_0x00a0
            m2.b$a<java.util.List<V>> r9 = r7.mResultNotifier     // Catch:{ all -> 0x0049 }
            java.lang.Throwable r8 = r8.getCause()     // Catch:{ all -> 0x0049 }
            r9.mo182232b(r8)     // Catch:{ all -> 0x0049 }
        L_0x00a0:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            p329d3.C20434g.m22021e(r3, r0)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            m2.b$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L_0x003b
        L_0x00bb:
            boolean r8 = r7.mAllMustSucceed     // Catch:{ all -> 0x0049 }
            if (r8 == 0) goto L_0x00c2
            r7.cancel(r4)     // Catch:{ all -> 0x0049 }
        L_0x00c2:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r3 = 0
        L_0x00cc:
            p329d3.C20434g.m22021e(r3, r0)
            if (r8 != 0) goto L_0x00de
            java.util.List<V> r8 = r7.mValues
            if (r8 == 0) goto L_0x0040
            m2.b$a<java.util.List<V>> r9 = r7.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            goto L_0x003b
        L_0x00de:
            return
        L_0x00df:
            java.util.concurrent.atomic.AtomicInteger r9 = r7.mRemaining
            int r9 = r9.decrementAndGet()
            if (r9 < 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            p329d3.C20434g.m22021e(r3, r0)
            if (r9 != 0) goto L_0x0104
            java.util.List<V> r9 = r7.mValues
            if (r9 == 0) goto L_0x00fd
            m2.b$a<java.util.List<V>> r0 = r7.mResultNotifier
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            r0.mo182231a(r1)
            goto L_0x0104
        L_0x00fd:
            boolean r9 = r7.isDone()
            p329d3.C20434g.m22021e(r9, r2)
        L_0x0104:
            throw r8
        L_0x0105:
            boolean r8 = r7.mAllMustSucceed
            java.lang.String r9 = "Future was done before all dependencies completed"
            p329d3.C20434g.m22021e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.futures.ListFuture.setOneValue(int, java.util.concurrent.Future):void");
    }

    public List<V> get() {
        callAllGets();
        return this.mResult.get();
    }

    public List<V> get(long j, TimeUnit timeUnit) {
        return this.mResult.get(j, timeUnit);
    }
}
