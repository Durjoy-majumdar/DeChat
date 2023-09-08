package e02;

import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import z04.C112550d0;

/* renamed from: e02.a */
public class C97561a {
    /* renamed from: a */
    public void mo136827a(XmlPullParser xmlPullParser) {
        String name;
        C87412m.m108594g(xmlPullParser, "parser");
        while (xmlPullParser.next() != 3 && xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getEventType() == 2 && (name = xmlPullParser.getName()) != null) {
                mo136828b(name, xmlPullParser);
            }
        }
    }

    /* renamed from: b */
    public void mo136828b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
    }

    /* renamed from: c */
    public final int mo136829c(XmlPullParser xmlPullParser, String str) {
        C87412m.m108594g(xmlPullParser, "parser");
        C87412m.m108594g(str, "name");
        String e = mo136831e(xmlPullParser, str);
        if (e.length() == 0) {
            return 0;
        }
        return Integer.parseInt(e);
    }

    /* renamed from: d */
    public final long mo136830d(XmlPullParser xmlPullParser, String str) {
        C87412m.m108594g(xmlPullParser, "parser");
        C87412m.m108594g(str, "name");
        String e = mo136831e(xmlPullParser, str);
        if (e.length() == 0) {
            return 0;
        }
        return Long.parseLong(e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r2 = z04.C112550d0.m153799i0(r2).toString();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo136831e(org.xmlpull.v1.XmlPullParser r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "parser"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "name"
            gy3.C87412m.m108594g(r3, r0)
            r0 = 0
            java.lang.String r2 = r2.getAttributeValue(r0, r3)
            if (r2 == 0) goto L_0x001d
            java.lang.CharSequence r2 = z04.C112550d0.m153799i0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x001f
        L_0x001d:
            java.lang.String r2 = ""
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e02.C97561a.mo136831e(org.xmlpull.v1.XmlPullParser, java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public final String mo136832f(XmlPullParser xmlPullParser) {
        String str;
        C87412m.m108594g(xmlPullParser, "parser");
        if (xmlPullParser.next() == 4) {
            str = xmlPullParser.getText();
            C87412m.m108593f(str, "parser.text");
            xmlPullParser.nextTag();
        } else {
            str = "";
        }
        return C112550d0.m153799i0(str).toString();
    }
}
