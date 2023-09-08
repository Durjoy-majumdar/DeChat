package ca0;

import com.tencent.maas.model.MJMusicInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p004b0.C54372f0;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p415q0.C110261c;
import p560i2.C108325f;
import rx3.C13598b0;

/* renamed from: ca0.w */
public final class C54709w extends C87413o implements C32226l<C54372f0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60667k2<List<MJMusicInfo>> f153341d;

    /* renamed from: e */
    public final /* synthetic */ C54683f0 f153342e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<C108325f> f153343f;

    /* renamed from: g */
    public final /* synthetic */ C60667k2<String> f153344g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54709w(C60667k2<? extends List<? extends MJMusicInfo>> k2Var, C54683f0 f0Var, C60690y0<C108325f> y0Var, C60667k2<String> k2Var2) {
        super(1);
        this.f153341d = k2Var;
        this.f153342e = f0Var;
        this.f153343f = y0Var;
        this.f153344g = k2Var2;
    }

    public Object invoke(Object obj) {
        C54372f0 f0Var = (C54372f0) obj;
        C87412m.m108594g(f0Var, "$this$LazyRow");
        C54372f0.C54373a.m61063b(f0Var, C104353p.m139329h(this.f153341d).size(), new C54707u(this.f153341d), (C32226l) null, C110261c.m149879c(866122223, true, new C54708v(this.f153342e, this.f153341d, this.f153343f, this.f153344g)), 4, (Object) null);
        return C13598b0.f38549a;
    }
}
