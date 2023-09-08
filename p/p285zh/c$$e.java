package p285zh;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zh.c$$e */
public class c$$e {

    /* renamed from: a */
    public final String f356705a;

    /* renamed from: b */
    public Map<String, Integer> f356706b = Collections.emptyMap();

    /* renamed from: c */
    public long f356707c = 0;

    /* renamed from: d */
    public long f356708d = 0;

    /* renamed from: e */
    public long f356709e = 0;

    /* renamed from: f */
    public long f356710f = 0;

    public c$$e(String str) {
        this.f356705a = str;
    }

    /* renamed from: a */
    public void mo183787a() {
        if (this.f356706b != Collections.EMPTY_MAP) {
            synchronized (this) {
                if (!this.f356706b.isEmpty()) {
                    for (Integer intValue : this.f356706b.values()) {
                        this.f356707c += (long) intValue.intValue();
                    }
                    this.f356706b.clear();
                }
            }
            long j = this.f356709e;
            if (j > 0) {
                this.f356710f += j;
                this.f356709e = 0;
            }
        }
    }

    /* renamed from: b */
    public boolean mo183788b() {
        boolean z = true;
        if (!(this.f356706b != Collections.EMPTY_MAP)) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f356708d;
        if (j > 0) {
            long j2 = uptimeMillis - j;
            if (j2 < 10000) {
                this.f356709e += j2;
                Log.m105924i("MicroMsg.NotifyPowerInspector", "collect " + this.f356705a + " addicted ms: " + j2 + ", all=" + this.f356709e);
                this.f356708d = uptimeMillis;
                return z;
            }
        }
        z = false;
        this.f356708d = uptimeMillis;
        return z;
    }

    /* renamed from: c */
    public void mo183789c(String str) {
        int i = 1;
        if (this.f356706b != Collections.EMPTY_MAP) {
            synchronized (this) {
                Integer num = this.f356706b.get(str);
                if (num != null) {
                    i = 1 + num.intValue();
                }
                this.f356706b.put(str, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: d */
    public void mo183790d() {
        synchronized (this) {
            this.f356706b = new HashMap();
        }
    }
}
