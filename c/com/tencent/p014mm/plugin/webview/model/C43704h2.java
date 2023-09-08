package com.tencent.p014mm.plugin.webview.model;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import i93.C8866a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kg3.C76577a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.model.h2 */
public class C43704h2 {

    /* renamed from: s */
    public static int f118116s;

    /* renamed from: t */
    public static int f118117t;

    /* renamed from: a */
    public C43716m f118118a;

    /* renamed from: b */
    public C43714k f118119b;

    /* renamed from: c */
    public C43715l f118120c;

    /* renamed from: d */
    public C43699e2 f118121d;

    /* renamed from: e */
    public C43703h1 f118122e;

    /* renamed from: f */
    public C43710g f118123f;

    /* renamed from: g */
    public C43706b f118124g;

    /* renamed from: h */
    public C43711h f118125h;

    /* renamed from: i */
    public C43708d f118126i;

    /* renamed from: j */
    public C43709f f118127j;

    /* renamed from: k */
    public C43713j f118128k;

    /* renamed from: l */
    public C43712i f118129l;

    /* renamed from: m */
    public C43707c f118130m;

    /* renamed from: n */
    public C43705a f118131n;

    /* renamed from: o */
    public C43731w1 f118132o;

    /* renamed from: p */
    public C43727r1 f118133p;

    /* renamed from: q */
    public C6067y1 f118134q;

