package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.os.SystemClock;
import androidx.camera.core.FocusMeteringAction;
import bj0.C79708a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m */
public final class C81792m implements C81807x {

    /* renamed from: a */
    public final String f240000a;

    /* renamed from: b */
    public final C81809z f240001b;

    /* renamed from: c */
    public final String f240002c = ("MicroMsg.AppBrand.AutoConnectGattRetryStrategy#" + hashCode());

    /* renamed from: d */
    public final C81793a f240003d = new C81793a(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m$a */
    public static final class C81793a implements C81809z {

        /* renamed from: a */
        public volatile long f240004a = -1;

        /* renamed from: b */
        public final C81779d0 f240005b = new C81779d0();

        /* renamed from: c */
        public volatile boolean f240006c;

        /* renamed from: d */
        public volatile C32224a<C13598b0> f240007d;

        /* renamed from: e */
        public final /* synthetic */ C81792m f240008e;

        /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m$a$a */
        public static final class C81794a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C81793a f240009d;

            /* renamed from: e */
            public final /* synthetic */ String f240010e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C81794a(C81793a aVar, String str) {
                super(0);
                this.f240009d = aVar;
                this.f240010e = str;
            }

            public Object invoke() {
                int i;
                int i2;
                int i3;
                C119179t tVar = C119157j.f356862d;
                String str = this.f240010e;
                C81793a aVar = this.f240009d;
                C81791l lVar = new C81791l(str, aVar);
                C81779d0 d0Var = aVar.f240005b;
                synchronized (d0Var) {
                    i = d0Var.f239972a;
                }
                long pow = ((long) ((int) ((float) Math.pow((double) 2.0f, (double) (i - 1))))) * FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                C79708a aVar2 = C79708a.f233619a;
                aVar2.mo109821a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "resolve#RetryDelayMillsResolver, curBackoffFactor: " + i + ", retryDelayMills: " + pow);
                synchronized (d0Var) {
                    i2 = d0Var.f239972a;
                    int i4 = i2 + 1;
                    d0Var.f239972a = i4;
                    if (10 < i4) {
                        d0Var.f239972a = 1;
                    }
                    i3 = d0Var.f239972a;
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                aVar2.mo109821a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "updateBackoffFactor#RetryDelayMillsResolver, oldBackoffFactor: " + i2 + ", newBackoffFactor: " + i3);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(lVar, pow, false);
                return C13598b0.f38549a;
            }
        }

        public C81793a(C81792m mVar) {
            this.f240008e = mVar;
        }

        /* renamed from: a */
        public void mo114171a(String str, boolean z) {
            C87412m.m108594g(str, "deviceId");
            this.f240008e.f240001b.mo114171a(str, z);
            if (!z) {
                if (30000 < SystemClock.elapsedRealtime() - this.f240004a) {
                    C81779d0 d0Var = this.f240005b;
                    d0Var.getClass();
                    C79708a.f233619a.mo109821a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
                    synchronized (d0Var) {
                        d0Var.f239972a = 1;
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
                C81794a aVar = new C81794a(this, str);
                if (this.f240006c) {
                    this.f240007d = aVar;
                } else {
                    aVar.invoke();
                }
            }
        }
    }

    public C81792m(String str, C81809z zVar) {
        C87412m.m108594g(str, "deviceId");
        C87412m.m108594g(zVar, "gattConnectListener");
        this.f240000a = str;
        this.f240001b = zVar;
    }

    /* renamed from: a */
    public void mo114173a() {
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a(this.f240002c, "pauseConnect");
        C81793a aVar2 = this.f240003d;
        aVar2.getClass();
        aVar.mo109821a(aVar2.f240008e.f240002c, "pause#gattConnectListenerWithRetry");
        aVar2.f240006c = true;
    }

    /* renamed from: b */
    public void mo114174b(boolean z) {
        C79708a aVar = C79708a.f233619a;
        String str = this.f240002c;
        aVar.mo109821a(str, "resumeConnect, canReset: " + z);
        C81793a aVar2 = this.f240003d;
        aVar2.getClass();
        String str2 = aVar2.f240008e.f240002c;
        aVar.mo109821a(str2, "resume#gattConnectListenerWithRetry, canReset: " + z);
        aVar2.f240006c = false;
        if (z) {
            aVar.mo109821a(aVar2.f240008e.f240002c, "reset#gattConnectListenerWithRetry");
            aVar2.f240004a = -1;
            C81779d0 d0Var = aVar2.f240005b;
            d0Var.getClass();
            aVar.mo109821a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
            synchronized (d0Var) {
                d0Var.f239972a = 1;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C32224a<C13598b0> aVar3 = aVar2.f240007d;
        if (aVar3 != null) {
            ((C81793a.C81794a) aVar3).invoke();
        }
    }

    public boolean connect() {
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a(this.f240002c, "connect");
        C81797p pVar = C81797p.f240015a;
        String str = this.f240000a;
        C81793a aVar2 = this.f240003d;
        aVar2.getClass();
        aVar.mo109821a(aVar2.f240008e.f240002c, "get#gattConnectListenerWithRetry");
        aVar2.f240004a = SystemClock.elapsedRealtime();
        return pVar.mo114177a(str, aVar2);
    }

    public boolean disconnect() {
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a(this.f240002c, "disconnect");
        boolean b = C81797p.f240015a.mo114178b(this.f240000a);
        C81793a aVar2 = this.f240003d;
        aVar2.getClass();
        aVar.mo109821a(aVar2.f240008e.f240002c, "reset#gattConnectListenerWithRetry");
        aVar2.f240004a = -1;
        C81779d0 d0Var = aVar2.f240005b;
        d0Var.getClass();
        aVar.mo109821a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
        synchronized (d0Var) {
            d0Var.f239972a = 1;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return b;
    }
}
