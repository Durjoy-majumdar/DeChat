package tz0;

import com.tencent.p014mm.plugin.card.p031ui.p033v3.CardHomePageV3UI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49184dr3;
import wz0.C22945n;

/* renamed from: tz0.a */
public final class C22561a extends C87413o implements C32226l<C89132b.C89134c<C49184dr3>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageV3UI f64889d;

    /* renamed from: e */
    public final /* synthetic */ String f64890e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22561a(CardHomePageV3UI cardHomePageV3UI, String str) {
        super(1);
        this.f64889d = cardHomePageV3UI;
        this.f64890e = str;
    }

    public Object invoke(Object obj) {
        C13598b0 b0Var;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        CardHomePageV3UI cardHomePageV3UI = this.f64889d;
        int i = CardHomePageV3UI.f52082y;
        cardHomePageV3UI.getClass();
        if (cVar == null) {
            return null;
        }
        CardHomePageV3UI cardHomePageV3UI2 = this.f64889d;
        String str = this.f64890e;
        Log.m105924i(cardHomePageV3UI2.f52083d, "errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C49184dr3 dr32 = (C49184dr3) cVar.f256796d;
            if (dr32 == null) {
                return null;
            }
            Log.m105924i(cardHomePageV3UI2.f52083d, "retcode: " + dr32.f132513d + ", retmsg: " + dr32.f132514e);
            if (dr32.f132513d == 0) {
                boolean z = true;
                int size = cardHomePageV3UI2.f52091o.size() - 1;
                while (true) {
                    if (-1 >= size) {
                        z = false;
                        break;
                    } else if (C87412m.m108589b(cardHomePageV3UI2.f52091o.get(size).mo23469a().f64363e, str)) {
                        cardHomePageV3UI2.f52091o.remove(size);
                        break;
                    } else {
                        size--;
                    }
                }
                if (z) {
                    WxRecyclerAdapter<CardHomePageV3UI.C18639a> wxRecyclerAdapter = cardHomePageV3UI2.f52090n;
                    if (wxRecyclerAdapter != null) {
                        wxRecyclerAdapter.notifyDataSetChanged();
                    } else {
                        C87412m.m108603p("mPageAdapter");
                        throw null;
                    }
                }
                cardHomePageV3UI2.mo23467M7();
            } else {
                C22945n.m27018r(cardHomePageV3UI2.getContext(), dr32.f132514e);
            }
            b0Var = C13598b0.f38549a;
        } else {
            C22945n.m27017q(cardHomePageV3UI2.getContext(), "");
            b0Var = C13598b0.f38549a;
        }
        return b0Var;
    }
}
