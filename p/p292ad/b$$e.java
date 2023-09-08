package p292ad;

import org.json.JSONObject;

/* renamed from: ad.b$$e */
public final /* synthetic */ class b$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233118d;

    public /* synthetic */ b$$e(C79502b bVar) {
        this.f233118d = bVar;
    }

    public final void run() {
        C79502b bVar = this.f233118d;
        C79501a aVar = bVar.f233097h;
        if (aVar != null) {
            bVar.mo109518x("stop", aVar.mo33727m("stop", (JSONObject) null));
            bVar.f233097h.mo14921a();
        }
    }
}
