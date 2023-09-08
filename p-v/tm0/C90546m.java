package tm0;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Method;
import java.util.List;
import tm0.C90538k;

/* renamed from: tm0.m */
public class C90546m extends PhoneStateListener {

    /* renamed from: a */
    public final /* synthetic */ C90538k.C90542d f260174a;

    public C90546m(C90538k.C90542d dVar) {
        this.f260174a = dVar;
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        int i;
        super.onSignalStrengthsChanged(signalStrength);
        C90538k kVar = C90538k.this;
        if (!kVar.f260146g.getAndSet(true)) {
            try {
                kVar.f260147h = SignalStrength.class.getMethod("getDbm", new Class[0]);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.JsApiGetNetworkType", "getGetDbmMethod, reflect getDbm fail since " + e);
                kVar.f260147h = null;
            }
        }
        Method method = kVar.f260147h;
        if (method == null) {
            i = kVar.mo124675w(signalStrength);
        } else {
            try {
                i = ((Integer) method.invoke(signalStrength, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.m105928w("MicroMsg.JsApiGetNetworkType", "getDbm, reflect getDbm fail since " + e2);
                i = kVar.mo124675w(signalStrength);
            }
        }
        Log.m105924i("MicroMsg.JsApiGetNetworkType", "onSignalStrengthsChanged, dbm: " + i);
        C90538k.this.f260148i = i;
        synchronized (this.f260174a) {
            C90538k.C90542d dVar = this.f260174a;
            if (!dVar.f260161b) {
                dVar.f260161b = true;
                List<C90538k.C90541c> list = dVar.f260162c;
                if (list != null) {
                    for (C90538k.C90541c a : list) {
                        a.mo124677a(i);
                    }
                    this.f260174a.f260162c.clear();
                    this.f260174a.f260162c = null;
                }
            }
        }
    }
}
