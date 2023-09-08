package hi2;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import z04.C112550d0;
import z04.C91602g0;

/* renamed from: hi2.i */
public final class C87513i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f253521d;

    /* renamed from: e */
    public final /* synthetic */ String f253522e;

    /* renamed from: f */
    public final /* synthetic */ long f253523f;

    public C87513i(String str, String str2, long j) {
        this.f253521d = str;
        this.f253522e = str2;
        this.f253523f = j;
    }

    public final void run() {
        Iterable<C86001b0> t;
        StringBuilder sb;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        if (!TextUtils.isEmpty(this.f253521d) && C86013q1.m106450k(this.f253521d) && (t = C86013q1.m106459t(this.f253521d, false)) != null) {
            String str = this.f253522e;
            String str2 = this.f253521d;
            long j = this.f253523f;
            for (C86001b0 next : t) {
                String str3 = next.f250471a;
                C87412m.m108593f(str3, "it.relPath");
                if (C112550d0.m153801u(str3, str, false)) {
                    Date date = new Date(next.f250475e);
                    String format = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis() - next.f250475e));
                    if (C91602g0.m114945m0(str2) == '/') {
                        sb = new StringBuilder();
                        sb.append(str2);
                    } else {
                        sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(File.separator);
                    }
                    sb.append(next.f250471a);
                    String sb4 = sb.toString();
                    Log.m105924i("MicroMsg.MediaFileUtil", "print file path:" + sb4 + " data:" + date + " time:" + next.f250475e + " exist:" + format);
                    if (System.currentTimeMillis() - next.f250475e >= j) {
                        Log.m105924i("MicroMsg.MediaFileUtil", "delete file path:" + sb4);
                        C98453h.f288774a.mo137810h(sb4);
                    }
                }
            }
        }
    }
}
