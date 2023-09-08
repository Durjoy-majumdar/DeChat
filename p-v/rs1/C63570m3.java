package rs1;

import a14.C0000n0;
import bl3.C54492n;
import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C7435f2;
import fy3.C32227p;
import kotlin.ResultKt;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C49712hj1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderFloatBallNormalUIC$addFloatBall$1", mo125469f = "FinderFloatBallNormalUIC.kt", mo125470l = {194}, mo125471m = "invokeSuspend")
/* renamed from: rs1.m3 */
public final class C63570m3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f180267d;

    /* renamed from: e */
    public final /* synthetic */ boolean f180268e;

    /* renamed from: f */
    public final /* synthetic */ boolean f180269f;

    /* renamed from: g */
    public final /* synthetic */ C63575n3 f180270g;

    /* renamed from: h */
    public final /* synthetic */ boolean f180271h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63570m3(boolean z, boolean z2, C63575n3 n3Var, boolean z3, C15601d<? super C63570m3> dVar) {
        super(2, dVar);
        this.f180268e = z;
        this.f180269f = z2;
        this.f180270g = n3Var;
        this.f180271h = z3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63570m3(this.f180268e, this.f180269f, this.f180270g, this.f180271h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63570m3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        FeedData feedData;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f180267d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FinderVideoPassiveMiniViewHelper.C55856d dVar = FinderVideoPassiveMiniViewHelper.f159083D;
            dVar.mo77472a().f311726d.f311696q = this.f180268e;
            FinderVideoPassiveMiniViewHelper a = dVar.mo77472a();
            boolean z = this.f180269f;
            this.f180267d = 1;
            obj = a.mo77464H0(z, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            this.f180270g.f180279e = true;
        }
        Log.m105924i(C54492n.TAG, "addFloatBall: ret=" + booleanValue + ", needTriggerBack=" + this.f180271h + ", isPassive=" + this.f180269f + ", addFromSwipe=" + this.f180268e);
        if (this.f180271h && booleanValue) {
            if (!this.f180270g.mo88421d3(true)) {
                this.f180270g.getActivity().onBackPressed();
            }
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f180270g.getActivity());
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            JSONObject jSONObject = new JSONObject();
            FinderVideoPassiveMiniViewHelper.C55856d dVar2 = FinderVideoPassiveMiniViewHelper.f159083D;
            String str = dVar2.mo77472a().f159094z;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("float_frame_id", str);
            FinderVideoPassiveMiniViewHelper.C55857e eVar = dVar2.mo77472a().f159093y;
            if (!(eVar == null || (feedData = eVar.f159103g) == null)) {
                str2 = C61926c.m72691p(feedData.getFeedId());
            }
            jSONObject.put("feedid", str2);
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(q3, "button_create_float_frame", 1, jSONObject);
        }
        return C13598b0.f38549a;
    }
}
