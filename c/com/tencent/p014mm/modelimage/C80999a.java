package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: com.tencent.mm.modelimage.a */
public class C80999a {

    /* renamed from: a */
    public String f237927a;

    /* renamed from: b */
    public String f237928b;

    /* renamed from: c */
    public String f237929c;

    /* renamed from: d */
    public String f237930d;

    /* renamed from: e */
    public String f237931e;

    /* renamed from: f */
    public String f237932f;

    public C80999a() {
    }

    /* renamed from: a */
    public static String m98901a(C80999a aVar) {
        StringBuilder sb = new StringBuilder();
        if (aVar != null && !Util.isNullOrNil(aVar.f237927a)) {
            sb.append(String.format("<appinfo><appid>%s</appid><mediatagname>%s</mediatagname><messageext>%s</messageext><messageaction>%s</messageaction></appinfo>", new Object[]{Util.nullAsNil(aVar.f237927a), Util.nullAsNil(aVar.f237928b), Util.nullAsNil(aVar.f237930d), Util.nullAsNil(aVar.f237929c)}));
            if (!Util.isNullOrNil(aVar.f237932f) && !Util.isNullOrNil(aVar.f237931e)) {
                sb.append("<platform_signature>");
                sb.append(Util.escapeStringForXml(aVar.f237932f));
                sb.append("</platform_signature>");
                sb.append("<imgdatahash>");
                sb.append(Util.escapeStringForXml(aVar.f237931e));
                sb.append("</imgdatahash>");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m98902b(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        return "<msg>" + str + "</msg>";
    }

    /* renamed from: c */
    public static C80999a m98903c(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.AppMsgAppInfo", "parseImg failed");
            return null;
        }
        C80999a aVar = new C80999a();
        aVar.f237927a = parseXml.get(".msg.appinfo.appid");
        aVar.f237928b = parseXml.get(".msg.appinfo.mediatagname");
        aVar.f237930d = parseXml.get(".msg.appinfo.messageext");
        aVar.f237929c = parseXml.get(".msg.appinfo.messageaction");
        aVar.f237932f = parseXml.get(".msg.platform_signature");
        aVar.f237931e = parseXml.get(".msg.imgdatahash");
        return aVar;
    }

    public C80999a(String str, String str2, String str3, String str4) {
        this.f237927a = str;
        this.f237928b = str2;
        this.f237930d = str3;
        this.f237929c = str4;
    }
}
