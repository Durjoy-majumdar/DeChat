package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64682rk1;

/* renamed from: ht1.f */
public final class C60166f extends C68066g {

    /* renamed from: b */
    public C64682rk1 f171710b = new C64682rk1();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60166f fVar = new C60166f();
        fVar.f171710b = this.f171710b;
        return fVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        sb.append(C60167f1.m70147e(this.f171710b));
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(bVar, "content");
        this.f171710b = C60167f1.m70151i(".msg.appmsg", map);
    }

    /* renamed from: f */
    public final String mo85178f() {
        String str;
        String str2 = this.f171710b.f185199w;
        if ((str2 == null || str2.length() == 0) || C87412m.m108589b("null", this.f171710b.f185199w)) {
            str = this.f171710b.f185186g;
            if (str == null) {
                return "";
            }
        } else {
            str = this.f171710b.f185199w;
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    /* renamed from: g */
    public final String mo85179g() {
        String str;
        String str2 = this.f171710b.f185198v;
        if ((str2 == null || str2.length() == 0) || C87412m.m108589b("null", this.f171710b.f185198v)) {
            str = this.f171710b.f185185f;
            if (str == null) {
                return "";
            }
        } else {
            str = this.f171710b.f185198v;
            if (str == null) {
                return "";
            }
        }
        return str;
    }
}
