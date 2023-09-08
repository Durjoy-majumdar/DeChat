package fg2;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import p196ln.C10579k;
import p199lw.C10657b;
import vd3.C78407r;

/* renamed from: fg2.c */
public final class C75749c extends C78407r implements C10579k.C10580a {

    /* renamed from: fg2.c$a */
    public static final class C75750a {

        /* renamed from: a */
        public static final C75750a f222350a = new C75750a();

        /* renamed from: b */
        public static C78407r.C78409b f222351b = ((C78407r.C78409b) C86312j.m106911c(C10657b.class));

        /* renamed from: a */
        public final void mo106066a(ImageView imageView, String str) {
            C87412m.m108594g(imageView, "iv");
            C87412m.m108594g(str, "tag");
            Drawable drawable = imageView.getDrawable();
            C75749c cVar = (drawable == null || !(drawable instanceof C75749c)) ? new C75749c(str, (C8480h) null) : (C75749c) drawable;
            cVar.mo108360a(str);
            imageView.setImageDrawable(cVar);
        }
    }

    public C75749c(String str, C8480h hVar) {
        super(C75750a.f222351b, str);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        C87412m.m108594g(str, "tag");
        super.mo1428X(str);
    }
}
