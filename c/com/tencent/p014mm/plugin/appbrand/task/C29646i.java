package com.tencent.p014mm.plugin.appbrand.task;

import fy3.C32227p;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.task.i */
public final class C29646i implements Runnable {

    /* renamed from: d */
    public static final C29646i f80584d = new C29646i();

    /* renamed from: com.tencent.mm.plugin.appbrand.task.i$a */
    public static final class C29647a implements Runnable {

        /* renamed from: d */
        public static final C29647a f80585d = new C29647a();

        /* renamed from: com.tencent.mm.plugin.appbrand.task.i$a$a */
        public static final class C29648a extends C87413o implements C32227p<Integer, Integer, C13598b0> {

            /* renamed from: d */
            public static final C29648a f80586d = new C29648a();

            public C29648a() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                ((C119157j) C119157j.f356862d).mo183895z(new C29644h(intValue, intValue2));
                return C13598b0.f38549a;
            }
        }

        public final void run() {
            List<C32227p<Integer, Integer, C13598b0>> list = C84281e.f246150a;
            C29648a aVar = C29648a.f80586d;
            ((C119157j) C119157j.f356862d).mo183870a(new C84289g(aVar));
        }
    }

    public final void run() {
        ((C119157j) C119157j.f356862d).mo183895z(C29647a.f80585d);
    }
}
