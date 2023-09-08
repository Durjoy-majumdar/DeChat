package lg1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import cl1.C39975j;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.ResultKt;
import nk1.C47272h;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50317lw0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.box.plugin.FinderLiveBoxGroupHintPlugin$handleShareToChatGroup$1", mo125469f = "FinderLiveBoxGroupHintPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: lg1.f */
public final class C10511f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<String> f31746d;

    /* renamed from: e */
    public final /* synthetic */ C10509e f31747e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10511f(ArrayList<String> arrayList, C10509e eVar, C15601d<? super C10511f> dVar) {
        super(2, dVar);
        this.f31746d = arrayList;
        this.f31747e = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10511f(this.f31746d, this.f31747e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10511f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        String str = (String) C110818d0.m150923U(this.f31746d);
        C10509e eVar = this.f31747e;
        C87412m.m108593f(str, "lastGroupId");
        C50317lw0 value = ((C39975j) eVar.mo87696x0(C39975j.class)).f107170j.getValue();
        if (C87412m.m108589b(value != null ? value.f137677e : null, str)) {
            Log.m105924i("Finder.FinderLiveBoxGroupHintPlugin", "share to same group, do nothing");
        } else {
            C47272h hVar = C47272h.f126894a;
            if (hVar.mo72302g(str) || hVar.mo72303h(str)) {
                Log.m105924i("Finder.FinderLiveBoxGroupHintPlugin", "share to invalid group, do nothing");
            } else {
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(C53930o0.m60554a(C58901s.f168555a), (C66212f) null, (C53934p0) null, new C46853g(eVar, str, (C15601d<? super C46853g>) null), 3, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
