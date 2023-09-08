package p156gj;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.BufferedReader;
import java.io.FileReader;

/* renamed from: gj.p */
public class C107842p {
    /* renamed from: a */
    public static int m146108a() {
        int i = C87201q.m108263g() ? 7 : C87201q.m108262f() ? 3 : 1;
        C107843r rVar = C107835h0.f322844a;
        if (rVar.f322920a && rVar.f322922c == 0) {
            Log.m105918d("MicroMsg.CpuChecker", "disable armv6 by server ");
            i &= -3;
        }
        C107843r rVar2 = C107835h0.f322844a;
        if (rVar2.f322920a && rVar2.f322921b == 0) {
            Log.m105918d("MicroMsg.CpuChecker", "disable armv7 by server ");
            i &= -5;
        }
        int d = C87201q.m108260d();
        int i2 = 15;
        if (d > 16) {
            d = 15;
        } else if (d < 1) {
            d = 1;
        }
        int i3 = Util.getInt(m146110c(), 0) / 1000;
        Log.m105924i("MicroMsg.CpuChecker", "nCores: " + d + ", nFreq: " + i3);
        if (d >= 8) {
            i3 *= 5;
        } else if (d >= 4) {
            i3 *= 2;
        } else if (d > 1) {
            i3 = (i3 * 3) >> 1;
        }
        int i4 = i3 / 100;
        if (i4 > 200) {
            i4 = 200;
        } else if (i4 < 5) {
            i4 = 5;
        }
        if (i4 > 5 || d < 4) {
            i2 = i4;
        }
        return (((d << 4) + i) << 8) + i2;
    }

    /* renamed from: b */
    public static String m146109b() {
        BufferedReader bufferedReader;
        Exception e;
        try {
            bufferedReader = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"));
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String trim = readLine.trim();
                    Util.qualityClose(bufferedReader);
                    return trim;
                }
                throw new NullPointerException("null was returned while reading scaling_cur_freq.");
            } catch (Exception e2) {
                e = e2;
                try {
                    Log.printErrStackTrace("MicroMsg.CpuChecker", e, "unexpected exception occurred.", new Object[0]);
                    Util.qualityClose(bufferedReader);
                    return "0";
                } catch (Throwable th) {
                    th = th;
                    Util.qualityClose(bufferedReader);
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            bufferedReader = null;
            e = exc;
            Log.printErrStackTrace("MicroMsg.CpuChecker", e, "unexpected exception occurred.", new Object[0]);
            Util.qualityClose(bufferedReader);
            return "0";
        } catch (Throwable th4) {
            Throwable th5 = th4;
            bufferedReader = null;
            th = th5;
            Util.qualityClose(bufferedReader);
            throw th;
        }
    }

    /* renamed from: c */
    public static String m146110c() {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String trim = readLine.trim();
                    Util.qualityClose(bufferedReader);
                    return trim;
                }
                throw new NullPointerException("null was returned while reading cpuinfo_max_freq.");
            } catch (Throwable th4) {
                th = th4;
                try {
                    Log.printErrStackTrace("MicroMsg.CpuChecker", th, "unexpected exception occurred.", new Object[0]);
                    return "0";
                } finally {
                    Util.qualityClose(bufferedReader);
                }
            }
        } catch (Throwable th5) {
            Throwable th6 = th5;
            bufferedReader = null;
            th = th6;
            Log.printErrStackTrace("MicroMsg.CpuChecker", th, "unexpected exception occurred.", new Object[0]);
            return "0";
        }
    }
}
