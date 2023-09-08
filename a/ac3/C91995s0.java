package ac3;

import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import p490dl.C97484a;

/* renamed from: ac3.s0 */
public final class C91995s0 extends C97484a {

    /* renamed from: b */
    public String f263347b = "";

    /* renamed from: c */
    public int f263348c = -1;

    /* renamed from: d */
    public int f263349d = -1;

    /* renamed from: e */
    public String f263350e = "";

    /* renamed from: f */
    public String f263351f = "";

    /* renamed from: g */
    public int f263352g = -1;

    /* renamed from: h */
    public String f263353h = "";

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        switch (str.hashCode()) {
            case -1074324778:
                if (str.equals("CompatVersion")) {
                    this.f263349d = mo136752e(xmlPullParser);
                    return;
                }
                break;
            case -203867782:
                if (str.equals("SubType")) {
                    this.f263348c = mo136752e(xmlPullParser);
                    return;
                }
                break;
            case 75327:
                if (str.equals("Key")) {
                    this.f263347b = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 2420395:
                if (str.equals("Name")) {
                    this.f263350e = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 2575653:
                if (str.equals("Sha1")) {
                    this.f263351f = mo136753f(xmlPullParser);
                    return;
                }
                break;
        }
        mo136754g(xmlPullParser);
    }

    /* renamed from: h */
    public final String mo125837h() {
        return this.f263347b + ".xml";
    }
}
