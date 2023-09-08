package p292ad;

import android.view.Surface;
import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import hm0.C87553a;
import hm0.C87556c;
import hm0.C87560g;
import hm0.C87562h;
import jo0.C88003e;
import ko0.C88245b;
import ko0.C88246c;
import p1066yc.C91406f;

/* renamed from: ad.p */
public final class C79516p extends C91406f<C88003e, TextureImageViewLikeImpl> {

    /* renamed from: c */
    public static C87562h.C87563a<C88003e, TextureImageViewLikeImpl> f233158c = new C79517a();

    /* renamed from: d */
    public static C87556c f233159d = new C79518b();

    /* renamed from: b */
    public final C87560g f233160b;

    /* renamed from: ad.p$a */
    public class C79517a implements C87562h.C87563a<C88003e, TextureImageViewLikeImpl> {
        /* renamed from: a */
        public C87562h mo109562a(C87560g gVar) {
            C88003e eVar = (C88003e) gVar;
            C79501a aVar = eVar.f254610a.f233097h;
            if (aVar != null) {
                aVar.setSurface((Surface) null);
            }
            return new C79514o(this, eVar);
        }
    }

    /* renamed from: ad.p$b */
    public class C79518b implements C87556c {
        /* renamed from: a */
        public C87553a mo109563a(int i) {
            C88246c cVar = new C88246c();
            cVar.mo115164n("livePlayerId", Integer.valueOf(i));
            return cVar;
        }

        /* renamed from: b */
        public C87553a mo109564b(int i) {
            C88245b bVar = new C88245b();
            bVar.mo115164n("livePlayerId", Integer.valueOf(i));
            return bVar;
        }
    }

    public C79516p(C79502b bVar) {
        super(bVar);
        this.f233160b = new C88003e(bVar);
    }

    /* renamed from: a */
    public C87562h.C87563a mo109559a() {
        return f233158c;
    }

    /* renamed from: b */
    public C87560g mo109560b() {
        return this.f233160b;
    }

    /* renamed from: c */
    public C87556c mo109561c() {
        return f233159d;
    }
}
