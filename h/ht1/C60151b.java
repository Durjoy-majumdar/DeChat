package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64623p81;

/* renamed from: ht1.b */
public final class C60151b extends C68066g {

    /* renamed from: b */
    public C64623p81 f171698b = new C64623p81();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60151b bVar = new C60151b();
        bVar.f171698b = this.f171698b;
        return bVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        sb.append(C60167f1.m70145c(this.f171698b));
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(bVar, "content");
        this.f171698b = C60167f1.m70153k(".msg.appmsg", map);
    }

    /* renamed from: f */
    public final C64623p81 mo85128f() {
        return this.f171698b;
    }
}
