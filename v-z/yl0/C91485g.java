package yl0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C24565l;
import gy3.C87412m;
import rx3.C13598b0;
import zl0.C91774e;
import zl0.C91781g;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: yl0.g */
public final class C91485g extends C91476a {
    public static final int CTRL_INDEX = 812;
    public static final String NAME = "NFCConnect";

    /* renamed from: yl0.g$a */
    public /* synthetic */ class C91486a extends C24565l implements C32228q<C91774e, String, C32226l<? super C91789o<C13598b0>, ? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public static final C91486a f262291d = new C91486a();

        public C91486a() {
            super(3, C91774e.class, "connect", "connect(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C91774e eVar = (C91774e) obj;
            String str = (String) obj2;
            C32226l lVar = (C32226l) obj3;
            C87412m.m108594g(eVar, "p0");
            C87412m.m108594g(str, "p1");
            C87412m.m108594g(lVar, "p2");
            Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", "connect, techName: " + str);
            ((C119157j) C119157j.f356862d).mo183876g(new C91781g(eVar, lVar, str), "NFC-IO");
            return C13598b0.f38549a;
        }
    }

    public C91485g() {
        super(C91486a.f262291d);
    }
}
