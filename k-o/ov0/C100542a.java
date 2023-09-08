package ov0;

import ov0.C100544c;

/* renamed from: ov0.a */
public class C100542a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f294583d;

    /* renamed from: e */
    public final /* synthetic */ Object f294584e;

    /* renamed from: f */
    public final /* synthetic */ C100544c f294585f;

    public C100542a(C100544c cVar, int i, Object obj) {
        this.f294585f = cVar;
        this.f294583d = i;
        this.f294584e = obj;
    }

    public void run() {
        C100544c cVar = this.f294585f;
        cVar.f294587a.add(new C100544c.C100545a(cVar, this.f294583d, this.f294584e));
    }
}
