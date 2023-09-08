package kj2;

import android.os.Process;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import p823sg.C101611g;
import p823sg.C101614i;

/* renamed from: kj2.a */
public abstract class C61103a {

    /* renamed from: b */
    public static final C101611g<Integer, Long> f173980b = new C101614i(50);

    /* renamed from: c */
    public static int f173981c = 1;

    /* renamed from: a */
    public ConcurrentHashMap f173982a = new ConcurrentHashMap();

    /* renamed from: f */
    public static List<String> m71623f(String str, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            int ceil = (int) Math.ceil(((double) str.length()) / ((double) i));
            int i2 = 0;
            while (i2 < ceil) {
                int i3 = i2 * i;
                i2++;
                arrayList.add(str.substring(i3, Math.min(i2 * i, str.length())));
            }
            return arrayList;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AbsReportStruct", e, "check to report list error [%s]", e.toString());
            return null;
        }
    }

    /* renamed from: h */
    public static int m71624h() {
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder();
        sb.append(myPid);
        sb.append("_");
        sb.append(Util.nowMilliSecond());
        sb.append("_");
        int i = f173981c;
        f173981c = i + 1;
        sb.append(i);
        return Math.abs(sb.toString().hashCode());
    }

    /* renamed from: a */
    public boolean mo86044a(String str) {
        if (Util.isNullOrNil(str)) {
            mo86053m("", "check rpt value is null.");
            return false;
        } else if (str.length() < 7168) {
            return true;
        } else {
            mo86053m("", "check rpt value more than 7k.");
            return false;
        }
    }

    /* renamed from: b */
    public String mo86045b(String str, String str2, boolean z) {
        if (Util.isNullOrNil(str2) || !str2.contains(",")) {
            return str2;
        }
        if (WeChatSomeFeatureSwitch.blockCNMobile() || !z || (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED)) {
            mo86053m(str, "value contain comma, please confirm your logic. value :" + str2);
        } else {
            Assert.fail("value contain comma, please confirm your logic.log id:" + mo1004j() + " field:" + str + " value:" + str2);
        }
        return str2.replace(',', ' ');
    }

    /* renamed from: c */
    public boolean mo86046c(String str, long j) {
        if (j <= 0) {
            mo86053m(str, j + "");
            return false;
        } else if (j < 3600000) {
            return true;
        } else {
            mo86053m(str, j + "");
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo86047d(String str, long j) {
        if (j <= 0) {
            mo86053m(str, j + "");
            return false;
        } else if (j < 3600) {
            return true;
        } else {
            mo86053m(str, j + "");
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo86048e(String str, long j) {
        if (j > 151473600000L) {
            return true;
        }
        mo86053m(str, j + "");
        return false;
    }

    /* renamed from: g */
    public final boolean mo86049g() {
        int j = mo1004j();
        String p = mo1005p();
        boolean z = false;
        if (j > 0 && !Util.isNullOrNil(p)) {
            String str = j + "," + p;
            int hashCode = str.hashCode();
            long j2 = 0;
            C101611g<Integer, Long> gVar = f173980b;
            Long l = gVar.get(Integer.valueOf(hashCode));
            if (l != null) {
                j2 = l.longValue();
            }
            if (Util.milliSecondsToNow(j2) < 300000) {
                Log.m105927v("MicroMsg.AbsReportStruct", "clock report [%s] less than 5 min, don't report", str);
            } else {
                int j3 = mo1004j();
                Log.m105919d("MicroMsg.AbsReportStruct", "reportWithAccountReady %d %s", Integer.valueOf(mo1004j()), mo1006q());
                String p2 = mo1005p();
                if (j3 > 0 && !Util.isNullOrNil(p2)) {
                    z = C117407d.INSTANCE.mo160129f(mo1004j(), p2);
                }
                if (z) {
                    gVar.put(Integer.valueOf(hashCode), Long.valueOf(Util.nowMilliSecond()));
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    public Object mo86050i(String str) {
        return this.f173982a.get(str.toLowerCase(Locale.getDefault()));
    }

    /* renamed from: j */
    public abstract int mo1004j();

    /* renamed from: k */
    public long mo86051k(String str) {
        return Util.getLong(str, 0);
    }

    /* renamed from: l */
    public void mo86052l(String str, Object obj) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (obj != null) {
            this.f173982a.put(lowerCase, obj);
        } else {
            this.f173982a.remove(lowerCase);
        }
    }

    /* renamed from: m */
    public final void mo86053m(String str, String str2) {
        Log.m105929w("MicroMsg.AbsReportStruct", "error report [%d] msg[%s %s]", Integer.valueOf(mo1004j()), str, str2);
    }

    /* renamed from: n */
    public final boolean mo86054n() {
        int j = mo1004j();
        Log.m105919d("MicroMsg.AbsReportStruct", "report %d %s", Integer.valueOf(mo1004j()), mo1006q());
        String p = mo1005p();
        if (j <= 0 || Util.isNullOrNil(p)) {
            return false;
        }
        C117407d.INSTANCE.kvStat(mo1004j(), p);
        return true;
    }

    /* renamed from: o */
    public final boolean mo86055o() {
        int j = mo1004j();
        Log.m105919d("MicroMsg.AbsReportStruct", "report %d %s", Integer.valueOf(mo1004j()), mo1006q());
        String p = mo1005p();
        if (j <= 0 || Util.isNullOrNil(p)) {
            return false;
        }
        C117407d.INSTANCE.mo160134j(mo1004j(), p, false, false, true);
        return true;
    }

    /* renamed from: p */
    public abstract String mo1005p();

    /* renamed from: q */
    public abstract String mo1006q();

    /* renamed from: r */
    public final void mo86056r() {
        Log.m105925i("MicroMsg.AbsReportStruct", "[report%s] %s", Integer.valueOf(mo1004j()), mo1006q().replace(APLogFileUtil.SEPARATOR_LINE, " "));
    }
}
