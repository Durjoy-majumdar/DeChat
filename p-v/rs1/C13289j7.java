package rs1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import jq3.C60905o;

/* renamed from: rs1.j7 */
public final class C13289j7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f37720d;

    /* renamed from: e */
    public final /* synthetic */ C13502w6 f37721e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f37722f;

    public C13289j7(BaseFinderFeed baseFinderFeed, C13502w6 w6Var, C60905o oVar) {
        this.f37720d = baseFinderFeed;
        this.f37721e = w6Var;
        this.f37722f = oVar;
    }

    public final void run() {
        if (C13502w6.f38269t.get(Long.valueOf(this.f37720d.getItemId())) != null) {
            C13502w6 w6Var = this.f37721e;
            C60905o oVar = this.f37722f;
            w6Var.getClass();
            System.currentTimeMillis();
            w6Var.mo12911P3(oVar, new C13245g7(w6Var, oVar));
        }
    }
}
