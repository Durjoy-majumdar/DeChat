package il1;

import a14.C0000n0;
import a14.C53873d2;
import a14.C53973z1;
import android.widget.FrameLayout;
import cj1.C0548h5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import kotlin.ResultKt;
import l31.C61212e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorLikeWidget$stopPostLike$1", mo125469f = "FinderLiveVisitorLikeWidget.kt", mo125470l = {212}, mo125471m = "invokeSuspend")
/* renamed from: il1.r8 */
public final class C60504r8 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f172456d;

    /* renamed from: e */
    public final /* synthetic */ C60424h8 f172457e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60504r8(C60424h8 h8Var, C15601d<? super C60504r8> dVar) {
        super(2, dVar);
        this.f172457e = h8Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60504r8(this.f172457e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60504r8) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f172456d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53973z1 z1Var = this.f172457e.f172283H;
            if (z1Var != null) {
                this.f172456d = 1;
                if (C53873d2.m60391c(z1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C60424h8 h8Var = this.f172457e;
        if (h8Var.f172280E > 0) {
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C60424h8 h8Var2 = this.f172457e;
            FrameLayout frameLayout = h8Var2.f172289t;
            C13604l[] lVarArr = new C13604l[2];
            lVarArr[0] = new C13604l("live_like_type", new Integer(h8Var2.f172280E > 1 ? 1 : 0));
            lVarArr[1] = new C13604l("live_like_count", new Integer(this.f172457e.f172280E));
            eVar.mo86153W7("finder_live_room_like_longpress", frameLayout, C90364q0.m113147f(lVarArr), 25561);
        } else {
            String str = h8Var.f172287r;
            Log.m105924i(str, "reportSdk like count: " + this.f172457e.f172280E + ' ');
        }
        C60424h8 h8Var3 = this.f172457e;
        h8Var3.f172280E = 0;
        h8Var3.f166287d.post(new C60463n8(h8Var3, ((C54991o) h8Var3.f172286q.mo87696x0(C54991o.class)).f154276X));
        C0548h5 h5Var = C0548h5.f1327a;
        C60424h8 h8Var4 = this.f172457e;
        C0548h5.m491b(h5Var, h8Var4.f172285p, ((C55001u) h8Var4.f172286q.mo87696x0(C55001u.class)).f154420q.f182392d, C0548h5.C0550b.Like, false, 8, (Object) null);
        return C13598b0.f38549a;
    }
}
