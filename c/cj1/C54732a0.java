package cj1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58291w0;
import er1.C58730g5;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12360e8;
import rx3.C13598b0;
import s43.C13621b;

/* renamed from: cj1.a0 */
public final class C54732a0 extends C87413o implements C32226l<C13621b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54820t f153382d;

    /* renamed from: e */
    public final /* synthetic */ C12360e8.C12371d f153383e;

    /* renamed from: f */
    public final /* synthetic */ String f153384f;

    /* renamed from: g */
    public final /* synthetic */ int f153385g;

    /* renamed from: h */
    public final /* synthetic */ String f153386h;

    /* renamed from: i */
    public final /* synthetic */ C58291w0 f153387i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54732a0(C54820t tVar, C12360e8.C12371d dVar, String str, int i, String str2, C58291w0 w0Var) {
        super(1);
        this.f153382d = tVar;
        this.f153383e = dVar;
        this.f153384f = str;
        this.f153385g = i;
        this.f153386h = str2;
        this.f153387i = w0Var;
    }

    public Object invoke(Object obj) {
        C13621b bVar = (C13621b) obj;
        C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
        Log.m105924i(this.f153382d.f153694d, "[WeCoin] doPostGift consumeGift onSuccess");
        C12360e8.C12371d dVar = this.f153383e;
        if (dVar != null) {
            C12360e8.C12371d.C12372a.m11940a(dVar, true, 0, C12360e8.C12371d.C12373b.OK, this.f153384f, Long.valueOf(bVar.f38589a), this.f153385g, this.f153386h, (String) null, this.f153387i, 128, (Object) null);
        }
        C58730g5 g5Var = C58730g5.f168158a;
        C115669n.INSTANCE.mo175912v(C58730g5.f168165h, 79);
        return C13598b0.f38549a;
    }
}
