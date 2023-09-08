package n02;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import n02.C100030c;
import rx3.C13598b0;

/* renamed from: n02.f */
public final class C34721f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C100030c f93352d;

    /* renamed from: e */
    public final /* synthetic */ String f93353e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34721f(C100030c cVar, String str) {
        super(0);
        this.f93352d = cVar;
        this.f93353e = str;
    }

    public Object invoke() {
        C34715b d3 = C100030c.m130699d3(this.f93352d, this.f93353e);
        if (d3 != null) {
            int delete$default = MvvmStorage.delete$default(this.f93352d, d3, false, false, 6, (Object) null);
            C100030c.C34717b bVar = this.f93352d.f293055f;
            String str = this.f93353e;
            bVar.getClass();
            C87412m.m108594g(str, "userName");
            synchronized (bVar.f93346a) {
                Iterator<C34715b> it = bVar.f93346a.iterator();
                C87412m.m108593f(it, "cacheList.iterator()");
                while (it.hasNext()) {
                    C34715b next = it.next();
                    C87412m.m108593f(next, "iter.next()");
                    if (C87412m.m108589b(next.field_UserName, str)) {
                        it.remove();
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            Log.m105918d("MicroMsg.HashInfo.HashUserNameMapStorage", "remove() called " + this.f93353e + ' ' + delete$default);
        }
        return C13598b0.f38549a;
    }
}
