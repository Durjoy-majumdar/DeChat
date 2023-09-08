package p333e8;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: e8.z */
public final class C86467z {
    /* renamed from: a */
    public static String m107142a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (str.equals(xmlPullParser.getAttributeName(i))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
