package kn0;

import android.net.Uri;
import android.os.Handler;
import in0.d$$e;
import ln0.C88593a;
import ym0.C91509g;
import zt3.C119157j;

/* renamed from: kn0.o */
public class C88240o extends C21365k {

    /* renamed from: kn0.o$a */
    public class C88241a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f255065d;

        /* renamed from: e */
        public final /* synthetic */ String f255066e;

        /* renamed from: f */
        public final /* synthetic */ d$$e f255067f;

        public C88241a(String str, String str2, d$$e d__e) {
            this.f255065d = str;
            this.f255066e = str2;
            this.f255067f = d__e;
        }

        public void run() {
            C88240o.super.mo22580m(this.f255065d, this.f255066e, this.f255067f);
        }
    }

    public C88240o(Handler handler) {
        super(handler);
    }

    /* renamed from: I */
    public int mo33462I(Uri uri) {
        return C88233g.f255048a.mo122581a(C88593a.f255857e, uri);
    }

    /* renamed from: L */
    public C91509g mo33465L() {
        return C88593a.f255857e;
    }

    /* renamed from: m */
    public void mo22580m(String str, String str2, d$$e d__e) {
        ((C119157j) C119157j.f356862d).mo183875f(new C88241a(str, str2, d__e));
    }
}
