package mh0;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import sm2.C101650a;
import sm2.C101653b;
import sm2.C101656f;
import sm2.C64054c;

/* renamed from: mh0.r */
public final class C99894r extends C101653b {
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
        if (cVar instanceof C99893q) {
            C99893q qVar = (C99893q) cVar;
            String f = qVar.mo141101f(str, str2);
            String y = qVar.mo141117y(map.get('.' + f + ".dataid"), qVar.mo55377B());
            if (y != null) {
                qVar.mo55395T(y);
            }
            Integer w = qVar.mo141115w(map.get('.' + f + ".dataType"), Integer.valueOf(qVar.mo55378C()));
            if (w != null) {
                qVar.mo55396U(w.intValue());
            }
            Integer w2 = qVar.mo141115w(map.get('.' + f + ".compresstype"), Integer.valueOf(qVar.mo55376A()));
            if (w2 != null) {
                qVar.mo55394S(w2.intValue());
            }
            String y2 = qVar.mo141117y(map.get('.' + f + ".originpath"), qVar.mo55384I());
            if (y2 != null) {
                qVar.mo55402a0(y2);
            }
            String y3 = qVar.mo141117y(map.get('.' + f + ".originmidpath"), qVar.mo55382G());
            if (y3 != null) {
                qVar.mo55400Y(y3);
            }
            String y4 = qVar.mo141117y(map.get('.' + f + ".originthumbpath"), qVar.mo55385J());
            if (y4 != null) {
                qVar.mo55403b0(y4);
            }
            String y5 = qVar.mo141117y(map.get('.' + f + ".videofullpath"), qVar.mo55391P());
            if (y5 != null) {
                qVar.mo55409h0(y5);
            }
            Integer w3 = qVar.mo141115w(map.get('.' + f + ".rawvideooffset"), Integer.valueOf(qVar.mo55387L()));
            if (w3 != null) {
                qVar.mo55405d0(w3.intValue());
            }
            Integer w4 = qVar.mo141115w(map.get('.' + f + ".rawvideototallen"), Integer.valueOf(qVar.mo55388M()));
            if (w4 != null) {
                qVar.mo55406e0(w4.intValue());
            }
            Integer w5 = qVar.mo141115w(map.get('.' + f + ".videooffset"), Integer.valueOf(qVar.mo55392Q()));
            if (w5 != null) {
                qVar.mo55410i0(w5.intValue());
            }
            Integer w6 = qVar.mo141115w(map.get('.' + f + ".videototallen"), Integer.valueOf(qVar.mo55393R()));
            if (w6 != null) {
                qVar.mo55411j0(w6.intValue());
            }
            Integer w7 = qVar.mo141115w(map.get('.' + f + ".thumboffset"), Integer.valueOf(qVar.mo55389N()));
            if (w7 != null) {
                qVar.mo55407f0(w7.intValue());
            }
            Integer w8 = qVar.mo141115w(map.get('.' + f + ".thumbtotallen"), Integer.valueOf(qVar.mo55390O()));
            if (w8 != null) {
                qVar.mo55408g0(w8.intValue());
            }
            Integer w9 = qVar.mo141115w(map.get('.' + f + ".midoffset"), Integer.valueOf(qVar.mo55380E()));
            if (w9 != null) {
                qVar.mo55398W(w9.intValue());
            }
            Integer w15 = qVar.mo141115w(map.get('.' + f + ".midtotallen"), Integer.valueOf(qVar.mo55381F()));
            if (w15 != null) {
                qVar.mo55399X(w15.intValue());
            }
            Integer w16 = qVar.mo141115w(map.get('.' + f + ".originoffset"), Integer.valueOf(qVar.mo55383H()));
            if (w16 != null) {
                qVar.mo55401Z(w16.intValue());
            }
            Integer w17 = qVar.mo141115w(map.get('.' + f + ".origintotallen"), Integer.valueOf(qVar.mo55386K()));
            if (w17 != null) {
                qVar.mo55404c0(w17.intValue());
            }
            String y6 = qVar.mo141117y(map.get('.' + f + ".$filename"), qVar.mo55379D());
            if (y6 != null) {
                qVar.mo55397V(y6);
            }
        }
    }

    /* renamed from: c */
    public String mo53857c() {
        return "AlbumOriMediaItem";
    }

    /* renamed from: d */
    public C101650a mo53858d(C101650a aVar, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "serializeObj");
        C87412m.m108594g(str, "xml");
        C87412m.m108594g(str2, "tagName");
        C87412m.m108594g(str3, "xmlPrefixTag");
        return new C27616s(new C101656f(str), aVar.mo141101f(str2, str3));
    }

    /* renamed from: e */
    public JSONObject mo53859e(C64054c cVar, boolean z) {
        C87412m.m108594g(cVar, "serializeObj");
        JSONObject jSONObject = new JSONObject();
        if (!(cVar instanceof C99893q)) {
            return jSONObject;
        }
        C99893q qVar = (C99893q) cVar;
        qVar.mo141106n(jSONObject, "dataid", qVar.mo55377B(), z);
        qVar.mo141106n(jSONObject, "dataType", Integer.valueOf(qVar.mo55378C()), z);
        qVar.mo141106n(jSONObject, "compresstype", Integer.valueOf(qVar.mo55376A()), z);
        qVar.mo141106n(jSONObject, "originpath", qVar.mo55384I(), z);
        qVar.mo141106n(jSONObject, "originmidpath", qVar.mo55382G(), z);
        qVar.mo141106n(jSONObject, "originthumbpath", qVar.mo55385J(), z);
        qVar.mo141106n(jSONObject, "videofullpath", qVar.mo55391P(), z);
        qVar.mo141106n(jSONObject, "rawvideooffset", Integer.valueOf(qVar.mo55387L()), z);
        qVar.mo141106n(jSONObject, "rawvideototallen", Integer.valueOf(qVar.mo55388M()), z);
        qVar.mo141106n(jSONObject, "videooffset", Integer.valueOf(qVar.mo55392Q()), z);
        qVar.mo141106n(jSONObject, "videototallen", Integer.valueOf(qVar.mo55393R()), z);
        qVar.mo141106n(jSONObject, "thumboffset", Integer.valueOf(qVar.mo55389N()), z);
        qVar.mo141106n(jSONObject, "thumbtotallen", Integer.valueOf(qVar.mo55390O()), z);
        qVar.mo141106n(jSONObject, "midoffset", Integer.valueOf(qVar.mo55380E()), z);
        qVar.mo141106n(jSONObject, "midtotallen", Integer.valueOf(qVar.mo55381F()), z);
        qVar.mo141106n(jSONObject, "originoffset", Integer.valueOf(qVar.mo55383H()), z);
        qVar.mo141106n(jSONObject, "origintotallen", Integer.valueOf(qVar.mo55386K()), z);
        qVar.mo141106n(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_FILENAME, qVar.mo55379D(), z);
        return jSONObject;
    }

    /* renamed from: f */
    public boolean mo53860f(C64054c cVar, C64054c cVar2) {
        if (!(cVar instanceof C99893q) || !(cVar2 instanceof C99893q)) {
            return false;
        }
        C99893q qVar = (C99893q) cVar;
        C99893q qVar2 = (C99893q) cVar2;
        return C87412m.m108589b(qVar.mo55377B(), qVar2.mo55377B()) && qVar.mo55378C() == qVar2.mo55378C() && qVar.mo55376A() == qVar2.mo55376A() && C87412m.m108589b(qVar.mo55384I(), qVar2.mo55384I()) && C87412m.m108589b(qVar.mo55382G(), qVar2.mo55382G()) && C87412m.m108589b(qVar.mo55385J(), qVar2.mo55385J()) && C87412m.m108589b(qVar.mo55391P(), qVar2.mo55391P()) && qVar.mo55387L() == qVar2.mo55387L() && qVar.mo55388M() == qVar2.mo55388M() && qVar.mo55392Q() == qVar2.mo55392Q() && qVar.mo55393R() == qVar2.mo55393R() && qVar.mo55389N() == qVar2.mo55389N() && qVar.mo55390O() == qVar2.mo55390O() && qVar.mo55380E() == qVar2.mo55380E() && qVar.mo55381F() == qVar2.mo55381F() && qVar.mo55383H() == qVar2.mo55383H() && qVar.mo55386K() == qVar2.mo55386K() && C87412m.m108589b(qVar.mo55379D(), qVar2.mo55379D());
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
        if (!(cVar instanceof C99893q)) {
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "xmlBuilder.toString()");
            return sb4;
        }
        sb.append('<' + str);
        C99893q qVar = (C99893q) cVar;
        qVar.mo141108p(sb, FFmpegMetadataRetriever.METADATA_KEY_FILENAME, qVar.mo55379D(), z);
        sb.append(">");
        StringBuilder sb5 = sb;
        boolean z2 = z;
        qVar.mo141109q(sb5, "dataid", "", qVar.mo55377B(), z2);
        qVar.mo141109q(sb5, "dataType", "", Integer.valueOf(qVar.mo55378C()), z2);
        C99893q qVar2 = qVar;
        qVar2.mo141109q(sb5, "compresstype", "", Integer.valueOf(qVar.mo55376A()), z2);
        qVar2.mo141109q(sb5, "originpath", "", qVar.mo55384I(), z2);
        qVar2.mo141109q(sb5, "originmidpath", "", qVar.mo55382G(), z2);
        qVar2.mo141109q(sb5, "originthumbpath", "", qVar.mo55385J(), z2);
        qVar2.mo141109q(sb5, "videofullpath", "", qVar.mo55391P(), z2);
        qVar.mo141109q(sb5, "rawvideooffset", "", Integer.valueOf(qVar.mo55387L()), z2);
        qVar.mo141109q(sb5, "rawvideototallen", "", Integer.valueOf(qVar.mo55388M()), z2);
        qVar.mo141109q(sb5, "videooffset", "", Integer.valueOf(qVar.mo55392Q()), z2);
        qVar.mo141109q(sb5, "videototallen", "", Integer.valueOf(qVar.mo55393R()), z2);
        qVar.mo141109q(sb5, "thumboffset", "", Integer.valueOf(qVar.mo55389N()), z2);
        qVar.mo141109q(sb5, "thumbtotallen", "", Integer.valueOf(qVar.mo55390O()), z2);
        qVar.mo141109q(sb5, "midoffset", "", Integer.valueOf(qVar.mo55380E()), z2);
        qVar.mo141109q(sb5, "midtotallen", "", Integer.valueOf(qVar.mo55381F()), z2);
        qVar.mo141109q(sb5, "originoffset", "", Integer.valueOf(qVar.mo55383H()), z2);
        qVar.mo141109q(sb5, "origintotallen", "", Integer.valueOf(qVar.mo55386K()), z2);
        sb.append("</" + str + '>');
        qVar.mo141110r(sb, str2);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "xmlBuilder.toString()");
        return sb6;
    }
}
