package t90;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: t90.a */
public final class C77877a extends C68066g {

    /* renamed from: b */
    public boolean f226900b;

    /* renamed from: a */
    public C68066g mo7615a() {
        C77877a aVar = new C77877a();
        aVar.f226900b = this.f226900b;
        return aVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (sb != null) {
            sb.append("<secretmsg>");
            sb.append("<issecretmsg>");
            sb.append(this.f226900b ? 1 : 0);
            sb.append("</issecretmsg>");
            sb.append("</secretmsg>");
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        boolean z = false;
        if (Util.getInt(map != null ? map.get(".msg.appmsg.secretmsg.issecretmsg") : null, 0) == 1) {
            z = true;
        }
        this.f226900b = z;
    }
}
