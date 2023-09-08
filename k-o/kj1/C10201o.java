package kj1;

import ak1.C0073g0;
import ak1.C54108o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import nj3.C76912y0;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C50415mk1;

/* renamed from: kj1.o */
public final class C10201o extends C87413o implements C32227p<Boolean, C50415mk1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f31180d;

    /* renamed from: e */
    public final /* synthetic */ C10125e1 f31181e;

    /* renamed from: f */
    public final /* synthetic */ SafeResume<Boolean> f31182f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10201o(boolean z, C10125e1 e1Var, SafeResume<Boolean> safeResume) {
        super(2);
        this.f31180d = z;
        this.f31181e = e1Var;
        this.f31182f = safeResume;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C50415mk1 mk12 = (C50415mk1) obj2;
        String string = this.f31180d ? MMApplicationContext.getContext().getResources().getString(C0966R.string.fq7) : MMApplicationContext.getContext().getResources().getString(C0966R.string.fq6);
        C87412m.m108593f(string, "if (check) {\n           …                        }");
        C87412m.m108593f(this.f31180d ? this.f31181e.f30985d.getResources().getString(C0966R.string.fpg) : this.f31181e.f30985d.getResources().getString(C0966R.string.fpe), "if (check) {\n           …                        }");
        if (booleanValue) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C0073g0 g0Var = C0073g0.LIVE_MIC_INTERCOM;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.f31180d ? "0" : "1");
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f(j5Var, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
        } else {
            MMActivity mMActivity = this.f31181e.f30985d;
            C76912y0.m92763b(mMActivity, string + MMApplicationContext.getContext().getResources().getString(C0966R.string.f360496d80));
        }
        this.f31182f.resume(Boolean.valueOf(booleanValue));
        return C13598b0.f38549a;
    }
}
