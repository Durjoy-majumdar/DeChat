package p767yr;

import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31924c1;
import gy3.C87412m;
import java.util.Map;
import ob0.C35136m;
import te3.C64849yb0;

/* renamed from: yr.b */
public final class C66694b implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (C87412m.m108589b(str, "mmsearch_fts_reddot")) {
            C64849yb0 yb02 = new C64849yb0();
            if (map != null) {
                yb02.f186459d = Util.safeParseInt(map.get(".sysmsg.mmsearch_fts_reddot.android_cli_version"));
                yb02.f186460e = Util.safeFormatString(map.get(".sysmsg.mmsearch_fts_reddot.msgid"), new Object[0]);
                yb02.f186461f = Util.safeParseLong(map.get(".sysmsg.mmsearch_fts_reddot.h5_version"));
                yb02.f186462g = Util.safeParseLong(map.get(".sysmsg.mmsearch_fts_reddot.biz_type"));
                yb02.f186463h = Util.safeParseLong(map.get(".sysmsg.mmsearch_fts_reddot.expose_expire_time"));
                yb02.f186464i = Util.safeParseInt(map.get(".sysmsg.mmsearch_fts_reddot.reddot_action"));
            }
        }
    }
}
