package p301cd;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p830xc.C91165a;
import p918s2.C90111a;
import p960ed.C86505e;
import wq0.C91085v;

/* renamed from: cd.q$$q */
public class q$$q implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ Activity f234377d;

    /* renamed from: e */
    public final /* synthetic */ C91165a f234378e;

    /* renamed from: f */
    public final /* synthetic */ C80005q f234379f;

    /* renamed from: cd.q$$q$a */
    public class C80007a implements Runnable {
        public C80007a() {
        }

        public void run() {
            q$$q q__q = q$$q.this;
            C80005q qVar = q__q.f234379f;
            Activity activity = q__q.f234377d;
            C91165a aVar = q__q.f234378e;
            C86505e.C86506a aVar2 = C80005q.f234309P;
            qVar.mo110225u(activity, aVar);
        }
    }

    public q$$q(C80005q qVar, Activity activity, C91165a aVar) {
        this.f234379f = qVar;
        this.f234377d = activity;
        this.f234378e = aVar;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m105925i(this.f234379f.mo110227w(), "onRequestPermissionsResult callback, requestCode:%d", Integer.valueOf(i));
        if (i == 118) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                Log.m105924i(this.f234379f.mo110227w(), "onRequestPermissionsResult callback, microphone permission not grant");
                Log.m105924i(this.f234379f.mo110227w(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
                this.f234379f.mo110229y(this.f234378e);
            } else {
                MMHandlerThread.postToMainThreadDelayed(new C80007a(), 50);
            }
        }
        C91085v.m114267b(this.f234378e.getAppId(), this);
    }
}
