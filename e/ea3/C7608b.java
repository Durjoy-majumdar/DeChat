package ea3;

import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;

/* renamed from: ea3.b */
public enum C7608b {
    INSTANCE;
    

    /* renamed from: d */
    public int f25876d;

    /* renamed from: e */
    public int f25877e;

    /* renamed from: f */
    public String f25878f;

    /* renamed from: a */
    public void mo8744a(String str, long j, int i, int i2, int i3, int i4, int i5) {
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (currentTimeMillis >= 0 && currentTimeMillis <= 3600000) {
                Log.m105924i("MicroMsg.AuthReport", str + "," + i2 + "," + i + "," + i3 + "," + currentTimeMillis + "," + i4 + "," + i5);
                C115669n.INSTANCE.mo160131h(16488, str, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3), Long.valueOf(currentTimeMillis), Integer.valueOf(i4), 0, Integer.valueOf(i5), Integer.valueOf(this.f25876d), this.f25878f);
            }
        }
    }

    /* renamed from: b */
    public void mo8745b(int i, int i2, int i3) {
        int h = C92721n.m116880h();
        if (h == 100) {
            h = 0;
        }
        if (i2 >= 0 && ((long) i2) <= 3600000) {
            C115669n.INSTANCE.mo160131h(17614, Integer.valueOf(this.f25876d), Integer.valueOf(this.f25877e), Integer.valueOf(i), Integer.valueOf(h), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    /* renamed from: c */
    public void mo8746c(int i, String str) {
        this.f25876d = (int) (System.currentTimeMillis() / 1000);
        this.f25877e = i;
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        this.f25878f = WebViewUtilities.doUrlEncode(str);
    }
}
