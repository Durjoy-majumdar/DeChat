package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import eb0.C86493v0;
import ht0.C87586a;
import ht0.C87587b;
import km0.C88226c;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.l */
public class C83545l implements C87587b {

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.l$a */
    public class C83546a extends FrameLayout implements C87586a {

        /* renamed from: d */
        public ImageView f244067d;

        /* renamed from: e */
        public MMAnimateView f244068e;

        /* renamed from: f */
        public boolean f244069f;

        /* renamed from: g */
        public C88226c f244070g = null;

        /* renamed from: h */
        public C86493v0.C86495c f244071h;

        public C83546a(C83545l lVar, Context context) {
            super(context);
            MMAnimateView mMAnimateView = new MMAnimateView(context, (AttributeSet) null);
            this.f244068e = mMAnimateView;
            addView(mMAnimateView, new ViewGroup.LayoutParams(-1, -1));
            this.f244068e.setVisibility(8);
            this.f244068e.setBoundaryCheckInvalid(true);
            ImageView imageView = new ImageView(context);
            this.f244067d = imageView;
            addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            this.f244067d.setVisibility(8);
        }

        /* renamed from: a */
        public boolean mo115841a() {
            return this.f244069f;
        }

        public C86493v0.C86495c getKeyValueSet() {
            return this.f244071h;
        }

        public C88226c getReferrerPolicy() {
            return this.f244070g;
        }

        public View getView() {
            return this;
        }

        public void setImageBitmap(Bitmap bitmap) {
            this.f244068e.setVisibility(8);
            this.f244067d.setVisibility(0);
            this.f244067d.setImageBitmap(bitmap);
        }

        public void setImageByteArray(byte[] bArr) {
            this.f244068e.setVisibility(0);
            this.f244067d.setVisibility(8);
            this.f244068e.mo129233t(bArr, "");
        }

        public void setImageFilePath(String str) {
            this.f244068e.setVisibility(0);
            this.f244067d.setVisibility(8);
            this.f244068e.setImageFilePath(str);
        }

        public void setInterceptEvent(boolean z) {
            this.f244069f = z;
        }

        public void setKeyValueSet(C86493v0.C86495c cVar) {
            this.f244071h = cVar;
        }

        public void setReferrerPolicy(C88226c cVar) {
            this.f244070g = cVar;
        }

        public void setScaleType(ImageView.ScaleType scaleType) {
            this.f244067d.setScaleType(scaleType);
            this.f244068e.setScaleType(scaleType);
        }
    }

    /* renamed from: RN */
    public C87586a mo115840RN(Context context) {
        return new C83546a(this, context);
    }
}
