package v82;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p910lj.C76701a;

/* renamed from: v82.u0 */
public final class C102160u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f300822d;

    /* renamed from: e */
    public final /* synthetic */ Context f300823e;

    public C102160u0(Bitmap bitmap, Context context) {
        this.f300822d = bitmap;
        this.f300823e = context;
    }

    public final void run() {
        String exportImagePath = AndroidMediaUtil.getExportImagePath("jpg");
        boolean saveBitmapToImage = BitmapUtil.saveBitmapToImage(this.f300822d, 100, Bitmap.CompressFormat.JPEG, exportImagePath, true);
        if (!saveBitmapToImage) {
            Context context = this.f300823e;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.iak), 1).show();
        } else if (saveBitmapToImage) {
            AndroidMediaUtil.refreshMediaScannerAsync(exportImagePath, this.f300823e);
            Context context2 = this.f300823e;
            C76701a.makeText(context2, (CharSequence) context2.getString(C0966R.string.iap, new Object[]{AndroidMediaUtil.getSysCameraDirPath()}), 1).show();
        }
    }
}
