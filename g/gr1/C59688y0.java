package gr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPOptionalParam;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;

/* renamed from: gr1.y0 */
public final class C59688y0 {

    /* renamed from: a */
    public static final C59688y0 f170516a = new C59688y0();

    /* renamed from: a */
    public final TPOptionalParam mo84671a() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_player_use_soft_decoder, false);
        Log.m105924i("Finder.FinderThumbPlayerParamFactory", "getTPOptionalParam " + wf);
        if (wf) {
            TPOptionalParam buildLong = new TPOptionalParam().buildLong(203, 3);
            C87412m.m108593f(buildLong, "{\n            TPOptional…_ONLY.toLong())\n        }");
            return buildLong;
        }
        TPOptionalParam buildBoolean = new TPOptionalParam().buildBoolean(123, false);
        C87412m.m108593f(buildBoolean, "{\n            var enable…ediaCodecReuse)\n        }");
        return buildBoolean;
    }
}
