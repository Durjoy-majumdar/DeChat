package p875ci;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;

/* renamed from: ci.a */
public class C67372a {

    /* renamed from: a */
    public Bitmap f193232a;

    /* renamed from: a */
    public static Bitmap m79723a(Context context, Bitmap bitmap) {
        if (context == null || bitmap == null) {
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104902) - context.getResources().getDimensionPixelSize(C0966R.dimen.ag9);
        return BitmapUtil.getRoundedCornerBitmap(BitmapUtil.extractThumbNail(bitmap, dimensionPixelSize, dimensionPixelSize, false, false), false, (float) context.getResources().getDimensionPixelSize(C0966R.dimen.ag8));
    }
}
