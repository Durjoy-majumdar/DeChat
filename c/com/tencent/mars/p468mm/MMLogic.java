package com.tencent.mars.p468mm;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.hilive.mediasdk.SdkInfo;
import com.huawei.easygo.sdk.constant.EasyGoCode;
import com.tencent.ilink.auth.FaceProto;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.mars.p468mm.MMLiveSpeedTestInterfaces;
import com.tencent.nativecrash.NativeCrash;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.network.C114765a0;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.network.C40377j;
import com.tencent.p014mm.network.C40384w;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82540i0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83136z2;
import com.tencent.p014mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1640c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1641d;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82391c;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82398i;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82965h;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82993v;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83017j;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83018k;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.appbrand.weishi.C84909g;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import com.tencent.wechat.aff.ting.TingClientProto;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.util.WXWebReporter;
import ee0.C31566b;
import fm0.C86943h0;
import fm0.C86980s1;
import fm0.C86991y0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import oa1.C117731d;
import ol0.C117815j0;
import p141db.C7258b;
import p141db.C86219d;
import pe3.C89349b;
import ql0.C89699b;
import rm0.C90026e;
import rm0.C90034g;
import te3.C49775hz3;
import te3.ha4;
import te3.ka4;
import tl0.C90509a;
import tm0.C14016b0;
import un0.C14253d;

/* renamed from: com.tencent.mars.mm.MMLogic */
public class MMLogic {
    public static int ACTION_ACK_ASYNC = -100;
    public static int ACTION_ACK_FAILED = 3;
    public static int ACTION_ACK_MALFORMED = 1;
    public static int ACTION_ACK_OK = 0;
    public static int ACTION_ACK_UNSUPPORTED = 2;
    public static final int MM_STAT_CGI_INFO = 1;
    public static final int MM_STAT_CGI_NETWORK_COST = 7;
    public static final int MM_STAT_DNS = 8;
    public static final int MM_STAT_LONGLINK_BUILD = 3;
    public static final int MM_STAT_LONGLINK_CONNECT = 4;
    public static final int MM_STAT_LONGLINK_DISCONNECT = 5;
    public static final int MM_STAT_LONGLINK_FUNC_CONNECT = 6;
    public static final int MM_STAT_NETWORK_UNREACHABLE = 2;
    public static final int MM_Stat_Local_GetHostByName = 11;
    public static final int MM_Stat_Network_Changed = 10;
    public static final int MM_Stat_Noop_Send = 9;
    /* access modifiers changed from: private */
    public static String TAG = "MMLogic";
    public static LruCache<String, String> UUID_CACHE = new LruCache<>(100);

