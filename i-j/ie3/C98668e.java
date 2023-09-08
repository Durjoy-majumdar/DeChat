package ie3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ie3.e */
public class C98668e {

    /* renamed from: a */
    public String f289286a;

    /* renamed from: b */
    public int f289287b = 0;

    /* renamed from: c */
    public String f289288c;

    /* renamed from: d */
    public String f289289d;

    /* renamed from: e */
    public String f289290e;

    /* renamed from: f */
    public String f289291f;

    /* renamed from: g */
    public boolean f289292g = false;

    /* renamed from: h */
    public String f289293h;

    /* renamed from: i */
    public String f289294i;

    /* renamed from: j */
    public String f289295j;

    /* renamed from: k */
    public String f289296k;

    /* renamed from: l */
    public List<C98669a> f289297l = new ArrayList();

    /* renamed from: ie3.e$a */
    public static final class C98669a {

        /* renamed from: a */
        public String f289298a;

        /* renamed from: b */
        public String f289299b;

        /* renamed from: c */
        public boolean f289300c = false;
    }

    /* renamed from: a */
    public static C98668e m128295a(String str) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        C98668e eVar = new C98668e();
        if (parseXml == null) {
            Log.m105924i("WXPayTemplateMsgContent", "values map is null.");
            return eVar;
        }
        eVar.f289286a = Util.nullAsNil(parseXml.get(".msg.fromusername"));
        int i = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        eVar.f289287b = i;
        if (i != 0) {
            eVar.f289289d = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_header.display_name"));
            eVar.f289290e = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_header.title"));
            eVar.f289291f = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_header.first_data"));
            eVar.f289293h = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_header.icon_url"));
            if ("1".equals(Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_header.hide_title")))) {
                eVar.f289292g = true;
            }
            String str2 = parseXml.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.word");
            String str3 = parseXml.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.word");
            if (!Util.isNullOrNil(str3)) {
                eVar.f289294i = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word"));
                C98669a aVar = new C98669a();
                aVar.f289298a = Util.nullAsNil(str2);
                aVar.f289299b = Util.nullAsNil(str3);
                aVar.f289300c = true;
                ((ArrayList) eVar.f289297l).add(aVar);
            }
            eVar.f289295j = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_detail.middle_tips_with_background.text"));
            eVar.f289296k = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_detail.pay_recepit_middle_tips_word"));
            int i2 = 0;
            while (true) {
                if (i2 >= 100) {
                    break;
                }
                String str4 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
                if (i2 != 0) {
                    str4 = str4 + i2;
                }
                String str5 = parseXml.get(str4 + ".value.word");
                String str6 = parseXml.get(str4 + ".key.word");
                if (Util.isNullOrNil(str5) && Util.isNullOrNil(str6)) {
                    Log.m105925i("WXPayTemplateMsgContent", "visit lines: lines count=%d", Integer.valueOf(i2));
                    break;
                }
                C98669a aVar2 = new C98669a();
                aVar2.f289299b = Util.nullAsNil(str5);
                aVar2.f289298a = Util.nullAsNil(str6);
                Util.getInt(parseXml.get(str4 + ".key.hide"), 0);
                ((ArrayList) eVar.f289297l).add(aVar2);
                i2++;
            }
        } else {
            eVar.f289292g = false;
            eVar.f289290e = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.category.item.title"));
            eVar.f289288c = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.category.item.digest"));
        }
        return eVar;
    }
}
