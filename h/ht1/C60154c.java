package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64730tk1;

/* renamed from: ht1.c */
public final class C60154c extends C68066g {

    /* renamed from: b */
    public C64730tk1 f171699b = new C64730tk1();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60154c cVar = new C60154c();
        cVar.f171699b = this.f171699b;
        return cVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        int b = C60167f1.m70144b(bVar != null ? bVar.f195491G2 : null, bVar != null ? bVar.f195479D2 : 0);
        if (b == 3) {
            sb.append(C60167f1.m70143a(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8924c(), C60167f1.m70149g(this.f171699b)));
        } else if (b == 4) {
            sb.append(C60167f1.m70143a(4, C60167f1.m70149g(this.f171699b)));
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        this.f171699b = C60167f1.m70155m(".msg.appmsg.finder.detail", map);
    }

    /* renamed from: f */
    public final C64730tk1 mo85129f() {
        return this.f171699b;
    }
}
