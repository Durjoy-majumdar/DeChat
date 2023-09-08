package qj1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.h0 */
public final class C12433h0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f35805d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f35806e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f35807f;

    /* renamed from: g */
    public final /* synthetic */ String f35808g;

    /* renamed from: h */
    public final /* synthetic */ int f35809h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12433h0(Bitmap bitmap, ImageView imageView, FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin, String str, int i) {
        super(0);
        this.f35805d = bitmap;
        this.f35806e = imageView;
        this.f35807f = finderLiveAnchorAfterPlugin;
        this.f35808g = str;
        this.f35809h = i;
    }

    public Object invoke() {
        Bitmap bitmap = this.f35805d;
        if (bitmap != null) {
            this.f35806e.setImageBitmap(bitmap);
        } else {
            String str = this.f35807f.f15109q;
            Log.m105924i(str, this.f35808g + " resource is null");
            this.f35806e.setImageDrawable(this.f35807f.f166287d.getContext().getResources().getDrawable(this.f35809h));
        }
        return C13598b0.f38549a;
    }
}
