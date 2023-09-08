package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;
import z04.C112550d0;

/* renamed from: hd0.x0 */
public final class C98442x0 {

    /* renamed from: i */
    public static final C98443a f288734i = new C98443a((C8480h) null);

    /* renamed from: j */
    public static final C101611g<Integer, C98442x0> f288735j = new C100308d(100);

    /* renamed from: k */
    public static final C101611g<Long, C98442x0> f288736k = new C100308d(100);

    /* renamed from: a */
    public long f288737a;

    /* renamed from: b */
    public boolean f288738b;

    /* renamed from: c */
    public String f288739c = "";

    /* renamed from: d */
    public String f288740d = "";

    /* renamed from: e */
    public String f288741e = "";

    /* renamed from: f */
    public String f288742f = "";

    /* renamed from: g */
    public int f288743g;

    /* renamed from: h */
    public boolean f288744h;

    /* renamed from: hd0.x0$a */
    public static final class C98443a {
        public C98443a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo137780a(Map<String, String> map, String str) {
            String str2;
            if (map != null) {
                str2 = map.get(".msg.videomsg.$" + str);
            } else {
                str2 = null;
            }
            String nullAsNil = Util.nullAsNil(str2);
            C87412m.m108593f(nullAsNil, "nullAsNil(values?.get(\".msg.videomsg.\\$$key\"))");
            return nullAsNil;
        }

        /* renamed from: b */
        public final C98442x0 mo137781b(String str) {
            String str2;
            if (Util.isNullOrNil(str)) {
                return null;
            }
            C87412m.m108591d(str);
            int D = C112550d0.m153768D(str, '<', 0, false, 6, (Object) null);
            if (D > 0) {
                str2 = str.substring(D);
                C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
            } else {
                str2 = str;
            }
            int hashCode = ("parse_" + str).hashCode();
            C98442x0 x0Var = (C98442x0) ((C101062d) C98442x0.f288735j).get(Integer.valueOf(hashCode));
            if (x0Var != null) {
                return x0Var;
            }
            C98442x0 x0Var2 = new C98442x0();
            Map<String, String> parseXml = XmlParser.parseXml(str2, "msg", (String) null);
            try {
                C98443a aVar = C98442x0.f288734i;
                x0Var2.f288737a = Util.getLong(aVar.mo137780a(parseXml, "overwritenewmsgid"), 0);
                aVar.mo137780a(parseXml, "fileuploadtoken");
                x0Var2.f288739c = aVar.mo137780a(parseXml, "rawmd5");
                x0Var2.f288740d = aVar.mo137780a(parseXml, "cdnrawvideourl");
                x0Var2.f288742f = aVar.mo137780a(parseXml, "cdnrawvideoaeskey");
                x0Var2.f288743g = Util.getInt(aVar.mo137780a(parseXml, "rawlength"), 0);
                x0Var2.f288738b = Util.getInt(aVar.mo137780a(parseXml, "isplaceholder"), 0) == 1;
                x0Var2.f288741e = aVar.mo137780a(parseXml, "cdnvideourl");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.VideoParseInfo", "parsing video msg xml failed", e);
            }
            ((C101062d) C98442x0.f288735j).put(Integer.valueOf(hashCode), x0Var2);
            long j = x0Var2.f288737a;
            if (j != 0) {
                ((C101062d) C98442x0.f288736k).put(Long.valueOf(j), x0Var2);
            }
            return x0Var2;
        }
    }
}
