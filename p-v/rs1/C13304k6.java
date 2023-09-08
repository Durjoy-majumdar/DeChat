package rs1;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.sdk.platformtools.Log;
import rs1.C13273i6;
import te3.C50292lo2;

/* renamed from: rs1.k6 */
public final class C13304k6 implements C115477b {

    /* renamed from: a */
    public final /* synthetic */ C13273i6.C13274a f37755a;

    public C13304k6(C13273i6.C13274a aVar) {
        this.f37755a = aVar;
    }

    /* renamed from: a */
    public void mo5700a(String str, int i) {
        Log.m105924i("MicroMsg.FinderLiveIncomeListUIC", "preload liteapp " + str + " failed, errCode:" + i);
    }

    /* renamed from: b */
    public void mo5701b(WxaLiteAppInfo wxaLiteAppInfo, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("preload liteapp ");
        C50292lo2 lo22 = this.f37755a.f37686j;
        String str = lo22 != null ? lo22.f137549d : null;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(" success");
        Log.m105924i("MicroMsg.FinderLiveIncomeListUIC", sb.toString());
    }
}
