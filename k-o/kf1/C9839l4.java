package kf1;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import kg3.C76577a;
import qo3.C77407n;
import rx3.C13598b0;
import wc3.C78541w;

/* renamed from: kf1.l4 */
public final class C9839l4 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9765h4 f30401d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9839l4(C9765h4 h4Var) {
        super(1);
        this.f30401d = h4Var;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap;
        String str = (String) obj;
        this.f30401d.mo10369l3();
        String str2 = this.f30401d.f30251L;
        if (str2 == null || Util.isNullOrNil(str2)) {
            bitmap = null;
        } else {
            Bitmap bitmapNative = BitmapUtil.getBitmapNative(str2, 140, 140, C76577a.m92156g(MMApplicationContext.getContext()));
            int orientationInDegree = Exif.fromFile(str2).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            bitmap = BitmapUtil.rotate(bitmapNative, (float) orientationInDegree);
        }
        Bitmap bitmap2 = bitmap;
        C77407n nVar = this.f30401d.f30262X;
        if (nVar != null) {
            nVar.mo107572p();
        }
        ((C78541w) C86312j.m106911c(C78541w.class)).mo108484Gd(this.f30401d.getActivity(), str, bitmap2, this.f30401d.getActivity().getString(C0966R.string.a2s), 3, new C9825k4(str, this.f30401d)).show();
        return C13598b0.f38549a;
    }
}
