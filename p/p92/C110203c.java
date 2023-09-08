package p92;

import com.tencent.p014mm.sdk.platformtools.Log;
import l92.C109298e;

/* renamed from: p92.c */
public final class C110203c implements C109298e {

    /* renamed from: a */
    public final /* synthetic */ C110204d f329684a;

    public C110203c(C110204d dVar) {
        this.f329684a = dVar;
    }

    public void onOrientationChange(int i) {
        C110204d dVar = this.f329684a;
        dVar.getClass();
        Log.m105925i("MicroMsg.FloatBallContainer", "whenOrientationChange new:%d, last:%d", Integer.valueOf(i), Integer.valueOf(dVar.f329687c));
        if (dVar.f329687c != i) {
            dVar.f329687c = i;
        }
    }
}
