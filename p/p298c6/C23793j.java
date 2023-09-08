package p298c6;

import android.graphics.Matrix;
import android.util.Xml;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p298c6.C23690b;
import p298c6.C23709e;
import p298c6.C23713g;

/* renamed from: c6.j */
public class C23793j {

    /* renamed from: a */
    public C23713g f68186a = null;

    /* renamed from: b */
    public C23713g.C23747j0 f68187b = null;

    /* renamed from: c */
    public boolean f68188c = false;

    /* renamed from: d */
    public int f68189d;

    /* renamed from: e */
    public boolean f68190e = false;

    /* renamed from: f */
    public C16859h f68191f = null;

    /* renamed from: g */
    public StringBuilder f68192g = null;

    /* renamed from: h */
    public boolean f68193h = false;

    /* renamed from: i */
    public StringBuilder f68194i = null;

    /* renamed from: c6.j$c */
    public static class C16857c {

        /* renamed from: a */
        public static final Map<String, Integer> f45551a;

        static {
            HashMap hashMap = new HashMap(47);
            f45551a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", -16777216);
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", Integer.valueOf(TXLiteAVCode.ERR_AUDIO_PLUGIN_INSTALL_NOT_AUTHORIZED));
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", -65536);
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", -256);
            hashMap.put("yellowgreen", -6632142);
            hashMap.put("transparent", 0);
        }
    }

    /* renamed from: c6.j$g */
    public enum C16858g {
        CLASS,
        points,
        transform,
        UNSUPPORTED;
        

        /* renamed from: h */
        public static final Map<String, C16858g> f45556h = null;

