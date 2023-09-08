package p434ig;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: ig.h */
public final class C98675h extends C101653b {
    /* renamed from: a */
    public boolean mo53855a() {
        return false;
    }

    /* renamed from: b */
    public void mo53856b(C64054c cVar, Map<String, String> map, String str, String str2) {
        C87412m.m108594g(cVar, "serializeObj");
        C87412m.m108594g(map, "xmlValueMap");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "xmlPrefixTag");
        if (cVar instanceof C98674g) {
            C98674g gVar = (C98674g) cVar;
            String f = gVar.mo141101f(str, str2);
            String y = gVar.mo141117y(map.get('.' + f + ".title"), gVar.mo55352E());
            if (y != null) {
                gVar.mo55359L(y);
            }
            String y2 = gVar.mo141117y(map.get('.' + f + ".desc"), gVar.mo55349B());
            if (y2 != null) {
                gVar.mo55356I(y2);
            }
            ArrayList arrayList = new ArrayList();
            gVar.mo141107o(arrayList, C98672d.class, map, f + ".datalist", "dataitem");
            if (arrayList.size() > 0) {
                gVar.mo55355H(arrayList);
            }
            Long x = gVar.mo141116x(map.get('.' + f + ".edittime"), Long.valueOf(gVar.mo55350C()));
            if (x != null) {
                gVar.mo55357J(x.longValue());
            }
            String y3 = gVar.mo141117y(map.get('.' + f + ".editusr"), gVar.mo55351D());
            if (y3 != null) {
                gVar.mo55358K(y3);
            }
            Integer w = gVar.mo141115w(map.get('.' + f + ".isChatRoom"), Integer.valueOf(gVar.mo55353F()));
            if (w != null) {
                gVar.mo55354G(w.intValue());
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "contentinfo";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27600i(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C98674g)) {
            return jSONObject;
        }
        C98674g gVar = (C98674g) cVar;
        gVar.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, gVar.mo55352E(), z);
        gVar.mo141106n(jSONObject, "desc", gVar.mo55349B(), z);
        gVar.mo141106n(jSONObject, "datalist", gVar.mo55348A(), z);
        gVar.mo141106n(jSONObject, "edittime", Long.valueOf(gVar.mo55350C()), z);
        gVar.mo141106n(jSONObject, "editusr", gVar.mo55351D(), z);
        gVar.mo141106n(jSONObject, "isChatRoom", Integer.valueOf(gVar.mo55353F()), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C98674g) || !(cVar2 instanceof C98674g)) {
            return false;
        }
        C98674g gVar = (C98674g) cVar;
        C98674g gVar2 = (C98674g) cVar2;
        return C87412m.m108589b(gVar.mo55352E(), gVar2.mo55352E()) && C87412m.m108589b(gVar.mo55349B(), gVar2.mo55349B()) && gVar.mo141097b(gVar.mo55348A(), gVar2.mo55348A(), C98672d.class) && gVar.mo55350C() == gVar2.mo55350C() && C87412m.m108589b(gVar.mo55351D(), gVar2.mo55351D()) && gVar.mo55353F() == gVar2.mo55353F();
    }

    /* renamed from: g */
    public boolean mo53861g() {
        return true;
    }

    /* renamed from: h */
    public String mo53862h() {
        return "";
    }

    /* renamed from: i */
    public String mo53863i(C64054c cVar, boolean z, String str, String str2) {
        C87412m.m108594g(cVar, "serializeObj");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "xmlPrefixTag");
        StringBuilder sb = new StringBuilder();
        if (!(cVar instanceof C98674g)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C98674g gVar = (C98674g) cVar;
        C98674g gVar2 = gVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        gVar2.mo141109q(sb5, FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", gVar.mo55352E(), z2);
        gVar2.mo141109q(sb5, "desc", "", gVar.mo55349B(), z2);
        gVar2.mo141109q(sb5, "datalist", "dataitem", gVar.mo55348A(), z2);
        C98674g gVar3 = gVar;
        StringBuilder sb6 = sb;
        gVar3.mo141109q(sb6, "edittime", "", Long.valueOf(gVar.mo55350C()), z2);
        gVar3.mo141109q(sb6, "editusr", "", gVar.mo55351D(), z2);
        gVar.mo141109q(sb6, "isChatRoom", "", Integer.valueOf(gVar.mo55353F()), z2);
        sb.append("</" + str + '>');
        gVar.mo141110r(sb, str2);
        String sb7 = sb.toString();
        C87412m.m108593f(sb7, "xmlBuilder.toString()");
        return sb7;
    }
}
