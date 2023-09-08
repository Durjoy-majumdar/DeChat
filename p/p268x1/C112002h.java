package p268x1;

import android.os.Build;
import android.text.StaticLayout;
import gy3.C87412m;

/* renamed from: x1.h */
public final class C112002h implements C112005l {
    /* renamed from: a */
    public StaticLayout mo163665a(C112007n nVar) {
        C87412m.m108594g(nVar, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(nVar.f335274a, nVar.f335275b, nVar.f335276c, nVar.f335277d, nVar.f335278e);
        obtain.setTextDirection(nVar.f335279f);
        obtain.setAlignment(nVar.f335280g);
        obtain.setMaxLines(nVar.f335281h);
        obtain.setEllipsize(nVar.f335282i);
        obtain.setEllipsizedWidth(nVar.f335283j);
        obtain.setLineSpacing(nVar.f335285l, nVar.f335284k);
        obtain.setIncludePad(nVar.f335287n);
        obtain.setBreakStrategy(nVar.f335289p);
        obtain.setHyphenationFrequency(nVar.f335290q);
        obtain.setIndents(nVar.f335291r, nVar.f335292s);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            C102533i.f301894a.mo142147a(obtain, nVar.f335286m);
        }
        if (i >= 28) {
            C112003j.f335270a.mo163666a(obtain, nVar.f335288o);
        }
        StaticLayout build = obtain.build();
        C87412m.m108593f(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
