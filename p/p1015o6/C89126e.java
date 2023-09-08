package p1015o6;

import com.github.henryye.nativeiv.C80186a;
import java.util.concurrent.ThreadFactory;

/* renamed from: o6.e */
public class C89126e implements ThreadFactory {
    public C89126e(C80186a aVar) {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "native_image_decode_local");
    }
}
