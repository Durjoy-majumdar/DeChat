package p490dl;

import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import uc0.C111154h;

/* renamed from: dl.k */
public final class C107050k extends C97484a {

    /* renamed from: b */
    public final C111154h f320465b = new C111154h();

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        if (C87412m.m108589b(str, "AppId")) {
            this.f320465b.f332894d = mo136753f(xmlPullParser);
        } else if (C87412m.m108589b(str, "UserName")) {
            this.f320465b.f332895e = mo136753f(xmlPullParser);
        } else {
            mo136754g(xmlPullParser);
        }
    }
}
