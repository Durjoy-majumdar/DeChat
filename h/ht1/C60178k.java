package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64730tk1;

/* renamed from: ht1.k */
public final class C60178k extends C68066g {

    /* renamed from: b */
    public C64730tk1 f171714b = new C64730tk1();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60178k kVar = new C60178k();
        kVar.f171714b = this.f171714b;
        return kVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        sb.append(C60167f1.m70149g(this.f171714b));
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        this.f171714b = C60167f1.m70155m(".msg.appmsg", map);
    }

    /* renamed from: f */
    public final C64730tk1 mo85183f() {
        return this.f171714b;
    }
}
