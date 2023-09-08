package sj1;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: sj1.f */
public final class C48392f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f129537d;

    /* renamed from: e */
    public final /* synthetic */ WeImageView f129538e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48392f(Bitmap bitmap, WeImageView weImageView) {
        super(0);
        this.f129537d = bitmap;
        this.f129538e = weImageView;
    }

    public Object invoke() {
        Bitmap bitmap = this.f129537d;
        if (bitmap != null) {
            this.f129538e.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, 8.0f));
            this.f129538e.setVisibility(0);
        }
        return C13598b0.f38549a;
    }
}
