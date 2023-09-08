package nw3;

import android.os.Build;
import android.text.TextUtils;
import bs3.C104161b;
import bs3.C104162c;
import bs3.C104164e;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82783z0;
import com.tencent.wecall.talkroom.model.TalkRoom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import sl0.C22368l;

/* renamed from: nw3.g0 */
public class C109799g0 {

    /* renamed from: I */
    public static C109799g0 f328667I = new C109799g0();

    /* renamed from: J */
    public static final String f328668J = C109799g0.class.getCanonicalName();

    /* renamed from: A */
    public StringBuffer f328669A = new StringBuffer();

    /* renamed from: B */
    public int f328670B = -1;

    /* renamed from: C */
    public int f328671C = 0;

    /* renamed from: D */
    public int f328672D = 0;

    /* renamed from: E */
    public int f328673E = 0;

    /* renamed from: F */
    public long f328674F = 0;

    /* renamed from: G */
    public long f328675G = 0;

    /* renamed from: H */
    public long f328676H = 0;

    /* renamed from: a */
    public String f328677a = "";

    /* renamed from: b */
    public String f328678b = "";

    /* renamed from: c */
    public int f328679c = 1;

    /* renamed from: d */
    public int f328680d = 0;

    /* renamed from: e */
    public long f328681e = 0;

    /* renamed from: f */
    public int f328682f = -1;

    /* renamed from: g */
    public int f328683g = 0;

    /* renamed from: h */
    public int f328684h = 0;

    /* renamed from: i */
    public int f328685i = 0;

    /* renamed from: j */
    public int f328686j = 0;

    /* renamed from: k */
    public int f328687k = 0;

    /* renamed from: l */
    public int f328688l = 0;

    /* renamed from: m */
    public long f328689m = 0;

    /* renamed from: n */
    public long f328690n = 0;

    /* renamed from: o */
    public int f328691o = 0;

    /* renamed from: p */
    public long f328692p = 0;

    /* renamed from: q */
    public long f328693q = 0;

    /* renamed from: r */
    public int f328694r = 0;

    /* renamed from: s */
    public int f328695s = 0;

    /* renamed from: t */
    public int f328696t = -1;

    /* renamed from: u */
    public int f328697u;

    /* renamed from: v */
    public int f328698v = -1;

    /* renamed from: w */
    public String f328699w;

    /* renamed from: x */
    public String f328700x;

    /* renamed from: y */
    public int f328701y;

    /* renamed from: z */
    public String f328702z = "";

    /* renamed from: e */
    public static void m149204e(int i) {
        C104161b.m138993b(f328668J, "sendDeviceStat", Integer.valueOf(i));
        C104164e.m138998a(528, 3, String.valueOf(i));
    }

    /* renamed from: f */
    public static void m149205f(int i) {
        C104161b.m138993b(f328668J, "sendEngineStat", Integer.valueOf(i));
        C104164e.m138998a(C22368l.CTRL_INDEX, 3, String.valueOf(i));
    }

    /* renamed from: g */
    public static void m149206g(int i) {
        C104161b.m138993b(f328668J, "sendNetSceneStat", Integer.valueOf(i));
        C104164e.m138998a(C1883v2.CTRL_INDEX, 3, String.valueOf(i));
    }

    /* renamed from: h */
    public static void m149207h(String str) {
        C104161b.m138993b(f328668J, "sendSummaryNetScene", str);
        C104164e.m138998a(C82783z0.CTRL_INDEX, 3, str);
    }

    /* renamed from: i */
    public static void m149208i(int i) {
        C104161b.m138993b(f328668J, "sendtalkRoomDialStat", Integer.valueOf(i));
        C104164e.m138998a(530, 3, String.valueOf(i));
    }

