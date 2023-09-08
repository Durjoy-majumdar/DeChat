package com.tencent.p014mm.pluginsdk.res.downloader.model;

import com.tencent.p014mm.plugin.appbrand.appcache.C81355t2;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115883d;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85632g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SdcardUtil;
import di3.C86312j;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p523fp.C87030f;
import zt3.C119143b;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.q */
public class C85640q extends C85632g<C85638o> {

    /* renamed from: c */
    public final C119143b f249602c;

    /* renamed from: d */
    public final C85630d f249603d;

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.q$a */
    public static abstract class C85641a<Req extends C85638o> extends C85632g.C85636d<Req> implements C85631f {

        /* renamed from: h */
        public static final ThreadLocal<C85637n> f249604h = new C85642a();

        /* renamed from: e */
        public final int f249605e;

        /* renamed from: f */
        public final AtomicInteger f249606f;

        /* renamed from: g */
        public volatile C85630d f249607g;

        /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.q$a$a */
        public class C85642a extends ThreadLocal<C85637n> {
            public Object initialValue() {
                return new C85637n();
            }
        }

        public C85641a(Req req) {
            super(req);
            int i = req.f249591k;
            this.f249605e = i;
            this.f249606f = new AtomicInteger(i);
        }

        /* renamed from: a */
        public String mo113636a() {
            return ((C85638o) mo113638c()).f249586f;
        }

        /* renamed from: b */
        public boolean mo113637b(long j) {
            this.f249607g.mo113645b(mo119192f(), j);
            long availableExternalMemorySize2 = SdcardUtil.getAvailableExternalMemorySize2();
            Log.m105925i("MicroMsg.ResDownloader.NetworkWorker", "%s: get available size = %d", mo119192f(), Long.valueOf(availableExternalMemorySize2));
            return availableExternalMemorySize2 >= j;
        }

        /* renamed from: d */
        public boolean mo119190d() {
            return this instanceof C81355t2.C81360e;
        }

        /* renamed from: e */
        public String mo119191e() {
            return ((C85638o) mo113638c()).mo119181c();
        }

        /* renamed from: f */
        public String mo119192f() {
            return ((C85638o) mo113638c()).f249581a;
        }

        /* renamed from: g */
        public C85639p mo113639g(C85637n nVar) {
            if (!(!(this instanceof C81355t2.C81360e))) {
                return nVar.mo119178i(this);
            }
            ((C87030f) C86312j.m106911c(C87030f.class)).mo121435So(mo119192f());
            return nVar.mo119178i(this);
        }

        public boolean retry() {
            boolean z = this.f249606f.decrementAndGet() > 0;
            this.f249607g.mo113644a(mo119192f(), this.f249605e, this.f249606f.get());
            return z;
        }

