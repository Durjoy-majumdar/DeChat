package rq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p749xh.C102646h;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: rq2.t */
public final class C101433t {

    /* renamed from: a */
    public static final C101433t f297083a = new C101433t();

    /* renamed from: b */
    public static final ThreadLocal<XmlPullParser> f297084b = new ThreadLocal<>();

    /* renamed from: rq2.t$a */
    public static abstract class C101434a {

        /* renamed from: rq2.t$a$a */
        public static final class C101435a extends C101434a {

            /* renamed from: a */
            public String f297085a;

            /* renamed from: b */
            public List<C13604l<String, String>> f297086b;

            /* renamed from: c */
            public List<C101434a> f297087c;

            /* renamed from: d */
            public String f297088d;

            public C101435a(String str, List<C13604l<String, String>> list, List<C101434a> list2, String str2) {
                C87412m.m108594g(str, "name");
                C87412m.m108594g(list, "attributeList");
                C87412m.m108594g(list2, "subNodes");
                C87412m.m108594g(str2, "aliasName");
                this.f297085a = str;
                this.f297086b = list;
                this.f297087c = list2;
                this.f297088d = str2;
            }

            /* renamed from: a */
            public final void mo140936a(C101434a aVar) {
                SnsMethodCalculate.markStartTimeMs("addTag", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                C87412m.m108594g(aVar, "tag");
                this.f297087c.add(0, aVar);
                SnsMethodCalculate.markEndTimeMs("addTag", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
            }

            /* renamed from: b */
            public final String mo140937b() {
                SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                String str = this.f297085a;
                SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                return str;
            }

            /* renamed from: c */
            public final List<C101434a> mo140938c() {
                SnsMethodCalculate.markStartTimeMs("getSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                List<C101434a> list = this.f297087c;
                SnsMethodCalculate.markEndTimeMs("getSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                return list;
            }

            /* renamed from: d */
            public final void mo140939d(List<C101434a> list) {
                SnsMethodCalculate.markStartTimeMs("setSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                C87412m.m108594g(list, "<set-?>");
                this.f297087c = list;
                SnsMethodCalculate.markEndTimeMs("setSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
            }

            public String toString() {
                SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                String str = "TagBegin(name='" + this.f297085a + "', attributeList=" + this.f297086b + ", aliasName" + this.f297088d + ')';
                SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                return str;
            }
        }

        /* renamed from: rq2.t$a$b */
        public static final class C101436b extends C101434a {

            /* renamed from: a */
            public String f297089a;

            public C101436b(String str) {
                C87412m.m108594g(str, "name");
                this.f297089a = str;
            }

            public String toString() {
                SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
                String str = "TagEnd(name='" + this.f297089a + "')";
                SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
                return str;
            }
        }

        /* renamed from: rq2.t$a$c */
        public static final class C101437c extends C101434a {

            /* renamed from: a */
            public String f297090a;

            public C101437c(String str) {
                C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
                this.f297090a = str;
            }

            public String toString() {
                SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
                String str = "XmlText(text='" + this.f297090a + "')";
                SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
                return str;
            }
        }
    }

    /* renamed from: rq2.t$b */
    public static final class C101438b extends C87413o implements C32226l<C101434a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ XmlSerializer f297091d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101438b(XmlSerializer xmlSerializer) {
            super(1);
            this.f297091d = xmlSerializer;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
            C101434a aVar = (C101434a) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
            C87412m.m108594g(aVar, "curNode");
            if (aVar instanceof C101434a.C101435a) {
                C101434a.C101435a aVar2 = (C101434a.C101435a) aVar;
                this.f297091d.startTag((String) null, aVar2.mo140937b());
                SnsMethodCalculate.markStartTimeMs("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                List<C13604l<String, String>> list = aVar2.f297086b;
                SnsMethodCalculate.markEndTimeMs("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                XmlSerializer xmlSerializer = this.f297091d;
                for (C13604l lVar : list) {
                    xmlSerializer.attribute((String) null, (String) lVar.f38555d, (String) lVar.f38556e);
                }
            } else if (aVar instanceof C101434a.C101436b) {
                this.f297091d.text("");
                XmlSerializer xmlSerializer2 = this.f297091d;
                SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
                String str = ((C101434a.C101436b) aVar).f297089a;
                SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
                xmlSerializer2.endTag((String) null, str);
            } else if (aVar instanceof C101434a.C101437c) {
                XmlSerializer xmlSerializer3 = this.f297091d;
                SnsMethodCalculate.markStartTimeMs("getText", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
                String str2 = ((C101434a.C101437c) aVar).f297090a;
                SnsMethodCalculate.markEndTimeMs("getText", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
                xmlSerializer3.text(str2);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
            return b0Var;
        }
    }

    /* renamed from: a */
    public static final boolean m133133a(C101434a.C101435a aVar, String str) {
        C101434a.C101435a aVar2;
        SnsMethodCalculate.markStartTimeMs("deleteNodeByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("deleteNodeByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return false;
        }
        C13604l<C101434a.C101435a, Object> e = f297083a.mo140934e(aVar, str);
        List<C101434a> list = null;
        B b = e != null ? e.f38556e : null;
        if (!(e == null || (aVar2 = (C101434a.C101435a) e.f38555d) == null)) {
            list = aVar2.mo140938c();
        }
        if (b == null || list == null || !(b instanceof C101434a.C101435a)) {
            Log.m105920e("AD.XMLUtil", "remove failed");
            SnsMethodCalculate.markEndTimeMs("deleteNodeByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return false;
        }
        boolean remove = list.remove(b);
        SnsMethodCalculate.markEndTimeMs("deleteNodeByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        return remove;
    }

    /* renamed from: b */
    public static final C101434a.C101435a m133134b(C101434a.C101435a aVar) {
        SnsMethodCalculate.markStartTimeMs("findAdXml", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("findAdXml", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        SnsMethodCalculate.markStartTimeMs("findOneTagWithRoot$default", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        SnsMethodCalculate.markStartTimeMs("findOneTagWithRoot", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        try {
            if (C87412m.m108589b(aVar.mo140937b(), C102646h.COL_ADXML)) {
                SnsMethodCalculate.markEndTimeMs("findOneTagWithRoot", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            } else {
                aVar = f297083a.mo140933d(aVar, C102646h.COL_ADXML, 0, 0);
                SnsMethodCalculate.markEndTimeMs("findOneTagWithRoot", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("AD.XMLUtil", th, "findOneTag() called with: findTagName = adxml", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("findOneTagWithRoot", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            aVar = null;
        }
        SnsMethodCalculate.markEndTimeMs("findOneTagWithRoot$default", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        SnsMethodCalculate.markEndTimeMs("findAdXml", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        return aVar;
    }

    /* renamed from: c */
    public static final C101434a.C101435a m133135c(C101434a.C101435a aVar, String str) {
        SnsMethodCalculate.markStartTimeMs("findByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        C101434a.C101435a aVar2 = null;
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("findByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        } else if (str == null) {
            SnsMethodCalculate.markEndTimeMs("findByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        } else {
            C13604l<C101434a.C101435a, Object> e = f297083a.mo140934e(aVar, str);
            B b = e != null ? e.f38556e : null;
            if (b instanceof C101434a.C101435a) {
                aVar2 = (C101434a.C101435a) b;
            }
            SnsMethodCalculate.markEndTimeMs("findByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return aVar2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final rq2.C101433t.C101434a.C101435a m133136f(java.lang.String r9) {
        /*
            java.lang.String r0 = "readXmlNode"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.utils.XMLUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "readXmlNodeInternal"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            r3 = 0
            r4 = 0
            if (r9 != 0) goto L_0x0018
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x0015:
            r5 = r3
            goto L_0x0089
        L_0x0018:
            gy3.f0 r5 = new gy3.f0     // Catch:{ all -> 0x007a }
            r5.<init>()     // Catch:{ all -> 0x007a }
            java.lang.ThreadLocal<org.xmlpull.v1.XmlPullParser> r6 = f297084b     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r6.get()     // Catch:{ all -> 0x007a }
            r5.f27484d = r7     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0034
            org.xmlpull.v1.XmlPullParserFactory r7 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ all -> 0x007a }
            org.xmlpull.v1.XmlPullParser r7 = r7.newPullParser()     // Catch:{ all -> 0x007a }
            r5.f27484d = r7     // Catch:{ all -> 0x007a }
            r6.set(r7)     // Catch:{ all -> 0x007a }
        L_0x0034:
            T r6 = r5.f27484d     // Catch:{ all -> 0x007a }
            r7 = r6
            org.xmlpull.v1.XmlPullParser r7 = (org.xmlpull.v1.XmlPullParser) r7     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x003f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ all -> 0x007a }
            goto L_0x0015
        L_0x003f:
            org.xmlpull.v1.XmlPullParser r6 = (org.xmlpull.v1.XmlPullParser) r6     // Catch:{ all -> 0x007a }
            java.io.StringReader r7 = new java.io.StringReader     // Catch:{ all -> 0x007a }
            r7.<init>(r9)     // Catch:{ all -> 0x007a }
            r6.setInput(r7)     // Catch:{ all -> 0x007a }
            gy3.d0 r6 = new gy3.d0     // Catch:{ all -> 0x007a }
            r6.<init>()     // Catch:{ all -> 0x007a }
            T r7 = r5.f27484d     // Catch:{ all -> 0x007a }
            org.xmlpull.v1.XmlPullParser r7 = (org.xmlpull.v1.XmlPullParser) r7     // Catch:{ all -> 0x007a }
            int r7 = r7.getEventType()     // Catch:{ all -> 0x007a }
            r6.f27483d = r7     // Catch:{ all -> 0x007a }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x007a }
            r7.<init>()     // Catch:{ all -> 0x007a }
            m133137g(r6, r5, r7)     // Catch:{ all -> 0x007a }
            int r5 = r7.size()     // Catch:{ all -> 0x007a }
            if (r5 <= 0) goto L_0x0076
            java.lang.Object r5 = r7.get(r4)     // Catch:{ all -> 0x007a }
            boolean r6 = r5 instanceof rq2.C101433t.C101434a.C101435a     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x0071
            rq2.t$a$a r5 = (rq2.C101433t.C101434a.C101435a) r5     // Catch:{ all -> 0x007a }
            goto L_0x0072
        L_0x0071:
            r5 = r3
        L_0x0072:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ all -> 0x007a }
            goto L_0x0089
        L_0x0076:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ all -> 0x007a }
            goto L_0x0015
        L_0x007a:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = "AD.XMLUtil"
            java.lang.String r8 = "readXmlNode() called"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r5, r8, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x0015
        L_0x0089:
            r2 = 1967(0x7af, float:2.756E-42)
            if (r5 != 0) goto L_0x00b7
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 6
            r6.mo175911u(r2, r7)
            if (r9 == 0) goto L_0x009d
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            java.lang.String r3 = z04.C112551y.m153814n(r9, r2, r3, r4)
        L_0x009d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = ""
            r9.append(r2)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "report_xml_node_utils_error"
            java.lang.String r3 = "0"
            vr2.C37817q.m41546b(r2, r3, r4, r4, r9)
            goto L_0x00bd
        L_0x00b7:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 7
            r9.mo175911u(r2, r3)
        L_0x00bd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.C101433t.m133136f(java.lang.String):rq2.t$a$a");
    }

    /* renamed from: g */
    public static final void m133137g(C8478d0 d0Var, C8479f0<XmlPullParser> f0Var, List<C101434a> list) {
        LinkedHashMap linkedHashMap;
        C101434a.C101435a aVar;
        C8478d0 d0Var2 = d0Var;
        C8479f0<XmlPullParser> f0Var2 = f0Var;
        SnsMethodCalculate.markStartTimeMs("readXmlNodeInternal$readNode", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (d0Var2.f27483d != 1) {
            int next = ((XmlPullParser) f0Var2.f27484d).next();
            d0Var2.f27483d = next;
            if (next != 2) {
                if (next == 3) {
                    String name = ((XmlPullParser) f0Var2.f27484d).getName();
                    C87412m.m108593f(name, "xmlParser.name");
                    aVar = new C101434a.C101436b(name);
                } else if (next != 4) {
                    Log.m105920e("AD.XMLUtil", "readNode unknown type = " + d0Var2.f27483d);
                    aVar = null;
                } else {
                    String text = ((XmlPullParser) f0Var2.f27484d).getText();
                    C87412m.m108593f(text, "xmlParser.text");
                    aVar = new C101434a.C101437c(text);
                }
                linkedHashMap = linkedHashMap2;
            } else {
                Integer num = (Integer) linkedHashMap2.get(((XmlPullParser) f0Var2.f27484d).getName());
                int intValue = num != null ? num.intValue() + 1 : 1;
                String name2 = ((XmlPullParser) f0Var2.f27484d).getName();
                C87412m.m108593f(name2, "xmlParser.name");
                linkedHashMap2.put(name2, Integer.valueOf(intValue));
                ArrayList arrayList = new ArrayList();
                int i = intValue - 1;
                String str = "";
                String valueOf = i == 0 ? str : String.valueOf(i);
                String name3 = ((XmlPullParser) f0Var2.f27484d).getName();
                C87412m.m108593f(name3, "xmlParser.name");
                T t = f0Var2.f27484d;
                C87412m.m108593f(t, "xmlParser");
                XmlPullParser xmlPullParser = (XmlPullParser) t;
                SnsMethodCalculate.markStartTimeMs("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                ArrayList arrayList2 = new ArrayList();
                int attributeCount = xmlPullParser.getAttributeCount();
                int i2 = 0;
                while (i2 < attributeCount) {
                    String attributeName = xmlPullParser.getAttributeName(i2);
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    String str2 = attributeName == null ? str : attributeName;
                    String attributeValue = xmlPullParser.getAttributeValue(i2);
                    String str3 = str;
                    if (attributeValue != null) {
                        str = attributeValue;
                    }
                    arrayList2.add(new C13604l(str2, str));
                    i2++;
                    linkedHashMap2 = linkedHashMap3;
                    str = str3;
                }
                linkedHashMap = linkedHashMap2;
                SnsMethodCalculate.markEndTimeMs("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                C101434a.C101435a aVar2 = new C101434a.C101435a(name3, arrayList2, arrayList, ((XmlPullParser) f0Var2.f27484d).getName() + valueOf);
                m133137g(d0Var2, f0Var2, arrayList);
                aVar = aVar2;
            }
            List<C101434a> list2 = list;
            if (aVar != null) {
                list2.add(aVar);
                if (aVar instanceof C101434a.C101436b) {
                    SnsMethodCalculate.markEndTimeMs("readXmlNodeInternal$readNode", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                    return;
                }
            }
            linkedHashMap2 = linkedHashMap;
        }
        SnsMethodCalculate.markEndTimeMs("readXmlNodeInternal$readNode", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
    }

    /* renamed from: h */
    public static final String m133138h(C101434a.C101435a aVar) {
        SnsMethodCalculate.markStartTimeMs("serialize", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("serialize", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(stringWriter);
            f297083a.mo140935i(aVar, new C101438b(newSerializer));
            newSerializer.endDocument();
            stringWriter.flush();
            stringWriter.close();
            Log.m105924i("AD.XMLUtil", "cost = " + (System.currentTimeMillis() - currentTimeMillis));
            String str = "" + stringWriter.getBuffer();
            SnsMethodCalculate.markEndTimeMs("serialize", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return str;
        } catch (Throwable th) {
            Log.printErrStackTrace("AD.XMLUtil", th, "serialize() called", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("serialize", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
    }

    /* renamed from: d */
    public final C101434a.C101435a mo140933d(C101434a.C101435a aVar, String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (i <= 0 || i2 <= i) {
            List<C101434a> c = aVar.mo140938c();
            if (c != null) {
                for (C101434a aVar2 : c) {
                    if (aVar2 instanceof C101434a.C101435a) {
                        C101434a.C101435a aVar3 = (C101434a.C101435a) aVar2;
                        if (C87412m.m108589b(aVar3.mo140937b(), str)) {
                            SnsMethodCalculate.markEndTimeMs("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                            return aVar3;
                        }
                        C101434a.C101435a d = f297083a.mo140933d(aVar3, str, i, i2 + 1);
                        if (d != null) {
                            SnsMethodCalculate.markEndTimeMs("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                            return d;
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        SnsMethodCalculate.markEndTimeMs("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: rx3.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: rq2.t$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: rq2.t$a$a} */
    /* JADX WARNING: type inference failed for: r3v2, types: [rx3.l<rq2.t$a$a, java.lang.Object>] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v10, types: [rq2.t$a] */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c3 A[Catch:{ all -> 0x00ab, all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f7 A[Catch:{ all -> 0x00ab, all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f2 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<rq2.C101433t.C101434a.C101435a, java.lang.Object> mo140934e(rq2.C101433t.C101434a.C101435a r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "findTagOrAttrByPathWithParent"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.utils.XMLUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            if (r0 != 0) goto L_0x0010
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x0010:
            r4 = 0
            if (r19 == 0) goto L_0x0127
            java.lang.String r5 = "."
            java.lang.String[] r6 = new java.lang.String[]{r5}     // Catch:{ all -> 0x0123 }
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r19
            java.util.List r5 = z04.C112550d0.m153785U(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0123 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0123 }
            if (r6 == 0) goto L_0x002d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x0123 }
            return r3
        L_0x002d:
            int r6 = r5.size()     // Catch:{ all -> 0x0123 }
            r7 = 1
            java.util.List r5 = r5.subList(r7, r6)     // Catch:{ all -> 0x0123 }
            java.lang.Object r6 = r5.get(r4)     // Catch:{ all -> 0x0123 }
            java.lang.String r8 = r18.mo140937b()     // Catch:{ all -> 0x0123 }
            boolean r6 = gy3.C87412m.m108589b(r6, r8)     // Catch:{ all -> 0x0123 }
            if (r6 != 0) goto L_0x0048
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x0123 }
            return r3
        L_0x0048:
            int r6 = r5.size()     // Catch:{ all -> 0x0123 }
            if (r6 != r7) goto L_0x0057
            rx3.l r5 = new rx3.l     // Catch:{ all -> 0x0123 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0123 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x0123 }
            return r5
        L_0x0057:
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x0123 }
            r8 = r0
            r9 = r8
            r10 = 0
        L_0x005e:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x0123 }
            if (r11 == 0) goto L_0x011a
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x0123 }
            int r12 = r10 + 1
            if (r10 < 0) goto L_0x0115
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0123 }
            if (r10 != 0) goto L_0x0072
            r10 = r12
            goto L_0x005e
        L_0x0072:
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin"
            if (r9 == 0) goto L_0x00b2
            java.util.List r14 = r9.mo140938c()     // Catch:{ all -> 0x0123 }
            if (r14 == 0) goto L_0x00b2
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0123 }
            r15 = r3
        L_0x0081:
            boolean r16 = r14.hasNext()     // Catch:{ all -> 0x0123 }
            if (r16 == 0) goto L_0x00b3
            java.lang.Object r16 = r14.next()     // Catch:{ all -> 0x0123 }
            r4 = r16
            rq2.t$a r4 = (rq2.C101433t.C101434a) r4     // Catch:{ all -> 0x0123 }
            boolean r7 = r4 instanceof rq2.C101433t.C101434a.C101435a     // Catch:{ all -> 0x012c }
            if (r7 == 0) goto L_0x00ae
            r7 = r4
            rq2.t$a$a r7 = (rq2.C101433t.C101434a.C101435a) r7     // Catch:{ all -> 0x012c }
            r7.getClass()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "getAliasName"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r13)     // Catch:{ all -> 0x012c }
            java.lang.String r7 = r7.f297088d     // Catch:{ all -> 0x012c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r13)     // Catch:{ all -> 0x012c }
            boolean r3 = gy3.C87412m.m108589b(r7, r11)     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x00ae
            r15 = r4
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            goto L_0x0125
        L_0x00ae:
            r3 = 0
            r4 = 0
            r7 = 1
            goto L_0x0081
        L_0x00b2:
            r15 = 0
        L_0x00b3:
            if (r15 != 0) goto L_0x00f0
            if (r9 == 0) goto L_0x00f0
            java.lang.String r3 = "getAttributeList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r13)     // Catch:{ all -> 0x012c }
            java.util.List<rx3.l<java.lang.String, java.lang.String>> r4 = r9.f297086b     // Catch:{ all -> 0x012c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r13)     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x00f0
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x012c }
        L_0x00c7:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x00f0
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x012c }
            rx3.l r4 = (rx3.C13604l) r4     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r7.<init>()     // Catch:{ all -> 0x012c }
            r13 = 36
            r7.append(r13)     // Catch:{ all -> 0x012c }
            A r13 = r4.f38555d     // Catch:{ all -> 0x012c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x012c }
            r7.append(r13)     // Catch:{ all -> 0x012c }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x012c }
            boolean r7 = gy3.C87412m.m108589b(r7, r11)     // Catch:{ all -> 0x012c }
            if (r7 == 0) goto L_0x00c7
            r15 = r4
            goto L_0x00c7
        L_0x00f0:
            if (r15 != 0) goto L_0x00f7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x012c }
            r1 = 0
            return r1
        L_0x00f7:
            int r3 = r5.size()     // Catch:{ all -> 0x012c }
            r4 = 1
            int r3 = r3 - r4
            if (r10 != r3) goto L_0x0101
            r0 = r9
            r8 = r15
        L_0x0101:
            boolean r3 = r15 instanceof rq2.C101433t.C101434a.C101435a     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x010f
            boolean r3 = r15 instanceof rq2.C101433t.C101434a.C101435a     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x010d
            r3 = r15
            rq2.t$a$a r3 = (rq2.C101433t.C101434a.C101435a) r3     // Catch:{ all -> 0x012c }
            goto L_0x010e
        L_0x010d:
            r3 = 0
        L_0x010e:
            r9 = r3
        L_0x010f:
            r10 = r12
            r3 = 0
            r4 = 0
            r7 = 1
            goto L_0x005e
        L_0x0115:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x012c }
            r3 = 0
            throw r3     // Catch:{ all -> 0x012c }
        L_0x011a:
            rx3.l r3 = new rx3.l     // Catch:{ all -> 0x012c }
            r3.<init>(r0, r8)     // Catch:{ all -> 0x012c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x012c }
            return r3
        L_0x0123:
            r0 = move-exception
        L_0x0124:
            r3 = 0
        L_0x0125:
            r4 = 0
            goto L_0x012e
        L_0x0127:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x012c }
            r3 = 0
            return r3
        L_0x012c:
            r0 = move-exception
            goto L_0x0124
        L_0x012e:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "AD.XMLUtil"
            java.lang.String r6 = "findByPathWithParent error !"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.C101433t.mo140934e(rq2.t$a$a, java.lang.String):rx3.l");
    }

    /* renamed from: i */
    public final void mo140935i(C101434a aVar, C32226l<? super C101434a, C13598b0> lVar) {
        SnsMethodCalculate.markStartTimeMs("traverse", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        C87412m.m108594g(aVar, "<this>");
        C87412m.m108594g(lVar, "f");
        lVar.invoke(aVar);
        if (aVar instanceof C101434a.C101435a) {
            for (C101434a i : ((C101434a.C101435a) aVar).mo140938c()) {
                f297083a.mo140935i(i, lVar);
            }
        }
        SnsMethodCalculate.markEndTimeMs("traverse", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
    }
}
