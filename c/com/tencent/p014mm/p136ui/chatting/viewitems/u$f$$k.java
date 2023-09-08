package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewTreeObserver;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$f$$k */
public class u$f$$k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public boolean f250006d = false;

    /* renamed from: e */
    public final /* synthetic */ C74244u.C74255e f250007e;

    /* renamed from: f */
    public final /* synthetic */ C67391b f250008f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f250009g;

    public u$f$$k(C74244u.C74260f fVar, C74244u.C74255e eVar, C67391b bVar, Bitmap bitmap) {
        this.f250007e = eVar;
        this.f250008f = bVar;
        this.f250009g = bitmap;
    }

    public boolean onPreDraw() {
        if (this.f250006d) {
            this.f250007e.f218087x.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        this.f250007e.f218087x.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f250006d = true;
        int b = C76577a.m92151b(this.f250008f.mo91565f(), 24);
        Bitmap bitmap = this.f250009g;
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = BitmapUtil.createColorBitmap(this.f250008f.mo91565f().getResources().getColor(C0966R.color.f3227jy), b, b);
        }
        int height = bitmap.getHeight();
        if (b > height) {
            b = height;
        }
        Bitmap fastblur = BitmapUtil.fastblur(BitmapUtil.setContrast(Bitmap.createScaledBitmap(bitmap, b, b, true), 0.9f), 20);
        int height2 = this.f250007e.f218087x.getHeight();
        int width = this.f250007e.f218087x.getWidth();
        if (height2 == 0) {
            height2 = C76577a.m92157h(this.f250008f.mo91565f(), C0966R.dimen.f4282ym);
        }
        if (width == 0) {
            width = C76577a.m92157h(this.f250008f.mo91565f(), C0966R.dimen.f4283yn);
        }
        this.f250007e.f218087x.setBackgroundDrawable(new BitmapDrawable(BitmapUtil.createMaskImage(fastblur, C0966R.C0969drawable.by6, width, height2)));
        return true;
    }
}
