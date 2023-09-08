package tm0;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import tm0.C90538k;

/* renamed from: tm0.l */
public class C37212l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82381f f98501d;

    /* renamed from: e */
    public final /* synthetic */ C90538k f98502e;

    public C37212l(C90538k kVar, C82381f fVar) {
        this.f98502e = kVar;
        this.f98501d = fVar;
    }

    public void run() {
        PhoneStateListener phoneStateListener;
        TelephonyManager telephonyManager = (TelephonyManager) this.f98501d.getContext().getApplicationContext().getSystemService("phone");
        C90538k.C90542d dVar = this.f98502e.f260150n;
        synchronized (dVar) {
            if (dVar.f260160a == null) {
                dVar.f260160a = new C90546m(dVar);
            }
            phoneStateListener = dVar.f260160a;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(256);
        aVar.mo10233c(phoneStateListener);
        C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkType$3", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiGetNetworkType$3", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
    }
}
