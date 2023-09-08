package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64711sk1;

/* renamed from: ht1.h */
public final class C60174h extends C68066g {

    /* renamed from: b */
    public C64711sk1 f171711b = new C64711sk1();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60174h hVar = new C60174h();
        hVar.f171711b = this.f171711b;
        return hVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        if (C60167f1.m70144b(bVar != null ? bVar.f195491G2 : null, bVar != null ? bVar.f195479D2 : 0) == 2) {
            sb.append(C60167f1.m70143a(2, C60167f1.m70148f(this.f171711b)));
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        this.f171711b = C60167f1.m70154l(".msg.appmsg.finder.detail", map);
    }

    /* renamed from: f */
    public final C64711sk1 mo85180f() {
        return this.f171711b;
    }
}