        /* access modifiers changed from: public */
        static {
            f45556h = new HashMap();
            for (C16858g gVar : values()) {
                if (gVar == CLASS) {
                    ((HashMap) f45556h).put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    ((HashMap) f45556h).put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        /* renamed from: a */
        public static C16858g m16505a(String str) {
            C16858g gVar = (C16858g) ((HashMap) f45556h).get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    /* renamed from: c6.j$h */
    public enum C16859h {
        desc,
        SWITCH,
        title,
        UNSUPPORTED;
        

        /* renamed from: h */
        public static final Map<String, C16859h> f45562h = null;

        /* access modifiers changed from: public */
        static {
            f45562h = new HashMap();
            for (C16859h hVar : values()) {
                if (hVar == SWITCH) {
                    ((HashMap) f45562h).put(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, hVar);
                } else if (hVar != UNSUPPORTED) {
                    ((HashMap) f45562h).put(hVar.name(), hVar);
                }
            }
        }
    }

    /* renamed from: c6.j$b */
    public static class C23794b {

        /* renamed from: a */
        public static final Map<String, C23709e.C23710a> f68195a;

        static {
            HashMap hashMap = new HashMap(10);
            f68195a = hashMap;
            hashMap.put("none", C23709e.C23710a.none);
            hashMap.put("xMinYMin", C23709e.C23710a.xMinYMin);
            hashMap.put("xMidYMin", C23709e.C23710a.xMidYMin);
            hashMap.put("xMaxYMin", C23709e.C23710a.xMaxYMin);
            hashMap.put("xMinYMid", C23709e.C23710a.xMinYMid);
            hashMap.put("xMidYMid", C23709e.C23710a.xMidYMid);
            hashMap.put("xMaxYMid", C23709e.C23710a.xMaxYMid);
            hashMap.put("xMinYMax", C23709e.C23710a.xMinYMax);
            hashMap.put("xMidYMax", C23709e.C23710a.xMidYMax);
            hashMap.put("xMaxYMax", C23709e.C23710a.xMaxYMax);
        }
    }

    /* renamed from: c6.j$d */
    public static class C23795d {

        /* renamed from: a */
        public static final Map<String, C23713g.C23758p> f68196a;

        static {
            HashMap hashMap = new HashMap(9);
            f68196a = hashMap;
            C23713g.C23725d1 d1Var = C23713g.C23725d1.pt;
            hashMap.put("xx-small", new C23713g.C23758p(0.694f, d1Var));
            hashMap.put("x-small", new C23713g.C23758p(0.833f, d1Var));
            hashMap.put("small", new C23713g.C23758p(10.0f, d1Var));
            hashMap.put(FirebaseAnalytics.C113379b.MEDIUM, new C23713g.C23758p(12.0f, d1Var));
            hashMap.put("large", new C23713g.C23758p(14.4f, d1Var));
            hashMap.put("x-large", new C23713g.C23758p(17.3f, d1Var));
            hashMap.put("xx-large", new C23713g.C23758p(20.7f, d1Var));
            C23713g.C23725d1 d1Var2 = C23713g.C23725d1.percent;
            hashMap.put("smaller", new C23713g.C23758p(83.33f, d1Var2));
            hashMap.put("larger", new C23713g.C23758p(120.0f, d1Var2));
        }
    }

    /* renamed from: c6.j$f */
    public class C23796f extends DefaultHandler2 {
        public C23796f(C16856a aVar) {
        }

        public void characters(char[] cArr, int i, int i2) {
            C23793j.this.mo37360K(new String(cArr, i, i2));
        }

        public void endDocument() {
            C23793j.this.getClass();
        }

        public void endElement(String str, String str2, String str3) {
            C23793j.this.mo37363c(str, str2, str3);
        }

        public void processingInstruction(String str, String str2) {
            C23793j.this.mo37353C(new C23797i(str2));
            C23793j.this.getClass();
            str.equals("xml-stylesheet");
        }

        public void startDocument() {
            C23793j jVar = C23793j.this;
            jVar.getClass();
            jVar.f68186a = new C23713g();
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            C23793j.this.mo37358I(str, str2, str3, attributes);
        }
    }

    /* renamed from: c6.j$i */
    public static class C23797i {

        /* renamed from: a */
        public String f68198a;

        /* renamed from: b */
        public int f68199b = 0;

        /* renamed from: c */
        public int f68200c = 0;

        /* renamed from: d */
        public C23708d f68201d = new C23708d();

        public C23797i(String str) {
            String trim = str.trim();
            this.f68198a = trim;
            this.f68200c = trim.length();
        }

        /* renamed from: a */
        public int mo37380a() {
            int i = this.f68199b;
            int i2 = this.f68200c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.f68199b = i3;
            if (i3 < i2) {
                return this.f68198a.charAt(i3);
            }
            return -1;
        }

        /* renamed from: b */
        public Boolean mo37381b(Object obj) {
            if (obj == null) {
                return null;
            }
            mo37395p();
            int i = this.f68199b;
            if (i == this.f68200c) {
                return null;
            }
            char charAt = this.f68198a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.f68199b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: c */
        public float mo37382c(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            mo37395p();
            return mo37388i();
        }

        /* renamed from: d */
        public boolean mo37383d(char c) {
            int i = this.f68199b;
            boolean z = i < this.f68200c && this.f68198a.charAt(i) == c;
            if (z) {
                this.f68199b++;
            }
            return z;
        }

        /* renamed from: e */
        public boolean mo37384e(String str) {
            int length = str.length();
            int i = this.f68199b;
            boolean z = i <= this.f68200c - length && this.f68198a.substring(i, i + length).equals(str);
            if (z) {
                this.f68199b += length;
            }
            return z;
        }

        /* renamed from: f */
        public boolean mo37385f() {
            return this.f68199b == this.f68200c;
        }

        /* renamed from: g */
        public boolean mo37386g(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        /* renamed from: h */
        public Integer mo37387h() {
            int i = this.f68199b;
            if (i == this.f68200c) {
                return null;
            }
            String str = this.f68198a;
            this.f68199b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        /* renamed from: i */
        public float mo37388i() {
            float a = this.f68201d.mo37256a(this.f68198a, this.f68199b, this.f68200c);
            if (!Float.isNaN(a)) {
                this.f68199b = this.f68201d.f67910a;
            }
            return a;
        }

        /* renamed from: j */
        public C23713g.C23758p mo37389j() {
            float i = mo37388i();
            if (Float.isNaN(i)) {
                return null;
            }
            C23713g.C23725d1 n = mo37393n();
            return n == null ? new C23713g.C23758p(i, C23713g.C23725d1.px) : new C23713g.C23758p(i, n);
        }

        /* renamed from: k */
        public String mo37390k() {
            if (mo37385f()) {
                return null;
            }
            int i = this.f68199b;
            char charAt = this.f68198a.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int a = mo37380a();
            while (a != -1 && a != charAt) {
                a = mo37380a();
            }
            if (a == -1) {
                this.f68199b = i;
                return null;
            }
            int i2 = this.f68199b + 1;
            this.f68199b = i2;
            return this.f68198a.substring(i + 1, i2 - 1);
        }

        /* renamed from: l */
        public String mo37391l() {
            return mo37392m(' ', false);
        }

        /* renamed from: m */
        public String mo37392m(char c, boolean z) {
            if (mo37385f()) {
                return null;
            }
            char charAt = this.f68198a.charAt(this.f68199b);
            if ((!z && mo37386g(charAt)) || charAt == c) {
                return null;
            }
            int i = this.f68199b;
            int a = mo37380a();
            while (a != -1 && a != c && (z || !mo37386g(a))) {
                a = mo37380a();
            }
            return this.f68198a.substring(i, this.f68199b);
        }

        /* renamed from: n */
        public C23713g.C23725d1 mo37393n() {
            if (mo37385f()) {
                return null;
            }
            if (this.f68198a.charAt(this.f68199b) == '%') {
                this.f68199b++;
                return C23713g.C23725d1.percent;
            }
            int i = this.f68199b;
            if (i > this.f68200c - 2) {
                return null;
            }
            try {
                C23713g.C23725d1 valueOf = C23713g.C23725d1.valueOf(this.f68198a.substring(i, i + 2).toLowerCase(Locale.US));
                this.f68199b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: o */
        public float mo37394o() {
            mo37395p();
            float a = this.f68201d.mo37256a(this.f68198a, this.f68199b, this.f68200c);
            if (!Float.isNaN(a)) {
                this.f68199b = this.f68201d.f67910a;
            }
            return a;
        }

        /* renamed from: p */
        public boolean mo37395p() {
            mo37396q();
            int i = this.f68199b;
            if (i == this.f68200c || this.f68198a.charAt(i) != ',') {
                return false;
            }
            this.f68199b++;
            mo37396q();
            return true;
        }

        /* renamed from: q */
        public void mo37396q() {
            while (true) {
                int i = this.f68199b;
                if (i < this.f68200c && mo37386g(this.f68198a.charAt(i))) {
                    this.f68199b++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c6.j$e */
    public static class C23798e {

        /* renamed from: a */
        public static final Map<String, Integer> f68202a;

        static {
            HashMap hashMap = new HashMap(13);
            f68202a = hashMap;
            hashMap.put("normal", 400);
            hashMap.put("bold", 700);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", 200);
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", 700);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }
    }

    /* renamed from: c6.j$j */
    public class C23799j implements Attributes {

        /* renamed from: a */
        public XmlPullParser f68203a;

        public C23799j(C23793j jVar, XmlPullParser xmlPullParser) {
            this.f68203a = xmlPullParser;
        }

        public int getIndex(String str) {
            return -1;
        }

        public int getIndex(String str, String str2) {
            return -1;
        }

        public int getLength() {
            return this.f68203a.getAttributeCount();
        }

        public String getLocalName(int i) {
            return this.f68203a.getAttributeName(i);
        }

        public String getQName(int i) {
            String attributeName = this.f68203a.getAttributeName(i);
            if (this.f68203a.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.f68203a.getAttributePrefix(i) + XVFSFile.PATH_SEPARATOR_CHAR + attributeName;
        }

        public String getType(int i) {
            return null;
        }

        public String getType(String str) {
            return null;
        }

        public String getType(String str, String str2) {
            return null;
        }

        public String getURI(int i) {
            return this.f68203a.getAttributeNamespace(i);
        }

        public String getValue(int i) {
            return this.f68203a.getAttributeValue(i);
        }

        public String getValue(String str) {
            return null;
        }

        public String getValue(String str, String str2) {
            return null;
        }
    }

    /* renamed from: A */
    public static C23713g.C23757o0 m28545A(String str) {
        if (!str.startsWith("url(")) {
            return m28552q(str);
        }
        int indexOf = str.indexOf(")");
        C23713g.C23757o0 o0Var = null;
        if (indexOf == -1) {
            return new C23713g.C23768u(str.substring(4).trim(), (C23713g.C23757o0) null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            o0Var = m28552q(trim2);
        }
        return new C23713g.C23768u(trim, o0Var);
    }

    /* renamed from: B */
    public static void m28546B(C23713g.C23759p0 p0Var, String str) {
        C23797i iVar = new C23797i(str);
        iVar.mo37396q();
        String l = iVar.mo37391l();
        if ("defer".equals(l)) {
            iVar.mo37396q();
            l = iVar.mo37391l();
        }
        C23709e.C23710a aVar = (C23709e.C23710a) ((HashMap) C23794b.f68195a).get(l);
        C23709e.C23711b bVar = null;
        iVar.mo37396q();
        if (!iVar.mo37385f()) {
            String l2 = iVar.mo37391l();
            l2.getClass();
            if (l2.equals("meet")) {
                bVar = C23709e.C23711b.meet;
            } else if (l2.equals("slice")) {
                bVar = C23709e.C23711b.slice;
            } else {
                throw new C23792i("Invalid preserveAspectRatio definition: " + str);
            }
        }
        p0Var.f68095o = new C23709e(aVar, bVar);
    }

    /* JADX WARNING: type inference failed for: r1v131, types: [java.lang.Object[]] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x027b, code lost:
        if (r2.equals("optimizeQuality") == false) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0497, code lost:
        if (r2.equals("line-through") == false) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04f5, code lost:
        if (r2.equals("middle") == false) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x059d, code lost:
        if (r2.equals("hidden") == false) goto L_0x059f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0691  */
    /* JADX WARNING: Removed duplicated region for block: B:404:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:413:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:427:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m28547H(p298c6.C23713g.C23727e0 r17, java.lang.String r18, java.lang.String r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            c6.g$e0$a r3 = p298c6.C23713g.C23727e0.C23731a.EvenOdd
            c6.g$e0$a r4 = p298c6.C23713g.C23727e0.C23731a.NonZero
            int r5 = r19.length()
            if (r5 != 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.String r5 = "inherit"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x001a
            return
        L_0x001a:
            c6.j$g r5 = p298c6.C23793j.C16858g.m16505a(r18)
            int r5 = r5.ordinal()
            r6 = 5
            java.lang.String r7 = "auto"
            r9 = 1
            if (r5 == r9) goto L_0x063f
            r10 = 2
            if (r5 == r10) goto L_0x0630
            java.lang.String r11 = "evenodd"
            java.lang.String r12 = "nonzero"
            r13 = 4
            if (r5 == r13) goto L_0x0614
            if (r5 == r6) goto L_0x0605
            r6 = 8
            if (r5 == r6) goto L_0x05dd
            r6 = 35
            if (r5 == r6) goto L_0x05cd
            r6 = 40
            if (r5 == r6) goto L_0x05be
            r6 = 42
            java.lang.String r14 = "visible"
            r16 = -1
            r13 = 0
            if (r5 == r6) goto L_0x0571
            r6 = 78
            java.lang.String r15 = "none"
            if (r5 == r6) goto L_0x054b
            r6 = 58
            java.lang.String r8 = "currentColor"
            if (r5 == r6) goto L_0x0528
            r6 = 59
            if (r5 == r6) goto L_0x0516
            r6 = 74
            if (r5 == r6) goto L_0x04c4
            r6 = 75
            if (r5 == r6) goto L_0x045e
            r6 = 124(0x7c, float:1.74E-43)
            switch(r5) {
                case 14: goto L_0x01d2;
                case 15: goto L_0x01c1;
                case 16: goto L_0x01a4;
                case 17: goto L_0x0193;
                case 18: goto L_0x00ce;
                case 19: goto L_0x00bd;
                case 20: goto L_0x009d;
                case 21: goto L_0x0085;
                case 22: goto L_0x0073;
                default: goto L_0x0066;
            }
        L_0x0066:
            switch(r5) {
                case 27: goto L_0x024d;
                case 28: goto L_0x0239;
                case 29: goto L_0x0229;
                case 30: goto L_0x0219;
                case 31: goto L_0x0209;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r1 = "round"
            switch(r5) {
                case 62: goto L_0x03d2;
                case 63: goto L_0x03c2;
                case 64: goto L_0x03b1;
                case 65: goto L_0x033a;
                case 66: goto L_0x032b;
                case 67: goto L_0x02fe;
                case 68: goto L_0x02d1;
                case 69: goto L_0x02be;
                case 70: goto L_0x02ad;
                case 71: goto L_0x029e;
                default: goto L_0x006e;
            }
        L_0x006e:
            switch(r5) {
                case 88: goto L_0x043b;
                case 89: goto L_0x0429;
                case 90: goto L_0x03f3;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0699
        L_0x0073:
            c6.g$e0$b r1 = m28556u(r19)
            r0.f68003x = r1
            if (r1 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 65536(0x10000, double:3.2379E-319)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0085:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = p298c6.C23793j.C23798e.f68202a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0.f68002w = r1
            if (r1 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 32768(0x8000, double:1.61895E-319)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x009d:
            java.util.Map<java.lang.String, c6.g$p> r1 = p298c6.C23793j.C23795d.f68196a     // Catch:{ i -> 0x00af }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ i -> 0x00af }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ i -> 0x00af }
            c6.g$p r1 = (p298c6.C23713g.C23758p) r1     // Catch:{ i -> 0x00af }
            if (r1 != 0) goto L_0x00ad
            c6.g$p r1 = m28558w(r19)     // Catch:{ i -> 0x00af }
        L_0x00ad:
            r8 = r1
            goto L_0x00b0
        L_0x00af:
            r8 = 0
        L_0x00b0:
            r0.f68001v = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 16384(0x4000, double:8.0948E-320)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x00bd:
            java.util.List r1 = m28555t(r19)
            r0.f68000u = r1
            if (r1 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 8192(0x2000, double:4.0474E-320)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L_0x00ea
            goto L_0x0699
        L_0x00ea:
            c6.j$i r1 = new c6.j$i
            r1.<init>(r2)
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x00f2:
            r5 = 47
            java.lang.String r6 = r1.mo37392m(r5, r13)
            r1.mo37396q()
            if (r6 != 0) goto L_0x00ff
            goto L_0x0699
        L_0x00ff:
            if (r2 == 0) goto L_0x0104
            if (r3 == 0) goto L_0x0104
            goto L_0x0131
        L_0x0104:
            java.lang.String r7 = "normal"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x010d
            goto L_0x00f2
        L_0x010d:
            if (r2 != 0) goto L_0x011c
            java.util.Map<java.lang.String, java.lang.Integer> r2 = p298c6.C23793j.C23798e.f68202a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x011c
            goto L_0x00f2
        L_0x011c:
            if (r3 != 0) goto L_0x0125
            c6.g$e0$b r3 = m28556u(r6)
            if (r3 == 0) goto L_0x0125
            goto L_0x00f2
        L_0x0125:
            if (r4 != 0) goto L_0x0131
            java.lang.String r4 = "small-caps"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0131
            r4 = r6
            goto L_0x00f2
        L_0x0131:
            java.util.Map<java.lang.String, c6.g$p> r4 = p298c6.C23793j.C23795d.f68196a     // Catch:{ i -> 0x0142 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ i -> 0x0142 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ i -> 0x0142 }
            c6.g$p r4 = (p298c6.C23713g.C23758p) r4     // Catch:{ i -> 0x0142 }
            if (r4 != 0) goto L_0x0143
            c6.g$p r4 = m28558w(r6)     // Catch:{ i -> 0x0142 }
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            boolean r5 = r1.mo37383d(r5)
            if (r5 == 0) goto L_0x0158
            r1.mo37396q()
            java.lang.String r5 = r1.mo37391l()
            if (r5 == 0) goto L_0x0155
            m28558w(r5)     // Catch:{ i -> 0x0699 }
        L_0x0155:
            r1.mo37396q()
        L_0x0158:
            boolean r5 = r1.mo37385f()
            if (r5 == 0) goto L_0x0160
            r8 = 0
            goto L_0x016c
        L_0x0160:
            int r5 = r1.f68199b
            int r6 = r1.f68200c
            r1.f68199b = r6
            java.lang.String r1 = r1.f68198a
            java.lang.String r8 = r1.substring(r5)
        L_0x016c:
            java.util.List r1 = m28555t(r8)
            r0.f68000u = r1
            r0.f68001v = r4
            if (r2 != 0) goto L_0x0179
            r1 = 400(0x190, float:5.6E-43)
            goto L_0x017d
        L_0x0179:
            int r1 = r2.intValue()
        L_0x017d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f68002w = r1
            if (r3 != 0) goto L_0x0187
            c6.g$e0$b r3 = p298c6.C23713g.C23727e0.C16855b.Normal
        L_0x0187:
            r0.f68003x = r3
            long r1 = r0.f67986d
            r3 = 122880(0x1e000, double:6.0711E-319)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0193:
            java.lang.Float r1 = m28561z(r19)
            r0.f67989g = r1
            if (r1 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 4
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x01a4:
            boolean r1 = r12.equals(r2)
            if (r1 == 0) goto L_0x01ac
            r3 = r4
            goto L_0x01b4
        L_0x01ac:
            boolean r1 = r11.equals(r2)
            if (r1 == 0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r3 = 0
        L_0x01b4:
            r0.f67988f = r3
            if (r3 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 2
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x01c1:
            c6.g$o0 r1 = m28545A(r19)
            r0.f67987e = r1
            if (r1 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 1
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x01d2:
            int r1 = r2.indexOf(r6)
            if (r1 >= 0) goto L_0x0699
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L_0x01f4
            goto L_0x0699
        L_0x01f4:
            boolean r1 = r2.equals(r15)
            r1 = r1 ^ r9
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f67973G = r1
            long r1 = r0.f67986d
            r3 = 16777216(0x1000000, double:8.289046E-317)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0209:
            java.lang.String r1 = m28557v(r2, r1)
            r0.f67972F = r1
            long r1 = r0.f67986d
            r3 = 8388608(0x800000, double:4.144523E-317)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0219:
            java.lang.String r1 = m28557v(r2, r1)
            r0.f67971E = r1
            long r1 = r0.f67986d
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0229:
            java.lang.String r1 = m28557v(r2, r1)
            r0.f67970D = r1
            long r1 = r0.f67986d
            r3 = 2097152(0x200000, double:1.0361308E-317)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0239:
            java.lang.String r1 = m28557v(r2, r1)
            r0.f67970D = r1
            r0.f67971E = r1
            r0.f67972F = r1
            long r1 = r0.f67986d
            r3 = 14680064(0xe00000, double:7.2529153E-317)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x024d:
            int r1 = r19.hashCode()
            r3 = -933002398(0xffffffffc8638362, float:-232973.53)
            if (r1 == r3) goto L_0x0275
            r3 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r3) goto L_0x026c
            r3 = 362741610(0x159eff6a, float:6.4218664E-26)
            if (r1 == r3) goto L_0x0261
            goto L_0x027d
        L_0x0261:
            java.lang.String r1 = "optimizeSpeed"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x026a
            goto L_0x027d
        L_0x026a:
            r13 = 2
            goto L_0x027e
        L_0x026c:
            boolean r1 = r2.equals(r7)
            if (r1 != 0) goto L_0x0273
            goto L_0x027d
        L_0x0273:
            r13 = 1
            goto L_0x027e
        L_0x0275:
            java.lang.String r1 = "optimizeQuality"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x027e
        L_0x027d:
            r13 = -1
        L_0x027e:
            if (r13 == 0) goto L_0x028c
            if (r13 == r9) goto L_0x0289
            if (r13 == r10) goto L_0x0286
            r8 = 0
            goto L_0x028e
        L_0x0286:
            c6.g$e0$e r8 = p298c6.C23713g.C23727e0.C23728e.optimizeSpeed
            goto L_0x028e
        L_0x0289:
            c6.g$e0$e r8 = p298c6.C23713g.C23727e0.C23728e.auto
            goto L_0x028e
        L_0x028c:
            c6.g$e0$e r8 = p298c6.C23713g.C23727e0.C23728e.optimizeQuality
        L_0x028e:
            r0.f67985T = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x029e:
            c6.g$p r1 = m28558w(r19)     // Catch:{ i -> 0x0699 }
            r0.f67992j = r1     // Catch:{ i -> 0x0699 }
            long r1 = r0.f67986d     // Catch:{ i -> 0x0699 }
            r3 = 32
            long r1 = r1 | r3
            r0.f67986d = r1     // Catch:{ i -> 0x0699 }
            goto L_0x0699
        L_0x02ad:
            java.lang.Float r1 = m28561z(r19)
            r0.f67991i = r1
            if (r1 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 16
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x02be:
            float r1 = m28553r(r19)     // Catch:{ i -> 0x0699 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ i -> 0x0699 }
            r0.f67995p = r1     // Catch:{ i -> 0x0699 }
            long r1 = r0.f67986d     // Catch:{ i -> 0x0699 }
            r3 = 256(0x100, double:1.265E-321)
            long r1 = r1 | r3
            r0.f67986d = r1     // Catch:{ i -> 0x0699 }
            goto L_0x0699
        L_0x02d1:
            java.lang.String r3 = "miter"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02dc
            c6.g$e0$d r8 = p298c6.C23713g.C23727e0.C23733d.Miter
            goto L_0x02f1
        L_0x02dc:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02e5
            c6.g$e0$d r8 = p298c6.C23713g.C23727e0.C23733d.Round
            goto L_0x02f1
        L_0x02e5:
            java.lang.String r1 = "bevel"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02f0
            c6.g$e0$d r8 = p298c6.C23713g.C23727e0.C23733d.Bevel
            goto L_0x02f1
        L_0x02f0:
            r8 = 0
        L_0x02f1:
            r0.f67994o = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 128(0x80, double:6.32E-322)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x02fe:
            java.lang.String r3 = "butt"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0309
            c6.g$e0$c r8 = p298c6.C23713g.C23727e0.C23732c.Butt
            goto L_0x031e
        L_0x0309:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0312
            c6.g$e0$c r8 = p298c6.C23713g.C23727e0.C23732c.Round
            goto L_0x031e
        L_0x0312:
            java.lang.String r1 = "square"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x031d
            c6.g$e0$c r8 = p298c6.C23713g.C23727e0.C23732c.Square
            goto L_0x031e
        L_0x031d:
            r8 = 0
        L_0x031e:
            r0.f67993n = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 64
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x032b:
            c6.g$p r1 = m28558w(r19)     // Catch:{ i -> 0x0699 }
            r0.f67997r = r1     // Catch:{ i -> 0x0699 }
            long r1 = r0.f67986d     // Catch:{ i -> 0x0699 }
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 | r3
            r0.f67986d = r1     // Catch:{ i -> 0x0699 }
            goto L_0x0699
        L_0x033a:
            boolean r1 = r15.equals(r2)
            r3 = 512(0x200, double:2.53E-321)
            if (r1 == 0) goto L_0x034c
            r1 = 0
            r0.f67996q = r1
            long r1 = r0.f67986d
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x034c:
            r1 = 0
            c6.j$i r5 = new c6.j$i
            r5.<init>(r2)
            r5.mo37396q()
            boolean r2 = r5.mo37385f()
            if (r2 == 0) goto L_0x035c
            goto L_0x0397
        L_0x035c:
            c6.g$p r2 = r5.mo37389j()
            if (r2 != 0) goto L_0x0363
            goto L_0x0397
        L_0x0363:
            boolean r6 = r2.mo37289f()
            if (r6 == 0) goto L_0x036a
            goto L_0x0397
        L_0x036a:
            float r6 = r2.f68093d
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r2)
        L_0x0374:
            boolean r2 = r5.mo37385f()
            if (r2 != 0) goto L_0x0392
            r5.mo37395p()
            c6.g$p r2 = r5.mo37389j()
            if (r2 != 0) goto L_0x0384
            goto L_0x0397
        L_0x0384:
            boolean r8 = r2.mo37289f()
            if (r8 == 0) goto L_0x038b
            goto L_0x0397
        L_0x038b:
            r7.add(r2)
            float r2 = r2.f68093d
            float r6 = r6 + r2
            goto L_0x0374
        L_0x0392:
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0399
        L_0x0397:
            r8 = r1
            goto L_0x03a6
        L_0x0399:
            int r1 = r7.size()
            c6.g$p[] r1 = new p298c6.C23713g.C23758p[r1]
            java.lang.Object[] r1 = r7.toArray(r1)
            r8 = r1
            c6.g$p[] r8 = (p298c6.C23713g.C23758p[]) r8
        L_0x03a6:
            r0.f67996q = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x03b1:
            c6.g$o0 r1 = m28545A(r19)
            r0.f67990h = r1
            if (r1 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 8
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x03c2:
            java.lang.Float r1 = m28561z(r19)
            r0.f67976J = r1
            long r1 = r0.f67986d
            r3 = 134217728(0x8000000, double:6.63123685E-316)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x03d2:
            boolean r1 = r2.equals(r8)
            if (r1 == 0) goto L_0x03dd
            c6.g$g r1 = p298c6.C23713g.C23740g.f68049d
            r0.f67975I = r1
            goto L_0x03e3
        L_0x03dd:
            c6.g$f r1 = m28551p(r19)     // Catch:{ i -> 0x03ed }
            r0.f67975I = r1     // Catch:{ i -> 0x03ed }
        L_0x03e3:
            long r1 = r0.f67986d
            r3 = 67108864(0x4000000, double:3.31561842E-316)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x03ed:
            r0 = move-exception
            r0.getMessage()
            goto L_0x0699
        L_0x03f3:
            int r1 = r2.indexOf(r6)
            if (r1 >= 0) goto L_0x0699
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "|visible|hidden|collapse|"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L_0x0415
            goto L_0x0699
        L_0x0415:
            boolean r1 = r2.equals(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f67974H = r1
            long r1 = r0.f67986d
            r3 = 33554432(0x2000000, double:1.6578092E-316)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0429:
            java.lang.Float r1 = m28561z(r19)
            r0.f67983R = r1
            long r1 = r0.f67986d
            r3 = 17179869184(0x400000000, double:8.4879831639E-314)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x043b:
            boolean r1 = r2.equals(r8)
            if (r1 == 0) goto L_0x0446
            c6.g$g r1 = p298c6.C23713g.C23740g.f68049d
            r0.f67982Q = r1
            goto L_0x044c
        L_0x0446:
            c6.g$f r1 = m28551p(r19)     // Catch:{ i -> 0x0458 }
            r0.f67982Q = r1     // Catch:{ i -> 0x0458 }
        L_0x044c:
            long r1 = r0.f67986d
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0458:
            r0 = move-exception
            r0.getMessage()
            goto L_0x0699
        L_0x045e:
            r1 = 0
            int r3 = r19.hashCode()
            switch(r3) {
                case -1171789332: goto L_0x0491;
                case -1026963764: goto L_0x0486;
                case 3387192: goto L_0x047d;
                case 93826908: goto L_0x0472;
                case 529818312: goto L_0x0467;
                default: goto L_0x0466;
            }
        L_0x0466:
            goto L_0x0499
        L_0x0467:
            java.lang.String r3 = "overline"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0470
            goto L_0x0499
        L_0x0470:
            r13 = 4
            goto L_0x049a
        L_0x0472:
            java.lang.String r3 = "blink"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x047b
            goto L_0x0499
        L_0x047b:
            r13 = 3
            goto L_0x049a
        L_0x047d:
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x0484
            goto L_0x0499
        L_0x0484:
            r13 = 2
            goto L_0x049a
        L_0x0486:
            java.lang.String r3 = "underline"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x048f
            goto L_0x0499
        L_0x048f:
            r13 = 1
            goto L_0x049a
        L_0x0491:
            java.lang.String r3 = "line-through"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x049a
        L_0x0499:
            r13 = -1
        L_0x049a:
            if (r13 == 0) goto L_0x04b4
            if (r13 == r9) goto L_0x04b1
            if (r13 == r10) goto L_0x04ae
            r2 = 3
            if (r13 == r2) goto L_0x04ab
            r2 = 4
            if (r13 == r2) goto L_0x04a8
            r8 = r1
            goto L_0x04b6
        L_0x04a8:
            c6.g$e0$g r8 = p298c6.C23713g.C23727e0.C23730g.Overline
            goto L_0x04b6
        L_0x04ab:
            c6.g$e0$g r8 = p298c6.C23713g.C23727e0.C23730g.Blink
            goto L_0x04b6
        L_0x04ae:
            c6.g$e0$g r8 = p298c6.C23713g.C23727e0.C23730g.None
            goto L_0x04b6
        L_0x04b1:
            c6.g$e0$g r8 = p298c6.C23713g.C23727e0.C23730g.Underline
            goto L_0x04b6
        L_0x04b4:
            c6.g$e0$g r8 = p298c6.C23713g.C23727e0.C23730g.LineThrough
        L_0x04b6:
            r0.f68004y = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 131072(0x20000, double:6.47582E-319)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x04c4:
            r1 = 0
            int r3 = r19.hashCode()
            r4 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            if (r3 == r4) goto L_0x04ef
            r4 = 100571(0x188db, float:1.4093E-40)
            if (r3 == r4) goto L_0x04e4
            r4 = 109757538(0x68ac462, float:5.219839E-35)
            if (r3 == r4) goto L_0x04d9
            goto L_0x04f7
        L_0x04d9:
            java.lang.String r3 = "start"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x04e2
            goto L_0x04f7
        L_0x04e2:
            r13 = 2
            goto L_0x04f8
        L_0x04e4:
            java.lang.String r3 = "end"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x04ed
            goto L_0x04f7
        L_0x04ed:
            r13 = 1
            goto L_0x04f8
        L_0x04ef:
            java.lang.String r3 = "middle"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x04f8
        L_0x04f7:
            r13 = -1
        L_0x04f8:
            if (r13 == 0) goto L_0x0506
            if (r13 == r9) goto L_0x0503
            if (r13 == r10) goto L_0x0500
            r8 = r1
            goto L_0x0508
        L_0x0500:
            c6.g$e0$f r8 = p298c6.C23713g.C23727e0.C23729f.Start
            goto L_0x0508
        L_0x0503:
            c6.g$e0$f r8 = p298c6.C23713g.C23727e0.C23729f.End
            goto L_0x0508
        L_0x0506:
            c6.g$e0$f r8 = p298c6.C23713g.C23727e0.C23729f.Middle
        L_0x0508:
            r0.f67967A = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 262144(0x40000, double:1.295163E-318)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0516:
            java.lang.Float r1 = m28561z(r19)
            r0.f67981P = r1
            long r1 = r0.f67986d
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0528:
            boolean r1 = r2.equals(r8)
            if (r1 == 0) goto L_0x0533
            c6.g$g r1 = p298c6.C23713g.C23740g.f68049d
            r0.f67980N = r1
            goto L_0x0539
        L_0x0533:
            c6.g$f r1 = m28551p(r19)     // Catch:{ i -> 0x0545 }
            r0.f67980N = r1     // Catch:{ i -> 0x0545 }
        L_0x0539:
            long r1 = r0.f67986d
            r3 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0545:
            r0 = move-exception
            r0.getMessage()
            goto L_0x0699
        L_0x054b:
            r1 = 0
            boolean r3 = r2.equals(r15)
            if (r3 != 0) goto L_0x055f
            java.lang.String r3 = "non-scaling-stroke"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x055c
            r8 = r1
            goto L_0x0561
        L_0x055c:
            c6.g$e0$i r8 = p298c6.C23713g.C23727e0.C23735i.NonScalingStroke
            goto L_0x0561
        L_0x055f:
            c6.g$e0$i r8 = p298c6.C23713g.C23727e0.C23735i.None
        L_0x0561:
            r0.f67984S = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0571:
            r1 = 0
            int r3 = r19.hashCode()
            switch(r3) {
                case -1217487446: goto L_0x0597;
                case -907680051: goto L_0x058c;
                case 3005871: goto L_0x0583;
                case 466743410: goto L_0x057a;
                default: goto L_0x0579;
            }
        L_0x0579:
            goto L_0x059f
        L_0x057a:
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x0581
            goto L_0x059f
        L_0x0581:
            r13 = 3
            goto L_0x05a0
        L_0x0583:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x058a
            goto L_0x059f
        L_0x058a:
            r13 = 2
            goto L_0x05a0
        L_0x058c:
            java.lang.String r3 = "scroll"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0595
            goto L_0x059f
        L_0x0595:
            r13 = 1
            goto L_0x05a0
        L_0x0597:
            java.lang.String r3 = "hidden"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x05a0
        L_0x059f:
            r13 = -1
        L_0x05a0:
            if (r13 == 0) goto L_0x05ae
            if (r13 == r9) goto L_0x05ae
            if (r13 == r10) goto L_0x05ab
            r2 = 3
            if (r13 == r2) goto L_0x05ab
            r8 = r1
            goto L_0x05b0
        L_0x05ab:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            goto L_0x05b0
        L_0x05ae:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L_0x05b0:
            r0.f67968B = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 524288(0x80000, double:2.590327E-318)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x05be:
            java.lang.Float r1 = m28561z(r19)
            r0.f67998s = r1
            long r1 = r0.f67986d
            r3 = 2048(0x800, double:1.0118E-320)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x05cd:
            java.lang.String r1 = m28557v(r2, r1)
            r0.f67979M = r1
            long r1 = r0.f67986d
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x05dd:
            r1 = 0
            java.lang.String r3 = "ltr"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x05f3
            java.lang.String r3 = "rtl"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x05f0
            r8 = r1
            goto L_0x05f5
        L_0x05f0:
            c6.g$e0$h r8 = p298c6.C23713g.C23727e0.C23734h.RTL
            goto L_0x05f5
        L_0x05f3:
            c6.g$e0$h r8 = p298c6.C23713g.C23727e0.C23734h.LTR
        L_0x05f5:
            r0.f68005z = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0605:
            c6.g$f r1 = m28551p(r19)     // Catch:{ i -> 0x0699 }
            r0.f67999t = r1     // Catch:{ i -> 0x0699 }
            long r1 = r0.f67986d     // Catch:{ i -> 0x0699 }
            r3 = 4096(0x1000, double:2.0237E-320)
            long r1 = r1 | r3
            r0.f67986d = r1     // Catch:{ i -> 0x0699 }
            goto L_0x0699
        L_0x0614:
            r1 = 0
            boolean r5 = r12.equals(r2)
            if (r5 == 0) goto L_0x061d
            r3 = r4
            goto L_0x0625
        L_0x061d:
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0624
            goto L_0x0625
        L_0x0624:
            r3 = r1
        L_0x0625:
            r0.f67978L = r3
            long r1 = r0.f67986d
            r3 = 536870912(0x20000000, double:2.652494739E-315)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x0630:
            java.lang.String r1 = m28557v(r2, r1)
            r0.f67977K = r1
            long r1 = r0.f67986d
            r3 = 268435456(0x10000000, double:1.32624737E-315)
            long r1 = r1 | r3
            r0.f67986d = r1
            goto L_0x0699
        L_0x063f:
            r1 = 0
            boolean r3 = r7.equals(r2)
            if (r3 == 0) goto L_0x0647
            goto L_0x0686
        L_0x0647:
            java.lang.String r3 = "rect("
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L_0x0650
            goto L_0x0686
        L_0x0650:
            c6.j$i r3 = new c6.j$i
            java.lang.String r2 = r2.substring(r6)
            r3.<init>(r2)
            r3.mo37396q()
            c6.g$p r2 = m28560y(r3)
            r3.mo37395p()
            c6.g$p r4 = m28560y(r3)
            r3.mo37395p()
            c6.g$p r5 = m28560y(r3)
            r3.mo37395p()
            c6.g$p r6 = m28560y(r3)
            r3.mo37396q()
            r7 = 41
            boolean r7 = r3.mo37383d(r7)
            if (r7 != 0) goto L_0x0688
            boolean r3 = r3.mo37385f()
            if (r3 != 0) goto L_0x0688
        L_0x0686:
            r8 = r1
            goto L_0x068d
        L_0x0688:
            c6.g$c r8 = new c6.g$c
            r8.<init>(r2, r4, r5, r6)
        L_0x068d:
            r0.f67969C = r8
            if (r8 == 0) goto L_0x0699
            long r1 = r0.f67986d
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r1 = r1 | r3
            r0.f67986d = r1
        L_0x0699:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23793j.m28547H(c6.g$e0, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public static int m28548b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* renamed from: d */
    public static int m28549d(float f, float f2, float f3) {
        float f4 = 0.0f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f5 = f % 360.0f;
        if (i < 0) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f15 = (f4 * 2.0f) - f9;
        return m28548b(m28550e(f15, f9, f6 - 2.0f) * 256.0f) | (m28548b(m28550e(f15, f9, f6 + 2.0f) * 256.0f) << 16) | (m28548b(m28550e(f15, f9, f6) * 256.0f) << 8);
    }

    /* renamed from: e */
    public static float m28550e(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else if (f3 < 3.0f) {
            return f2;
        } else {
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    /* renamed from: p */
    public static C23713g.C23737f m28551p(String str) {
        int i;
        long j;
        int i2 = 5;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C23707c cVar = null;
            if (1 < length) {
                long j2 = 0;
                int i3 = 1;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    char charAt = str.charAt(i3);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt < 'A' || charAt > 'F') {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        } else {
                            j = j2 * 16;
                            i = charAt - 'A';
                        }
                        j2 = j + ((long) i) + 10;
                    } else {
                        j2 = (j2 * 16) + ((long) (charAt - '0'));
                    }
                    if (j2 > Util.MAX_32BIT_VALUE) {
                        break;
                    }
                    i3++;
                }
                if (i3 != 1) {
                    cVar = new C23707c(j2, i3);
                }
            }
            if (cVar != null) {
                int i4 = cVar.f67906a;
                if (i4 == 4) {
                    int i5 = (int) cVar.f67907b;
                    int i6 = i5 & 3840;
                    int i7 = i5 & 240;
                    int i8 = i5 & 15;
                    return new C23713g.C23737f(i8 | (i6 << 8) | -16777216 | (i6 << 12) | (i7 << 8) | (i7 << 4) | (i8 << 4));
                } else if (i4 == 5) {
                    int i9 = (int) cVar.f67907b;
                    int i15 = 61440 & i9;
                    int i16 = i9 & 3840;
                    int i17 = i9 & 240;
                    int i18 = i9 & 15;
                    return new C23713g.C23737f((i18 << 24) | (i18 << 28) | (i15 << 8) | (i15 << 4) | (i16 << 4) | i16 | i17 | (i17 >> 4));
                } else if (i4 == 7) {
                    return new C23713g.C23737f(((int) cVar.f67907b) | -16777216);
                } else {
                    if (i4 == 9) {
                        long j3 = cVar.f67907b;
                        return new C23713g.C23737f((((int) j3) >>> 8) | (((int) j3) << 24));
                    }
                    throw new C23792i("Bad hex colour value: " + str);
                }
            } else {
                throw new C23792i("Bad hex colour value: " + str);
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (startsWith || lowerCase.startsWith("rgb(")) {
                if (!startsWith) {
                    i2 = 4;
                }
                C23797i iVar = new C23797i(str.substring(i2));
                iVar.mo37396q();
                float i19 = iVar.mo37388i();
                if (!Float.isNaN(i19) && iVar.mo37383d('%')) {
                    i19 = (i19 * 256.0f) / 100.0f;
                }
                float c = iVar.mo37382c(i19);
                if (!Float.isNaN(c) && iVar.mo37383d('%')) {
                    c = (c * 256.0f) / 100.0f;
                }
                float c2 = iVar.mo37382c(c);
                if (!Float.isNaN(c2) && iVar.mo37383d('%')) {
                    c2 = (c2 * 256.0f) / 100.0f;
                }
                if (startsWith) {
                    float c3 = iVar.mo37382c(c2);
                    iVar.mo37396q();
                    if (!Float.isNaN(c3) && iVar.mo37383d(')')) {
                        return new C23713g.C23737f((m28548b(c3 * 256.0f) << 24) | (m28548b(i19) << 16) | (m28548b(c) << 8) | m28548b(c2));
                    }
                    throw new C23792i("Bad rgba() colour value: " + str);
                }
                iVar.mo37396q();
                if (!Float.isNaN(c2) && iVar.mo37383d(')')) {
                    return new C23713g.C23737f((m28548b(i19) << 16) | -16777216 | (m28548b(c) << 8) | m28548b(c2));
                }
                throw new C23792i("Bad rgb() colour value: " + str);
            }
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (startsWith2 || lowerCase.startsWith("hsl(")) {
                if (!startsWith2) {
                    i2 = 4;
                }
                C23797i iVar2 = new C23797i(str.substring(i2));
                iVar2.mo37396q();
                float i25 = iVar2.mo37388i();
                float c4 = iVar2.mo37382c(i25);
                if (!Float.isNaN(c4)) {
                    iVar2.mo37383d('%');
                }
                float c5 = iVar2.mo37382c(c4);
                if (!Float.isNaN(c5)) {
                    iVar2.mo37383d('%');
                }
                if (startsWith2) {
                    float c6 = iVar2.mo37382c(c5);
                    iVar2.mo37396q();
                    if (!Float.isNaN(c6) && iVar2.mo37383d(')')) {
                        return new C23713g.C23737f((m28548b(c6 * 256.0f) << 24) | m28549d(i25, c4, c5));
                    }
                    throw new C23792i("Bad hsla() colour value: " + str);
                }
                iVar2.mo37396q();
                if (!Float.isNaN(c5) && iVar2.mo37383d(')')) {
                    return new C23713g.C23737f(m28549d(i25, c4, c5) | -16777216);
                }
                throw new C23792i("Bad hsl() colour value: " + str);
            }
            Integer num = (Integer) ((HashMap) C16857c.f45551a).get(lowerCase);
            if (num != null) {
                return new C23713g.C23737f(num.intValue());
            }
            throw new C23792i("Invalid colour keyword: " + lowerCase);
        }
    }

    /* renamed from: q */
    public static C23713g.C23757o0 m28552q(String str) {
        str.getClass();
        if (str.equals("none")) {
            return C23713g.C23737f.f68043f;
        }
        if (str.equals("currentColor")) {
            return C23713g.C23740g.f68049d;
        }
        try {
            return m28551p(str);
        } catch (C23792i unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static float m28553r(String str) {
        int length = str.length();
        if (length != 0) {
            return m28554s(str, 0, length);
        }
        throw new C23792i("Invalid float value (empty string)");
    }

    /* renamed from: s */
    public static float m28554s(String str, int i, int i2) {
        float a = new C23708d().mo37256a(str, i, i2);
        if (!Float.isNaN(a)) {
            return a;
        }
        throw new C23792i("Invalid float value: " + str);
    }

    /* renamed from: t */
    public static List<String> m28555t(String str) {
        C23797i iVar = new C23797i(str);
        ArrayList arrayList = null;
        do {
            String k = iVar.mo37390k();
            if (k == null) {
                k = iVar.mo37392m(',', true);
            }
            if (k == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(k);
            iVar.mo37395p();
        } while (!iVar.mo37385f());
        return arrayList;
    }

    /* renamed from: u */
    public static C23713g.C23727e0.C16855b m28556u(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    c = 0;
                    break;
                }
                break;
            case -1178781136:
                if (str.equals("italic")) {
                    c = 1;
                    break;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C23713g.C23727e0.C16855b.Oblique;
            case 1:
                return C23713g.C23727e0.C16855b.Italic;
            case 2:
                return C23713g.C23727e0.C16855b.Normal;
            default:
                return null;
        }
    }

    /* renamed from: v */
    public static String m28557v(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    /* renamed from: w */
    public static C23713g.C23758p m28558w(String str) {
        if (str.length() != 0) {
            int length = str.length();
            C23713g.C23725d1 d1Var = C23713g.C23725d1.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                d1Var = C23713g.C23725d1.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    d1Var = C23713g.C23725d1.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new C23792i("Invalid length unit specifier: " + str);
                }
            }
            try {
                return new C23713g.C23758p(m28554s(str, 0, length), d1Var);
            } catch (NumberFormatException e) {
                throw new C23792i("Invalid length value: " + str, e);
            }
        } else {
            throw new C23792i("Invalid length value (empty string)");
        }
    }

    /* renamed from: x */
    public static List<C23713g.C23758p> m28559x(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            C23797i iVar = new C23797i(str);
            iVar.mo37396q();
            while (!iVar.mo37385f()) {
                float i = iVar.mo37388i();
                if (Float.isNaN(i)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid length list value: ");
                    int i2 = iVar.f68199b;
                    while (!iVar.mo37385f() && !iVar.mo37386g(iVar.f68198a.charAt(iVar.f68199b))) {
                        iVar.f68199b++;
                    }
                    String substring = iVar.f68198a.substring(i2, iVar.f68199b);
                    iVar.f68199b = i2;
                    sb.append(substring);
                    throw new C23792i(sb.toString());
                }
                C23713g.C23725d1 n = iVar.mo37393n();
                if (n == null) {
                    n = C23713g.C23725d1.px;
                }
                arrayList.add(new C23713g.C23758p(i, n));
                iVar.mo37395p();
            }
            return arrayList;
        }
        throw new C23792i("Invalid length list (empty string)");
    }

    /* renamed from: y */
    public static C23713g.C23758p m28560y(C23797i iVar) {
        return iVar.mo37384e("auto") ? new C23713g.C23758p(0.0f) : iVar.mo37389j();
    }

    /* renamed from: z */
    public static Float m28561z(String str) {
        try {
            float r = m28553r(str);
            if (r < 0.0f) {
                r = 0.0f;
            } else if (r > 1.0f) {
                r = 1.0f;
            }
            return Float.valueOf(r);
        } catch (C23792i unused) {
            return null;
        }
    }

    /* renamed from: C */
    public final Map<String, String> mo37353C(C23797i iVar) {
        HashMap hashMap = new HashMap();
        iVar.mo37396q();
        String m = iVar.mo37392m('=', false);
        while (m != null) {
            iVar.mo37383d('=');
            hashMap.put(m, iVar.mo37390k());
            iVar.mo37396q();
            m = iVar.mo37392m('=', false);
        }
        return hashMap;
    }

    /* renamed from: D */
    public final Matrix mo37354D(String str) {
        String str2 = str;
        Matrix matrix = new Matrix();
        C23797i iVar = new C23797i(str2);
        iVar.mo37396q();
        while (!iVar.mo37385f()) {
            String str3 = null;
            if (!iVar.mo37385f()) {
                int i = iVar.f68199b;
                int charAt = iVar.f68198a.charAt(i);
                while (true) {
                    if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                        int i2 = iVar.f68199b;
                    } else {
                        charAt = iVar.mo37380a();
                    }
                }
                int i25 = iVar.f68199b;
                while (iVar.mo37386g(charAt)) {
                    charAt = iVar.mo37380a();
                }
                if (charAt == 40) {
                    iVar.f68199b++;
                    str3 = iVar.f68198a.substring(i, i25);
                } else {
                    iVar.f68199b = i;
                }
            }
            if (str3 != null) {
                char c = 65535;
                switch (str3.hashCode()) {
                    case -1081239615:
                        if (str3.equals("matrix")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (str3.equals(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 109250890:
                        if (str3.equals("scale")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (str3.equals("skewX")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109493391:
                        if (str3.equals("skewY")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (str3.equals("translate")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        iVar.mo37396q();
                        float i3 = iVar.mo37388i();
                        iVar.mo37395p();
                        float i4 = iVar.mo37388i();
                        iVar.mo37395p();
                        float i5 = iVar.mo37388i();
                        iVar.mo37395p();
                        float i6 = iVar.mo37388i();
                        iVar.mo37395p();
                        float i7 = iVar.mo37388i();
                        iVar.mo37395p();
                        float i8 = iVar.mo37388i();
                        iVar.mo37396q();
                        if (!Float.isNaN(i8) && iVar.mo37383d(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{i3, i5, i7, i4, i6, i8, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                            break;
                        } else {
                            throw new C23792i("Invalid transform list: " + str2);
                        }
                        break;
                    case 1:
                        iVar.mo37396q();
                        float i9 = iVar.mo37388i();
                        float o = iVar.mo37394o();
                        float o2 = iVar.mo37394o();
                        iVar.mo37396q();
                        if (Float.isNaN(i9) || !iVar.mo37383d(')')) {
                            throw new C23792i("Invalid transform list: " + str2);
                        } else if (Float.isNaN(o)) {
                            matrix.preRotate(i9);
                            break;
                        } else if (!Float.isNaN(o2)) {
                            matrix.preRotate(i9, o, o2);
                            break;
                        } else {
                            throw new C23792i("Invalid transform list: " + str2);
                        }
                    case 2:
                        iVar.mo37396q();
                        float i15 = iVar.mo37388i();
                        float o3 = iVar.mo37394o();
                        iVar.mo37396q();
                        if (!Float.isNaN(i15) && iVar.mo37383d(')')) {
                            if (!Float.isNaN(o3)) {
                                matrix.preScale(i15, o3);
                                break;
                            } else {
                                matrix.preScale(i15, i15);
                                break;
                            }
                        } else {
                            throw new C23792i("Invalid transform list: " + str2);
                        }
                        break;
                    case 3:
                        iVar.mo37396q();
                        float i16 = iVar.mo37388i();
                        iVar.mo37396q();
                        if (!Float.isNaN(i16) && iVar.mo37383d(')')) {
                            matrix.preSkew((float) Math.tan(Math.toRadians((double) i16)), 0.0f);
                            break;
                        } else {
                            throw new C23792i("Invalid transform list: " + str2);
                        }
                        break;
                    case 4:
                        iVar.mo37396q();
                        float i17 = iVar.mo37388i();
                        iVar.mo37396q();
                        if (!Float.isNaN(i17) && iVar.mo37383d(')')) {
                            matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) i17)));
                            break;
                        } else {
                            throw new C23792i("Invalid transform list: " + str2);
                        }
                    case 5:
                        iVar.mo37396q();
                        float i18 = iVar.mo37388i();
                        float o4 = iVar.mo37394o();
                        iVar.mo37396q();
                        if (!Float.isNaN(i18) && iVar.mo37383d(')')) {
                            if (!Float.isNaN(o4)) {
                                matrix.preTranslate(i18, o4);
                                break;
                            } else {
                                matrix.preTranslate(i18, 0.0f);
                                break;
                            }
                        } else {
                            throw new C23792i("Invalid transform list: " + str2);
                        }
                        break;
                    default:
                        throw new C23792i("Invalid transform list fn: " + str3 + ")");
                }
                if (iVar.mo37385f()) {
                    return matrix;
                }
                iVar.mo37395p();
            } else {
                throw new C23792i("Bad transform function encountered in transform list: " + str2);
            }
        }
        return matrix;
    }

    /* renamed from: E */
    public final void mo37355E(InputStream inputStream) {
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            C23796f fVar = new C23796f((C16856a) null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (ParserConfigurationException e) {
            throw new C23792i("XML parser problem", e);
        } catch (SAXException e2) {
            throw new C23792i("SVG parse error", e2);
        } catch (IOException e3) {
            throw new C23792i("Stream error", e3);
        }
    }

    /* renamed from: F */
    public final void mo37356F(InputStream inputStream) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            C23799j jVar = new C23799j(this, newPullParser);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, (String) null);
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                if (eventType == 0) {
                    this.f68186a = new C23713g();
                } else if (eventType == 8) {
                    C23797i iVar = new C23797i(newPullParser.getText());
                    String l = iVar.mo37391l();
                    mo37353C(iVar);
                    l.equals("xml-stylesheet");
                } else if (eventType == 2) {
                    String name = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name = newPullParser.getPrefix() + XVFSFile.PATH_SEPARATOR_CHAR + name;
                    }
                    mo37358I(newPullParser.getNamespace(), newPullParser.getName(), name, jVar);
                } else if (eventType == 3) {
                    String name2 = newPullParser.getName();
                    if (newPullParser.getPrefix() != null) {
                        name2 = newPullParser.getPrefix() + XVFSFile.PATH_SEPARATOR_CHAR + name2;
                    }
                    mo37363c(newPullParser.getNamespace(), newPullParser.getName(), name2);
                } else if (eventType == 4) {
                    int[] iArr = new int[2];
                    mo37361L(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                } else if (eventType == 5) {
                    mo37360K(newPullParser.getText());
                }
            }
        } catch (XmlPullParserException e) {
            throw new C23792i("XML parser problem", e);
        } catch (IOException e2) {
            throw new C23792i("Stream error", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00db, code lost:
        continue;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37357G(org.xml.sax.Attributes r7) {
        /*
            r6 = this;
            c6.g$j0 r0 = r6.f68187b
            if (r0 == 0) goto L_0x00ef
            c6.g$y r0 = new c6.g$y
            r0.<init>()
            c6.g r1 = r6.f68186a
            r0.f68085a = r1
            c6.g$j0 r1 = r6.f68187b
            r0.f68086b = r1
            r6.mo37367i(r0, r7)
            r6.mo37370l(r0, r7)
            r6.mo37366h(r0, r7)
            r6.mo37373o(r0, r7)
            r1 = 0
        L_0x001e:
            int r2 = r7.getLength()
            if (r1 >= r2) goto L_0x00e7
            java.lang.String r2 = r7.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r7.getLocalName(r1)
            c6.j$g r3 = p298c6.C23793j.C16858g.m16505a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L_0x00cf
            r4 = 26
            if (r3 == r4) goto L_0x00b4
            java.lang.String r4 = "userSpaceOnUse"
            java.lang.String r5 = "objectBoundingBox"
            switch(r3) {
                case 44: goto L_0x0073;
                case 45: goto L_0x006c;
                case 46: goto L_0x004c;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r3) {
                case 81: goto L_0x009f;
                case 82: goto L_0x0098;
                case 83: goto L_0x0091;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x00db
        L_0x004c:
            boolean r3 = r5.equals(r2)
            if (r3 == 0) goto L_0x0058
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f68127q = r2
            goto L_0x00db
        L_0x0058:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0064
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f68127q = r2
            goto L_0x00db
        L_0x0064:
            c6.i r7 = new c6.i
            java.lang.String r0 = "Invalid value for attribute patternUnits"
            r7.<init>(r0)
            throw r7
        L_0x006c:
            android.graphics.Matrix r2 = r6.mo37354D(r2)
            r0.f68129s = r2
            goto L_0x00db
        L_0x0073:
            boolean r3 = r5.equals(r2)
            if (r3 == 0) goto L_0x007e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f68128r = r2
            goto L_0x00db
        L_0x007e:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0089
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f68128r = r2
            goto L_0x00db
        L_0x0089:
            c6.i r7 = new c6.i
            java.lang.String r0 = "Invalid value for attribute patternContentUnits"
            r7.<init>(r0)
            throw r7
        L_0x0091:
            c6.g$p r2 = m28558w(r2)
            r0.f68131u = r2
            goto L_0x00db
        L_0x0098:
            c6.g$p r2 = m28558w(r2)
            r0.f68130t = r2
            goto L_0x00db
        L_0x009f:
            c6.g$p r2 = m28558w(r2)
            r0.f68132v = r2
            boolean r2 = r2.mo37289f()
            if (r2 != 0) goto L_0x00ac
            goto L_0x00db
        L_0x00ac:
            c6.i r7 = new c6.i
            java.lang.String r0 = "Invalid <pattern> element. width cannot be negative"
            r7.<init>(r0)
            throw r7
        L_0x00b4:
            java.lang.String r3 = r7.getURI(r1)
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00cc
            java.lang.String r3 = r7.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00db
        L_0x00cc:
            r0.f68134x = r2
            goto L_0x00db
        L_0x00cf:
            c6.g$p r2 = m28558w(r2)
            r0.f68133w = r2
            boolean r2 = r2.mo37289f()
            if (r2 != 0) goto L_0x00df
        L_0x00db:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x00df:
            c6.i r7 = new c6.i
            java.lang.String r0 = "Invalid <pattern> element. height cannot be negative"
            r7.<init>(r0)
            throw r7
        L_0x00e7:
            c6.g$j0 r7 = r6.f68187b
            r7.mo37266c(r0)
            r6.f68187b = r0
            return
        L_0x00ef:
            c6.i r7 = new c6.i
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23793j.mo37357G(org.xml.sax.Attributes):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:316:0x075d, code lost:
        r11 = r21;
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0761, code lost:
        r8 = r9;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07be, code lost:
        r14 = r4;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07c0, code lost:
        r6.mo37395p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07c7, code lost:
        if (r6.mo37385f() == false) goto L_0x07ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07ca, code lost:
        r2 = r6.f68199b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07ce, code lost:
        if (r2 != r6.f68200c) goto L_0x07d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x07d1, code lost:
        r2 = r6.f68198a.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07d9, code lost:
        if (r2 < 'a') goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07dd, code lost:
        if (r2 <= 'z') goto L_0x07e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07e1, code lost:
        if (r2 < 'A') goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07e5, code lost:
        if (r2 > 'Z') goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07e7, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07e9, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07ea, code lost:
        if (r2 == false) goto L_0x07f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07ec, code lost:
        r14 = r6.mo37387h().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x010b, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0464, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0c5c, code lost:
        continue;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37358I(java.lang.String r25, java.lang.String r26, java.lang.String r27, org.xml.sax.Attributes r28) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r28
            boolean r3 = r1.f68188c
            r4 = 1
            if (r3 == 0) goto L_0x0011
            int r0 = r1.f68189d
            int r0 = r0 + r4
            r1.f68189d = r0
            return
        L_0x0011:
            java.lang.String r3 = "http://www.w3.org/2000/svg"
            boolean r3 = r3.equals(r0)
            java.lang.String r5 = ""
            if (r3 != 0) goto L_0x0022
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0022
            return
        L_0x0022:
            int r0 = r26.length()
            if (r0 <= 0) goto L_0x002b
            r0 = r26
            goto L_0x002d
        L_0x002b:
            r0 = r27
        L_0x002d:
            java.util.Map<java.lang.String, c6.j$h> r3 = p298c6.C23793j.C16859h.f45562h
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r0 = r3.get(r0)
            c6.j$h r0 = (p298c6.C23793j.C16859h) r0
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            c6.j$h r0 = p298c6.C23793j.C16859h.UNSUPPORTED
        L_0x003c:
            int r3 = r0.ordinal()
            java.lang.String r6 = "userSpaceOnUse"
            r8 = 56
            r9 = 7
            r10 = 6
            java.lang.String r11 = "http://www.w3.org/1999/xlink"
            r12 = 26
            java.lang.String r13 = "Invalid document. Root element must be <svg>"
            r14 = 57
            r15 = 25
            r16 = 0
            r7 = 0
            switch(r3) {
                case 0: goto L_0x0bef;
                case 1: goto L_0x0b92;
                case 2: goto L_0x0b1b;
                case 3: goto L_0x0aae;
                case 4: goto L_0x0a84;
                case 5: goto L_0x0a7d;
                case 6: goto L_0x09f5;
                case 7: goto L_0x09c8;
                case 8: goto L_0x09c2;
                case 9: goto L_0x095b;
                case 10: goto L_0x08f5;
                case 11: goto L_0x081a;
                case 12: goto L_0x0814;
                case 13: goto L_0x0566;
                case 14: goto L_0x0561;
                case 15: goto L_0x0532;
                case 16: goto L_0x0503;
                case 17: goto L_0x047c;
                case 18: goto L_0x03ca;
                case 19: goto L_0x03a4;
                case 20: goto L_0x02f8;
                case 21: goto L_0x02f3;
                case 22: goto L_0x02c7;
                case 23: goto L_0x029b;
                case 24: goto L_0x026c;
                case 25: goto L_0x01ee;
                case 26: goto L_0x0a7d;
                case 27: goto L_0x0171;
                case 28: goto L_0x0125;
                case 29: goto L_0x0086;
                case 30: goto L_0x005d;
                default: goto L_0x0056;
            }
        L_0x0056:
            r0 = 1
            r1.f68188c = r0
            r1.f68189d = r0
            goto L_0x0c75
        L_0x005d:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x0080
            c6.g$f1 r0 = new c6.g$f1
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37366h(r0, r2)
            r1.mo37373o(r0, r2)
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            goto L_0x0c75
        L_0x0080:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0086:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x011f
            c6.g$e1 r0 = new c6.g$e1
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37372n(r0, r2)
            r1.mo37366h(r0, r2)
        L_0x00a3:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x0116
            java.lang.String r3 = r2.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            if (r4 == r15) goto L_0x00ff
            if (r4 == r12) goto L_0x00e8
            switch(r4) {
                case 81: goto L_0x00d3;
                case 82: goto L_0x00cc;
                case 83: goto L_0x00c5;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            goto L_0x010b
        L_0x00c5:
            c6.g$p r3 = m28558w(r3)
            r0.f68039r = r3
            goto L_0x010b
        L_0x00cc:
            c6.g$p r3 = m28558w(r3)
            r0.f68038q = r3
            goto L_0x010b
        L_0x00d3:
            c6.g$p r3 = m28558w(r3)
            r0.f68040s = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x00e0
            goto L_0x010b
        L_0x00e0:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <use> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x00e8:
            java.lang.String r4 = r2.getURI(r7)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00fc
            java.lang.String r4 = r2.getURI(r7)
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x010b
        L_0x00fc:
            r0.f68037p = r3
            goto L_0x010b
        L_0x00ff:
            c6.g$p r3 = m28558w(r3)
            r0.f68041t = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x010e
        L_0x010b:
            int r7 = r7 + 1
            goto L_0x00a3
        L_0x010e:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <use> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0116:
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            goto L_0x0c75
        L_0x011f:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0125:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x016b
            boolean r0 = r0 instanceof p298c6.C23713g.C23777y0
            if (r0 == 0) goto L_0x0163
            c6.g$v0 r0 = new c6.g$v0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37366h(r0, r2)
            r1.mo37371m(r0, r2)
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            c6.g$j0 r2 = r0.f68086b
            boolean r3 = r2 instanceof p298c6.C23713g.C23719b1
            if (r3 == 0) goto L_0x0159
            c6.g$b1 r2 = (p298c6.C23713g.C23719b1) r2
            r0.f68121s = r2
            goto L_0x0c75
        L_0x0159:
            c6.g$x0 r2 = (p298c6.C23713g.C23775x0) r2
            c6.g$b1 r2 = r2.mo37268a()
            r0.f68121s = r2
            goto L_0x0c75
        L_0x0163:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            r0.<init>(r2)
            throw r0
        L_0x016b:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0171:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x01e8
            boolean r0 = r0 instanceof p298c6.C23713g.C23777y0
            if (r0 == 0) goto L_0x01e0
            c6.g$u0 r0 = new c6.g$u0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37366h(r0, r2)
        L_0x018f:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x01c5
            java.lang.String r3 = r2.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            if (r4 == r12) goto L_0x01ac
            goto L_0x01c2
        L_0x01ac:
            java.lang.String r4 = r2.getURI(r7)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x01c0
            java.lang.String r4 = r2.getURI(r7)
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x01c2
        L_0x01c0:
            r0.f68118o = r3
        L_0x01c2:
            int r7 = r7 + 1
            goto L_0x018f
        L_0x01c5:
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            c6.g$j0 r2 = r0.f68086b
            boolean r3 = r2 instanceof p298c6.C23713g.C23719b1
            if (r3 == 0) goto L_0x01d6
            c6.g$b1 r2 = (p298c6.C23713g.C23719b1) r2
            r0.f68119p = r2
            goto L_0x0c75
        L_0x01d6:
            c6.g$x0 r2 = (p298c6.C23713g.C23775x0) r2
            c6.g$b1 r2 = r2.mo37268a()
            r0.f68119p = r2
            goto L_0x0c75
        L_0x01e0:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            r0.<init>(r2)
            throw r0
        L_0x01e8:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x01ee:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x0266
            c6.g$z0 r0 = new c6.g$z0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37366h(r0, r2)
        L_0x0208:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x0249
            java.lang.String r3 = r2.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            if (r4 == r12) goto L_0x0230
            r6 = 61
            if (r4 == r6) goto L_0x0229
            goto L_0x0246
        L_0x0229:
            c6.g$p r3 = m28558w(r3)
            r0.f68137p = r3
            goto L_0x0246
        L_0x0230:
            java.lang.String r4 = r2.getURI(r7)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0244
            java.lang.String r4 = r2.getURI(r7)
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x0246
        L_0x0244:
            r0.f68136o = r3
        L_0x0246:
            int r7 = r7 + 1
            goto L_0x0208
        L_0x0249:
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            c6.g$j0 r2 = r0.f68086b
            boolean r3 = r2 instanceof p298c6.C23713g.C23719b1
            if (r3 == 0) goto L_0x025c
            c6.g$b1 r2 = (p298c6.C23713g.C23719b1) r2
            r0.f68138q = r2
            goto L_0x0c75
        L_0x025c:
            c6.g$x0 r2 = (p298c6.C23713g.C23775x0) r2
            c6.g$b1 r2 = r2.mo37268a()
            r0.f68138q = r2
            goto L_0x0c75
        L_0x0266:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x026c:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x0295
            c6.g$w0 r0 = new c6.g$w0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37372n(r0, r2)
            r1.mo37366h(r0, r2)
            r1.mo37371m(r0, r2)
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            goto L_0x0c75
        L_0x0295:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x029b:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x02c1
            c6.g$t0 r0 = new c6.g$t0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37366h(r0, r2)
            r1.mo37373o(r0, r2)
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            goto L_0x0c75
        L_0x02c1:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x02c7:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x02ed
            c6.g$s0 r0 = new c6.g$s0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37372n(r0, r2)
            r1.mo37366h(r0, r2)
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            goto L_0x0c75
        L_0x02ed:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x02f3:
            r1.mo37359J(r2)
            goto L_0x0c75
        L_0x02f8:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x039e
            boolean r0 = r0 instanceof p298c6.C23713g.C23746j
            if (r0 == 0) goto L_0x0396
            c6.g$d0 r0 = new c6.g$d0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r3 = 0
        L_0x0314:
            int r5 = r28.getLength()
            if (r3 >= r5) goto L_0x038d
            java.lang.String r5 = r2.getValue(r3)
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = r2.getLocalName(r3)
            c6.j$g r6 = p298c6.C23793j.C16858g.m16505a(r6)
            int r6 = r6.ordinal()
            r8 = 39
            if (r6 == r8) goto L_0x0333
            goto L_0x036a
        L_0x0333:
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0385
            int r6 = r5.length()
            int r8 = r5.length()
            int r8 = r8 - r4
            char r8 = r5.charAt(r8)
            r9 = 37
            if (r8 != r9) goto L_0x034e
            int r6 = r6 + -1
            r8 = 1
            goto L_0x034f
        L_0x034e:
            r8 = 0
        L_0x034f:
            float r6 = m28554s(r5, r7, r6)     // Catch:{ NumberFormatException -> 0x036d }
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r8 == 0) goto L_0x0358
            float r6 = r6 / r9
        L_0x0358:
            int r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x035e
            r9 = 0
            goto L_0x0364
        L_0x035e:
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0363
            goto L_0x0364
        L_0x0363:
            r9 = r6
        L_0x0364:
            java.lang.Float r5 = java.lang.Float.valueOf(r9)     // Catch:{ NumberFormatException -> 0x036d }
            r0.f67959h = r5
        L_0x036a:
            int r3 = r3 + 1
            goto L_0x0314
        L_0x036d:
            r0 = move-exception
            c6.i r2 = new c6.i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid offset value in <stop>: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x0385:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid offset value in <stop> (empty string)"
            r0.<init>(r2)
            throw r0
        L_0x038d:
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            goto L_0x0c75
        L_0x0396:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."
            r0.<init>(r2)
            throw r0
        L_0x039e:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x03a4:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x03c4
            c6.g$c0 r0 = new c6.g$c0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            goto L_0x0c75
        L_0x03c4:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x03ca:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x0476
            c6.g$b0 r0 = new c6.g$b0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37372n(r0, r2)
            r1.mo37366h(r0, r2)
        L_0x03e7:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x046f
            java.lang.String r3 = r2.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            if (r4 == r15) goto L_0x0458
            if (r4 == r8) goto L_0x0443
            if (r4 == r14) goto L_0x042e
            switch(r4) {
                case 81: goto L_0x0419;
                case 82: goto L_0x0412;
                case 83: goto L_0x040b;
                default: goto L_0x040a;
            }
        L_0x040a:
            goto L_0x0464
        L_0x040b:
            c6.g$p r3 = m28558w(r3)
            r0.f67946p = r3
            goto L_0x0464
        L_0x0412:
            c6.g$p r3 = m28558w(r3)
            r0.f67945o = r3
            goto L_0x0464
        L_0x0419:
            c6.g$p r3 = m28558w(r3)
            r0.f67947q = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x0426
            goto L_0x0464
        L_0x0426:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <rect> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x042e:
            c6.g$p r3 = m28558w(r3)
            r0.f67950t = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x043b
            goto L_0x0464
        L_0x043b:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <rect> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0443:
            c6.g$p r3 = m28558w(r3)
            r0.f67949s = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x0450
            goto L_0x0464
        L_0x0450:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <rect> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0458:
            c6.g$p r3 = m28558w(r3)
            r0.f67948r = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x0467
        L_0x0464:
            int r7 = r7 + 1
            goto L_0x03e7
        L_0x0467:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <rect> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x046f:
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            goto L_0x0c75
        L_0x0476:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x047c:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x04fd
            c6.g$q0 r0 = new c6.g$q0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37368j(r0, r2)
        L_0x0496:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x04f4
            java.lang.String r3 = r2.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            if (r4 == r10) goto L_0x04eb
            if (r4 == r9) goto L_0x04e4
            r5 = 11
            if (r4 == r5) goto L_0x04dd
            r5 = 12
            if (r4 == r5) goto L_0x04d6
            r5 = 49
            if (r4 == r5) goto L_0x04c1
            goto L_0x04f1
        L_0x04c1:
            c6.g$p r3 = m28558w(r3)
            r0.f68102o = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x04ce
            goto L_0x04f1
        L_0x04ce:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <radialGradient> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x04d6:
            c6.g$p r3 = m28558w(r3)
            r0.f68104q = r3
            goto L_0x04f1
        L_0x04dd:
            c6.g$p r3 = m28558w(r3)
            r0.f68103p = r3
            goto L_0x04f1
        L_0x04e4:
            c6.g$p r3 = m28558w(r3)
            r0.f68101n = r3
            goto L_0x04f1
        L_0x04eb:
            c6.g$p r3 = m28558w(r3)
            r0.f68100m = r3
        L_0x04f1:
            int r7 = r7 + 1
            goto L_0x0496
        L_0x04f4:
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            r1.f68187b = r0
            goto L_0x0c75
        L_0x04fd:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0503:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x052c
            c6.g$z r0 = new c6.g$z
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37372n(r0, r2)
            r1.mo37366h(r0, r2)
            java.lang.String r3 = "polyline"
            r1.mo37369k(r0, r2, r3)
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            goto L_0x0c75
        L_0x052c:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0532:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x055b
            c6.g$a0 r0 = new c6.g$a0
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37372n(r0, r2)
            r1.mo37366h(r0, r2)
            java.lang.String r3 = "polygon"
            r1.mo37369k(r0, r2, r3)
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            goto L_0x0c75
        L_0x055b:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0561:
            r1.mo37357G(r2)
            goto L_0x0c75
        L_0x0566:
            c6.g$j0 r0 = r1.f68187b
            if (r0 == 0) goto L_0x080e
            c6.g$v r0 = new c6.g$v
            r0.<init>()
            c6.g r3 = r1.f68186a
            r0.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r0.f68086b = r3
            r1.mo37367i(r0, r2)
            r1.mo37370l(r0, r2)
            r1.mo37372n(r0, r2)
            r1.mo37366h(r0, r2)
            r3 = 0
        L_0x0584:
            int r5 = r28.getLength()
            if (r3 >= r5) goto L_0x0807
            java.lang.String r5 = r2.getValue(r3)
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = r2.getLocalName(r3)
            c6.j$g r6 = p298c6.C23793j.C16858g.m16505a(r6)
            int r6 = r6.ordinal()
            r8 = 13
            if (r6 == r8) goto L_0x05c2
            r8 = 43
            if (r6 == r8) goto L_0x05a8
            goto L_0x07ff
        L_0x05a8:
            float r5 = m28553r(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r5 = r5.floatValue()
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x05ba
            goto L_0x07ff
        L_0x05ba:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <path> element. pathLength cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x05c2:
            c6.j$i r6 = new c6.j$i
            r6.<init>(r5)
            c6.g$w r5 = new c6.g$w
            r5.<init>()
            boolean r8 = r6.mo37385f()
            if (r8 == 0) goto L_0x05d4
            goto L_0x07fd
        L_0x05d4:
            java.lang.Integer r8 = r6.mo37387h()
            int r8 = r8.intValue()
            r9 = 77
            r15 = 109(0x6d, float:1.53E-43)
            if (r8 == r9) goto L_0x05e6
            if (r8 == r15) goto L_0x05e6
            goto L_0x07fd
        L_0x05e6:
            r14 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r17 = 0
            r18 = 0
        L_0x05ef:
            r6.mo37396q()
            r12 = 1073741824(0x40000000, float:2.0)
            r13 = 108(0x6c, float:1.51E-43)
            switch(r14) {
                case 65: goto L_0x0766;
                case 67: goto L_0x071d;
                case 72: goto L_0x0704;
                case 76: goto L_0x06e5;
                case 77: goto L_0x06b1;
                case 81: goto L_0x0683;
                case 83: goto L_0x0640;
                case 84: goto L_0x061d;
                case 86: goto L_0x0606;
                case 90: goto L_0x05fb;
                case 97: goto L_0x0766;
                case 99: goto L_0x071d;
                case 104: goto L_0x0704;
                case 108: goto L_0x06e5;
                case 109: goto L_0x06b1;
                case 113: goto L_0x0683;
                case 115: goto L_0x0640;
                case 116: goto L_0x061d;
                case 118: goto L_0x0606;
                case 122: goto L_0x05fb;
                default: goto L_0x05f9;
            }
        L_0x05f9:
            goto L_0x07fd
        L_0x05fb:
            r5.close()
            r4 = r14
            r8 = r17
            r9 = r8
            r11 = r18
            goto L_0x0700
        L_0x0606:
            float r11 = r6.mo37388i()
            boolean r12 = java.lang.Float.isNaN(r11)
            if (r12 == 0) goto L_0x0612
            goto L_0x07fd
        L_0x0612:
            r12 = 118(0x76, float:1.65E-43)
            if (r14 != r12) goto L_0x0617
            float r11 = r11 + r10
        L_0x0617:
            r5.mo37295c(r8, r11)
            r4 = r14
            goto L_0x0700
        L_0x061d:
            float r13 = r8 * r12
            float r13 = r13 - r9
            float r12 = r12 * r10
            float r11 = r12 - r11
            float r9 = r6.mo37388i()
            float r12 = r6.mo37382c(r9)
            boolean r19 = java.lang.Float.isNaN(r12)
            if (r19 == 0) goto L_0x0634
            goto L_0x07fd
        L_0x0634:
            r4 = 116(0x74, float:1.63E-43)
            if (r14 != r4) goto L_0x063a
            float r9 = r9 + r8
            float r12 = r12 + r10
        L_0x063a:
            r10 = r12
            r5.mo37298e(r13, r11, r9, r10)
            goto L_0x0761
        L_0x0640:
            float r4 = r8 * r12
            float r9 = r4 - r9
            float r12 = r12 * r10
            float r4 = r12 - r11
            float r11 = r6.mo37388i()
            float r12 = r6.mo37382c(r11)
            float r13 = r6.mo37382c(r12)
            float r20 = r6.mo37382c(r13)
            boolean r21 = java.lang.Float.isNaN(r20)
            if (r21 == 0) goto L_0x0660
            goto L_0x07fd
        L_0x0660:
            r7 = 115(0x73, float:1.61E-43)
            if (r14 != r7) goto L_0x0669
            float r13 = r13 + r8
            float r20 = r20 + r10
            float r11 = r11 + r8
            float r12 = r12 + r10
        L_0x0669:
            r22 = r11
            r21 = r12
            r7 = r13
            r8 = r5
            r10 = r4
            r11 = r22
            r12 = r21
            r4 = 97
            r13 = r7
            r4 = r14
            r14 = r20
            r8.mo37294b(r9, r10, r11, r12, r13, r14)
            r14 = r4
            r9 = r7
            r10 = r20
            goto L_0x075d
        L_0x0683:
            r4 = r14
            float r7 = r6.mo37388i()
            float r9 = r6.mo37382c(r7)
            float r11 = r6.mo37382c(r9)
            float r12 = r6.mo37382c(r11)
            boolean r13 = java.lang.Float.isNaN(r12)
            if (r13 == 0) goto L_0x069c
            goto L_0x07fd
        L_0x069c:
            r13 = 113(0x71, float:1.58E-43)
            if (r4 != r13) goto L_0x06a4
            float r11 = r11 + r8
            float r12 = r12 + r10
            float r7 = r7 + r8
            float r9 = r9 + r10
        L_0x06a4:
            r13 = r7
            r10 = r12
            r23 = r11
            r11 = r9
            r9 = r23
            r5.mo37298e(r13, r11, r9, r10)
            r14 = r4
            goto L_0x0761
        L_0x06b1:
            r4 = r14
            float r7 = r6.mo37388i()
            float r9 = r6.mo37382c(r7)
            boolean r11 = java.lang.Float.isNaN(r9)
            if (r11 == 0) goto L_0x06c2
            goto L_0x07fd
        L_0x06c2:
            if (r4 != r15) goto L_0x06cf
            int r11 = r5.f68123b
            if (r11 != 0) goto L_0x06ca
            r11 = 1
            goto L_0x06cb
        L_0x06ca:
            r11 = 0
        L_0x06cb:
            if (r11 != 0) goto L_0x06cf
            float r7 = r7 + r8
            float r9 = r9 + r10
        L_0x06cf:
            r10 = r9
            r5.mo37293a(r7, r10)
            if (r4 != r15) goto L_0x06d8
            r14 = 108(0x6c, float:1.51E-43)
            goto L_0x06dc
        L_0x06d8:
            r4 = 76
            r14 = 76
        L_0x06dc:
            r9 = r7
            r13 = r9
            r17 = r13
            r11 = r10
            r18 = r11
            goto L_0x0761
        L_0x06e5:
            r4 = r14
            float r7 = r6.mo37388i()
            float r9 = r6.mo37382c(r7)
            boolean r11 = java.lang.Float.isNaN(r9)
            if (r11 == 0) goto L_0x06f6
            goto L_0x07fd
        L_0x06f6:
            if (r4 != r13) goto L_0x06fa
            float r7 = r7 + r8
            float r9 = r9 + r10
        L_0x06fa:
            r8 = r7
            r11 = r9
            r5.mo37295c(r8, r11)
            r9 = r8
        L_0x0700:
            r7 = 109(0x6d, float:1.53E-43)
            goto L_0x07be
        L_0x0704:
            r4 = r14
            float r7 = r6.mo37388i()
            boolean r9 = java.lang.Float.isNaN(r7)
            if (r9 == 0) goto L_0x0711
            goto L_0x07fd
        L_0x0711:
            r9 = 104(0x68, float:1.46E-43)
            if (r4 != r9) goto L_0x0716
            float r7 = r7 + r8
        L_0x0716:
            r13 = r7
            r5.mo37295c(r13, r10)
            r14 = r4
            r9 = r13
            goto L_0x0761
        L_0x071d:
            r4 = r14
            float r7 = r6.mo37388i()
            float r9 = r6.mo37382c(r7)
            float r11 = r6.mo37382c(r9)
            float r12 = r6.mo37382c(r11)
            float r13 = r6.mo37382c(r12)
            float r14 = r6.mo37382c(r13)
            boolean r20 = java.lang.Float.isNaN(r14)
            if (r20 == 0) goto L_0x073e
            goto L_0x07fd
        L_0x073e:
            r15 = 99
            if (r4 != r15) goto L_0x0748
            float r13 = r13 + r8
            float r14 = r14 + r10
            float r7 = r7 + r8
            float r9 = r9 + r10
            float r11 = r11 + r8
            float r12 = r12 + r10
        L_0x0748:
            r10 = r9
            r22 = r11
            r21 = r12
            r15 = r14
            r9 = r7
            r7 = r13
            r8 = r5
            r11 = r22
            r12 = r21
            r13 = r7
            r14 = r15
            r8.mo37294b(r9, r10, r11, r12, r13, r14)
            r14 = r4
            r9 = r7
            r10 = r15
        L_0x075d:
            r11 = r21
            r13 = r22
        L_0x0761:
            r8 = r9
            r9 = r13
            r7 = 109(0x6d, float:1.53E-43)
            goto L_0x07c0
        L_0x0766:
            r4 = r14
            float r9 = r6.mo37388i()
            float r7 = r6.mo37382c(r9)
            float r11 = r6.mo37382c(r7)
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            java.lang.Boolean r12 = r6.mo37381b(r12)
            java.lang.Boolean r13 = r6.mo37381b(r12)
            if (r13 != 0) goto L_0x0784
            r14 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x078b
        L_0x0784:
            r6.mo37395p()
            float r14 = r6.mo37388i()
        L_0x078b:
            float r15 = r6.mo37382c(r14)
            boolean r21 = java.lang.Float.isNaN(r15)
            if (r21 != 0) goto L_0x07fd
            int r21 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r21 < 0) goto L_0x07fd
            int r21 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r21 >= 0) goto L_0x079f
            goto L_0x07fd
        L_0x079f:
            r2 = 97
            if (r4 != r2) goto L_0x07a5
            float r14 = r14 + r8
            float r15 = r15 + r10
        L_0x07a5:
            r2 = r14
            r21 = r15
            boolean r12 = r12.booleanValue()
            boolean r13 = r13.booleanValue()
            r8 = r5
            r10 = r7
            r14 = r2
            r7 = 109(0x6d, float:1.53E-43)
            r15 = r21
            r8.mo37297d(r9, r10, r11, r12, r13, r14, r15)
            r8 = r2
            r9 = r8
            r11 = r21
        L_0x07be:
            r14 = r4
            r10 = r11
        L_0x07c0:
            r6.mo37395p()
            boolean r2 = r6.mo37385f()
            if (r2 == 0) goto L_0x07ca
            goto L_0x07fd
        L_0x07ca:
            int r2 = r6.f68199b
            int r4 = r6.f68200c
            if (r2 != r4) goto L_0x07d1
            goto L_0x07e9
        L_0x07d1:
            java.lang.String r4 = r6.f68198a
            char r2 = r4.charAt(r2)
            r4 = 97
            if (r2 < r4) goto L_0x07df
            r4 = 122(0x7a, float:1.71E-43)
            if (r2 <= r4) goto L_0x07e7
        L_0x07df:
            r4 = 65
            if (r2 < r4) goto L_0x07e9
            r4 = 90
            if (r2 > r4) goto L_0x07e9
        L_0x07e7:
            r2 = 1
            goto L_0x07ea
        L_0x07e9:
            r2 = 0
        L_0x07ea:
            if (r2 == 0) goto L_0x07f5
            java.lang.Integer r2 = r6.mo37387h()
            int r2 = r2.intValue()
            r14 = r2
        L_0x07f5:
            r2 = r28
            r4 = 1
            r7 = 0
            r15 = 109(0x6d, float:1.53E-43)
            goto L_0x05ef
        L_0x07fd:
            r0.f68120o = r5
        L_0x07ff:
            int r3 = r3 + 1
            r2 = r28
            r4 = 1
            r7 = 0
            goto L_0x0584
        L_0x0807:
            c6.g$j0 r2 = r1.f68187b
            r2.mo37266c(r0)
            goto L_0x0c75
        L_0x080e:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0814:
            r0 = r2
            r1.mo37365g(r0)
            goto L_0x0c75
        L_0x081a:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x08ef
            c6.g$r r2 = new c6.g$r
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37366h(r2, r0)
            r1.mo37373o(r2, r0)
            r3 = 0
        L_0x0839:
            int r4 = r28.getLength()
            if (r3 >= r4) goto L_0x08e6
            java.lang.String r4 = r0.getValue(r3)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = r0.getLocalName(r3)
            c6.j$g r5 = p298c6.C23793j.C16858g.m16505a(r5)
            int r5 = r5.ordinal()
            r7 = 41
            if (r5 == r7) goto L_0x08c4
            r7 = 50
            if (r5 == r7) goto L_0x08ba
            r7 = 51
            if (r5 == r7) goto L_0x08b2
            switch(r5) {
                case 32: goto L_0x089c;
                case 33: goto L_0x087d;
                case 34: goto L_0x0864;
                default: goto L_0x0862;
            }
        L_0x0862:
            r7 = 0
            goto L_0x08c1
        L_0x0864:
            c6.g$p r4 = m28558w(r4)
            r2.f68108t = r4
            boolean r4 = r4.mo37289f()
            if (r4 != 0) goto L_0x0875
            r5 = 2143289344(0x7fc00000, float:NaN)
            r7 = 0
            goto L_0x08e2
        L_0x0875:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <marker> element. markerWidth cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x087d:
            java.lang.String r5 = "strokeWidth"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0889
            r7 = 0
            r2.f68105q = r7
            goto L_0x08c1
        L_0x0889:
            r7 = 0
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0894
            r4 = 1
            r2.f68105q = r4
            goto L_0x08c1
        L_0x0894:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid value for attribute markerUnits"
            r0.<init>(r2)
            throw r0
        L_0x089c:
            r7 = 0
            c6.g$p r4 = m28558w(r4)
            r2.f68109u = r4
            boolean r4 = r4.mo37289f()
            if (r4 != 0) goto L_0x08aa
            goto L_0x08c1
        L_0x08aa:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <marker> element. markerHeight cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x08b2:
            r7 = 0
            c6.g$p r4 = m28558w(r4)
            r2.f68107s = r4
            goto L_0x08c1
        L_0x08ba:
            r7 = 0
            c6.g$p r4 = m28558w(r4)
            r2.f68106r = r4
        L_0x08c1:
            r5 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x08e2
        L_0x08c4:
            r7 = 0
            java.lang.String r5 = "auto"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x08d6
            r5 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            r2.f68110v = r4
            goto L_0x08e2
        L_0x08d6:
            r5 = 2143289344(0x7fc00000, float:NaN)
            float r4 = m28553r(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r2.f68110v = r4
        L_0x08e2:
            int r3 = r3 + 1
            goto L_0x0839
        L_0x08e6:
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            r1.f68187b = r2
            goto L_0x0c75
        L_0x08ef:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x08f5:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x0955
            c6.g$m0 r2 = new c6.g$m0
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37368j(r2, r0)
        L_0x0910:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x094c
            java.lang.String r3 = r0.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r0.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            switch(r4) {
                case 84: goto L_0x0943;
                case 85: goto L_0x093c;
                case 86: goto L_0x0935;
                case 87: goto L_0x092e;
                default: goto L_0x092d;
            }
        L_0x092d:
            goto L_0x0949
        L_0x092e:
            c6.g$p r3 = m28558w(r3)
            r2.f68084p = r3
            goto L_0x0949
        L_0x0935:
            c6.g$p r3 = m28558w(r3)
            r2.f68083o = r3
            goto L_0x0949
        L_0x093c:
            c6.g$p r3 = m28558w(r3)
            r2.f68082n = r3
            goto L_0x0949
        L_0x0943:
            c6.g$p r3 = m28558w(r3)
            r2.f68081m = r3
        L_0x0949:
            int r7 = r7 + 1
            goto L_0x0910
        L_0x094c:
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            r1.f68187b = r2
            goto L_0x0c75
        L_0x0955:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x095b:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x09bc
            c6.g$q r2 = new c6.g$q
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37372n(r2, r0)
            r1.mo37366h(r2, r0)
        L_0x0979:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x09b5
            java.lang.String r3 = r0.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r0.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            switch(r4) {
                case 84: goto L_0x09ac;
                case 85: goto L_0x09a5;
                case 86: goto L_0x099e;
                case 87: goto L_0x0997;
                default: goto L_0x0996;
            }
        L_0x0996:
            goto L_0x09b2
        L_0x0997:
            c6.g$p r3 = m28558w(r3)
            r2.f68099r = r3
            goto L_0x09b2
        L_0x099e:
            c6.g$p r3 = m28558w(r3)
            r2.f68098q = r3
            goto L_0x09b2
        L_0x09a5:
            c6.g$p r3 = m28558w(r3)
            r2.f68097p = r3
            goto L_0x09b2
        L_0x09ac:
            c6.g$p r3 = m28558w(r3)
            r2.f68096o = r3
        L_0x09b2:
            int r7 = r7 + 1
            goto L_0x0979
        L_0x09b5:
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            goto L_0x0c75
        L_0x09bc:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x09c2:
            r0 = r2
            r1.mo37364f(r0)
            goto L_0x0c75
        L_0x09c8:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x09ef
            c6.g$m r2 = new c6.g$m
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37372n(r2, r0)
            r1.mo37366h(r2, r0)
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            r1.f68187b = r2
            goto L_0x0c75
        L_0x09ef:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x09f5:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x0a77
            c6.g$i r2 = new c6.g$i
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37372n(r2, r0)
            r1.mo37366h(r2, r0)
        L_0x0a13:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x0a70
            java.lang.String r3 = r0.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r0.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            if (r4 == r10) goto L_0x0a67
            if (r4 == r9) goto L_0x0a60
            if (r4 == r8) goto L_0x0a4b
            if (r4 == r14) goto L_0x0a36
            goto L_0x0a6d
        L_0x0a36:
            c6.g$p r3 = m28558w(r3)
            r2.f68059r = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x0a43
            goto L_0x0a6d
        L_0x0a43:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <ellipse> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0a4b:
            c6.g$p r3 = m28558w(r3)
            r2.f68058q = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x0a58
            goto L_0x0a6d
        L_0x0a58:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <ellipse> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0a60:
            c6.g$p r3 = m28558w(r3)
            r2.f68057p = r3
            goto L_0x0a6d
        L_0x0a67:
            c6.g$p r3 = m28558w(r3)
            r2.f68056o = r3
        L_0x0a6d:
            int r7 = r7 + 1
            goto L_0x0a13
        L_0x0a70:
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            goto L_0x0c75
        L_0x0a77:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0a7d:
            r2 = 1
            r1.f68190e = r2
            r1.f68191f = r0
            goto L_0x0c75
        L_0x0a84:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x0aa8
            c6.g$h r2 = new c6.g$h
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37372n(r2, r0)
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            r1.f68187b = r2
            goto L_0x0c75
        L_0x0aa8:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0aae:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x0b15
            c6.g$e r2 = new c6.g$e
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37372n(r2, r0)
            r1.mo37366h(r2, r0)
        L_0x0acc:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x0b0c
            java.lang.String r3 = r0.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r0.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            r5 = 3
            if (r4 == r5) goto L_0x0aea
            goto L_0x0b01
        L_0x0aea:
            java.lang.String r4 = "objectBoundingBox"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0af7
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.f67966p = r3
            goto L_0x0b01
        L_0x0af7:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0b04
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.f67966p = r3
        L_0x0b01:
            int r7 = r7 + 1
            goto L_0x0acc
        L_0x0b04:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid value for attribute clipPathUnits"
            r0.<init>(r2)
            throw r0
        L_0x0b0c:
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            r1.f68187b = r2
            goto L_0x0c75
        L_0x0b15:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0b1b:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x0b8c
            c6.g$d r2 = new c6.g$d
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37372n(r2, r0)
            r1.mo37366h(r2, r0)
        L_0x0b39:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x0b85
            java.lang.String r3 = r0.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r0.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            if (r4 == r10) goto L_0x0b7a
            if (r4 == r9) goto L_0x0b71
            r5 = 49
            if (r4 == r5) goto L_0x0b5c
            goto L_0x0b82
        L_0x0b5c:
            c6.g$p r3 = m28558w(r3)
            r2.f67958q = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x0b69
            goto L_0x0b82
        L_0x0b69:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <circle> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0b71:
            r5 = 49
            c6.g$p r3 = m28558w(r3)
            r2.f67957p = r3
            goto L_0x0b82
        L_0x0b7a:
            r5 = 49
            c6.g$p r3 = m28558w(r3)
            r2.f67956o = r3
        L_0x0b82:
            int r7 = r7 + 1
            goto L_0x0b39
        L_0x0b85:
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            goto L_0x0c75
        L_0x0b8c:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0b92:
            r0 = r2
            c6.g$j0 r2 = r1.f68187b
            if (r2 == 0) goto L_0x0be9
            c6.g$a r2 = new c6.g$a
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37372n(r2, r0)
            r1.mo37366h(r2, r0)
        L_0x0bb0:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x0be0
            java.lang.String r3 = r0.getValue(r7)
            r3.getClass()
            java.lang.String r3 = r0.getLocalName(r7)
            c6.j$g r3 = p298c6.C23793j.C16858g.m16505a(r3)
            int r3 = r3.ordinal()
            if (r3 == r12) goto L_0x0bcc
            goto L_0x0bdd
        L_0x0bcc:
            java.lang.String r3 = r0.getURI(r7)
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0bdd
            java.lang.String r3 = r0.getURI(r7)
            r11.equals(r3)
        L_0x0bdd:
            int r7 = r7 + 1
            goto L_0x0bb0
        L_0x0be0:
            c6.g$j0 r0 = r1.f68187b
            r0.mo37266c(r2)
            r1.f68187b = r2
            goto L_0x0c75
        L_0x0be9:
            c6.i r0 = new c6.i
            r0.<init>(r13)
            throw r0
        L_0x0bef:
            r0 = r2
            c6.g$f0 r2 = new c6.g$f0
            r2.<init>()
            c6.g r3 = r1.f68186a
            r2.f68085a = r3
            c6.g$j0 r3 = r1.f68187b
            r2.f68086b = r3
            r1.mo37367i(r2, r0)
            r1.mo37370l(r2, r0)
            r1.mo37366h(r2, r0)
            r1.mo37373o(r2, r0)
        L_0x0c09:
            int r3 = r28.getLength()
            if (r7 >= r3) goto L_0x0c67
            java.lang.String r3 = r0.getValue(r7)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r0.getLocalName(r7)
            c6.j$g r4 = p298c6.C23793j.C16858g.m16505a(r4)
            int r4 = r4.ordinal()
            if (r4 == r15) goto L_0x0c50
            r5 = 79
            if (r4 == r5) goto L_0x0c5c
            switch(r4) {
                case 81: goto L_0x0c3b;
                case 82: goto L_0x0c34;
                case 83: goto L_0x0c2d;
                default: goto L_0x0c2c;
            }
        L_0x0c2c:
            goto L_0x0c5c
        L_0x0c2d:
            c6.g$p r3 = m28558w(r3)
            r2.f68046r = r3
            goto L_0x0c5c
        L_0x0c34:
            c6.g$p r3 = m28558w(r3)
            r2.f68045q = r3
            goto L_0x0c5c
        L_0x0c3b:
            c6.g$p r3 = m28558w(r3)
            r2.f68047s = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x0c48
            goto L_0x0c5c
        L_0x0c48:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <svg> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0c50:
            c6.g$p r3 = m28558w(r3)
            r2.f68048t = r3
            boolean r3 = r3.mo37289f()
            if (r3 != 0) goto L_0x0c5f
        L_0x0c5c:
            int r7 = r7 + 1
            goto L_0x0c09
        L_0x0c5f:
            c6.i r0 = new c6.i
            java.lang.String r2 = "Invalid <svg> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0c67:
            c6.g$j0 r0 = r1.f68187b
            if (r0 != 0) goto L_0x0c70
            c6.g r0 = r1.f68186a
            r0.f67934a = r2
            goto L_0x0c73
        L_0x0c70:
            r0.mo37266c(r2)
        L_0x0c73:
            r1.f68187b = r2
        L_0x0c75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23793j.mo37358I(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    /* renamed from: J */
    public final void mo37359J(Attributes attributes) {
        if (this.f68187b != null) {
            boolean z = false;
            String str = "all";
            boolean z2 = true;
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                int ordinal = C16858g.m16505a(attributes.getLocalName(i)).ordinal();
                if (ordinal == 38) {
                    str = trim;
                } else if (ordinal == 77) {
                    z2 = trim.equals("text/css");
                }
            }
            if (z2) {
                C23690b.C23696f fVar = C23690b.C23696f.screen;
                C23690b.C23693d dVar = new C23690b.C23693d(str);
                dVar.mo37396q();
                Iterator it = ((ArrayList) C23690b.m28345c(dVar)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        C23690b.C23696f fVar2 = (C23690b.C23696f) it.next();
                        if (fVar2 != C23690b.C23696f.all) {
                            if (fVar2 == fVar) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
                if (z) {
                    this.f68193h = true;
                    return;
                }
            }
            this.f68188c = true;
            this.f68189d = 1;
            return;
        }
        throw new C23792i("Invalid document. Root element must be <svg>");
    }

    /* renamed from: K */
    public final void mo37360K(String str) {
        if (!this.f68188c) {
            if (this.f68190e) {
                if (this.f68192g == null) {
                    this.f68192g = new StringBuilder(str.length());
                }
                this.f68192g.append(str);
            } else if (this.f68193h) {
                if (this.f68194i == null) {
                    this.f68194i = new StringBuilder(str.length());
                }
                this.f68194i.append(str);
            } else if (this.f68187b instanceof C23713g.C23777y0) {
                mo37362a(str);
            }
        }
    }

    /* renamed from: L */
    public final void mo37361L(char[] cArr, int i, int i2) {
        if (!this.f68188c) {
            if (this.f68190e) {
                if (this.f68192g == null) {
                    this.f68192g = new StringBuilder(i2);
                }
                this.f68192g.append(cArr, i, i2);
            } else if (this.f68193h) {
                if (this.f68194i == null) {
                    this.f68194i = new StringBuilder(i2);
                }
                this.f68194i.append(cArr, i, i2);
            } else if (this.f68187b instanceof C23713g.C23777y0) {
                mo37362a(new String(cArr, i, i2));
            }
        }
    }

    /* renamed from: a */
    public final void mo37362a(String str) {
        C23713g.C23743h0 h0Var = (C23713g.C23743h0) this.f68187b;
        int size = h0Var.f68050i.size();
        C23713g.C23755n0 n0Var = size == 0 ? null : h0Var.f68050i.get(size - 1);
        if (n0Var instanceof C23713g.C23722c1) {
            StringBuilder sb = new StringBuilder();
            C23713g.C23722c1 c1Var = (C23713g.C23722c1) n0Var;
            sb.append(c1Var.f67955c);
            sb.append(str);
            c1Var.f67955c = sb.toString();
            return;
        }
        this.f68187b.mo37266c(new C23713g.C23722c1(str));
    }

    /* renamed from: c */
    public final void mo37363c(String str, String str2, String str3) {
        if (this.f68188c) {
            int i = this.f68189d - 1;
            this.f68189d = i;
            if (i == 0) {
                this.f68188c = false;
            }
        } else if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            C16859h hVar = (C16859h) ((HashMap) C16859h.f45562h).get(str2);
            if (hVar == null) {
                hVar = C16859h.UNSUPPORTED;
            }
            switch (hVar.ordinal()) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    C23713g.C23747j0 j0Var = this.f68187b;
                    if (j0Var != null) {
                        this.f68187b = ((C23713g.C23755n0) j0Var).f68086b;
                        return;
                    } else {
                        throw new C23792i(String.format("Unbalanced end element </%s> found", new Object[]{str2}));
                    }
                case 5:
                case 26:
                    this.f68190e = false;
                    if (this.f68192g != null) {
                        C16859h hVar2 = this.f68191f;
                        if (hVar2 == C16859h.title) {
                            this.f68186a.getClass();
                        } else if (hVar2 == C16859h.desc) {
                            this.f68186a.getClass();
                        }
                        this.f68192g.setLength(0);
                        return;
                    }
                    return;
                case 21:
                    StringBuilder sb = this.f68194i;
                    if (sb != null) {
                        this.f68193h = false;
                        String sb4 = sb.toString();
                        C23690b bVar = new C23690b(C23690b.C23696f.screen, C23690b.C16854u.Document);
                        C23713g gVar = this.f68186a;
                        C23690b.C23693d dVar = new C23690b.C23693d(sb4);
                        dVar.mo37396q();
                        gVar.f67935b.mo17904b(bVar.mo37240e(dVar));
                        this.f68194i.setLength(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        continue;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37364f(org.xml.sax.Attributes r6) {
        /*
            r5 = this;
            c6.g$j0 r0 = r5.f68187b
            if (r0 == 0) goto L_0x00a9
            c6.g$o r0 = new c6.g$o
            r0.<init>()
            c6.g r1 = r5.f68186a
            r0.f68085a = r1
            c6.g$j0 r1 = r5.f68187b
            r0.f68086b = r1
            r5.mo37367i(r0, r6)
            r5.mo37370l(r0, r6)
            r5.mo37372n(r0, r6)
            r5.mo37366h(r0, r6)
            r1 = 0
        L_0x001e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L_0x00a1
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r6.getLocalName(r1)
            c6.j$g r3 = p298c6.C23793j.C16858g.m16505a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L_0x008a
            r4 = 26
            if (r3 == r4) goto L_0x006f
            r4 = 48
            if (r3 == r4) goto L_0x006b
            switch(r3) {
                case 81: goto L_0x0056;
                case 82: goto L_0x004f;
                case 83: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x0096
        L_0x0048:
            c6.g$p r2 = m28558w(r2)
            r0.f68089r = r2
            goto L_0x0096
        L_0x004f:
            c6.g$p r2 = m28558w(r2)
            r0.f68088q = r2
            goto L_0x0096
        L_0x0056:
            c6.g$p r2 = m28558w(r2)
            r0.f68090s = r2
            boolean r2 = r2.mo37289f()
            if (r2 != 0) goto L_0x0063
            goto L_0x0096
        L_0x0063:
            c6.i r6 = new c6.i
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L_0x006b:
            m28546B(r0, r2)
            goto L_0x0096
        L_0x006f:
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0087
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0096
        L_0x0087:
            r0.f68087p = r2
            goto L_0x0096
        L_0x008a:
            c6.g$p r2 = m28558w(r2)
            r0.f68091t = r2
            boolean r2 = r2.mo37289f()
            if (r2 != 0) goto L_0x0099
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0099:
            c6.i r6 = new c6.i
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L_0x00a1:
            c6.g$j0 r6 = r5.f68187b
            r6.mo37266c(r0)
            r5.f68187b = r0
            return
        L_0x00a9:
            c6.i r6 = new c6.i
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23793j.mo37364f(org.xml.sax.Attributes):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ae, code lost:
        continue;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37365g(org.xml.sax.Attributes r8) {
        /*
            r7 = this;
            c6.g$j0 r0 = r7.f68187b
            if (r0 == 0) goto L_0x00c2
            c6.g$s r0 = new c6.g$s
            r0.<init>()
            c6.g r1 = r7.f68186a
            r0.f68085a = r1
            c6.g$j0 r1 = r7.f68187b
            r0.f68086b = r1
            r7.mo37367i(r0, r8)
            r7.mo37370l(r0, r8)
            r7.mo37366h(r0, r8)
            r1 = 0
        L_0x001b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto L_0x00ba
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            c6.j$g r3 = p298c6.C23793j.C16858g.m16505a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L_0x00a2
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L_0x0084
            r4 = 37
            if (r3 == r4) goto L_0x0066
            switch(r3) {
                case 81: goto L_0x0051;
                case 82: goto L_0x004d;
                case 83: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x00ae
        L_0x0049:
            m28558w(r2)
            goto L_0x00ae
        L_0x004d:
            m28558w(r2)
            goto L_0x00ae
        L_0x0051:
            c6.g$p r2 = m28558w(r2)
            r0.f68114q = r2
            boolean r2 = r2.mo37289f()
            if (r2 != 0) goto L_0x005e
            goto L_0x00ae
        L_0x005e:
            c6.i r8 = new c6.i
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r8.<init>(r0)
            throw r8
        L_0x0066:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x0071
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f68112o = r2
            goto L_0x00ae
        L_0x0071:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x007c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f68112o = r2
            goto L_0x00ae
        L_0x007c:
            c6.i r8 = new c6.i
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r8.<init>(r0)
            throw r8
        L_0x0084:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x008f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f68113p = r2
            goto L_0x00ae
        L_0x008f:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x009a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f68113p = r2
            goto L_0x00ae
        L_0x009a:
            c6.i r8 = new c6.i
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r8.<init>(r0)
            throw r8
        L_0x00a2:
            c6.g$p r2 = m28558w(r2)
            r0.f68115r = r2
            boolean r2 = r2.mo37289f()
            if (r2 != 0) goto L_0x00b2
        L_0x00ae:
            int r1 = r1 + 1
            goto L_0x001b
        L_0x00b2:
            c6.i r8 = new c6.i
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r8.<init>(r0)
            throw r8
        L_0x00ba:
            c6.g$j0 r8 = r7.f68187b
            r8.mo37266c(r0)
            r7.f68187b = r0
            return
        L_0x00c2:
            c6.i r8 = new c6.i
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23793j.mo37365g(org.xml.sax.Attributes):void");
    }

    /* renamed from: h */
    public final void mo37366h(C23713g.C23741g0 g0Var, Attributes attributes) {
        HashSet hashSet;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = C16858g.m16505a(attributes.getLocalName(i)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        C23797i iVar = new C23797i(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!iVar.mo37385f()) {
                            String l = iVar.mo37391l();
                            if (l.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet2.add(l.substring(35));
                            } else {
                                hashSet2.add("UNSUPPORTED");
                            }
                            iVar.mo37396q();
                        }
                        g0Var.mo37280l(hashSet2);
                        break;
                    case 53:
                        g0Var.mo37275g(trim);
                        break;
                    case 54:
                        C23797i iVar2 = new C23797i(trim);
                        HashSet hashSet3 = new HashSet();
                        while (!iVar2.mo37385f()) {
                            hashSet3.add(iVar2.mo37391l());
                            iVar2.mo37396q();
                        }
                        g0Var.mo37274f(hashSet3);
                        break;
                    case 55:
                        List<String> t = m28555t(trim);
                        if (t == null) {
                            hashSet = new HashSet(0);
                        }
                        g0Var.mo37277i(hashSet);
                        break;
                }
            } else {
                C23797i iVar3 = new C23797i(trim);
                HashSet hashSet4 = new HashSet();
                while (!iVar3.mo37385f()) {
                    String l2 = iVar3.mo37391l();
                    int indexOf = l2.indexOf(45);
                    if (indexOf != -1) {
                        l2 = l2.substring(0, indexOf);
                    }
                    hashSet4.add(new Locale(l2, "", "").getLanguage());
                    iVar3.mo37396q();
                }
                g0Var.mo37272b(hashSet4);
            }
        }
    }

    /* renamed from: i */
    public final void mo37367i(C23713g.C23751l0 l0Var, Attributes attributes) {
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l0Var.f68075c = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    l0Var.f68076d = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    l0Var.f68076d = Boolean.TRUE;
                    return;
                } else {
                    throw new C23792i("Invalid value for \"xml:space\" attribute: " + trim);
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: j */
    public final void mo37368j(C23713g.C23746j jVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = C16858g.m16505a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 23) {
                jVar.f68067j = mo37354D(trim);
            } else if (ordinal != 24) {
                if (ordinal != 26) {
                    if (ordinal == 60) {
                        try {
                            jVar.f68068k = C23713g.C23748k.valueOf(trim);
                        } catch (IllegalArgumentException unused) {
                            throw new C23792i("Invalid spreadMethod attribute. \"" + trim + "\" is not a valid value.");
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    jVar.f68069l = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                jVar.f68066i = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(trim)) {
                jVar.f68066i = Boolean.TRUE;
            } else {
                throw new C23792i("Invalid value for attribute gradientUnits");
            }
        }
    }

    /* renamed from: k */
    public final void mo37369k(C23713g.C23778z zVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (C16858g.m16505a(attributes.getLocalName(i)) == C16858g.points) {
                C23797i iVar = new C23797i(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                iVar.mo37396q();
                while (!iVar.mo37385f()) {
                    float i2 = iVar.mo37388i();
                    if (!Float.isNaN(i2)) {
                        iVar.mo37395p();
                        float i3 = iVar.mo37388i();
                        if (!Float.isNaN(i3)) {
                            iVar.mo37395p();
                            arrayList.add(Float.valueOf(i2));
                            arrayList.add(Float.valueOf(i3));
                        } else {
                            throw new C23792i("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new C23792i("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                zVar.f68135o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    zVar.f68135o[i4] = ((Float) it.next()).floatValue();
                    i4++;
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo37370l(C23713g.C23751l0 l0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ordinal = C16858g.m16505a(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    C23690b.C23693d dVar = new C23690b.C23693d(trim);
                    ArrayList arrayList = null;
                    while (!dVar.mo37385f()) {
                        String l = dVar.mo37391l();
                        if (l != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(l);
                            dVar.mo37396q();
                        }
                    }
                    l0Var.f68079g = arrayList;
                } else if (ordinal != 72) {
                    if (l0Var.f68077e == null) {
                        l0Var.f68077e = new C23713g.C23727e0();
                    }
                    m28547H(l0Var.f68077e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    C23690b.C23693d dVar2 = new C23690b.C23693d(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (!dVar2.mo37385f()) {
                        dVar2.mo37396q();
                        String t = dVar2.mo37243t();
                        dVar2.mo37396q();
                        if (!dVar2.mo37383d(';')) {
                            if (!dVar2.mo37383d(XVFSFile.PATH_SEPARATOR_CHAR)) {
                                break;
                            }
                            dVar2.mo37396q();
                            String u = dVar2.mo37244u();
                            if (u != null) {
                                dVar2.mo37396q();
                                if (dVar2.mo37385f() || dVar2.mo37383d(';')) {
                                    if (l0Var.f68078f == null) {
                                        l0Var.f68078f = new C23713g.C23727e0();
                                    }
                                    m28547H(l0Var.f68078f, t, u);
                                    dVar2.mo37396q();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo37371m(C23713g.C23716a1 a1Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = C16858g.m16505a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                a1Var.f67939q = m28559x(trim);
            } else if (ordinal == 10) {
                a1Var.f67940r = m28559x(trim);
            } else if (ordinal == 82) {
                a1Var.f67937o = m28559x(trim);
            } else if (ordinal == 83) {
                a1Var.f67938p = m28559x(trim);
            }
        }
    }

    /* renamed from: n */
    public final void mo37372n(C23713g.C23754n nVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (C16858g.m16505a(attributes.getLocalName(i)) == C16858g.transform) {
                nVar.mo37282m(mo37354D(attributes.getValue(i)));
            }
        }
    }

    /* renamed from: o */
    public final void mo37373o(C23713g.C23763r0 r0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = C16858g.m16505a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 48) {
                m28546B(r0Var, trim);
            } else if (ordinal != 80) {
                continue;
            } else {
                C23797i iVar = new C23797i(trim);
                iVar.mo37396q();
                float i2 = iVar.mo37388i();
                iVar.mo37395p();
                float i3 = iVar.mo37388i();
                iVar.mo37395p();
                float i4 = iVar.mo37388i();
                iVar.mo37395p();
                float i5 = iVar.mo37388i();
                if (Float.isNaN(i2) || Float.isNaN(i3) || Float.isNaN(i4) || Float.isNaN(i5)) {
                    throw new C23792i("Invalid viewBox definition - should have four numbers");
                } else if (i4 < 0.0f) {
                    throw new C23792i("Invalid viewBox. width cannot be negative");
                } else if (i5 >= 0.0f) {
                    r0Var.f68111p = new C23713g.C23717b(i2, i3, i4, i5);
                } else {
                    throw new C23792i("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }
}
