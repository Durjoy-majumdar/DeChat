package p363n2;

/* renamed from: n2.d */
public class C21588d extends C21586b {
    public C21588d(C21587c cVar) {
        super(cVar);
    }

    /* renamed from: e */
    public void mo33833e(C21593h hVar) {
        int i = hVar.f61153c;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f61129c.mo33825f(hVar, f);
        hVar.f61159i--;
    }
}
