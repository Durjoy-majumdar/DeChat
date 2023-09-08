package sj3;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: sj3.n */
public final class C48407n extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f129584d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f129585e;

    /* renamed from: f */
    public final /* synthetic */ String f129586f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48407n(String str, ImageView imageView, String str2) {
        super(1);
        this.f129584d = str;
        this.f129585e = imageView;
        this.f129586f = str2;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!C87412m.m108589b(this.f129584d, this.f129585e.getTag(C0966R.C0970id.mxm))) {
            C63941p pVar = C63941p.f181254a;
            Log.m105924i("BizChatUtil", "recycled");
        } else {
            C63941p pVar2 = C63941p.f181254a;
            Log.m105924i("BizChatUtil", "setForegroundPic requestEffect effectBitmap:" + bitmap);
            C20828a.m22825b().mo32526o(this.f129586f, bitmap);
            this.f129585e.setImageBitmap(bitmap);
        }
        return C13598b0.f38549a;
    }
}
