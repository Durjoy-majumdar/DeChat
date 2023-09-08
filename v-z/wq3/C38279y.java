package wq3;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import wq3.C38274x;

/* renamed from: wq3.y */
public final class C38279y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C38279y f101058d = new C38279y();

    public C38279y() {
        super(0);
    }

    public Object invoke() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = ((LinkedHashMap) C38274x.f101049c).entrySet().iterator();
        while (it.hasNext()) {
            C38274x.C38276b bVar = (C38274x.C38276b) ((Map.Entry) it.next()).getValue();
            if (bVar instanceof C38274x.C38275a) {
                ((C38274x.C38275a) bVar).getClass();
                C38274x xVar = C38274x.f101047a;
                it.remove();
            } else {
                C38274x.f101047a.getClass();
                int size = bVar.f101053b.size();
                int i = bVar.f101054c;
                if (size < i) {
                    int i2 = i - size;
                    int i3 = 0;
                    while (i3 < i2) {
                        try {
                            View invoke = bVar.f101055d.invoke(bVar);
                            if (invoke != null) {
                                List<View> list = bVar.f101053b;
                                invoke.setTag(C0966R.C0970id.mkt, 1);
                                list.add(invoke);
                            }
                            i3++;
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.X2C.X2CViewCreator", e, "fillingCacheView: " + bVar.f101052a, new Object[0]);
                        }
                    }
                }
            }
        }
        C38274x xVar2 = C38274x.f101047a;
        C38274x.f101051e = false;
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105924i("MicroMsg.X2C.X2CViewCreator", "fillingCacheViewList cost:" + (currentTimeMillis2 - currentTimeMillis));
        return C13598b0.f38549a;
    }
}
