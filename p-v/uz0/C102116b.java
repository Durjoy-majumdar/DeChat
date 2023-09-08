package uz0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import c70.C92359a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;

/* renamed from: uz0.b */
public final class C102116b implements C102120y {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f300697a;

    /* renamed from: b */
    public final /* synthetic */ String f300698b;

    /* renamed from: c */
    public final /* synthetic */ Context f300699c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f300700d;

    public C102116b(Bitmap bitmap, String str, Context context, ImageView imageView) {
        this.f300697a = bitmap;
        this.f300698b = str;
        this.f300699c = context;
        this.f300700d = imageView;
    }

    /* renamed from: a */
    public void mo141622a(int i) {
        long a = C92359a.m116168a(this.f300697a);
        Log.m105919d("MicroMsg.CardViewUtils", "bitmap size:%d B newsize:%s, url:%s", Long.valueOf(a), Util.getSizeKB(a), this.f300698b);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f300699c.getResources(), this.f300697a);
        ColorDrawable colorDrawable = new ColorDrawable(C76577a.m92153d(this.f300699c, C0966R.color.UN_BW_0_Alpha_0_1));
        int i2 = i & 16777215;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16777216 | i2, i2 | 436207616});
        gradientDrawable.setGradientType(0);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, gradientDrawable, colorDrawable});
        ImageView imageView = this.f300700d;
        if (imageView != null) {
            imageView.setImageDrawable(layerDrawable);
        }
    }
}
