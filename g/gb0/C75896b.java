package gb0;

import android.os.Build;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: gb0.b */
public class C75896b {

    /* renamed from: a */
    public ArrayList<C75897a> f222574a = new ArrayList<>();

    /* renamed from: gb0.b$a */
    public interface C75897a {
        /* renamed from: a */
        void mo102636a();
    }

    /* renamed from: gb0.b$b */
    public enum C75898b {
        Main,
        Chatting
    }

    /* renamed from: a */
    public final void mo106162a(String str, Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        String str3 = str2 + "chatting.";
        String nullAsNil = Util.nullAsNil(map2.get(str3 + FingerprintManagerProxy.FINGERPRINT_SERVICE));
        if (!str3.equals(".sysmsg.banner.monitorbanner_n.") || Util.isNullOrNil(nullAsNil)) {
            String nullAsNil2 = Util.nullAsNil(map2.get(str3 + "url"));
            String nullAsNil3 = Util.nullAsNil(map2.get(str3 + "wording"));
            long j = Util.getLong(map2.get(str3 + "duration"), 0);
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append("autotrigger");
            boolean z = Util.getInt(map2.get(sb.toString()), 0) == 1;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append("closable");
            boolean z2 = Util.getInt(map2.get(sb4.toString()), 0) == 1;
            String str4 = str2 + "mainframe.";
            String nullAsNil4 = Util.nullAsNil(map2.get(str4 + "url"));
            String nullAsNil5 = Util.nullAsNil(map2.get(str4 + "wording"));
            String str5 = "MicroMsg.ChattingMonitoredBannerStorage";
            String str6 = nullAsNil4;
            long j2 = Util.getLong(map2.get(str4 + "duration"), 0);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str4);
            sb5.append("autotrigger");
            boolean z3 = Util.getInt(map2.get(sb5.toString()), 0) == 1;
            boolean z4 = false;
            if (Util.getInt(map2.get(str4 + "closable"), 0) == 1) {
                z4 = true;
            }
            if (!Util.isNullOrNil(nullAsNil5) || !Util.isNullOrNil(nullAsNil3)) {
                Log.m105918d(str5, "received msg:\nchattingUrl = " + nullAsNil2 + "\nchattingWording = " + nullAsNil3 + "\nchattingDuration = " + j + "\nchattingAutotrigger = " + z + "\nchattingCloseable = " + z2 + "\nfingerPrint = " + nullAsNil);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, nullAsNil3);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_URL_STRING_SYNC, nullAsNil2);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, Long.valueOf(j));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, Boolean.valueOf(z2));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, Boolean.valueOf(z));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_FINGER_PRINT_STRING_SYNC, nullAsNil);
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC;
                Boolean bool = Boolean.FALSE;
                u.mo119677K(aVar, bool);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, nullAsNil5);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_URL_STRING_SYNC, str6);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, Long.valueOf(j2));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, Boolean.valueOf(z4));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, Boolean.valueOf(z3));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MONITOR_BANNER_MSG_COME_TIME_TICKS_LONG_SYNC, Long.valueOf(Util.nowSecond()));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MAIN_BANNER_CLOSED_BOOLEAN_SYNC, bool);
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MONITOR_IS_TRIGGERED_BOOLEAN_SYNC, bool);
                C97625j3.m125812b().mo105906u().mo119681a(true);
                mo106163b();
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.ChattingMonitoredBannerStorage", "monitorbanner_n must NOT contain fingerprint.");
    }

    /* renamed from: b */
    public void mo106163b() {
        synchronized (C75896b.class) {
            Iterator<C75897a> it = this.f222574a.iterator();
            while (it.hasNext()) {
                it.next().mo102636a();
            }
        }
    }

    /* renamed from: c */
    public void mo106164c(C75898b bVar) {
        if (bVar == C75898b.Main) {
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L);
            mo106163b();
        } else if (bVar == C75898b.Chatting) {
            if (!((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L);
            } else {
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC, Boolean.TRUE);
            }
            mo106163b();
        }
    }

    /* renamed from: d */
    public boolean mo106165d(C75898b bVar) {
        long j;
        String str;
        boolean z;
        boolean z2;
        C75898b bVar2 = bVar;
        Log.m105919d("MicroMsg.ChattingMonitoredBannerStorage", "hy: is checking monitor banner scene: %s", bVar2);
        long nowSecond = Util.nowSecond();
        long longValue = ((Long) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MONITOR_BANNER_MSG_COME_TIME_TICKS_LONG_SYNC, -1L)).longValue();
        String str2 = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_FINGER_PRINT_STRING_SYNC, "");
        if (bVar2 == C75898b.Chatting) {
            j = ((Long) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L)).longValue();
            C85801v1 u = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC;
            Boolean bool = Boolean.FALSE;
            z2 = ((Boolean) u.mo119685f(aVar, bool)).booleanValue();
            z = ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, bool)).booleanValue();
            str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, "");
        } else {
            j = ((Long) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L)).longValue();
            C85801v1 u2 = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_MAIN_BANNER_CLOSED_BOOLEAN_SYNC;
            Boolean bool2 = Boolean.FALSE;
            z2 = ((Boolean) u2.mo119685f(aVar2, bool2)).booleanValue();
            z = ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, bool2)).booleanValue();
            str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, "");
        }
        if (!Util.isNullOrNil(str2)) {
            String str3 = Build.FINGERPRINT;
            if (!str2.equals(str3)) {
                C115669n.INSTANCE.idkeyStat(633, 5, 1, false);
                Log.m105919d("MicroMsg.ChattingMonitoredBannerStorage", "ocr banner: fingerprint [%s] NOT equals current device's [%s] , should NOT show banner", str2, str3);
                return false;
            }
            Log.m105919d("MicroMsg.ChattingMonitoredBannerStorage", "ocr banner: fingerprint [%s] equals current device's [%s] , should show banner", str2, str3);
        }
        if (Util.isNullOrNil(str)) {
            Log.m105918d("MicroMsg.ChattingMonitoredBannerStorage", "hy: not get wording");
            return false;
        } else if (z2) {
            Log.m105918d("MicroMsg.ChattingMonitoredBannerStorage", "hy: not check trigger and already closed");
            return false;
        } else if (longValue < 0) {
            Log.m105918d("MicroMsg.ChattingMonitoredBannerStorage", "hy: no msg occurs");
            return false;
        } else if (z && !((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_MONITOR_IS_TRIGGERED_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
            Log.m105918d("MicroMsg.ChattingMonitoredBannerStorage", "hy: should check triggered but not triggered");
            return false;
        } else if (j == -1) {
            Log.m105924i("MicroMsg.ChattingMonitoredBannerStorage", "hy: should always show");
            return true;
        } else if (longValue + j > nowSecond) {
            Log.m105924i("MicroMsg.ChattingMonitoredBannerStorage", "hy: still in show time. show banner");
            return true;
        } else {
            Log.m105924i("MicroMsg.ChattingMonitoredBannerStorage", "hy: expired.");
            return false;
        }
    }

    /* renamed from: e */
    public void mo106166e(Map<String, String> map) {
        if (map != null) {
            C115669n.INSTANCE.idkeyStat(633, 3, 1, false);
            Log.m105918d("MicroMsg.ChattingMonitoredBannerStorage", "origin values: " + map);
            mo106162a(".sysmsg.banner.monitorbanner_n.", map);
            mo106162a(".sysmsg.banner.monitorbanner_o.", map);
        }
    }
}
