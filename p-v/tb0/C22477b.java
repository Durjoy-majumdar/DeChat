package tb0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import gy3.C87412m;
import rd0.C22226d;
import vd0.C22736b;

/* renamed from: tb0.b */
public final class C22477b implements C22226d {

    /* renamed from: a */
    public final /* synthetic */ C22474a f63654a;

    /* renamed from: b */
    public final /* synthetic */ C22736b.C22737a f63655b;

    public C22477b(C22474a aVar, C22736b.C22737a aVar2) {
        this.f63654a = aVar;
        this.f63655b = aVar2;
    }

    /* renamed from: a */
    public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(subscribeMsgRequestResult, "result");
        C22474a aVar = this.f63654a;
        aVar.f63645d = subscribeMsgRequestResult;
        aVar.f63643b = subscribeMsgRequestResult.f49008o;
        C22474a aVar2 = this.f63654a;
        SubscribeMsgRequestResult subscribeMsgRequestResult2 = aVar2.f63645d;
        C87412m.m108591d(subscribeMsgRequestResult2);
        aVar2.mo35617i(subscribeMsgRequestResult2.f49004h);
        C22736b.C22737a aVar3 = this.f63655b;
        SubscribeMsgRequestResult subscribeMsgRequestResult3 = this.f63654a.f63645d;
        C87412m.m108591d(subscribeMsgRequestResult3);
        aVar3.mo35839b(new SubscribeMsgSettingData(subscribeMsgRequestResult3, false));
        C22474a aVar4 = this.f63654a;
        aVar4.mo35618j(aVar4.f63645d);
        this.f63654a.mo35619k(1);
    }

    /* renamed from: e */
    public void mo26258e(int i, int i2, String str) {
        C87412m.m108594g(str, "errMsg");
        this.f63655b.mo35838a();
    }
}
