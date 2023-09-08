package zk1;

import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import rx3.C13605o;
import sx3.C110818d0;

/* renamed from: zk1.d0 */
public final class C16222d0<T> implements C7045j.C7055j {

    /* renamed from: a */
    public final /* synthetic */ C7045j f43445a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<C13605o<ArrayList<String>, ArrayList<List<String>>, ArrayList<List<String>>>> f43446b;

    /* renamed from: c */
    public final /* synthetic */ C16229h f43447c;

    public C16222d0(C7045j jVar, C8479f0<C13605o<ArrayList<String>, ArrayList<List<String>>, ArrayList<List<String>>>> f0Var, C16229h hVar) {
        this.f43445a = jVar;
        this.f43446b = f0Var;
        this.f43447c = hVar;
    }

    /* renamed from: a */
    public final void mo494a(boolean z, Object obj, Object obj2, Object obj3) {
        this.f43445a.mo8101d();
        if (z) {
            try {
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int P = C110818d0.m150918P((List) ((C13605o) this.f43446b.f27484d).f38557d, (CharSequence) obj);
                Object obj4 = ((ArrayList) ((C13605o) this.f43446b.f27484d).f38558e).get(P);
                C87412m.m108593f(obj4, "triple.second[firstChosenIndex]");
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf = ((List) obj4).indexOf((CharSequence) obj2);
                Object obj5 = ((ArrayList) ((C13605o) this.f43446b.f27484d).f38559f).get(indexOf);
                C87412m.m108593f(obj5, "triple.third[secChosenIndex]");
                C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                C16229h.m15122d3(this.f43447c, P, indexOf, ((List) obj5).indexOf((CharSequence) obj3));
            } catch (Throwable th) {
                Log.m105924i(this.f43447c.f43483d, th.getMessage());
            }
        }
    }
}
