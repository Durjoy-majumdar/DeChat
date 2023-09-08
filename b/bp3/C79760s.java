package bp3;

import android.content.Context;
import android.os.Trace;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.stubs.logger.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bp3.s */
public final class C79760s {

    /* renamed from: a */
    public static final boolean f233766a = (BuildInfo.DEBUG || BuildInfo.ENABLE_SYSTRACE);

    /* renamed from: b */
    public static final ThreadLocal<List<String>> f233767b = new C79761a();

    /* renamed from: bp3.s$a */
    public class C79761a extends ThreadLocal<List<String>> {
        public Object initialValue() {
            return new ArrayList(8);
        }
    }

    /* renamed from: a */
    public static void m96908a(String str) {
        if (f233766a) {
            Log.m106494d("MicroMsg.Systrace", "beginSection: %s", str);
            f233767b.get().add(str);
            if (str.length() > 127) {
                str = str.substring(str.length() - 127);
            }
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m96909b() {
        if (f233766a) {
            Trace.endSection();
            List list = f233767b.get();
            if (list.isEmpty()) {
                Log.m106493d("MicroMsg.Systrace", "Found unpaired beginSection or endSection invocations.");
                return;
            }
            Log.m106494d("MicroMsg.Systrace", "endSection: %s", list.remove(list.size() - 1));
        }
    }

    /* renamed from: c */
    public static String m96910c(Context context, String str) {
        String packageName = context.getPackageName();
        return str.startsWith(packageName) ? str.substring(packageName.length()) : str;
    }
}
