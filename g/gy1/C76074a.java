package gy1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: gy1.a */
public class C76074a extends C68066g {

    /* renamed from: b */
    public String f222931b;

    /* renamed from: c */
    public String f222932c;

    /* renamed from: d */
    public String f222933d;

    /* renamed from: e */
    public String f222934e;

    /* renamed from: f */
    public String f222935f;

    /* renamed from: a */
    public C68066g mo7615a() {
        C76074a aVar = new C76074a();
        aVar.f222931b = this.f222931b;
        aVar.f222932c = this.f222932c;
        aVar.f222933d = this.f222933d;
        aVar.f222934e = this.f222934e;
        aVar.f222935f = this.f222935f;
        return aVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        sb.append("<gamecenter>");
        sb.append("<namecard>");
        sb.append("<iconUrl>");
        sb.append(Util.escapeStringForXml(this.f222931b));
        sb.append("</iconUrl>");
        sb.append("<name>");
        sb.append(Util.escapeStringForXml(this.f222932c));
        sb.append("</name>");
        sb.append("<desc>");
        sb.append(Util.escapeStringForXml(this.f222933d));
        sb.append("</desc>");
        sb.append("<tail>");
        sb.append(Util.escapeStringForXml(this.f222934e));
        sb.append("</tail>");
        sb.append("<jumpUrl>");
        sb.append(Util.escapeStringForXml(this.f222935f));
        sb.append("</jumpUrl>");
        sb.append("</namecard>");
        sb.append("</gamecenter>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        if (map.get(".msg.appmsg.gamecenter.namecard") != null) {
            this.f222931b = map.get(".msg.appmsg.gamecenter.namecard.iconUrl");
            this.f222932c = map.get(".msg.appmsg.gamecenter.namecard.name");
            this.f222933d = map.get(".msg.appmsg.gamecenter.namecard.desc");
            this.f222934e = map.get(".msg.appmsg.gamecenter.namecard.tail");
            this.f222935f = map.get(".msg.appmsg.gamecenter.namecard.jumpUrl");
        }
    }
}
