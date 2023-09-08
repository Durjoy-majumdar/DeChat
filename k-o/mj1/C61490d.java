package mj1;

import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: mj1.d */
public final class C61490d extends C87413o implements C32224a<ProgressBar> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiStreamViewLayout f174818d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61490d(FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout) {
        super(0);
        this.f174818d = finderLiveMultiStreamViewLayout;
    }

    public Object invoke() {
        return (ProgressBar) this.f174818d.findViewById(C0966R.C0970id.g3t);
    }
}
