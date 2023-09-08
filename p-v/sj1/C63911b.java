package sj1;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: sj1.b */
public final class C63911b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MMRoundCornerImageView f181156d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f181157e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63911b(MMRoundCornerImageView mMRoundCornerImageView, Bitmap bitmap) {
        super(0);
        this.f181156d = mMRoundCornerImageView;
        this.f181157e = bitmap;
    }

    public Object invoke() {
        this.f181156d.setImageBitmap(this.f181157e);
        return C13598b0.f38549a;
    }
}
