package wt3;

import ot3.C21885g;

/* renamed from: wt3.c */
public class C22927c {

    /* renamed from: a */
    public int f65902a;

    /* renamed from: b */
    public String f65903b;

    /* renamed from: c */
    public boolean f65904c;

    /* renamed from: d */
    public boolean f65905d;

    /* renamed from: e */
    public C22925a f65906e;

    /* renamed from: f */
    public boolean f65907f = false;

    public C22927c(int i, String str, boolean z, boolean z2, C22925a aVar, C22926b bVar) {
        this.f65902a = i;
        this.f65903b = str;
        this.f65904c = z;
        this.f65905d = z2;
        this.f65906e = aVar;
    }

    /* renamed from: a */
    public static void m26937a(C22927c cVar, C21885g gVar) {
        C22925a aVar = cVar.f65906e;
        if (aVar != null && !cVar.f65907f) {
            if (gVar == null) {
                aVar.mo36099a(-1, "unknown");
            } else if (gVar.mo34909a()) {
                cVar.f65906e.onSuccess();
            } else {
                cVar.f65906e.mo36099a(gVar.f61886a, gVar.f61887b);
            }
        }
        cVar.f65907f = true;
    }
}
