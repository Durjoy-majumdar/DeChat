package l43;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: l43.c */
public class C109267c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109255b f327139d;

    public C109267c(C109255b bVar) {
        this.f327139d = bVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.voipcs.VoipCSViewManager", "dismiss button");
        if (!this.f327139d.f327107d.isFinishing()) {
            this.f327139d.f327109f.setVisibility(8);
            this.f327139d.f327110g.setVisibility(8);
            this.f327139d.f327111h.setVisibility(8);
            this.f327139d.mo160490h(8);
            this.f327139d.mo160491i(false);
        }
    }
}
