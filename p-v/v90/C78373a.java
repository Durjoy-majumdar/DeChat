package v90;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: v90.a */
public class C78373a {

    /* renamed from: a */
    public String f229651a;

    /* renamed from: b */
    public String f229652b;

    /* renamed from: c */
    public String f229653c;

    /* renamed from: d */
    public String f229654d;

    /* renamed from: e */
    public String f229655e;

    /* renamed from: f */
    public int f229656f;

    /* renamed from: g */
    public int f229657g;

    /* renamed from: h */
    public String f229658h;

    /* renamed from: i */
    public String f229659i;

    /* renamed from: a */
    public static C78373a m94636a(String str) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
        C78373a aVar = new C78373a();
        if (parseXml == null) {
            Log.m105924i("AppBrandNotifyMsgContent", "values map is null.");
            return aVar;
        }
        aVar.f229651a = parseXml.get(".sysmsg.weapp_pushmsg.title");
        aVar.f229652b = parseXml.get(".sysmsg.weapp_pushmsg.wxa_nickname");
        Util.getInt(parseXml.get(".sysmsg.weapp_pushmsg.op"), 0);
        aVar.f229653c = parseXml.get(".sysmsg.weapp_pushmsg.busi_msgid");
        aVar.f229654d = parseXml.get(".sysmsg.weapp_pushmsg.weappinfo.username");
        aVar.f229655e = parseXml.get(".sysmsg.weapp_pushmsg.weappinfo.appid");
        aVar.f229656f = Util.getInt(parseXml.get(".sysmsg.weapp_pushmsg.weappinfo.type"), 0);
        aVar.f229657g = Util.getInt(parseXml.get(".sysmsg.weapp_pushmsg.weappinfo.version"), 0);
        aVar.f229658h = parseXml.get(".sysmsg.weapp_pushmsg.weappinfo.weappiconurl");
        aVar.f229659i = parseXml.get(".sysmsg.weapp_pushmsg.weappinfo.pagepath");
        String str2 = parseXml.get(".sysmsg.weapp_pushmsg.weappinfo.appservicetype");
        String str3 = parseXml.get(".sysmsg.weapp_pushmsg.weappinfo.pkginfo.type");
        return aVar;
    }

    /* renamed from: b */
    public static String m94637b(String str) {
        return Util.nullAsNil(str).replaceAll("[_a-zA-Z0-9]", "*");
    }
}
