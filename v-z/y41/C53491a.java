package y41;

import android.content.Context;
import android.os.Environment;
import com.tencent.p014mm.game.report.C40304b;
import com.tencent.p014mm.game.report.C40311f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ji3.C9457a;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87203t;
import u10.C52415a;
import u10.C52416b;

/* renamed from: y41.a */
public class C53491a {

    /* renamed from: a */
    public static final HashMap<Long, Integer> f150410a = new HashMap<>();

    /* renamed from: b */
    public static final List<Long> f150411b = new ArrayList();

    /* renamed from: y41.a$a */
    public class C53492a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f150412d;

        /* renamed from: e */
        public final /* synthetic */ long f150413e;

        /* renamed from: f */
        public final /* synthetic */ long f150414f;

        public C53492a(String str, long j, long j2) {
            this.f150412d = str;
            this.f150413e = j;
            this.f150414f = j2;
        }

        public void run() {
            C44561j j = C44565l.m48990j(this.f150412d, false);
            if (j != null && j.mo69359k()) {
                C115669n.INSTANCE.idkeyStat(860, this.f150413e, this.f150414f, false);
            }
        }
    }

    /* renamed from: a */
    public static int m60011a(Context context) {
        if (NetStatusUtil.is3G(context)) {
            return 4;
        }
        if (NetStatusUtil.is4G(context)) {
            return 5;
        }
        int netType = NetStatusUtil.getNetType(context);
        if (netType == -1) {
            return 255;
        }
        if (netType == 0) {
            return 1;
        }
        if (netType != 5) {
            return netType != 6 ? 6 : 3;
        }
        return 2;
    }

    /* renamed from: b */
    public static void m60012b(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        long currentTimeMillis = System.currentTimeMillis();
        C52416b a = C52416b.m58673a(10737, Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis), 1, str, Integer.valueOf(i), Integer.valueOf(i2), 0, 0, str2, "", str3, Integer.valueOf(m60011a(MMApplicationContext.getContext())), 0, 1, str4, str5);
        ((C40304b) C52415a.m58668a()).getClass();
        C40311f.m43479a(a);
    }

    /* renamed from: c */
    public static void m60013c(int i, C53493b bVar) {
        long j;
        long j2;
        C53493b bVar2 = bVar;
        HashMap<Long, Integer> hashMap = f150410a;
        int intValue = hashMap.containsKey(Long.valueOf(bVar2.f150426l)) ? hashMap.remove(Long.valueOf(bVar2.f150426l)).intValue() : i;
        List<Long> list = f150411b;
        if (((ArrayList) list).contains(Long.valueOf(bVar2.f150426l))) {
            ((ArrayList) list).remove(Long.valueOf(bVar2.f150426l));
            bVar2.f150416b = 34;
            bVar2.f150430p = 3402;
        }
        if (bVar2.f150416b != 33 && !Util.isNullOrNil(bVar2.f150415a)) {
            Log.m105925i("MicroMsg.FileDownloadReportUtil", "report_14567, appId = %s, scene = %d, opId = %d, startSize = %d, downloadedSize = %d, totalSize = %d, downloadUrl = %s, errCode = %d, downloaderType = %d, chanelId = %s, costTime = %d, startState = %d, downloadId = %d, extInfo = %s, reservedInWifi = %d, startScene = %d, uiarea = %d, noticeId = %d, ssid = %d, downloadType = %d", bVar2.f150415a, Integer.valueOf(bVar2.f150416b), Integer.valueOf(intValue), Long.valueOf(bVar2.f150417c), Long.valueOf(bVar2.f150418d), Long.valueOf(bVar2.f150419e), bVar2.f150420f, Integer.valueOf(bVar2.f150421g), Integer.valueOf(bVar2.f150422h), bVar2.f150423i, Long.valueOf(bVar2.f150424j), Integer.valueOf(bVar2.f150425k), Long.valueOf(bVar2.f150426l), bVar2.f150427m, Integer.valueOf(bVar2.f150428n), Integer.valueOf(bVar2.f150429o), Integer.valueOf(bVar2.f150430p), Integer.valueOf(bVar2.f150431q), Integer.valueOf(bVar2.f150432r), Integer.valueOf(bVar2.f150433s));
            Object[] objArr = new Object[26];
            objArr[0] = bVar2.f150415a;
            objArr[1] = Integer.valueOf(bVar2.f150416b);
            objArr[2] = Integer.valueOf(intValue);
            objArr[3] = Long.valueOf(bVar2.f150418d);
            objArr[4] = Long.valueOf(bVar2.f150419e);
            objArr[5] = m60016f(bVar2.f150420f);
            objArr[6] = Integer.valueOf(m60011a(MMApplicationContext.getContext()));
            objArr[7] = Integer.valueOf(bVar2.f150421g);
            objArr[8] = Integer.valueOf(bVar2.f150422h);
            objArr[9] = bVar2.f150423i;
            objArr[10] = Long.valueOf(bVar2.f150424j);
            objArr[11] = Integer.valueOf(bVar2.f150425k);
            objArr[12] = Long.valueOf(bVar2.f150426l);
            objArr[13] = bVar2.f150427m;
            String f = C87203t.m108270f(true);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("IMEI", f);
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.FileDownloadReportUtil", "getDeviceInfo: " + e.getMessage());
            }
            objArr[14] = m60016f(jSONObject.toString());
            objArr[15] = Long.valueOf(bVar2.f150417c);
            objArr[16] = Integer.valueOf(bVar2.f150428n);
            objArr[17] = "";
            objArr[18] = Integer.valueOf(bVar2.f150429o);
            objArr[19] = Integer.valueOf(bVar2.f150430p);
            objArr[20] = Integer.valueOf(bVar2.f150431q);
            objArr[21] = Integer.valueOf(bVar2.f150432r);
            objArr[22] = Integer.valueOf(bVar2.f150433s);
            MMApplicationContext.getContext();
            objArr[23] = Long.valueOf((Runtime.getRuntime().freeMemory() / 1024) / 1024);
            try {
                j = Environment.getExternalStorageDirectory().getFreeSpace() / 1048576;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.FileDownloadReportUtil", e2, "", new Object[0]);
                j = 0;
            }
            objArr[24] = Long.valueOf(j);
            try {
                j2 = Environment.getDataDirectory().getFreeSpace() / 1048576;
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.FileDownloadReportUtil", e3, "", new Object[0]);
                j2 = 0;
            }
            objArr[25] = Long.valueOf(j2);
            C52416b a = C52416b.m58673a(14567, objArr);
            ((C40304b) C52415a.m58668a()).getClass();
            C40311f.m43479a(a);
            C115669n.INSTANCE.mo160131h(15015, bVar2.f150415a, Integer.valueOf(bVar2.f150416b), Integer.valueOf(intValue), Long.valueOf(bVar2.f150418d), Long.valueOf(bVar2.f150419e), m60016f(bVar2.f150420f), Integer.valueOf(m60011a(MMApplicationContext.getContext())), Integer.valueOf(bVar2.f150421g), Integer.valueOf(bVar2.f150422h), bVar2.f150423i, Long.valueOf(bVar2.f150424j), Integer.valueOf(bVar2.f150425k), Long.valueOf(bVar2.f150426l), bVar2.f150427m);
        }
    }

    /* renamed from: d */
    public static void m60014d(String str, long j, long j2) {
        if (!Util.isNullOrNil(str)) {
            if ("appid_is_empty".equals(str)) {
                C115669n.INSTANCE.idkeyStat(860, j, j2, false);
            } else {
                C9457a.m9137a(new C53492a(str, j, j2));
            }
        }
    }

    /* renamed from: e */
    public static void m60015e(long j, int i) {
        f150410a.put(Long.valueOf(j), Integer.valueOf(i));
    }

    /* renamed from: f */
    public static String m60016f(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FileDownloadReportUtil", e.getMessage());
            return "";
        }
    }
}
