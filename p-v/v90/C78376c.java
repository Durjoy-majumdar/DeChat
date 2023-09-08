package v90;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: v90.c */
public class C78376c {

    /* renamed from: a */
    public String f229671a;

    /* renamed from: b */
    public String f229672b;

    /* renamed from: c */
    public String f229673c;

    /* renamed from: d */
    public String f229674d;

    /* renamed from: e */
    public String f229675e;

    /* renamed from: f */
    public String f229676f;

    /* renamed from: g */
    public int f229677g;

    /* renamed from: h */
    public String f229678h;

    /* renamed from: i */
    public int f229679i;

    /* renamed from: j */
    public int f229680j;

    /* renamed from: a */
    public static C78376c m94639a(String str) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
        C78376c cVar = new C78376c();
        if (parseXml == null) {
            return cVar;
        }
        cVar.f229672b = parseXml.get(".sysmsg.subscribesysmsg.content_template.template");
        String str2 = parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.title");
        cVar.f229673c = str2;
        cVar.f229671a = cVar.f229672b.replace("$wxaapp_view$", str2);
        cVar.f229674d = parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.appid");
        Util.nullAsNil(parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.nickname"));
        cVar.f229675e = parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.username");
        cVar.f229676f = parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.path");
        cVar.f229677g = Util.getInt(parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.type"), 0);
        cVar.f229678h = parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key");
        cVar.f229679i = Util.getInt(parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.forbids"), 0);
        cVar.f229680j = Util.getInt(parseXml.get(".sysmsg.subscribesysmsg.content_template.link_list.link.wxaapp_type"), 1);
        return cVar;
    }
}
