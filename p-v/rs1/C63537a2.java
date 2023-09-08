package rs1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderFavFeedFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import ls1.C10647i;
import ls1.C10648k;
import ls1.C61391g;
import ls1.C61392h;
import ls1.C61394l;
import ls1.C61395m;

/* renamed from: rs1.a2 */
public final class C63537a2 extends FinderTabUIC {

    /* renamed from: rs1.a2$a */
    public static final class C63538a implements IFinderTabProvider {
        public List<FinderHomeTabFragment> fragments() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new FinderFavFeedFragment());
            return arrayList;
        }

        public boolean isDynamic() {
            return true;
        }

        public C61395m tabContainer() {
            return new C61392h();
        }

        public C61394l tabViewAction() {
            return new C10648k();
        }

        public List<C61391g> tabs() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C10647i((int) C0966R.string.eqs));
            return arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63537a2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: m3 */
    public IFinderTabProvider mo11417m3() {
        return new C63538a();
    }

    public boolean onBackPressed() {
        return getActiveFragment().onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo78525l3();
    }
}
