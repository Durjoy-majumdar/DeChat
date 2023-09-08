package c13;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.os.Process;
import android.os.RemoteException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.concurrent.TimeUnit;

/* renamed from: c13.o */
public class C79916o extends C79913b {

    /* renamed from: l */
    public static final long f234127l = (System.currentTimeMillis() - TimeUnit.DAYS.toMillis(3));

    /* renamed from: d */
    public long f234128d = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: e */
    public long f234129e = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: f */
    public long f234130f = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: g */
    public long f234131g = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: h */
    public long f234132h = 0;

    /* renamed from: i */
    public long f234133i = 0;

    /* renamed from: j */
    public long f234134j = 0;

    /* renamed from: k */
    public long f234135k = 0;

    /* renamed from: k */
    public boolean mo17893k() {
        String str;
        NetworkStatsManager networkStatsManager = (NetworkStatsManager) MMApplicationContext.getContext().getSystemService("netstats");
        if (networkStatsManager == null) {
            Log.m105924i("NsmTrafficStats", "update: networkStatsManager == null");
            return false;
        }
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        try {
            NetworkStats querySummary = networkStatsManager.querySummary(1, (String) null, f234127l, System.currentTimeMillis());
            long j = 0;
            long j2 = 0;
            while (querySummary.hasNextBucket()) {
                querySummary.getNextBucket(bucket);
                if (bucket.getUid() == Process.myUid()) {
                    j2 += bucket.getRxBytes();
                    j += bucket.getTxBytes();
                }
            }
            querySummary.close();
            long j3 = j;
            String str2 = "NsmTrafficStats";
            long j4 = j2;
            try {
                NetworkStats querySummary2 = networkStatsManager.querySummary(0, (String) null, f234127l, System.currentTimeMillis());
                if (!(this.f234128d == MAlarmHandler.NEXT_FIRE_INTERVAL && this.f234129e == MAlarmHandler.NEXT_FIRE_INTERVAL) && (querySummary2 == null || !querySummary2.hasNextBucket())) {
                    str = str2;
                    try {
                        throw new IllegalStateException("no bucket, mobileNetworkStats = " + querySummary2);
                    } catch (RemoteException | IllegalStateException | SecurityException e) {
                        e = e;
                        this.f234128d = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        this.f234129e = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        this.f234130f = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        this.f234131g = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        Log.m105920e(str, "query traffic stats failed, e = " + e.getMessage());
                        return false;
                    } catch (NullPointerException e2) {
                        e = e2;
                        this.f234128d = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        this.f234129e = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        this.f234130f = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        this.f234131g = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        Log.m105920e(str, "!!!query traffic stats failed, e = " + e.getMessage());
                        return false;
                    }
                } else {
                    long j5 = 0;
                    long j6 = 0;
                    while (querySummary2.hasNextBucket()) {
                        querySummary2.getNextBucket(bucket);
                        if (bucket.getUid() == Process.myUid()) {
                            j6 += bucket.getRxBytes();
                            j5 += bucket.getTxBytes();
                        }
                    }
                    querySummary2.close();
                    long j7 = this.f234128d;
                    this.f234132h = j5 >= j7 ? j5 - j7 : 0;
                    long j8 = this.f234129e;
                    this.f234133i = j6 >= j8 ? j6 - j8 : 0;
                    long j9 = this.f234130f;
                    this.f234134j = j3 >= j9 ? j3 - j9 : 0;
                    long j15 = this.f234131g;
                    this.f234135k = j4 >= j15 ? j4 - j15 : 0;
                    Log.m105925i(str2, "update wechat traffic detail: lastWxWifi Tx/Rx=%d/%d, lastWxMobile Tx/Rx=%d/%d, newWxWifi Tx/Rx=%d/%d, newWxMobile Tx/Rx=%d/%d, wxWifi Tx/Rx=%d/%d, wxMobile Tx/Rx=%d/%d", Long.valueOf(j9), Long.valueOf(this.f234131g), Long.valueOf(this.f234128d), Long.valueOf(this.f234129e), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(this.f234134j), Long.valueOf(this.f234135k), Long.valueOf(this.f234132h), Long.valueOf(this.f234133i));
                    this.f234128d = j5;
                    this.f234129e = j6;
                    this.f234130f = j3;
                    this.f234131g = j4;
                    return true;
                }
            } catch (RemoteException | IllegalStateException | SecurityException e3) {
                e = e3;
                str = str2;
                this.f234128d = MAlarmHandler.NEXT_FIRE_INTERVAL;
                this.f234129e = MAlarmHandler.NEXT_FIRE_INTERVAL;
                this.f234130f = MAlarmHandler.NEXT_FIRE_INTERVAL;
                this.f234131g = MAlarmHandler.NEXT_FIRE_INTERVAL;
                Log.m105920e(str, "query traffic stats failed, e = " + e.getMessage());
                return false;
            } catch (NullPointerException e4) {
                e = e4;
                str = str2;
                this.f234128d = MAlarmHandler.NEXT_FIRE_INTERVAL;
                this.f234129e = MAlarmHandler.NEXT_FIRE_INTERVAL;
                this.f234130f = MAlarmHandler.NEXT_FIRE_INTERVAL;
                this.f234131g = MAlarmHandler.NEXT_FIRE_INTERVAL;
                Log.m105920e(str, "!!!query traffic stats failed, e = " + e.getMessage());
                return false;
            }
        } catch (RemoteException | IllegalStateException | SecurityException e5) {
            e = e5;
            str = "NsmTrafficStats";
            this.f234128d = MAlarmHandler.NEXT_FIRE_INTERVAL;
            this.f234129e = MAlarmHandler.NEXT_FIRE_INTERVAL;
            this.f234130f = MAlarmHandler.NEXT_FIRE_INTERVAL;
            this.f234131g = MAlarmHandler.NEXT_FIRE_INTERVAL;
            Log.m105920e(str, "query traffic stats failed, e = " + e.getMessage());
            return false;
        } catch (NullPointerException e6) {
            e = e6;
            str = "NsmTrafficStats";
            this.f234128d = MAlarmHandler.NEXT_FIRE_INTERVAL;
            this.f234129e = MAlarmHandler.NEXT_FIRE_INTERVAL;
            this.f234130f = MAlarmHandler.NEXT_FIRE_INTERVAL;
            this.f234131g = MAlarmHandler.NEXT_FIRE_INTERVAL;
            Log.m105920e(str, "!!!query traffic stats failed, e = " + e.getMessage());
            return false;
        }
    }

    /* renamed from: l */
    public long mo17894l(long j) {
        return Math.max(this.f234133i, j);
    }

    /* renamed from: m */
    public long mo17895m(long j) {
        return Math.max(this.f234135k, j);
    }

    /* renamed from: n */
    public long mo17896n(long j) {
        return Math.max(this.f234134j, j);
    }

    /* renamed from: o */
    public long mo17897o(long j) {
        return Math.max(this.f234132h, j);
    }
}
