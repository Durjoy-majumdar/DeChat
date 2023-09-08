package hl0;

import kr0.C88267e;
import kz1.C88349l;

/* renamed from: hl0.b */
public class C87543b implements C88349l.C88351b {

    /* renamed from: a */
    public final /* synthetic */ C88267e f253607a;

    /* renamed from: b */
    public final /* synthetic */ int f253608b;

    /* renamed from: c */
    public final /* synthetic */ C87544c f253609c;

    public C87543b(C87544c cVar, C88267e eVar, int i) {
        this.f253609c = cVar;
        this.f253607a = eVar;
        this.f253608b = i;
    }

    /* renamed from: a */
    public void mo122010a(int i) {
        if (i == 0) {
            this.f253607a.mo109647a(this.f253608b, this.f253609c.mo115109j("ok"));
        } else {
            this.f253607a.mo109647a(this.f253608b, this.f253609c.mo115109j("fail:user cancel"));
        }
    }
}
