package q52;

import com.tencent.p014mm.plugin.magicbrush.C30180c0;
import di3.C86312j;
import f42.C31904c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sx3.C110818d0;
import sx3.C36907w;

/* renamed from: q52.d */
public final class C35765d {

    /* renamed from: a */
    public static final List<String> f95531a;

    /* renamed from: b */
    public static final List<String> f95532b;

    /* renamed from: c */
    public static final List<String> f95533c;

    static {
        Class cls = C30180c0.class;
        Set<C31904c> np = ((C30180c0) C86312j.m106911c(cls)).mo57208np();
        ArrayList arrayList = new ArrayList();
        for (T next : np) {
            if (!((C31904c) next).f84991b) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C31904c) it.next()).f84990a);
        }
        f95531a = C110818d0.m150953y0(arrayList2);
        Set<C31904c> np4 = ((C30180c0) C86312j.m106911c(cls)).mo57208np();
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : np4) {
            if (((C31904c) next2).f84991b) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((C31904c) it4.next()).f84990a);
        }
        List<String> y0 = C110818d0.m150953y0(arrayList4);
        f95532b = y0;
        f95533c = C110818d0.m150933e0(f95531a, y0);
    }
}
