package be0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import fy3.C32226l;
import gy3.C87412m;
import rd0.C22222c;
import rd0.C48018e;
import rx3.C13598b0;
import sd0.C22357b;

/* renamed from: be0.g */
public final class C16789g implements C22357b.C22358b {

    /* renamed from: d */
    public final /* synthetic */ String f45350d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<SubscribeMsgSettingData, C13598b0> f45351e;

    public C16789g(String str, C32226l<? super SubscribeMsgSettingData, C13598b0> lVar) {
        this.f45350d = str;
        this.f45351e = lVar;
    }

    /* renamed from: a */
    public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(str, "errMsg");
        if (i != 0 || i2 != 0) {
            this.f45351e.invoke(null);
        } else if (subscribeMsgRequestResult != null) {
            C22222c a = C48018e.f128802a.mo72802a("name_wxa");
            if (a != null) {
                a.mo35361b(this.f45350d, subscribeMsgRequestResult.f49004h, subscribeMsgRequestResult.f49008o, true, false);
            }
            this.f45351e.invoke(new SubscribeMsgSettingData(subscribeMsgRequestResult, true));
        } else {
            this.f45351e.invoke(null);
        }
    }
}
