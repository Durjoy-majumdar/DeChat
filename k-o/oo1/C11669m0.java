package oo1;

import ak1.C54067f0;
import android.content.Context;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import java.util.HashMap;
import je1.C46553z0;
import nr3.C89059e;
import oo1.C11614d0;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49712hj1;

/* renamed from: oo1.m0 */
public final class C11669m0 extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11614d0 f34192d;

    /* renamed from: e */
    public final /* synthetic */ C11614d0.C11618c f34193e;

    /* renamed from: f */
    public final /* synthetic */ boolean f34194f;

    /* renamed from: g */
    public final /* synthetic */ C11614d0.C11619d f34195g;

    /* renamed from: h */
    public final /* synthetic */ int f34196h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11669m0(C11614d0 d0Var, C11614d0.C11618c cVar, boolean z, C11614d0.C11619d dVar, int i) {
        super(2);
        this.f34192d = d0Var;
        this.f34193e = cVar;
        this.f34194f = z;
        this.f34195g = dVar;
        this.f34196h = i;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        if (intValue != 0) {
            C11614d0 d0Var = this.f34192d;
            C11614d0.C11618c cVar = this.f34193e;
            int i = 1;
            if (intValue != 1) {
                i = 2;
            }
            C11614d0.m11397c(d0Var, cVar, i);
        }
        if (this.f34194f) {
            HashMap hashMap = new HashMap();
            C11614d0 d0Var2 = this.f34192d;
            C11614d0.C11618c cVar2 = this.f34193e;
            hashMap.put("finder_username", d0Var2.f34036a);
            String str = cVar2.f34065a.f132126o;
            if (str == null) {
                str = "";
            }
            hashMap.put("activityId", str);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C54067f0.C0066n nVar = C54067f0.C0066n.LIVE_CONCERT_PROFILE_RECIVE;
            C49712hj1 hj12 = this.f34192d.f34039d;
            C8777j5.C8778a.m8609j((C8777j5) c, nVar, hashMap, hj12.f134671e, String.valueOf(hj12.f134675i), (String) null, 16, (Object) null);
            C11614d0 d0Var3 = this.f34192d;
            C49098d51 d512 = this.f34193e.f34065a;
            d0Var3.getClass();
            String str2 = d512.f132126o;
            String str3 = str2 == null ? "" : str2;
            String str4 = d512.f132122h;
            C89059e i2 = new C46553z0(str3, (String) null, (byte[]) null, 0, 0, str4 == null ? "" : str4, 1, false, 158, (C8480h) null).mo9225i();
            Context context = d0Var3.f34037b;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) context);
            i2.mo123420E(new C11679r0(d0Var3));
        }
        this.f34192d.mo11525f();
        this.f34195g.notifyItemChanged(this.f34196h);
        return C13598b0.f38549a;
    }
}
