package kr0;

import com.tencent.magicar.MagicAR;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;

public class b$$j implements C83174m.C83175a {

    /* renamed from: d */
    public final /* synthetic */ C88256b f255087d;

    public b$$j(C88256b bVar) {
        this.f255087d = bVar;
    }

    public void onDestroy() {
        MagicAR magicAR = this.f255087d.f255072B;
        if (magicAR != null) {
            magicAR.destroy();
        }
        this.f255087d.f255072B = null;
    }
}