    /* renamed from: l */
    private static final Lock f342919l = new ReentrantLock();
    private static long lastReportTime = 0;
    private static final Set<C40377j> netCallbacks = new HashSet();
    public static final List<Integer> payCgis = Arrays.asList(new Integer[]{385, 386, 387, Integer.valueOf(C86943h0.CTRL_INDEX), Integer.valueOf(C86991y0.CTRL_INDEX), 390, 391, 392, 393, 394, Integer.valueOf(C86219d.CTRL_INDEX), 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 410, Integer.valueOf(v2helper.EMethodSetPlayerPreCorrectCofOff), 461, 462, 463, Integer.valueOf(C82993v.CTRL_INDEX), Integer.valueOf(JsApiShowUpdatableMessageSubscribeButton.CTRL_INDEX), Integer.valueOf(C83136z2.CTRL_INDEX), Integer.valueOf(C89699b.CTRL_INDEX), Integer.valueOf(C89699b.C89702c.CTRL_INDEX), Integer.valueOf(C14253d.CTRL_INDEX), 470, 471, Integer.valueOf(C90026e.CTRL_INDEX), Integer.valueOf(C90034g.CTRL_INDEX), Integer.valueOf(JsApiAddDownloadTask.CTRL_INDEX), Integer.valueOf(JsApiCancelDownloadTask.CTRL_INDEX), Integer.valueOf(JsApiOpenAdCanvas.CTRL_INDEX), Integer.valueOf(C1640c.CTRL_INDEX), Integer.valueOf(C1641d.CTRL_INDEX), 479, Integer.valueOf(C1643f.CTRL_INDEX), Integer.valueOf(C83031z.CTRL_INDEX), Integer.valueOf(C83017j.CTRL_INDEX), Integer.valueOf(C83018k.CTRL_INDEX), 508, 509, 514, Integer.valueOf(EasyGoCode.InvokedErrCode.SECURITY_EXCEPTION), 525, Integer.valueOf(C117815j0.CTRL_INDEX), Integer.valueOf(C14016b0.CTRL_INDEX), 565, 566, 567, 568, 569, 570, 571, 573, 580, 583, Integer.valueOf(C86980s1.CTRL_INDEX), Integer.valueOf(C7258b.CTRL_INDEX), 586, 587, 588, Integer.valueOf(C82965h.CTRL_INDEX), Integer.valueOf(C82540i0.CTRL_INDEX), 591, Integer.valueOf(C82398i.CTRL_INDEX), Integer.valueOf(C82391c.CTRL_INDEX), 600, 606, Integer.valueOf(SdkInfo.ErrCode.kErrCodeFormatUnSupport), Integer.valueOf(C84909g.CTRL_INDEX), Integer.valueOf(TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION), 844, 859, 1002, Integer.valueOf(TXLiveConstants.PUSH_EVT_ROOM_OUT), 1109, 1120, 1211, 1230, 1241, 1256, 1257, 1259, 1273, 1274, 1275, 1276, 1280, 1281, 1283, Integer.valueOf(TingClientProto.TingScene.TingScene_ChatHistory_VALUE), 1304, 1305, 1317, 1318, 1321, 1323, 1324, 1335, 1336, 1338, 1340, 1344, 1348, 1349, 1370, 1371, 1376, 1378, 1380, 1384, 1385, 1386, 1395, 1398, 1399, 1477, 1488, 1495, 1501, 1502, 1503, 1504, 1505, 1506, 1507, 1508, 1509, 1510, Integer.valueOf(WXWebReporter.ID1511KeyDef.f57029ID), 1512, 1513, 1514, 1515, 1516, 1517, 1520, 1525, 1527, 1529, 1530, 1531, 1535, 1536, 1537, 1540, 1542, 1543, Integer.valueOf(WXWebReporter.WXWEB_IDKEY_FR_OFFICE_ID), 1545, 1551, 1552, 1554, 1555, 1556, 1558, 1559, 1560, 1561, 1562, 1563, 1564, 1565, 1566, 1568, 1569, 1570, 1571, 1572, 1573, 1574, 1575, 1577, 1579, 1580, 1581, 1582, 1584, 1585, 1586, 1588, 1589, 1590, 1591, 1592, 1593, 1594, 1595, 1596, 1597, 1598, 1599, 1600, Integer.valueOf(TingClientProto.TingScene.TingScene_FinderLiteAppSinger_VALUE), Integer.valueOf(TingClientProto.TingScene.TingScene_FinderProfileSinger_VALUE), Integer.valueOf(TingClientProto.TingScene.TingScene_FinderProfileCategory_VALUE), 1604, 1605, 1606, 1607, 1608, 1610, 1612, 1613, 1614, 1616, 1617, 1618, 1622, 1623, 1624, 1625, 1628, 1629, 1630, 1631, 1633, 1638, 1639, 1640, 1641, 1643, 1644, 1645, 1647, 1648, 1649, 1650, 1652, 1653, 1654, 1655, 1656, 1659, 1663, 1664, 1665, 1666, 1667, 1668, 1669, 1672, 1674, 1675, 1676, 1679, 1680, 1682, 1684, 1685, 1686, 1688, 1689, 1691, 1692, 1694, 1695, 1697, 1698, 1699, 1724, 1725, 1735, 1736, 1737, 1742, 1752, 1753, 1754, 1767, 1768, 1769, 1770, 1773, 1779, 1782, 1786, 1800, 1805, 1809, 1811, 1813, 1820, 1827, 1830, 1836, 1837, 1855, 1859, Integer.valueOf(NativeCrash.DEFAULT_SHORT_FLAGS), 1878, 1888, Integer.valueOf(WXWebReporter.WXWEB_IDKEY_FR_OFFICE_WORD_ID), 1903, 1904, 1906, 1907, 1914, 1916, 1917, 1922, 1923, 1930, 1950, 1953, 1958, 1960, 1963, 1964, 1965, 1966, 1967, 1970, 1971, 1972, 1973, 1976, 1978, 1979, 1981, Integer.valueOf(Exif.PARSE_EXIF_ERROR_NO_EXIF), Integer.valueOf(Exif.PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN), Integer.valueOf(Exif.PARSE_EXIF_ERROR_CORRUPT), 1986, 1987, 1988, 1990, 1992, 1993, 1997, Integer.valueOf(FaceProto.FaceExtVerifyType.kFaceExtVerifyType_WxPay_End_VALUE), 2501, 2504, 2505, 2506, 2507, 2508, 2512, 2514, 2515, 2516, 2519, 2520, 2527, 2529, 2532, 2533, 2541, 2542, 2544, 2545, 2547, 2549, 2551, 2553, 2554, 2556, 2557, 2561, 2562, 2565, 2567, 2568, 2570, 2573, 2576, 2581, 2584, 2585, 2589, 2590, 2595, 2598, 2607, 2609, 2612, 2613, 2614, 2615, 2616, 2618, 2620, 2621, 2622, 2626, 2628, 2629, 2630, 2632, 2633, 2635, 2642, 2652, 2654, 2655, 2658, 2659, 2661, 2662, 2663, 2665, 2666, 2668, 2671, 2672, 2673, 2675, 2677, 2680, 2682, 2685, 2686, 2687, 2689, 2693, 2694, 2696, 2697, 2699, 2702, 2704, 2705, 2708, 2713, 2714, 2715, 2719, 2720, 2722, 2724, 2725, 2726, 2728, 2730, 2732, 2736, 2737, 2739, 2740, 2741, 2742, 2745, 2750, 2752, 2753, 2755, 2756, 2760, 2764, 2765, 2767, 2773, 2774, 2780, 2783, 2784, 2786, 2791, 2796, 2797, 2798, 2800, 2801, 2803, 2806, 2807, 2811, 2814, 2815, 2817, 2820, 2821, 2823, 2824, 2825, 2826, 2828, 2840, 2841, 2844, 2845, 2847, 2848, 2849, 2850, 2851, 2852, 2853, 2856, 2858, 2860, 2861, 2862, 2863, 2867, 2868, 2870, 2871, 2872, 2876, 2878, 2880, 2882, 2886, 2887, 2888, 2892, 2894, 2896, 2901, 2907, 2910, 2911, 2916, 2923, 2924, 2925, 2926, 2927, 2928, 2929, 2930, 2931, 2935, 2938, 2939, 2941, 2952, 2956, 2958, 2960, 2961, 2969, 2970, 2971, 2976, 2980, 2983, 2984, 2987, 2990, 2992, 2993, 2996, 2997, 3505, 3521, 3555, 3570, 3572, 3573, 3584, 3591, 3634, 3651, 3665, 3671, 3708, 3730, 3766, 3768, 3774, 3780, 3781, 3795, 3801, 3857, 3858, 3885, 3920, 3962, 3989});
    private static int totalMobileRecv = 0;
    private static int totalMobileSend = 0;
    private static int totalWifiRecv = 0;
    private static int totalWifiSend = 0;

