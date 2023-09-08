package lz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kz0.C46827q;
import te3.C49041cr3;
import te3.C49184dr3;

/* renamed from: lz0.d */
public final class C46918d extends C46827q<C49184dr3> {
    public C46918d(String str, String str2) {
        C87412m.m108594g(str, "cardId");
        C87412m.m108594g(str2, "userCardId");
        C49041cr3 cr32 = new C49041cr3();
        C49184dr3 dr32 = new C49184dr3();
        cr32.f131920d = str;
        cr32.f131921e = str2;
        mo72033k(cr32, dr32, 2986, "/cgi-bin/mmpay-bin/mktremovecardinrecentlyusedlist");
        Log.m105924i("MicroMsg.CgiRemoveCardInRecentlyUsedList", "card_id: " + str + ", code: " + str2);
    }
}
