package p364n4;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* renamed from: n4.e */
public class C88902e {

    /* renamed from: n4.e$a */
    public static class C21600a {

        /* renamed from: a */
        public static final C21604h f61174a = new C21604h(C21601b.f61175a.getWebkitToCompatConverter());
    }

    /* renamed from: n4.e$b */
    public static class C21601b {

        /* renamed from: a */
        public static final C21602f f61175a;

        static {
            C21602f fVar;
            try {
                fVar = new C21603g((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, C88902e.m110982a()));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            } catch (ClassNotFoundException unused) {
                fVar = new C21595a();
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            f61175a = fVar;
        }
    }

    /* renamed from: a */
    public static InvocationHandler m110982a() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke((Object) null, new Object[0]).getClass().getClassLoader();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
    }
}