    /* renamed from: com.tencent.mars.mm.MMLogic$GetDnsReturn */
    public static class GetDnsReturn {
        public String[] aryIps;
        public int length;
        public int type;

        private GetDnsReturn() {
            this.type = 0;
            this.aryIps = new String[50];
        }
    }

    /* renamed from: com.tencent.mars.mm.MMLogic$NetworkIdInfo */
    public static class NetworkIdInfo {
        public byte[] clientIp;
        public byte[] ctx;
        public byte[] networkId;
    }

    /* renamed from: com.tencent.mars.mm.MMLogic$ReportInfo */
    public static class ReportInfo {
        public long actionId = 0;
        public long beginTime = 0;
        public String clientIp = "";
        public long connCostTime = 0;
        public long connTotalCostTime = 0;
        public long dnsCostTime = 0;
        public int dnsErrType = 0;
        public String dnsSvrIp = "";
        public int endFlag = 0;
        public int endStep = 0;
        public long endTime = 0;
        public int errCode = 0;
        public int errType = 0;
        public long expand1 = 0;
        public long expand2 = 0;
        public String extraInfo = "";
        public long firstPkgTime = 0;
        public String host = "";

        /* renamed from: ip */
        public String f342920ip = "";
        public int ipType = 0;
        public boolean isSocket = false;
        public int localIp = 0;
        public long netSignal = 0;
        public int netType = 0;
        public int newNetType = 0;
        public long newdnsCostTime = 0;
        public int newdnsErrCode = 0;
        public int newdnsErrType = 0;
        public int port = 0;
        public long recvSize = 0;
        public int refTime1 = 0;
        public int refTime2 = 0;
        public int refTime3 = 0;
        public int retryCount = 0;
        public long rtType = 0;
        public long sendSize = 0;
        public int subNetType = 0;
        public int usedIpIndex = 0;

