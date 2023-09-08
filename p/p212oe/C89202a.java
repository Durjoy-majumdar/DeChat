package p212oe;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.wxperf.thread.ThreadInspect;
import java.util.Collections;
import java.util.Map;
import p981ie.C87704h;

/* renamed from: oe.a */
public final class C89202a extends C87704h {

    /* renamed from: a */
    public static Map<Integer, String> f257033a = Collections.emptyMap();

    /* renamed from: a */
    public String mo122129a(int i) {
        String a = super.mo122129a(i);
        if (!TextUtils.isEmpty(a)) {
            return "Java " + a;
        } else if (!ThreadInspect.init()) {
            return "";
        } else {
            String jUnwindR = ThreadInspect.jUnwindR(i);
            if (!TextUtils.isEmpty(jUnwindR)) {
                return "Java " + jUnwindR;
            }
            String localCurrentThread = i == Process.myTid() ? ThreadInspect.getLocalCurrentThread() : ThreadInspect.getLocalThread(i);
            if (TextUtils.isEmpty(localCurrentThread)) {
                return "";
            }
            return "Native " + localCurrentThread;
        }
    }
}
