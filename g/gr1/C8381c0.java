package gr1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.c0 */
public final class C8381c0 extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27372d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8381c0(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27372d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        return this.f27372d.getSeekLayout().findViewById(C0966R.C0970id.hx7);
    }
}
