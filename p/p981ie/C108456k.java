package p981ie;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: ie.k */
public class C108456k {

    /* renamed from: a */
    public final String f324772a;

    /* renamed from: b */
    public final int f324773b;

    public C108456k(int i, int i2) {
        this.f324772a = "/sys/devices/system/cpu/cpu" + i + "/cpufreq/stats/time_in_state";
        this.f324773b = i2;
    }

    /* renamed from: a */
    public long[] mo158997a() {
        BufferedReader bufferedReader;
        String readLine;
        long[] jArr = new long[this.f324773b];
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f324772a));
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(' ');
            for (int i = 0; i < this.f324773b && (readLine = bufferedReader.readLine()) != null; i++) {
                simpleStringSplitter.setString(readLine);
                simpleStringSplitter.next();
                jArr[i] = Long.parseLong(simpleStringSplitter.next());
            }
            bufferedReader.close();
            return jArr;
        } catch (Throwable th) {
            throw new IOException("Failed to read cpu-freq: " + th.getMessage(), th);
        }
        throw th;
    }

    /* renamed from: b */
    public void mo158998b() {
        long[] a = mo158997a();
        if (a.length != this.f324773b) {
            throw new IOException("CpuCore Step unmatched, expect = " + this.f324773b + ", actual = " + a.length + ", path = " + this.f324772a);
        }
    }
}
