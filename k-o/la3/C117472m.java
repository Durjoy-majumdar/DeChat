package la3;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ra3.C118229a;

/* renamed from: la3.m */
public class C117472m {

    /* renamed from: a */
    public static DocumentBuilder f351560a;

    /* renamed from: a */
    public static String m165700a(HashMap<String, String> hashMap, String str) {
        StringBuilder sb = new StringBuilder();
        if (!hashMap.containsKey(str)) {
            return sb.toString();
        }
        sb.append(hashMap.get(str));
        sb.append(";");
        int i = 1;
        while (true) {
            String str2 = str + "_" + i;
            if (!hashMap.containsKey(str2)) {
                return sb.toString();
            }
            sb.append(hashMap.get(str2));
            sb.append(";");
            i++;
        }
    }

    /* renamed from: b */
    public static String m165701b(String str, String str2) {
        return (str + "_" + str2).toLowerCase();
    }

    /* renamed from: c */
    public static void m165702c(Element element, C118229a aVar) {
        Node namedItem;
        long j;
        NamedNodeMap attributes = element.getAttributes();
        if (attributes != null && (namedItem = attributes.getNamedItem("id")) != null) {
            aVar.field_expId = namedItem.getNodeValue();
            NodeList elementsByTagName = element.getElementsByTagName("sequence");
            if (elementsByTagName.getLength() != 0) {
                long j2 = Util.getLong(elementsByTagName.item(0).getTextContent(), 0);
                NodeList elementsByTagName2 = element.getElementsByTagName("starttime");
                if (elementsByTagName2.getLength() > 0) {
                    j = Util.getLong(elementsByTagName2.item(0).getTextContent(), 0);
                    if (j == 0) {
                        j = System.currentTimeMillis() / 1000;
                    }
                } else {
                    j = System.currentTimeMillis() / 1000;
                }
                try {
                    aVar.field_idkey = Util.getInt(element.getElementsByTagName("monitor").item(0).getChildNodes().item(0).getChildNodes().item(0).getTextContent(), -1);
                    aVar.field_idkeyValue = Util.getInt(element.getElementsByTagName("monitor").item(0).getChildNodes().item(0).getChildNodes().item(1).getTextContent(), -1);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Welabparser", Util.stackTraceToString(e));
                }
                NodeList elementsByTagName3 = element.getElementsByTagName("endtime");
                int length = elementsByTagName3.getLength();
                long j3 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                if (length > 0) {
                    long j4 = Util.getLong(elementsByTagName3.item(0).getTextContent(), 0);
                    if (j4 != 0) {
                        j3 = j4;
                    }
                }
                HashMap hashMap = new HashMap();
                NodeList elementsByTagName4 = element.getElementsByTagName("args");
                if (elementsByTagName4.getLength() > 0) {
                    NodeList childNodes = elementsByTagName4.item(0).getChildNodes();
                    for (int i = 0; i < childNodes.getLength(); i++) {
                        Node item = childNodes.item(i);
                        if (item.getNodeType() == 1 && item.getNodeName().equals("arg")) {
                            Element element2 = (Element) item;
                            NodeList elementsByTagName5 = element2.getElementsByTagName("key");
                            NodeList elementsByTagName6 = element2.getElementsByTagName("value");
                            if (!(elementsByTagName5.getLength() == 0 || elementsByTagName6.getLength() == 0)) {
                                hashMap.put(elementsByTagName5.item(0).getTextContent(), elementsByTagName6.item(0).getTextContent());
                            }
                        }
                    }
                }
                aVar.field_sequence = j2;
                aVar.field_starttime = j;
                aVar.field_endtime = j3;
                aVar.field_AllVer = Util.safeParseInt((String) hashMap.get("AllVer"));
                aVar.field_BizType = Util.safeParseInt((String) hashMap.get("BizType"));
                aVar.field_Desc_cn = (String) hashMap.get("Desc_cn");
                aVar.field_Desc_en = (String) hashMap.get("Desc_en");
                aVar.field_Desc_hk = (String) hashMap.get("Desc_hk");
                aVar.field_Desc_tw = (String) hashMap.get("Desc_tw");
                aVar.field_DetailURL = (String) hashMap.get("DetailURL");
                aVar.field_Introduce_cn = (String) hashMap.get("Introduce_cn");
                aVar.field_Introduce_en = (String) hashMap.get("Introduce_en");
                aVar.field_Introduce_hk = (String) hashMap.get("Introduce_hk");
                aVar.field_Introduce_tw = (String) hashMap.get("Introduce_tw");
                aVar.field_Pos = Util.safeParseInt((String) hashMap.get("Pos"));
                aVar.field_Type = Util.safeParseInt((String) hashMap.get("Type"));
                aVar.field_Switch = Util.safeParseInt((String) hashMap.get("Switch"));
                aVar.field_WeAppPath = (String) hashMap.get("WeAppPath");
                aVar.field_WeAppUser = (String) hashMap.get("WeAppUser");
                aVar.field_LabsAppId = (String) hashMap.get("LabsAppId");
                aVar.field_TitleKey_android = (String) hashMap.get("TitleKey_android");
                aVar.field_Title_cn = (String) hashMap.get("Title_cn");
                aVar.field_Title_en = (String) hashMap.get("Title_en");
                aVar.field_Title_hk = (String) hashMap.get("Title_hk");
                aVar.field_Title_tw = (String) hashMap.get("Title_tw");
                aVar.field_ThumbUrl_cn = (String) hashMap.get("ThumbUrl_cn");
                aVar.field_ThumbUrl_en = (String) hashMap.get("ThumbUrl_en");
                aVar.field_ThumbUrl_hk = (String) hashMap.get("ThumbUrl_hk");
                aVar.field_ThumbUrl_tw = (String) hashMap.get("ThumbUrl_tw");
                aVar.field_ImgUrl_android_cn = m165700a(hashMap, "ImgUrl_android_cn");
                aVar.field_ImgUrl_android_tw = m165700a(hashMap, "ImgUrl_android_tw");
                aVar.field_ImgUrl_android_en = m165700a(hashMap, "ImgUrl_android_en");
                aVar.field_ImgUrl_android_hk = m165700a(hashMap, "ImgUrl_android_hk");
                if (TextUtils.isEmpty(aVar.field_ImgUrl_android_cn)) {
                    aVar.field_ImgUrl_android_cn = (String) hashMap.get("ImgUrl_cn");
                }
                if (TextUtils.isEmpty(aVar.field_ImgUrl_android_en)) {
                    aVar.field_ImgUrl_android_en = (String) hashMap.get("ImgUrl_en");
                }
                if (TextUtils.isEmpty(aVar.field_ImgUrl_android_hk)) {
                    aVar.field_ImgUrl_android_hk = (String) hashMap.get("ImgUrl_hk");
                }
                if (TextUtils.isEmpty(aVar.field_ImgUrl_android_tw)) {
                    aVar.field_ImgUrl_android_tw = (String) hashMap.get("ImgUrl_tw");
                }
                aVar.field_RedPoint = Util.safeParseInt((String) hashMap.get("RedPoint"));
                aVar.field_WeAppDebugMode = Util.safeParseInt((String) hashMap.get("WeAppDebugMode"));
                aVar.field_TitleKey_android = (String) hashMap.get("TitleKey_android");
                aVar.field_Icon = (String) hashMap.get("Icon");
            }
        }
    }
}
