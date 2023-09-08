package rs1;

import android.content.Intent;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import do1.C58341h;
import do1.C7415n;
import os1.C11739f;
import rs1.C13367pa;
import rx3.C36570n;

/* renamed from: rs1.qa */
public final class C13382qa extends C13367pa.C13368a {

    /* renamed from: e */
    public final /* synthetic */ C13367pa f37905e;

    /* renamed from: f */
    public final /* synthetic */ int f37906f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13382qa(C13367pa paVar, int i) {
        super(paVar, i);
        this.f37905e = paVar;
        this.f37906f = i;
    }

    public void run() {
        Log.m105924i("FinderTabPreloadUIC", "startPreload: start tabType = " + this.f37881d);
        this.f37905e.f37879e.remove(Integer.valueOf(this.f37881d));
        C58341h f3 = ((FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class)).mo78457f3(this.f37906f);
        if (f3 != null) {
            String str = f3.f167027c;
            StringBuilder sb = new StringBuilder();
            sb.append("[performInsidePreload] tabType=");
            sb.append(f3.f167025a);
            sb.append(", cache.resp is null = ");
            sb.append(f3.f167040p.f167044b == null);
            Log.m105924i(str, sb.toString());
            if (f3.f167040p.f167044b == null) {
                if (((C11739f) ((C36570n) f3.f167026b.f160334f).getValue()).mo11603f3(f3.f167025a)) {
                    C58341h.m67552q(f3, C58341h.C58344f.InsideTimeout, (Intent) null, new C7415n(f3), 2, (Object) null);
                }
            }
        }
    }
}
