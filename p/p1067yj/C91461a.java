package p1067yj;

import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Proxy;

/* renamed from: yj.a */
public class C91461a {
    /* renamed from: a */
    public static WindowManager m114761a(WindowManager windowManager) {
        WindowManager windowManager2 = (WindowManager) Proxy.newProxyInstance(windowManager.getClass().getClassLoader(), windowManager.getClass().getInterfaces(), new C91462b(windowManager));
        Log.m105924i("MicroMsg.SafeWindowManager", "proxy");
        return windowManager2;
    }
}
