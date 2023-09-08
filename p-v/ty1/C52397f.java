package ty1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.game.model.LocalTabCornerSetting;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import r60.C101350i;
import rx3.C13598b0;

/* renamed from: ty1.f */
public final class C52397f extends C87413o implements C32227p<C101350i<?>, Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LocalTabCornerSetting f146472d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f146473e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52397f(LocalTabCornerSetting localTabCornerSetting, ImageView imageView) {
        super(2);
        this.f146472d = localTabCornerSetting;
        this.f146473e = imageView;
    }

    public Object invoke(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        C87412m.m108594g((C101350i) obj, "<anonymous parameter 0>");
        Log.m105924i("GameWebSettingActionBar", "load tabTopSetting icon finished bitmap = " + bitmap + "  url:" + this.f146472d.f113215e);
        if (bitmap != null) {
            this.f146473e.setImageBitmap(bitmap);
        }
        return C13598b0.f38549a;
    }
}
