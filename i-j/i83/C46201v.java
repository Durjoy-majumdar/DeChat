package i83;

import android.os.Looper;
import android.webkit.ValueCallback;
import c30.C26827e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import zt3.C119157j;

/* renamed from: i83.v */
public final class C46201v<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C46198u f124542a;

    /* renamed from: b */
    public final /* synthetic */ String f124543b;

    public C46201v(C46198u uVar, String str) {
        this.f124542a = uVar;
        this.f124543b = str;
    }

    public void onReceiveValue(Object obj) {
        try {
            C26827e eVar = new C26827e((String) obj);
            int length = eVar.length();
            String[] strArr = new String[length];
            int i = 0;
            while (i < length) {
                Object obj2 = eVar.get(i);
                if (obj2 != null) {
                    strArr[i] = (String) obj2;
                    i++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            if (length == 0) {
                C46198u uVar = this.f124542a;
                String str = this.f124543b;
                if (uVar.f124537t >= uVar.f124536s) {
                    Log.m105928w("MicroMsg.WebViewTransHelper", "performCyclicTasks finish!");
                } else {
                    new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C46202w(uVar, str), false).startTimer(uVar.f124535r * ((long) (uVar.f124537t + 1)));
                }
            } else {
                C46198u uVar2 = this.f124542a;
                uVar2.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new C46203x(uVar2, strArr));
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebViewTransHelper", e, "", new Object[0]);
        }
    }
}
