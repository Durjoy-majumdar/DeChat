package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewTreeObserver;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$e */
public class u$g$$e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public boolean f250010d = false;

    /* renamed from: e */
    public final /* synthetic */ C74244u.C74255e f250011e;

    /* renamed from: f */
    public final /* synthetic */ C67391b f250012f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f250013g;

    public u$g$$e(C74244u.C74261g gVar, C74244u.C74255e eVar, C67391b bVar, Bitmap bitmap) {
        this.f250011e = eVar;
        this.f250012f = bVar;
        this.f250013g = bitmap;
    }

    public boolean onPreDraw() {
        if (this.f250010d) {
            this.f250011e.f218087x.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        this.f250011e.f218087x.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f250010d = true;
        int b = C76577a.m92151b(this.f250012f.mo91565f(), 24);
        Bitmap bitmap = this.f250013g;
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = BitmapUtil.createColorBitmap(this.f250012f.mo91565f().getResources().getColor(C0966R.color.f3227jy), b, b);
        }
        int height = bitmap.getHeight();
        if (b > height) {
            b = height;
        }
        Bitmap fastblur = BitmapUtil.fastblur(BitmapUtil.setContrast(Bitmap.createScaledBitmap(bitmap, b, b, true), 0.9f), 20);
        int height2 = this.f250011e.f218087x.getHeight();
        int width = this.f250011e.f218087x.getWidth();
        if (height2 == 0) {
            height2 = C76577a.m92157h(this.f250012f.mo91565f(), C0966R.dimen.f4282ym);
        }
        if (width == 0) {
            width = C76577a.m92157h(this.f250012f.mo91565f(), C0966R.dimen.f4283yn);
        }
        this.f250011e.f218087x.setBackgroundDrawable(new BitmapDrawable(BitmapUtil.createMaskImage(fastblur, C0966R.C0969drawable.byb, width, height2)));
        return true;
    }
}
