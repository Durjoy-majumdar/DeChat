package com.tencent.p014mm.model.newabtest;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30719a;
import com.tencent.p014mm.storage.C96980c;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* renamed from: com.tencent.mm.model.newabtest.a */
public class C92722a {

    /* renamed from: a */
    public static DocumentBuilder f266842a;

    /* renamed from: com.tencent.mm.model.newabtest.a$a */
    public static class C28979a {

        /* renamed from: a */
        public List<C96980c> f79472a = new LinkedList();

        /* renamed from: b */
        public List<C30719a> f79473b = new LinkedList();
    }

    /* renamed from: a */
    public static C96980c m116884a(Element element) {
        Node namedItem;
        C96980c cVar = new C96980c();
        NamedNodeMap attributes = element.getAttributes();
        if (attributes == null || (namedItem = attributes.getNamedItem("layerid")) == null) {
            return null;
        }
        cVar.field_layerId = namedItem.getNodeValue();
        Node namedItem2 = attributes.getNamedItem("id");
        if (namedItem2 == null) {
            return null;
        }
        cVar.field_expId = namedItem2.getNodeValue();
        Node namedItem3 = attributes.getNamedItem("business");
        if (namedItem3 == null) {
            cVar.field_business = "";
        } else {
            cVar.field_business = namedItem3.getNodeValue();
        }
        NodeList elementsByTagName = element.getElementsByTagName("sequence");
        if (elementsByTagName.getLength() == 0) {
            return null;
        }
        cVar.field_sequence = Util.getLong(elementsByTagName.item(0).getTextContent(), 0);
        NodeList elementsByTagName2 = element.getElementsByTagName("prioritylevel");
        if (elementsByTagName2.getLength() > 0) {
            cVar.field_prioritylevel = Util.getInt(elementsByTagName2.item(0).getTextContent(), 0);
        } else {
            cVar.field_prioritylevel = 0;
        }
        NodeList elementsByTagName3 = element.getElementsByTagName("starttime");
        if (elementsByTagName3.getLength() > 0) {
            long j = Util.getLong(elementsByTagName3.item(0).getTextContent(), 0);
            cVar.field_startTime = j;
            if (j == 0) {
                cVar.field_startTime = System.currentTimeMillis() / 1000;
            }
        } else {
            cVar.field_startTime = System.currentTimeMillis() / 1000;
        }
        NodeList elementsByTagName4 = element.getElementsByTagName("endtime");
        if (elementsByTagName4.getLength() > 0) {
            long j2 = Util.getLong(elementsByTagName4.item(0).getTextContent(), 0);
            cVar.field_endTime = j2;
            if (j2 == 0) {
                cVar.field_endTime = MAlarmHandler.NEXT_FIRE_INTERVAL;
            }
        } else {
            cVar.field_endTime = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        NodeList elementsByTagName5 = element.getElementsByTagName("noreport");
        if (elementsByTagName5.getLength() > 0) {
            cVar.field_needReport = Util.getInt(elementsByTagName5.item(0).getTextContent(), 0) == 0;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.transform(new DOMSource(element), new StreamResult(stringWriter));
        } catch (TransformerException e) {
            Log.printErrStackTrace("MicroMsg.ABTestParser", e, "nodeToString", new Object[0]);
        }
        cVar.field_rawXML = stringWriter.toString();
        return cVar;
    }

    /* renamed from: b */
    public static List<C30719a> m116885b(Element element, int i) {
        Node namedItem;
        long j;
        Element element2 = element;
        LinkedList linkedList = new LinkedList();
        NamedNodeMap attributes = element.getAttributes();
        if (attributes == null || (namedItem = attributes.getNamedItem("id")) == null) {
            return null;
        }
        String nodeValue = namedItem.getNodeValue();
        NodeList elementsByTagName = element2.getElementsByTagName("sequence");
        if (elementsByTagName.getLength() == 0) {
            return null;
        }
        long j2 = Util.getLong(elementsByTagName.item(0).getTextContent(), 0);
        NodeList elementsByTagName2 = element2.getElementsByTagName("starttime");
        if (elementsByTagName2.getLength() > 0) {
            j = Util.getLong(elementsByTagName2.item(0).getTextContent(), 0);
            if (j == 0) {
                j = System.currentTimeMillis() / 1000;
            }
        } else {
            j = System.currentTimeMillis() / 1000;
        }
        NodeList elementsByTagName3 = element2.getElementsByTagName("endtime");
        int length = elementsByTagName3.getLength();
        long j3 = MAlarmHandler.NEXT_FIRE_INTERVAL;
        if (length > 0) {
            long j4 = Util.getLong(elementsByTagName3.item(0).getTextContent(), 0);
            if (j4 != 0) {
                j3 = j4;
            }
        }
        NodeList elementsByTagName4 = element2.getElementsByTagName("noreport");
        short s = 1;
        boolean z = elementsByTagName4.getLength() > 0 && Util.getInt(elementsByTagName4.item(0).getTextContent(), 0) == 1;
        HashMap hashMap = new HashMap();
        NodeList elementsByTagName5 = element2.getElementsByTagName("args");
        if (elementsByTagName5.getLength() > 0) {
            NodeList childNodes = elementsByTagName5.item(0).getChildNodes();
            int i2 = 0;
            while (i2 < childNodes.getLength()) {
                Node item = childNodes.item(i2);
                if (item.getNodeType() == s && item.getNodeName().equals("arg")) {
                    Element element3 = (Element) item;
                    NodeList elementsByTagName6 = element3.getElementsByTagName("key");
                    NodeList elementsByTagName7 = element3.getElementsByTagName("value");
                    if (!(elementsByTagName6.getLength() == 0 || elementsByTagName7.getLength() == 0)) {
                        hashMap.put(elementsByTagName6.item(0).getTextContent(), elementsByTagName7.item(0).getTextContent());
                    }
                }
                i2++;
                s = 1;
            }
        }
        for (String str : hashMap.keySet()) {
            C30719a aVar = new C30719a();
            aVar.field_abtestkey = str;
            aVar.field_value = (String) hashMap.get(str);
            aVar.field_expId = nodeValue;
            aVar.field_sequence = j2;
            aVar.field_prioritylevel = i;
            aVar.field_startTime = j;
            aVar.field_endTime = j3;
            aVar.field_noReport = z;
            linkedList.add(aVar);
        }
        return linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.model.newabtest.C92722a.C28979a m116886c(java.lang.String r10) {
        /*
            com.tencent.mm.model.newabtest.a$a r0 = new com.tencent.mm.model.newabtest.a$a
            r0.<init>()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            java.lang.String r4 = "MicroMsg.ABTestParser"
            java.lang.String r5 = "ABTest msg content: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r2)
            org.w3c.dom.Element r2 = m116887d(r10)
            if (r2 != 0) goto L_0x0022
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            java.lang.String r10 = "Msg parsing failed, msg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r10, r1)
            return r0
        L_0x0022:
            org.w3c.dom.NamedNodeMap r10 = r2.getAttributes()
            if (r10 != 0) goto L_0x002a
            r10 = 0
            return r10
        L_0x002a:
            java.lang.String r5 = "type"
            org.w3c.dom.Node r10 = r10.getNamedItem(r5)
            if (r10 == 0) goto L_0x005a
            java.lang.String r10 = r10.getNodeValue()
            java.lang.String r5 = "newabtestinfo"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L_0x005a
            java.lang.String r10 = "prioritylevel"
            org.w3c.dom.NodeList r10 = r2.getElementsByTagName(r10)
            int r5 = r10.getLength()
            if (r5 <= 0) goto L_0x005a
            org.w3c.dom.Node r10 = r10.item(r3)
            java.lang.String r10 = r10.getTextContent()
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r1)
            goto L_0x005b
        L_0x005a:
            r10 = 1
        L_0x005b:
            org.w3c.dom.NodeList r2 = r2.getChildNodes()
            r5 = 0
        L_0x0060:
            int r6 = r2.getLength()
            if (r5 >= r6) goto L_0x00c2
            org.w3c.dom.Node r6 = r2.item(r5)
            if (r6 != 0) goto L_0x006d
            goto L_0x00bf
        L_0x006d:
            short r7 = r6.getNodeType()
            if (r7 != r1) goto L_0x0097
            java.lang.String r7 = r6.getNodeName()
            java.lang.String r8 = "exp"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0097
            r7 = r6
            org.w3c.dom.Element r7 = (org.w3c.dom.Element) r7     // Catch:{ Exception -> 0x008e }
            com.tencent.mm.storage.c r7 = m116884a(r7)     // Catch:{ Exception -> 0x008e }
            java.util.List<com.tencent.mm.storage.c> r8 = r0.f79472a     // Catch:{ Exception -> 0x008e }
            java.util.LinkedList r8 = (java.util.LinkedList) r8     // Catch:{ Exception -> 0x008e }
            r8.add(r7)     // Catch:{ Exception -> 0x008e }
            goto L_0x0097
        L_0x008e:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = "parseExp"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r7, r9, r8)
        L_0x0097:
            short r7 = r6.getNodeType()
            if (r7 != r1) goto L_0x00bf
            java.lang.String r7 = r6.getNodeName()
            java.lang.String r8 = "expinfo"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00bf
            org.w3c.dom.Element r6 = (org.w3c.dom.Element) r6     // Catch:{ Exception -> 0x00b7 }
            java.util.List r6 = m116885b(r6, r10)     // Catch:{ Exception -> 0x00b7 }
            java.util.List<com.tencent.mm.storage.a> r7 = r0.f79473b     // Catch:{ Exception -> 0x00b7 }
            java.util.LinkedList r7 = (java.util.LinkedList) r7     // Catch:{ Exception -> 0x00b7 }
            r7.addAll(r6)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00bf
        L_0x00b7:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
        L_0x00bf:
            int r5 = r5 + 1
            goto L_0x0060
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.model.newabtest.C92722a.m116886c(java.lang.String):com.tencent.mm.model.newabtest.a$a");
    }

    /* renamed from: d */
    public static Element m116887d(String str) {
        try {
            InputSource inputSource = new InputSource(new ByteArrayInputStream(str.getBytes()));
            DocumentBuilder documentBuilder = f266842a;
            if (documentBuilder == null) {
                documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                f266842a = documentBuilder;
            }
            Document parse = documentBuilder.parse(inputSource);
            parse.normalize();
            return parse.getDocumentElement();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ABTestParser", e.toString());
            return null;
        }
    }
}
