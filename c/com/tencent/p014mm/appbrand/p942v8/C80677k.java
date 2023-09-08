package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.V8Object;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import p774zg.C91688c0;
import p774zg.C91690d0;
import p774zg.C91695e0;
import p774zg.C91703f0;
import p774zg.C91709g0;
import p774zg.C91717i0;

/* renamed from: com.tencent.mm.appbrand.v8.k */
public class C80677k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80669j f236061d;

    public C80677k(C80669j jVar) {
        this.f236061d = jVar;
    }

    public void run() {
        if (this.f236061d.mo112501e() != null) {
            try {
                V8Object globalObject = this.f236061d.mo112501e().getGlobalObject();
                V8Object object = globalObject.getObject("v8Console");
                if (object == null || object.isUndefined()) {
                    object = globalObject.getObject("console");
                }
                String str = this.f236061d.f236040a;
                Object[] objArr = new Object[1];
                objArr[0] = (object == null || object.isUndefined()) ? "fail" : "ok";
                Log.m105925i(str, "initApi, save Inspector console %s", objArr);
                this.f236061d.f236047h = object;
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.J2V8.V8ContextEngine", "get OriginConsole ex: %s", th.getMessage());
            }
        }
        if (this.f236061d.f236041b.getConfig().f235988p || C80669j.f236039k != null) {
            Log.m105924i("MicroMsg.J2V8.V8ContextEngine", "initApi, inject V8DirectApiConsole");
            LinkedList<C91688c0> linkedList = this.f236061d.f236045f;
            C91695e0 e0Var = new C91695e0();
            e0Var.mo125557b(this.f236061d);
            linkedList.add(e0Var);
        }
        LinkedList<C91688c0> linkedList2 = this.f236061d.f236045f;
        C91717i0 i0Var = new C91717i0();
        i0Var.mo125557b(this.f236061d);
        linkedList2.add(i0Var);
        LinkedList<C91688c0> linkedList3 = this.f236061d.f236045f;
        C91709g0 g0Var = new C91709g0();
        g0Var.mo125557b(this.f236061d);
        linkedList3.add(g0Var);
        Log.m105919d("MicroMsg.J2V8.V8ContextEngine", "hy: config is %s", this.f236061d.f236041b.getConfig());
        if (this.f236061d.f236042c.supportBufferStoreBindTo()) {
            Log.m105924i("MicroMsg.J2V8.V8ContextEngine", "[v8] [dl: ] [nativebuffer] use NativeBufferJNI");
            C80669j jVar = this.f236061d;
            jVar.f236042c.bufferStoreBindTo(jVar.f236041b.mo112443m(), this.f236061d.mo112501e().getPtr());
        } else {
            Log.m105924i("MicroMsg.J2V8.V8ContextEngine", "[v8] [dl: ] [nativebuffer] use V8DirectApi");
            C80669j jVar2 = this.f236061d;
            LinkedList<C91688c0> linkedList4 = jVar2.f236045f;
            C91690d0 d0Var = new C91690d0(jVar2.f236042c);
            d0Var.mo125557b(this.f236061d);
            linkedList4.add(d0Var);
        }
        C80669j jVar3 = this.f236061d;
        LinkedList<C91688c0> linkedList5 = jVar3.f236045f;
        C91703f0 f0Var = new C91703f0(jVar3.f236043d, jVar3.f236044e);
        f0Var.mo125557b(jVar3);
        linkedList5.add(f0Var);
    }
}
