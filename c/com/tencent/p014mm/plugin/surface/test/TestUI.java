package com.tencent.p014mm.plugin.surface.test;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import di3.C86312j;
import fx2.C8215d;
import fy3.C32224a;
import gy3.C87413o;
import i70.C87667c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kr0.C88274h0;
import p235sm.C90233i0;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90364q0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/surface/test/TestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-surface-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.surface.test.TestUI */
public final class TestUI extends MMActivity {

    /* renamed from: d */
    public final LinkedList<C87667c<?, ?>.a> f249138d = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.surface.test.TestUI$a */
    public static final class C85488a extends C87413o implements C32224a<MagicSclViewContainer> {

        /* renamed from: d */
        public final /* synthetic */ TestUI f249139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85488a(TestUI testUI) {
            super(0);
            this.f249139d = testUI;
        }

        public Object invoke() {
            return (MagicSclViewContainer) this.f249139d.findViewById(C0966R.C0970id.f357785br0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.surface.test.TestUI$b */
    public static final class C85489b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f249140d;

        public C85489b(TestUI testUI) {
            this.f249140d = testUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f249140d.finish();
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

    public TestUI() {
        C36568h.m40985a(new C85488a(this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c7y;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("Surface Canvas Test");
        setBackBtn(new C85489b(this));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        for (C87667c.C87668a e : this.f249138d) {
            e.mo122102e();
        }
    }

    public void onResume() {
        super.onResume();
        for (C87667c.C87668a h : this.f249138d) {
            h.mo122105h();
        }
    }
}
