package wq3;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import te3.e85;
import te3.f85;

/* renamed from: wq3.u */
public final class C38272u {

    /* renamed from: wq3.u$a */
    public static final class C38273a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f101046d;

        public C38273a(C32224a aVar) {
            this.f101046d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f101046d.invoke();
        }
    }

    /* renamed from: a */
    public static final boolean m41818a(e85 e85, e85 e852) {
        boolean z;
        C87412m.m108594g(e85, "<this>");
        C87412m.m108594g(e852, "newData");
        LinkedList<f85> linkedList = e852.f182941e;
        C87412m.m108593f(linkedList, "newData.layoutList");
        Iterator<T> it = linkedList.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                int i = ((f85) it.next()).f183093d;
                LinkedList<f85> linkedList2 = e85.f182941e;
                C87412m.m108593f(linkedList2, "layoutList");
                Iterator<T> it4 = linkedList2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (((f85) it4.next()).f183093d == i) {
                            z = true;
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (z);
        return true;
    }

    /* renamed from: b */
    public static final String m41819b(e85 e85) {
        C87412m.m108594g(e85, "<this>");
        StringBuilder sb = new StringBuilder("x2cPreloadData size:" + e85.f182941e.size() + 10);
        LinkedList<f85> linkedList = e85.f182941e;
        C87412m.m108593f(linkedList, "layoutList");
        for (f85 f85 : linkedList) {
            String resourceEntryName = MMApplicationContext.getContext().getResources().getResourceEntryName(f85.f183093d);
            sb.append(resourceEntryName + 10);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }
}
