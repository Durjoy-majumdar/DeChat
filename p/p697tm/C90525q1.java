package p697tm;

import cc0.C92411b;
import com.tencent.p014mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent;
import com.tencent.p014mm.plugin.appbrand.appusage.C40432h0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81478e0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81481f0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81508l;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Set;
import ob0.C89144l0;
import p702ts.C78085c;

/* renamed from: tm.q1 */
public class C90525q1 extends IStaticListener<ShouldShowAppBrandEntranceInFindMoreEvent> {
    public boolean callback(IEvent iEvent) {
        ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = (ShouldShowAppBrandEntranceInFindMoreEvent) iEvent;
        int i = 0;
        if (!C86709a0.m107522a()) {
            return false;
        }
        shouldShowAppBrandEntranceInFindMoreEvent.f236289e.f236291a = C81508l.m100001c();
        if (!shouldShowAppBrandEntranceInFindMoreEvent.f236288d.f236290a) {
            return true;
        }
        ShouldShowAppBrandEntranceInFindMoreEvent.C80742b bVar = shouldShowAppBrandEntranceInFindMoreEvent.f236289e;
        bVar.f236292b = false;
        bVar.f236293c = false;
        if (C81508l.m100002d()) {
            shouldShowAppBrandEntranceInFindMoreEvent.f236289e.f236293c = true;
        } else {
            C81481f0.C81482a aVar = C81481f0.C81482a.NONE;
            if (C81481f0.m99955a()) {
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_SHOWTYPE_INT, 0)).intValue();
                C81481f0.C81482a[] values = C81481f0.C81482a.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C81481f0.C81482a aVar2 = values[i];
                    if (aVar2.f239079d == intValue) {
                        aVar = aVar2;
                        break;
                    }
                    i++;
                }
            }
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                shouldShowAppBrandEntranceInFindMoreEvent.f236289e.f236292b = true;
            } else if (ordinal == 2) {
                shouldShowAppBrandEntranceInFindMoreEvent.f236289e.f236293c = true;
            }
        }
        ShouldShowAppBrandEntranceInFindMoreEvent.C80742b bVar2 = shouldShowAppBrandEntranceInFindMoreEvent.f236289e;
        if (bVar2.f236292b || bVar2.f236293c) {
            Set<Object> set = C81478e0.f239071d;
            if (C86709a0.m107522a()) {
                C81481f0.C81486e eVar = C81481f0.C81486e.f239082a;
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_HAS_REPORTED_SEE_RED_DOT_BOOLEAN;
                if (!((Boolean) i2.mo119685f(aVar3, Boolean.FALSE)).booleanValue()) {
                    eVar.mo113785b((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 0, eVar.mo113784a());
                    C86709a0.m107535s().mo121142i().mo119677K(aVar3, Boolean.TRUE);
                }
            }
        }
        C81481f0.C81484c cVar = C81481f0.f239076a;
        Set<Object> set2 = C81478e0.f239071d;
        if (!C86709a0.m107522a() || !C89144l0.m111427c()) {
            return true;
        }
        long nowSecond = Util.nowSecond();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_END_TIME_SECOND_LONG, 0L)).longValue();
        long longValue2 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_FREQUENCY_SECOND_LONG, Long.valueOf(MAlarmHandler.NEXT_FIRE_INTERVAL))).longValue();
        C85801v1 i3 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_LAST_TIME_SECOND_LONG;
        long longValue3 = ((Long) i3.mo119685f(aVar4, 0L)).longValue() + longValue2;
        if (longValue3 <= 0 || nowSecond >= longValue || nowSecond < longValue3) {
            return true;
        }
        Log.m105918d("MicroMsg.AppBrandPushNewOrRedDotLogic", "doReport");
        C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        C40432h0 h0Var = new C40432h0(cVar);
        ((HashSet) C84737f0.f247137a).add(h0Var);
        ms.mo126412f(h0Var, true);
        C5139t.m5183e(22, 10);
        C86709a0.m107535s().mo121142i().mo119677K(aVar4, Long.valueOf(nowSecond));
        return true;
    }
}
