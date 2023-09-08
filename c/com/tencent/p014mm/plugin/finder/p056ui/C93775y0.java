package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import r60.C101350i;

/* renamed from: com.tencent.mm.plugin.finder.ui.y0 */
public final class C93775y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101350i<?> f270660d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f270661e;

    public C93775y0(C101350i<?> iVar, Bitmap bitmap) {
        this.f270660d = iVar;
        this.f270661e = bitmap;
    }

    public final void run() {
        View a = this.f270660d.mo140837a();
        if (a != null) {
            Bitmap bitmap = this.f270661e;
            MultiTouchImageView multiTouchImageView = (MultiTouchImageView) a;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            multiTouchImageView.f348280o = width;
            multiTouchImageView.f348281p = height;
            multiTouchImageView.mo26059d();
        }
    }
}
