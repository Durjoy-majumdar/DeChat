package i40;

import android.content.Context;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: i40.g */
public class C76285g extends C98597b {

    /* renamed from: f */
    public LifecycleScope f223480f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76285g(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* renamed from: e3 */
    public void mo106534e3(Context context) {
        C87412m.m108594g(context, "context");
        this.f223480f = new LifecycleScope(this.f289092d.getClass().getSimpleName() + "_scope", this.f289092d, 0, 4, (C8480h) null);
    }
}
