package s12;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: s12.a */
public class C13610a {

    /* renamed from: a */
    public String f38568a = "";

    /* renamed from: b */
    public String f38569b = "";

    /* renamed from: c */
    public String f38570c = "";

    /* renamed from: d */
    public String f38571d = "";

    /* renamed from: e */
    public int f38572e = 0;

    /* renamed from: a */
    public static C13610a m12910a(String str) {
        Log.m105918d("MicroMsg.IPCallActivityMsgInfo", "getIPCallActivityMsgInfoFromXML:" + str);
        C13610a aVar = new C13610a();
        int indexOf = str.indexOf("<ActivityInfo");
        if (indexOf == -1) {
            Log.m105920e("MicroMsg.IPCallActivityMsgInfo", "msgContent not start with <ActivityInfo");
            return aVar;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str.substring(indexOf), "ActivityInfo", (String) null);
        if (parseXml == null) {
            Log.m105921e("MicroMsg.IPCallActivityMsgInfo", "XmlParser values is null, xml %s", str);
            return null;
        }
        if (parseXml.containsKey(".ActivityInfo.Title")) {
            aVar.f38568a = parseXml.get(".ActivityInfo.Title");
        }
        if (parseXml.containsKey(".ActivityInfo.Desc")) {
            aVar.f38569b = parseXml.get(".ActivityInfo.Desc");
        }
        if (parseXml.containsKey(".ActivityInfo.ImgUrl")) {
            aVar.f38570c = parseXml.get(".ActivityInfo.ImgUrl");
        }
        if (parseXml.containsKey(".ActivityInfo.StartBtnText")) {
            aVar.f38571d = parseXml.get(".ActivityInfo.StartBtnText");
        }
        if (parseXml.containsKey(".ActivityInfo.ActivityType")) {
            aVar.f38572e = Util.getInt(parseXml.get(".ActivityInfo.ActivityType"), 0);
        }
        Log.m105919d("MicroMsg.IPCallActivityMsgInfo", "msgInfo:", aVar.toString());
        return aVar;
    }
}
