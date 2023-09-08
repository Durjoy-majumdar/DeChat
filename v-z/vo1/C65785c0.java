package vo1;

import a14.C0000n0;
import android.content.Context;
import android.content.Intent;
import bp1.C54519d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57957o;
import er1.C58752o;
import er1.C58794z;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import vc3.C78382a;
import vo1.C65770a0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.replay.FinderLiveReplayService$requestPermissionToStartMiniUI$1", mo125469f = "FinderLiveReplayService.kt", mo125470l = {731}, mo125471m = "invokeSuspend")
/* renamed from: vo1.c0 */
public final class C65785c0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f189225d;

    /* renamed from: e */
    public final /* synthetic */ Context f189226e;

    /* renamed from: f */
    public final /* synthetic */ C65770a0 f189227f;

    /* renamed from: g */
    public final /* synthetic */ Intent f189228g;

    /* renamed from: vo1.c0$a */
    public static final class C65786a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65786a(C65770a0 a0Var) {
            super(0);
            this.f189229d = a0Var;
        }

        public Object invoke() {
            C57957o oVar = this.f189229d.f189191e;
            if (oVar != null) {
                oVar.mo78590q();
            }
            C65770a0 a0Var = this.f189229d;
            C54519d dVar = (C54519d) a0Var.mo89804e(C54519d.class);
            a0Var.mo89811l(5, dVar != null ? dVar.mo75371d3() : 0, true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vo1.c0$b */
    public static final class C65787b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65787b(C65770a0 a0Var) {
            super(0);
            this.f189230d = a0Var;
        }

        public Object invoke() {
            C57957o oVar = this.f189230d.f189191e;
            if (oVar != null) {
                oVar.mo78590q();
            }
            C65770a0 a0Var = this.f189230d;
            C54519d dVar = (C54519d) a0Var.mo89804e(C54519d.class);
            a0Var.mo89811l(6, dVar != null ? dVar.mo75371d3() : 0, true);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65785c0(Context context, C65770a0 a0Var, Intent intent, C15601d<? super C65785c0> dVar) {
        super(2, dVar);
        this.f189226e = context;
        this.f189227f = a0Var;
        this.f189228g = intent;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65785c0(this.f189226e, this.f189227f, this.f189228g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65785c0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f189225d;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58794z zVar = C58794z.f168327a;
            Context context = this.f189226e;
            String string = context.getResources().getString(C0966R.string.e69);
            C87412m.m108593f(string, "context.resources.getStr…ive_replay_miniview_tips)");
            String b = C78382a.m94650b();
            C87412m.m108593f(b, "getMessageChannelIdUse()");
            this.f189225d = 1;
            obj2 = zVar.mo83987b(context, 21, string, false, true, b, 20000, "finderreplayfloatpermission", this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } catch (Throwable th) {
                Log.m105920e("FinderLiveReplayService", "requestPermissionToStartMiniUI " + th.getMessage());
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C58752o oVar = (C58752o) obj2;
        if (oVar instanceof C58752o.C58755c) {
            Log.m105924i("FinderLiveReplayService", "requestPermissionToStartMiniUI ShowWarningAlert positive");
            C65770a0 a0Var = this.f189227f;
            Intent intent = this.f189228g;
            C65770a0.C65771b bVar = C65770a0.f189184r;
            a0Var.mo89817r(intent);
        } else {
            if (!(oVar instanceof C58752o.C58754b)) {
                z = oVar instanceof C58752o.C58753a;
            }
            if (z) {
                Log.m105924i("FinderLiveReplayService", "requestPermissionToStartMiniUI result:" + oVar + ",release replay!");
                C61926c.m72668M(new C65786a(this.f189227f));
            } else if (oVar instanceof C58752o.C58756d) {
                Log.m105924i("FinderLiveReplayService", "requestPermissionToStartMiniUI time out");
                C61926c.m72668M(new C65787b(this.f189227f));
            }
        }
        return C13598b0.f38549a;
    }
}
