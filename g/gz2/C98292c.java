package gz2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import o60.C100284b;
import t60.C101725g;
import w60.C102351c;
import w60.C102352d;
import x60.C102564a;

/* renamed from: gz2.c */
public final class C98292c extends C100284b<C46003b> {
    /* renamed from: a */
    public void mo95802a(C102564a<C46003b> aVar, C101725g gVar, C100284b.C100285a aVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(gVar, "fileNameCreator");
        C87412m.m108594g(aVar2, "callback");
        try {
            byte[] httpGet = Util.httpGet(((C46003b) aVar.f301995a).f124051d);
            if (httpGet == null) {
                Log.m105920e("MicroMsg.TextStatus.TextStatusLoader", "loadDataImp() data == null url = " + aVar.f301995a);
                aVar2.mo129424a();
                return;
            }
            Log.m105924i("MicroMsg.TextStatus.TextStatusLoader", "loadDataImp() finished with: url = " + aVar.f301995a);
            aVar2.mo129425b(new C102352d(httpGet, "", new C102351c(httpGet)));
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusLoader", th, "loadDataImp err", new Object[0]);
            aVar2.mo129424a();
        }
    }
}