        public String toString() {
            return String.format("actionId:%d, rtType:%d, begin:%d, end:%d, cost:%d, ip:%s, port:%d, isSocket:%b, netType:%d, ipType:%d, sendSize:%d, recvSize:%d, errType:%d, errCode:%d, netSignal:%d, retryCount:%d, expand1:%d, clientip:%s, expand2:%d, newNetType:%d, subNetType:%d, extraInfo:%s, host:%s, endStep:%d, endFlag:%d", new Object[]{Long.valueOf(this.actionId), Long.valueOf(this.rtType), Long.valueOf(this.beginTime), Long.valueOf(this.endTime), Long.valueOf(this.endTime - this.beginTime), this.f342920ip, Integer.valueOf(this.port), Boolean.valueOf(this.isSocket), Integer.valueOf(this.netType), Integer.valueOf(this.ipType), Long.valueOf(this.sendSize), Long.valueOf(this.recvSize), Integer.valueOf(this.errType), Integer.valueOf(this.errCode), Long.valueOf(this.netSignal), Integer.valueOf(this.retryCount), Long.valueOf(this.expand1), this.clientIp, Long.valueOf(this.expand2), Integer.valueOf(this.newNetType), Integer.valueOf(this.subNetType), this.extraInfo, this.host, Integer.valueOf(this.endStep), Integer.valueOf(this.endFlag)});
        }
    }

