package le1;

import fy3.C32226l;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import te3.C51124rl1;

/* renamed from: le1.d */
public final class C10492d extends C87413o implements C32226l<Long, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ List<C51124rl1> f31730d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10492d(List<? extends C51124rl1> list) {
        super(1);
        this.f31730d = list;
    }

    public Object invoke(Object obj) {
        Long l = (Long) obj;
        Iterator<C51124rl1> it = this.f31730d.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (l != null && it.next().f141001g == l.longValue()) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
