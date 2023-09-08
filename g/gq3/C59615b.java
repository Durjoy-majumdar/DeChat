package gq3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import z04.C112551y;

/* renamed from: gq3.b */
public final class C59615b {

    /* renamed from: a */
    public final View f170342a;

    /* renamed from: b */
    public final WxImageView f170343b;

    /* renamed from: c */
    public final View f170344c;

    public C59615b(View view) {
        C87412m.m108594g(view, "convertView");
        this.f170342a = view;
        View findViewById = view.findViewById(C0966R.C0970id.mdy);
        C87412m.m108593f(findViewById, "convertView.findViewById…e_query_gallery_wx_image)");
        this.f170343b = (WxImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.mdt);
        C87412m.m108593f(findViewById2, "convertView.findViewById…query_gallery_image_fail)");
        this.f170344c = findViewById2;
    }

    /* renamed from: a */
    public final void mo84632a(String str) {
        String str2 = str;
        C87412m.m108594g(str2, "path");
        Log.m105924i("MicroMsg.ImageQueryGalleryViewHolder", "setImage >> " + str2);
        if (C86013q1.m106450k(str) && !C112551y.m153808h(str2, ".temp", false, 2, (Object) null)) {
            Log.m105924i("MicroMsg.ImageQueryGalleryViewHolder", "setImage >> is set");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Bitmap d = MMBitmapFactory.m98735d(str2, options);
            if (d != null) {
                d.recycle();
            }
            int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
            this.f170343b.setVisibility(0);
            View view = this.f170344c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f170343b.setOrientation(exifOrientation);
            WxImageView wxImageView = this.f170343b;
            int i = options.outWidth;
            int i2 = options.outHeight;
            wxImageView.f48889h = i;
            wxImageView.f48890i = i2;
            wxImageView.mo26059d();
            this.f170343b.mo21400p(str2, ImageSource.uri(str));
        } else if (C112551y.m153808h(str2, ".temp", false, 2, (Object) null)) {
            Log.m105924i("MicroMsg.ImageQueryGalleryViewHolder", "path: " + str2 + " is error");
            View view3 = this.f170344c;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f170343b.setVisibility(8);
            View findViewById = this.f170344c.findViewById(C0966R.C0970id.m57);
            C87412m.m108593f(findViewById, "errorView.findViewById(R…query_download_fail_text)");
            ((TextView) findViewById).setText(C0966R.string.m7w);
        } else {
            Log.m105924i("MicroMsg.ImageQueryGalleryViewHolder", "path: " + str2 + " is no exist");
            View view5 = this.f170344c;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f170343b.setVisibility(8);
            View findViewById2 = this.f170344c.findViewById(C0966R.C0970id.m57);
            C87412m.m108593f(findViewById2, "errorView.findViewById(R…query_download_fail_text)");
            ((TextView) findViewById2).setText(C0966R.string.m7v);
        }
    }
}
