package com.tencent.p014mm.sdk.platformtools;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.RemoteException;
import com.tencent.p014mm.vfs.C45114t1;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.sdk.platformtools.TrafficStats */
public final class TrafficStats {
    private static long CURRENT_TIMESTAMP = System.currentTimeMillis();
    public static final String DEV_FILE = "/proc/self/net/dev";
    public static final String GPRSLINE = "rmnet0";
    private static C86009m1 NET_DEV_FILE = null;
    private static final long START_OFFSET;
    private static final String TAG = "MicroMsg.SDK.TrafficStats";
    public static final String WIFILINE = "tiwlan0";
    private static C86009m1 XT_STATS_FILE;
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    public static volatile boolean inited;
    private static long lastMobileRx;
    private static long lastMobileTx;
    private static long lastUpdateTime = -1;
    private static long lastWifiRx;
    private static long lastWifiTx;
    private static long lastWxMobileRx;
    private static long lastWxMobileTx;
    private static long lastWxWifiRx;
    private static long lastWxWifiTx;
    private static long mobileRx;
    private static long mobileTx;
    public static final ConcurrentLinkedQueue<ReportContent> reportQueue = new ConcurrentLinkedQueue<>();
    private static final long startTime;
    public static long totalWxRx;
    private static long wifiRx;
    private static long wifiTx;
    private static long wxMobileRx;
    private static long wxMobileTx;
    private static long wxWifiRx;
    private static long wxWifiTx;

    /* renamed from: com.tencent.mm.sdk.platformtools.TrafficStats$ReportContent */
    public static class ReportContent {
        public String PageSeq;
        public String exceedIndex;
        public long realInterval;
        public long realMobileTraffic;
        public long realTraffic;
        public long realWifiTraffic;
    }

