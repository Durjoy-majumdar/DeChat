package vb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C75592q0;
import java.util.Map;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: vb0.a */
public class C78380a {

    /* renamed from: vb0.a$a */
    public static class C78381a {

        /* renamed from: f */
        public static final C101611g<Integer, C78381a> f229689f = new C100308d(100);

        /* renamed from: a */
        public String f229690a;

        /* renamed from: b */
        public String f229691b;

        /* renamed from: c */
        public String f229692c;

        /* renamed from: d */
        public String f229693d;

        /* renamed from: e */
        public String f229694e;

        /* renamed from: a */
        public static final C78381a m94648a(String str) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.BrandQALogic", "empty xml to parse");
                return null;
            }
            int indexOf = str.indexOf("<qamsg");
            if (indexOf > 0) {
                str = str.substring(indexOf);
            }
            int hashCode = str.hashCode();
            C101611g<Integer, C78381a> gVar = f229689f;
            C78381a aVar = (C78381a) ((C101062d) gVar).get(Integer.valueOf(hashCode));
            if (aVar != null) {
                return aVar;
            }
            Map<String, String> parseXml = XmlParser.parseXml(str, "qamsg", (String) null);
            if (parseXml == null) {
                Log.m105920e("MicroMsg.BrandQALogic", "parse msg failed");
                return null;
            }
            try {
                C78381a aVar2 = new C78381a();
                aVar2.f229690a = parseXml.get(".qamsg.$fromUser");
                aVar2.f229691b = parseXml.get(".qamsg.$fromNickname");
                String str2 = parseXml.get(".qamsg.$title");
                String str3 = parseXml.get(".qamsg.question.$id");
                String str4 = parseXml.get(".qamsg.question.$fromUser");
                aVar2.f229692c = parseXml.get(".qamsg.question.content");
                String str5 = parseXml.get(".qamsg.answer.$id");
                String str6 = parseXml.get(".qamsg.answer.$fromUser");
                aVar2.f229693d = parseXml.get(".qamsg.answer.content");
                String str7 = parseXml.get(".qamsg.answer1.$id");
                String str8 = parseXml.get(".qamsg.answer1.$fromUser");
                aVar2.f229694e = parseXml.get(".qamsg.answer1.content");
                ((C101062d) gVar).mo139557c(Integer.valueOf(hashCode), aVar2);
                return aVar2;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BrandQALogic", "parse qamessage xml failed");
                Log.printErrStackTrace("MicroMsg.BrandQALogic", e, "", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static String m94646a(C78381a aVar) {
        if (aVar == null) {
            return "";
        }
        return "" + Util.nullAsNil(aVar.f229694e) + "\n-------------------\n" + Util.nullAsNil(aVar.f229693d) + "\n-------------------\n" + Util.nullAsNil(aVar.f229692c);
    }

    /* renamed from: b */
    public static String m94647b(C78381a aVar) {
        StringBuilder sb = new StringBuilder("");
        if (!C75592q0.m90764L(aVar.f229690a)) {
            sb.append(aVar.f229691b);
            sb.append(": ");
        }
        sb.append(Util.isNullOrNil(aVar.f229694e) ? Util.isNullOrNil(aVar.f229693d) ? aVar.f229692c : aVar.f229693d : aVar.f229694e);
        return sb.toString();
    }
}
