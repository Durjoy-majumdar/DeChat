package p1054vg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vg.h */
public class C102189h {

    /* renamed from: a */
    public String f300886a;

    /* renamed from: b */
    public Map<String, C90802a> f300887b = new HashMap();

    /* renamed from: c */
    public int f300888c;

    /* renamed from: vg.h$a */
    public static class C90802a {

        /* renamed from: a */
        public String f260742a;

        /* renamed from: b */
        public String f260743b;

        /* renamed from: c */
        public String f260744c;

        /* renamed from: d */
        public String f260745d;

        /* renamed from: e */
        public int f260746e;

        public C90802a(String str, String str2, String str3, String str4, int i) {
            this.f260742a = str;
            this.f260743b = str2;
            this.f260744c = str3;
            this.f260746e = i;
            this.f260745d = str4;
        }

        /* renamed from: a */
        public int mo124917a() {
            return this.f260746e;
        }
    }

    public C102189h(String str, int i) {
        if (str == null) {
            this.f300886a = "http://dldir1.qq.com/weixin/android/";
        } else {
            this.f300886a = str;
        }
        this.f300888c = i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: ParserConfigurationException (unused javax.xml.parsers.ParserConfigurationException), SYNTHETIC, Splitter:B:15:0x004c] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1054vg.C102189h m134650b(java.lang.String r19) {
        /*
            r0 = r19
            if (r0 != 0) goto L_0x0006
            r1 = -1
            goto L_0x000c
        L_0x0006:
            r1 = 60
            int r1 = r0.indexOf(r1)
        L_0x000c:
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 >= 0) goto L_0x001e
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "text not in xml format"
            r0.println(r1)
        L_0x001b:
            r1 = r3
            goto L_0x00c8
        L_0x001e:
            if (r1 <= 0) goto L_0x003a
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "fix xml header from "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.println(r7)
            java.lang.String r0 = r0.substring(r1)
        L_0x003a:
            if (r0 == 0) goto L_0x001b
            int r1 = r0.length()
            if (r1 > 0) goto L_0x0043
            goto L_0x001b
        L_0x0043:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            javax.xml.parsers.DocumentBuilderFactory r6 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            javax.xml.parsers.DocumentBuilder r6 = r6.newDocumentBuilder()     // Catch:{ ParserConfigurationException -> 0x001b }
            if (r6 != 0) goto L_0x005b
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "new Document Builder failed"
            r0.println(r1)
            goto L_0x001b
        L_0x005b:
            org.xml.sax.InputSource r7 = new org.xml.sax.InputSource     // Catch:{ DOMException -> 0x0073, ParserConfigurationException -> 0x001b, ParserConfigurationException -> 0x001b }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ DOMException -> 0x0073, ParserConfigurationException -> 0x001b, ParserConfigurationException -> 0x001b }
            byte[] r0 = r0.getBytes()     // Catch:{ DOMException -> 0x0073, ParserConfigurationException -> 0x001b, ParserConfigurationException -> 0x001b }
            r8.<init>(r0)     // Catch:{ DOMException -> 0x0073, ParserConfigurationException -> 0x001b, ParserConfigurationException -> 0x001b }
            r7.<init>(r8)     // Catch:{ DOMException -> 0x0073, ParserConfigurationException -> 0x001b, ParserConfigurationException -> 0x001b }
            org.w3c.dom.Document r0 = r6.parse(r7)     // Catch:{ DOMException -> 0x0073, ParserConfigurationException -> 0x001b, ParserConfigurationException -> 0x001b }
            r0.normalize()     // Catch:{ DOMException -> 0x0071, ParserConfigurationException -> 0x001b, ParserConfigurationException -> 0x001b }
            goto L_0x0075
        L_0x0071:
            goto L_0x0075
        L_0x0073:
            r0 = r3
        L_0x0075:
            if (r0 != 0) goto L_0x0080
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "new Document failed"
            r0.println(r1)
            goto L_0x001b
        L_0x0080:
            org.w3c.dom.Element r0 = r0.getDocumentElement()
            if (r0 != 0) goto L_0x008e
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "getDocumentElement failed"
            r0.println(r1)
            goto L_0x001b
        L_0x008e:
            java.lang.String r6 = r0.getNodeName()
            java.lang.String r7 = "patchupdate"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x009f
            p1054vg.C102188f.m134649a(r1, r2, r2, r0, r5)
            goto L_0x00c8
        L_0x009f:
            org.w3c.dom.NodeList r0 = r0.getElementsByTagName(r7)
            int r6 = r0.getLength()
            if (r6 > 0) goto L_0x00b3
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "parse item null"
            r0.println(r1)
            goto L_0x001b
        L_0x00b3:
            int r6 = r0.getLength()
            if (r6 <= r4) goto L_0x00c1
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.String r7 = "parse items more than one"
            r6.println(r7)
        L_0x00c1:
            org.w3c.dom.Node r0 = r0.item(r5)
            p1054vg.C102188f.m134649a(r1, r2, r2, r0, r5)
        L_0x00c8:
            if (r1 != 0) goto L_0x00cb
            return r3
        L_0x00cb:
            vg.h r0 = new vg.h
            java.lang.String r3 = ".patchupdate.$base"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = ".patchupdate.$versioncode"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = p1054vg.C102190i.m134653a(r6, r5)
            r0.<init>(r3, r6)
            java.lang.String r3 = ".patchupdate.$count"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = p1054vg.C102190i.m134653a(r3, r5)
            r6 = 0
        L_0x00f1:
            if (r6 >= r3) goto L_0x01af
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = ".patchupdate.item"
            r7.append(r8)
            if (r6 <= 0) goto L_0x0104
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            goto L_0x0105
        L_0x0104:
            r8 = r2
        L_0x0105:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            vg.h$a r14 = new vg.h$a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r9 = ".$old"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r9 = ".$new"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            r16 = r8
            java.lang.String r16 = (java.lang.String) r16
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r9 = ".$patch"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            r17 = r8
            java.lang.String r17 = (java.lang.String) r17
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r9 = ".$url"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            r18 = r8
            java.lang.String r18 = (java.lang.String) r18
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = ".$size"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r13 = p1054vg.C102190i.m134653a(r7, r5)
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r12 = r18
            r8.<init>(r9, r10, r11, r12, r13)
            if (r15 == 0) goto L_0x01a1
            if (r16 == 0) goto L_0x01a1
            if (r17 == 0) goto L_0x01a1
            if (r18 == 0) goto L_0x01a1
            r7 = 1
            goto L_0x01a2
        L_0x01a1:
            r7 = 0
        L_0x01a2:
            if (r7 == 0) goto L_0x01ab
            java.util.Map<java.lang.String, vg.h$a> r7 = r0.f300887b
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.put(r15, r14)
        L_0x01ab:
            int r6 = r6 + 1
            goto L_0x00f1
        L_0x01af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1054vg.C102189h.m134650b(java.lang.String):vg.h");
    }

    /* renamed from: a */
    public C90802a mo141732a(String str) {
        return (C90802a) ((HashMap) this.f300887b).get(str);
    }

    /* renamed from: c */
    public String mo141733c() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<patchupdate base=\"%s\" count=\"%d\" versioncode=\"%d\">", new Object[]{this.f300886a, Integer.valueOf(((HashMap) this.f300887b).size()), Integer.valueOf(this.f300888c)}));
        for (Map.Entry value : ((HashMap) this.f300887b).entrySet()) {
            C90802a aVar = (C90802a) value.getValue();
            sb.append(String.format("<item old=\"%s\" new=\"%s\" patch=\"%s\" url=\"%s\" size=\"%s\"></item>", new Object[]{aVar.f260742a, aVar.f260743b, aVar.f260744c, aVar.f260745d, Integer.valueOf(aVar.f260746e)}));
        }
        sb.append("</patchupdate>");
        return sb.toString();
    }
}
