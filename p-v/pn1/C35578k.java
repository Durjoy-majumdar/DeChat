package pn1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f62.C31922b1;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Map;
import ob0.C35136m;
import te3.C50579nq0;
import te3.C50995qq0;
import te3.C51140rq0;
import up1.C37552n0;

/* renamed from: pn1.k */
public final class C35578k implements C31922b1 {
    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(map, "values");
        C87412m.m108594g(aVar, "addMsgInfo");
        if (C87412m.m108589b(str, "FinderHotWordsJumpMsg")) {
            boolean z = false;
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Px0().mo61202Lo(false);
            C50995qq0 qq02 = new C50995qq0();
            LinkedList<C51140rq0> linkedList = new LinkedList<>();
            Log.m105924i("Finder.FinderSnsKeyWordsJumpConsumer", "msg values: " + map);
            String str2 = ".sysmsg.msg.infos";
            int i = 1;
            while (map.containsKey(str2)) {
                Log.m105924i("Finder.FinderSnsKeyWordsJumpConsumer", "prefix: " + str2);
                C51140rq0 rq02 = new C51140rq0();
                rq02.f141076d = Util.safeParseInt(map.get(str2 + ".start_time"));
                rq02.f141077e = Util.safeParseInt(map.get(str2 + ".end_time"));
                rq02.f141078f = map.get(str2 + ".key_word");
                C50579nq0 nq02 = new C50579nq0();
                nq02.f138717d = Util.safeParseInt(map.get(str2 + ".jump_info.jump_dest"));
                nq02.f138718e = Util.safeParseInt(map.get(str2 + ".jump_info.jump_scene"));
                nq02.f138719f = map.get(str2 + ".jump_info.jump_bypass_info");
                rq02.f141079g = nq02;
                linkedList.add(rq02);
                str2 = ".sysmsg.msg.infos" + i;
                i++;
            }
            qq02.f140453d = linkedList;
            Log.m105924i("Finder.FinderSnsKeyWordsJumpConsumer", "transXmlToFinderKeyWordsJumpConfigMsg: " + qq02);
            LinkedList<C51140rq0> linkedList2 = qq02.f140453d;
            if (linkedList2 == null || linkedList2.isEmpty()) {
                z = true;
            }
            if (!z) {
                LinkedList<C51140rq0> linkedList3 = qq02.f140453d;
                if (linkedList3 != null) {
                    long j = 1;
                    for (C51140rq0 rq03 : linkedList3) {
                        C37552n0 n0Var = new C37552n0();
                        long j2 = j + 1;
                        n0Var.field_localId = j;
                        C50579nq0 nq03 = rq03.f141079g;
                        int i2 = -1;
                        n0Var.field_jumpScene = nq03 != null ? nq03.f138718e : -1;
                        if (nq03 != null) {
                            i2 = nq03.f138717d;
                        }
                        n0Var.field_jumpDest = i2;
                        n0Var.field_startTime = rq03.f141076d;
                        n0Var.field_endTime = rq03.f141077e;
                        n0Var.field_keyWord = rq03.f141078f;
                        n0Var.field_passByInfo = nq03 != null ? nq03.f138719f : null;
                        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Px0().mo61203jo(n0Var);
                        j = j2;
                    }
                }
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Px0().doNotify("SnsHotWord add data");
            } else {
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Px0().mo61202Lo(true);
            }
        }
        return null;
    }
}
