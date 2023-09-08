package un2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.LinkedList;
import java.util.Map;
import p1081gi.C98121d;
import sn2.C48447s;
import un2.C102055a;

/* renamed from: un2.c */
public class C102057c {

    /* renamed from: un2.c$a */
    public static class C102058a {

        /* renamed from: a */
        public LinkedList<C102055a> f300547a;
        public String field_id;
        public String field_playstatid;
        public String field_playurl;
        public String field_shareurl;
        public String field_source;
        public String field_subtitle;
        public String field_thumburl;
        public String field_title;
        public String field_topic;
        public String field_xml;
    }

    /* renamed from: a */
    public static String m134443a(C102058a aVar) {
        StringBuilder sb = new StringBuilder(256);
        sb.append("<tv>");
        if (!Util.isNullOrNil(aVar.field_id)) {
            sb.append("<id>" + Util.escapeStringForXml(aVar.field_id) + "</id>");
        }
        sb.append("<title>" + Util.escapeStringForXml(aVar.field_title) + "</title>");
        sb.append("<subtitle>" + Util.escapeStringForXml(aVar.field_subtitle) + "</subtitle>");
        sb.append("<topic>" + Util.escapeStringForXml(aVar.field_topic) + "</topic>");
        sb.append("<thumburl>" + Util.escapeStringForXml(aVar.field_thumburl) + "</thumburl>");
        sb.append("<shareurl>" + Util.escapeStringForXml(aVar.field_shareurl) + "</shareurl>");
        if (!Util.isNullOrNil(aVar.field_playstatid)) {
            sb.append("<playurl statid=\"" + aVar.field_playstatid + "\">" + Util.escapeStringForXml(aVar.field_playurl) + "</playurl>");
        } else {
            sb.append("<playurl>" + Util.escapeStringForXml(aVar.field_playurl) + "</playurl>");
        }
        sb.append("<source>" + Util.escapeStringForXml(aVar.field_source) + "</source>");
        sb.append("</tv>");
        return sb.toString();
    }

    /* renamed from: b */
    public static C102058a m134444b(String str) {
        Map<String, String> parseXml;
        C102055a.C102056a aVar;
        String str2 = str;
        if (str2 == null || (parseXml = XmlParser.parseXml(str2, "tv", (String) null)) == null) {
            return null;
        }
        C102058a aVar2 = new C102058a();
        aVar2.field_id = Util.nullAsNil(parseXml.get(".tv.id"));
        aVar2.field_topic = Util.nullAsNil(parseXml.get(".tv.topic"));
        aVar2.field_title = Util.nullAsNil(parseXml.get(".tv.title"));
        aVar2.field_subtitle = Util.nullAsNil(parseXml.get(".tv.subtitle"));
        aVar2.field_thumburl = Util.nullAsNil(parseXml.get(".tv.thumburl"));
        aVar2.field_shareurl = Util.nullAsNil(parseXml.get(".tv.shareurl"));
        aVar2.field_playurl = Util.nullAsNil(parseXml.get(".tv.playurl"));
        aVar2.field_playstatid = Util.nullAsNil(parseXml.get(".tv.playurl$statid"));
        aVar2.field_source = Util.nullAsNil(parseXml.get(".tv.source"));
        LinkedList<C102055a> linkedList = new LinkedList<>();
        boolean z = false;
        int i = 0;
        while (i < 1000) {
            C102055a aVar3 = new C102055a();
            StringBuilder sb = new StringBuilder();
            sb.append(".tv");
            sb.append(".actionlist");
            sb.append(i > 0 ? Integer.valueOf(i) : "");
            String sb4 = sb.toString();
            LinkedList<C102055a.C102056a> linkedList2 = new LinkedList<>();
            boolean z2 = z;
            int i2 = 0;
            while (i2 < 1000) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(".action");
                sb5.append(i2 > 0 ? Integer.valueOf(i2) : "");
                String sb6 = sb5.toString();
                if (!Util.isNullOrNil(parseXml.get(sb6 + ".type"))) {
                    try {
                        int intValue = Integer.valueOf(parseXml.get(sb6 + ".type")).intValue();
                        if (intValue == 2) {
                            aVar = new C102055a.C102056a(intValue);
                            aVar.f300543d = Util.nullAsNil(parseXml.get(sb6 + ".comment.id"));
                            aVar.f300541b = Util.nullAsNil(parseXml.get(sb6 + ".comment.title"));
                        } else {
                            aVar = intValue == 3 ? C102055a.m134442a(parseXml, intValue, sb6) : intValue == 4 ? C102055a.m134442a(parseXml, intValue, sb6) : intValue == 5 ? C102055a.m134442a(parseXml, intValue, sb6) : intValue == 6 ? C102055a.m134442a(parseXml, intValue, sb6) : null;
                        }
                        if (aVar != null) {
                            linkedList2.add(aVar);
                        }
                        i2++;
                        z2 = false;
                    } catch (Exception e) {
                        e.getMessage();
                        if (z2) {
                            break;
                        }
                        aVar3.f300539a = linkedList2;
                    }
                } else if (z2) {
                    break;
                } else {
                    aVar3.f300539a = linkedList2;
                }
                z = true;
                linkedList.add(aVar3);
                i++;
            }
            z = z2;
            linkedList.add(aVar3);
            i++;
        }
        aVar2.f300547a = linkedList;
        aVar2.field_xml = str2;
        return aVar2;
    }

    /* renamed from: c */
    public static String m134445c(Context context, C102058a aVar) {
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195570f = aVar.field_title;
        if (!Util.isNullOrNil(aVar.field_topic)) {
            bVar.f195574g = aVar.field_topic;
        } else {
            bVar.f195574g = aVar.field_subtitle;
        }
        bVar.f195582i = 20;
        bVar.f195586j = aVar.field_shareurl;
        bVar.f195578h = "";
        if (C48447s.m53803e()) {
            bVar.f195484F = context.getString(C0966R.string.iev);
            bVar.f195562d = "wxaf060266bfa9a35c";
        }
        bVar.f195646y = aVar.field_thumburl;
        bVar.f195567e0 = m134443a(aVar);
        return C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
    }
}