    private static int OnActionNotify(String str, long j, final byte[] bArr, byte[] bArr2, final byte[] bArr3, final long j2) {
        Log.m105925i(TAG, "[OnActionNotify] code: %d, uuid: %s, taskid:%d", Long.valueOf(j), str, Long.valueOf(j2));
        try {
            if (!UUID_CACHE.check(str) || j == 5) {
                UUID_CACHE.put(str, str);
                if (j == 2) {
                    if (bArr != null) {
                        C114781l0.m161556c().post(new Runnable() {
                            public void run() {
                                C114781l0.m161557d().mo174420a(C0947jz.f2205e, bArr);
                            }
                        });
                    }
                    return ACTION_ACK_OK;
                } else if (j == 4) {
                    if (bArr != null) {
                        C114781l0.m161556c().post(new Runnable() {
                            public void run() {
                                C114781l0.m161557d().mo174420a(322, bArr);
                            }
                        });
                    }
                    return ACTION_ACK_OK;
                } else {
                    if (j == 5) {
                        if (bArr == null) {
                            return ACTION_ACK_FAILED;
                        }
                        C114781l0.m161556c().post(new Runnable() {
                            public void run() {
                                try {
                                    C49775hz3 hz32 = new C49775hz3();
                                    hz32.f134985d = C89349b.m111674a(bArr);
                                    hz32.f134986e = C89349b.m111674a(bArr3);
                                    hz32.f134987f = j2;
                                    C114781l0.m161557d().mo174420a(321, hz32.toByteArray());
                                } catch (IOException e) {
                                    Log.printErrStackTrace(MMLogic.TAG, e, (String) null, new Object[0]);
                                }
                            }
                        });
                        return ACTION_ACK_ASYNC;
                    }
                    return ACTION_ACK_UNSUPPORTED;
                }
            } else {
                String str2 = TAG;
                Log.m105924i(str2, "[OnActionNotify] uuid = " + str + ", is Repeated");
                return ACTION_ACK_OK;
            }
        } catch (Exception e) {
            String str3 = TAG;
            Log.m105920e(str3, "[OnActionNotify] e: " + e.getMessage());
        }
    }

    public static int ackActionNotify(String str, long j, int i) {
        String str2 = TAG;
        Log.m105924i(str2, "action notify task=" + j + ",result=" + i);
        return mmAckActionNotify(str, j, i);
    }

    public static native void addHostInfo(String[] strArr, String[] strArr2, int[] iArr);

    public static void addMMNetCommonCallback(C40377j jVar) {
        if (jVar == null) {
            Log.m105928w(TAG, "add net callback is null");
            return;
        }
        Lock lock = f342919l;
        lock.lock();
        netCallbacks.add(jVar);
        lock.unlock();
    }

    public static native void clearLocalHostCache();

    public static native void clearMMtlsForbidenHostAndPsk();

    public static int doLiveSpeedTest(String str, int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, C40384w wVar) {
        return MMLiveSpeedTestInterfaces.getInstance().doLiveSpeedTest(str, i, i2, i3, i4, bArr, bArr2, wVar);
    }

    public static native void doLiveSpeedTest(String str, int i, int i2, int i3, int i4, MMLiveSpeedTestInterfaces.SpeedTestCtx speedTestCtx, int i5);

    private static void doNetIdRequest() {
        C114781l0.m161556c().post(new Runnable() {
            public void run() {
                C114781l0.m161557d().mo174420a(6238, (byte[]) null);
            }
        });
    }

    public static native void forceUseV6(boolean z);

