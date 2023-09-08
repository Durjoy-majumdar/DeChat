package wl0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import p225rc.C89916g;
import p225rc.g$$e;

/* renamed from: wl0.f */
public class C91026f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ComponentName f261150d;

    /* renamed from: e */
    public final /* synthetic */ C91028g f261151e;

    /* renamed from: wl0.f$a */
    public class C91027a implements g$$e {
        public C91027a(C91026f fVar) {
        }

        /* renamed from: a */
        public void mo1626a(int i, Intent intent) {
            C91028g.f261152l.getClass();
            Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo back from REQUEST_SET_DEFAULT_NFC_APPLICATION");
        }
    }

    public C91026f(C91028g gVar, ComponentName componentName) {
        this.f261151e = gVar;
        this.f261150d = componentName;
    }

    public void run() {
        this.f261151e.f261156d = true;
        Intent intent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
        intent.putExtra("category", "payment");
        intent.putExtra("component", this.f261150d);
        Activity activity = this.f261151e.f261159g;
        if (activity == null || intent.resolveActivity(activity.getPackageManager()) == null) {
            Log.m105920e("MicroMsg.HCEActivityMgr", "alvinluo reuquestSetDefaultNFCApplication can not find activity");
            C91028g gVar = this.f261151e;
            Activity activity2 = gVar.f261159g;
            if (activity2 != null) {
                gVar.mo125081f(13004, "not set default NFC application", activity2.getString(C0966R.string.gks));
                return;
            }
            return;
        }
        C89916g.m112446a(this.f261151e.f261159g).mo124236j(intent, new C91027a(this));
    }
}
