package mc1;

import com.tencent.p014mm.plugin.fav.p047ui.C93666k0;
import com.tencent.p014mm.plugin.fav.p047ui.C93745z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import zp3.C23564m;

/* renamed from: mc1.a */
public final class C99827a implements C93745z1.C93749c {

    /* renamed from: a */
    public final /* synthetic */ C99830c f292524a;

    /* renamed from: b */
    public final /* synthetic */ C93745z1.C93749c f292525b;

    /* renamed from: mc1.a$a */
    public static final class C99828a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99830c f292526d;

        /* renamed from: e */
        public final /* synthetic */ C93745z1.C93749c f292527e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99828a(C99830c cVar, C93745z1.C93749c cVar2) {
            super(0);
            this.f292526d = cVar;
            this.f292527e = cVar2;
        }

        public Object invoke() {
            C93666k0 a = C93666k0.f270444c.mo128591a();
            List<Integer> e3 = this.f292526d.mo139185e3();
            a.getClass();
            ArrayList arrayList = (ArrayList) e3;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int intValue = ((Number) it.next()).intValue();
                    if (!a.mo128588a(intValue)) {
                        Log.m105920e("MicroMsg.FavFinderStorage", "[batchRemove] position invalid return");
                        break;
                    }
                    Log.m105924i("MicroMsg.FavFinderStorage", "[batchRemove] use pos remove item in favIdList & favItemList, currentThread = " + Thread.currentThread().getName());
                    a.f270447b.remove(intValue);
                    a.f270446a.remove(intValue);
                    Log.m105924i("MicroMsg.FavFinderStorage", "[batchRemove] remove success, position = " + intValue);
                }
            } else {
                Log.m105920e("MicroMsg.FavFinderStorage", "[batchRemove] positionList empty return");
            }
            this.f292527e.mo128364a();
            return C13598b0.f38549a;
        }
    }

    public C99827a(C99830c cVar, C93745z1.C93749c cVar2) {
        this.f292524a = cVar;
        this.f292525b = cVar2;
    }

    /* renamed from: a */
    public final void mo128364a() {
        C23564m.m28136f(new C99828a(this.f292524a, this.f292525b));
    }
}
