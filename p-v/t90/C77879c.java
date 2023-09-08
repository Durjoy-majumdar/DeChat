package t90;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: t90.c */
public final class C77879c extends C68066g {

    /* renamed from: b */
    public String f226903b;

    /* renamed from: c */
    public String f226904c;

    /* renamed from: a */
    public C68066g mo7615a() {
        C77879c cVar = new C77879c();
        cVar.f226903b = this.f226903b;
        cVar.f226904c = this.f226904c;
        return cVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (this.f226903b != null && sb != null) {
            sb.append("<textannouncement>" + this.f226903b + "</textannouncement>");
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        String str = null;
        this.f226903b = map != null ? map.get(".msg.appmsg.textannouncement") : null;
        if (map != null) {
            str = map.get(".msg.appmsg.announcement");
        }
        this.f226904c = str;
        if (map != null) {
            String str2 = map.get(".msg.appmsg.announcement_id");
        }
    }
}
