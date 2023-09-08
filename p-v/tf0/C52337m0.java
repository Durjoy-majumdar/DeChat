package tf0;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import up1.C52587a;
import zh3.C91753f;

/* renamed from: tf0.m0 */
public final class C52337m0 extends C87413o implements C32224a<C91753f> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommonFeatureService f146309d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52337m0(FinderCommonFeatureService finderCommonFeatureService) {
        super(0);
        this.f146309d = finderCommonFeatureService;
    }

    public Object invoke() {
        C91753f fVar = new C91753f();
        String str = C86709a0.m107535s().f251807e + "FinderMessage006.db";
        this.f146309d.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(1689607145, C52335i0.f146307a);
        hashMap.put(1393302590, C52336j0.f146308a);
        hashMap.put(625570077, C37031k0.f98175a);
        return !fVar.mo125626p(str, hashMap, true, true) ? C52587a.f146882a.mo73547a(str, FinderCommonFeatureService.vx0(this.f146309d), true, true) : fVar;
    }
}
