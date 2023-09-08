package com.tencent.p014mm.sdk.platformtools;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.tencent.mm.sdk.platformtools.XmlParser */
public class XmlParser {
    private static final LruCache<String, Map<String, String>> CacheXml = new LruCache<>(100);
    private static final String TAG = "MicroMsg.SDK.XmlParser";
    /* access modifiers changed from: private */
    public static ThreadLocal<XmlPullParser> threadLocalPool = new ThreadLocal<>();

    /* renamed from: com.tencent.mm.sdk.platformtools.XmlParser$MMXmlPullParser */
    public static class MMXmlPullParser {
        private Map<Integer, Integer> countMap;
        private StringBuilder pathSB = new StringBuilder();
        private Map<String, String> result;
        private String rootTag;
        private XmlPullParser xmlParser;

        public MMXmlPullParser(String str, String str2, String str3) {
            this.rootTag = str2;
            XmlPullParser xmlPullParser = (XmlPullParser) XmlParser.threadLocalPool.get();
            this.xmlParser = xmlPullParser;
            if (xmlPullParser == null) {
                ThreadLocal access$000 = XmlParser.threadLocalPool;
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                this.xmlParser = newPullParser;
                access$000.set(newPullParser);
            }
            this.xmlParser.setInput(new StringReader(str));
            this.countMap = new HashMap();
            this.result = new HashMap();
        }

        private void handleElementContent() {
            String text = this.xmlParser.getText();
            if (text != null) {
                this.result.put(this.pathSB.toString(), text);
            }
        }

        private void handleEndElement() {
            StringBuilder sb = this.pathSB;
            this.pathSB = sb.delete(sb.lastIndexOf("."), this.pathSB.length());
        }

        private void handleStartElement() {
            StringBuilder sb = this.pathSB;
            sb.append('.');
            sb.append(this.xmlParser.getName());
            String sb4 = this.pathSB.toString();
            int hashCode = sb4.hashCode();
            Integer num = this.countMap.get(Integer.valueOf(hashCode));
            if (num != null) {
                Integer valueOf = Integer.valueOf(num.intValue() + 1);
                this.pathSB.append(valueOf);
                this.countMap.put(Integer.valueOf(hashCode), valueOf);
                sb4 = sb4 + valueOf;
            } else {
                this.countMap.put(Integer.valueOf(hashCode), 0);
            }
            this.result.put(sb4, "");
            for (int i = 0; i < this.xmlParser.getAttributeCount(); i++) {
                this.result.put(sb4 + ".$" + this.xmlParser.getAttributeName(i), this.xmlParser.getAttributeValue(i));
            }
        }

        public Map<String, String> parse() {
            int eventType = this.xmlParser.getEventType();
            while (eventType != 1) {
                eventType = this.xmlParser.next();
                if (eventType == 2) {
                    handleStartElement();
                } else if (eventType == 4) {
                    handleElementContent();
                } else if (eventType == 3) {
                    handleEndElement();
                    if (this.pathSB.length() == 0) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            return this.result;
        }
    }

    public static String getCDataWrapper(String str) {
        if (str == null) {
            return "";
        }
        return String.format("<![CDATA[%s]]>", new Object[]{str});
    }

    public static boolean isStartXml(String str, String str2, String str3) {
        int i;
        if (str == null) {
            i = -1;
        } else {
            i = str.indexOf("<" + str2);
        }
        return i >= 0;
    }

    public static String nodeToString(Node node) {
        StringWriter stringWriter = new StringWriter();
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.transform(new DOMSource(node), new StreamResult(stringWriter));
        } catch (TransformerException e) {
            Log.m105921e(TAG, "nodeToString: %s", e.getMessage());
        }
        return stringWriter.toString();
    }

    public static Map<String, String> parseXml(String str, String str2, String str3) {
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
        String str4 = str + "_" + str2;
        LruCache<String, Map<String, String>> lruCache = CacheXml;
        if (lruCache.check(str4)) {
            return lruCache.get(str4);
        }
        try {
            Map<String, String> parse = new MMXmlPullParser(str, str2, str3).parse();
            lruCache.put(str4, parse);
            return parse;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "[ %s ]", str);
            return null;
        }
    }
}
