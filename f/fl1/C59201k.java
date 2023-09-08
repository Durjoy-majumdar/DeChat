package fl1;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32232u;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import te3.C49291ej0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: fl1.k */
public final class C59201k extends C87413o implements C32232u<Boolean, Boolean, String, Integer, Integer, String, C49291ej0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169338d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59201k(C59161f fVar) {
        super(7);
        this.f169338d = fVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        C56032b bVar;
        C55908a activityScope;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        String str = (String) obj3;
        int intValue = ((Number) obj4).intValue();
        int intValue2 = ((Number) obj5).intValue();
        String str2 = (String) obj6;
        C49291ej0 ej02 = (C49291ej0) obj7;
        Class cls = C54991o.class;
        C87412m.m108594g(str, "verifyUrl");
        C87412m.m108594g(str2, "errMsg");
        C87412m.m108594g(ej02, "resp");
        C53973z1 z1Var = ((C54991o) this.f169338d.f166851d.mo71262a(cls)).f154217J3;
        C53973z1 z1Var2 = null;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C54991o oVar = (C54991o) this.f169338d.f166851d.mo71262a(cls);
        if (!(FinderLiveService.f159376d == null || (bVar = FinderLiveService.f159379g) == null || (activityScope = bVar.getActivityScope()) == null)) {
            z1Var2 = C53895h.m60466d(activityScope, (C66212f) null, (C53934p0) null, new C59196j(this.f169338d, booleanValue, intValue2, booleanValue2, str, ej02, intValue, str2, (C15601d<? super C59196j>) null), 3, (Object) null);
        }
        oVar.f154217J3 = z1Var2;
        return C13598b0.f38549a;
    }
}
