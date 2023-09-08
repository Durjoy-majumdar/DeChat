package nw1;

import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8479f0;
import gy3.C87412m;
import o40.C61926c;
import rx3.C36570n;

/* renamed from: nw1.j */
public final class C11290j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33226d;

    public C11290j(ImageCropUI imageCropUI) {
        this.f33226d = imageCropUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        ImageCropUI imageCropUI = this.f33226d;
        if (!imageCropUI.f19121z) {
            return true;
        }
        int intValue = ((Number) ((C36570n) imageCropUI.f19110o).getValue()).intValue();
        if (intValue == 1) {
            ImageCropUI.m4581H7(this.f33226d);
        } else if (intValue == 2) {
            ImageCropUI imageCropUI2 = this.f33226d;
            if (!imageCropUI2.f19116u) {
                imageCropUI2.f19116u = true;
                imageCropUI2.mo5352P7();
                C61926c.m72656A((String) null, new C11281c(imageCropUI2));
            }
        } else if (intValue == 3) {
            ImageCropUI imageCropUI3 = this.f33226d;
            if (!imageCropUI3.f19116u) {
                imageCropUI3.f19116u = true;
                imageCropUI3.mo5352P7();
                Intent intent = new Intent();
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = "";
                C61926c.m72656A((String) null, new C11303w(imageCropUI3, f0Var, intent));
            }
        } else if (intValue == 4) {
            ImageCropUI imageCropUI4 = this.f33226d;
            if (TextUtils.isEmpty(imageCropUI4.mo5349M7())) {
                str = imageCropUI4.mo5348L7();
            } else {
                byte[] O = C86013q1.m106433O(imageCropUI4.mo5348L7(), 0, -1);
                C86013q1.m106438T(imageCropUI4.mo5349M7(), O, 0, O.length);
                str = imageCropUI4.mo5349M7();
            }
            C87412m.m108593f(str, "if (TextUtils.isEmpty(ou…     outputPath\n        }");
            Intent intent2 = new Intent();
            intent2.putExtra("CropImage_Compress_Img", true);
            intent2.putExtra("CropImage_OutputPath", str);
            intent2.putExtra("from_source", imageCropUI4.getIntent().getIntExtra("from_source", 0));
            Log.m105924i("ImageCropReport", "inc: 9");
            C115669n.INSTANCE.mo175913w(1361, (long) 9, 1);
            imageCropUI4.setResult(-1, intent2);
            imageCropUI4.finish();
        }
        return true;
    }
}
