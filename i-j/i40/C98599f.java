package i40;

import android.content.Context;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.p014mm.sdk.statecenter.ServiceStateCenter;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: i40.f */
public abstract class C98599f<State extends BaseState> extends C98597b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98599f(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* renamed from: e3 */
    public void mo106534e3(Context context) {
        C87412m.m108594g(context, "context");
        new ServiceStateCenter(mo137991g3(), this.f289092d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
    }

    /* renamed from: g3 */
    public abstract State mo137991g3();
}
