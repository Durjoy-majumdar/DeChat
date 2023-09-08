package hl1;

import a14.C0000n0;
import ak1.C54067f0;
import ak1.C54116w;
import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import er1.C58752o;
import er1.C58794z;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import vc3.C78382a;
import vk1.C65762c;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorLivingUIC$dealPermission$1", mo125469f = "FinderLiveVisitorLivingUIC.kt", mo125470l = {3735}, mo125471m = "invokeSuspend")
/* renamed from: hl1.r */
public final class C60024r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f171319d;

    /* renamed from: e */
    public final /* synthetic */ Activity f171320e;

    /* renamed from: f */
    public final /* synthetic */ C59988k f171321f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60024r(Activity activity, C59988k kVar, C15601d<? super C60024r> dVar) {
        super(2, dVar);
        this.f171320e = activity;
        this.f171321f = kVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60024r(this.f171320e, this.f171321f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60024r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f171319d;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58794z zVar = C58794z.f168327a;
            Activity activity = this.f171320e;
            String string = this.f171321f.f166847e.getString(C0966R.string.g_k);
            C87412m.m108593f(string, "context.getString(com.te…live_room_mini_view_fail)");
            String b = C78382a.m94650b();
            C87412m.m108593f(b, "getMessageChannelIdUse()");
            this.f171319d = 1;
            obj = zVar.mo83987b(activity, 21, string, false, true, b, 20000, "finderlivefloatpermission", this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C58752o oVar = (C58752o) obj;
        if (oVar instanceof C58752o.C58755c) {
            Log.m105924i(this.f171321f.f171222i, "ShowWarningAlert positive");
            ((C54116w) C86312j.m106911c(C54116w.class)).Zx0(true, C54067f0.C54084t.LIVE_FLOAT_ACTION_UNKNOWN);
            Bundle bundle = new Bundle();
            C59988k kVar = this.f171321f;
            bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", true);
            C65762c cVar = kVar.f166848f;
            if (!(cVar != null && cVar.isSwipeBack())) {
                i2 = 3;
            }
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", i2);
            bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
            C65762c cVar2 = kVar.f166848f;
            if (cVar2 != null) {
                cVar2.statusChange(C58124b.C58125b.MINI_WINDOW, bundle);
            }
            C65762c cVar3 = this.f171321f.f166848f;
            if (cVar3 != null) {
                cVar3.setMiniWinPermission(false);
            }
        } else if (oVar instanceof C58752o.C58754b) {
            Log.m105924i(this.f171321f.f171222i, "ShowWarningAlert negative");
            C65762c cVar4 = this.f171321f.f166848f;
            if (cVar4 != null) {
                cVar4.setMiniWinPermission(false);
            }
            Bundle bundle2 = new Bundle();
            C65762c cVar5 = this.f171321f.f166848f;
            if (cVar5 != null) {
                cVar5.statusChange(C58124b.C58125b.MINI_WINDOW_REFUSE, bundle2);
            }
        } else if (oVar instanceof C58752o.C58753a) {
            Log.m105924i(this.f171321f.f171222i, "ShowWarningAlert cancel");
            C65762c cVar6 = this.f171321f.f166848f;
            if (cVar6 != null) {
                cVar6.setMiniWinPermission(false);
            }
            Bundle bundle3 = new Bundle();
            C65762c cVar7 = this.f171321f.f166848f;
            if (cVar7 != null) {
                cVar7.statusChange(C58124b.C58125b.MINI_WINDOW_CANCEL, bundle3);
            }
        } else if (oVar instanceof C58752o.C58756d) {
            Log.m105924i(this.f171321f.f171222i, "ShowWarningAlert timeout");
            C65762c cVar8 = this.f171321f.f166848f;
            if (cVar8 != null) {
                cVar8.setMiniWinPermission(false);
            }
            Bundle bundle4 = new Bundle();
            C65762c cVar9 = this.f171321f.f166848f;
            if (cVar9 != null) {
                cVar9.statusChange(C58124b.C58125b.MINI_WINDOW_CANCEL, bundle4);
            }
        }
        return C13598b0.f38549a;
    }
}
