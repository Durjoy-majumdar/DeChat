package yl0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C24565l;
import gy3.C87412m;
import rx3.C13598b0;
import zl0.C91774e;
import zl0.C91780f;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: yl0.f */
public final class C91483f extends C91476a {
    public static final int CTRL_INDEX = 813;
    public static final String NAME = "NFCClose";

    /* renamed from: yl0.f$a */
    public /* synthetic */ class C91484a extends C24565l implements C32228q<C91774e, String, C32226l<? super C91789o<C13598b0>, ? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public static final C91484a f262290d = new C91484a();

        public C91484a() {
            super(3, C91774e.class, "close", "close(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C91774e eVar = (C91774e) obj;
            String str = (String) obj2;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(eVar, "p0");
            C87412m.m108594g(str, "p1");
            C87412m.m108594g(lVar, "p2");
            Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", "close, techName: " + str);
            ((C119157j) C119157j.f356862d).mo183876g(new C91780f(eVar, lVar, str), "NFC-IO");
            return C13598b0.f38549a;
        }
    }

    public C91483f() {
        super(C91484a.f262290d);
    }
}
