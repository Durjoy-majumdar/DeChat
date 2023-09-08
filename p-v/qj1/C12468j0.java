package qj1;

import android.widget.ImageView;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.j0 */
public final class C12468j0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f35870d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f35871e;

    /* renamed from: f */
    public final /* synthetic */ int f35872f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12468j0(ImageView imageView, FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin, int i) {
        super(0);
        this.f35870d = imageView;
        this.f35871e = finderLiveAnchorAfterPlugin;
        this.f35872f = i;
    }

    public Object invoke() {
        this.f35870d.setImageDrawable(this.f35871e.f166287d.getContext().getResources().getDrawable(this.f35872f));
        return C13598b0.f38549a;
    }
}
