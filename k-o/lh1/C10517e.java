package lh1;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
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

/* renamed from: lh1.e */
public final class C10517e extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C77407n f31761d;

    /* renamed from: e */
    public final /* synthetic */ String f31762e;

    /* renamed from: f */
    public final /* synthetic */ ShellView f31763f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10517e(C77407n nVar, String str, ShellView shellView) {
        super(1);
        this.f31761d = nVar;
        this.f31762e = str;
        this.f31763f = shellView;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap;
        String str = (String) obj;
        this.f31761d.mo107572p();
        String str2 = this.f31762e;
        int i = ShellView.f15054i;
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
        ((C78541w) C86312j.m106911c(C78541w.class)).mo108484Gd(this.f31763f.getContext(), str, bitmap, this.f31763f.getContext().getString(C0966R.string.a2s), 3, new C10516d(str, this.f31763f, this.f31762e)).show();
        return C13598b0.f38549a;
    }
}
