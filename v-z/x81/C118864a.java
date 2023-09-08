package x81;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j81.C87906e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import n81.C47206a;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p156gj.C87200o;
import qe3.C89625d;
import te3.C118444mn3;
import te3.C50568nn3;
import te3.C51789w60;
import u24.C90599h;
import u81.C118605b;
import w81.C90900a;

/* renamed from: x81.a */
public class C118864a implements C53297c {

    /* renamed from: a */
    public C53296b f355574a = new C53296b();

    /* renamed from: b */
    public long f355575b;

    /* renamed from: c */
    public long f355576c;

    public C118864a() {
        MultiProcessMMKV f = C87906e.m109412f();
        if (f != null) {
            this.f355575b = f.getLong("mmkv_key_realtime_report_period", 0);
            this.f355576c = f.getLong("mmkv_key_realtime_report_lasttime", 0);
        }
    }

    /* renamed from: d */
    public static void m167588d(int i, String str, l0$$e l0__e) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C118444mn3();
        bVar.f127067b = new C50568nn3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/rtkvreport";
        bVar.f127069d = 716;
        C47350c a = bVar.mo72403a();
        C118444mn3 mn32 = (C118444mn3) a.f127055a.f127080a;
        mn32.f354136d = C89625d.f257837c;
        mn32.f354137e = C89625d.f257836b;
        mn32.f354138f = C89625d.f257839e;
        mn32.f354139g = C87200o.f252873f;
        mn32.f354140h = LocaleUtil.getApplicationLanguage();
        mn32.f354141i = i;
        mn32.f354142j = str;
        C89144l0.m111429e(a, new a$$c(Util.nowMilliSecond(), mn32, l0__e), false);
    }

    /* renamed from: f */
    public static String m167589f(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                sb.append(list.get(i));
                sb.append(",");
            } else {
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo183569a() {
        String[] allKeys;
        this.f355574a.getClass();
        MultiProcessMMKV g = C87906e.m109413g();
        ArrayList<C51789w60> arrayList = null;
        boolean z = false;
        if (!(g == null || (allKeys = g.allKeys()) == null || allKeys.length <= 0)) {
            arrayList = new ArrayList<>();
            for (String decodeBytes : allKeys) {
                byte[] decodeBytes2 = g.decodeBytes(decodeBytes);
                if (decodeBytes2 != null && decodeBytes2.length > 0) {
                    C51789w60 w602 = new C51789w60();
                    try {
                        w602.parseFrom(decodeBytes2);
                        arrayList.add(w602);
                    } catch (Exception e) {
                        Log.m105920e("EdgeComputingRtReportCache", "[EdgeComputingRtReportCache] read parse realtimeReportItem throw Exception : " + e.getMessage());
                    }
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f355576c < this.f355575b * 1000) {
                Log.m105924i("EdgeComputingReporter", "report realtimeReport reportPeriod : " + this.f355575b + ", distance : " + (currentTimeMillis - this.f355576c));
                return;
            }
            if (arrayList.size() > 0 && MMApplicationContext.isMainProcess()) {
                z = C86709a0.m107524d().mo123461g(new C47206a(arrayList, this), 0);
            }
            if (!z) {
                if (arrayList.size() > 0) {
                    for (C51789w60 w603 : arrayList) {
                        LinkedList<String> linkedList = w603.f143877f;
                        if (linkedList != null && linkedList.size() > 0) {
                            Iterator<String> it = w603.f143877f.iterator();
                            while (it.hasNext()) {
                                C115669n.INSTANCE.kvStat(w603.f143876e, it.next());
                            }
                        }
                    }
                }
                Log.m105920e("EdgeComputingReporter", "report realtimeReport fail!");
            }
            MultiProcessMMKV f = C87906e.m109412f();
            if (f != null) {
                f.putLong("mmkv_key_realtime_report_lasttime", currentTimeMillis);
            }
            this.f355576c = currentTimeMillis;
            this.f355574a.getClass();
            MultiProcessMMKV g2 = C87906e.m109413g();
            if (g2 != null) {
                g2.clearAll();
                if (g2.totalSize() >= 3145728) {
                    g2.trim();
                }
            }
            C90900a.m114031d(1);
        }
    }

    /* renamed from: b */
    public void mo183570b(String str, int i, List<C118605b> list) {
        int i2;
        String str2;
        String str3;
        if (!C90599h.m113511d(str) && i > 0 && list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (C118605b next : list) {
                if (next != null) {
                    while (true) {
                        i2 = next.f354923a;
                        str2 = "";
                        if (i2 <= i3) {
                            break;
                        }
                        arrayList.add(str2);
                        i3++;
                    }
                    if (i2 >= i3) {
                        int i4 = next.f354924b;
                        if (i4 == 2) {
                            str2 = String.valueOf(next.f354927e);
                        } else if (i4 == 1) {
                            str2 = String.valueOf(next.f354926d);
                        } else if (i4 == 0 && (str3 = next.f354928f) != null) {
                            str2 = str3;
                        }
                        if (str2.contains(",")) {
                            str2 = str2.replace(",", "\\$");
                        }
                        arrayList.add(str2);
                        i3++;
                    }
                } else {
                    return;
                }
            }
            this.f355574a.mo73929a(str, i, m167589f(arrayList));
        }
    }

    /* renamed from: c */
    public void mo183571c(int i, List<C118605b> list) {
        int i2;
        String str;
        String str2;
        if (list != null && list.size() > 0 && i > 0) {
            Log.m105924i("EdgeComputingReporter", "[EdgeComputingReporter] kvReportFieldData logID : " + i);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (C118605b next : list) {
                if (next != null) {
                    while (true) {
                        i2 = next.f354923a;
                        str = "";
                        if (i2 <= i3) {
                            break;
                        }
                        arrayList.add(str);
                        i3++;
                    }
                    if (i2 >= i3) {
                        int i4 = next.f354924b;
                        if (i4 == 2) {
                            str = String.valueOf(next.f354927e);
                        } else if (i4 == 1) {
                            str = String.valueOf(next.f354926d);
                        } else if (i4 == 0 && (str2 = next.f354928f) != null) {
                            str = str2;
                        }
                        if (str.contains(",")) {
                            str = str.replace(",", "\\$");
                        }
                        arrayList.add(str);
                        i3++;
                    }
                } else {
                    return;
                }
            }
            C115669n.INSTANCE.mo160134j(i, m167589f(arrayList), false, false, true);
        }
    }

    /* renamed from: e */
    public void mo183572e(int i, List<C118605b> list) {
        int i2;
        String str;
        String str2;
        if (list != null && list.size() > 0 && i > 0) {
            Log.m105924i("EdgeComputingReporter", "[EdgeComputingReporter] rtKVReportFieldData logID : " + i);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (C118605b next : list) {
                if (next != null) {
                    while (true) {
                        i2 = next.f354923a;
                        str = "";
                        if (i2 <= i3) {
                            break;
                        }
                        arrayList.add(str);
                        i3++;
                    }
                    if (i2 >= i3) {
                        int i4 = next.f354924b;
                        if (i4 == 2) {
                            str = String.valueOf(next.f354927e);
                        } else if (i4 == 1) {
                            str = String.valueOf(next.f354926d);
                        } else if (i4 == 0 && (str2 = next.f354928f) != null) {
                            str = str2;
                        }
                        if (str.contains(",")) {
                            str = str.replace(",", "\\$");
                        }
                        arrayList.add(str);
                        i3++;
                    }
                } else {
                    return;
                }
            }
            m167588d(i, m167589f(arrayList), new a$$b(i, arrayList));
        }
    }
}
