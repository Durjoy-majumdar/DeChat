package qg2;

import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import ob0.C47355o;

/* renamed from: qg2.q */
public class C77336q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77335p f225491d;

    public C77336q(C77335p pVar) {
        this.f225491d = pVar;
    }

    public void run() {
        C77335p pVar = this.f225491d;
        C47355o oVar = pVar.f225465f;
        if (oVar != null) {
            C72683d dVar = pVar.f225466g;
            oVar.mo26221m((int) dVar.field_offset, (int) dVar.field_totalLen, pVar);
        }
    }
}