    private static String getCurLanguage() {
        try {
            return LocaleUtil.getApplicationLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getHostByName(String str, List<String> list) {
        long currentTimeMillis = System.currentTimeMillis();
        GetDnsReturn getDnsReturn = new GetDnsReturn();
        getHostIps(str, getDnsReturn);
        for (int i = 0; i < getDnsReturn.length; i++) {
            list.add(getDnsReturn.aryIps[i]);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ReportInfo reportInfo = new ReportInfo();
        reportInfo.actionId = 11;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = str;
        reportInfo.f342920ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        reportStat(reportInfo);
        return getDnsReturn.type;
    }

    private static native void getHostIps(String str, GetDnsReturn getDnsReturn);

    public static native String[] getIPsString(boolean z);

    public static native String getIspId();

    /* access modifiers changed from: private */
    public static int getJavaActionId(long j) {
        switch ((int) j) {
            case 1:
                return 10955;
            case 2:
                return 10104;
            case 3:
                return 10103;
            case 4:
                return 10105;
            case 5:
                return 10102;
            case 6:
                return 10101;
            case 7:
                return 1105;
            case 8:
                return 10428;
            case 9:
                return -1;
            case 10:
                return -2;
            case 11:
                return -3;
            default:
                return 0;
        }
    }

    public static native void getLocalHostList(String[] strArr, String str);

    private static int getLogIdSubType(long j, String str) {
        if (j == 11108) {
            try {
                if (payCgis.contains(Integer.valueOf(Integer.parseInt(str)))) {
                    Log.m105918d("C2Java", "gettype 1");
                    return 1;
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static native int getMMtlsRegion();

    public static native long getMarsTimestamp();

    public static native NetworkIdInfo getNetworkId(String str);

    public static native String getNetworkServerIp();

    private static native void getSnsIps(boolean z, GetDnsReturn getDnsReturn);

    public static int getSnsIpsForScene(List<String> list, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        GetDnsReturn getDnsReturn = new GetDnsReturn();
        getSnsIps(z, getDnsReturn);
        for (int i = 0; i < getDnsReturn.length; i++) {
            list.add(getDnsReturn.aryIps[i]);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ReportInfo reportInfo = new ReportInfo();
        reportInfo.actionId = 11;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = "mmsns.qpic.cn";
        reportInfo.f342920ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        reportStat(reportInfo);
        return getDnsReturn.type;
    }

    public static int getSnsIpsForSceneWithHostName(List<String> list, String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        GetDnsReturn getDnsReturn = new GetDnsReturn();
        getSnsIpsWithHostName(str, z, getDnsReturn);
        for (int i = 0; i < getDnsReturn.length; i++) {
            list.add(getDnsReturn.aryIps[i]);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ReportInfo reportInfo = new ReportInfo();
        reportInfo.actionId = 11;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = str;
        reportInfo.f342920ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        reportStat(reportInfo);
        return getDnsReturn.type;
    }

    private static native void getSnsIpsWithHostName(String str, boolean z, GetDnsReturn getDnsReturn);

    private static String getUserIDCLocale() {
        try {
            return Util.isOverseasUser(MMApplicationContext.getContext()) ? "HK" : "CN";
        } catch (Exception unused) {
            return null;
        }
    }

    private static int getXAgreementId() {
        Log.m105918d("zyzhang", "getXAgreementId");
        int i = WeChatBrands.UserInfo.xagreementId;
        Log.m105925i("C2Java", "MMLogic get xagreement id %s", Integer.valueOf(i));
        return i;
    }

    private static String ifUseNewNetId() {
        String f = C117731d.m166007c().mo182444f("clicfg_mars_use_new_netid", "1", false, true);
        Log.m105924i("C2Java", "use new netid flag is " + f);
        return f == null ? "0" : f;
    }

    private static int isOverseasUser() {
        String f = C117731d.m166007c().mo182444f("clicfg_android_newdns_cn", "1", false, true);
        String str = TAG;
        Log.m105924i(str, "newdns use cn flag is " + f);
        if ("0".equals(f)) {
            return 1;
        }
        return Util.isOverseasUser(MMApplicationContext.getContext()) ? 1 : 0;
    }

    public static native int mmAckActionNotify(String str, long j, int i);

    private static void notifyNewSpeedTestReport(byte[] bArr, int i, int i2, int i3, int i4, String str, int i5, String str2, int i6, int i7) {
        if (C114781l0.m161557d() == null) {
            Log.m105920e("C2Java", "notifyNewSpeedTestReport failed");
            return;
        }
        ka4 ka4 = new ka4();
        ka4.f354073h = i;
        ka4.f354074i = i2;
        ka4.f354075j = i3;
        ka4.f354076n = i4;
        ka4.f354069d = C89349b.m111674a(bArr);
        ka4.f354071f = "";
        ka4.f354070e = "";
        ka4.f354072g = "";
        if (i7 == 3) {
            ka4.f354070e = "dual";
        }
        ha4 ha4 = new ha4();
        ha4 ha42 = new ha4();
        ha4.f134533d = str;
        ha4.f134534e = i5;
        ha42.f134533d = str2;
        ha42.f134534e = i6;
        ka4.f354078p = ha4;
        ka4.f354077o = ha42;
        String str3 = new String(bArr);
        Log.m105918d("C2Java", "notifyNewSpeedTestReport origin cookie: " + str3 + ", origin size : " + bArr.length + ", covert cookie size " + ka4.f354069d.f257327a.length);
        try {
            final byte[] byteArray = ka4.toByteArray();
            C114781l0.m161556c().post(new Runnable() {
                public void run() {
                    C114781l0.m161557d().mo174420a(C90509a.C90511b.CTRL_INDEX, byteArray);
                }
            });
        } catch (Exception e) {
            Log.m105921e("C2Java", "notifyNewSpeedTestReport :%s", Util.stackTraceToString(e));
        }
    }

    private static void notifyStnWeaknet(final boolean z) {
        Log.m105918d("zyzhang", "receive weaknet notify " + (z ? 1 : 0));
        C114781l0.m161556c().post(new Runnable() {
            public void run() {
                byte[] bArr = new byte[1];
                if (z) {
                    bArr[0] = 1;
                }
                C114781l0.m161557d().mo174420a(10098, bArr);
            }
        });
    }

    private static void onDisasterNodeNotify(String str) {
        C114765a0.m161489a(str);
    }

    private static void onLiveSpeedTestCallback(MMLiveSpeedTestInterfaces.LiveSpeedTestResult liveSpeedTestResult, boolean z) {
        MMLiveSpeedTestInterfaces.getInstance().onLiveSpeedTestCallback(liveSpeedTestResult, z);
    }

    private static void onOOBNotify(final String str) {
        Log.m105924i("C2Java", "onOOBNotify:" + str);
        if (C114781l0.m161557d() == null) {
            Assert.assertTrue(false);
            return;
        }
        try {
            C114781l0.m161556c().post(new Runnable() {
                public void run() {
                    C114781l0.m161557d().mo174420a(268369923, Util.isNullOrNil(str) ? null : str.getBytes());
                }
            });
        } catch (Exception e) {
            Log.m105921e("C2Java", "onOOBNotify :%s", Util.stackTraceToString(e));
        }
    }

    public static void receiveWeakNetNotify(boolean z, int i) {
        f342919l.lock();
        try {
            for (C40377j next : netCallbacks) {
                if (next != null) {
                    next.mo59883q2(z, i);
                }
            }
        } catch (Exception e) {
            Log.m105921e(TAG, "receiveWeakNetNotify : %s", Util.stackTraceToString(e));
        } catch (Throwable th) {
            f342919l.unlock();
            throw th;
        }
        f342919l.unlock();
    }

    public static native void recoverLinkAddrs();

    public static void removeMMNetCommonCallback(C40377j jVar) {
        if (jVar == null) {
            Log.m105928w(TAG, "remove net callback is null");
            return;
        }
        Lock lock = f342919l;
        lock.lock();
        netCallbacks.remove(jVar);
        lock.unlock();
    }

    public static native void reportCGIServerError(int i, int i2);

    public static native void reportFailIp(String str);

    private static void reportFlow(int i, int i2, int i3, int i4) {
        int i5 = totalWifiRecv + i;
        totalWifiRecv = i5;
        int i6 = totalWifiSend + i2;
        totalWifiSend = i6;
        int i7 = totalMobileRecv + i3;
        totalMobileRecv = i7;
        int i8 = totalMobileSend + i4;
        totalMobileSend = i8;
        int i9 = i7 + i8 + i5 + i6;
        final C31566b bVar = C114781l0.m161558e().f344173a;
        Log.m105925i("C2Java", "reportNetFlow time[%d,%d] sum:%d wr[%d,%d] ws[%d,%d] mr[%d,%d] ms[%d,%d] fgbg:%b Moniter:%s", Long.valueOf(lastReportTime), Long.valueOf(Util.secondsToNow(lastReportTime)), Integer.valueOf(i9), Integer.valueOf(i), Integer.valueOf(totalWifiRecv), Integer.valueOf(i2), Integer.valueOf(totalWifiSend), Integer.valueOf(i3), Integer.valueOf(totalMobileRecv), Integer.valueOf(i4), Integer.valueOf(totalMobileSend), Boolean.valueOf(CrashReportFactory.foreground), bVar);
        if (bVar != null) {
            if (i9 >= 102400 || Util.secondsToNow(lastReportTime) >= 30) {
                lastReportTime = Util.nowSecond();
                final int i15 = totalWifiRecv;
                totalWifiRecv = 0;
                final int i16 = totalWifiSend;
                totalWifiSend = 0;
                final int i17 = totalMobileRecv;
                totalMobileRecv = 0;
                final int i18 = totalMobileSend;
                totalMobileSend = 0;
                try {
                    C114781l0.m161556c().post(new Runnable() {
                        public void run() {
                            try {
                                C31566b.this.qu0(i15, i16, i17, i18);
                            } catch (Throwable th) {
                                Log.m105921e("C2Java", "reportFlowData :%s", Util.stackTraceToString(th));
                            }
                        }
                    });
                } catch (Throwable th) {
                    Log.m105921e("C2Java", "reportFlowData :%s", Util.stackTraceToString(th));
                }
            }
        }
    }

    public static void reportStat(final ReportInfo reportInfo) {
        try {
            C114781l0.m161556c().post(new Runnable() {
                public void run() {
                    int access$100 = MMLogic.getJavaActionId(ReportInfo.this.actionId);
                    if (access$100 == 0) {
                        Log.m105920e("C2Java", "ActionId Can not convert");
                        return;
                    }
                    ReportInfo.this.actionId = (long) access$100;
                }
            });
        } catch (Exception unused) {
        }
    }

    public static native void reportV6Status(boolean z);

    public static native void saveAuthLongIPs(String str, String[] strArr);

    public static native void saveAuthLongList(Object obj, int[] iArr);

    public static native void saveAuthPorts(int[] iArr, int[] iArr2);

    public static native void saveAuthShortIPs(String str, String[] strArr);

    public static native void saveAuthShortList(Object obj, int[] iArr);

    public static native void setCgiDebugIP(String str, String str2, int i);

    public static native void setDebugHost(String str);

    public static native void setDebugIP(String str, String str2, String str3, String str4);

    public static native void setHostInfo(String[] strArr, String[] strArr2, int[] iArr);

    public static native void setMMtlsRegion(int i);

    public static native void setMmtlsCtrlInfo(boolean z);

    public static native void setNetIdAndIsp(String str, String str2, String str3);

    public static native void setNetworkId(String str, String str2, String str3, int i);

    public static native void setNewDnsDebugHost(String str, String str2);

    public static void simpleTestCommand(String str) {
        Log.m105918d("zyzhang", "command is " + str);
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("testReportFlush")) {
                testReportFlush();
            } else if (!str.contains("speedtest")) {
                if (str.contains("oversea")) {
                    Log.m105918d("MMlogic", "is oversea user: " + Util.isOverseasUser(MMApplicationContext.getContext()));
                } else if (str.contains(AppMeasurement.Param.TIMESTAMP)) {
                    long marsTimestamp = getMarsTimestamp();
                    Log.m105918d("MMlogic", "current timestamp " + marsTimestamp);
                }
            }
        }
    }

    public static native void switchProcessActiveState(boolean z);

    public static native void testReportFlush();

    public static native void uploadFile(String str, String str2, String str3);

    public static native void uploadLog(int[] iArr, boolean z, String str, String str2);
}
