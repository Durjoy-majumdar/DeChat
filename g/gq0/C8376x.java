package gq0;

import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76878h0;

/* renamed from: gq0.x */
public final class C8376x implements C76878h0 {

    /* renamed from: a */
    public static final C8376x f27366a = new C8376x();

    /* renamed from: a */
    public final void mo6974a(ImageView imageView, ImageView imageView2, MenuItem menuItem) {
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onAttach#iconCreator");
        imageView.setImageResource(C85875k4.m106211z() ? C0966R.raw.app_brand_open_material_filled_more_night : C0966R.raw.app_brand_open_material_filled_more_normal);
    }
}
