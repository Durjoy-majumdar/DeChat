package v52;

import a70.C112760b;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import hc0.C20937c;
import p823sg.C90193h;

/* renamed from: v52.b */
public class C14411b {
    /* renamed from: a */
    public static void m13704a(ImageView imageView, String str, int i) {
        if (imageView != null) {
            String str2 = null;
            imageView.setImageBitmap((Bitmap) null);
            if (!Util.isNullOrNil(str)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                if (!Util.isNullOrNil(str)) {
                    str2 = String.format("%s/%s", new Object[]{C112760b.m154195C() + "wallet/mall", C90193h.m112878f(str.getBytes())});
                }
                bVar.f59351g = str2;
                bVar.f59346b = true;
                bVar.f59363s = true;
                bVar.f59364t = false;
                if (i != 0) {
                    bVar.f59359o = i;
                }
                C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
            } else if (i != 0) {
                imageView.setImageResource(i);
            }
        }
    }
}
