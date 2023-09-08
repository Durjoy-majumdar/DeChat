package lb0;

import android.graphics.Bitmap;
import js0.C88024r;
import lb0.C88394b;

/* renamed from: lb0.d */
public class C88421d implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ String f255431d;

    /* renamed from: e */
    public final /* synthetic */ C88394b.C88410l f255432e;

    /* renamed from: f */
    public final /* synthetic */ C88394b f255433f;

    /* renamed from: lb0.d$a */
    public class C88422a implements Runnable {
        public C88422a() {
        }

        public void run() {
            C88421d dVar = C88421d.this;
            C88394b bVar = dVar.f255433f;
            String str = dVar.f255431d;
            String str2 = C88394b.f255384g;
            byte[] h = bVar.mo122792h(str);
            C88394b.C88410l lVar = C88421d.this.f255432e;
            if (lVar != null) {
                lVar.mo117344a(h);
            }
        }
    }

    public C88421d(C88394b bVar, String str, C88394b.C88410l lVar) {
        this.f255433f = bVar;
        this.f255431d = str;
        this.f255432e = lVar;
    }

    /* renamed from: b */
    public void mo1907b() {
        C88394b.C88410l lVar = this.f255432e;
        if (lVar != null) {
            lVar.mo117344a((byte[]) null);
        }
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return "BytesLoadTarget";
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        C88024r.m109571a().postToWorker(new C88422a());
    }
}
