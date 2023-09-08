package li0;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statemachine.StateMachine;

/* renamed from: li0.l */
public abstract class C88541l extends StateMachine {
    public C88541l(String str, Looper looper) {
        super(str, looper);
    }

    public void logd(String str) {
        Log.m105918d(getName(), str);
    }

    public void loge(String str) {
        Log.m105920e(getName(), str);
    }

    public void logi(String str) {
        Log.m105924i(getName(), str);
    }

    public void logv(String str) {
        Log.m105926v(getName(), str);
    }

    public void logw(String str) {
        Log.m105928w(getName(), str);
    }

    public void loge(String str, Throwable th) {
        Log.printErrStackTrace(getName(), th, str, new Object[0]);
    }
}
