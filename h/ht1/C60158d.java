package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64581nk1;

/* renamed from: ht1.d */
public final class C60158d extends C68066g {

    /* renamed from: b */
    public C64581nk1 f171700b = new C64581nk1();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60158d dVar = new C60158d();
        dVar.f171700b = this.f171700b;
        return dVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        sb.append(C60167f1.m70146d(this.f171700b));
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        this.f171700b = C60167f1.m70152j(".msg.appmsg", map);
    }

    /* renamed from: f */
    public final C64581nk1 mo85130f() {
        return this.f171700b;
    }
}
