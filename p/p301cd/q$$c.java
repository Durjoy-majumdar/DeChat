package p301cd;

import org.json.JSONObject;

/* renamed from: cd.q$$c */
public final /* synthetic */ class q$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234353d;

    public /* synthetic */ q$$c(C80005q qVar) {
        this.f234353d = qVar;
    }

    public final void run() {
        C80005q qVar = this.f234353d;
        C79999m mVar = qVar.f234327i;
        if (mVar != null) {
            ((C79998d0) mVar).mo21074f("stop", new JSONObject());
            ((C79998d0) qVar.f234327i).mo21071a();
        }
    }
}
