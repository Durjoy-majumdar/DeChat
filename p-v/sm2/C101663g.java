package sm2;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: sm2.g */
public class C101663g {

    /* renamed from: a */
    public static ThreadLocal<XmlPullParser> f297587a = new ThreadLocal<>();

    /* renamed from: sm2.g$a */
    public static class C101664a {

        /* renamed from: a */
        public XmlPullParser f297588a;

        /* renamed from: b */
        public StringBuilder f297589b = new StringBuilder();

        /* renamed from: c */
        public Map<String, String> f297590c;

        /* renamed from: d */
        public Map<Integer, Integer> f297591d;

        public C101664a(String str) {
            XmlPullParser xmlPullParser = C101663g.f297587a.get();
            this.f297588a = xmlPullParser;
            if (xmlPullParser == null) {
                ThreadLocal<XmlPullParser> threadLocal = C101663g.f297587a;
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                this.f297588a = newPullParser;
                threadLocal.set(newPullParser);
            }
            this.f297588a.setInput(new StringReader(str));
            this.f297591d = new HashMap();
            this.f297590c = new HashMap();
        }

        /* renamed from: a */
        public Map<String, String> mo141126a() {
            int eventType = this.f297588a.getEventType();
            while (eventType != 1) {
                eventType = this.f297588a.next();
                if (eventType == 2) {
                    StringBuilder sb = this.f297589b;
                    sb.append('.');
                    sb.append(this.f297588a.getName());
                    String sb4 = this.f297589b.toString();
                    int hashCode = sb4.hashCode();
                    Integer num = (Integer) ((HashMap) this.f297591d).get(Integer.valueOf(hashCode));
                    if (num != null) {
                        Integer valueOf = Integer.valueOf(num.intValue() + 1);
                        this.f297589b.append(valueOf);
                        ((HashMap) this.f297591d).put(Integer.valueOf(hashCode), valueOf);
                        sb4 = sb4 + valueOf;
                    } else {
                        ((HashMap) this.f297591d).put(Integer.valueOf(hashCode), 0);
                    }
                    ((HashMap) this.f297590c).put(sb4, "");
                    for (int i = 0; i < this.f297588a.getAttributeCount(); i++) {
                        ((HashMap) this.f297590c).put(sb4 + ".$" + this.f297588a.getAttributeName(i), this.f297588a.getAttributeValue(i));
                    }
                } else if (eventType == 4) {
                    String text = this.f297588a.getText();
                    if (text != null) {
                        ((HashMap) this.f297590c).put(this.f297589b.toString(), text);
                    }
                } else if (eventType == 3) {
                    StringBuilder sb5 = this.f297589b;
                    StringBuilder delete = sb5.delete(sb5.lastIndexOf("."), this.f297589b.length());
                    this.f297589b = delete;
                    if (delete.length() == 0) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            return this.f297590c;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m133551a(String str, String str2) {
        int i;
        if (str == null) {
            i = -1;
        } else {
            i = str.indexOf("<" + str2);
        }
        if (i < 0) {
            return null;
        }
        if (i > 0) {
            str = str.substring(i);
        }
        try {
            return new C101664a(str).mo141126a();
        } catch (Exception unused) {
            return null;
        }
    }
}