    static {
        long millis = TimeUnit.DAYS.toMillis(3);
        START_OFFSET = millis;
        startTime = System.currentTimeMillis() - millis;
        C86009m1 m1Var = null;
        try {
            C86009m1 m1Var2 = new C86009m1("/proc/" + Process.myPid() + "/net/dev");
            if (!m1Var2.mo119978p()) {
                m1Var2 = null;
            }
            NET_DEV_FILE = m1Var2;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "Failed init NET_DEV_FILE.", new Object[0]);
        }
        try {
            C86009m1 m1Var3 = new C86009m1("/proc/net/xt_qtaguid/stats");
            if (m1Var3.mo119978p()) {
                m1Var = m1Var3;
            }
            XT_STATS_FILE = m1Var;
        } catch (Exception e2) {
            Log.printErrStackTrace(TAG, e2, "Failed init XT_STATS_FILE.", new Object[0]);
        }
        init();
    }

    private TrafficStats() {
    }

    private static long average(long j) {
        return (long) (((double) j) / ((((double) (System.currentTimeMillis() - lastUpdateTime)) / 60.0d) / 1000.0d));
    }

    private static synchronized boolean checkIfFrequently() {
        synchronized (TrafficStats.class) {
            if (System.currentTimeMillis() - CURRENT_TIMESTAMP < 30000) {
                return true;
            }
            CURRENT_TIMESTAMP = System.currentTimeMillis();
            return false;
        }
    }

    public static long getMobileRx(long j) {
        long j2 = mobileRx;
        return j2 > j ? j2 : j;
    }

    public static long getMobileTx(long j) {
        long j2 = mobileTx;
        return j2 > j ? j2 : j;
    }

    public static long getWifiRx(long j) {
        long j2 = wifiRx;
        return j2 > j ? j2 : j;
    }

    public static long getWifiTx(long j) {
        long j2 = wifiTx;
        return j2 > j ? j2 : j;
    }

    public static long getWxMobileRx(long j) {
        long j2 = wxMobileRx;
        return j2 > j ? j2 : j;
    }

    public static long getWxMobileTx(long j) {
        long j2 = wxMobileTx;
        return j2 > j ? j2 : j;
    }

    public static long getWxWifiRx(long j) {
        long j2 = wxWifiRx;
        return j2 > j ? j2 : j;
    }

    public static long getWxWifiTx(long j) {
        long j2 = wxWifiTx;
        return j2 > j ? j2 : j;
    }

    private static void init() {
        if (!inited) {
            reset();
            inited = true;
        }
    }

    public static void reset() {
        lastMobileTx = -1;
        lastMobileRx = -1;
        lastWifiTx = -1;
        lastWifiRx = -1;
        lastWxMobileRx = -1;
        lastWxMobileTx = -1;
        lastWxWifiRx = -1;
        lastWxWifiTx = -1;
    }

    public static void update() {
        updateFile();
    }

    public static void updateFile() {
        char c;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        if (checkIfFrequently()) {
            Log.m105924i(TAG, "updateFile frequently just return");
            return;
        }
        try {
            if (NET_DEV_FILE != null) {
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(new C45114t1(NET_DEV_FILE));
                    try {
                        bufferedReader3.readLine();
                        bufferedReader3.readLine();
                        long j = 0;
                        long j2 = 0;
                        long j3 = 0;
                        long j4 = 0;
                        while (true) {
                            String readLine = bufferedReader3.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String[] split = readLine.split("[ :\t]+");
                            int i = split[0].length() == 0 ? 1 : 0;
                            int i2 = i + 0;
                            if (!split[i2].equals(LocaleUtil.LAO)) {
                                if (!split[i2].startsWith("rmnet")) {
                                    if (!split[i2].startsWith("ccmni")) {
                                        j3 += Long.parseLong(split[i + 9]);
                                        j4 += Long.parseLong(split[i + 1]);
                                    }
                                }
                                j += Long.parseLong(split[i + 9]);
                                j2 += Long.parseLong(split[i + 1]);
                            }
                        }
                        if (lastMobileTx < 0) {
                            lastMobileTx = j;
                            Log.m105927v(TAG, "fix loss newMobileTx %d", Long.valueOf(j));
                        }
                        if (lastMobileRx < 0) {
                            lastMobileRx = j2;
                            Log.m105927v(TAG, "fix loss newMobileRx %d", Long.valueOf(j2));
                        }
                        if (lastWifiTx < 0) {
                            lastWifiTx = j3;
                            Log.m105927v(TAG, "fix loss newWifiTx %d", Long.valueOf(j3));
                        }
                        if (lastWifiRx < 0) {
                            lastWifiRx = j4;
                            Log.m105927v(TAG, "fix loss newWifiRx %d", Long.valueOf(j4));
                        }
                        long j5 = lastWifiRx;
                        if (j4 - j5 < 0) {
                            Log.m105927v(TAG, "minu %d", Long.valueOf(j4 - j5));
                        }
                        long j6 = lastWifiTx;
                        if (j3 - j6 < 0) {
                            Log.m105927v(TAG, "minu %d", Long.valueOf(j3 - j6));
                        }
                        long j7 = lastMobileTx;
                        mobileTx = j >= j7 ? j - j7 : j;
                        long j8 = lastMobileRx;
                        mobileRx = j2 >= j8 ? j2 - j8 : j2;
                        long j9 = lastWifiTx;
                        wifiTx = j3 >= j9 ? j3 - j9 : j3;
                        long j15 = lastWifiRx;
                        wifiRx = j4 >= j15 ? j4 - j15 : j4;
                        lastMobileTx = j;
                        lastMobileRx = j2;
                        lastWifiTx = j3;
                        lastWifiRx = j4;
                        Util.qualityClose(bufferedReader3);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        Util.qualityClose(bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader2 = null;
                    Util.qualityClose(bufferedReader2);
                    throw th;
                }
            }
            if (XT_STATS_FILE != null) {
                try {
                    int myUid = Process.myUid();
                    BufferedReader bufferedReader4 = new BufferedReader(new C45114t1(XT_STATS_FILE));
                    try {
                        bufferedReader4.readLine();
                        long j16 = 0;
                        long j17 = 0;
                        long j18 = 0;
                        long j19 = 0;
                        while (true) {
                            String readLine2 = bufferedReader4.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            String[] split2 = readLine2.split("[ :\\t]+");
                            if (Integer.parseInt(split2[3]) == myUid) {
                                String str = split2[1];
                                long parseLong = Long.parseLong(split2[5]);
                                long parseLong2 = Long.parseLong(split2[7]);
                                if (!str.startsWith("rmnet")) {
                                    if (!str.startsWith("ccmni")) {
                                        if (!str.equals(LocaleUtil.LAO)) {
                                            j18 += parseLong;
                                            j19 += parseLong2;
                                        }
                                    }
                                }
                                j16 += parseLong;
                                j17 += parseLong2;
                            }
                        }
                        if (lastWxMobileRx < 0) {
                            lastWxMobileRx = j16;
                        }
                        if (lastWxMobileTx < 0) {
                            lastWxMobileTx = j17;
                        }
                        if (lastWxWifiRx < 0) {
                            lastWxWifiRx = j18;
                        }
                        if (lastWxWifiTx < 0) {
                            lastWxWifiTx = j19;
                        }
                        long j25 = lastWxMobileTx;
                        wxMobileTx = j17 >= j25 ? j17 - j25 : j17;
                        long j26 = lastWxMobileRx;
                        wxMobileRx = j16 >= j26 ? j16 - j26 : j16;
                        long j27 = lastWxWifiTx;
                        wxWifiTx = j19 >= j27 ? j19 - j27 : j19;
                        long j28 = lastWxWifiRx;
                        wxWifiRx = j18 >= j28 ? j18 - j28 : j18;
                        lastWxMobileTx = j17;
                        lastWxMobileRx = j16;
                        lastWxWifiTx = j19;
                        lastWxWifiRx = j18;
                        Util.qualityClose(bufferedReader4);
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedReader = bufferedReader4;
                        Util.qualityClose(bufferedReader);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bufferedReader = null;
                    Util.qualityClose(bufferedReader);
                    throw th;
                }
            }
            c = 0;
        } catch (Exception e) {
            c = 0;
            Log.printErrStackTrace(TAG, e, "Failed retrieving TrafficStats.", new Object[0]);
        }
        Object[] objArr = new Object[8];
        objArr[c] = Long.valueOf(wifiRx);
        objArr[1] = Long.valueOf(wifiTx);
        objArr[2] = Long.valueOf(mobileRx);
        objArr[3] = Long.valueOf(mobileTx);
        objArr[4] = Long.valueOf(wxWifiRx);
        objArr[5] = Long.valueOf(wxWifiTx);
        objArr[6] = Long.valueOf(wxMobileRx);
        objArr[7] = Long.valueOf(wxMobileTx);
        Log.m105925i(TAG, "updateFile current system traffic: wifi rx/tx=%d/%d, mobile rx/tx=%d/%d, wxWifi rx/tx=%d/%d wxMobile rx/tx=%d/%d", objArr);
    }

    public static long updateMobileRx(long j) {
        update();
        return getMobileRx(j);
    }

    public static long updateMobileTx(long j) {
        update();
        return getMobileTx(j);
    }

    public static void updateNsm(Context context) {
        if (checkIfFrequently()) {
            Log.m105924i(TAG, "updateNsm frequently just return");
            return;
        }
        NetworkStatsManager networkStatsManager = (NetworkStatsManager) context.getSystemService("netstats");
        if (networkStatsManager != null) {
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            try {
                NetworkStats querySummary = networkStatsManager.querySummary(1, (String) null, startTime, System.currentTimeMillis());
                long j = 0;
                long j2 = 0;
                while (querySummary.hasNextBucket()) {
                    querySummary.getNextBucket(bucket);
                    if (bucket.getUid() == Process.myUid()) {
                        j += bucket.getRxBytes();
                        j2 += bucket.getTxBytes();
                    }
                }
                long j3 = 0 + j;
                long j4 = 0 + j2;
                querySummary.close();
                NetworkStatsManager networkStatsManager2 = networkStatsManager;
                StringBuilder sb = new StringBuilder("updateNSm traffic bucket detail: ");
                NetworkStats querySummary2 = networkStatsManager2.querySummary(0, (String) null, startTime, System.currentTimeMillis());
                if ((lastWxMobileTx > 0 || lastWxMobileRx > 0) && (querySummary2 == null || !querySummary2.hasNextBucket())) {
                    throw new IllegalStateException("no bucket, mobileNetworkStats = " + querySummary2);
                }
                long j5 = 0;
                long j6 = 0;
                int i = 0;
                while (querySummary2.hasNextBucket()) {
                    querySummary2.getNextBucket(bucket);
                    if (bucket.getUid() == Process.myUid()) {
                        j5 += bucket.getRxBytes();
                        j6 += bucket.getTxBytes();
                        sb.append(String.format("[bucket %02d] Rx/Tx=%d/%d, ", new Object[]{Integer.valueOf(i), Long.valueOf(bucket.getRxBytes()), Long.valueOf(bucket.getTxBytes())}));
                        i++;
                    }
                }
                Log.m105924i(TAG, sb.toString());
                querySummary2.close();
                long totalRxBytes = android.net.TrafficStats.getTotalRxBytes() - android.net.TrafficStats.getMobileRxBytes();
                long totalTxBytes = android.net.TrafficStats.getTotalTxBytes() - android.net.TrafficStats.getMobileTxBytes();
                long mobileRxBytes = android.net.TrafficStats.getMobileRxBytes();
                long mobileTxBytes = android.net.TrafficStats.getMobileTxBytes();
                if (lastMobileTx < 0) {
                    lastMobileTx = mobileTxBytes;
                    Log.m105927v(TAG, "fix loss newMobileTx %d", Long.valueOf(mobileTxBytes));
                }
                if (lastMobileRx < 0) {
                    lastMobileRx = mobileRxBytes;
                    Log.m105927v(TAG, "fix loss newMobileRx %d", Long.valueOf(mobileRxBytes));
                }
                if (lastWifiTx < 0) {
                    lastWifiTx = totalTxBytes;
                    Log.m105927v(TAG, "fix loss newWifiTx %d", Long.valueOf(totalTxBytes));
                }
                if (lastWifiRx < 0) {
                    lastWifiRx = totalRxBytes;
                    Log.m105927v(TAG, "fix loss newWifiRx %d", Long.valueOf(totalRxBytes));
                }
                long j7 = lastWifiRx;
                if (totalRxBytes - j7 < 0) {
                    Log.m105927v(TAG, "minu %d", Long.valueOf(totalRxBytes - j7));
                }
                long j8 = lastWifiTx;
                if (totalTxBytes - j8 < 0) {
                    Log.m105927v(TAG, "minu %d", Long.valueOf(totalTxBytes - j8));
                }
                long j9 = lastMobileTx;
                mobileTx = mobileTxBytes >= j9 ? mobileTxBytes - j9 : 0;
                long j15 = lastMobileRx;
                mobileRx = mobileRxBytes >= j15 ? mobileRxBytes - j15 : 0;
                long j16 = lastWifiTx;
                wifiTx = totalTxBytes >= j16 ? totalTxBytes - j16 : 0;
                long j17 = lastWifiRx;
                wifiRx = totalRxBytes >= j17 ? totalRxBytes - j17 : 0;
                Log.m105924i(TAG, String.format("updateNSm device traffic detail: lastWifi Tx/Rx=%d/%d, lastMobile Tx/Rx=%d/%d, newWifi Tx/Rx=%d/%d, newMobile Tx/Rx=%d/%d, wifi Tx/Rx=%d/%d, mobile Tx/Rx=%d/%d", new Object[]{Long.valueOf(j16), Long.valueOf(lastWifiRx), Long.valueOf(lastMobileTx), Long.valueOf(lastMobileRx), Long.valueOf(totalTxBytes), Long.valueOf(totalRxBytes), Long.valueOf(mobileTxBytes), Long.valueOf(mobileRxBytes), Long.valueOf(wifiTx), Long.valueOf(wifiRx), Long.valueOf(mobileTx), Long.valueOf(mobileRx)}));
                lastMobileTx = mobileTxBytes;
                lastMobileRx = mobileRxBytes;
                lastWifiTx = totalTxBytes;
                lastWifiRx = totalRxBytes;
                long j18 = 0;
                if (lastWxMobileRx < 0) {
                    lastWxMobileRx = j5;
                }
                if (lastWxMobileTx < 0) {
                    lastWxMobileTx = j6;
                }
                if (lastWxWifiRx < 0) {
                    lastWxWifiRx = j3;
                }
                if (lastWxWifiTx < 0) {
                    lastWxWifiTx = j4;
                }
                long j19 = lastWxMobileTx;
                wxMobileTx = j6 >= j19 ? j6 - j19 : 0;
                long j25 = lastWxMobileRx;
                wxMobileRx = j5 >= j25 ? j5 - j25 : 0;
                long j26 = lastWxWifiTx;
                wxWifiTx = j4 >= j26 ? j4 - j26 : 0;
                long j27 = lastWxWifiRx;
                if (j3 >= j27) {
                    j18 = j3 - j27;
                }
                wxWifiRx = j18;
                Log.m105924i(TAG, String.format("updateNSm wechat traffic detail: lastWxWifi Tx/Rx=%d/%d, lastWxMobile Tx/Rx=%d/%d, newWxWifi Tx/Rx=%d/%d, newWxMobile Tx/Rx=%d/%d, wxWifi Tx/Rx=%d/%d, wxMobile Tx/Rx=%d/%d", new Object[]{Long.valueOf(j26), Long.valueOf(lastWxWifiRx), Long.valueOf(lastWxMobileTx), Long.valueOf(lastWxMobileRx), Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(wxWifiTx), Long.valueOf(wxWifiRx), Long.valueOf(wxMobileTx), Long.valueOf(wxMobileRx)}));
                lastWxMobileTx = j6;
                lastWxMobileRx = j5;
                lastWxWifiTx = j4;
                lastWxWifiRx = j3;
                totalWxRx = totalWxRx + wxMobileRx + wxWifiRx;
                Log.m105925i(TAG, "updateNSm lastUpdateTime=%d, currentTime=%d", Long.valueOf(lastUpdateTime), Long.valueOf(System.currentTimeMillis()));
                Log.m105925i(TAG, "updateNSm current system traffic: wifi rx/tx=%d/%d, mobile rx/tx=%d/%d, wxWifi rx/tx=%d/%d wxMobile rx/tx=%d/%d totalWxRx:=%d", Long.valueOf(wifiRx), Long.valueOf(wifiTx), Long.valueOf(mobileRx), Long.valueOf(mobileTx), Long.valueOf(wxWifiRx), Long.valueOf(wxWifiTx), Long.valueOf(wxMobileRx), Long.valueOf(wxMobileTx), Long.valueOf(totalWxRx));
                lastUpdateTime = System.currentTimeMillis();
            } catch (RemoteException | IllegalStateException | SecurityException e) {
                Log.printErrStackTrace(TAG, e, "Failed retrieving NsmTrafficStats.", new Object[0]);
                reset();
            } catch (NullPointerException e2) {
                Log.printErrStackTrace(TAG, e2, "!!!Failed retrieving NsmTrafficStats.", new Object[0]);
                reset();
            }
        }
    }

    public static long updateWifiRx(long j) {
        update();
        return getWifiRx(j);
    }

    public static long updateWifiTx(long j) {
        update();
        return getWifiTx(j);
    }

    public static void update(String str, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            updateNsm(context);
        } else {
            updateFile();
        }
    }
}
