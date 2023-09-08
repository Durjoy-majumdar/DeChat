package p300c8;

import android.content.Context;
import p300c8.C79946g;

/* renamed from: c8.o */
public final class C79952o implements C79946g.C79947a {

    /* renamed from: a */
    public final Context f234196a;

    /* renamed from: b */
    public final C79967x<? super C79946g> f234197b;

    /* renamed from: c */
    public final C79946g.C79947a f234198c;

    public C79952o(Context context, C79967x<? super C79946g> xVar, C79946g.C79947a aVar) {
        this.f234196a = context.getApplicationContext();
        this.f234197b = xVar;
        this.f234198c = aVar;
    }

    public C79946g createDataSource() {
        return new C79951n(this.f234196a, this.f234197b, this.f234198c.createDataSource());
    }
}
