package p852fk;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import p871zj.C66836c;

/* renamed from: fk.a */
public class C59109a {

    /* renamed from: a */
    public static final /* synthetic */ int f169072a = 0;

    static {
        new AtomicInteger(1);
    }

    /* renamed from: a */
    public static Context m69050a() {
        Context context = C66836c.f191967a;
        if (context != null) {
            return context;
        }
        throw new RuntimeException("Danmaku not init, please call DanmakuConfig.init()");
    }
}
