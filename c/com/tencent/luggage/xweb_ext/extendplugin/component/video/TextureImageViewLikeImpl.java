package com.tencent.luggage.xweb_ext.extendplugin.component.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1066yc.C91417m;

public class TextureImageViewLikeImpl extends ConstraintLayout implements C91417m {

    /* renamed from: v */
    public final FrameLayout f235043v;

    /* renamed from: w */
    public final TextureView f235044w;

    /* renamed from: x */
    public final ImageView f235045x;

    public TextureImageViewLikeImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Bitmap getBitmap() {
        return this.f235044w.getBitmap();
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.f235044w.getSurfaceTexture();
    }

    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return this.f235044w.getSurfaceTextureListener();
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            this.f235045x.setImageBitmap(bitmap);
            this.f235045x.setVisibility(0);
            return;
        }
        this.f235045x.setVisibility(4);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f235044w.setSurfaceTextureListener(surfaceTextureListener);
    }

    public void setTextureViewHeightWeight(float f) {
        Log.m105924i("MicroMsg.AppBrand.TextureImageViewLikeImpl", "setTextureViewHeightWeight, heightWeight: " + f);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f235043v.getLayoutParams();
        layoutParams.height = 0;
        layoutParams.f44423O = f;
        layoutParams.width = -1;
        this.f235043v.setLayoutParams(layoutParams);
    }

    public void setTextureViewWidthWeight(float f) {
        Log.m105924i("MicroMsg.AppBrand.TextureImageViewLikeImpl", "setTextureViewWidthWeight, widthWeight: " + f);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f235043v.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.f44422N = f;
        layoutParams.height = -1;
        this.f235043v.setLayoutParams(layoutParams);
    }

    public TextureImageViewLikeImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setId(C0966R.C0970id.f5972tq);
        setBackgroundColor(-16777216);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f235043v = frameLayout;
        addView(frameLayout, -1, -1);
        frameLayout.setId(C0966R.C0970id.f5971tp);
        TextureView textureView = new TextureView(context);
        this.f235044w = textureView;
        frameLayout.addView(textureView, -1, -1);
        ImageView imageView = new ImageView(context);
        this.f235045x = imageView;
        frameLayout.addView(imageView, -1, -1);
        imageView.setVisibility(4);
        C16569a aVar = new C16569a();
        aVar.mo16716c(this);
        C16569a aVar2 = aVar;
        aVar2.mo16718e(C0966R.C0970id.f5971tp, 3, C0966R.C0970id.f5972tq, 3, 0);
        aVar2.mo16718e(C0966R.C0970id.f5971tp, 4, C0966R.C0970id.f5972tq, 4, 0);
        aVar2.mo16718e(C0966R.C0970id.f5971tp, 1, C0966R.C0970id.f5972tq, 1, 0);
        aVar2.mo16718e(C0966R.C0970id.f5971tp, 2, C0966R.C0970id.f5972tq, 2, 0);
        aVar.mo16714a(this);
        setConstraintSet((C16569a) null);
    }
}
