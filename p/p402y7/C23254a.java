package p402y7;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p333e8.C20551y;
import p333e8.C86467z;
import p383t7.C22440b;
import p383t7.C22442d;
import p383t7.C22444f;

/* renamed from: y7.a */
public final class C23254a extends C22440b {

    /* renamed from: n */
    public static final Pattern f66817n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o */
    public static final Pattern f66818o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p */
    public static final Pattern f66819p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q */
    public static final Pattern f66820q = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: r */
    public static final C23255a f66821r = new C23255a(30.0f, 1, 1);

    /* renamed from: m */
    public final XmlPullParserFactory f66822m;

    /* renamed from: y7.a$a */
    public static final class C23255a {

        /* renamed from: a */
        public final float f66823a;

        /* renamed from: b */
        public final int f66824b;

        /* renamed from: c */
        public final int f66825c;

        public C23255a(float f, int i, int i2) {
            this.f66823a = f;
            this.f66824b = i;
            this.f66825c = i2;
        }
    }

    public C23254a() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f66822m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: h */
    public static boolean m27705h(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data") || str.equals("smpte:information");
    }

    /* renamed from: i */
    public static void m27706i(String str, C23258d dVar) {
        Matcher matcher;
        String[] split = str.split("\\s+");
        if (split.length == 1) {
            matcher = f66819p.matcher(str);
        } else if (split.length == 2) {
            matcher = f66819p.matcher(split[1]);
        } else {
            throw new C22444f("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            char c = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    dVar.f66852j = 3;
                    break;
                case 1:
                    dVar.f66852j = 2;
                    break;
                case 2:
                    dVar.f66852j = 1;
                    break;
                default:
                    throw new C22444f("Invalid unit for fontSize: '" + group + "'.");
            }
            dVar.f66853k = Float.valueOf(matcher.group(1)).floatValue();
            return;
        }
        throw new C22444f("Invalid expression for fontSize: '" + str + "'.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        if (r13.equals(com.tencent.p014mm.sdk.platformtools.LocaleUtil.MALAY) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e7, code lost:
        r8 = r8 * r13;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m27707n(java.lang.String r13, p402y7.C23254a.C23255a r14) {
        /*
            java.util.regex.Pattern r0 = f66817n
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0076
            java.lang.String r13 = r0.group(r7)
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x0047
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0048
        L_0x0047:
            r9 = r4
        L_0x0048:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x005a
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f66823a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x005b
        L_0x005a:
            r9 = r4
        L_0x005b:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0071
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f66824b
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.f66823a
            double r13 = (double) r13
            double r4 = r0 / r13
        L_0x0071:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0076:
            java.util.regex.Pattern r0 = f66818o
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x00f2
            java.lang.String r13 = r0.group(r7)
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            r13.getClass()
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto L_0x00c6;
                case 104: goto L_0x00bb;
                case 109: goto L_0x00b0;
                case 116: goto L_0x00a4;
                case 3494: goto L_0x009b;
                default: goto L_0x0099;
            }
        L_0x0099:
            r4 = -1
            goto L_0x00d0
        L_0x009b:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00d0
            goto L_0x0099
        L_0x00a4:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00ae
            goto L_0x0099
        L_0x00ae:
            r4 = 3
            goto L_0x00d0
        L_0x00b0:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00b9
            goto L_0x0099
        L_0x00b9:
            r4 = 2
            goto L_0x00d0
        L_0x00bb:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00c4
            goto L_0x0099
        L_0x00c4:
            r4 = 1
            goto L_0x00d0
        L_0x00c6:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00cf
            goto L_0x0099
        L_0x00cf:
            r4 = 0
        L_0x00d0:
            switch(r4) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00e2;
                case 2: goto L_0x00df;
                case 3: goto L_0x00db;
                case 4: goto L_0x00d4;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            goto L_0x00ee
        L_0x00d4:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00d9:
            double r8 = r8 / r13
            goto L_0x00ee
        L_0x00db:
            int r13 = r14.f66825c
            double r13 = (double) r13
            goto L_0x00d9
        L_0x00df:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x00e7
        L_0x00e2:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x00e7:
            double r8 = r8 * r13
            goto L_0x00ee
        L_0x00ea:
            float r13 = r14.f66823a
            double r13 = (double) r13
            goto L_0x00d9
        L_0x00ee:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x00f2:
            t7.f r14 = new t7.f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p402y7.C23254a.m27707n(java.lang.String, y7.a$a):long");
    }

    /* renamed from: f */
    public C22442d mo14895f(byte[] bArr, int i, boolean z) {
        try {
            XmlPullParser newPullParser = this.f66822m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("", new C23257c((String) null, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
            int i2 = 0;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i);
            C23259e eVar = null;
            newPullParser.setInput(byteArrayInputStream, (String) null);
            LinkedList linkedList = new LinkedList();
            C23255a aVar = f66821r;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C23256b bVar = (C23256b) linkedList.peekLast();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = mo36726j(newPullParser);
                        }
                        if (!m27705h(name)) {
                            newPullParser.getName();
                        } else {
                            if ("head".equals(name)) {
                                mo36727k(newPullParser, hashMap, hashMap2);
                            } else {
                                try {
                                    C23256b l = mo36728l(newPullParser, bVar, hashMap2, aVar);
                                    linkedList.addLast(l);
                                    if (bVar != null) {
                                        if (bVar.f66836k == null) {
                                            bVar.f66836k = new ArrayList();
                                        }
                                        ((ArrayList) bVar.f66836k).add(l);
                                    }
                                } catch (C22444f unused) {
                                }
                            }
                            newPullParser.next();
                        }
                    } else {
                        if (eventType == 4) {
                            C23256b a = C23256b.m27714a(newPullParser.getText());
                            if (bVar.f66836k == null) {
                                bVar.f66836k = new ArrayList();
                            }
                            ((ArrayList) bVar.f66836k).add(a);
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                eVar = new C23259e((C23256b) linkedList.getLast(), hashMap, hashMap2);
                            }
                            linkedList.removeLast();
                        }
                        newPullParser.next();
                    }
                } else if (eventType != 2) {
                    if (eventType == 3) {
                        i2--;
                    }
                    newPullParser.next();
                }
                i2++;
                newPullParser.next();
            }
            return eVar;
        } catch (XmlPullParserException e) {
            throw new C22444f("Unable to decode source", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        }
    }

