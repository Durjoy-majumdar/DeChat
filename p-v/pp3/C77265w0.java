package pp3;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.vfs.C75057b1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp3.w0 */
public final class C77265w0 extends C87413o implements C32226l<C75057b1, C13598b0> {

    /* renamed from: d */
    public static final C77265w0 f225377d = new C77265w0();

    public C77265w0() {
        super(1);
    }

    public Object invoke(Object obj) {
        C75057b1 b1Var = (C75057b1) obj;
        C87412m.m108594g(b1Var, "$this$storage");
        b1Var.mo104647b(MAlarmHandler.NEXT_FIRE_INTERVAL);
        b1Var.f220825b = "skyline_cache";
        b1Var.f220828e = Boolean.TRUE;
        return C13598b0.f38549a;
    }
}
