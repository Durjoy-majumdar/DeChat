package p1156t;

import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* renamed from: t.a */
public class C110829a implements C110831c {
    /* renamed from: a */
    public final C110832d mo162408a(C110830b bVar) {
        return (C110832d) ((CardView.C103575a) bVar).f305892a;
    }

    /* renamed from: b */
    public void mo162409b(C110830b bVar, float f) {
        C110832d a = mo162408a(bVar);
        CardView.C103575a aVar = (CardView.C103575a) bVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (!(f == a.f331573e && a.f331574f == useCompatPadding && a.f331575g == preventCornerOverlap)) {
            a.f331573e = f;
            a.f331574f = useCompatPadding;
            a.f331575g = preventCornerOverlap;
            a.mo162413c((Rect) null);
            a.invalidateSelf();
        }
        mo162410c(aVar);
    }

    /* renamed from: c */
    public void mo162410c(C110830b bVar) {
        float f;
        CardView.C103575a aVar = (CardView.C103575a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.mo144565a(0, 0, 0, 0);
            return;
        }
        float f2 = mo162408a(aVar).f331573e;
        float f3 = mo162408a(aVar).f331569a;
        if (CardView.this.getPreventCornerOverlap()) {
            f = (float) (((double) f2) + ((1.0d - C110833e.f331580a) * ((double) f3)));
        } else {
            int i = C110833e.f331581b;
            f = f2;
        }
        int ceil = (int) Math.ceil((double) f);
        int ceil2 = (int) Math.ceil((double) C110833e.m151026a(f2, f3, CardView.this.getPreventCornerOverlap()));
        aVar.mo144565a(ceil, ceil2, ceil, ceil2);
    }
}
