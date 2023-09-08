package p301cd;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p830xc.C91165a;
import p918s2.C90111a;
import p960ed.C86505e;
import wq0.C91085v;

/* renamed from: cd.q$$p */
public class q$$p implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ Activity f234373d;

    /* renamed from: e */
    public final /* synthetic */ C91165a f234374e;

    /* renamed from: f */
    public final /* synthetic */ C80005q f234375f;

    /* renamed from: cd.q$$p$a */
    public class C80006a implements Runnable {
        public C80006a() {
        }

        public void run() {
            q$$p q__p = q$$p.this;
            C80005q qVar = q__p.f234375f;
            Activity activity = q__p.f234373d;
            C91165a aVar = q__p.f234374e;
            C86505e.C86506a aVar2 = C80005q.f234309P;
            qVar.mo110225u(activity, aVar);
        }
    }

    public q$$p(C80005q qVar, Activity activity, C91165a aVar) {
        this.f234375f = qVar;
        this.f234373d = activity;
        this.f234374e = aVar;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m105925i(this.f234375f.mo110227w(), "onRequestPermissionsResult callback, requestCode:%d", Integer.valueOf(i));
        if (i == 117) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                Log.m105924i(this.f234375f.mo110227w(), "onRequestPermissionsResult callback, camera permission not grant");
                Log.m105924i(this.f234375f.mo110227w(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
                this.f234375f.mo110229y(this.f234374e);
            } else {
                MMHandlerThread.postToMainThreadDelayed(new C80006a(), 50);
            }
        }
        C91085v.m114267b(this.f234374e.getAppId(), this);
    }
}
