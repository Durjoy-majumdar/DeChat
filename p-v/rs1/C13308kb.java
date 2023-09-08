package rs1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rs1.kb */
public abstract class C13308kb extends UIComponent {

    /* renamed from: d */
    public int f37764d;

    /* renamed from: e */
    public final C13601g f37765e = C36568h.m40985a(new C13309a(this));

    /* renamed from: rs1.kb$a */
    public static final class C13309a extends C87413o implements C32224a<FinderDescPanelUIC> {

        /* renamed from: d */
        public final /* synthetic */ C13308kb f37766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13309a(C13308kb kbVar) {
            super(0);
            this.f37766d = kbVar;
        }

        public Object invoke() {
            return (FinderDescPanelUIC) C39818r.f106831a.mo62443b(this.f37766d.getContext()).mo62449e(FinderDescPanelUIC.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13308kb(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public abstract View mo12677c3(C60905o oVar);

    /* renamed from: d3 */
    public abstract void mo12619d3(C60905o oVar, boolean z);

    /* renamed from: e3 */
    public abstract boolean mo12620e3(C60905o oVar, boolean z);

    /* renamed from: f3 */
    public final void mo12755f3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) ((C36570n) this.f37765e).getValue();
        if (finderDescPanelUIC != null) {
            finderDescPanelUIC.f18623g = true;
            finderDescPanelUIC.mo5116c3(oVar);
        }
    }

    /* renamed from: g3 */
    public void mo12678g3(C60905o oVar, boolean z, long j, long j2) {
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: i3 */
    public abstract void mo12621i3(C60905o oVar, boolean z);
}
