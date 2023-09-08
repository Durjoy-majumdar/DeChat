package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import di3.C86312j;
import fx2.C8215d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kr0.C88274h0;
import p235sm.C90233i0;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90364q0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/BizTestCanvasUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestCanvasUI */
public final class BizTestCanvasUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestCanvasUI$a */
    public static final class C85095a extends C87413o implements C32224a<MagicSclViewContainer> {

        /* renamed from: d */
        public final /* synthetic */ BizTestCanvasUI f247948d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85095a(BizTestCanvasUI bizTestCanvasUI) {
            super(0);
            this.f247948d = bizTestCanvasUI;
        }

        public Object invoke() {
            return (MagicSclViewContainer) this.f247948d.findViewById(C0966R.C0970id.f357785br0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestCanvasUI$b */
    public static final class C85096b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizTestCanvasUI f247949d;

        public C85096b(BizTestCanvasUI bizTestCanvasUI) {
            this.f247949d = bizTestCanvasUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f247949d.finish();
            return true;
        }
    }

    static {
        List<C82870p> f = C64197v.m75537f(new C8215d(), ((C90233i0) C86312j.m106911c(C90233i0.class)).mo124330d7(), ((C88274h0) C86312j.m106911c(C88274h0.class)).Xg0(251));
        ArrayList arrayList = new ArrayList(C36907w.m41090l(f, 10));
        for (C82870p pVar : f) {
            arrayList.add(new C13604l(pVar.mo114779e(), pVar));
        }
        C90364q0.m113155n(C90364q0.m113152k(arrayList));
    }

    public BizTestCanvasUI() {
        C36568h.m40985a(new C85095a(this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6594j8;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("调试Canvas");
        setBackBtn(new C85096b(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C87412m.m108603p("root");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C87412m.m108603p("root");
        throw null;
    }

    public void onResume() {
        super.onResume();
        C87412m.m108603p("root");
        throw null;
    }
}
