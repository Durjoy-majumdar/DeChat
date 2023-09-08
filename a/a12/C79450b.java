package a12;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: a12.b */
public final class C79450b {

    /* renamed from: a */
    public final String f232990a;

    /* renamed from: b */
    public final String f232991b;

    public C79450b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("baseClientVersion is empty.");
        } else if (!TextUtils.isEmpty(str2)) {
            this.f232990a = str;
            this.f232991b = str2;
        } else {
            throw new IllegalArgumentException("patchClientVersion is empty.");
        }
    }

    /* renamed from: a */
    public final String mo109423a(int i) {
        return "mmkv_key_" + mo109427e(this.f232990a) + "_" + mo109427e(this.f232991b) + "_" + i;
    }

    /* renamed from: b */
    public final SharedPreferences mo109424b() {
        try {
            return MultiProcessMMKV.getMMKVWithTransportByName("tinker_deploy_stats_ts");
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TinkerDeployStatistic", th, "[-] Fail to init mmkv storage, fallback to system sp.", new Object[0]);
            return MMApplicationContext.getContext().getSharedPreferences("tinker_deploy_stats_ts", 4);
        }
    }

    /* renamed from: c */
    public final void mo109425c(int i, long j) {
        C115669n.INSTANCE.mo160126c(17676, String.valueOf(i) + ',' + mo109427e(this.f232990a) + ',' + mo109427e(this.f232991b) + ',' + j, true, true);
    }

    /* renamed from: d */
    public void mo109426d(long j) {
        SharedPreferences b = mo109424b();
        String a = mo109423a(4);
        if (!b.contains(a)) {
            mo109425c(4, j);
            b.edit().putLong(a, j).commit();
        }
    }

    /* renamed from: e */
    public final int mo109427e(String str) {
        try {
            if (str.startsWith("0x")) {
                str = str.substring(2);
            } else if (str.endsWith("h") || str.endsWith("H")) {
                str = str.substring(0, str.length() - 1);
            }
            return Integer.parseInt(str, 16);
        } catch (Throwable unused) {
            Log.m105921e("MicroMsg.TinkerDeployStatistic", "[-] Fail to parse hex string: %s", str);
            return 0;
        }
    }

    /* renamed from: f */
    public final void mo109428f(String str) {
        SharedPreferences b = mo109424b();
        if (!b.contains(str)) {
            b.edit().putLong(str, System.currentTimeMillis()).commit();
        }
    }
}
