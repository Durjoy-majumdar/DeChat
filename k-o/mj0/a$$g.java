package mj0;

import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84835c0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0;
import p284zb.C91635f;

public class a$$g implements IJSRuntime.C80648a {

    /* renamed from: a */
    public final /* synthetic */ String f256118a;

    /* renamed from: b */
    public final /* synthetic */ C88732a f256119b;

    public a$$g(C88732a aVar, String str) {
        this.f256119b = aVar;
        this.f256118a = str;
    }

    /* renamed from: a */
    public void mo112457a() {
        if (this.f256118a != null) {
            C88732a aVar = this.f256119b;
            aVar.getClass();
            aVar.mo123164b1(new a$$a(C84835c0.f247296d));
        }
        C84868u0 u0Var = C84868u0.f247366a;
        C88732a aVar2 = this.f256119b;
        u0Var.mo117619p(aVar2.f256107D, aVar2.f256108E);
    }

    /* renamed from: b */
    public void mo112458b(long j, long j2) {
        if (this.f256118a != null) {
            this.f256119b.mo123164b1(new a$$b(C84835c0.f247296d));
        }
        C88732a aVar = this.f256119b;
        C84868u0.f247366a.mo117618o(aVar.f256107D, aVar.f256108E, j, j2, false, (C91635f) aVar.mo124764Z());
    }
}
