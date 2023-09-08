package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64378fw2;

/* renamed from: ht1.l */
public final class C60181l extends C68066g {

    /* renamed from: b */
    public C64378fw2 f171715b = new C64378fw2();

    /* renamed from: a */
    public C68066g mo7615a() {
        C60181l lVar = new C60181l();
        lVar.f171715b = this.f171715b;
        return lVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        sb.append(C60167f1.m70150h(this.f171715b));
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        this.f171715b = C60167f1.m70158p(".msg.appmsg", map);
    }

    /* renamed from: f */
    public final C64378fw2 mo85184f() {
        return this.f171715b;
    }
}