    /* renamed from: g */
    public final C23258d mo36725g(C23258d dVar) {
        return dVar == null ? new C23258d() : dVar;
    }

    /* renamed from: j */
    public final C23255a mo36726j(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(" ");
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new C22444f("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C23255a aVar = f66821r;
        int i = aVar.f66824b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = aVar.f66825c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C23255a(((float) parseInt) * f, i, i2);
    }

    /* renamed from: k */
    public final Map<String, C23258d> mo36727k(XmlPullParser xmlPullParser, Map<String, C23258d> map, Map<String, C23257c> map2) {
        boolean z;
        String a;
        int i;
        float f;
        do {
            xmlPullParser.next();
            z = false;
            if ((xmlPullParser.getEventType() == 2) && xmlPullParser.getName().equals("style")) {
                String a2 = C86467z.m107142a(xmlPullParser, "style");
                C23258d m = mo36729m(xmlPullParser, new C23258d());
                if (a2 != null) {
                    for (String str : a2.split("\\s+")) {
                        m.mo36733a(map.get(str));
                    }
                }
                String str2 = m.f66854l;
                if (str2 != null) {
                    map.put(str2, m);
                }
            } else {
                if ((xmlPullParser.getEventType() == 2) && xmlPullParser.getName().equals("region")) {
                    String a3 = C86467z.m107142a(xmlPullParser, "id");
                    C23257c cVar = null;
                    if (!(a3 == null || (a = C86467z.m107142a(xmlPullParser, FirebaseAnalytics.C113379b.ORIGIN)) == null)) {
                        Pattern pattern = f66820q;
                        Matcher matcher = pattern.matcher(a);
                        if (matcher.matches()) {
                            try {
                                float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                                float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                                String a4 = C86467z.m107142a(xmlPullParser, "extent");
                                if (a4 != null) {
                                    Matcher matcher2 = pattern.matcher(a4);
                                    if (matcher2.matches()) {
                                        float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                                        float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                                        String a5 = C86467z.m107142a(xmlPullParser, "displayAlign");
                                        if (a5 != null) {
                                            String l = C20551y.m22322l(a5);
                                            l.getClass();
                                            if (l.equals("center")) {
                                                f = parseFloat2 + (parseFloat4 / 2.0f);
                                                i = 1;
                                            } else if (l.equals("after")) {
                                                f = parseFloat2 + parseFloat4;
                                                i = 2;
                                            }
                                            cVar = new C23257c(a3, parseFloat, f, 0, i, parseFloat3);
                                        }
                                        f = parseFloat2;
                                        i = 0;
                                        cVar = new C23257c(a3, parseFloat, f, 0, i, parseFloat3);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    if (cVar != null) {
                        map2.put(cVar.f66837a, cVar);
                    }
                }
            }
            if ((xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals("head")) {
                z = true;
                continue;
            }
        } while (!z);
        return map;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p402y7.C23256b mo36728l(org.xmlpull.v1.XmlPullParser r19, p402y7.C23256b r20, java.util.Map<java.lang.String, p402y7.C23257c> r21, p402y7.C23254a.C23255a r22) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            int r3 = r19.getAttributeCount()
            r4 = 0
            r5 = r18
            y7.d r13 = r5.mo36729m(r0, r4)
            java.lang.String r9 = ""
            r14 = r4
            r15 = r9
            r4 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0025:
            if (r4 >= r3) goto L_0x00b1
            java.lang.String r6 = r0.getAttributeName(r4)
            java.lang.String r7 = r0.getAttributeValue(r4)
            r6.getClass()
            int r8 = r6.hashCode()
            r0 = 1
            switch(r8) {
                case -934795532: goto L_0x0068;
                case 99841: goto L_0x005d;
                case 100571: goto L_0x0052;
                case 93616297: goto L_0x0047;
                case 109780401: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0073
        L_0x003b:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0045
            goto L_0x0073
        L_0x0045:
            r6 = 4
            goto L_0x0074
        L_0x0047:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0050
            goto L_0x0073
        L_0x0050:
            r6 = 3
            goto L_0x0074
        L_0x0052:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x005b
            goto L_0x0073
        L_0x005b:
            r6 = 2
            goto L_0x0074
        L_0x005d:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            r6 = 1
            goto L_0x0074
        L_0x0068:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r6 = 0
            goto L_0x0074
        L_0x0073:
            r6 = -1
        L_0x0074:
            if (r6 == 0) goto L_0x00a2
            if (r6 == r0) goto L_0x0099
            r0 = 2
            if (r6 == r0) goto L_0x0093
            r0 = 3
            if (r6 == r0) goto L_0x008d
            r0 = 4
            if (r6 == r0) goto L_0x0082
            goto L_0x009f
        L_0x0082:
            java.lang.String r0 = "\\s+"
            java.lang.String[] r0 = r7.split(r0)
            int r6 = r0.length
            if (r6 <= 0) goto L_0x009f
            r14 = r0
            goto L_0x009f
        L_0x008d:
            long r6 = m27707n(r7, r2)
            r9 = r6
            goto L_0x009f
        L_0x0093:
            long r6 = m27707n(r7, r2)
            r11 = r6
            goto L_0x009f
        L_0x0099:
            long r6 = m27707n(r7, r2)
            r16 = r6
        L_0x009f:
            r0 = r21
            goto L_0x00ab
        L_0x00a2:
            r0 = r21
            boolean r6 = r0.containsKey(r7)
            if (r6 == 0) goto L_0x00ab
            r15 = r7
        L_0x00ab:
            int r4 = r4 + 1
            r0 = r19
            goto L_0x0025
        L_0x00b1:
            if (r1 == 0) goto L_0x00c9
            long r2 = r1.f66829d
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            long r9 = r9 + r2
        L_0x00c3:
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            long r11 = r11 + r2
            goto L_0x00ce
        L_0x00c9:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00ce:
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00e4
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00db
            long r16 = r9 + r16
            r11 = r16
            goto L_0x00e4
        L_0x00db:
            if (r1 == 0) goto L_0x00e4
            long r0 = r1.f66830e
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00e4
            r11 = r0
        L_0x00e4:
            java.lang.String r7 = r19.getName()
            y7.b r0 = new y7.b
            r8 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r11, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p402y7.C23254a.mo36728l(org.xmlpull.v1.XmlPullParser, y7.b, java.util.Map, y7.a$a):y7.b");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p402y7.C23258d mo36729m(org.xmlpull.v1.XmlPullParser r12, p402y7.C23258d r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x01d1
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1
            r7 = 4
            r8 = 2
            r9 = 3
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x007e;
                case -1224696685: goto L_0x0073;
                case -1065511464: goto L_0x0067;
                case -879295043: goto L_0x005b;
                case -734428249: goto L_0x0050;
                case 3355: goto L_0x0045;
                case 94842723: goto L_0x003a;
                case 365601008: goto L_0x002f;
                case 1287124693: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0089
        L_0x0021:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002b
            goto L_0x0089
        L_0x002b:
            r4 = 8
            goto L_0x008a
        L_0x002f:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0038
            goto L_0x0089
        L_0x0038:
            r4 = 7
            goto L_0x008a
        L_0x003a:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0043
            goto L_0x0089
        L_0x0043:
            r4 = 6
            goto L_0x008a
        L_0x0045:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x004e
            goto L_0x0089
        L_0x004e:
            r4 = 5
            goto L_0x008a
        L_0x0050:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0059
            goto L_0x0089
        L_0x0059:
            r4 = 4
            goto L_0x008a
        L_0x005b:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0065
            goto L_0x0089
        L_0x0065:
            r4 = 3
            goto L_0x008a
        L_0x0067:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0071
            goto L_0x0089
        L_0x0071:
            r4 = 2
            goto L_0x008a
        L_0x0073:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007c
            goto L_0x0089
        L_0x007c:
            r4 = 1
            goto L_0x008a
        L_0x007e:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r4 = 0
            goto L_0x008a
        L_0x0089:
            r4 = -1
        L_0x008a:
            switch(r4) {
                case 0: goto L_0x01c1;
                case 1: goto L_0x01ba;
                case 2: goto L_0x013c;
                case 3: goto L_0x00d7;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00b4;
                case 6: goto L_0x00a6;
                case 7: goto L_0x009d;
                case 8: goto L_0x008f;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x01cd
        L_0x008f:
            y7.d r13 = r11.mo36725g(r13)
            int r3 = p333e8.C20531e.m22244a(r3, r1)     // Catch:{ IllegalArgumentException -> 0x01cd }
            r13.f66846d = r3     // Catch:{ IllegalArgumentException -> 0x01cd }
            r13.f66847e = r10     // Catch:{ IllegalArgumentException -> 0x01cd }
            goto L_0x01cd
        L_0x009d:
            y7.d r13 = r11.mo36725g(r13)     // Catch:{  }
            m27706i(r3, r13)     // Catch:{  }
            goto L_0x01cd
        L_0x00a6:
            y7.d r13 = r11.mo36725g(r13)
            int r3 = p333e8.C20531e.m22244a(r3, r1)     // Catch:{ IllegalArgumentException -> 0x01cd }
            r13.f66844b = r3     // Catch:{ IllegalArgumentException -> 0x01cd }
            r13.f66845c = r10     // Catch:{ IllegalArgumentException -> 0x01cd }
            goto L_0x01cd
        L_0x00b4:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01cd
            y7.d r13 = r11.mo36725g(r13)
            r13.f66854l = r3
            goto L_0x01cd
        L_0x00c9:
            y7.d r13 = r11.mo36725g(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.f66850h = r3
            goto L_0x01cd
        L_0x00d7:
            java.lang.String r3 = p333e8.C20551y.m22322l(r3)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x0108;
                case -1026963764: goto L_0x00fc;
                case 913457136: goto L_0x00f1;
                case 1679736913: goto L_0x00e6;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            goto L_0x0112
        L_0x00e6:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ef
            goto L_0x0112
        L_0x00ef:
            r6 = 3
            goto L_0x0112
        L_0x00f1:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00fa
            goto L_0x0112
        L_0x00fa:
            r6 = 2
            goto L_0x0112
        L_0x00fc:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0106
            goto L_0x0112
        L_0x0106:
            r6 = 1
            goto L_0x0112
        L_0x0108:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r6 = 0
        L_0x0112:
            if (r6 == 0) goto L_0x0134
            if (r6 == r10) goto L_0x012c
            if (r6 == r8) goto L_0x0124
            if (r6 == r9) goto L_0x011c
            goto L_0x01cd
        L_0x011c:
            y7.d r13 = r11.mo36725g(r13)
            r13.f66848f = r10
            goto L_0x01cd
        L_0x0124:
            y7.d r13 = r11.mo36725g(r13)
            r13.f66848f = r1
            goto L_0x01cd
        L_0x012c:
            y7.d r13 = r11.mo36725g(r13)
            r13.f66849g = r10
            goto L_0x01cd
        L_0x0134:
            y7.d r13 = r11.mo36725g(r13)
            r13.f66849g = r1
            goto L_0x01cd
        L_0x013c:
            java.lang.String r3 = p333e8.C20551y.m22322l(r3)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0178;
                case 100571: goto L_0x016d;
                case 3317767: goto L_0x0162;
                case 108511772: goto L_0x0157;
                case 109757538: goto L_0x014b;
                default: goto L_0x014a;
            }
        L_0x014a:
            goto L_0x0182
        L_0x014b:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0155
            goto L_0x0182
        L_0x0155:
            r6 = 4
            goto L_0x0182
        L_0x0157:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0160
            goto L_0x0182
        L_0x0160:
            r6 = 3
            goto L_0x0182
        L_0x0162:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x016b
            goto L_0x0182
        L_0x016b:
            r6 = 2
            goto L_0x0182
        L_0x016d:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0176
            goto L_0x0182
        L_0x0176:
            r6 = 1
            goto L_0x0182
        L_0x0178:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0181
            goto L_0x0182
        L_0x0181:
            r6 = 0
        L_0x0182:
            if (r6 == 0) goto L_0x01b1
            if (r6 == r10) goto L_0x01a8
            if (r6 == r8) goto L_0x019f
            if (r6 == r9) goto L_0x0196
            if (r6 == r7) goto L_0x018d
            goto L_0x01cd
        L_0x018d:
            y7.d r13 = r11.mo36725g(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r13.f66855m = r3
            goto L_0x01cd
        L_0x0196:
            y7.d r13 = r11.mo36725g(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r13.f66855m = r3
            goto L_0x01cd
        L_0x019f:
            y7.d r13 = r11.mo36725g(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r13.f66855m = r3
            goto L_0x01cd
        L_0x01a8:
            y7.d r13 = r11.mo36725g(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r13.f66855m = r3
            goto L_0x01cd
        L_0x01b1:
            y7.d r13 = r11.mo36725g(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            r13.f66855m = r3
            goto L_0x01cd
        L_0x01ba:
            y7.d r13 = r11.mo36725g(r13)
            r13.f66843a = r3
            goto L_0x01cd
        L_0x01c1:
            y7.d r13 = r11.mo36725g(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.f66851i = r3
        L_0x01cd:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x01d1:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p402y7.C23254a.mo36729m(org.xmlpull.v1.XmlPullParser, y7.d):y7.d");
    }
}
