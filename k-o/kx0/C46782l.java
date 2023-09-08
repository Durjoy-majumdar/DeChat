package kx0;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import nj3.C11184p0;
import rx3.C13598b0;

/* renamed from: kx0.l */
public final class C46782l implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BizPCRecentReadUI f125900d;

    /* renamed from: kx0.l$a */
    public static final class C46783a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46754a f125901d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46783a(C46754a aVar) {
            super(0);
            this.f125901d = aVar;
        }

        public Object invoke() {
            C46754a aVar = this.f125901d;
            aVar.f125845e.f126592f = true;
            aVar.mo72005d3().mo129613q(new ArrayList());
            return C13598b0.f38549a;
        }
    }

    public C46782l(BizPCRecentReadUI bizPCRecentReadUI) {
        this.f125900d = bizPCRecentReadUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            Log.m105924i(this.f125900d.f109266d, "click close make sure");
            C39818r rVar = C39818r.f106831a;
            AppCompatActivity context = this.f125900d.getContext();
            C87412m.m108593f(context, "context");
            C39622i0 a = rVar.mo62444c(context).mo75002a(C46754a.class);
            C87412m.m108593f(a, "UICProvider.of(context).…entReadRvUIC::class.java)");
            C46754a aVar = (C46754a) a;
            AppCompatActivity context2 = this.f125900d.getContext();
            C87412m.m108593f(context2, "context");
            C39622i0 a2 = rVar.mo62444c(context2).mo75002a(C46768h.class);
            C87412m.m108593f(a2, "UICProvider.of(context).…ReadStateUIC::class.java)");
            C46768h hVar = (C46768h) a2;
            this.f125900d.mo63581H7(aVar.f125845e.f126591e, true, new C46783a(aVar));
        }
    }
}
