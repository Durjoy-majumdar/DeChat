package com.tencent.p014mm.plugin.finder.view;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.w2 */
public final class C4199w2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f18492d;

    /* renamed from: e */
    public final /* synthetic */ WeImageView f18493e;

    /* renamed from: f */
    public final /* synthetic */ int f18494f;

    /* renamed from: g */
    public final /* synthetic */ String f18495g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4199w2(Bitmap bitmap, WeImageView weImageView, int i, String str) {
        super(0);
        this.f18492d = bitmap;
        this.f18493e = weImageView;
        this.f18494f = i;
        this.f18495g = str;
    }

    public Object invoke() {
        Bitmap bitmap = this.f18492d;
        if (bitmap == null) {
            this.f18493e.setVisibility(8);
        } else {
            this.f18493e.setImageBitmap(bitmap);
            this.f18493e.setIconColor(this.f18494f);
        }
        Log.m105924i("Finder.HomeTabRedDotTipsBubbleView", "getImage resource :" + this.f18492d + " iconUrl:" + this.f18495g);
        return C13598b0.f38549a;
    }
}
