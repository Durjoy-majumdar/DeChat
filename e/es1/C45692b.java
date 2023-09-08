package es1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.indictor.FinderMediaBannerIndicator;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: es1.b */
public final class C45692b extends C87413o implements C32224a<WeImageView> {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaBannerIndicator f123502d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45692b(FinderMediaBannerIndicator finderMediaBannerIndicator) {
        super(0);
        this.f123502d = finderMediaBannerIndicator;
    }

    public Object invoke() {
        return (WeImageView) this.f123502d.findViewById(C0966R.C0970id.f6o);
    }
}
