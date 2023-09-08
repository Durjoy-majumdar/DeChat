package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64287ci1;

/* renamed from: ht1.i */
public final class C60175i extends C68066g {

    /* renamed from: b */
    public C64287ci1 f171712b = new C64287ci1();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60175i iVar = new C60175i();
        iVar.f171712b = this.f171712b;
        return iVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        C64287ci1 ci12 = this.f171712b;
        StringBuilder sb4 = new StringBuilder();
        if (ci12 != null) {
            try {
                sb4.append("<finderLiveProductShare>");
                sb4.append("<finderLiveID>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182495d));
                sb4.append("</finderLiveID>");
                sb4.append("<finderUsername>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182496e));
                sb4.append("</finderUsername>");
                sb4.append("<finderObjectID>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182497f));
                sb4.append("</finderObjectID>");
                sb4.append("<finderNonceID>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182498g));
                sb4.append("</finderNonceID>");
                sb4.append("<liveStatus>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182499h));
                sb4.append("</liveStatus>");
                sb4.append("<appId>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182500i));
                sb4.append("</appId>");
                sb4.append("<pagePath>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182501j));
                sb4.append("</pagePath>");
                sb4.append("<productId>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182502n));
                sb4.append("</productId>");
                sb4.append("<coverUrl>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182503o));
                sb4.append("</coverUrl>");
                sb4.append("<productTitle>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182504p));
                sb4.append("</productTitle>");
                sb4.append("<marketPrice>");
                sb4.append(XmlParser.getCDataWrapper(Integer.toString(ci12.f182505q)));
                sb4.append("</marketPrice>");
                sb4.append("<sellingPrice>");
                sb4.append(XmlParser.getCDataWrapper(Integer.toString(ci12.f182506r)));
                sb4.append("</sellingPrice>");
                sb4.append("<platformHeadImg>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182507s));
                sb4.append("</platformHeadImg>");
                sb4.append("<platformName>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182508t));
                sb4.append("</platformName>");
                sb4.append("<shopWindowId>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182509u));
                sb4.append("</shopWindowId>");
                sb4.append("<flashSalePrice>");
                sb4.append(XmlParser.getCDataWrapper(Integer.toString(ci12.f182510v)));
                sb4.append("</flashSalePrice>");
                sb4.append("<flashSaleEndTime>");
                sb4.append(XmlParser.getCDataWrapper(Long.toString(ci12.f182511w)));
                sb4.append("</flashSaleEndTime>");
                sb4.append("<ecSource>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182512x));
                sb4.append("</ecSource>");
                sb4.append("<sellingPriceWording>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182513y));
                sb4.append("</sellingPriceWording>");
                sb4.append("<platformIconURL>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182514z));
                sb4.append("</platformIconURL>");
                sb4.append("<firstProductTagURL>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182487A));
                sb4.append("</firstProductTagURL>");
                sb4.append("<firstProductTagAspectRatioString>");
                sb4.append(XmlParser.getCDataWrapper(Float.toString(ci12.f182488B)));
                sb4.append("</firstProductTagAspectRatioString>");
                sb4.append("<secondProductTagURL>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182489C));
                sb4.append("</secondProductTagURL>");
                sb4.append("<secondProductTagAspectRatioString>");
                sb4.append(XmlParser.getCDataWrapper(Float.toString(ci12.f182490D)));
                sb4.append("</secondProductTagAspectRatioString>");
                sb4.append("<firstGuaranteeWording>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182491E));
                sb4.append("</firstGuaranteeWording>");
                sb4.append("<secondGuaranteeWording>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182492F));
                sb4.append("</secondGuaranteeWording>");
                sb4.append("<thirdGuaranteeWording>");
                sb4.append(XmlParser.getCDataWrapper(ci12.f182493G));
                sb4.append("</thirdGuaranteeWording>");
                sb4.append("<isPriceBeginShow>");
                sb4.append(ci12.f182494H);
                sb4.append("</isPriceBeginShow>");
                sb4.append("</finderLiveProductShare>");
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
        C64287ci1 ci12 = new C64287ci1();
        try {
            if (!map.isEmpty()) {
                ci12.f182495d = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".finderLiveID"));
                ci12.f182496e = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".finderUsername"));
                ci12.f182497f = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".finderObjectID"));
                ci12.f182498g = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".finderNonceID"));
                ci12.f182499h = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".liveStatus"));
                ci12.f182500i = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".appId"));
                ci12.f182501j = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".pagePath"));
                ci12.f182502n = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".productId"));
                ci12.f182503o = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".coverUrl"));
                ci12.f182504p = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".productTitle"));
                ci12.f182505q = Util.safeParseInt(map.get(".msg.appmsg.finderLiveProductShare" + ".marketPrice"));
                ci12.f182506r = Util.safeParseInt(map.get(".msg.appmsg.finderLiveProductShare" + ".sellingPrice"));
                ci12.f182507s = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".platformHeadImg"));
                ci12.f182508t = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".platformName"));
                ci12.f182509u = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".shopWindowId"));
                ci12.f182510v = Util.safeParseInt(map.get(".msg.appmsg.finderLiveProductShare" + ".flashSalePrice"));
                ci12.f182511w = Util.safeParseLong(map.get(".msg.appmsg.finderLiveProductShare" + ".flashSaleEndTime"));
                ci12.f182512x = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".ecSource"));
                ci12.f182513y = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".sellingPriceWording"));
                ci12.f182514z = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".platformIconURL"));
                ci12.f182487A = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".firstProductTagURL"));
                ci12.f182488B = Util.safeParseFloat(map.get(".msg.appmsg.finderLiveProductShare" + ".firstProductTagAspectRatioString"));
                ci12.f182489C = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".secondProductTagURL"));
                ci12.f182490D = Util.safeParseFloat(map.get(".msg.appmsg.finderLiveProductShare" + ".secondProductTagAspectRatioString"));
                ci12.f182491E = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".firstGuaranteeWording"));
                ci12.f182492F = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".secondGuaranteeWording"));
                ci12.f182493G = Util.nullAsNil(map.get(".msg.appmsg.finderLiveProductShare" + ".thirdGuaranteeWording"));
                ci12.f182494H = Util.getBoolean(map.get(".msg.appmsg.finderLiveProductShare" + ".isPriceBeginShow"), false);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
        }
        this.f171712b = ci12;
    }

    /* renamed from: f */
    public final C64287ci1 mo85181f() {
        return this.f171712b;
    }
}
