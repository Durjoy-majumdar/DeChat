package sz0;

import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardHomePageNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51917x30;
import wz0.C22945n;

/* renamed from: sz0.a */
public final class C48510a<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ CardHomePageNewUI f129742a;

    /* renamed from: b */
    public final /* synthetic */ String f129743b;

    public C48510a(CardHomePageNewUI cardHomePageNewUI, String str) {
        this.f129742a = cardHomePageNewUI;
        this.f129743b = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            T t = cVar.f256796d;
            CardHomePageNewUI cardHomePageNewUI = this.f129742a;
            String str = this.f129743b;
            C51917x30 x302 = (C51917x30) t;
            Log.m105925i("MicroMsg.CardHomePageNewUI", "retCode: %s", Integer.valueOf(x302.f144420d));
            if (x302.f144420d == 0) {
                CardHomePageNewUI.C18611c cVar2 = cardHomePageNewUI.f51979j;
                if (cVar2 != null) {
                    cVar2.mo23424O4(str);
                    return t;
                }
                C87412m.m108603p("mHomePageAdapter");
                throw null;
            }
            C22945n.m27018r(cardHomePageNewUI, x302.f144421e);
            return t;
        }
        C22945n.m27017q(this.f129742a, "");
        return C13598b0.f38549a;
    }
}
