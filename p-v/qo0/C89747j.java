package qo0;

import com.tencent.p014mm.C0966R;
import qo0.C89741g;

/* renamed from: qo0.j */
public final class C89747j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89741g.C89742a.C89744b f258085d;

    /* renamed from: e */
    public final /* synthetic */ C89741g f258086e;

    /* renamed from: f */
    public final /* synthetic */ C89741g.C89742a f258087f;

    public C89747j(C89741g.C89742a.C89744b bVar, C89741g gVar, C89741g.C89742a aVar) {
        this.f258085d = bVar;
        this.f258086e = gVar;
        this.f258087f = aVar;
    }

    public final void run() {
        this.f258085d.f258076A.setVisibility(8);
        this.f258085d.f258077z.setText(C89741g.m112202a(this.f258086e) ? this.f258087f.mo124039G4(C0966R.string.f7918aq) : this.f258086e.f258052e.f258033d.isEmpty() ? this.f258087f.mo124039G4(C0966R.string.f7916ao) : this.f258087f.mo124039G4(C0966R.string.f7915an));
    }
}
