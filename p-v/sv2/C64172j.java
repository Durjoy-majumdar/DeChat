package sv2;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: sv2.j */
public class C64172j extends C68066g {

    /* renamed from: b */
    public String f181893b;

    /* renamed from: c */
    public String f181894c;

    /* renamed from: d */
    public String f181895d;

    /* renamed from: a */
    public C68066g mo7615a() {
        C64172j jVar = new C64172j();
        jVar.f181893b = this.f181893b;
        jVar.f181894c = this.f181894c;
        jVar.f181895d = this.f181895d;
        return jVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        this.f181893b = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.iconid");
        this.f181894c = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.text");
        this.f181895d = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.expiretime");
    }
}
