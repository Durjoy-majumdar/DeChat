package f02;

import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import g02.C98064a;
import gy3.C87413o;
import java.util.Iterator;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: f02.k */
public final class C31816k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C31816k f84885d = new C31816k();

    public C31816k() {
        super(0);
    }

    public Object invoke() {
        Log.m105924i("HandOffService", "onAppForeground");
        C31790e.f84859n = true;
        try {
            if (C98064a.m126668a() == -1) {
                Log.m105924i("HandOffService", "onAppForeground, has no float window permission, try remove all float windows: " + C31790e.f84855g.size());
                Iterator<Map.Entry<String, HandOff>> it = C31790e.f84855g.entrySet().iterator();
                while (it.hasNext()) {
                    if (((HandOff) it.next().getValue()).getHandOffType() == 2) {
                        it.remove();
                    }
                }
                Log.m105924i("HandOffService", "onAppForeground, try remove all float windows done: " + C31790e.f84855g.size());
            }
        } catch (Exception e) {
            Log.m105920e("HandOffService", "onAppForeground, remove float window fail: " + e.getLocalizedMessage());
        }
        Log.m105924i("HandOffService", "onAppForeground, send alllist");
        if (!C31790e.f84858j.f80325f) {
            Log.m105924i("HandOffService", "webwx is offline, do not sync!");
        }
        return C13598b0.f38549a;
    }
}
