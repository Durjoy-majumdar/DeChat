package fl1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: fl1.q2 */
public final class C32072q2 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f85321d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32072q2(C59161f fVar) {
        super(1);
        this.f85321d = fVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AppCompatActivity appCompatActivity = this.f85321d.f166836e;
            C76912y0.makeText((Context) appCompatActivity, (CharSequence) appCompatActivity.getString(C0966R.string.dr7), 0).show();
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C54067f0 f0Var = C54108o.f151869h;
            ((C54108o) c).Kx0(15, (String) null);
        }
        return C13598b0.f38549a;
    }
}
