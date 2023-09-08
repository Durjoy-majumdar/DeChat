package p165hr;

import android.content.Context;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveShoppingService", mo125469f = "FinderLiveShoppingService.kt", mo125470l = {115, 117}, mo125471m = "requestProductWithLiveInfo")
/* renamed from: hr.n0 */
public final class C60101n0 extends C66704d {

    /* renamed from: d */
    public Object f171493d;

    /* renamed from: e */
    public Object f171494e;

    /* renamed from: f */
    public Object f171495f;

    /* renamed from: g */
    public Object f171496g;

    /* renamed from: h */
    public long f171497h;

    /* renamed from: i */
    public /* synthetic */ Object f171498i;

    /* renamed from: j */
    public final /* synthetic */ C60095m0 f171499j;

    /* renamed from: n */
    public int f171500n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60101n0(C60095m0 m0Var, C15601d<? super C60101n0> dVar) {
        super(dVar);
        this.f171499j = m0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f171498i = obj;
        this.f171500n |= Integer.MIN_VALUE;
        return C60095m0.vx0(this.f171499j, (Context) null, (String) null, 0, this);
    }
}