    /* renamed from: r */
    public int f118135r = ((int) (System.currentTimeMillis() / 1000));

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$e */
    public static class C6037e {
        /* renamed from: a */
        public static void m5916a(String str, int i) {
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            String doUrlEncode = WebViewUtilities.doUrlEncode(str);
            C115669n.INSTANCE.mo160131h(22999, Integer.valueOf(i), doUrlEncode);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$a */
    public class C43705a {

        /* renamed from: a */
        public Bundle f118136a;

        public C43705a(C43704h2 h2Var, Bundle bundle) {
            this.f118136a = bundle;
        }

        /* renamed from: a */
        public void mo68016a(String str, Object obj) {
            Bundle bundle = this.f118136a;
            if (bundle == null) {
                return;
            }
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else {
                Log.m105928w("MicroMsg.WebviewReporter", "put unknow type value.");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$b */
    public static class C43706b {

        /* renamed from: a */
        public boolean f118137a = false;

        /* renamed from: b */
        public boolean f118138b = false;

        /* renamed from: c */
        public String f118139c;
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$c */
    public static class C43707c {

        /* renamed from: a */
        public boolean f118140a = false;

        /* renamed from: b */
        public boolean f118141b = false;
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$d */
    public static class C43708d {

        /* renamed from: a */
        public ArrayList<String> f118142a = new ArrayList<>();

        /* renamed from: a */
        public void mo68017a() {
            C115669n.INSTANCE.mo160137l(11577, this.f118142a);
        }

        /* renamed from: b */
        public C43708d mo68018b(Object... objArr) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                this.f118142a.add(obj == null ? "" : obj.toString());
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$f */
    public class C43709f {

        /* renamed from: a */
        public ConcurrentHashMap<String, Long> f118143a = new ConcurrentHashMap<>();

        /* renamed from: b */
        public ConcurrentHashMap<String, Long> f118144b = new ConcurrentHashMap<>();

        /* renamed from: c */
        public String f118145c = "";

        /* renamed from: d */
        public boolean f118146d = true;

        /* renamed from: e */
        public int f118147e;

        /* renamed from: f */
        public String f118148f;

        public C43709f(C43704h2 h2Var) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$g */
    public class C43710g {

        /* renamed from: a */
        public long f118149a = Util.nowMilliSecond();

        /* renamed from: b */
        public String f118150b;

        /* renamed from: c */
        public boolean f118151c = false;

        /* renamed from: d */
        public int f118152d;

        /* renamed from: e */
        public String f118153e;

        public C43710g(C43704h2 h2Var) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$h */
    public static class C43711h {

        /* renamed from: a */
        public ArrayList<String> f118154a = new ArrayList<>();

        /* renamed from: a */
        public C43711h mo68019a(Object... objArr) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                this.f118154a.add(obj != null ? obj.toString().replace(',', XVFSFile.PATH_SEPARATOR_CHAR) : "");
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$i */
    public static class C43712i {

        /* renamed from: a */
        public List<String> f118155a;
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$j */
    public static class C43713j {

        /* renamed from: a */
        public List<String> f118156a;
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$k */
    public class C43714k {

        /* renamed from: a */
        public HashMap<String, Long> f118157a = new HashMap<>();

        public C43714k(C43704h2 h2Var) {
        }

        /* renamed from: a */
        public void mo68020a(String str, boolean z) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.WebviewReporter", "WebviewOpenUrl.stopLoadUrl failed, url is null");
            } else if (!this.f118157a.containsKey(str)) {
            } else {
                if (z) {
                    this.f118157a.put(str, Long.valueOf(Util.nowMilliSecond() - this.f118157a.get(str).longValue()));
                    return;
                }
                this.f118157a.put(str, -1L);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$l */
    public class C43715l {

        /* renamed from: a */
        public HashMap<String, Long> f118158a = new HashMap<>();

        /* renamed from: b */
        public int f118159b;

        /* renamed from: c */
        public String f118160c;

        public C43715l(C43704h2 h2Var) {
        }

        /* renamed from: a */
        public C43715l mo68021a(int i, String str) {
            this.f118159b = i;
            this.f118160c = str;
            return this;
        }

        /* renamed from: b */
        public void mo68022b(String str) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.WebviewReporter", "WebviewOpenUrl.startLoadUrl failed, url is null");
            } else if (!this.f118158a.containsKey(str)) {
                this.f118158a.put(str, Long.valueOf(Util.nowMilliSecond()));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.h2$m */
    public class C43716m {

        /* renamed from: a */
        public long f118161a;

        /* renamed from: b */
        public String f118162b;

        /* renamed from: c */
        public boolean f118163c = true;

        /* renamed from: d */
        public int f118164d;

        /* renamed from: e */
        public String f118165e;

        public C43716m(C43704h2 h2Var) {
        }

        /* renamed from: a */
        public void mo68023a() {
            Log.m105925i("MicroMsg.WebviewReporter", "WebviewPreGetDNSReporter, netType = %d, costTime = %d, url = %s, isSuccess = %s", Integer.valueOf(C43704h2.m47539g()), Long.valueOf(this.f118161a), this.f118162b, Boolean.valueOf(this.f118163c));
            String str = this.f118165e;
            Object[] objArr = new Object[11];
            objArr[0] = 1;
            objArr[1] = Long.valueOf(this.f118161a);
            objArr[2] = Integer.valueOf(NetStatusUtil.getNetType(MMApplicationContext.getContext()));
            String str2 = this.f118162b;
            if (str2 != null) {
                str2 = str2.replace(",", "!");
            }
            objArr[3] = str2;
            objArr[4] = 0;
            objArr[5] = 0;
            objArr[6] = 0;
            objArr[7] = Integer.valueOf(C43704h2.f118116s);
            objArr[8] = Integer.valueOf(C43704h2.f118117t);
            objArr[9] = Integer.valueOf(this.f118164d);
            objArr[10] = this.f118165e;
            C43704h2.m47537a(str, objArr);
            if (!this.f118163c) {
                C115669n.INSTANCE.idkeyStat(32, 12, 1, true);
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(32, 1, 1, true);
            nVar.idkeyStat(32, 5, this.f118161a, true);
        }
    }

    /* renamed from: a */
    public static void m47537a(String str, Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object valueOf : objArr) {
            arrayList.add(String.valueOf(valueOf));
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160137l(11215, arrayList);
        if (str != null && str.startsWith("official_mall")) {
            nVar.mo160137l(14919, arrayList);
        }
    }

    /* renamed from: d */
    public static String m47538d() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "no";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        Log.m105919d("MicroMsg.WebviewReporter", "activeNetInfo extra=%s, type=%d, %s", activeNetworkInfo.getExtraInfo(), Integer.valueOf(activeNetworkInfo.getType()), activeNetworkInfo.getExtraInfo());
        return activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo().toLowerCase() : "no";
    }

    /* renamed from: g */
    public static int m47539g() {
        if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
            return 5;
        }
        if (NetStatusUtil.is5G(MMApplicationContext.getContext())) {
            return 7;
        }
        switch (NetStatusUtil.getNetType(MMApplicationContext.getContext())) {
            case -1:
                return 255;
            case 0:
                return 1;
            case 1:
            case 6:
            case 8:
                return 3;
            case 2:
            case 5:
            case 7:
                return 2;
            case 3:
            case 4:
                return 4;
            default:
                return 6;
        }
    }

    /* renamed from: n */
    public static void m47540n(long j) {
        C115669n.INSTANCE.idkeyStat(1653, j, 1, false);
    }

    /* renamed from: b */
    public C43706b mo68006b() {
        if (this.f118124g == null) {
            this.f118124g = new C43706b();
        }
        return this.f118124g;
    }

    /* renamed from: c */
    public C43708d mo68007c() {
        if (this.f118126i == null) {
            this.f118126i = new C43708d();
        }
        return this.f118126i;
    }

    /* renamed from: e */
    public C43715l mo68008e() {
        if (this.f118120c == null) {
            this.f118120c = new C43715l(this);
        }
        return this.f118120c;
    }

    /* renamed from: f */
    public C43709f mo68009f() {
        if (this.f118127j == null) {
            this.f118127j = new C43709f(this);
        }
        return this.f118127j;
    }

    /* renamed from: h */
    public C43731w1 mo68010h() {
        if (this.f118132o == null) {
            this.f118132o = new C43731w1();
        }
        return this.f118132o;
    }

    /* renamed from: i */
    public C43703h1 mo68011i() {
        if (this.f118122e == null) {
            this.f118122e = new C43703h1();
        }
        return this.f118122e;
    }

    /* renamed from: j */
    public C43711h mo68012j() {
        if (this.f118125h == null) {
            this.f118125h = new C43711h();
        }
        return this.f118125h;
    }

    /* renamed from: k */
    public C43699e2 mo68013k() {
        if (this.f118121d == null) {
            this.f118121d = new C43699e2();
        }
        return this.f118121d;
    }

    /* renamed from: l */
    public void mo68014l(String str) {
        C43705a aVar = this.f118131n;
        if (aVar != null) {
            try {
                if (aVar.f118136a.containsKey(str)) {
                    aVar.mo68016a(str, Integer.valueOf(aVar.f118136a.getInt(str) + 1));
                } else {
                    aVar.mo68016a(str, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: m */
    public void mo68015m() {
        C43715l e = mo68008e();
        e.getClass();
        int g = m47539g();
        for (Map.Entry next : e.f118158a.entrySet()) {
            String str = (String) next.getKey();
            long longValue = ((Long) next.getValue()).longValue();
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(32, 0, 1, true);
            if (longValue >= 0 && longValue <= ApkDownloadManager.INTERVAL) {
                String str2 = e.f118160c;
                Object[] objArr = new Object[11];
                objArr[0] = 3;
                objArr[1] = Long.valueOf(longValue);
                objArr[2] = Integer.valueOf(g);
                objArr[3] = str == null ? str : str.replace(",", "!");
                objArr[4] = 0;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = Integer.valueOf(f118116s);
                objArr[8] = Integer.valueOf(f118117t);
                objArr[9] = Integer.valueOf(e.f118159b);
                objArr[10] = e.f118160c;
                m47537a(str2, objArr);
                nVar.idkeyStat(160, 0, 1, false);
                if (-1 != C8866a.m8685b(longValue)) {
                    nVar.idkeyStat(160, (long) C8866a.m8685b(longValue), 1, false);
                }
                C115669n nVar2 = nVar;
                nVar2.idkeyStat(32, 3, 1, true);
                nVar2.idkeyStat(32, 7, longValue, true);
                if (f118117t == 1) {
                    C115669n nVar3 = nVar;
                    nVar3.idkeyStat(32, 16, 1, true);
                    nVar3.idkeyStat(32, 17, longValue, true);
                }
                Log.m105925i("MicroMsg.WebviewReporter", "WebviewOpenUrlReporter.report url : %s, cost time : %d, netType : %d, %d, %d, getA8KeyScene:%d, prePublishid:%s", str, Long.valueOf(longValue), Integer.valueOf(g), Integer.valueOf(f118116s), Integer.valueOf(f118117t), Integer.valueOf(e.f118159b), e.f118160c);
            }
        }
        C43699e2 k = mo68013k();
        if (!Util.isNullOrNil(k.f118085d)) {
            Log.m105919d("MicroMsg.WebviewReporter", "WebViewVisitReporter report viewID = %s", k.f118085d);
        }
        try {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C6028c2.f22282d.getClass(), new C43698d2(k));
        } catch (RemoteException e2) {
            Log.m105929w("MicroMsg.WebviewReporter", "invokeAsResult error, %s", e2);
        }
        C43703h1 i = mo68011i();
        if (!Util.isNullOrNil(i.f118109a)) {
            String str3 = i.f118109a;
            C87412m.m108591d(str3);
            if (C112551y.m153819s(str3, "wrd", false)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("iswebviewreadtime=1");
                stringBuffer.append("&publishid=");
                stringBuffer.append(i.f118109a);
                stringBuffer.append("&staytime=");
                stringBuffer.append(i.f118111c);
                stringBuffer.append("&allstaytime=");
                stringBuffer.append(System.currentTimeMillis() - i.f118110b);
                stringBuffer.append("&maxscrolly=");
                stringBuffer.append(i.f118112d);
                stringBuffer.append("&totalscrolly=");
                stringBuffer.append(i.f118113e);
                stringBuffer.append("&scene=");
                stringBuffer.append(i.f118114f);
                stringBuffer.append("&entertime=");
                stringBuffer.append(i.f118110b);
                stringBuffer.append("&screenheight=");
                stringBuffer.append(C76577a.m92159j(MMApplicationContext.getContext()));
                Bundle bundle = new Bundle();
                bundle.putString("reportString", stringBuffer.toString());
                try {
                    C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C43701g1.f118106d.getClass(), (C1256g) null);
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.WebviewReporter", e3, "TopStory report", new Object[0]);
                }
            }
        }
        if (this.f118119b == null) {
            this.f118119b = new C43714k(this);
        }
        C43714k kVar = this.f118119b;
        kVar.getClass();
        int g2 = m47539g();
        for (Map.Entry next2 : kVar.f118157a.entrySet()) {
            String str4 = (String) next2.getKey();
            long longValue2 = ((Long) next2.getValue()).longValue();
            C115669n nVar4 = C115669n.INSTANCE;
            nVar4.idkeyStat(32, 2, 1, true);
            if (longValue2 == -1) {
                nVar4.idkeyStat(32, 13, 1, true);
                Log.m105925i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report fail url : %s, netType : %d", str4, Integer.valueOf(g2));
            }
            if (longValue2 >= 0 && longValue2 <= 60000) {
                Object[] objArr2 = new Object[11];
                objArr2[0] = 2;
                objArr2[1] = Long.valueOf(longValue2);
                objArr2[2] = Integer.valueOf(g2);
                objArr2[3] = str4 == null ? str4 : str4.replace(",", "!");
                objArr2[4] = 0;
                objArr2[5] = 0;
                objArr2[6] = 0;
                objArr2[7] = Integer.valueOf(f118116s);
                objArr2[8] = Integer.valueOf(f118117t);
                objArr2[9] = 0;
                objArr2[10] = null;
                m47537a((String) null, objArr2);
                Log.m105925i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report url : %s, cost time : %d, netType : %d, getA8KeyScene:%d, prePublishid:%s", str4, Long.valueOf(longValue2), Integer.valueOf(g2), 0, null);
                nVar4.idkeyStat(32, 6, longValue2, true);
            }
        }
        C43709f f = mo68009f();
        f.getClass();
        int g3 = m47539g();
        Iterator<Map.Entry<String, Long>> it = f.f118143a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                for (Map.Entry next3 : f.f118144b.entrySet()) {
                    String str5 = (String) next3.getKey();
                    long longValue3 = ((Long) next3.getValue()).longValue();
                    if (longValue3 < 0 || longValue3 > ApkDownloadManager.INTERVAL) {
                        break;
                    }
                    String str6 = f.f118148f;
                    Object[] objArr3 = new Object[11];
                    objArr3[0] = 6;
                    objArr3[1] = Long.valueOf(longValue3);
                    objArr3[2] = Integer.valueOf(g3);
                    if (str5 != null) {
                        str5 = str5.replace(",", "!");
                    }
                    objArr3[3] = str5;
                    objArr3[4] = 0;
                    objArr3[5] = 0;
                    objArr3[6] = 0;
                    objArr3[7] = Integer.valueOf(f118116s);
                    objArr3[8] = Integer.valueOf(f118117t);
                    objArr3[9] = Integer.valueOf(f.f118147e);
                    objArr3[10] = f.f118148f;
                    m47537a(str6, objArr3);
                    if (f118116s == 1) {
                        C115669n nVar5 = C115669n.INSTANCE;
                        nVar5.idkeyStat(32, 20, 1, true);
                        nVar5.idkeyStat(32, 21, longValue3, true);
                    }
                    C115669n nVar6 = C115669n.INSTANCE;
                    nVar6.idkeyStat(32, 10, 1, true);
                    nVar6.idkeyStat(32, 11, longValue3, true);
                    Log.m105925i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report Render cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", Long.valueOf(longValue3), Integer.valueOf(g3), Integer.valueOf(f118116s), Integer.valueOf(f118117t), Integer.valueOf(f.f118147e), f.f118148f);
                }
            } else {
                Map.Entry next4 = it.next();
                String str7 = (String) next4.getKey();
                long longValue4 = ((Long) next4.getValue()).longValue();
                if (longValue4 < 0 || longValue4 > ApkDownloadManager.INTERVAL) {
                    break;
                }
                String str8 = f.f118148f;
                Object[] objArr4 = new Object[11];
                objArr4[0] = 5;
                objArr4[1] = Long.valueOf(longValue4);
                objArr4[2] = Integer.valueOf(g3);
                if (str7 != null) {
                    str7 = str7.replace(",", "!");
                }
                objArr4[3] = str7;
                objArr4[4] = 0;
                objArr4[5] = 0;
                objArr4[6] = 0;
                objArr4[7] = Integer.valueOf(f118116s);
                objArr4[8] = Integer.valueOf(f118117t);
                objArr4[9] = Integer.valueOf(f.f118147e);
                objArr4[10] = f.f118148f;
                m47537a(str8, objArr4);
                if (f118116s == 1) {
                    C115669n nVar7 = C115669n.INSTANCE;
                    nVar7.idkeyStat(32, 18, 1, true);
                    nVar7.idkeyStat(32, 19, longValue4, true);
                }
                C115669n nVar8 = C115669n.INSTANCE;
                nVar8.idkeyStat(32, 8, 1, true);
                nVar8.idkeyStat(32, 9, longValue4, true);
                Log.m105925i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report DomReady cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", Long.valueOf(longValue4), Integer.valueOf(g3), Integer.valueOf(f118116s), Integer.valueOf(f118117t), Integer.valueOf(f.f118147e), f.f118148f);
            }
        }
        C43706b b = mo68006b();
        b.getClass();
        int g4 = m47539g();
        if (!b.f118138b) {
            C115669n.INSTANCE.mo160131h(11575, b.f118139c, 3, 1, Integer.valueOf(g4));
        } else if (b.f118137a) {
            C115669n.INSTANCE.mo160131h(11575, b.f118139c, 1, 1, Integer.valueOf(g4));
        } else {
            C115669n.INSTANCE.mo160131h(11575, b.f118139c, 2, 1, Integer.valueOf(g4));
        }
    }
}
