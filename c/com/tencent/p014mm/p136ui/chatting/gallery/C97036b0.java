package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.gallery.b0 */
public class C97036b0 implements MMViewPager.C19689f {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284647a;

    public C97036b0(ImageGalleryUI imageGalleryUI) {
        this.f284647a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo26037a(float f, float f2) {
        C97056h.C97067g gVar = C97056h.C97067g.video;
        float f3 = 1.0f;
        float height = 1.0f - (f2 / ((float) this.f284647a.f284450n.getHeight()));
        if (height <= 1.0f) {
            f3 = height;
        }
        this.f284647a.f284447l2 = f3;
        boolean z = false;
        boolean z2 = true;
        Log.m105919d("MicroMsg.ImageGalleryUI", "alvinluo onGalleryScale tx: %f, ty: %f, scale: %f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        ImageGalleryUI imageGalleryUI = this.f284647a;
        imageGalleryUI.f284455o2 = imageGalleryUI.mo135770g8(imageGalleryUI.f284432g, imageGalleryUI.f284450n);
        ImageGalleryUI imageGalleryUI2 = this.f284647a;
        if (imageGalleryUI2.f284455o2 != null) {
            if (f == 0.0f && f2 == 0.0f) {
                if (imageGalleryUI2.f284441j != gVar) {
                    z2 = false;
                }
                if (z2 && imageGalleryUI2.f284379N2) {
                    try {
                        C97087m1 v = imageGalleryUI2.f284432g.mo135934v();
                        v.mo135970f();
                        if (v.f284848o.getVisibility() == 8) {
                            C97087m1 v2 = imageGalleryUI2.f284432g.mo135934v();
                            v2.mo135970f();
                            v2.f284848o.setVisibility(0);
                            imageGalleryUI2.f284379N2 = false;
                        }
                    } catch (Exception unused) {
                    }
                }
                if (imageGalleryUI2.f284381O2) {
                    imageGalleryUI2.mo135753X8(false);
                    imageGalleryUI2.f284381O2 = false;
                }
            } else {
                if (Math.abs(f) > 10.0f || Math.abs(f2) > 10.0f) {
                    ImageGalleryUI imageGalleryUI3 = this.f284647a;
                    if (imageGalleryUI3.f284441j == gVar) {
                        z = true;
                    }
                    if (z) {
                        try {
                            C97087m1 v3 = imageGalleryUI3.f284432g.mo135934v();
                            v3.mo135970f();
                            if (v3.f284848o.getVisibility() == 0) {
                                C97087m1 v4 = imageGalleryUI3.f284432g.mo135934v();
                                v4.mo135970f();
                                v4.f284848o.setVisibility(8);
                                imageGalleryUI3.f284379N2 = true;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    if (imageGalleryUI3.f284456p.getVisibility() == 0) {
                        imageGalleryUI3.mo135719B8();
                    }
                    imageGalleryUI3.f284381O2 = true;
                }
                z = true;
            }
            ImageGalleryUI imageGalleryUI4 = this.f284647a;
            imageGalleryUI4.f284455o2.setPivotX((float) (imageGalleryUI4.f284450n.getWidth() / 2));
            ImageGalleryUI imageGalleryUI5 = this.f284647a;
            imageGalleryUI5.f284455o2.setPivotY((float) (imageGalleryUI5.f284450n.getHeight() / 2));
            this.f284647a.f284455o2.setScaleX(f3);
            this.f284647a.f284455o2.setScaleY(f3);
            this.f284647a.f284455o2.setTranslationX(f);
            this.f284647a.f284455o2.setTranslationY(f2);
            this.f284647a.f284406W0.setAlpha(f3);
            View view = this.f284647a.f284455o2;
            if (view instanceof WxImageView) {
                ((WxImageView) view).setDrawFullSampleSizeBitmap(z);
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.ImageGalleryUI", "runDragAnimation contentView is null !!");
    }

    /* renamed from: b */
    public void mo26038b(float f, float f2) {
        ImageGalleryUI imageGalleryUI = this.f284647a;
        imageGalleryUI.f284449m2 = (int) f;
        imageGalleryUI.f284452n2 = (int) f2;
    }
}
