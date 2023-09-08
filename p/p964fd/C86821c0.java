package p964fd;

import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import hm0.C87553a;
import hm0.C87556c;
import hm0.C87560g;
import hm0.C87562h;
import p1066yc.C91406f;
import po0.C89427n;
import ro0.C90067a;
import ro0.C90068b;

/* renamed from: fd.c0 */
public class C86821c0 extends C91406f<C89427n, TextureImageViewLikeImpl> {

    /* renamed from: c */
    public static C87562h.C87563a<C89427n, TextureImageViewLikeImpl> f251981c = new C86822a();

    /* renamed from: d */
    public static C87556c f251982d = new C86823b();

    /* renamed from: b */
    public final C87560g f251983b;

    /* renamed from: fd.c0$a */
    public class C86822a implements C87562h.C87563a<C89427n, TextureImageViewLikeImpl> {
        /* renamed from: a */
        public C87562h mo109562a(C87560g gVar) {
            return new C86818b0(this, (C89427n) gVar);
        }
    }

    /* renamed from: fd.c0$b */
    public class C86823b implements C87556c {
        /* renamed from: a */
        public C87553a mo109563a(int i) {
            C90068b bVar = new C90068b();
            bVar.mo115164n("videoPlayerId", Integer.valueOf(i));
            return bVar;
        }

        /* renamed from: b */
        public C87553a mo109564b(int i) {
            C90067a aVar = new C90067a();
            aVar.mo115164n("videoPlayerId", Integer.valueOf(i));
            return aVar;
        }
    }

    public C86821c0(C86826e eVar) {
        super(eVar);
        this.f251983b = new C89427n(eVar);
    }

    /* renamed from: a */
    public C87562h.C87563a mo109559a() {
        return f251981c;
    }

    /* renamed from: b */
    public C87560g mo109560b() {
        return this.f251983b;
    }

    /* renamed from: c */
    public C87556c mo109561c() {
        return f251982d;
    }
}
