package ac3;

import androidx.exifinterface.media.ExifInterface;
import gy3.C87412m;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import p490dl.C97484a;
import qr3.C110470e;

/* renamed from: ac3.t0 */
public final class C91996t0 extends C97484a {

    /* renamed from: b */
    public int f263354b;

    /* renamed from: c */
    public int f263355c;

    /* renamed from: d */
    public final LinkedList<C91995s0> f263356d = new LinkedList<>();

    /* renamed from: a */
    public void mo125838a(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        this.f263356d.clear();
        super.mo125838a(xmlPullParser);
    }

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        switch (str.hashCode()) {
            case -6913209:
                if (str.equals("ModelList")) {
                    return;
                }
                break;
            case 74517257:
                if (str.equals(ExifInterface.TAG_MODEL)) {
                    C91995s0 s0Var = new C91995s0();
                    s0Var.mo125838a(xmlPullParser);
                    this.f263356d.add(s0Var);
                    return;
                }
                break;
            case 632394518:
                if (str.equals("ConfigVersion")) {
                    this.f263355c = mo136752e(xmlPullParser);
                    return;
                }
                break;
            case 2099446622:
                if (str.equals("SDKVersion")) {
                    this.f263354b = mo136752e(xmlPullParser);
                    return;
                }
                break;
        }
        mo136754g(xmlPullParser);
    }

    /* renamed from: h */
    public final boolean mo125839h() {
        int i = this.f263354b;
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        return i == C110470e.f330363a;
    }
}
