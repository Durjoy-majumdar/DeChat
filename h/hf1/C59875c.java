package hf1;

import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58413v0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: hf1.c */
public final class C59875c extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59876d f170937d;

    /* renamed from: e */
    public final /* synthetic */ C51978xi1 f170938e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59875c(C59876d dVar, C51978xi1 xi12) {
        super(1);
        this.f170937d = dVar;
        this.f170938e = xi12;
    }

    public Object invoke(Object obj) {
        C64586nn1 nn12;
        T t;
        String str = (String) obj;
        C87412m.m108594g(str, "path");
        C59876d dVar = this.f170937d;
        C51978xi1 xi12 = this.f170938e;
        dVar.getClass();
        if (xi12 != null) {
            Log.m105924i("Finder.InnerDropTabRedDotInterceptor", "removeShowInfoWithReport :" + xi12.f144670e);
            LinkedList<C64586nn1> linkedList = xi12.f144672g;
            C87412m.m108593f(linkedList, "ctrlInfo.show_infos");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                nn12 = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C64586nn1) t).f184507i, str)) {
                    break;
                }
            }
            C64586nn1 nn13 = (C64586nn1) t;
            if (nn13 != null) {
                C58413v0.m67784m(C58413v0.f167346a, xi12, nn13, 13, (String) null, 0, 24, (Object) null);
            }
            Iterator<C64586nn1> it4 = xi12.f144672g.iterator();
            C87412m.m108593f(it4, "info.show_infos.iterator()");
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C64586nn1 next = it4.next();
                if (C87412m.m108589b(next.f184507i, str)) {
                    it4.remove();
                    nn12 = next;
                    break;
                }
            }
            if (nn12 != null) {
                Log.m105924i("Finder.InnerDropTabRedDotInterceptor", "removeShowInfoWithReport :" + nn12.f184507i);
            }
        }
        return C13598b0.f38549a;
    }
}
