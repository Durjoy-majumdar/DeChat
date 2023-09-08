package n53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C87412m;
import m53.C10765k;
import pe3.C89349b;
import te3.C51071r80;
import te3.C51209s80;

/* renamed from: n53.c */
public final class C11120c extends C11131n<C51209s80> {
    public C11120c(String str, C89349b bVar, C89349b bVar2, String str2, int i) {
        C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        C87412m.m108594g(bVar, "ctxBuff");
        C87412m.m108594g(bVar2, "sign");
        C51071r80 r802 = new C51071r80();
        r802.f140754d = bVar;
        r802.f140755e = bVar2;
        r802.f140756f = str;
        r802.f140757g = str2;
        r802.f140758h = i;
        r802.f140759i = C10765k.f32240b;
        mo11234k(r802, new C51209s80(), 5991, "/cgi-bin/micromsg-bin/encashincome");
        Log.m105924i("MicroMsg.CommonWeCoinCgi", "CgiEncashIncomeRequest: ctx_buff: " + bVar + ", sign: " + bVar2);
    }
}
