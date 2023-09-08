package bh1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import yg1.C39014a;
import yg1.C39016i;

/* renamed from: bh1.b */
public final class C28318b implements C39016i {
    /* renamed from: a */
    public boolean mo55917a(C39014a aVar) {
        int i;
        C87412m.m108594g(aVar, "cgiResp");
        int i2 = aVar.f105069b;
        if ((i2 == 4 && aVar.f105068a == -100020) || (i = aVar.f105068a) == -200001) {
            return false;
        }
        if (i2 == 0 && i == 0) {
            return true;
        }
        Log.m105924i("LiveMsgRespErrCodeInterceptor", "doGetLiveMsg errCode:" + aVar.f105068a);
        return false;
    }
}
