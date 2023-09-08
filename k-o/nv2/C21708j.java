package nv2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import pv2.C22023p;
import pv2.C22024q;
import xt3.C53448e;

/* renamed from: nv2.j */
public abstract class C21708j {

    /* renamed from: a */
    public C22023p f61429a;

    /* renamed from: b */
    public C22024q f61430b;

    /* renamed from: c */
    public WeakReference<Activity> f61431c;

    /* renamed from: d */
    public Handler f61432d;

    /* renamed from: e */
    public C53448e f61433e = null;

    /* renamed from: f */
    public C53448e f61434f = null;

    /* renamed from: g */
    public int f61435g = -1;

    /* renamed from: h */
    public C21709a f61436h = null;

    /* renamed from: nv2.j$a */
    public interface C21709a {
    }

    public C21708j(WeakReference<Activity> weakReference, C22023p pVar, C22024q qVar, Handler handler) {
        this.f61429a = pVar;
        this.f61430b = qVar;
        this.f61431c = weakReference;
        this.f61432d = handler;
    }

    /* renamed from: a */
    public void mo33976a() {
        Handler handler = this.f61432d;
        if (handler != null) {
            handler.obtainMessage(5).sendToTarget();
        } else {
            Log.m105920e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        }
    }

    /* renamed from: b */
    public void mo33977b() {
        if (this.f61432d != null) {
            mo33976a();
            this.f61432d.obtainMessage(2, this.f61430b).sendToTarget();
            return;
        }
        Log.m105920e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }

    /* renamed from: c */
    public abstract void mo33961c(Bundle bundle);

    /* renamed from: d */
    public abstract void mo33962d(Bundle bundle);

    /* renamed from: e */
    public abstract void mo33963e(int i, String[] strArr, int[] iArr);

    /* renamed from: f */
    public void mo33978f(String[] strArr, int i) {
        Handler handler = this.f61432d;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(3);
            Bundle bundle = new Bundle();
            bundle.putStringArray("permissions", strArr);
            bundle.putInt("request_code", i);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
            return;
        }
        Log.m105920e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
}
