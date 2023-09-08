package com.tencent.p014mm.appbrand.p942v8;

import android.os.Process;
import com.eclipsesource.mmv8.V8Locker;
import com.eclipsesource.mmv8.V8ScriptException;
import com.tencent.p014mm.appbrand.p942v8.C80656d;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CountDownLatch;
import p774zg.C39348q0;
import p774zg.C91743r0;

/* renamed from: com.tencent.mm.appbrand.v8.b */
public class C80653b extends Thread {

    /* renamed from: d */
    public final /* synthetic */ CountDownLatch f236019d;

    /* renamed from: e */
    public final /* synthetic */ C80649a f236020e;

    /* renamed from: com.tencent.mm.appbrand.v8.b$a */
    public class C80654a implements C80656d.C80657a {
        public C80654a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80653b(C80649a aVar, String str, CountDownLatch countDownLatch) {
        super(str);
        this.f236020e = aVar;
        this.f236019d = countDownLatch;
    }

    public void run() {
        this.f236020e.f236006o = Process.myTid();
        C80649a.f235991x.run();
        Log.m105924i("MicroMsg.AbstractJSRuntime", "expansions file is ready");
        C80649a aVar = this.f236020e;
        int i = aVar.f236012u.f235984l;
        if (Integer.MIN_VALUE != i) {
            aVar.mo112448t(i);
        }
        C80649a aVar2 = this.f236020e;
        aVar2.f235993b = aVar2.mo112471k();
        this.f236020e.f235993b.mo112482f(new C80654a());
        this.f236019d.countDown();
        this.f236020e.f235994c.countDown();
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.AbstractJSRuntime", "prepareV8WhenThreadStart, tid[%d] JsRuntime[%d] JsLooper[%d]", Integer.valueOf(this.f236020e.f236006o), Integer.valueOf(this.f236020e.hashCode()), Integer.valueOf(this.f236020e.f235993b.hashCode()));
        C80649a aVar3 = this.f236020e;
        aVar3.f235992a = aVar3.mo112472l();
        this.f236020e.f235992a.getV8().setDelaySaveCodeCache(this.f236020e.f236004m);
        C80649a aVar4 = this.f236020e;
        aVar4.f235992a.setMinimalCodeLength(aVar4.f236009r);
        C80649a aVar5 = this.f236020e;
        C80649a aVar6 = this.f236020e;
        aVar5.f235996e = new C91743r0(aVar6.f235992a);
        aVar6.f235996e.getClass();
        C80649a aVar7 = this.f236020e;
        aVar7.f235995d = aVar7.f235992a.createMemoryManager();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        Log.m105925i("MicroMsg.AbstractJSRuntime", "v8 init cost:%d ms", Long.valueOf(currentTimeMillis2));
        C39348q0.m42097c(5, currentTimeMillis2, -1, (String) null, -1, -1, -1);
        V8Locker v8Locker = this.f236020e.f235992a.getV8Locker();
        if (v8Locker.hasLock()) {
            Log.m105924i("MicroMsg.AbstractJSRuntime", "has lock release");
            v8Locker.release();
        }
        v8Locker.acquire();
        this.f236020e.f235993b.mo112479c();
        C80649a aVar8 = this.f236020e;
        while (true) {
            Runnable poll = aVar8.f236011t.poll();
            if (poll == null) {
                break;
            }
            try {
                poll.run();
            } catch (V8ScriptException e) {
                aVar8.mo112473n(e);
            } catch (UndeclaredThrowableException e2) {
                UndeclaredThrowableException undeclaredThrowableException = e2;
                Log.m105921e("MicroMsg.AbstractJSRuntime", "doPostedCleanUpJob UndeclaredThrowableException: %s %s", undeclaredThrowableException, undeclaredThrowableException.getCause());
            }
        }
        this.f236020e.f235995d.release();
        this.f236020e.f235996e.getClass();
        try {
            this.f236020e.f236010s.clear();
            Log.m105925i("MicroMsg.AbstractJSRuntime", "whenThreadEnd, mJSExceptionHandlerMap.clear() succeed, JsRuntime[%d]", Integer.valueOf(this.f236020e.hashCode()));
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.AbstractJSRuntime", "whenThreadEnd, mJSExceptionHandlerMap.clear(), JsRuntime[%d] get exception[%s]", Integer.valueOf(this.f236020e.hashCode()), th);
        }
        this.f236020e.mo112468b();
    }
}