    /* renamed from: k */
    public static void m149209k(String str, int i, long j, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            C104161b.m138997f(f328668J, "uploadTempReport groupId is null");
            return;
        }
        C104161b.m138997f(f328668J, "uploadTempReport: ", str, Integer.valueOf(i), Long.valueOf(j));
        C109799g0 g0Var = new C109799g0();
        if (str == null) {
            str = "";
        }
        g0Var.f328677a = str;
        g0Var.f328680d = i;
        g0Var.f328681e = j;
        g0Var.mo161124a(strArr);
        m149207h(g0Var.mo161126c());
    }

    /* renamed from: l */
    public static void m149210l(String str, String str2, int i, long j, String... strArr) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            C104161b.m138997f(f328668J, "uploadTempReport: ", str, " clientGroupId: ", str2, " roomid: ", Integer.valueOf(i), Long.valueOf(j));
            C109799g0 g0Var = new C109799g0();
            if (str == null) {
                str = "";
            }
            g0Var.f328677a = str;
            g0Var.f328680d = i;
            g0Var.f328681e = j;
            if (str2 == null) {
                str2 = "";
            }
            g0Var.f328678b = str2;
            g0Var.mo161124a(strArr);
            m149207h(g0Var.mo161126c());
            C104164e.m138999b();
            return;
        }
        C104161b.m138997f(f328668J, "uploadTempReport groupId and clientGroupId is null");
    }

    /* renamed from: a */
    public void mo161124a(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            if (this.f328669A.length() > 900) {
                this.f328669A.setLength(0);
                this.f328669A.append("overmaxsize");
            }
            if (this.f328669A.length() != 0) {
                this.f328669A.append("-");
            }
            for (String append : strArr) {
                this.f328669A.append(append);
                this.f328669A.append("|");
            }
        }
    }

    /* renamed from: b */
    public void mo161125b() {
        C104161b.m138997f(f328668J, "beginCreateOrNotify");
        this.f328675G = System.currentTimeMillis();
    }

    /* renamed from: c */
    public String mo161126c() {
        int i;
        C104161b.m138993b(f328668J, "collectInfo");
        this.f328699w = Build.MANUFACTURER;
        this.f328700x = Build.MODEL;
        this.f328701y = Build.VERSION.SDK_INT;
        this.f328702z = Build.VERSION.RELEASE;
        this.f328696t = C109803i0.m149217a(C104162c.f308396a);
        this.f328697u = -1;
        this.f328698v = -1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f328677a);
        arrayList.add(this.f328678b);
        arrayList.add(Integer.valueOf(this.f328679c));
        arrayList.add(Integer.valueOf(this.f328680d));
        arrayList.add(Long.valueOf(this.f328681e));
        arrayList.add(Integer.valueOf(this.f328682f));
        arrayList.add(Integer.valueOf(this.f328683g));
        arrayList.add(Integer.valueOf(this.f328684h));
        arrayList.add(Integer.valueOf(this.f328685i));
        arrayList.add(Integer.valueOf(this.f328686j));
        arrayList.add(Integer.valueOf(this.f328687k));
        arrayList.add(Integer.valueOf(this.f328688l));
        arrayList.add(Long.valueOf(this.f328689m));
        arrayList.add(Long.valueOf(this.f328690n));
        arrayList.add(Integer.valueOf(this.f328691o));
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0L);
        arrayList.add(Long.valueOf(this.f328692p));
        arrayList.add(Long.valueOf(this.f328693q));
        arrayList.add(Integer.valueOf(this.f328694r));
        arrayList.add(Integer.valueOf(this.f328695s));
        arrayList.add(Integer.valueOf(this.f328696t));
        arrayList.add(Integer.valueOf(this.f328697u));
        arrayList.add(Integer.valueOf(this.f328698v));
        arrayList.add(this.f328699w);
        arrayList.add(this.f328700x);
        arrayList.add(Integer.valueOf(this.f328701y));
        arrayList.add(this.f328702z);
        C109774c b = C109774c.m149103b();
        String str = this.f328677a;
        TalkRoom h = b.mo161020h(str);
        if (h == null) {
            i = 0;
        } else {
            i = ((ConcurrentHashMap) h.f320125n).size();
            C104161b.m138993b("TalkRoomManager", "getGroupMemberSize groupid: ", str, " size: ", Integer.valueOf(i));
        }
        arrayList.add(Integer.valueOf(i));
        arrayList.add(this.f328669A.toString());
        arrayList.add(Integer.valueOf(this.f328670B));
        arrayList.add(Integer.valueOf(this.f328671C));
        arrayList.add(Integer.valueOf(this.f328672D));
        arrayList.add(Integer.valueOf(this.f328673E));
        Iterator it = arrayList.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next().toString().replace(",", "_"));
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        String sb4 = sb.toString();
        String str2 = f328668J;
        C104161b.m138993b(str2, "logBuf: ", this.f328669A.toString());
        C104161b.m138993b(str2, "statresult", sb4);
        return sb4;
    }

    /* renamed from: d */
    public void mo161127d() {
        if (this.f328675G == 0) {
            this.f328690n = 0;
        } else {
            this.f328690n = System.currentTimeMillis() - this.f328675G;
        }
        C104161b.m138993b(f328668J, "endFirstSendPcm", Long.valueOf(this.f328690n), Long.valueOf(this.f328675G));
    }

    /* renamed from: j */
    public void mo161128j(int i) {
        C104161b.m138993b(f328668J, "stopStatus", Integer.valueOf(i));
        this.f328683g = i;
    }
}