        public final void run() {
            C85639p g = mo113639g(f249604h.get());
            if (g != null) {
                this.f249607g.mo113646c(this, g);
                return;
            }
            Log.m105921e("MicroMsg.ResDownloader.NetworkWorker", "groupId = %s, performer get null response", getGroupId());
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.q$b */
    public static class C85643b extends C85641a<C85638o> {
        public C85643b(C85638o oVar) {
            super(oVar);
        }

        public String getGroupId() {
            return "ResDownload";
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.q$c */
    public static final class C85644c extends PriorityBlockingQueue<Runnable> {

        /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.q$c$a */
        public class C85645a implements Comparator<Runnable> {
            public int compare(Object obj, Object obj2) {
                int i;
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                if ((runnable instanceof C85632g.C85635c) && (runnable2 instanceof C85632g.C85635c)) {
                    C85632g.C85634b bVar = ((C85632g.C85635c) runnable).f249576d;
                    if (bVar instanceof C85638o) {
                        C85632g.C85634b bVar2 = ((C85632g.C85635c) runnable2).f249576d;
                        if (bVar2 instanceof C85638o) {
                            C85638o oVar = (C85638o) bVar;
                            C85638o oVar2 = (C85638o) bVar2;
                            i = oVar.f249585e - oVar2.f249585e;
                            if ((oVar instanceof C115883d) && (oVar2 instanceof C115883d) && i == 0) {
                                i = ((int) (Math.random() * 50.0d)) - 25;
                            }
                            return 0 - i;
                        }
                    }
                }
                i = 0;
                return 0 - i;
            }
        }

        public C85644c() {
            super(11, new C85645a());
        }

        /* renamed from: f */
        public static String m105754f(Runnable runnable) {
            if (runnable instanceof C85632g.C85635c) {
                C85632g.C85635c cVar = (C85632g.C85635c) runnable;
                C85632g.C85634b bVar = cVar.f249576d;
                if (bVar instanceof C85638o) {
                    return String.format("priority = %d, urlKey = %s", new Object[]{Integer.valueOf(((C85638o) bVar).f249585e), cVar.f249576d.mo119169a()});
                }
                return String.format("unknown request = %s", new Object[]{bVar});
            }
            return String.format("unknown runnable = %s", new Object[]{runnable});
        }

        public boolean offer(Object obj) {
            Runnable runnable = (Runnable) obj;
            boolean offer = super.offer(runnable);
            Log.m105919d("MicroMsg.ResDownloader.NetworkWorker.BlockingQueue", "offer() | tid = %d | " + m105754f(runnable), Long.valueOf(Thread.currentThread().getId()));
            return offer;
        }

        public Object poll(long j, TimeUnit timeUnit) {
            Runnable runnable = (Runnable) super.poll(j, timeUnit);
            if (runnable != null) {
                Log.m105919d("MicroMsg.ResDownloader.NetworkWorker.BlockingQueue", "poll(long, TimeUnit) | tid = %d | " + m105754f(runnable), Long.valueOf(Thread.currentThread().getId()));
            }
            return runnable;
        }
    }

    public C85640q(String str, C85630d dVar) {
        this.f249602c = new C85632g.C85633a(str, 4, 4, new C85644c());
        this.f249603d = dVar;
    }

    /* renamed from: d */
    public C119143b mo119161d() {
        return this.f249602c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r0 == false) goto L_0x007e;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo113634h(com.tencent.p014mm.pluginsdk.res.downloader.model.C85638o r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f249581a
            boolean r0 = r7.mo119166e(r0)
            r1 = 0
            r2 = 1
            java.lang.String r3 = "MicroMsg.ResDownloader.NetworkWorker"
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = r8.f249581a
            java.util.Map<java.lang.String, java.util.concurrent.Future<?>> r4 = r7.f249574b
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x001a
            goto L_0x0086
        L_0x001a:
            int r0 = p156gj.C87198e0.m108253a()
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r1] = r6
            int r6 = r8.f249582b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            java.lang.String r6 = "currentNetType(%d), requestNetType(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
            if (r0 != 0) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            int r5 = r8.f249582b
            if (r4 != r5) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            if (r0 != r2) goto L_0x0040
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0050
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r8 = r8.f249581a
            r0[r1] = r8
            java.lang.String r8 = "urlKey = %s, mismatch networkType , skip task"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r0)
            return r2
        L_0x0050:
            zt3.b r0 = r7.f249602c
            boolean r0 = r0.isShutdown()
            if (r0 != 0) goto L_0x007d
            zt3.b r0 = r7.f249602c
            boolean r0 = r0.isTerminated()
            if (r0 != 0) goto L_0x007d
            zt3.b r0 = r7.f249602c
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f356831d
            int r0 = r0.get()
            if (r0 >= 0) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r3 != 0) goto L_0x007a
            r3 = 1610612736(0x60000000, float:3.6893488E19)
            if (r0 >= r3) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            if (r0 == 0) goto L_0x007a
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            if (r0 == 0) goto L_0x007e
        L_0x007d:
            r1 = 1
        L_0x007e:
            if (r1 == 0) goto L_0x0082
            r8 = 4
            return r8
        L_0x0082:
            r7.mo119167g(r8)
            return r4
        L_0x0086:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r8 = r8.f249581a
            r0[r1] = r8
            java.lang.String r8 = "urlKey = %s is already queueing, skip repeated task"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q.mo113634h(com.tencent.mm.pluginsdk.res.downloader.model.o):int");
    }

    /* renamed from: i */
    public C85632g.C85636d mo113633f(C85638o oVar) {
        Log.m105924i("MicroMsg.ResDownloader.NetworkWorker", "request.class = " + oVar.getClass().getSimpleName());
        C85641a Q5 = ((C87030f) C86312j.m106911c(C87030f.class)).mo121434Q5(oVar);
        if (Q5 == null) {
            Log.m105924i("MicroMsg.ResDownloader.NetworkWorker", "get null handler from plugin, use default handler");
            Q5 = new C85643b(oVar);
        }
        Q5.f249607g = this.f249603d;
        return Q5;
    }
}
