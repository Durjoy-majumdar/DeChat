package com.tencent.p014mm.ipcinvoker;

import android.app.Application;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import o20.C89109c;
import o20.C89110d;
import o20.C89111e;
import qg3.C89652g;
import v20.C37646d;
import v20.C90741c;

/* renamed from: com.tencent.mm.ipcinvoker.p */
public class C80910p {

    /* renamed from: a */
    public static final C80914d[] f237761a = {null};

    /* renamed from: b */
    public static final boolean[] f237762b = {false};

    /* renamed from: com.tencent.mm.ipcinvoker.p$a */
    public class C80911a implements C89110d {

        /* renamed from: a */
        public final /* synthetic */ Application f237763a;

        public C80911a(Application application) {
            this.f237763a = application;
        }

        /* renamed from: a */
        public <T extends BaseIPCService> void mo112706a(String str, Class<T> cls) {
            C80898f b = C80898f.m98769b();
            String a = C37646d.m41473a(str, this.f237763a.getPackageName());
            b.getClass();
            String str2 = a + "/" + str;
            Class cls2 = (Class) ((HashMap) b.f237726a).get(str2);
            if (cls2 != null) {
                C90741c.m113810c("IPC.IPCBridgeManager", "warning: override ipc service: %s -> %s", str2, cls2);
            }
            ((HashMap) b.f237726a).put(str2, cls);
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.p$b */
    public class C80912b implements C89111e {
    }

    /* renamed from: com.tencent.mm.ipcinvoker.p$c */
    public class C80913c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f237764d;

        public C80913c(String str) {
            this.f237764d = str;
        }

        public void run() {
            C80898f b = C80898f.m98769b();
            String str = this.f237764d;
            b.getClass();
            if (C80906n.m98776c(str)) {
                C90741c.m113809b("IPC.IPCBridgeManager", "the same process(%s), do not need to build IPCBridge.", str);
                return;
            }
            b.mo112693a(str, false);
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.p$d */
    public interface C80914d {
    }

    /* renamed from: a */
    public static void m98789a(String str) {
        C80898f b = C80898f.m98769b();
        b.getClass();
        boolean z = false;
        if (!C80906n.m98776c(str) && ((ConcurrentHashMap) b.f237728c).get(str) != null) {
            z = true;
        }
        if (!z) {
            C80922v.m98792a(new C80913c(str));
        }
    }

    /* renamed from: b */
    public static void m98790b() {
        C80914d dVar;
        boolean[] zArr = f237762b;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    C80914d[] dVarArr = f237761a;
                    synchronized (dVarArr) {
                        dVar = dVarArr[0];
                        if (dVar == null) {
                            throw new IllegalStateException("Please call IPCInvokerBoot.prepare(...) first.");
                        }
                    }
                    C89652g gVar = (C89652g) dVar;
                    Application a = gVar.mo123980a();
                    Assert.assertNotNull(a);
                    C80906n.m98777d(a);
                    C80911a aVar = new C80911a(a);
                    C89109c b = gVar.mo123981b();
                    Assert.assertNotNull(b);
                    C89652g.C89653a aVar2 = (C89652g.C89653a) b;
                    aVar2.mo123984c(aVar);
                    aVar2.mo123982a(new C80912b());
                    aVar2.mo123983b(aVar);
                    C90741c.m113809b("IPC.IPCInvokerBoot", "setup IPCInvoker(process : %s, application : %s)", C80906n.m98775b(), Integer.valueOf(a.hashCode()));
                    zArr[0] = true;
                }
            }
        }
    }
}
