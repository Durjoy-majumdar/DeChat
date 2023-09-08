package pu1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import j03.C60698b;
import rx3.C13598b0;

/* renamed from: pu1.d */
public final class C62501d extends C87413o implements C32226l<C60695a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110251b f177543d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62501d(C110251b bVar) {
        super(1);
        this.f177543d = bVar;
    }

    public Object invoke(Object obj) {
        C60695a aVar = (C60695a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        C60698b player = aVar.getPlayer();
        long propertyLong = player != null ? player.getPropertyLong(205) : 0;
        C60698b player2 = aVar.getPlayer();
        int i = 0;
        int videoWidth = player2 != null ? player2.getVideoWidth() : 0;
        C60698b player3 = aVar.getPlayer();
        if (player3 != null) {
            i = player3.getVideoHeight();
        }
        String str = this.f177543d.f329787f;
        Log.m105924i(str, "setInputContentInfo, size:[" + videoWidth + ", " + i + "], rotate:" + propertyLong);
        this.f177543d.f329790i.mo163264l(videoWidth, i, (int) propertyLong);
        return C13598b0.f38549a;
    }
}
