package wz0;

import android.text.TextUtils;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import dz0.C20483c;
import hz0.C21035d;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: wz0.i */
public class C22944i {
    /* renamed from: a */
    public static int m26984a(String str) {
        if (TextUtils.isEmpty(str) || !C22945n.m27025y(str)) {
            return 0;
        }
        return Util.getInt(str, 0);
    }

    /* renamed from: b */
    public static C68070l.C68072b m26985b(C20483c cVar, String str, int i) {
        int i2;
        if (cVar == null) {
            return null;
        }
        if (i == 23) {
            i = 2;
            i2 = 1;
        } else {
            i2 = 0;
        }
        StringBuilder sb = new StringBuilder();
        C68070l.C68072b bVar = new C68070l.C68072b();
        if (cVar.mo23264L0() != null) {
            bVar.f195570f = cVar.mo23293u0().f133848d;
            bVar.f195574g = cVar.mo23264L0().f64143n;
            bVar.f195582i = 16;
            bVar.f195492H = 0;
            bVar.f195618r = 3;
            bVar.f195562d = cVar.mo23264L0().f64138f;
            bVar.f195545Y = 0;
            bVar.f195646y = cVar.mo23264L0().f64137e;
            bVar.f195531T0 = i;
            bVar.f195528S0 = cVar.mo23264L0().f64142j;
            bVar.f195586j = cVar.mo23264L0().f64103A;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("<from_username>");
        sb4.append(cVar.mo23280e());
        sb4.append("</from_username>");
        if (C22945n.m27021u(i)) {
            sb4.append("<card_id>");
            sb4.append(cVar.mo23270R0());
            sb4.append("</card_id>");
        } else if (i == 5) {
            sb4.append("<card_id>");
            sb4.append(cVar.getCardId());
            sb4.append("</card_id>");
        }
        sb4.append("<card_type>");
        sb4.append(cVar.mo23264L0().f64141i);
        sb4.append("</card_type>");
        sb4.append("<from_scene>");
        sb4.append(i);
        sb4.append("</from_scene>");
        sb4.append("<color>");
        sb4.append(cVar.mo23264L0().f64145p);
        sb4.append("</color>");
        sb4.append("<card_type_name>");
        sb4.append(cVar.mo23264L0().f64156y);
        sb4.append("</card_type_name>");
        sb4.append("<brand_name>");
        sb4.append(cVar.mo23264L0().f64142j);
        sb4.append("</brand_name>");
        if (TextUtils.isEmpty(str)) {
            sb4.append("<card_ext>");
            sb4.append("");
            sb4.append("</card_ext>");
        } else {
            sb4.append("<card_ext>");
            sb4.append(str);
            sb4.append("</card_ext>");
        }
        sb4.append("<is_recommend>");
        sb4.append(i2);
        sb4.append("</is_recommend>");
        sb4.append("<recommend_card_id>");
        sb4.append(cVar.getCardId());
        sb4.append("</recommend_card_id>");
        sb.append(sb4.toString());
        bVar.f195525R0 = sb.toString();
        bVar.f195522Q0 = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
        return bVar;
    }

    /* renamed from: c */
    public static String m26986c(C21035d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("<from_username>");
        sb.append(dVar.f59508a);
        sb.append("</from_username>");
        sb.append("<card_id>");
        sb.append(dVar.f59509b);
        sb.append("</card_id>");
        sb.append("<card_type>");
        sb.append(dVar.f59510c);
        sb.append("</card_type>");
        sb.append("<from_scene>");
        sb.append(dVar.f59511d);
        sb.append("</from_scene>");
        sb.append("<color>");
        sb.append(dVar.f59512e);
        sb.append("</color>");
        sb.append("<card_type_name>");
        sb.append(dVar.f59513f);
        sb.append("</card_type_name>");
        sb.append("<brand_name>");
        sb.append(dVar.f59514g);
        sb.append("</brand_name>");
        if (TextUtils.isEmpty(dVar.f59515h)) {
            sb.append("<card_ext>");
            sb.append("");
            sb.append("</card_ext>");
        } else {
            sb.append("<card_ext>");
            sb.append(dVar.f59515h);
            sb.append("</card_ext>");
        }
        sb.append("<is_recommend>");
        sb.append(dVar.f59516i);
        sb.append("</is_recommend>");
        sb.append("<recommend_card_id>");
        sb.append(dVar.f59517j);
        sb.append("</recommend_card_id>");
        return sb.toString();
    }

    /* renamed from: d */
    public static C21035d m26987d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C21035d dVar = new C21035d();
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        if (parseXml == null) {
            return dVar;
        }
        dVar.f59508a = parseXml.get(".msg.appmsg.carditem.from_username");
        dVar.f59509b = parseXml.get(".msg.appmsg.carditem.card_id");
        dVar.f59510c = m26984a(parseXml.get(".msg.appmsg.carditem.card_type"));
        dVar.f59511d = m26984a(parseXml.get(".msg.appmsg.carditem.from_scene"));
        dVar.f59512e = parseXml.get(".msg.appmsg.carditem.color");
        dVar.f59513f = parseXml.get(".msg.appmsg.carditem.card_type_name");
        dVar.f59514g = parseXml.get(".msg.appmsg.carditem.brand_name");
        dVar.f59515h = parseXml.get(".msg.appmsg.carditem.card_ext");
        dVar.f59516i = m26984a(parseXml.get(".msg.appmsg.carditem.is_recommend"));
        dVar.f59517j = parseXml.get(".msg.appmsg.carditem.recommend_card_id");
        return dVar;
    }
}
