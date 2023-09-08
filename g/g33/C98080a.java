package g33;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: g33.a */
public final class C98080a {

    /* renamed from: a */
    public static final C98080a f287548a = new C98080a();

    /* renamed from: b */
    public static final List<String> f287549b = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    public final synchronized void mo137372a(String str) {
        Log.m105924i("MicroMsg.RemuxBackgroundManager", "removeRunningWorkInList >> " + str);
        if (str != null) {
            f287549b.remove(str);
        }
    }
}
