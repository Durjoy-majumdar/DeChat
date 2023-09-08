package rs1;

import androidx.appcompat.app.AppCompatActivity;
import as1.C0201a;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ht1.C8803s2;

/* renamed from: rs1.n4 */
public final class C13338n4 extends UIComponent implements C8803s2 {

    /* renamed from: d */
    public C0201a f37833d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13338n4(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public boolean onBackPressed() {
        C0201a aVar = this.f37833d;
        if (!(aVar != null ? aVar.f18137q : false)) {
            return super.onBackPressed();
        }
        if (aVar != null) {
            FinderDraggableLayout.m4279a(aVar, false, 1, (Object) null);
        }
        return true;
    }
}
