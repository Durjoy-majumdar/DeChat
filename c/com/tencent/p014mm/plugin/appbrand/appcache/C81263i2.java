package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandPreloadProfiler;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.plugin.appbrand.task.q$$f;
import com.tencent.p014mm.plugin.appbrand.task.q$$g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C86484b;
import f40.C86709a0;
import hp3.C87581a;
import java.util.Objects;
import java.util.Queue;
import kr0.C88273g1;
import nr3.C89059e;
import p170ic.C87688b;
import q20.C89449a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.i2 */
public final class C81263i2 {

    /* renamed from: a */
    public static final WxaCommLibRuntimeReader.C81218c f238669a = new WxaCommLibRuntimeReader.C81218c();

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i2$b */
    public static final class C81265b implements C1255d<ICommLibReader, IPCVoid> {

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i2$b$a */
        public class C81266a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ICommLibReader f238670d;

            /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i2$b$a$a */
            public class C81267a implements Runnable {
                public C81267a() {
                }

                public void run() {
                    new C81270c(C81266a.this.f238670d).mo113560b((Void) null);
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i2$b$a$b */
            public class C81268b implements C87581a<Object, Void> {

                /* renamed from: a */
                public final /* synthetic */ C87688b f238672a;

                public C81268b(C81266a aVar, C87688b bVar) {
                    this.f238672a = bVar;
                }

                public Object call(Object obj) {
                    Void voidR = (Void) obj;
                    this.f238672a.mo122118a();
                    return null;
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i2$b$a$c */
            public class C81269c implements C87581a<Object, Void> {

                /* renamed from: a */
                public final /* synthetic */ C87688b f238673a;

                public C81269c(C81266a aVar, C87688b bVar) {
                    this.f238673a = bVar;
                }

                public Object call(Object obj) {
                    Void voidR = (Void) obj;
                    this.f238673a.mo122118a();
                    return null;
                }
            }

            public C81266a(C81265b bVar, ICommLibReader iCommLibReader) {
                this.f238670d = iCommLibReader;
            }

            public void run() {
                C87688b bVar = new C87688b(new C81267a(), 2);
                C89059e eVar = (C89059e) C84331q.m103960o(C84343y.WASERVICE);
                eVar.mo123061d(new C81268b(this, bVar));
                eVar.mo123058O();
                C89059e eVar2 = (C89059e) C84331q.m103960o(C84343y.WAGAME);
                eVar2.mo123061d(new C81269c(this, bVar));
                eVar2.mo123058O();
            }
        }

        private C81265b() {
        }

        /* renamed from: a */
        public void invoke(ICommLibReader iCommLibReader, C1256g<IPCVoid> gVar) {
            Log.m105925i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "IPC_resetAppBrandCommLibReader#invoke(), process[%s], pkgInfo[%s]", MMApplicationContext.getProcessName(), iCommLibReader);
            if (iCommLibReader != null) {
                ((C119157j) C119157j.f356862d).mo183895z(new C81266a(this, iCommLibReader));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.i2$c */
    public static class C81270c implements C87581a<Void, Void> {

        /* renamed from: a */
        public final ICommLibReader f238674a;

        public C81270c(ICommLibReader iCommLibReader) {
            this.f238674a = iCommLibReader;
        }

        /* renamed from: b */
        public Void mo113560b(Void voidR) {
            int i;
            boolean z;
            ICommLibReader iCommLibReader = this.f238674a;
            ICommLibReader iCommLibReader2 = WxaCommLibRuntimeReader.f238555a;
            synchronized (WxaCommLibRuntimeReader.class) {
                if (WxaCommLibRuntimeReader.f238555a == null || iCommLibReader.compareTo(WxaCommLibRuntimeReader.f238555a) != 0) {
                    WxaCommLibRuntimeReader.f238555a = iCommLibReader;
                    z = true;
                } else {
                    z = false;
                }
            }
            int c = C81682d.m100223c();
            Log.m105925i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "IPC_resetAppBrandCommLibReader#invoke() waitForPreloaded entered, process[%s], pkgInfo[%s], globalReaderUpdated[%b], runningRuntimeCount[%d]", MMApplicationContext.getProcessName(), this.f238674a, Boolean.valueOf(z), Integer.valueOf(c));
            if (!z || c > 0) {
                return null;
            }
            C88273g1 g1Var = C88273g1.WXA_COMM_LIB_UPDATED;
            q$$f q__f = C84331q.f246221a;
            synchronized (C84331q.class) {
                for (C84343y yVar : C84331q.m103950e()) {
                    if (C84331q.m103957l(yVar)) {
                        Queue<C81925i2> queue = C84331q.f246224d.get(yVar);
                        if (queue != null) {
                            for (C81925i2 F : queue) {
                                F.mo114329F();
                            }
                        }
                        Queue<C83928t1> queue2 = C84331q.f246223c.get(yVar);
                        if (queue2 != null) {
                            for (C83928t1 F2 : queue2) {
                                F2.mo114329F();
                            }
                        }
                        C84331q.m103955j(yVar, (q$$g) null, true, (AppBrandPreloadProfiler) null, g1Var, 2);
                    }
                }
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object call(Object obj) {
            mo113560b((Void) obj);
            return null;
        }
    }

    /* renamed from: a */
    public static void m99623a() {
        ICommLibReader iCommLibReader;
        Object d = f238669a.invoke(IPCVoid.f10316d);
        if (d instanceof ICommLibReader) {
            iCommLibReader = (ICommLibReader) d;
            Log.m105925i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "doNotify check ok ret[%s]", d);
        } else if (d instanceof WxaPkgWrappingInfo) {
            WxaPkgWrappingInfo wxaPkgWrappingInfo = (WxaPkgWrappingInfo) d;
            iCommLibReader = wxaPkgWrappingInfo.f238587f ? AssetReader.f238551j : new WxaCommLibRuntimeReader.PkgReader(wxaPkgWrappingInfo);
            Log.m105925i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "doNotify check ok ret[%s]", d);
        } else {
            Log.m105921e("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "doNotify check failed ret[%s]", d);
            iCommLibReader = AssetReader.f238551j;
        }
        Log.m105925i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "doNotify invoke ipc reset with reader:%s", iCommLibReader);
        Objects.requireNonNull(iCommLibReader);
        String[] strArr = C86709a0.f251722m;
        for (int i = 0; i < 5; i++) {
            String str = MMApplicationContext.getPackageName() + strArr[i];
            if (MMApplicationContext.isProcessExist(str)) {
                XIPCInvoker.m98748a(str, iCommLibReader, C81265b.class, (C1256g) null);
            }
        }
        if (WxaCommLibRuntimeReader.f238555a != null) {
            new C81265b().invoke(iCommLibReader, (C1256g<IPCVoid>) null);
        }
    }

    /* renamed from: b */
    public static void m99624b() {
        try {
            f238669a.invoke(IPCVoid.f10316d);
        } catch (WxaCommLibRuntimeReader.AccountNotReadyError unused) {
            throw new C86484b();
        }
    }
}
