package h23;

import com.tencent.p014mm.plugin.vlog.model.C96559y0;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: h23.c */
public final class C108025c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f323492d;

    /* renamed from: e */
    public final /* synthetic */ C96559y0 f323493e;

    /* renamed from: f */
    public final /* synthetic */ C108020b f323494f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f323495g;

    public C108025c(long j, C96559y0 y0Var, C108020b bVar, byte[] bArr) {
        this.f323492d = j;
        this.f323493e = y0Var;
        this.f323494f = bVar;
        this.f323495g = bArr;
    }

    public final void run() {
        long j = this.f323492d;
        C96559y0 y0Var = this.f323493e;
        long j2 = (j - y0Var.f282622f) + (y0Var.f282489a * ((long) 1000));
        C32227p<? super byte[], ? super Long, C13598b0> pVar = this.f323494f.f327850e;
        if (pVar != null) {
            C13598b0 invoke = pVar.invoke(this.f323495g, Long.valueOf(j2));
        }
        this.f323494f.f323471G = j2;
    }
}
