package mh0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p753xp.C102704b;
import p867wp.C102479b;
import rx3.C13598b0;

/* renamed from: mh0.k */
public final class C99887k extends C87413o implements C32227p<String, String, C13598b0> {

    /* renamed from: d */
    public static final C99887k f292691d = new C99887k();

    public C99887k() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        C87412m.m108594g(str, "path");
        C102479b as = ((C102704b) C86312j.m106911c(C102704b.class)).mo138751as(str, 9999, (String) obj2, (byte[]) null);
        Log.m105925i("MicroMsg.AlbumMsgSendService", "AlbumCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", str, Integer.valueOf(as.f301760a), Boolean.valueOf(as.f301761b), Boolean.FALSE, Boolean.valueOf(as.f301762c), Long.valueOf(as.f301763d));
        return C13598b0.f38549a;
    }
}
