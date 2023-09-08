package t90;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: t90.b */
public final class C77878b extends C68066g {

    /* renamed from: b */
    public long f226901b;

    /* renamed from: c */
    public String f226902c = "";

    /* renamed from: a */
    public C68066g mo7615a() {
        C77878b bVar = new C77878b();
        bVar.f226901b = this.f226901b;
        bVar.f226902c = this.f226902c;
        return bVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(bVar, "content");
        if (bVar.f195582i == 6) {
            this.f226901b = Util.getLong(map.get(".msg.appmsg.appattach.overwrite_newmsgid"), 0);
            String nullAsNil = Util.nullAsNil(map.get(".msg.appmsg.appattach.fileuploadtoken"));
            C87412m.m108593f(nullAsNil, "nullAsNil(values[\".msg.appmsg.appattach.$key\"])");
            this.f226902c = nullAsNil;
        }
    }

    /* renamed from: f */
    public final String mo107974f() {
        return this.f226902c;
    }

    /* renamed from: g */
    public final long mo107975g() {
        return this.f226901b;
    }

    /* renamed from: h */
    public final void mo107976h() {
        this.f226901b = 0;
        this.f226902c = "";
    }
}
