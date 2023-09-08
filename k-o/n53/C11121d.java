package n53;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import m53.C10765k;
import te3.C48643a02;
import te3.C52330zz1;

/* renamed from: n53.d */
public final class C11121d extends C11131n<C48643a02> {
    public C11121d(LinkedList<Integer> linkedList) {
        C87412m.m108594g(linkedList, "businessID");
        C52330zz1 zz12 = new C52330zz1();
        zz12.f146291d = linkedList;
        zz12.f146292e = C10765k.f32240b;
        mo11234k(zz12, new C48643a02(), 5990, "/cgi-bin/micromsg-bin/getencashprepareinfo");
        Log.m105924i("MicroMsg.CommonWeCoinCgi", "CgiGetEncashPrepareInfoRequest: ");
    }
}
