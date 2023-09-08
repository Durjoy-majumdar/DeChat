package pp3;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C75061i;
import com.tencent.p014mm.vfs.C75063i0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp3.r */
public final class C77235r extends C87413o implements C32226l<C75063i0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f225345d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77235r(MultiProcessMMKV multiProcessMMKV) {
        super(1);
        this.f225345d = multiProcessMMKV;
    }

    public Object invoke(Object obj) {
        C75063i0 i0Var = (C75063i0) obj;
        C87412m.m108594g(i0Var, "$this$lruExpire");
        i0Var.f220844d = this.f225345d.getLong("finder_vfs_storage_first_page_config", C75061i.C75062a.m90020a(i0Var, 3));
        return C13598b0.f38549a;
    }
}
