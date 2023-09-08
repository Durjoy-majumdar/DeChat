package sr2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import gy3.C87412m;
import hi2.C32925e;

/* renamed from: sr2.a */
public final class C101699a {

    /* renamed from: a */
    public static final C101699a f297754a = new C101699a();

    /* renamed from: a */
    public static String m133598a(C101699a aVar, Bitmap bitmap, String str, int i, Object obj) {
        Bitmap bitmap2 = bitmap;
        SnsMethodCalculate.markStartTimeMs("saveCoverBitmap$default", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        String str2 = (i & 2) != 0 ? null : str;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("saveCoverBitmap", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        C87412m.m108594g(bitmap, "bitmap");
        if (str2 == null) {
            str2 = C32925e.m39859d(C32925e.f89499a, "sns_cover", (String) null, 2, (Object) null);
        }
        String str3 = str2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            BitmapUtil.saveBitmapToImage(Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height, (Matrix) null, false), 100, Bitmap.CompressFormat.JPEG, str3, true);
        } else if (height > width) {
            BitmapUtil.saveBitmapToImage(Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width, (Matrix) null, false), 100, Bitmap.CompressFormat.JPEG, str3, true);
        } else {
            BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, str3, true);
        }
        SnsMethodCalculate.markEndTimeMs("saveCoverBitmap", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        SnsMethodCalculate.markEndTimeMs("saveCoverBitmap$default", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        return str3;
    }
}
