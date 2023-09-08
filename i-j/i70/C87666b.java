package i70;

import android.view.View;
import e42.C86428f;
import fy3.C32224a;
import g70.C87164i;
import gy3.C87413o;
import i70.C87672e;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: i70.b */
public final class C87666b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ HashSet<Integer> f253912d;

    /* renamed from: e */
    public final /* synthetic */ C87667c<Object, C86428f<Object>> f253913e;

    /* renamed from: f */
    public final /* synthetic */ C87164i f253914f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87666b(HashSet<Integer> hashSet, C87667c<Object, C86428f<Object>> cVar, C87164i iVar) {
        super(0);
        this.f253912d = hashSet;
        this.f253913e = cVar;
        this.f253914f = iVar;
    }

    public Object invoke() {
        String str;
        HashSet<Integer> hashSet = this.f253912d;
        C87667c<Object, C86428f<Object>> cVar = this.f253913e;
        C87164i iVar = this.f253914f;
        for (Number intValue : hashSet) {
            int intValue2 = intValue.intValue();
            C87672e.C87673a aVar = cVar.f253920g.f253937a.get(Integer.valueOf(intValue2));
            boolean z = false;
            if (!(aVar == null || (str = aVar.f253939b) == null)) {
                if (str.length() > 0) {
                    z = true;
                }
            }
            if (!z) {
                C87672e.m109065b(cVar.f253920g, intValue2, iVar.f252786b, (View) null, 4, (Object) null);
                cVar.mo122090h0(intValue2);
                C87665a aVar2 = cVar.f253924k;
                if (aVar2 != null) {
                    aVar2.mo121197m(intValue2, iVar);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
