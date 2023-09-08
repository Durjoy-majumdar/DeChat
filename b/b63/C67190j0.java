package b63;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: b63.j0 */
public class C67190j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f192905d;

    /* renamed from: e */
    public final /* synthetic */ Map f192906e;

    /* renamed from: f */
    public final /* synthetic */ Object[] f192907f;

    public C67190j0(int i, Map map, Object[] objArr) {
        this.f192905d = i;
        this.f192906e = map;
        this.f192907f = objArr;
    }

    public void run() {
        ArrayList<C67195n> arrayList = C67192l0.f192914b;
        if (arrayList != null) {
            Iterator<C67195n> it = arrayList.iterator();
            while (it.hasNext()) {
                C67195n next = it.next();
                if (next != null) {
                    next.mo91296k7(this.f192905d, this.f192906e, this.f192907f);
                }
            }
        }
    }
}
