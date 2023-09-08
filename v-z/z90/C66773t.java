package z90;

import ca0.C54683f0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C28971l;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.o74;

/* renamed from: z90.t */
public final class C66773t extends C87413o implements C32226l<C28971l<o74>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f191869d;

    /* renamed from: e */
    public final /* synthetic */ boolean f191870e;

    /* renamed from: f */
    public final /* synthetic */ C54683f0 f191871f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66773t(C32224a<C13598b0> aVar, boolean z, C54683f0 f0Var) {
        super(1);
        this.f191869d = aVar;
        this.f191870e = z;
        this.f191871f = f0Var;
    }

    public Object invoke(Object obj) {
        C28971l lVar = (C28971l) obj;
        C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
        this.f191869d.invoke();
        if (this.f191870e) {
            C32226l<String, C13598b0> lVar2 = this.f191871f.f153251c;
            String str = ((o74) lVar.f79451a).f139006d;
            C87412m.m108593f(str, "it.data.music_id");
            lVar2.invoke(str);
        } else {
            C32226l<Object, C13598b0> lVar3 = this.f191871f.f153260l;
            if (lVar3 != null) {
                lVar3.invoke(lVar);
            }
        }
        return C13598b0.f38549a;
    }
}
