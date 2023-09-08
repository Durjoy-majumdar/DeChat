package v82;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105805i;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p910lj.C76701a;

/* renamed from: v82.y0 */
public final class C102162y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f300826d;

    /* renamed from: e */
    public final /* synthetic */ Context f300827e;

    public C102162y0(Bitmap bitmap, Context context) {
        this.f300826d = bitmap;
        this.f300827e = context;
    }

    public final void run() {
        String exportImagePath = AndroidMediaUtil.getExportImagePath("jpg");
        boolean saveBitmapToImage = BitmapUtil.saveBitmapToImage(this.f300826d, 100, Bitmap.CompressFormat.JPEG, exportImagePath, true);
        if (!saveBitmapToImage) {
            Context context = this.f300827e;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.iak), 1).show();
        } else if (saveBitmapToImage) {
            AndroidMediaUtil.refreshMediaScannerAsync(exportImagePath, this.f300827e);
            C105805i iVar = C105851w0.zx0().f314462D;
            if (iVar != null) {
                iVar.mo150752G3(exportImagePath);
            }
        }
    }
}
