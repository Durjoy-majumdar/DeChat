package p300c8;

import android.net.Uri;
import p300c8.C16876u;
import p333e8.C20551y;
import p381s7.C118272d;

/* renamed from: c8.v */
public final class C79964v<T> implements C16876u.C16879c {

    /* renamed from: a */
    public final C79950j f234231a;

    /* renamed from: b */
    public final C79946g f234232b;

    /* renamed from: c */
    public final C79965a<? extends T> f234233c;

    /* renamed from: d */
    public volatile T f234234d;

    /* renamed from: e */
    public volatile boolean f234235e;

    /* renamed from: f */
    public volatile long f234236f;

    /* renamed from: c8.v$a */
    public interface C79965a<T> {
    }

    public C79964v(C79946g gVar, Uri uri, int i, C79965a<? extends T> aVar) {
        this.f234232b = gVar;
        this.f234231a = new C79950j(uri, 1);
        this.f234233c = aVar;
    }

    /* renamed from: a */
    public final void mo17945a() {
        C79949i iVar = new C79949i(this.f234232b, this.f234231a);
        try {
            if (!iVar.f234178g) {
                iVar.f234175d.mo110126b(iVar.f234176e);
                iVar.f234178g = true;
            }
            this.f234234d = ((C118272d) this.f234233c).mo183055b(this.f234232b.getUri(), iVar);
        } finally {
            this.f234236f = iVar.f234180i;
            C20551y.m22315e(iVar);
        }
    }

    /* renamed from: b */
    public final void mo17946b() {
        this.f234235e = true;
    }

    /* renamed from: c */
    public final boolean mo17947c() {
        return this.f234235e;
    }
}
