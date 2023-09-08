package es1;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.indictor.FinderMediaBannerIndicator;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: es1.c */
public final class C45693c extends C87413o implements C32224a<TextView> {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaBannerIndicator f123503d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45693c(FinderMediaBannerIndicator finderMediaBannerIndicator) {
        super(0);
        this.f123503d = finderMediaBannerIndicator;
    }

    public Object invoke() {
        return (TextView) this.f123503d.findViewById(C0966R.C0970id.f6p);
    }
}
