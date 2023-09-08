package bu0;

/* renamed from: bu0.b */
public class C79818b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79819c f233938d;

    public C79818b(C79819c cVar) {
        this.f233938d = cVar;
    }

    public void run() {
        for (int i = 0; i < this.f233938d.f233945i.size(); i++) {
            C79819c cVar = this.f233938d;
            cVar.mo110004g(cVar.f233941e.getChildAt(i), this.f233938d.f233945i.get(i));
        }
    }
}
