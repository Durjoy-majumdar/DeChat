package a14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* renamed from: a14.j0 */
public final /* synthetic */ class C53905j0 {
    /* renamed from: a */
    public static /* synthetic */ Iterator m60481a() {
        try {
            return Arrays.asList(new C53901i0[]{new AndroidExceptionPreHandler()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
