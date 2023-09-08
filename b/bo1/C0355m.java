package bo1;

import bo1.C0345h;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.LinkedList;
import je1.C9335m;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50676og0;
import te3.C50824pg0;

/* renamed from: bo1.m */
public final class C0355m<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ int f946a;

    public C0355m(int i) {
        this.f946a = i;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        LinkedList<C50676og0> linkedList = null;
        if (cVar.f256793a == 0 && cVar.f256794b == 0 && cVar.f256796d != null) {
            C0345h a = C0345h.f930c.mo387a(this.f946a, true);
            if (a == null) {
                return null;
            }
            synchronized (a) {
                C9335m mVar = (C9335m) cVar.f256798f;
                C50824pg0 pg02 = (C50824pg0) cVar.f256796d;
                if (mVar != null) {
                    linkedList = mVar.f29161s;
                }
                if (!(linkedList == null || pg02 == null)) {
                    a.f933b.add(new C0345h.C0346a(mVar.f29161s, pg02));
                }
                if (a.f933b.size() == a.f932a && (!a.f933b.isEmpty())) {
                    Log.m105925i("FinderSearchRelBatchLoadObjectCache", "remove first %d", Integer.valueOf(a.f932a));
                    a.f933b.removeFirst();
                }
            }
            return C13598b0.f38549a;
        }
        Log.m105920e("FinderSearchRelPreLoader", "get feed error");
        return C13598b0.f38549a;
    }
}
