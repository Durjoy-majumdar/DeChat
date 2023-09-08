package gc3;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: gc3.w */
public final class C27136w extends C101653b {
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
        if (cVar instanceof C27079a) {
            C27079a aVar = (C27079a) cVar;
            String f = aVar.mo141101f(str, str2);
            if (map.containsKey('.' + f + ".sec_msg_node")) {
                C27121t tVar = new C27121t();
                aVar.mo141105m(tVar, map, "sec_msg_node", f);
                aVar.mo54604Y(tVar);
            }
            Integer w = aVar.mo141115w(map.get('.' + f + ".silence"), Integer.valueOf(aVar.mo54592M()));
            if (w != null) {
                aVar.mo54607b0(w.intValue());
            }
            Integer w2 = aVar.mo141115w(map.get('.' + f + ".membercount"), Integer.valueOf(aVar.mo54586G()));
            if (w2 != null) {
                aVar.mo54601V(w2.intValue());
            }
            String y = aVar.mo141117y(map.get('.' + f + ".NotAutoDownloadRange"), aVar.mo54587H());
            if (y != null) {
                aVar.mo54602W(y);
            }
            String y2 = aVar.mo141117y(map.get('.' + f + ".signature"), aVar.mo54591L());
            if (y2 != null) {
                aVar.mo54606a0(y2);
            }
            Integer w3 = aVar.mo141115w(map.get('.' + f + ".bizflag"), Integer.valueOf(aVar.mo54582C()));
            if (w3 != null) {
                aVar.mo54597R(w3.intValue());
            }
            if (map.containsKey('.' + f + ".alnode")) {
                C27084b bVar = new C27084b();
                aVar.mo141105m(bVar, map, "alnode", f);
                aVar.mo54595P(bVar);
            }
            if (map.containsKey('.' + f + ".share_msg")) {
                C27153y yVar = new C27153y();
                aVar.mo141105m(yVar, map, "share_msg", f);
                aVar.mo54605Z(yVar);
            }
            String y3 = aVar.mo141117y(map.get('.' + f + ".atuserlist"), aVar.mo54581B());
            if (y3 != null) {
                aVar.mo54596Q(y3);
            }
            if (map.containsKey('.' + f + ".mediaeditcontent")) {
                C98103n nVar = new C98103n();
                aVar.mo141105m(nVar, map, "mediaeditcontent", f);
                aVar.mo54600U(nVar);
            }
            if (map.containsKey('.' + f + ".passthrough")) {
                C27117q qVar = new C27117q();
                aVar.mo141105m(qVar, map, "passthrough", f);
                aVar.mo54603X(qVar);
            }
            if (map.containsKey('.' + f + ".tmp_node")) {
                C98097b0 b0Var = new C98097b0();
                aVar.mo141105m(b0Var, map, "tmp_node", f);
                aVar.mo54608c0(b0Var);
            }
            if (map.containsKey('.' + f + ".imgmsg_pd")) {
                C27108k kVar = new C27108k();
                aVar.mo141105m(kVar, map, "imgmsg_pd", f);
                aVar.mo54599T(kVar);
            }
            if (map.containsKey('.' + f + ".videomsg_pd")) {
                C27090e0 e0Var = new C27090e0();
                aVar.mo141105m(e0Var, map, "videomsg_pd", f);
                aVar.mo54609d0(e0Var);
            }
            if (map.containsKey('.' + f + ".appmsg_pd")) {
                C27102h hVar = new C27102h();
                aVar.mo141105m(hVar, map, "appmsg_pd", f);
                aVar.mo54598S(hVar);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "msgsource";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27137x(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C27079a)) {
            return jSONObject;
        }
        C27079a aVar = (C27079a) cVar;
        aVar.mo141106n(jSONObject, "sec_msg_node", aVar.mo54589J(), z);
        aVar.mo141106n(jSONObject, "silence", Integer.valueOf(aVar.mo54592M()), z);
        aVar.mo141106n(jSONObject, "membercount", Integer.valueOf(aVar.mo54586G()), z);
        aVar.mo141106n(jSONObject, "NotAutoDownloadRange", aVar.mo54587H(), z);
        aVar.mo141106n(jSONObject, "signature", aVar.mo54591L(), z);
        aVar.mo141106n(jSONObject, "bizflag", Integer.valueOf(aVar.mo54582C()), z);
        aVar.mo141106n(jSONObject, "alnode", aVar.mo54580A(), z);
        aVar.mo141106n(jSONObject, "share_msg", aVar.mo54590K(), z);
        aVar.mo141106n(jSONObject, "atuserlist", aVar.mo54581B(), z);
        aVar.mo141106n(jSONObject, "mediaeditcontent", aVar.mo54585F(), z);
        aVar.mo141106n(jSONObject, "passthrough", aVar.mo54588I(), z);
        aVar.mo141106n(jSONObject, "tmp_node", aVar.mo54593N(), z);
        aVar.mo141106n(jSONObject, "imgmsg_pd", aVar.mo54584E(), z);
        aVar.mo141106n(jSONObject, "videomsg_pd", aVar.mo54594O(), z);
        aVar.mo141106n(jSONObject, "appmsg_pd", aVar.mo54583D(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C27079a) || !(cVar2 instanceof C27079a)) {
            return false;
        }
        C27079a aVar = (C27079a) cVar;
        C27079a aVar2 = (C27079a) cVar2;
        return aVar.mo141098c(aVar.mo54589J(), aVar2.mo54589J()) && aVar.mo54592M() == aVar2.mo54592M() && aVar.mo54586G() == aVar2.mo54586G() && C87412m.m108589b(aVar.mo54587H(), aVar2.mo54587H()) && C87412m.m108589b(aVar.mo54591L(), aVar2.mo54591L()) && aVar.mo54582C() == aVar2.mo54582C() && aVar.mo141098c(aVar.mo54580A(), aVar2.mo54580A()) && aVar.mo141098c(aVar.mo54590K(), aVar2.mo54590K()) && C87412m.m108589b(aVar.mo54581B(), aVar2.mo54581B()) && aVar.mo141098c(aVar.mo54585F(), aVar2.mo54585F()) && aVar.mo141098c(aVar.mo54588I(), aVar2.mo54588I()) && aVar.mo141098c(aVar.mo54593N(), aVar2.mo54593N()) && aVar.mo141098c(aVar.mo54584E(), aVar2.mo54584E()) && aVar.mo141098c(aVar.mo54594O(), aVar2.mo54594O()) && aVar.mo141098c(aVar.mo54583D(), aVar2.mo54583D());
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
        if (!(cVar instanceof C27079a)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        sb.append(">");
        C27079a aVar = (C27079a) cVar;
        StringBuilder sb5 = sb;
        boolean z2 = z;
        aVar.mo141109q(sb5, "sec_msg_node", "", aVar.mo54589J(), z2);
        aVar.mo141109q(sb5, "silence", "", Integer.valueOf(aVar.mo54592M()), z2);
        C27079a aVar2 = aVar;
        aVar2.mo141109q(sb5, "membercount", "", Integer.valueOf(aVar.mo54586G()), z2);
        aVar2.mo141109q(sb5, "NotAutoDownloadRange", "", aVar.mo54587H(), z2);
        aVar2.mo141109q(sb5, "signature", "", aVar.mo54591L(), z2);
        C27079a aVar3 = aVar;
        aVar3.mo141109q(sb5, "bizflag", "", Integer.valueOf(aVar.mo54582C()), z2);
        aVar3.mo141109q(sb5, "alnode", "", aVar.mo54580A(), z2);
        aVar3.mo141109q(sb5, "share_msg", "", aVar.mo54590K(), z2);
        aVar3.mo141109q(sb5, "atuserlist", "", aVar.mo54581B(), z2);
        aVar3.mo141109q(sb5, "mediaeditcontent", "", aVar.mo54585F(), z2);
        aVar3.mo141109q(sb5, "passthrough", "", aVar.mo54588I(), z2);
        aVar3.mo141109q(sb5, "tmp_node", "", aVar.mo54593N(), z2);
        aVar3.mo141109q(sb5, "imgmsg_pd", "", aVar.mo54584E(), z2);
        aVar3.mo141109q(sb5, "videomsg_pd", "", aVar.mo54594O(), z2);
        aVar3.mo141109q(sb5, "appmsg_pd", "", aVar.mo54583D(), z2);
        sb.append("</" + str + '>');
        aVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
