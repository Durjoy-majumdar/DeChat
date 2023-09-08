package rt3;

import android.content.Context;
import ot3.C21881e;
import tt3.C22552d;
import tt3.C64998b;
import yt3.C112486e;
import yt3.C23319f;
import yt3.C23353r;

/* renamed from: rt3.a */
public class C110655a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f331056d;

    /* renamed from: e */
    public final /* synthetic */ C112486e f331057e;

    /* renamed from: f */
    public final /* synthetic */ C64998b f331058f;

    public C110655a(Context context, C112486e eVar, C64998b bVar) {
        this.f331056d = context;
        this.f331057e = eVar;
        this.f331058f = bVar;
    }

    public void run() {
        C23353r rVar = new C23353r(this.f331056d, this.f331057e);
        rVar.f67031a = this.f331058f;
        if (!C23319f.m27817c().mo36810a(rVar, new C22552d())) {
            C21881e.m25083b("Soter.SoterWrapperApi", "soter: add init task failed.", new Object[0]);
        }
    }
}
