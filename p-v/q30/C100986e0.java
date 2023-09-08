package q30;

import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import f40.C86709a0;
import k30.C99096a;

/* renamed from: q30.e0 */
public class C100986e0 implements C99096a.C99098b {

    /* renamed from: a */
    public final /* synthetic */ C100991j0 f295708a;

    public C100986e0(C100991j0 j0Var) {
        this.f295708a = j0Var;
    }

    public Object getData() {
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null);
        if (WeChatBrands.Business.Entries.MeSetPrivacyAddByQQ.banned() || num == null || num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C100991j0.m132376b(this.f295708a, 8) || !C100991j0.m132376b(this.f295708a, 16));
    }
}
