package gr1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.finder.video.FinderLivePlayView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gr1.m0 */
public final class C59663m0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f170485d;

    /* renamed from: e */
    public final /* synthetic */ FinderLivePlayView f170486e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59663m0(Bitmap bitmap, FinderLivePlayView finderLivePlayView) {
        super(0);
        this.f170485d = bitmap;
        this.f170486e = finderLivePlayView;
    }

    public Object invoke() {
        ImageView imageView;
        if (!(this.f170485d == null || (imageView = this.f170486e.f161677n) == null)) {
            imageView.setImageDrawable(new BitmapDrawable(this.f170486e.getContext().getResources(), this.f170485d));
        }
        return C13598b0.f38549a;
    }
}
