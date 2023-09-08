package vo1;

import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import ok1.C62042e;
import te3.C64338e71;

/* renamed from: vo1.q */
public final class C65815q extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ C65820t f189274d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65815q(C65820t tVar) {
        super(0);
        this.f189274d = tVar;
    }

    public Object invoke() {
        C64338e71 e712 = ((C55001u) this.f189274d.mo83051g(C55001u.class)).f154420q.f182388Z;
        long j = e712 != null ? e712.f182929e : 0;
        if (j <= 0) {
            return "";
        }
        String string = this.f189274d.f189237e.getString(C0966R.string.dvm);
        C87412m.m108593f(string, "context.getString(com.te…r_live_members_total_tip)");
        String format = String.format(string, Arrays.copyOf(new Object[]{C62042e.f176370a.mo87005G(j)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }
}
