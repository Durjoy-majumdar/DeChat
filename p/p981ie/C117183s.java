package p981ie;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import p329d3.C58104c;
import p723vf.C118672d;

/* renamed from: ie.s */
public final class C117183s {

    /* renamed from: ie.s$a */
    public static final class C117184a {

        /* renamed from: a */
        public long f351056a;

        /* renamed from: b */
        public long f351057b;

        /* renamed from: c */
        public long f351058c;

        /* renamed from: d */
        public long f351059d;
    }

    /* renamed from: ie.s$b */
    public static final class C117185b {

        /* renamed from: a */
        public long f351060a;

        /* renamed from: b */
        public long f351061b;

        /* renamed from: c */
        public long f351062c;

        /* renamed from: d */
        public long f351063d;

        /* renamed from: e */
        public long f351064e;

        /* renamed from: f */
        public long f351065f;

        /* renamed from: g */
        public long f351066g;

        /* renamed from: h */
        public long f351067h;
    }

    /* renamed from: a */
    public static C58104c<Long, Long> m165268a(Context context, String str) {
        long j;
        NetworkCapabilities networkCapabilities;
        long j2 = 0;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            long j3 = 0;
            j = 0;
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && ((networkInfo.isConnected() || networkInfo.isConnectedOrConnecting()) && networkInfo.getTypeName().equalsIgnoreCase(str) && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null)) {
                    j3 = ((long) networkCapabilities.getLinkDownstreamBandwidthKbps()) * 1024;
                    j = 1024 * ((long) networkCapabilities.getLinkUpstreamBandwidthKbps());
                    if (j3 > 0 || j > 0) {
                        break;
                    }
                }
            }
            j2 = j3;
        } else {
            j = 0;
        }
        return new C58104c<>(Long.valueOf(j2), Long.valueOf(j));
    }

    /* renamed from: b */
    public static C117184a m165269b(Context context) {
        try {
            C117184a aVar = new C117184a();
            C58104c<Long, Long> a = m165268a(context, "WIFI");
            F f = a.f166179a;
            long j = 0;
            aVar.f351056a = f == null ? 0 : ((Long) f).longValue();
            S s = a.f166180b;
            aVar.f351057b = s == null ? 0 : ((Long) s).longValue();
            C58104c<Long, Long> a2 = m165268a(context, "MOBILE");
            F f2 = a2.f166179a;
            aVar.f351058c = f2 == null ? 0 : ((Long) f2).longValue();
            S s2 = a2.f166180b;
            if (s2 != null) {
                j = ((Long) s2).longValue();
            }
            aVar.f351059d = j;
            return aVar;
        } catch (Exception e) {
            C118672d.m167356f("Matrix.battery.ProcStatUtil", "getBps err: " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static C117185b m165270c(Context context) {
        NetworkStats querySummary;
        NetworkStats querySummary2;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        try {
            NetworkStatsManager networkStatsManager = (NetworkStatsManager) context.getSystemService("netstats");
            if (networkStatsManager == null) {
                return null;
            }
            C117185b bVar = new C117185b();
            querySummary = networkStatsManager.querySummary(1, (String) null, 0, System.currentTimeMillis());
            while (querySummary.hasNextBucket()) {
                NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                if (querySummary.getNextBucket(bucket) && bucket.getUid() == Process.myUid()) {
                    bVar.f351060a += bucket.getRxBytes();
                    bVar.f351061b += bucket.getTxBytes();
                    bVar.f351062c += bucket.getRxPackets();
                    bVar.f351063d += bucket.getTxPackets();
                }
            }
            querySummary.close();
            querySummary2 = networkStatsManager.querySummary(0, (String) null, 0, System.currentTimeMillis());
            while (querySummary2.hasNextBucket()) {
                NetworkStats.Bucket bucket2 = new NetworkStats.Bucket();
                if (querySummary2.getNextBucket(bucket2) && bucket2.getUid() == Process.myUid()) {
                    bVar.f351064e += bucket2.getRxBytes();
                    bVar.f351065f += bucket2.getTxBytes();
                    bVar.f351066g += bucket2.getRxPackets();
                    bVar.f351067h += bucket2.getTxPackets();
                }
            }
            querySummary2.close();
            return bVar;
        } catch (Throwable th) {
            C118672d.m167356f("Matrix.battery.ProcStatUtil", "querySummary fail: " + th.getMessage(), new Object[0]);
            return null;
        }
        throw th;
        throw th;
    }
}
