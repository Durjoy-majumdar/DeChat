package v82;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105805i;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p910lj.C76701a;

/* renamed from: v82.w0 */
public final class C102161w0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f300824d;

    /* renamed from: e */
    public final /* synthetic */ Context f300825e;

    public C102161w0(Bitmap bitmap, Context context) {
        this.f300824d = bitmap;
        this.f300825e = context;
    }

    public final void run() {
        String exportImagePath = AndroidMediaUtil.getExportImagePath("jpg");
        boolean saveBitmapToImage = BitmapUtil.saveBitmapToImage(this.f300824d, 100, Bitmap.CompressFormat.JPEG, exportImagePath, true);
        if (!saveBitmapToImage) {
            Context context = this.f300825e;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.iak), 1).show();
        } else if (saveBitmapToImage) {
            AndroidMediaUtil.refreshMediaScannerAsync(exportImagePath, this.f300825e);
            C105805i iVar = C105851w0.zx0().f314462D;
            if (iVar != null) {
                iVar.mo150756S1(exportImagePath);
            }
        }
    }
}
