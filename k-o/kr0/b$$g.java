package kr0;

import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84835c0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0;
import p284zb.C91635f;

public class b$$g implements IJSRuntime.C80648a {

    /* renamed from: a */
    public final /* synthetic */ String f255081a;

    /* renamed from: b */
    public final /* synthetic */ C88256b f255082b;

    public b$$g(C88256b bVar, String str) {
        this.f255082b = bVar;
        this.f255081a = str;
    }

    /* renamed from: a */
    public void mo112457a() {
        if (this.f255081a != null) {
            C88256b bVar = this.f255082b;
            bVar.getClass();
            bVar.mo122624e1(new b$$c(C84835c0.f247296d));
        }
        C84868u0 u0Var = C84868u0.f247366a;
        C88256b bVar2 = this.f255082b;
        u0Var.mo117619p(bVar2.f255073C, bVar2.f255074D);
    }

    /* renamed from: b */
    public void mo112458b(long j, long j2) {
        if (this.f255081a != null) {
            this.f255082b.mo122624e1(new b$$a(C84835c0.f247296d));
        }
        C88256b bVar = this.f255082b;
        C84868u0.f247366a.mo117618o(bVar.f255073C, bVar.f255074D, j, j2, false, (C91635f) bVar.mo124764Z());
    }
}
