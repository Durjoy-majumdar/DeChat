package kf1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C49310eo0;
import te3.C49352ez;
import te3.C49712hj1;

/* renamed from: kf1.v4 */
public final class C10011v4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f30704d;

    /* renamed from: e */
    public final /* synthetic */ C49352ez f30705e;

    /* renamed from: f */
    public final /* synthetic */ C49310eo0 f30706f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10011v4(MMActivity mMActivity, C49352ez ezVar, C49310eo0 eo02) {
        super(0);
        this.f30704d = mMActivity;
        this.f30705e = ezVar;
        this.f30706f = eo02;
    }

    public Object invoke() {
        C7335d c = C86312j.m106911c(C60606n.class);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        C60606n nVar = (C60606n) c;
        AppCompatActivity context = this.f30704d.getContext();
        C87412m.m108593f(context, "activity.context");
        C49352ez ezVar = this.f30705e;
        FinderContact finderContact = this.f30706f.f133028f;
        C60606n.C60607a.m70859c(nVar, context, ezVar, (C49712hj1) null, finderContact != null ? finderContact.username : null, (String) null, 20, (Object) null);
        return C13598b0.f38549a;
    }
}
