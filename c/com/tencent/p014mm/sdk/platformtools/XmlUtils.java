package com.tencent.p014mm.sdk.platformtools;

import android.util.Xml;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

@Deprecated
/* renamed from: com.tencent.mm.sdk.platformtools.XmlUtils */
class XmlUtils {
    public static final ArrayList<Object> readListXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, (String) null);
        return (ArrayList) readValueXml(newPullParser, new String[1]);
    }

    public static final HashMap<String, Object> readMapXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, (String) null);
        return (HashMap) readValueXml(newPullParser, new String[1]);
    }

    public static final HashSet<Object> readSetXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, (String) null);
        return (HashSet) readValueXml(newPullParser, new String[1]);
    }

    public static final int[] readThisIntArrayXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"))];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final ArrayList<Object> readThisListXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        ArrayList<Object> arrayList = new ArrayList<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final HashMap<String, Object> readThisMapXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object readThisValueXml = readThisValueXml(xmlPullParser, strArr);
                String str2 = strArr[0];
                if (str2 != null) {
                    hashMap.put(str2, readThisValueXml);
                } else {
                    throw new XmlPullParserException("Map value without name attribute: " + xmlPullParser.getName());
                }
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final HashSet<Object> readThisSetXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        HashSet<Object> hashSet = new HashSet<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    private static final Object readThisValueXml(XmlPullParser xmlPullParser, String[] strArr) {
        int next;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    } else if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else if (name.equals("int")) {
                obj = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "value")));
            } else if (name.equals("long")) {
                obj = Long.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            } else if (name.equals("float")) {
                obj = Float.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            } else if (name.equals("double")) {
                obj = Double.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            } else if (name.equals(DownloadSetting.TYPE_BOOLEAN)) {
                obj = Boolean.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            } else if (name.equals("int-array")) {
                xmlPullParser.next();
                int[] readThisIntArrayXml = readThisIntArrayXml(xmlPullParser, "int-array", strArr);
                strArr[0] = attributeValue;
                return readThisIntArrayXml;
            } else if (name.equals("map")) {
                xmlPullParser.next();
                HashMap<String, Object> readThisMapXml = readThisMapXml(xmlPullParser, "map", strArr);
                strArr[0] = attributeValue;
                return readThisMapXml;
            } else if (name.equals("list")) {
                xmlPullParser.next();
                ArrayList<Object> readThisListXml = readThisListXml(xmlPullParser, "list", strArr);
                strArr[0] = attributeValue;
                return readThisListXml;
            } else if (name.equals("set")) {
                xmlPullParser.next();
                HashSet<Object> readThisSetXml = readThisSetXml(xmlPullParser, "set", strArr);
                strArr[0] = attributeValue;
                return readThisSetXml;
            } else {
                throw new XmlPullParserException("Unknown tag: " + name);
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            } else if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }

    public static final Object readValueXml(XmlPullParser xmlPullParser, String[] strArr) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            } else if (eventType != 4) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            } else {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            }
        }
        return readThisValueXml(xmlPullParser, strArr);
    }

    public static final void writeByteArrayXml(byte[] bArr, String str, XmlSerializer xmlSerializer) {
        if (bArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r8));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b >> 4;
            sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
            byte b2 = b & ExifInterface.MARKER;
            sb.append(b2 >= 10 ? (b2 + 97) - 10 : b2 + 48);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag((String) null, "byte-array");
    }

    public static final void writeIntArrayXml(int[] iArr, String str, XmlSerializer xmlSerializer) {
        if (iArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "int-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
        for (int num : iArr) {
            xmlSerializer.startTag((String) null, "item");
            xmlSerializer.attribute((String) null, "value", Integer.toString(num));
            xmlSerializer.endTag((String) null, "item");
        }
        xmlSerializer.endTag((String) null, "int-array");
    }

    public static final void writeListXml(List<Object> list, OutputStream outputStream) {
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(outputStream, "utf-8");
        newSerializer.startDocument((String) null, Boolean.TRUE);
        newSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeListXml(list, (String) null, newSerializer);
        newSerializer.endDocument();
    }

    public static final void writeMapXml(Map<String, Object> map, OutputStream outputStream) {
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(outputStream, "utf-8");
        newSerializer.startDocument((String) null, Boolean.TRUE);
        newSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeMapXml(map, (String) null, newSerializer);
        newSerializer.endDocument();
    }

    public static final void writeSetXml(Set<Object> set, String str, XmlSerializer xmlSerializer) {
        if (set == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "set");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        for (Object writeValueXml : set) {
            writeValueXml(writeValueXml, (String) null, xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "set");
    }

    public static final void writeValueXml(Object obj, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag((String) null, "null");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.endTag((String) null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag((String) null, "string");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag((String) null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = DownloadSetting.TYPE_BOOLEAN;
            } else if (obj instanceof byte[]) {
                writeByteArrayXml((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                writeIntArrayXml((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                writeMapXml((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                writeListXml((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Set) {
                writeSetXml((Set) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag((String) null, "string");
                if (str != null) {
                    xmlSerializer.attribute((String) null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag((String) null, "string");
                return;
            } else {
                throw new RuntimeException("writeValueXml: unable to write value " + obj);
            }
            xmlSerializer.startTag((String) null, str2);
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.attribute((String) null, "value", obj.toString());
            xmlSerializer.endTag((String) null, str2);
        }
    }

    public static final void writeListXml(List<Object> list, String str, XmlSerializer xmlSerializer) {
        if (list == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "list");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            writeValueXml(list.get(i), (String) null, xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "list");
    }

    public static final void writeMapXml(Map<String, Object> map, String str, XmlSerializer xmlSerializer) {
        if (map == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "map");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        for (Map.Entry next : map.entrySet()) {
            writeValueXml(next.getValue(), (String) next.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "map");
    }
}
