package fh1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: fh1.j1 */
public final class C8060j1 implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f26805d;

    public C8060j1(C59018f2 f2Var) {
        this.f26805d = f2Var;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 != i6 && i4 != i8) {
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "addOnLayoutChangeListener change");
            C59079s2 s2Var = (C59079s2) this.f26805d.controller(C59079s2.class);
            if (s2Var != null) {
                C59079s2.m69007m3(s2Var, true, s2Var.mo84287n3(), false, 4, (Object) null);
            }
        }
    }
}
