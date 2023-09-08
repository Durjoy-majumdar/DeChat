package v90;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: v90.b */
public class C78374b {

    /* renamed from: a */
    public int f229660a;

    /* renamed from: b */
    public String f229661b;

    /* renamed from: c */
    public String f229662c;

    /* renamed from: d */
    public String f229663d;

    /* renamed from: e */
    public String f229664e;

    /* renamed from: f */
    public int f229665f;

    /* renamed from: g */
    public int f229666g;

    /* renamed from: h */
    public String f229667h;

    /* renamed from: i */
    public List<C78375a> f229668i = new ArrayList();

    /* renamed from: v90.b$a */
    public static final class C78375a {

        /* renamed from: a */
        public String f229669a;

        /* renamed from: b */
        public String f229670b;
    }

    /* renamed from: a */
    public static C78374b m94638a(String str) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        C78374b bVar = new C78374b();
        if (parseXml == null) {
            Log.m105924i("TemplateMsgContent", "values map is null.");
            return bVar;
        }
        bVar.f229660a = Util.getInt(parseXml.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
        bVar.f229661b = Util.nullAsNil(parseXml.get(".msg.fromusername"));
        Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url"));
        Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_detail.template_ext.app.display_name"));
        bVar.f229662c = parseXml.get(".msg.appmsg.mmreader.category.item.title");
        String str2 = parseXml.get(".msg.appmsg.mmreader.category.item.url");
        bVar.f229665f = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        String str3 = parseXml.get(".msg.appmsg.mmreader.category.item.native_url");
        bVar.f229663d = parseXml.get(".msg.appmsg.template_id");
        bVar.f229664e = parseXml.get(".msg.appmsg.mmreader.category.item.weapp_username");
        bVar.f229666g = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type"), -1);
        bVar.f229667h = parseXml.get(".msg.appmsg.mmreader.category.item.digest");
        int i = 0;
        while (true) {
            if (i >= 100) {
                break;
            }
            String str4 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
            if (i != 0) {
                str4 = str4 + i;
            }
            String str5 = parseXml.get(str4 + ".value.word");
            String str6 = parseXml.get(str4 + ".key.word");
            if (Util.isNullOrNil(str5) && Util.isNullOrNil(str6)) {
                Log.m105925i("TemplateMsgContent", "visit lines: lines count=%d", Integer.valueOf(i));
                break;
            }
            C78375a aVar = new C78375a();
            aVar.f229670b = str5;
            aVar.f229669a = Util.nullAsNil(str6);
            Util.getInt(parseXml.get(str4 + ".key.hide"), 0);
            ((ArrayList) bVar.f229668i).add(aVar);
            i++;
        }
        return bVar;
    }
}
