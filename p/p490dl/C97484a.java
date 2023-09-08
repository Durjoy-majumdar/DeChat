package p490dl;

import gy3.C8480h;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: dl.a */
public class C97484a {

    /* renamed from: a */
    public static final C97485a f286123a = new C97485a((C8480h) null);

    /* renamed from: dl.a$a */
    public static final class C97485a {
        public C97485a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo136755a(java.lang.String r5, p490dl.C97484a r6) {
            /*
                r4 = this;
                java.lang.String r0 = "filePath"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.String r0 = "xmlContent"
                gy3.C87412m.m108594g(r6, r0)
                r0 = 0
                r1 = 0
                java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106423E(r5)     // Catch:{ Exception -> 0x0037 }
                org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
                java.lang.String r3 = "newPullParser()"
                gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
                java.lang.String r3 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
                r2.setFeature(r3, r0)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
                r2.setInput(r5, r1)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
                r2.nextTag()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
                r6.mo125838a(r2)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
                if (r5 == 0) goto L_0x0047
                r5.close()
                goto L_0x0047
            L_0x002f:
                r6 = move-exception
                r1 = r5
                goto L_0x0048
            L_0x0032:
                r6 = move-exception
                r1 = r5
                goto L_0x0038
            L_0x0035:
                r6 = move-exception
                goto L_0x0048
            L_0x0037:
                r6 = move-exception
            L_0x0038:
                java.lang.String r5 = "MicroMsg.BaseXmlContent"
                java.lang.String r2 = "safeParse error"
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0035 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r6, r2, r0)     // Catch:{ all -> 0x0035 }
                if (r1 == 0) goto L_0x0047
                r1.close()
            L_0x0047:
                return
            L_0x0048:
                if (r1 == 0) goto L_0x004d
                r1.close()
            L_0x004d:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p490dl.C97484a.C97485a.mo136755a(java.lang.String, dl.a):void");
        }
    }

    /* renamed from: a */
    public void mo125838a(XmlPullParser xmlPullParser) {
        String name;
        C87412m.m108594g(xmlPullParser, "parser");
        while (xmlPullParser.next() != 3 && xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getEventType() == 2 && (name = xmlPullParser.getName()) != null) {
                mo125836b(name, xmlPullParser);
            }
        }
    }

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        throw null;
    }

    /* renamed from: c */
    public final int mo136750c(XmlPullParser xmlPullParser, String str) {
        C87412m.m108594g(xmlPullParser, "parser");
        C87412m.m108594g(str, "name");
        String d = mo136751d(xmlPullParser, str);
        if (d.length() == 0) {
            return 0;
        }
        return Integer.parseInt(d);
    }

    /* renamed from: d */
    public final String mo136751d(XmlPullParser xmlPullParser, String str) {
        C87412m.m108594g(xmlPullParser, "parser");
        C87412m.m108594g(str, "name");
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? "" : attributeValue;
    }

    /* renamed from: e */
    public final int mo136752e(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        String f = mo136753f(xmlPullParser);
        if (f.length() == 0) {
            return 0;
        }
        return Integer.parseInt(f);
    }

    /* renamed from: f */
    public final String mo136753f(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        if (xmlPullParser.next() != 4) {
            return "";
        }
        String text = xmlPullParser.getText();
        C87412m.m108593f(text, "parser.text");
        xmlPullParser.nextTag();
        return text;
    }

    /* renamed from: g */
    public final void mo136754g(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }
}
