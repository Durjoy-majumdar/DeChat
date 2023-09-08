package bs3;

import as3.C103861c;
import as3.C103911y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import p978i9.C108421e;
import zr3.C112669a;
import zr3.C112671c;
import zr3.C112679g;
import zr3.C112683i;

/* renamed from: bs3.e */
public class C104164e {

    /* renamed from: a */
    public static HashMap<String, String> f308398a = new HashMap<>();

    /* renamed from: b */
    public static Object f308399b = new Object();

    /* renamed from: bs3.e$a */
    public static class C104165a implements C112669a {
        /* renamed from: a */
        public void mo145790a(String str, int i, int i2, byte[] bArr) {
            if ("CsCmd.Cmd_CSClientReportReq".equals(str)) {
                if (i2 == 0) {
                    synchronized (C104164e.f308399b) {
                        C104164e.f308398a.clear();
                    }
                }
                C104161b.m138997f("yunying", "reportStatisticsData isCommonData:  errCode: " + i2);
            }
        }
    }

    /* renamed from: a */
    public static void m138998a(int i, int i2, String str) {
        if (str == null) {
            C104161b.m138997f("gyz", "addEmergencyRecord value is null");
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            stringBuffer.append("---");
            stringBuffer.append(i2);
            synchronized (f308399b) {
                String str2 = f308398a.get(stringBuffer.toString());
                if (str2 != null && str2.length() > 0) {
                    StringBuffer stringBuffer2 = new StringBuffer(str2);
                    stringBuffer2.append("---");
                    stringBuffer2.append(str);
                    str = stringBuffer2.toString();
                }
                f308398a.put(stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            C104161b.m138997f("gyz", th);
        }
    }

    /* renamed from: b */
    public static void m138999b() {
        C103861c cVar;
        int i;
        String str;
        String[] split;
        if (!C112683i.m154066a()) {
            C104161b.m138997f("StatisticsUtil", "reportStatisticsData network is false");
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (f308399b) {
            Set<String> keySet = f308398a.keySet();
            if (keySet != null) {
                if (keySet.size() >= 1) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (String next : keySet) {
                        String[] split2 = next.split("---");
                        if (split2.length >= 2) {
                            String str2 = split2[0];
                            String str3 = split2[1];
                            synchronized (f308399b) {
                                str = f308398a.get(next);
                            }
                            if (!(str == null || str.length() == 0 || (split = str.split("---")) == null || split.length == 0)) {
                                for (String str4 : split) {
                                    if (!(str4 == null || str4.length() == 0)) {
                                        String[] split3 = str4.split("%");
                                        if (split3.length == 2) {
                                            str4 = split3[1];
                                        }
                                        C103911y yVar = new C103911y();
                                        yVar.f307220b = str2;
                                        stringBuffer.setLength(0);
                                        stringBuffer.append(str3);
                                        stringBuffer.append("%");
                                        stringBuffer.append(str4);
                                        yVar.f307221c = stringBuffer.toString();
                                        arrayList.add(yVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            cVar = new C103861c();
            C103911y[] yVarArr = new C103911y[arrayList.size()];
            arrayList.toArray(yVarArr);
            cVar.f306914b = yVarArr;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            C104161b.m138997f("StatisticsUtil", "reportStatisticsData CSClientReportReq is null");
            return;
        }
        C104161b.m138997f("yunying", "reportStatisticsData");
        C112679g e = C112679g.m154059e();
        C104165a aVar = new C104165a();
        e.getClass();
        try {
            i = e.mo164414b(aVar, (C112671c) null, 31, "CsCmd.Cmd_CSClientReportReq", C108421e.m146906d(cVar), 1, 0);
        } catch (Exception e2) {
            C104161b.m138997f("NETCMD", "doSendTask exception:", e2);
            i = -1;
        }
        C104161b.m138993b("StatisticsUtil", "reportStatisticsData start ret: ", Integer.valueOf(i));
    }
}
