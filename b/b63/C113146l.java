package b63;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.jniinterface.AesEcb;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C7088m0;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import p206nj.C117627q;
import p281yz.C79173v;
import te3.C118476wb3;
import te3.C77963l1;

/* renamed from: b63.l */
public class C113146l {

    /* renamed from: a */
    public static C113146l f338559a;

    /* renamed from: b */
    public static C77963l1 f338560b;

    /* renamed from: c */
    public static long f338561c;

    /* renamed from: b63.l$a */
    public static class C113147a {

        /* renamed from: a */
        public String f338562a;

        /* renamed from: b */
        public String f338563b;

        /* renamed from: c */
        public String f338564c;

        /* renamed from: d */
        public String f338565d;

        /* renamed from: e */
        public String f338566e;

        /* renamed from: f */
        public String f338567f;

        /* renamed from: g */
        public String f338568g;

        /* renamed from: h */
        public String f338569h;

        /* renamed from: i */
        public String f338570i;
    }

    public C113146l() {
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_LBS_REPORT_CONFIG_STRING_SYNC, "");
        Log.m105924i("MicroMsg.GpsReportHelper", "GpsReportHelper " + str);
        if (!Util.isNullOrNil(str)) {
            try {
                new JSONArray(str);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.GpsReportHelper", e, "", new Object[0]);
                Log.m105921e("MicroMsg.GpsReportHelper", "parse lbs config error", e);
            }
        }
    }

    /* renamed from: a */
    public static C77963l1 m154803a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(((String) next.getKey()) + "=" + ((String) next.getValue()));
        }
        String join = TextUtils.join("&", arrayList);
        byte[] bArr = new byte[16];
        byte[] bytes = C7088m0.m7307a().getBytes();
        if (bytes == null || bytes.length <= 0) {
            bytes = ("" + System.currentTimeMillis()).getBytes();
        }
        int i = 0;
        int i2 = 0;
        do {
            bArr[i2] = bytes[i];
            i2++;
            i++;
            if (i >= bytes.length) {
                i = 0;
                continue;
            }
        } while (i2 < 16);
        C77963l1 l1Var = new C77963l1();
        byte[] encode = Base64.encode(bArr, 0);
        if (C79673q.f233582b == null) {
            C79673q.f233582b = new C79673q();
        }
        l1Var.f227799o = C79673q.f233582b.mo109800a(encode);
        l1Var.f227798n = new String(Base64.encode(AesEcb.aesCryptEcb(join.getBytes(), bArr, true, true), 0));
        return l1Var;
    }

    /* renamed from: b */
    public static synchronized List<C113147a> m154804b(Context context) {
        LinkedList linkedList;
        int i;
        synchronized (C113146l.class) {
            linkedList = new LinkedList();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            try {
                List<CellInfo> list = (List) C117292a.m165363i(telephonyManager, "com/tencent/mm/plugin/wallet_core/model/GpsReportHelper", "getExtraCellInfoList", "(Landroid/content/Context;)Ljava/util/List;", "android/telephony/TelephonyManager", "getAllCellInfo", "()Ljava/util/List;");
                if (list != null) {
                    for (CellInfo cellInfo : list) {
                        C113147a aVar = new C113147a();
                        telephonyManager.getNetworkType();
                        if (cellInfo instanceof CellInfoGsm) {
                            CellSignalStrengthGsm cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                            CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                            i = cellIdentity.getMnc();
                            aVar.f338564c = "" + cellIdentity.getCid();
                            aVar.f338562a = "" + cellIdentity.getMcc();
                            aVar.f338563b = "" + cellIdentity.getMnc();
                            aVar.f338565d = "" + cellIdentity.getLac();
                            aVar.f338567f = "" + cellSignalStrength.getDbm();
                            cellInfo.isRegistered();
                            if (Build.VERSION.SDK_INT >= 24) {
                                aVar.f338570i = "" + cellIdentity.getArfcn();
                            }
                        } else if (cellInfo instanceof CellInfoCdma) {
                            CellSignalStrengthCdma cellSignalStrength2 = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                            CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                            i = cellIdentity2.getSystemId();
                            aVar.f338564c = "" + cellIdentity2.getBasestationId();
                            aVar.f338563b = "" + cellIdentity2.getSystemId();
                            aVar.f338565d = "" + cellIdentity2.getNetworkId();
                            aVar.f338567f = "" + cellSignalStrength2.getDbm();
                            cellInfo.isRegistered();
                        } else if (cellInfo instanceof CellInfoLte) {
                            CellSignalStrengthLte cellSignalStrength3 = ((CellInfoLte) cellInfo).getCellSignalStrength();
                            CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
                            i = cellIdentity3.getMnc();
                            aVar.f338564c = "" + cellIdentity3.getCi();
                            aVar.f338562a = "" + cellIdentity3.getMcc();
                            aVar.f338563b = "" + cellIdentity3.getMnc();
                            aVar.f338566e = "" + cellIdentity3.getTac();
                            aVar.f338567f = "" + cellSignalStrength3.getDbm();
                            cellInfo.isRegistered();
                            if (Build.VERSION.SDK_INT >= 24) {
                                aVar.f338568g = "" + cellIdentity3.getEarfcn();
                            }
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            CellSignalStrengthWcdma cellSignalStrength4 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                            CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                            i = cellIdentity4.getMnc();
                            aVar.f338564c = "" + cellIdentity4.getCid();
                            aVar.f338562a = "" + cellIdentity4.getMcc();
                            aVar.f338563b = "" + cellIdentity4.getMnc();
                            aVar.f338565d = "" + cellIdentity4.getLac();
                            aVar.f338567f = "" + cellSignalStrength4.getDbm();
                            cellInfo.isRegistered();
                            if (Build.VERSION.SDK_INT >= 24) {
                                aVar.f338569h = "" + cellIdentity4.getUarfcn();
                            }
                        } else {
                            Log.m105924i("MicroMsg.GpsReportHelper", "Unknown type of cell signal!\n ClassName: " + cellInfo.getClass().getSimpleName() + "\n ToString: " + cellInfo.toString());
                            i = 0;
                        }
                        if (i != Integer.MAX_VALUE) {
                            linkedList.add(aVar);
                        }
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GpsReportHelper", "loadCellInfo: Unable to obtain cell signal information: ", e);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public static C77963l1 m154805c() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis - f338561c > 300) {
            m154808f();
            f338561c = currentTimeMillis;
        }
        return f338560b;
    }

    /* renamed from: d */
    public static C118476wb3 m154806d() {
        if (f338560b == null) {
            return null;
        }
        C118476wb3 wb32 = new C118476wb3();
        C77963l1 l1Var = f338560b;
        wb32.f354508e = l1Var.f227792e;
        wb32.f354507d = l1Var.f227791d;
        wb32.f354509f = l1Var.f227793f;
        wb32.f354510g = l1Var.f227794g;
        wb32.f354511h = l1Var.f227795h;
        wb32.f354515o = l1Var.f227799o;
        wb32.f354512i = l1Var.f227796i;
        wb32.f354513j = l1Var.f227797j;
        wb32.f354514n = l1Var.f227798n;
        return wb32;
    }

    /* renamed from: e */
    public static void m154807e(int i) {
        Log.m105924i("MicroMsg.GpsReportHelper", "reflashLocationInfo " + i);
        f338561c = System.currentTimeMillis() / 1000;
        if (!m154810h()) {
            m154808f();
            f338561c = System.currentTimeMillis() / 1000;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0450 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x04aa  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m154808f() {
        /*
            java.lang.String r1 = ""
            long r2 = java.lang.System.currentTimeMillis()
            boolean r0 = m154810h()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            boolean r0 = m154811i()
            java.lang.String r4 = "MicroMsg.GpsReportHelper"
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L_0x0022
            boolean r0 = m154809g()
            if (r0 == 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            r9 = 1
            r10 = 0
            goto L_0x04cd
        L_0x0022:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0038 }
            r0.<init>()     // Catch:{ Exception -> 0x0038 }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r7 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ Exception -> 0x0038 }
            int r7 = r7.getWiFiRssi()     // Catch:{ Exception -> 0x0038 }
            r0.append(r7)     // Catch:{ Exception -> 0x0038 }
            r0.append(r1)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r1, r7)
            r0 = r1
        L_0x003f:
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r7 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
            java.lang.String r8 = r7.getFormattedWiFiSsid()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            long r10 = java.lang.System.currentTimeMillis()
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = r7.getFormattedWiFiBssid()
            gj.t$r r11 = p156gj.C87203t.f252879d
            java.lang.String r11 = r11.mo121645a()
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r12 = 5
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r8 = m154812j(r8)
            r13[r6] = r8
            java.lang.String r8 = m154812j(r10)
            r13[r5] = r8
            java.lang.String r8 = m154812j(r11)
            r10 = 2
            r13[r10] = r8
            r8 = 3
            r13[r8] = r0
            r0 = 4
            r13[r0] = r9
            java.lang.String r9 = "wifissid=%s&wifibssid=%s&wifimac=%s&sm=%s&ssid_timestamp=%s"
            java.lang.String r9 = java.lang.String.format(r9, r13)
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "&scan_ssid%d=%s&scan_bssid%d=%s&sm%d=%s"
            java.lang.StringBuffer r15 = new java.lang.StringBuffer
            r15.<init>()
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00f8 }
            if (r16 != 0) goto L_0x009d
            r0 = r1
            goto L_0x0114
        L_0x009d:
            java.util.List r7 = r7.getWiFiScanResults(r6)     // Catch:{ Exception -> 0x00f8 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00f8 }
            r16 = 0
        L_0x00a7:
            boolean r17 = r7.hasNext()     // Catch:{ Exception -> 0x00f8 }
            if (r17 == 0) goto L_0x00fe
            java.lang.Object r17 = r7.next()     // Catch:{ Exception -> 0x00f8 }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$WiFiScanResult r17 = (com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.WiFiScanResult) r17     // Catch:{ Exception -> 0x00f8 }
            r12 = 6
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00f8 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x00f8 }
            r12[r6] = r19     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r19 = r17.getSsid()     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r19 = m154812j(r19)     // Catch:{ Exception -> 0x00f8 }
            r12[r5] = r19     // Catch:{ Exception -> 0x00f8 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x00f8 }
            r12[r10] = r19     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r19 = r17.getBssid()     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r19 = m154812j(r19)     // Catch:{ Exception -> 0x00f8 }
            r12[r8] = r19     // Catch:{ Exception -> 0x00f8 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x00f8 }
            r12[r0] = r19     // Catch:{ Exception -> 0x00f8 }
            int r17 = r17.getLevel()     // Catch:{ Exception -> 0x00f8 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x00f8 }
            r0 = 5
            r12[r0] = r17     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r12 = java.lang.String.format(r11, r12)     // Catch:{ Exception -> 0x00f8 }
            r15.append(r12)     // Catch:{ Exception -> 0x00f8 }
            int r12 = r16 + 1
            if (r12 < r0) goto L_0x00f3
            goto L_0x00fe
        L_0x00f3:
            r16 = r12
            r0 = 4
            r12 = 5
            goto L_0x00a7
        L_0x00f8:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r1, r7)
        L_0x00fe:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r13
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0[r6] = r7
            java.lang.String r7 = "RecordCostTime: readScanWifi cost %d ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r7, r0)
            java.lang.String r0 = r15.toString()
        L_0x0114:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            boolean r0 = m154809g()
            r8 = 0
            if (r0 == 0) goto L_0x0400
            long r11 = java.lang.System.currentTimeMillis()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            boolean r0 = m154809g()
            if (r0 != 0) goto L_0x013e
            r8 = r1
            r19 = r7
            goto L_0x0403
        L_0x013e:
            java.lang.String r13 = "is_ci_permitted"
            java.lang.String r0 = "0"
            r9.put(r13, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getFormatedNetType(r0)
            java.lang.String r14 = "net_type"
            r9.put(r14, r0)
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r11
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            r0[r6] = r11
            java.lang.String r11 = "RecordCostTime: readCellInfo cost 01- %d ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r11, r0)
            long r11 = java.lang.System.currentTimeMillis()
            int r0 = android.os.Build.VERSION.SDK_INT
            r14 = 23
            if (r0 >= r14) goto L_0x0179
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r14 = "MNC"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0179
            goto L_0x0192
        L_0x0179:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0188 }
            java.lang.String r14 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = p385u2.C111105a.m151499a(r0, r14)     // Catch:{ Exception -> 0x0188 }
            if (r0 != 0) goto L_0x0186
            goto L_0x0192
        L_0x0186:
            r0 = 0
            goto L_0x0193
        L_0x0188:
            r0 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r14[r6] = r0
            java.lang.String r0 = "check permission exception:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r14)
        L_0x0192:
            r0 = 1
        L_0x0193:
            java.lang.String r14 = "RecordCostTime: readCellInfo cost 03- %d ms"
            if (r0 == 0) goto L_0x0397
            java.lang.String r0 = "1"
            r9.put(r13, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r13 = "uuid"
            r9.put(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            long r15 = java.lang.System.currentTimeMillis()
            r17 = 1000(0x3e8, double:4.94E-321)
            r19 = r7
            long r6 = r15 / r17
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "sample_time"
            r9.put(r6, r0)
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r6 = "phone_brand"
            r9.put(r6, r0)
            java.lang.String r0 = p156gj.C87203t.m108275k()
            java.lang.String r6 = "phone_model"
            r9.put(r6, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x020e }
            java.lang.String r6 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r0.checkCallingOrSelfPermission(r6)     // Catch:{ Exception -> 0x020e }
            if (r0 != 0) goto L_0x020e
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x020e }
            java.lang.String r6 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r6)     // Catch:{ Exception -> 0x020e }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x020e }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x020e }
            if (r0 == 0) goto L_0x020e
            java.lang.String r6 = "net_subtype"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
            r7.<init>()     // Catch:{ Exception -> 0x020e }
            r7.append(r1)     // Catch:{ Exception -> 0x020e }
            int r0 = r0.getSubtype()     // Catch:{ Exception -> 0x020e }
            r7.append(r0)     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x020e }
            r9.put(r6, r0)     // Catch:{ Exception -> 0x020e }
        L_0x020e:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r11
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 0
            r0[r7] = r6
            java.lang.String r6 = "RecordCostTime: readCellInfo cost 02- %d ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r6, r0)
            long r11 = java.lang.System.currentTimeMillis()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.util.List r0 = m154804b(r0)
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r11
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Long r11 = java.lang.Long.valueOf(r15)
            r6[r7] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r14, r6)
            long r11 = java.lang.System.currentTimeMillis()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r6 = r0.size()
            r7 = 0
        L_0x0248:
            if (r7 >= r6) goto L_0x0382
            java.lang.Object r15 = r0.get(r7)
            b63.l$a r15 = (b63.C113146l.C113147a) r15
            if (r15 == 0) goto L_0x037c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r5 = "mcc_"
            r13.append(r5)
            r13.append(r7)
            java.lang.String r5 = r13.toString()
            java.lang.String r13 = r15.f338562a
            r9.put(r5, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "mnc_"
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r13 = r15.f338563b
            r9.put(r5, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "lac_"
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r13 = r15.f338565d
            r9.put(r5, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "cell_id_"
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r13 = r15.f338564c
            r9.put(r5, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "type_"
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "sid_"
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "net_id_"
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "sys_id_"
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "dbm_"
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r15.f338567f
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "tac_"
            r5.append(r8)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r15.f338566e
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "arfcn_"
            r5.append(r8)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r15.f338570i
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "earfcn_"
            r5.append(r8)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r15.f338568g
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "uarfcn_"
            r5.append(r8)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r15.f338569h
            r9.put(r5, r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r15.f338567f
            r9.put(r5, r8)
        L_0x037c:
            int r7 = r7 + 1
            r5 = 1
            r8 = 0
            goto L_0x0248
        L_0x0382:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "count"
            r9.put(r5, r0)
            goto L_0x0399
        L_0x0397:
            r19 = r7
        L_0x0399:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.util.Set r5 = r9.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x03a6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x03d4
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x03a6
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r13 = 0
            r8[r13] = r6
            java.lang.String r6 = m154812j(r7)
            r7 = 1
            r8[r7] = r6
            java.lang.String r6 = "&%s=%s"
            java.lang.String r6 = java.lang.String.format(r6, r8)
            r0.append(r6)
            goto L_0x03a6
        L_0x03d4:
            java.lang.String r0 = r0.toString()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 != 0) goto L_0x03ec
            java.lang.String r5 = "&"
            int r5 = r0.indexOf(r5)
            if (r5 != 0) goto L_0x03ec
            r5 = 1
            java.lang.String r0 = r0.substring(r5)
            goto L_0x03ed
        L_0x03ec:
            r5 = 1
        L_0x03ed:
            r8 = r0
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r11
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            r6 = 0
            r0[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r14, r0)
            goto L_0x0403
        L_0x0400:
            r19 = r7
            r8 = 0
        L_0x0403:
            te3.l1 r0 = f338560b
            if (r0 != 0) goto L_0x040e
            te3.l1 r0 = new te3.l1
            r0.<init>()
            f338560b = r0
        L_0x040e:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r5 = 0
            r0[r5] = r19
            r5 = 1
            r0[r5] = r8
            java.lang.String r5 = "encrypt data userInfo:%s, cellInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r0)
            r0 = 16
            byte[] r5 = new byte[r0]
            java.lang.String r6 = com.tencent.p014mm.wallet_core.model.C7088m0.m7307a()
            byte[] r6 = r6.getBytes()
            if (r6 == 0) goto L_0x042c
            int r7 = r6.length
            if (r7 > 0) goto L_0x0443
        L_0x042c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            long r9 = java.lang.System.currentTimeMillis()
            r6.append(r9)
            java.lang.String r1 = r6.toString()
            byte[] r6 = r1.getBytes()
        L_0x0443:
            r1 = 0
            r7 = 0
        L_0x0445:
            byte r9 = r6[r1]
            r5[r7] = r9
            r9 = 1
            int r7 = r7 + r9
            int r1 = r1 + r9
            int r9 = r6.length
            if (r1 < r9) goto L_0x0450
            r1 = 0
        L_0x0450:
            if (r7 < r0) goto L_0x0445
            r9 = 0
            byte[] r0 = android.util.Base64.encode(r5, r9)
            te3.l1 r1 = f338560b
            b63.q r6 = b63.C79673q.f233582b
            if (r6 != 0) goto L_0x0464
            b63.q r6 = new b63.q
            r6.<init>()
            b63.C79673q.f233582b = r6
        L_0x0464:
            b63.q r6 = b63.C79673q.f233582b
            java.lang.String r0 = r6.mo109800a(r0)
            r1.f227799o = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            te3.l1 r1 = f338560b
            java.lang.String r1 = r1.f227799o
            r10 = 0
            r0[r10] = r1
            java.lang.String r1 = "encryptReportData mLocationInfo.encrypt_key %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 != 0) goto L_0x04a4
            byte[] r0 = r19.getBytes()
            byte[] r0 = com.tencent.p014mm.jniinterface.AesEcb.aesCryptEcb(r0, r5, r9, r9)
            byte[] r0 = android.util.Base64.encode(r0, r10)
            te3.l1 r1 = f338560b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            r1.f227798n = r6
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            r1[r10] = r6
            java.lang.String r0 = "encryptReportData mLocationInfo.encrypt_userinfo %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r1)
        L_0x04a4:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r0 != 0) goto L_0x04cd
            byte[] r0 = r8.getBytes()
            byte[] r0 = com.tencent.p014mm.jniinterface.AesEcb.aesCryptEcb(r0, r5, r9, r9)
            byte[] r0 = android.util.Base64.encode(r0, r10)
            te3.l1 r1 = f338560b
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            r1.f227800p = r5
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            r1[r10] = r5
            java.lang.String r0 = "encryptReportData mLocationInfo.encrypt_cellinfo %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r1)
        L_0x04cd:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2[r10] = r0
            java.lang.String r0 = "RecordCostTime: refreshWifiAndCellInfo cost %d ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b63.C113146l.m154808f():void");
    }

    /* renamed from: g */
    public static boolean m154809g() {
        C67199q0 p = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91334p();
        boolean z = (p.f192928a & 8388608) > 0;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_wxpay_cellinfo_report_switch, false);
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isReportCellInfo, ret = %s switchBit %s isSvrOpen:%s", Boolean.valueOf(z), Integer.valueOf(p.f192928a), Boolean.valueOf(wf));
        if (wf) {
            return z;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m154810h() {
        C67199q0 p = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91334p();
        boolean z = (p.f192928a & 8192) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(p.f192928a));
        return z;
    }

    /* renamed from: i */
    public static boolean m154811i() {
        C67199q0 p = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91334p();
        boolean z = (p.f192928a & 262144) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isReportWifiSSid, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(p.f192928a));
        return z;
    }

    /* renamed from: j */
    public static String m154812j(String str) {
        try {
            return C117627q.m165909b(str, "UTF-8");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.GpsReportHelper", e, "", new Object[0]);
            return str;
        }
    }
}
