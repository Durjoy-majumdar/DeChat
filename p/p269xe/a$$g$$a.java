package p269xe;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p988jj.C87968a;

/* renamed from: xe.a$$g$$a */
public final /* synthetic */ class a$$g$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Pair f261425d;

    /* renamed from: e */
    public final /* synthetic */ long f261426e;

    public /* synthetic */ a$$g$$a(Pair pair, long j) {
        this.f261425d = pair;
        this.f261426e = j;
    }

    public final void run() {
        Pair pair = this.f261425d;
        long j = this.f261426e;
        if (((String) pair.first).contains("@")) {
            int indexOf = ((String) pair.first).indexOf("@");
            String substring = ((String) pair.first).substring(0, indexOf);
            String substring2 = ((String) pair.first).substring(indexOf + 1);
            if (substring2.contains("@")) {
                int indexOf2 = substring2.indexOf("@");
                String substring3 = substring2.substring(0, indexOf2);
                String substring4 = substring2.substring(indexOf2 + 1);
                StringBuilder sb = new StringBuilder();
                sb.append("Long WakeLock BG: ");
                sb.append(substring);
                sb.append("@");
                sb.append(substring3);
                sb.append(", from=");
                sb.append(substring4);
                sb.append(", duringMin=");
                long j2 = j / 60000;
                sb.append(Math.max(j2, 1));
                sb.append(", since=");
                sb.append(new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(new Date(System.currentTimeMillis() - j)));
                Log.m105928w("Matrix.battery.AmsInvokeListener", sb.toString());
                C87968a.C87969a.C87970a.m109467a("longWakelockBg", (Throwable) null, (Map<String, Object>) null, String.valueOf(Math.max(j2, 1)), substring, substring4);
            }
        }
    }
}
