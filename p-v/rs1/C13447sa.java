package rs1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.view.C4194v2;
import com.tencent.p014mm.plugin.finder.view.FinderFragmentChangeObserver;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;

/* renamed from: rs1.sa */
public final class C13447sa extends FinderFragmentChangeObserver {

    /* renamed from: d */
    public final /* synthetic */ FinderTabUIC f38117d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13447sa(FinderTabUIC finderTabUIC, AppCompatActivity appCompatActivity, List<? extends FinderHomeTabFragment> list) {
        super((MMActivity) appCompatActivity, list);
        this.f38117d = finderTabUIC;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    /* renamed from: k */
    public void mo5077k(int i, int i2, int i3, int i4) {
        Log.m105924i(FinderFragmentChangeObserver.TAG, "to :" + i2 + " lastIndex:" + this.f38117d.f162506d);
        FinderTabUIC finderTabUIC = this.f38117d;
        finderTabUIC.f162506d = i2;
        FinderTabUIC.m65393a4(finderTabUIC, i2, false, 2, (Object) null);
        for (C4194v2 k : this.f38117d.f162512j) {
            k.mo5077k(i, i2, i3, i4);
        }
    }

    /* renamed from: v */
    public void mo5078v(boolean z, int i, FinderHomeTabFragment finderHomeTabFragment) {
        C87412m.m108594g(finderHomeTabFragment, "fragment");
        for (C4194v2 v : this.f38117d.f162512j) {
            v.mo5078v(z, i, finderHomeTabFragment);
        }
    }
}
