package ty1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.LocalTabCornerSetting;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import r60.C101350i;
import rx3.C13598b0;

/* renamed from: ty1.e */
public final class C52396e extends C87413o implements C32227p<C101350i<?>, Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LocalTabCornerSetting f146469d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f146470e;

    /* renamed from: f */
    public final /* synthetic */ C52393c f146471f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52396e(LocalTabCornerSetting localTabCornerSetting, ImageView imageView, C52393c cVar) {
        super(2);
        this.f146469d = localTabCornerSetting;
        this.f146470e = imageView;
        this.f146471f = cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        C87412m.m108594g((C101350i) obj, "<anonymous parameter 0>");
        Log.m105924i("GameWebSettingActionBar", "load tabTopSetting icon finished bitmap = " + bitmap + "  url:" + this.f146469d.f113215e);
        if (bitmap != null) {
            this.f146470e.setImageBitmap(bitmap);
        } else {
            C52393c cVar = this.f146471f;
            ImageView imageView = this.f146470e;
            C87412m.m108593f(imageView, "imageView");
            cVar.mo73392o(imageView, C0966R.raw.game_msg_top_tip);
        }
        return C13598b0.f38549a;
    }
}
