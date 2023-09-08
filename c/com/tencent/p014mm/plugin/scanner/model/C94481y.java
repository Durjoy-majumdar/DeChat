package com.tencent.p014mm.plugin.scanner.model;

import android.content.Context;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.LinkedList;
import java.util.Map;
import p1081gi.C98121d;
import vl2.C102216y;

/* renamed from: com.tencent.mm.plugin.scanner.model.y */
public class C94481y {
    /* renamed from: a */
    public static String m119504a(int i) {
        return (i != 4 && i == 3) ? "wx482a4001c37e2b74" : "wxfbc915ff7c30e335";
    }

    /* renamed from: b */
    public static C102216y.C102217a m119505b(String str, int i) {
        Map<String, String> parseXml;
        String str2;
        boolean z;
        Map<String, String> map;
        C102216y.C102217a aVar = null;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        int c = C102216y.m134693c(str);
        if (c == 3) {
            if (str != null) {
                if (str.startsWith("<productInfo")) {
                    map = XmlParser.parseXml(str, "productInfo", (String) null);
                    z = true;
                    str2 = ".productInfo";
                } else {
                    map = XmlParser.parseXml(str, "product", (String) null);
                    str2 = "";
                    z = false;
                }
                if (map != null) {
                    aVar = new C102216y.C102217a();
                    if (!Util.isNullOrNil(map.get(str2 + ".product.$type"))) {
                        aVar.field_type = Util.getInt(map.get(str2 + ".product.$type"), 0);
                    } else {
                        aVar.field_type = 0;
                    }
                    aVar.field_productid = Util.nullAsNil(map.get(str2 + ".product.id"));
                    aVar.field_subtitle = Util.nullAsNil(map.get(str2 + ".product.subtitle"));
                    aVar.field_shareurl = Util.nullAsNil(map.get(str2 + ".product.shareurl"));
                    aVar.field_playurl = Util.nullAsNil(map.get(str2 + ".product.playurl"));
                    aVar.field_xmlType = 3;
                    aVar.field_title = Util.nullAsNil(map.get(str2 + ".product.title"));
                    aVar.field_thumburl = Util.nullAsNil(map.get(str2 + ".product.thumburl"));
                    aVar.field_source = Util.nullAsNil(map.get(str2 + ".product.source"));
                    aVar.field_feedbackurl = Util.nullAsNil(map.get(str2 + ".product.feedbackurl"));
                    aVar.field_extinfo = Util.nullAsNil(map.get(str2 + ".product.extinfo"));
                    aVar.field_introtitle = Util.nullAsNil(map.get(str2 + ".product.introtitle"));
                    aVar.field_introlink = Util.nullAsNil(map.get(str2 + ".product.introlink"));
                    aVar.field_getaction = Util.getInt(map.get(str2 + ".product.getaction"), 0);
                    aVar.field_certification = Util.nullAsNil(map.get(str2 + ".product.certification"));
                    aVar.field_headerbackgroundurl = Util.nullAsNil(map.get(str2 + ".product.headerbackgroundurl"));
                    aVar.field_headermask = Util.nullAsNil(map.get(str2 + ".product.headermask"));
                    aVar.field_detailurl = Util.nullAsNil(map.get(str2 + ".product.detailurl"));
                    aVar.field_certificationurl = Util.nullAsNil(map.get(str2 + ".product.certificationurl"));
                    aVar.field_exposeurl = Util.nullAsNil(map.get(str2 + ".product.exposeurl"));
                    aVar.f300996a = C94474a.m119498b(map, str2 + ".product");
                    String str3 = str2 + ".product";
                    C102216y.C102217a.C102218a aVar2 = new C102216y.C102217a.C102218a();
                    aVar.f300997b = aVar2;
                    aVar2.f300998a = new LinkedList<>();
                    String str4 = str3 + ".bannerlist.banner";
                    int i2 = 0;
                    while (i2 < 1000) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append(i2 > 0 ? Integer.valueOf(i2) : "");
                        String str5 = map.get(sb.toString() + ".link");
                        if (Util.isNullOrNil(str5)) {
                            break;
                        }
                        C102216y.C102217a.C102218a.C102219a aVar3 = new C102216y.C102217a.C102218a.C102219a();
                        aVar3.f301000a = str5;
                        aVar.f300997b.f300998a.add(aVar3);
                        i2++;
                    }
                    aVar.f300997b.f300999b = new LinkedList<>();
                    String str6 = str3 + ".detaillist.detail";
                    int i3 = 0;
                    while (i3 < 1000) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str6);
                        sb4.append(i3 > 0 ? Integer.valueOf(i3) : "");
                        String sb5 = sb4.toString();
                        String str7 = map.get(sb5 + ".title");
                        String str8 = map.get(sb5 + ".desc");
                        if (Util.isNullOrNil(str7) && Util.isNullOrNil(str8)) {
                            break;
                        }
                        C102216y.C102217a.C102218a.C102220b bVar = new C102216y.C102217a.C102218a.C102220b();
                        bVar.f301001a = str7;
                        bVar.f301002b = str8;
                        aVar.f300997b.f300999b.add(bVar);
                        i3++;
                    }
                    String str9 = map.get(str2 + ".functionType");
                    if (!Util.isNullOrNil(str9)) {
                        aVar.field_functionType = Util.getInt(str9, 0);
                    } else {
                        aVar.field_functionType = i;
                    }
                    if (z) {
                        aVar.field_xml = str;
                    } else {
                        StringBuilder sb6 = new StringBuilder(256);
                        sb6.append("<productInfo>");
                        sb6.append(str);
                        sb6.append("<functionType>" + aVar.field_functionType + "</functionType>");
                        sb6.append("</productInfo>");
                        aVar.field_xml = sb6.toString();
                    }
                }
            }
            return aVar;
        } else if (c != 4 || str == null || (parseXml = XmlParser.parseXml(str, "search", (String) null)) == null) {
            return null;
        } else {
            C102216y.C102217a aVar4 = new C102216y.C102217a();
            aVar4.field_xmlType = 4;
            aVar4.field_xml = str;
            aVar4.f300996a = C94474a.m119498b(parseXml, ".search");
            return aVar4;
        }
    }

    /* renamed from: c */
    public static String m119506c(Context context, C102216y.C102217a aVar) {
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195562d = m119504a(aVar.field_functionType);
        bVar.f195570f = aVar.field_title;
        bVar.f195574g = aVar.field_source;
        bVar.f195582i = 10;
        bVar.f195586j = aVar.field_shareurl;
        bVar.f195578h = "";
        bVar.f195484F = C102216y.m134692b(context, aVar.field_type);
        bVar.f195646y = aVar.field_thumburl;
        bVar.f195551a0 = aVar.field_type;
        bVar.f195555b0 = C102216y.m134691a(aVar);
        return C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
    }
}
