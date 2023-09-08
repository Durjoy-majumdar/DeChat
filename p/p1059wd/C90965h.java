package p1059wd;

import android.graphics.Bitmap;
import android.view.TextureView;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: wd.h */
public final class C90965h extends C87413o implements C32224a<Bitmap> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f261028d;

    /* renamed from: e */
    public final /* synthetic */ MagicBrushView.C80319b f261029e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90965h(Bitmap bitmap, MagicBrushView.C80319b bVar) {
        super(0);
        this.f261028d = bitmap;
        this.f261029e = bVar;
    }

    public Object invoke() {
        Bitmap bitmap = this.f261028d;
        return bitmap != null ? ((TextureView) this.f261029e).getBitmap(bitmap) : ((TextureView) this.f261029e).getBitmap();
    }
}
