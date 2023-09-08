package mo1;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: mo1.x0 */
public final class C11067x0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32833d;

    public C11067x0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32833d = finderProfileHeaderUIC;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107140d(CdnLogic.kMediaTypeBeatificFile, this.f32833d.getResources().getColor(C0966R.color.f2966ao), this.f32833d.getResources().getString(C0966R.string.ec9));
        }
    }
}
