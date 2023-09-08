package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import kg3.C76577a;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.f0 */
public class C84526f0 implements C88394b.C88408j {

    /* renamed from: d */
    public final /* synthetic */ C84552k0 f246673d;

    public C84526f0(C84552k0 k0Var) {
        this.f246673d = k0Var;
    }

    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        return BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) C76577a.m92151b(this.f246673d.getContext(), 3)) * 1.0f, false);
    }

    public String key() {
        return "appbrand_game_loading_age";
    }
}
