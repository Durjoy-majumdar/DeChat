package t90;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import z04.C112550d0;

/* renamed from: t90.d */
public final class C13867d extends C68066g {

    /* renamed from: b */
    public String f39030b;

    /* renamed from: c */
    public String f39031c;

    /* renamed from: d */
    public int f39032d;

    /* renamed from: e */
    public String f39033e;

    /* renamed from: a */
    public C68066g mo7615a() {
        C13867d dVar = new C13867d();
        dVar.f39030b = this.f39030b;
        dVar.f39031c = this.f39031c;
        dVar.f39032d = this.f39032d;
        return dVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (!(this.f39030b == null || sb == null)) {
            sb.append("<teenagerModeGuardianTicket>" + this.f39030b + "</teenagerModeGuardianTicket>");
        }
        if (this.f39032d > 0) {
            if (sb != null) {
                sb.append("<teenagerModeTempAccessBizType>" + this.f39032d + "</teenagerModeTempAccessBizType>");
            }
            if (sb != null) {
                sb.append("<teenagerModeTempAccessBizKey>" + this.f39031c + "</teenagerModeTempAccessBizKey>");
            }
            if (sb != null) {
                sb.append("<refermsg>" + this.f39033e + "</refermsg>");
            }
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        String str;
        String str2 = null;
        this.f39030b = map != null ? map.get(".msg.appmsg.teenagerModeGuardianTicket") : null;
        this.f39032d = Util.getInt(map != null ? map.get(".msg.appmsg.teenagerModeTempAccessBizType") : null, 0);
        this.f39031c = map != null ? map.get(".msg.appmsg.teenagerModeTempAccessBizKey") : null;
        if (bVar != null) {
            str2 = bVar.f195495H2;
        }
        try {
            C87412m.m108591d(str2);
            str = str2.substring(C112550d0.m153769E(str2, "<refermsg>", 0, false, 4, (Object) null) + 10, C112550d0.m153772H(str2, "</refermsg>", 0, false, 6, (Object) null));
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } catch (Exception unused) {
            str = "";
        }
        this.f39033e = str;
    }

    /* renamed from: f */
    public final String mo13199f() {
        return this.f39031c;
    }

    /* renamed from: g */
    public final int mo13200g() {
        return this.f39032d;
    }
}
