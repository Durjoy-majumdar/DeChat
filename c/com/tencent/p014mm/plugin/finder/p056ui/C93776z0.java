package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import r60.C101350i;

/* renamed from: com.tencent.mm.plugin.finder.ui.z0 */
public final class C93776z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101350i<?> f270662d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f270663e;

    public C93776z0(C101350i<?> iVar, Bitmap bitmap) {
        this.f270662d = iVar;
        this.f270663e = bitmap;
    }

    public final void run() {
        View a = this.f270662d.mo140837a();
        if (a != null) {
            Bitmap bitmap = this.f270663e;
            MultiTouchImageView multiTouchImageView = (MultiTouchImageView) a;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            multiTouchImageView.f348280o = width;
            multiTouchImageView.f348281p = height;
            multiTouchImageView.mo26059d();
        }
    }
}
