package p750xl;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C31461f3;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import i40.C98598e;
import kotlin.ResultKt;
import p537gq.C32496d;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: xl.b */
public final class C38738b extends C98598e implements C32496d, C31461f3 {

    @C91590f(mo125468c = "com.tencent.mm.feature.StatusNotifyFeatureService$onNotifyUserStatusChange$1", mo125469f = "StatusNotifyFeatureService.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: xl.b$a */
    public static final class C38739a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
        public C38739a(C15601d<? super C38739a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C38739a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C38739a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (C86709a0.m107523b().mo121120t()) {
                long c = C31543z5.m39453c();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AUTH_EX_DEVICE_TIMESTAMP_LONG, new Long(c));
                Log.m105924i("MicroMsg.StatusNotifyFeatureService", "setExDeviceLoginTime " + c);
            }
            return C13598b0.f38549a;
        }
    }

    public long Cs0() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_AUTH_EX_DEVICE_TIMESTAMP_LONG;
        long G = i.mo119673G(aVar, 0);
        if (G != 0 && !C86709a0.m107523b().mo121120t()) {
            return G;
        }
        long c = C31543z5.m39453c();
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(c));
        return c;
    }

    /* renamed from: f4 */
    public void mo24653f4() {
        LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
        if (lifecycleScope != null) {
            LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C38739a((C15601d<? super C38739a>) null), 1, (Object) null);
        }
    }

    public void xx0(Context context) {
        C87412m.m108594g(context, "context");
        C86709a0.m107523b().mo121106a(this);
    }

    public void zx0() {
        C86709a0.m107523b().mo121124y(this);
    }
}
