package uz0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hz0.C76251l;
import k60.C99101e;
import kg3.C76577a;
import n60.C100075f;
import p391w3.C22857b;
import r60.C101350i;
import rx3.C13598b0;

/* renamed from: uz0.c */
public final class C102117c {

    /* renamed from: uz0.c$a */
    public static final class C102118a extends C87413o implements C32227p<C101350i<?>, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f300701d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f300702e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102118a(String str, ImageView imageView) {
            super(2);
            this.f300701d = str;
            this.f300702e = imageView;
        }

        public Object invoke(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            C87412m.m108594g((C101350i) obj, "imageView");
            if (bitmap != null) {
                String str = this.f300701d;
                ImageView imageView = this.f300702e;
                Context context = MMApplicationContext.getContext();
                int d = C76577a.m92153d(context, C0966R.color.f2953a_);
                C102116b bVar = new C102116b(bitmap, str, context, imageView);
                if (!bitmap.isRecycled()) {
                    new C22857b.C22859b(bitmap).mo36018a(new C102119d(bVar, d));
                } else {
                    Log.m105924i("MicroMsg.CardViewUtils", "getPrimaryColor, bitmap is null");
                    bVar.mo141622a(d);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final Drawable m134520a(int i) {
        Context context = MMApplicationContext.getContext();
        ColorDrawable colorDrawable = new ColorDrawable(i);
        ColorDrawable colorDrawable2 = new ColorDrawable(C76577a.m92153d(context, C0966R.color.UN_BW_0_Alpha_0_1));
        int i2 = i & 16777215;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16777216 | i2, i2 | 436207616});
        gradientDrawable.setGradientType(0);
        return new LayerDrawable(new Drawable[]{colorDrawable, gradientDrawable, colorDrawable2});
    }

    /* renamed from: b */
    public static final void m134521b(ImageView imageView, String str, int i, int i2) {
        if (str != null && imageView != null) {
            C102118a aVar = new C102118a(str, imageView);
            C100075f.C100076a aVar2 = new C100075f.C100076a();
            String m = C76251l.m91644m(str);
            C87412m.m108593f(m, "getPictureStoragePath(url)");
            aVar2.f293178d = m;
            aVar2.f293176b = true;
            aVar2.f293186l = false;
            aVar2.f293180f = i;
            aVar2.f293181g = i2;
            aVar2.f293175a = true;
            C99101e.f290571b.mo138473h(str, imageView, aVar2.mo139398a(), aVar);
        }
    }
}
