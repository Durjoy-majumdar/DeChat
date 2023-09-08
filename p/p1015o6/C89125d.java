package p1015o6;

import com.github.henryye.nativeiv.C80186a;
import java.util.concurrent.ThreadFactory;

/* renamed from: o6.d */
public class C89125d implements ThreadFactory {
    public C89125d(C80186a aVar) {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "native_image_decode_net");
    }
}
