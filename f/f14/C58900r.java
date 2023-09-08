package f14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;

/* renamed from: f14.r */
public final /* synthetic */ class C58900r {
    /* renamed from: a */
    public static /* synthetic */ Iterator m68762a() {
        try {
            return Arrays.asList(new C58899q[]{new AndroidDispatcherFactory()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
