package p301cd;

import android.view.Surface;
import android.view.View;
import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import gy3.C87412m;
import hm0.C87553a;
import hm0.C87556c;
import hm0.C87560g;
import hm0.C87562h;
import mo0.C88787b;
import mo0.C88788c;
import p1066yc.C91406f;

/* renamed from: cd.p */
public final class C80002p extends C91406f<C80000o, TextureImageViewLikeImpl> {

    /* renamed from: c */
    public static final C80003a f234306c = new C80003a();

    /* renamed from: b */
    public final C80000o f234307b;

    /* renamed from: cd.p$a */
    public static final class C80003a implements C87556c {
        /* renamed from: a */
        public C87553a mo109563a(int i) {
            C88788c cVar = new C88788c();
            cVar.mo115164n("livePusherId", Integer.valueOf(i));
            return cVar;
        }

        /* renamed from: b */
        public C87553a mo109564b(int i) {
            C88787b bVar = new C88787b();
            bVar.mo115164n("livePusherId", Integer.valueOf(i));
            return bVar;
        }
    }

    /* renamed from: cd.p$b */
    public static final class C80004b<OriginVideoContainer extends C87560g, PipVideoContainer extends View> implements C87562h.C87563a {

        /* renamed from: a */
        public static final C80004b<OriginVideoContainer, PipVideoContainer> f234308a = new C80004b<>();

        /* renamed from: a */
        public C87562h mo109562a(C87560g gVar) {
            C80000o oVar = (C80000o) gVar;
            C87412m.m108594g(oVar, "videoContainer");
            oVar.mo110203o((Surface) null);
            return new C79996a0(oVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80002p(C80005q qVar) {
        super(qVar);
        C87412m.m108594g(qVar, "pluginHandler");
        this.f234307b = new C80000o(qVar);
    }

    /* renamed from: a */
    public C87562h.C87563a<C80000o, TextureImageViewLikeImpl> mo109559a() {
        return C80004b.f234308a;
    }

    /* renamed from: b */
    public C87560g mo109560b() {
        return this.f234307b;
    }

    /* renamed from: c */
    public C87556c mo109561c() {
        return f234306c;
    }
}
