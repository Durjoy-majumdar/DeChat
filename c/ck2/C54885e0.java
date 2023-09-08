package ck2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58100z0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import p145dx.C58451o;
import p145dx.C58454u;
import pj2.C62323d;
import pj2.C62324e;
import pj2.C62328j;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sj2.C63923e;
import sj2.C63924f;
import sj2.C63933g;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ck2.e0 */
public final class C54885e0 extends UIComponent implements C58454u {

    /* renamed from: d */
    public C53973z1 f153839d;

    /* renamed from: e */
    public final C13601g f153840e = C36568h.m40985a(C54887b.f153843d);

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneSearchDataUIC$loadMore$1", mo125469f = "RingtoneSearchDataUIC.kt", mo125470l = {55}, mo125471m = "invokeSuspend")
    /* renamed from: ck2.e0$a */
    public static final class C54886a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f153841d;

        /* renamed from: e */
        public final /* synthetic */ C54885e0 f153842e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54886a(C54885e0 e0Var, C15601d<? super C54886a> dVar) {
            super(2, dVar);
            this.f153842e = e0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54886a(this.f153842e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54886a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Class cls = C54873a.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f153841d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C63933g c3 = this.f153842e.mo75828c3();
                C54885e0 e0Var = this.f153842e;
                e0Var.getClass();
                int i2 = ((RingtoneDataUIC) C39818r.f106831a.mo62444c(e0Var.getActivity()).mo75002a(RingtoneDataUIC.class)).f164074g;
                this.f153841d = 1;
                obj = c3.mo13066a(i2, false, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C63923e eVar = (C63923e) obj;
            if (!eVar.f181197c) {
                ((C54873a) C39818r.f106831a.mo62444c(this.f153842e.getActivity()).mo75002a(cls)).mo75817c3();
                return C13598b0.f38549a;
            }
            List<C62323d> list = eVar.f181195a;
            C39818r rVar = C39818r.f106831a;
            ((C54873a) rVar.mo62444c(this.f153842e.getActivity()).mo75002a(cls)).mo75818d3(list);
            if (!eVar.f181196b) {
                ((C54873a) rVar.mo62444c(this.f153842e.getActivity()).mo75002a(cls)).mo75817c3();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ck2.e0$b */
    public static final class C54887b extends C87413o implements C32224a<C63933g> {

        /* renamed from: d */
        public static final C54887b f153843d = new C54887b();

        public C54887b() {
            super(0);
        }

        public Object invoke() {
            C63924f a = C63924f.f181198b.mo88701a(2);
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.ringtone.flow.RingtoneSearchDataLoader");
            return (C63933g) a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54885e0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: K */
    public void mo75826K(boolean z) {
        Class cls = C54873a.class;
        if (!mo75828c3().f181220g) {
            ((C54873a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).mo75817c3();
            return;
        }
        if (z) {
            C62328j jVar = ((C54873a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).f153804d;
            jVar.getClass();
            Log.m105924i("MicroMsg.RingtoneDataViewModel", "loading");
            ((C58100z0) jVar.f177168d).mo82832d(new C58451o.C58452a((List<? extends C62323d>) null, 2));
        }
        C53973z1 z1Var = this.f153839d;
        boolean z2 = true;
        if (z1Var == null || !z1Var.mo74466a()) {
            z2 = false;
        }
        if (!z2) {
            this.f153839d = C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54886a(this, (C15601d<? super C54886a>) null), 3, (Object) null);
        }
    }

    /* renamed from: Q0 */
    public void mo75827Q0(String str) {
        C87412m.m108594g(str, "str");
        C53973z1 z1Var = this.f153839d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C62328j jVar = ((C54873a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54873a.class)).f153804d;
        jVar.getClass();
        Log.m105924i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
        ((C58100z0) jVar.f177168d).mo82832d(new C58451o.C58452a((List<? extends C62323d>) null, 1));
        C63933g c3 = mo75828c3();
        c3.getClass();
        c3.f181222i = str;
        c3.f181221h = -1;
        c3.f181220g = true;
        c3.f181219f = Util.nowMilliSecond();
        ((ArrayList) c3.f181201a).clear();
        mo75826K(true);
    }

    /* renamed from: c3 */
    public final C63933g mo75828c3() {
        return (C63933g) ((C36570n) this.f153840e).getValue();
    }

    /* renamed from: l */
    public void mo75829l() {
        C53973z1 z1Var = this.f153839d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C63933g c3 = mo75828c3();
        c3.getClass();
        c3.f181222i = "";
        c3.f181221h = -1;
        c3.f181220g = true;
        c3.f181219f = Util.nowMilliSecond();
        ((ArrayList) c3.f181201a).clear();
        C62328j jVar = ((C54873a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54873a.class)).f153804d;
        jVar.getClass();
        Log.m105924i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
        ((C58100z0) jVar.f177168d).mo82832d(new C58451o.C58452a((List<? extends C62323d>) null, 1));
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        C39818r rVar = C39818r.f106831a;
        ((RingtoneDataUIC) rVar.mo62444c(getActivity()).mo75002a(RingtoneDataUIC.class)).getClass();
        mo75828c3().f181218e = ((C54913i0) rVar.mo62444c(getActivity()).mo75002a(C54913i0.class)).f153914e;
    }

    public void onDestroy() {
        mo75828c3().mo88700c(2);
        C53973z1 z1Var = this.f153839d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        super.onDestroy();
    }

    public void onPause() {
        C53973z1 z1Var = this.f153839d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C54873a aVar = (C54873a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54873a.class);
        List<C62324e> list = mo75828c3().f181201a;
        aVar.getClass();
        C87412m.m108594g(list, "data");
        if (!((ArrayList) list).isEmpty()) {
            aVar.mo75818d3(list);
        }
    }
}
