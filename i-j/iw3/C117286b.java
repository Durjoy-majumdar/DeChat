package iw3;

import android.app.Activity;
import jw3.C117367a;
import rv3.C118245h;

/* renamed from: iw3.b */
public class C117286b extends C117367a {

    /* renamed from: d */
    public final /* synthetic */ Activity f351149d;

    /* renamed from: e */
    public final /* synthetic */ C117367a f351150e;

    public C117286b(C117281a aVar, Activity activity, C117367a aVar2) {
        this.f351149d = activity;
        this.f351150e = aVar2;
    }

    /* renamed from: a */
    public void mo181966a(Activity activity, String str) {
        if (activity != null && activity == this.f351149d) {
            C118245h.m166799a("TuringTouch", "[method: onTryMonitor ] " + activity + ", stateName : " + str);
            C117367a aVar = this.f351150e;
            if (aVar != null) {
                aVar.mo181966a(activity, str);
            }
        }
    }
}
