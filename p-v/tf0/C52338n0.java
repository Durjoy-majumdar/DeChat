package tf0;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import up1.C52587a;
import zh3.C91753f;

/* renamed from: tf0.n0 */
public final class C52338n0 extends C87413o implements C32224a<C91753f> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommonFeatureService f146310d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52338n0(FinderCommonFeatureService finderCommonFeatureService) {
        super(0);
        this.f146310d = finderCommonFeatureService;
    }

    public Object invoke() {
        C91753f fVar = new C91753f();
        String str = C86709a0.m107535s().f251807e + "FinderMention002.db";
        return !fVar.mo125626p(str, FinderCommonFeatureService.wx0(this.f146310d), true, true) ? C52587a.f146882a.mo73547a(str, FinderCommonFeatureService.vx0(this.f146310d), true, true) : fVar;
    }
}
