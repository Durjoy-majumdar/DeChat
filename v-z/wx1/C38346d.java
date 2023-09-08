package wx1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import sw1.C48484q;

/* renamed from: wx1.d */
public final class C38346d {

    /* renamed from: a */
    public static final C38346d f101204a = new C38346d();

    /* renamed from: a */
    public final void mo61625a(String str) {
        C38347e Og0 = ((C48484q) C86312j.m106911c(C48484q.class)).Og0();
        Og0.getClass();
        C87412m.m108594g(str, "packageName");
        Log.m105924i("MicroMsg.GameResourceDownloadStorage", "updateDownloadTaskFinishedTime, packageName:" + str);
        C38343a Lo = Og0.mo61626Lo(str);
        if (Lo != null) {
            Lo.field_finishDownloadTime = Util.nowSecond();
            Og0.update(Lo, new String[0]);
        }
        C53217b.f148462a.mo73889f(str);
    }
}
