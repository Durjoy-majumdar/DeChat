package qj1;

import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.ic */
public final class C12451ic extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12707vb f35834d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12451ic(C12707vb vbVar) {
        super(0);
        this.f35834d = vbVar;
    }

    public Object invoke() {
        this.f35834d.f36425z.mo3440y();
        C12707vb vbVar = this.f35834d;
        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = vbVar.f36425z;
        boolean z = vbVar.f36408E;
        boolean z2 = vbVar.f36409F;
        if (z) {
            WeImageView weImageView = finderLiveMemebrProfileWidget.f15390I;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
        } else if (z2) {
            WeImageView weImageView2 = finderLiveMemebrProfileWidget.f15390I;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
        } else {
            WeImageView weImageView3 = finderLiveMemebrProfileWidget.f15390I;
            if (weImageView3 != null) {
                weImageView3.setVisibility(8);
            }
        }
        return C13598b0.f38549a;
    }
}
