package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.DownloadPriority;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.tencent.mapsdk.internal.lj */
public final class C113934lj {

    /* renamed from: a */
    public final Map<String, C113938a> f340793a = new Hashtable();

    /* renamed from: b */
    public ExecutorService f340794b;

    /* renamed from: c */
    public ExecutorService f340795c;

    /* renamed from: d */
    public final Set<C113933li> f340796d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private C113932lh f340797e;

    /* renamed from: com.tencent.mapsdk.internal.lj$3 */
    public static /* synthetic */ class C1139373 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f340806a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.mapsdk.internal.lk[] r0 = com.tencent.mapsdk.internal.C113939lk.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f340806a = r0
                com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f340806a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.CANCEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f340806a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f340806a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.RUNNING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f340806a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.FINISH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113934lj.C1139373.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.lj$a */
    public static class C113938a {

        /* renamed from: a */
        public Runnable f340807a;

        /* renamed from: b */
        public Future f340808b;

        /* renamed from: c */
        public C113932lh f340809c;

        /* renamed from: d */
        public C113939lk f340810d;

        private C113938a() {
        }

        public /* synthetic */ C113938a(byte b) {
            this();
        }

        /* renamed from: a */
        public final boolean mo172367a() {
            return this.f340810d == C113939lk.CANCEL;
        }

        /* renamed from: b */
        public final synchronized void mo172368b() {
            if (this.f340810d == C113939lk.START) {
                this.f340810d = C113939lk.RUNNING;
            }
        }

