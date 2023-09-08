package a40;

import a40.C79462a;
import b40.C79667b;
import c40.C79929b;
import f30.C86705b;
import y30.C91370a;

/* renamed from: a40.b */
public class C79465b extends C79462a {

    /* renamed from: b */
    public C79462a f233008b;

    public C79465b(C91370a aVar) {
        this.f233006a = aVar;
        if (aVar.mo125343c().endsWith(".json")) {
            this.f233008b = new C79667b(aVar);
        } else {
            this.f233008b = new C79929b(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo109455a() {
        return this.f233008b.mo109455a();
    }

    /* renamed from: b */
    public boolean mo109456b() {
        return this.f233008b.mo109456b();
    }

    /* renamed from: c */
    public C79462a.C79463a mo109457c(C86705b bVar) {
        return this.f233008b.mo109457c(bVar);
    }

    /* renamed from: d */
    public void mo109458d() {
        this.f233008b.mo109458d();
    }
}
