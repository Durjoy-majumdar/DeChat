package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.Arrays;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.f0 */
public final class C81481f0 {

    /* renamed from: a */
    public static final C81484c f239076a = new C81484c();

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.f0$a */
    public enum C81482a {
        NONE(0);
        

        /* renamed from: d */
        public final int f239079d;

        /* access modifiers changed from: public */
        C81482a(int i) {
            this.f239079d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.f0$b */
    public static final class C81483b {

        /* renamed from: a */
        public static final C81483b f239080a = new C81483b();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.f0$c */
    public static final class C81484c {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.f0$d */
    public static final class C81485d {

        /* renamed from: a */
        public final String[] f239081a;

        public C81485d() {
            String[] strArr = new String[9];
            this.f239081a = strArr;
            Arrays.fill(strArr, "0");
            strArr[0] = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, "");
            strArr[1] = String.valueOf(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L));
            strArr[2] = String.valueOf(Util.nowSecond());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.f0$e */
    public static final class C81486e {

        /* renamed from: a */
        public static final C81486e f239082a = new C81486e();

        /* renamed from: a */
        public final int mo113784a() {
            if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN, false)) {
                return 1;
            }
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_REASON_INT, 0)).intValue();
            return intValue > 0 ? intValue + 1 : intValue;
        }

        /* renamed from: b */
        public final void mo113785b(String str, long j, int i, int i2) {
            C115669n.INSTANCE.mo160131h(14112, 1, Util.nullAsNil(str), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public static boolean m99955a() {
        boolean z = false;
        if (!C86709a0.m107522a()) {
            return false;
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_END_TIME_SECOND_LONG;
        long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
        if (longValue > Util.nowSecond()) {
            z = true;
        }
        if (!z && longValue > 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
            C81486e eVar = C81486e.f239082a;
            eVar.mo113785b((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 3, eVar.mo113784a());
        }
        return z;
    }

    /* renamed from: b */
    public static void m99956b(boolean z, long j, long j2) {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_END_TIME_SECOND_LONG;
        long j3 = 0;
        if (z) {
            j3 = Util.nowSecond() + Math.max(0, j);
        }
        i.mo119677K(aVar, Long.valueOf(j3));
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_FREQUENCY_SECOND_LONG;
        if (!z) {
            j2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        i2.mo119677K(aVar2, Long.valueOf(j2));
    }

    /* renamed from: c */
    public static void m99957c(boolean z, long j) {
        long j2;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_END_TIME_SECOND_LONG;
        if (!z) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
            return;
        }
        if (j == 0) {
            j2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
        } else {
            j2 = Math.max(0, j) + Util.nowSecond();
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(j2));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_SHOW_RED_DOT_ONCE_BOOLEAN, Boolean.TRUE);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_HAS_REPORTED_SEE_RED_DOT_BOOLEAN, Boolean.FALSE);
        C81486e eVar = C81486e.f239082a;
        eVar.mo113785b((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 1, eVar.mo113784a());
    }
}
