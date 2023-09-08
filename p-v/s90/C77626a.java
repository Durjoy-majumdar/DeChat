package s90;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import z04.C112551y;

/* renamed from: s90.a */
public final class C77626a extends C68066g {

    /* renamed from: b */
    public String f226287b;

    /* renamed from: c */
    public String f226288c;

    /* renamed from: d */
    public String f226289d;

    /* renamed from: a */
    public C68066g mo7615a() {
        C77626a aVar = new C77626a();
        aVar.f226287b = this.f226287b;
        aVar.f226288c = this.f226288c;
        aVar.f226289d = this.f226289d;
        return aVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        C87412m.m108594g(bVar, "content");
        String str2 = this.f226289d;
        boolean z = false;
        if (!(str2 == null || C112551y.m153811k(str2))) {
            sb.append("<platform_signature>");
            sb.append(Util.escapeStringForXml(this.f226289d));
            sb.append("</platform_signature>");
        }
        String str3 = this.f226287b;
        if (!(str3 == null || C112551y.m153811k(str3))) {
            sb.append("<thumbdatahash>");
            sb.append(Util.escapeStringForXml(this.f226287b));
            sb.append("</thumbdatahash>");
        }
        String str4 = this.f226288c;
        if (str4 == null || C112551y.m153811k(str4)) {
            z = true;
        }
        if (!z) {
            sb.append("<hdalbumthumbfilehash>");
            sb.append(Util.escapeStringForXml(this.f226288c));
            sb.append("</hdalbumthumbfilehash>");
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(bVar, "content");
        this.f226289d = map.get(".msg.appmsg.platform_signature");
        this.f226287b = map.get(".msg.appmsg.thumbdatahash");
        this.f226288c = map.get(".msg.appmsg.hdalbumthumbfilehash");
    }
}
