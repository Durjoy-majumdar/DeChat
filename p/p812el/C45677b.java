package p812el;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89132b;
import sf0.C48374j0;
import te3.C50930q90;
import te3.C51074r90;

/* renamed from: el.b */
public final class C45677b extends C89132b<C51074r90> {
    public C45677b(String str, int i, String str2) {
        C87412m.m108594g(str, "groupId");
        C50930q90 q902 = new C50930q90();
        C51074r90 r902 = new C51074r90();
        q902.f140193f = 1;
        q902.f140191d = str;
        q902.f140194g = i;
        q902.f140192e = null;
        q902.f140195h = Util.isNullOrNil(str2) ^ true ? 1 : 0;
        q902.f140196i = C48374j0.m53719h(str2, false);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = q902;
        bVar.f127067b = r902;
        bVar.f127068c = "/cgi-bin/micromsg-bin/exchangeemotionpack";
        bVar.f127069d = v2helper.EMethodSetNgStrength;
        bVar.f127070e = 213;
        bVar.f127071f = 1000000213;
        mo123453j(bVar.mo72403a());
    }
}
