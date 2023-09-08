package af3;

import android.os.SystemClock;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p988jj.C87968a;

public final /* synthetic */ class d$a$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ Object f233169d;

    /* renamed from: e */
    public final /* synthetic */ Object[] f233170e;

    public /* synthetic */ d$a$$a(Object obj, Object[] objArr) {
        this.f233169d = obj;
        this.f233170e = objArr;
    }

    public final Object call() {
        Object obj = this.f233169d;
        Object[] objArr = this.f233170e;
        Log.m105924i("MicroMsg.RecoveryInspector", "working");
        Method[] declaredMethods = BaseGmsClient.class.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            Class<Set>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2 && parameterTypes[0] == IAccountAccessor.class && parameterTypes[1] == Set.class) {
                Log.m105924i("MicroMsg.RecoveryInspector", "delegate");
                long uptimeMillis = SystemClock.uptimeMillis();
                try {
                    method.invoke(obj, objArr);
                } catch (Throwable th) {
                    Log.m105928w("MicroMsg.RecoveryInspector", "invoke err: " + th.getMessage());
                }
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                Log.m105924i("MicroMsg.RecoveryInspector", "cost: " + uptimeMillis2);
                if (uptimeMillis2 > 60000) {
                    C87968a.C87969a.C87970a.m109467a("GmsLagging", (Throwable) null, (Map<String, Object>) null, String.valueOf(C79523d.f233167a), "lagging");
                }
            } else {
                i++;
            }
        }
        return null;
    }
}
