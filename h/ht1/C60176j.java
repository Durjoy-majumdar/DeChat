package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64831xk1;

/* renamed from: ht1.j */
public final class C60176j extends C68066g {

    /* renamed from: b */
    public C64831xk1 f171713b = new C64831xk1();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60176j jVar = new C60176j();
        jVar.f171713b = this.f171713b;
        return jVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        C64831xk1 xk12 = this.f171713b;
        StringBuilder sb4 = new StringBuilder();
        if (xk12 != null) {
            try {
                sb4.append("<finderShopWindowShare>");
                sb4.append("<finderUsername>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186326d));
                sb4.append("</finderUsername>");
                sb4.append("<avatar>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186327e));
                sb4.append("</avatar>");
                sb4.append("<nickname>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186328f));
                sb4.append("</nickname>");
                sb4.append("<commodityInStockCount>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186329g));
                sb4.append("</commodityInStockCount>");
                sb4.append("<appId>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186330h));
                sb4.append("</appId>");
                sb4.append("<path>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186331i));
                sb4.append("</path>");
                sb4.append("<appUsername>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186332j));
                sb4.append("</appUsername>");
                sb4.append("<query>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186333n));
                sb4.append("</query>");
                sb4.append("<liteAppId>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186334o));
                sb4.append("</liteAppId>");
                sb4.append("<liteAppPath>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186335p));
                sb4.append("</liteAppPath>");
                sb4.append("<liteAppQuery>");
                sb4.append(XmlParser.getCDataWrapper(xk12.f186336q));
                sb4.append("</liteAppQuery>");
                sb4.append("</finderShopWindowShare>");
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
        this.f171713b = C60167f1.m70159q(".msg.appmsg", map);
    }

    /* renamed from: f */
    public final C64831xk1 mo85182f() {
        return this.f171713b;
    }
}
