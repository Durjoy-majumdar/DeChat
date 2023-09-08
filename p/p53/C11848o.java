package p53;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C50292lo2;

/* renamed from: p53.o */
public final class C11848o implements C115477b {

    /* renamed from: a */
    public final /* synthetic */ C11851r f34651a;

    public C11848o(C11851r rVar) {
        this.f34651a = rVar;
    }

    /* renamed from: a */
    public void mo5700a(String str, int i) {
        Log.m105924i("MicroMsg.WeCoinIncomeDetailViewModel", "preload liteapp " + str + " failed, errCode:" + i);
    }

    /* renamed from: b */
    public void mo5701b(WxaLiteAppInfo wxaLiteAppInfo, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("preload liteapp ");
        C50292lo2 lo22 = this.f34651a.f34666r;
        String str = lo22 != null ? lo22.f137549d : null;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(" success");
        Log.m105924i("MicroMsg.WeCoinIncomeDetailViewModel", sb.toString());
    }
}
