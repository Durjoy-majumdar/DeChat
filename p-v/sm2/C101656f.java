package sm2;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.StringReader;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: sm2.f */
public final class C101656f {

    /* renamed from: a */
    public final String f297571a;

    /* renamed from: b */
    public final C13601g f297572b = C36568h.m40985a(new C101662f(this));

    /* renamed from: c */
    public final C13601g f297573c = C36568h.m40985a(C101661e.f297585d);

    /* renamed from: d */
    public final C13601g f297574d = C36568h.m40985a(C101659c.f297583d);

    /* renamed from: e */
    public final C13601g f297575e = C36568h.m40985a(C101660d.f297584d);

    /* renamed from: sm2.f$a */
    public enum C101657a {
        HitPath,
        ParseEnd
    }

    /* renamed from: sm2.f$b */
    public enum C101658b {
        Start,
        Text,
        End
    }

    /* renamed from: sm2.f$c */
    public static final class C101659c extends C87413o implements C32224a<HashMap<String, Integer>> {

        /* renamed from: d */
        public static final C101659c f297583d = new C101659c();

        public C101659c() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: sm2.f$d */
    public static final class C101660d extends C87413o implements C32224a<StringBuffer> {

        /* renamed from: d */
        public static final C101660d f297584d = new C101660d();

        public C101660d() {
            super(0);
        }

        public Object invoke() {
            return new StringBuffer();
        }
    }

    /* renamed from: sm2.f$e */
    public static final class C101661e extends C87413o implements C32224a<HashMap<String, String>> {

        /* renamed from: d */
        public static final C101661e f297585d = new C101661e();

        public C101661e() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: sm2.f$f */
    public static final class C101662f extends C87413o implements C32224a<XmlPullParser> {

        /* renamed from: d */
        public final /* synthetic */ C101656f f297586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101662f(C101656f fVar) {
            super(0);
            this.f297586d = fVar;
        }

        public Object invoke() {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(this.f297586d.f297571a));
            return newPullParser;
        }
    }

    public C101656f(String str) {
        C87412m.m108594g(str, "xml");
        this.f297571a = str;
    }

    /* renamed from: a */
    public final StringBuffer mo141122a() {
        return (StringBuffer) ((C36570n) this.f297575e).getValue();
    }

    /* renamed from: b */
    public final HashMap<String, String> mo141123b() {
        return (HashMap) ((C36570n) this.f297573c).getValue();
    }

    /* renamed from: c */
    public final XmlPullParser mo141124c() {
        return (XmlPullParser) ((C36570n) this.f297572b).getValue();
    }

    /* renamed from: d */
    public final C101657a mo141125d(String str, C101658b bVar) {
        StringBuffer stringBuffer;
        C101658b bVar2 = C101658b.Text;
        C101657a aVar = C101657a.HitPath;
        C87412m.m108594g(str, "path");
        C87412m.m108594g(bVar, "parseType");
        int eventType = mo141124c().getEventType();
        C101657a aVar2 = C101657a.ParseEnd;
        while (true) {
            boolean z = true;
            if (eventType == 1) {
                break;
            }
            int next = mo141124c().next();
            int i = 0;
            if (next == 2) {
                StringBuffer a = mo141122a();
                a.append(".");
                a.append(mo141124c().getName());
                String stringBuffer2 = mo141122a().toString();
                C87412m.m108593f(stringBuffer2, "currentPathSB.toString()");
                Integer num = (Integer) ((HashMap) ((C36570n) this.f297574d).getValue()).get(stringBuffer2);
                if (num == null) {
                    stringBuffer = null;
                } else {
                    int intValue = num.intValue() + 1;
                    ((HashMap) ((C36570n) this.f297574d).getValue()).put(stringBuffer2, Integer.valueOf(intValue));
                    StringBuffer a2 = mo141122a();
                    a2.append(intValue);
                    stringBuffer = a2;
                }
                if (stringBuffer == null) {
                    Integer num2 = (Integer) ((HashMap) ((C36570n) this.f297574d).getValue()).put(stringBuffer2, 0);
                }
                String stringBuffer3 = mo141122a().toString();
                C87412m.m108593f(stringBuffer3, "currentPathSB.toString()");
                mo141123b().put(stringBuffer3, "");
                if (C87412m.m108589b(stringBuffer3, str) && bVar == C101658b.Start) {
                    return aVar;
                }
                int attributeCount = mo141124c().getAttributeCount();
                boolean z2 = false;
                while (i < attributeCount) {
                    int i2 = i + 1;
                    String str2 = stringBuffer3 + ".$" + mo141124c().getAttributeName(i);
                    HashMap<String, String> b = mo141123b();
                    String attributeValue = mo141124c().getAttributeValue(i);
                    C87412m.m108593f(attributeValue, "xmlParser.getAttributeValue(index)");
                    b.put(str2, attributeValue);
                    if (C87412m.m108589b(str2, str)) {
                        i = i2;
                        z2 = true;
                    } else {
                        i = i2;
                    }
                }
                if (z2 && bVar == bVar2) {
                    return aVar;
                }
            } else if (next == 3) {
                mo141122a().delete(mo141122a().lastIndexOf("."), mo141122a().length());
                if (mo141122a().length() != 0) {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else if (next != 4) {
                continue;
            } else {
                String stringBuffer4 = mo141122a().toString();
                C87412m.m108593f(stringBuffer4, "currentPathSB.toString()");
                String text = mo141124c().getText();
                HashMap<String, String> b2 = mo141123b();
                C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
                b2.put(stringBuffer4, text);
                if (C87412m.m108589b(stringBuffer4, str) && bVar == bVar2) {
                    return aVar;
                }
            }
        }
        return aVar2;
    }
}
