package p1048uk;

import gy3.C87412m;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p490dl.C97484a;

/* renamed from: uk.b */
public final class C102048b extends C97484a {

    /* renamed from: b */
    public int f300527b;

    /* renamed from: c */
    public final ArrayList<C102049a> f300528c = new ArrayList<>();

    /* renamed from: uk.b$a */
    public static final class C102049a extends C97484a {

        /* renamed from: b */
        public String f300529b = "";

        /* renamed from: c */
        public String f300530c = "";

        /* renamed from: d */
        public C102050b f300531d;

        /* renamed from: b */
        public void mo125836b(String str, XmlPullParser xmlPullParser) {
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(xmlPullParser, "parser");
            int hashCode = str.hashCode();
            if (hashCode != -2092800739) {
                if (hashCode != -796017875) {
                    if (hashCode == 106079 && str.equals("key")) {
                        this.f300529b = mo136753f(xmlPullParser);
                        return;
                    }
                } else if (str.equals("animFile")) {
                    this.f300530c = mo136753f(xmlPullParser);
                    return;
                }
            } else if (str.equals("screenEffect")) {
                C102050b bVar = new C102050b();
                bVar.mo125838a(xmlPullParser);
                this.f300531d = bVar;
                return;
            }
            mo136754g(xmlPullParser);
        }
    }

    /* renamed from: uk.b$b */
    public static final class C102050b extends C97484a {

        /* renamed from: b */
        public int f300532b;

        /* renamed from: c */
        public int f300533c;

        /* renamed from: b */
        public void mo125836b(String str, XmlPullParser xmlPullParser) {
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(xmlPullParser, "parser");
            int hashCode = str.hashCode();
            if (hashCode != -1086372345) {
                if (hashCode != -1017208180) {
                    if (hashCode == 95467907 && str.equals("delay")) {
                        this.f300532b = mo136752e(xmlPullParser);
                        return;
                    }
                } else if (str.equals("effectId")) {
                    mo136753f(xmlPullParser);
                    return;
                }
            } else if (str.equals("effectVersion")) {
                this.f300533c = mo136752e(xmlPullParser);
                return;
            }
            mo136754g(xmlPullParser);
        }
    }

    /* renamed from: a */
    public void mo125838a(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        this.f300528c.clear();
        super.mo125838a(xmlPullParser);
    }

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        int hashCode = str.hashCode();
        if (hashCode != 3242771) {
            if (hashCode != 96632902) {
                if (hashCode == 1660947809 && str.equals("emojiAnimVersion")) {
                    this.f300527b = mo136752e(xmlPullParser);
                    return;
                }
            } else if (str.equals("emoji")) {
                return;
            }
        } else if (str.equals("item")) {
            C102049a aVar = new C102049a();
            aVar.mo125838a(xmlPullParser);
            this.f300528c.add(aVar);
            return;
        }
        mo136754g(xmlPullParser);
    }
}