        /* renamed from: c */
        public final synchronized void mo172369c() {
            if (this.f340810d != null) {
                Future future = this.f340808b;
                if (future != null) {
                    future.cancel(true);
                }
                C113932lh lhVar = this.f340809c;
                if (lhVar != null) {
                    lhVar.mo172351a();
                }
                this.f340810d = C113939lk.CANCEL;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
            return;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo172370d() {
            /*
                r2 = this;
                monitor-enter(r2)
                com.tencent.mapsdk.internal.lk r0 = r2.f340810d     // Catch:{ all -> 0x0011 }
                if (r0 == 0) goto L_0x000f
                com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.RUNNING     // Catch:{ all -> 0x0011 }
                if (r0 != r1) goto L_0x000a
                goto L_0x000f
            L_0x000a:
                r2.mo172369c()     // Catch:{ all -> 0x0011 }
                monitor-exit(r2)
                return
            L_0x000f:
                monitor-exit(r2)
                return
            L_0x0011:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113934lj.C113938a.mo172370d():void");
        }

        /* renamed from: e */
        public final synchronized void mo172371e() {
            C113939lk lkVar = this.f340810d;
            if (lkVar == C113939lk.RUNNING || lkVar == C113939lk.FINISH) {
                this.f340810d = C113939lk.FINISH;
            }
        }

        /* renamed from: f */
        public final synchronized void mo172372f() {
            C113939lk lkVar = this.f340810d;
            if (!(lkVar == C113939lk.FINISH || lkVar == C113939lk.CANCEL)) {
                this.f340810d = C113939lk.ERROR;
            }
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("RequestBody{");
            stringBuffer.append("runnable=");
            stringBuffer.append(this.f340807a);
            stringBuffer.append(", requestFuture=");
            stringBuffer.append(this.f340808b);
            stringBuffer.append(", executor=");
            stringBuffer.append(this.f340809c);
            stringBuffer.append(", status=");
            stringBuffer.append(this.f340810d);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        /* renamed from: a */
        public final synchronized void mo172366a(ExecutorService executorService) {
            if (this.f340810d == null && this.f340807a != null && executorService != null && !C113802hg.m157152a(executorService)) {
                this.f340810d = C113939lk.START;
                this.f340808b = executorService.submit(this.f340807a);
            }
        }
    }

    /* renamed from: c */
    private Runnable m157852c(String str) {
        C113938a aVar = this.f340793a.get(str);
        if (aVar != null) {
            return aVar.f340807a;
        }
        return null;
    }

    /* renamed from: a */
    private void m157848a(ExecutorService executorService) {
        this.f340794b = executorService;
    }

    /* renamed from: b */
    public final void mo172362b(C113933li liVar) {
        this.f340796d.remove(liVar);
    }

    /* renamed from: b */
    private synchronized void m157850b() {
        this.f340797e = null;
        ExecutorService executorService = this.f340794b;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f340794b = null;
        }
        ExecutorService executorService2 = this.f340795c;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.f340795c = null;
        }
        this.f340796d.clear();
    }

    /* renamed from: a */
    public final void mo172357a(C113933li liVar) {
        if (liVar != null) {
            this.f340796d.remove(liVar);
            this.f340796d.add(liVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo172356a() {
        m157850b();
    }

    /* renamed from: a */
    public final synchronized void mo172359a(String str, C113932lh lhVar) {
        mo172360a(str, lhVar, DownloadPriority.NONE.getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo172360a(final java.lang.String r3, final com.tencent.mapsdk.internal.C113932lh r4, final int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            java.util.concurrent.ExecutorService r0 = r2.f340794b     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x000f
            boolean r0 = com.tencent.mapsdk.internal.C113802hg.m157152a(r0)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0015
        L_0x000f:
            java.util.concurrent.ThreadPoolExecutor r0 = com.tencent.mapsdk.internal.C113802hg.m157154c()     // Catch:{ all -> 0x003a }
            r2.f340794b = r0     // Catch:{ all -> 0x003a }
        L_0x0015:
            java.util.concurrent.ExecutorService r0 = r2.f340794b     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            boolean r0 = com.tencent.mapsdk.internal.C113802hg.m157152a(r0)     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            com.tencent.mapsdk.internal.lj$a r0 = new com.tencent.mapsdk.internal.lj$a     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lj$a> r1 = r2.f340793a     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            r1.put(r3, r0)     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            com.tencent.mapsdk.internal.lj$1 r1 = new com.tencent.mapsdk.internal.lj$1     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            r1.<init>(r3, r4, r5)     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            r0.f340807a = r1     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            r0.f340809c = r4     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            java.util.concurrent.ExecutorService r3 = r2.f340794b     // Catch:{ IllegalMonitorStateException -> 0x0038 }
            r0.mo172366a(r3)     // Catch:{ IllegalMonitorStateException -> 0x0038 }
        L_0x0036:
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113934lj.mo172360a(java.lang.String, com.tencent.mapsdk.internal.lh, int):void");
    }

    /* renamed from: b */
    public final synchronized void mo172363b(String str) {
        C113938a remove = this.f340793a.remove(str);
        if (remove != null) {
            remove.mo172369c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x009d A[SYNTHETIC, Splitter:B:53:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2 A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5 A[Catch:{ all -> 0x0098 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m157851b(java.lang.String r6, com.tencent.mapsdk.internal.C113932lh r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            com.tencent.map.lib.models.DownloadPriority r1 = com.tencent.map.lib.models.DownloadPriority.get(r8)     // Catch:{ Exception -> 0x009a }
            com.tencent.map.lib.models.DownloadPriority r2 = com.tencent.map.lib.models.DownloadPriority.NONE     // Catch:{ Exception -> 0x009a }
            if (r1 == r2) goto L_0x0014
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x009a }
            int r8 = com.tencent.map.lib.models.DownloadPriority.getThreadPriority(r8)     // Catch:{ Exception -> 0x009a }
            r1.setPriority(r8)     // Catch:{ Exception -> 0x009a }
        L_0x0014:
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lj$a> r8 = r5.f340793a     // Catch:{ Exception -> 0x009a }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x009a }
            com.tencent.mapsdk.internal.lj$a r8 = (com.tencent.mapsdk.internal.C113934lj.C113938a) r8     // Catch:{ Exception -> 0x009a }
            if (r8 != 0) goto L_0x0027
            com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.ERROR     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x0027:
            boolean r1 = r8.mo172367a()     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x0036
            com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.CANCEL     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x0036:
            java.io.InputStream r1 = r7.mo172354e(r6)     // Catch:{ Exception -> 0x009b }
            com.tencent.mapsdk.internal.lk r2 = r8.f340810d     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r2)     // Catch:{ Exception -> 0x009b }
            r8.mo172368b()     // Catch:{ Exception -> 0x009b }
            com.tencent.mapsdk.internal.lk r2 = r8.f340810d     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x0073
            r3 = 102400(0x19000, float:1.43493E-40)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x009b }
        L_0x004b:
            int r4 = r3.length     // Catch:{ Exception -> 0x009b }
            if (r4 == 0) goto L_0x006f
            byte[] r3 = com.tencent.mapsdk.internal.C113886kg.m157520a((java.io.InputStream) r1)     // Catch:{ Exception -> 0x009b }
            if (r3 == 0) goto L_0x0066
            r5.mo172361a((java.lang.String) r6, (byte[]) r3, (com.tencent.mapsdk.internal.C113939lk) r2)     // Catch:{ Exception -> 0x009b }
            boolean r4 = r8.mo172367a()     // Catch:{ Exception -> 0x009b }
            if (r4 == 0) goto L_0x004b
            com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.CANCEL     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x0066:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x009b }
            java.lang.String r2 = "下载过程读取失败"
            r1.<init>(r2)     // Catch:{ Exception -> 0x009b }
            throw r1     // Catch:{ Exception -> 0x009b }
        L_0x006f:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r1)     // Catch:{ Exception -> 0x009b }
            goto L_0x007d
        L_0x0073:
            byte[] r3 = r7.mo172355f(r6)     // Catch:{ Exception -> 0x009b }
            if (r3 == 0) goto L_0x007d
            int r1 = r3.length     // Catch:{ Exception -> 0x009b }
            if (r1 != 0) goto L_0x007d
            r3 = r0
        L_0x007d:
            boolean r1 = r8.mo172367a()     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008c
            com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.CANCEL     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x008c:
            r8.mo172371e()     // Catch:{ Exception -> 0x009b }
            com.tencent.mapsdk.internal.lk r1 = r8.f340810d     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r3, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x0098:
            r6 = move-exception
            goto L_0x00ae
        L_0x009a:
            r8 = r0
        L_0x009b:
            if (r8 == 0) goto L_0x00a0
            r8.mo172372f()     // Catch:{ all -> 0x0098 }
        L_0x00a0:
            if (r8 == 0) goto L_0x00a5
            com.tencent.mapsdk.internal.lk r8 = r8.f340810d     // Catch:{ all -> 0x0098 }
            goto L_0x00a7
        L_0x00a5:
            com.tencent.mapsdk.internal.lk r8 = com.tencent.mapsdk.internal.C113939lk.ERROR     // Catch:{ all -> 0x0098 }
        L_0x00a7:
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r8)     // Catch:{ all -> 0x0098 }
            r7.mo172353b()
            return
        L_0x00ae:
            r7.mo172353b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113934lj.m157851b(java.lang.String, com.tencent.mapsdk.internal.lh, int):void");
    }

    /* renamed from: a */
    public final synchronized void mo172358a(String str) {
        C113938a remove = this.f340793a.remove(str);
        if (remove != null) {
            remove.mo172370d();
        }
    }

    /* renamed from: a */
    public final void mo172361a(final String str, final byte[] bArr, final C113939lk lkVar) {
        if (!this.f340796d.isEmpty() && lkVar != null) {
            ExecutorService executorService = this.f340795c;
            if (executorService == null || C113802hg.m157152a(executorService)) {
                this.f340795c = C113802hg.m157153b();
            }
            if (!this.f340795c.isShutdown()) {
                this.f340795c.execute(new Runnable() {
                    public final void run() {
                        try {
                            for (C113933li next : C113934lj.this.f340796d) {
                                if (C113934lj.this.f340795c.isShutdown()) {
                                    return;
                                }
                                if (!C113934lj.this.f340795c.isTerminated()) {
                                    next.mo171883a(lkVar);
                                    int i = C1139373.f340806a[lkVar.ordinal()];
                                    if (i == 1) {
                                        next.mo171884a(str);
                                    } else if (i == 2) {
                                        next.mo171886b(str);
                                        next.mo171885a(str, bArr);
                                    } else if (i == 3 || i == 4) {
                                        if (bArr == null) {
                                            next.mo171888d(str);
                                        }
                                        next.mo171885a(str, bArr);
                                    } else if (i == 5) {
                                        if (bArr == null) {
                                            next.mo171888d(str);
                                        }
                                        next.mo171885a(str, bArr);
                                        next.mo171887c(str);
                                    }
                                } else {
                                    return;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x009d A[SYNTHETIC, Splitter:B:53:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2 A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5 A[Catch:{ all -> 0x0098 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void m157847a(com.tencent.mapsdk.internal.C113934lj r5, java.lang.String r6, com.tencent.mapsdk.internal.C113932lh r7, int r8) {
        /*
            r0 = 0
            com.tencent.map.lib.models.DownloadPriority r1 = com.tencent.map.lib.models.DownloadPriority.get(r8)     // Catch:{ Exception -> 0x009a }
            com.tencent.map.lib.models.DownloadPriority r2 = com.tencent.map.lib.models.DownloadPriority.NONE     // Catch:{ Exception -> 0x009a }
            if (r1 == r2) goto L_0x0014
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x009a }
            int r8 = com.tencent.map.lib.models.DownloadPriority.getThreadPriority(r8)     // Catch:{ Exception -> 0x009a }
            r1.setPriority(r8)     // Catch:{ Exception -> 0x009a }
        L_0x0014:
            java.util.Map<java.lang.String, com.tencent.mapsdk.internal.lj$a> r8 = r5.f340793a     // Catch:{ Exception -> 0x009a }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x009a }
            com.tencent.mapsdk.internal.lj$a r8 = (com.tencent.mapsdk.internal.C113934lj.C113938a) r8     // Catch:{ Exception -> 0x009a }
            if (r8 != 0) goto L_0x0027
            com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.ERROR     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x0027:
            boolean r1 = r8.mo172367a()     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x0036
            com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.CANCEL     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x0036:
            java.io.InputStream r1 = r7.mo172354e(r6)     // Catch:{ Exception -> 0x009b }
            com.tencent.mapsdk.internal.lk r2 = r8.f340810d     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r2)     // Catch:{ Exception -> 0x009b }
            r8.mo172368b()     // Catch:{ Exception -> 0x009b }
            com.tencent.mapsdk.internal.lk r2 = r8.f340810d     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x0073
            r3 = 102400(0x19000, float:1.43493E-40)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x009b }
        L_0x004b:
            int r4 = r3.length     // Catch:{ Exception -> 0x009b }
            if (r4 == 0) goto L_0x006f
            byte[] r3 = com.tencent.mapsdk.internal.C113886kg.m157520a((java.io.InputStream) r1)     // Catch:{ Exception -> 0x009b }
            if (r3 == 0) goto L_0x0066
            r5.mo172361a((java.lang.String) r6, (byte[]) r3, (com.tencent.mapsdk.internal.C113939lk) r2)     // Catch:{ Exception -> 0x009b }
            boolean r4 = r8.mo172367a()     // Catch:{ Exception -> 0x009b }
            if (r4 == 0) goto L_0x004b
            com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.CANCEL     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x0066:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x009b }
            java.lang.String r2 = "下载过程读取失败"
            r1.<init>(r2)     // Catch:{ Exception -> 0x009b }
            throw r1     // Catch:{ Exception -> 0x009b }
        L_0x006f:
            com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r1)     // Catch:{ Exception -> 0x009b }
            goto L_0x007d
        L_0x0073:
            byte[] r3 = r7.mo172355f(r6)     // Catch:{ Exception -> 0x009b }
            if (r3 == 0) goto L_0x007d
            int r1 = r3.length     // Catch:{ Exception -> 0x009b }
            if (r1 != 0) goto L_0x007d
            r3 = r0
        L_0x007d:
            boolean r1 = r8.mo172367a()     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008c
            com.tencent.mapsdk.internal.lk r1 = com.tencent.mapsdk.internal.C113939lk.CANCEL     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x008c:
            r8.mo172371e()     // Catch:{ Exception -> 0x009b }
            com.tencent.mapsdk.internal.lk r1 = r8.f340810d     // Catch:{ Exception -> 0x009b }
            r5.mo172361a((java.lang.String) r6, (byte[]) r3, (com.tencent.mapsdk.internal.C113939lk) r1)     // Catch:{ Exception -> 0x009b }
            r7.mo172353b()
            return
        L_0x0098:
            r5 = move-exception
            goto L_0x00ae
        L_0x009a:
            r8 = r0
        L_0x009b:
            if (r8 == 0) goto L_0x00a0
            r8.mo172372f()     // Catch:{ all -> 0x0098 }
        L_0x00a0:
            if (r8 == 0) goto L_0x00a5
            com.tencent.mapsdk.internal.lk r8 = r8.f340810d     // Catch:{ all -> 0x0098 }
            goto L_0x00a7
        L_0x00a5:
            com.tencent.mapsdk.internal.lk r8 = com.tencent.mapsdk.internal.C113939lk.ERROR     // Catch:{ all -> 0x0098 }
        L_0x00a7:
            r5.mo172361a((java.lang.String) r6, (byte[]) r0, (com.tencent.mapsdk.internal.C113939lk) r8)     // Catch:{ all -> 0x0098 }
            r7.mo172353b()
            return
        L_0x00ae:
            r7.mo172353b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113934lj.m157847a(com.tencent.mapsdk.internal.lj, java.lang.String, com.tencent.mapsdk.internal.lh, int):void");
    }
}
