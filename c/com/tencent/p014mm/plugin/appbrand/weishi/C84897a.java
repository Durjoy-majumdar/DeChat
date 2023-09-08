package com.tencent.p014mm.plugin.appbrand.weishi;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bt0.b$$h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import hi3.C87515a;

/* renamed from: com.tencent.mm.plugin.appbrand.weishi.a */
public class C84897a extends b$$h {

    /* renamed from: a */
    public final /* synthetic */ C84899c f247424a;

    public C84897a(C84899c cVar) {
        this.f247424a = cVar;
    }

    /* renamed from: a */
    public int mo109966a() {
        return C0966R.dimen.f4063q_;
    }

    /* renamed from: d */
    public void mo109969d(ImageView imageView, ImageView imageView2, View view, View view2) {
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.clearColorFilter();
            Log.m105924i("MicroMsg.AppBrandThumbLoadingSplash", "[weishi] set close button");
            imageView.setImageDrawable(C87515a.m108835e(this.f247424a.getContext().getResources(), C0966R.raw.app_brand_weishi_video_btn_close, 0.0f));
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -2;
            imageView.setLayoutParams(layoutParams);
        }
        if (view != null) {
            view.setBackground((Drawable) null);
        }
    }
}
