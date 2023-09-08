package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64623p81;

/* renamed from: ht1.a */
public final class C60150a extends C68066g {

    /* renamed from: b */
    public C64623p81 f171697b = new C64623p81();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60150a aVar = new C60150a();
        aVar.f171697b = this.f171697b;
        return aVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        C64623p81 p812 = this.f171697b;
        StringBuilder sb4 = new StringBuilder();
        if (p812 != null) {
            try {
                if (!Util.isNullOrNil(p812.f184778d)) {
                    sb4.append("<finderLiveInvite>");
                    sb4.append("<finderLiveID>");
                    sb4.append(p812.f184778d);
                    sb4.append("</finderLiveID>");
                    sb4.append("<finderUsername>");
                    sb4.append(Util.escapeStringForXml(p812.f184779e));
                    sb4.append("</finderUsername>");
                    sb4.append("<finderObjectID>");
                    sb4.append(p812.f184780f);
                    sb4.append("</finderObjectID>");
                    sb4.append("<nickname>");
                    sb4.append(XmlParser.getCDataWrapper(p812.f184781g));
                    sb4.append("</nickname>");
                    sb4.append("<desc>");
                    sb4.append(XmlParser.getCDataWrapper(p812.f184782h));
                    sb4.append("</desc>");
                    sb4.append("<finderNonceID>");
                    sb4.append(Util.escapeStringForXml(p812.f184790s));
                    sb4.append("</finderNonceID>");
                    sb4.append("<headUrl>");
                    sb4.append(XmlParser.getCDataWrapper(p812.f184789r));
                    sb4.append("</headUrl>");
                    sb4.append("<coverUrl>");
                    sb4.append(XmlParser.getCDataWrapper(p812.f184789r));
                    sb4.append("</coverUrl>");
                    sb4.append("<liveMicId>");
                    sb4.append(Util.escapeStringForXml(p812.f184787p));
                    sb4.append("</liveMicId>");
                    sb4.append("<liveMicSdkUserId>");
                    sb4.append(Util.escapeStringForXml(p812.f184788q));
                    sb4.append("</liveMicSdkUserId>");
                    sb4.append("</finderLiveInvite>");
                }
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
        C64623p81 p812 = new C64623p81();
        try {
            if (!map.isEmpty()) {
                if (map.containsKey(".msg.appmsg.finderLiveInvite" + ".finderLiveID")) {
                    p812.f184778d = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".finderLiveID"));
                    p812.f184779e = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".finderUsername"));
                    p812.f184780f = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".finderObjectID"));
                    p812.f184781g = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".nickname"));
                    p812.f184782h = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".desc"));
                    p812.f184783i = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".coverUrl")).replace("&amp;", "&");
                    p812.f184789r = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".headUrl"));
                    p812.f184790s = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".finderNonceID"));
                    p812.f184787p = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".liveMicId"));
                    p812.f184788q = Util.nullAsNil(map.get(".msg.appmsg.finderLiveInvite" + ".liveMicSdkUserId"));
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FinderShareParser", "parse error! %s", e.getMessage());
        }
        this.f171697b = p812;
    }
}
