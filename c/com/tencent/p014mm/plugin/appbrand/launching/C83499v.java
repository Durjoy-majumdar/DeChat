package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Build;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import lp3.C88631d;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.v */
public final class C83499v {

    /* renamed from: a */
    public static final C83500a f243973a = (Build.VERSION.SDK_INT >= 24 ? new C83503d() : new C83505e());

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.v$a */
    public interface C83500a {
        /* renamed from: a */
        C83502c mo115794a(AppBrandRuntimeWC appBrandRuntimeWC);

        /* renamed from: b */
        C83502c mo115795b(AppBrandRuntimeWC appBrandRuntimeWC);

        /* renamed from: c */
        void mo115796c(AppBrandRuntimeWC appBrandRuntimeWC, C32224a<C83502c> aVar);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.v$b */
    public interface C83501b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.v$c */
    public static final class C83502c implements C83501b {

        /* renamed from: a */
        public volatile ICommLibReader f243974a;

        /* renamed from: b */
        public final AtomicBoolean f243975b = new AtomicBoolean(false);

        /* renamed from: c */
        public final AtomicBoolean f243976c = new AtomicBoolean(false);

        /* renamed from: d */
        public final ConcurrentLinkedDeque<C32226l<ICommLibReader, C13598b0>> f243977d = new ConcurrentLinkedDeque<>();

        /* renamed from: e */
        public final ReentrantReadWriteLock f243978e = new ReentrantReadWriteLock();

        /* renamed from: a */
        public void mo115797a() {
            this.f243975b.set(true);
            while (!this.f243977d.isEmpty()) {
                C32226l<ICommLibReader, C13598b0> poll = this.f243977d.poll();
                C88631d.C76721a aVar = poll instanceof C88631d.C76721a ? (C88631d.C76721a) poll : null;
                if (aVar != null) {
                    aVar.mo1720a(null);
                }
            }
        }

        /* renamed from: b */
        public final void mo115798b(C32226l<? super ICommLibReader, C13598b0> lVar) {
            C87412m.m108594g(lVar, "function");
            if (this.f243975b.get()) {
                C88631d.C76721a aVar = lVar instanceof C88631d.C76721a ? (C88631d.C76721a) lVar : null;
                if (aVar != null) {
                    aVar.mo1720a(null);
                }
            } else if (!this.f243976c.getAndSet(true)) {
                this.f243977d.addLast(lVar);
                Log.m105924i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "startTask instance(" + hashCode() + ") callbacks.size=" + this.f243977d.size());
                C83517x xVar = new C83517x(this);
                ICommLibReader iCommLibReader = WxaCommLibRuntimeReader.f238555a;
                if (iCommLibReader != null) {
                    Log.m105924i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "task(" + hashCode() + ") getLoadedReader != NULL");
                    xVar.invoke(iCommLibReader);
                    return;
                }
                C61926c.m72656A((String) null, new C83509w(xVar, this, Util.currentTicks()));
            } else {
                ReentrantReadWriteLock.ReadLock readLock = this.f243978e.readLock();
                readLock.lock();
                try {
                    if (this.f243974a != null) {
                        ICommLibReader iCommLibReader2 = this.f243974a;
                        C87412m.m108591d(iCommLibReader2);
                        lVar.invoke(iCommLibReader2);
                    } else {
                        this.f243977d.addLast(lVar);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                } finally {
                    readLock.unlock();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.v$d */
    public static final class C83503d implements C83500a {

        /* renamed from: a */
        public final ConcurrentHashMap<AppBrandRuntimeWC, C83502c> f243979a = new ConcurrentHashMap<>();

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.v$d$a */
        public static final class C83504a<T, R> implements Function {

            /* renamed from: a */
            public final /* synthetic */ C32224a<C83502c> f243980a;

            public C83504a(C32224a<C83502c> aVar) {
                this.f243980a = aVar;
            }

            public Object apply(Object obj) {
                C87412m.m108594g((AppBrandRuntimeWC) obj, LocaleUtil.ITALIAN);
                return this.f243980a.invoke();
            }
        }

        /* renamed from: a */
        public C83502c mo115794a(AppBrandRuntimeWC appBrandRuntimeWC) {
            C87412m.m108594g(appBrandRuntimeWC, "key");
            C83502c cVar = this.f243979a.get(appBrandRuntimeWC);
            C87412m.m108591d(cVar);
            return cVar;
        }

        /* renamed from: b */
        public C83502c mo115795b(AppBrandRuntimeWC appBrandRuntimeWC) {
            C87412m.m108594g(appBrandRuntimeWC, "key");
            return this.f243979a.remove(appBrandRuntimeWC);
        }

        /* renamed from: c */
        public void mo115796c(AppBrandRuntimeWC appBrandRuntimeWC, C32224a<C83502c> aVar) {
            C87412m.m108594g(appBrandRuntimeWC, "key");
            C87412m.m108594g(aVar, "function");
            this.f243979a.computeIfAbsent(appBrandRuntimeWC, new C83504a(aVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.v$e */
    public static final class C83505e implements C83500a {

        /* renamed from: a */
        public final HashMap<AppBrandRuntimeWC, C83502c> f243981a = new HashMap<>();

        /* renamed from: a */
        public C83502c mo115794a(AppBrandRuntimeWC appBrandRuntimeWC) {
            C83502c cVar;
            C87412m.m108594g(appBrandRuntimeWC, "key");
            synchronized (this.f243981a) {
                C83502c cVar2 = this.f243981a.get(appBrandRuntimeWC);
                C87412m.m108591d(cVar2);
                cVar = cVar2;
            }
            return cVar;
        }

        /* renamed from: b */
        public C83502c mo115795b(AppBrandRuntimeWC appBrandRuntimeWC) {
            C83502c remove;
            C87412m.m108594g(appBrandRuntimeWC, "key");
            synchronized (this.f243981a) {
                remove = this.f243981a.remove(appBrandRuntimeWC);
            }
            return remove;
        }

        /* renamed from: c */
        public void mo115796c(AppBrandRuntimeWC appBrandRuntimeWC, C32224a<C83502c> aVar) {
            C87412m.m108594g(appBrandRuntimeWC, "key");
            C87412m.m108594g(aVar, "function");
            synchronized (this.f243981a) {
                if (this.f243981a.get(appBrandRuntimeWC) == null) {
                    this.f243981a.put(appBrandRuntimeWC, aVar.invoke());
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: a */
    public static final C83501b m102464a(AppBrandRuntimeWC appBrandRuntimeWC, C32226l<? super ICommLibReader, C13598b0> lVar) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        C87412m.m108594g(lVar, "function");
        if (appBrandRuntimeWC.mo113184O1(false) != null) {
            ICommLibReader O1 = appBrandRuntimeWC.mo113184O1(false);
            C87412m.m108593f(O1, "runtime.libReader");
            lVar.invoke(O1);
            return null;
        }
        C83500a aVar = f243973a;
        aVar.mo115796c(appBrandRuntimeWC, new C83290b0(appBrandRuntimeWC));
        C83502c a = aVar.mo115794a(appBrandRuntimeWC);
        a.mo115798b(lVar);
        return a;
    }
}
