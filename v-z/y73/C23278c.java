package y73;

import com.tencent.p014mm.autogen.events.SearchSysMsgNotifyEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31924c1;
import java.util.Map;
import ob0.C35136m;
import u73.C22611g1;

/* renamed from: y73.c */
public class C23278c implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        int safeParseInt;
        C22611g1.C22612a aVar2;
        String str2 = str;
        Map<String, String> map2 = map;
        if (map2 != null && str2 != null && str2.equals("mmsearch_reddot_new") && (safeParseInt = Util.safeParseInt(map2.get(".sysmsg.mmsearch_reddot_new.entry"))) == 1) {
            Log.m105925i("FtsRedPointReceiver", "recv %s, %s", "mmsearch_reddot_new", map.toString());
            int safeParseInt2 = Util.safeParseInt(map2.get(".sysmsg.mmsearch_reddot_new.clear"));
            String safeFormatString = Util.safeFormatString(map2.get(".sysmsg.mmsearch_reddot_new.msgid"), new Object[0]);
            int safeParseInt3 = Util.safeParseInt(map2.get(".sysmsg.mmsearch_reddot_new.discovery"));
            int safeParseInt4 = Util.safeParseInt(map2.get(".sysmsg.mmsearch_reddot_new.android_cli_version"));
            long safeParseLong = Util.safeParseLong(map2.get(".sysmsg.mmsearch_reddot_new.expire_time"));
            int safeParseInt5 = Util.safeParseInt(map2.get(".sysmsg.mmsearch_reddot_new.h5_version"));
            int safeParseInt6 = Util.safeParseInt(map2.get(".sysmsg.mmsearch_reddot_new.reddot_type"));
            String str3 = map2.get(".sysmsg.mmsearch_reddot_new.reddot_text");
            String str4 = map2.get(".sysmsg.mmsearch_reddot_new.reddot_icon");
            int i = safeParseInt3;
            long safeParseLong2 = Util.safeParseLong(map2.get(".sysmsg.mmsearch_reddot_new.timestamp"));
            C22611g1 g1Var = C22611g1.f65023c;
            if (safeParseInt != 1) {
                g1Var.getClass();
                aVar2 = null;
            } else {
                aVar2 = g1Var.f65024a;
            }
            if (aVar2 == null) {
                aVar2 = new C22611g1.C22612a();
            }
            if (aVar2.f65034i < safeParseLong2) {
                aVar2.f65026a = safeFormatString;
                aVar2.f65035j = i;
                aVar2.f65027b = safeParseInt;
                aVar2.f65028c = safeParseInt4;
                aVar2.f65029d = safeParseLong;
                aVar2.f65030e = safeParseInt5;
                aVar2.f65031f = safeParseInt6;
                aVar2.f65032g = str3;
                aVar2.f65033h = str4;
                aVar2.f65034i = safeParseLong2;
                aVar2.f65036k = safeParseInt2;
                aVar2.f65037l = System.currentTimeMillis();
            } else {
                Log.m105925i("MicroMsg.WebSearch.WebSearchRedPointMgr", "timestamp %d not big than last msg %d", Long.valueOf(safeParseLong2), Long.valueOf(aVar2.f65034i));
            }
            g1Var.mo35734b();
            new SearchSysMsgNotifyEvent().publish();
        }
    }
}
