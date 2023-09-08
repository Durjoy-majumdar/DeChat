package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C49557gg1;

/* renamed from: ht1.g */
public final class C46106g extends C68066g {

    /* renamed from: b */
    public C49557gg1 f124277b = new C49557gg1();

    /* renamed from: a */
    public C68066g mo7615a() {
        C46106g gVar = new C46106g();
        gVar.f124277b = this.f124277b;
        return gVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        C49557gg1 gg12 = this.f124277b;
        StringBuilder sb4 = new StringBuilder();
        if (gg12 != null) {
            try {
                sb4.append("<finderOrder>");
                sb4.append("<appID>");
                sb4.append(XmlParser.getCDataWrapper(gg12.f134037j));
                sb4.append("</appID>");
                sb4.append("<orderID>");
                sb4.append(XmlParser.getCDataWrapper(gg12.f134031d));
                sb4.append("</orderID>");
                sb4.append("<path>");
                sb4.append(XmlParser.getCDataWrapper(gg12.f134038n));
                sb4.append("</path>");
                sb4.append("<priceWording>");
                sb4.append(XmlParser.getCDataWrapper(gg12.f134034g));
                sb4.append("</priceWording>");
                sb4.append("<stateWording>");
                sb4.append(XmlParser.getCDataWrapper(gg12.f134035h));
                sb4.append("</stateWording>");
                sb4.append("<productImageURL>");
                sb4.append(XmlParser.getCDataWrapper(gg12.f134036i));
                sb4.append("</productImageURL>");
                sb4.append("<products>");
                sb4.append(XmlParser.getCDataWrapper(gg12.f134032e));
                sb4.append("</products>");
                sb4.append("<productsCount>");
                sb4.append(XmlParser.getCDataWrapper(Integer.toString(gg12.f134033f)));
                sb4.append("</productsCount>");
                sb4.append("</finderOrder>");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FinderShareParser", "make content error! %s", e.getMessage());
            }
        }
        sb.append(sb4.toString());
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(bVar, "content");
        C49557gg1 gg12 = new C49557gg1();
        try {
            if (!map.isEmpty()) {
                gg12.f134036i = Util.nullAsNil(map.get(".msg.appmsg.finderOrder" + ".productImageURL"));
                gg12.f134037j = Util.nullAsNil(map.get(".msg.appmsg.finderOrder" + ".appID"));
                gg12.f134038n = Util.nullAsNil(map.get(".msg.appmsg.finderOrder" + ".path"));
                gg12.f134032e = Util.nullAsNil(map.get(".msg.appmsg.finderOrder" + ".products"));
                gg12.f134031d = Util.nullAsNil(map.get(".msg.appmsg.finderOrder" + ".orderID"));
                gg12.f134035h = Util.nullAsNil(map.get(".msg.appmsg.finderOrder" + ".stateWording"));
                gg12.f134034g = Util.nullAsNil(map.get(".msg.appmsg.finderOrder" + ".priceWording"));
                gg12.f134033f = Util.safeParseInt(map.get(".msg.appmsg.finderOrder" + ".productsCount"));
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
        }
        this.f124277b = gg12;
    }

    /* renamed from: f */
    public final C49557gg1 mo71550f() {
        return this.f124277b;
    }
}
