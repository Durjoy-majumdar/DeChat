package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KImage;
import com.tencent.kinda.gen.KImageView;
import com.tencent.kinda.gen.ScaleType;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import yq3.C79147d;

public class MMKImageView extends MMKView<CdnImageView> implements KImageView {
    private byte[] ImageData;
    private MMKImage defaultImage = new MMKImage();
    private MMKImage image = new MMKImage();
    private ScaleType scaleType;
    private DynamicColor tintColor = new DynamicColor(0, 0);

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKImageView$1 */
    public static /* synthetic */ class C676251 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$ScaleType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.kinda.gen.ScaleType[] r0 = com.tencent.kinda.gen.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$kinda$gen$ScaleType = r0
                com.tencent.kinda.gen.ScaleType r1 = com.tencent.kinda.gen.ScaleType.FILL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$ScaleType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.ScaleType r1 = com.tencent.kinda.gen.ScaleType.ASPECTFIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$ScaleType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.gen.ScaleType r1 = com.tencent.kinda.gen.ScaleType.ASPECTFILL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$ScaleType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.kinda.gen.ScaleType r1 = com.tencent.kinda.gen.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.MMKImageView.C676251.<clinit>():void");
        }
    }

    private void setIconColor(int i, Drawable drawable) {
        if (drawable != null) {
            int i2 = i != 0 ? (16777215 & i) | -16777216 : i;
            int alpha = Color.alpha(i);
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
            if (i != 0) {
                drawable.setAlpha(alpha);
            }
        }
    }

    public String getDarkModeUrl() {
        return this.image.getDarkUrl();
    }

    public String getDefaultUrl() {
        return this.defaultImage.getUrl();
    }

    public KImage getImage() {
        return this.image;
    }

    public byte[] getImageData() {
        return this.ImageData;
    }

    public ScaleType getScaleType() {
        return this.scaleType;
    }

    public DynamicColor getTintColor() {
        return this.tintColor;
    }

    public String getUrl() {
        return this.image.getUrl();
    }

    public void setCornerRadius(float f) {
        super.setCornerRadius(f);
        if ((getView() instanceof CdnImageView) && getWidth() > 0.0f) {
            ((CdnImageView) getView()).setRoundCorner(true);
            ((CdnImageView) getView()).setRoundCornerRate(f / getWidth());
        }
    }

    public void setDarkModeUrl(String str) {
        MMKImage copy = this.image.copy();
        copy.setDarkModeUrl(str);
        setImage(copy);
    }

    public void setDefaultUrl(String str) {
        if (this.defaultImage == null) {
            this.defaultImage = new MMKImage();
        }
        this.defaultImage.setUrl(str);
        MMKImage mMKImage = this.image;
        if ((mMKImage == null || Util.isNullOrNil(mMKImage.getUrl())) && !Util.isNullOrNil(this.defaultImage.getUrl())) {
            if (this.defaultImage.isNetworkImage()) {
                ((CdnImageView) getView()).setUrl(this.defaultImage.getUrl());
            } else {
                ((CdnImageView) getView()).setImageBitmap(this.defaultImage.getBitmap());
            }
        }
        setCornerRadius(2.0f);
    }

    public void setImage(KImage kImage) {
        if (kImage != null && (kImage instanceof MMKImage)) {
            MMKImage mMKImage = this.image;
            MMKImage mMKImage2 = (MMKImage) kImage;
            this.image = mMKImage2;
            if (mMKImage2.isNetworkImage()) {
                boolean z = true;
                if (!(mMKImage == null || mMKImage.getUrl() == null || this.image.getUrl() == null || !mMKImage.getUrl().equals(this.image.getUrl()))) {
                    z = false;
                }
                if (z) {
                    ((CdnImageView) getView()).setUrl(this.image.getUrl());
                }
            } else if (this.image.getBitmap() != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(MMApplicationContext.getContext().getResources(), this.image.getBitmap());
                if (ColorUtil.getColorByMode(this.tintColor) != 0) {
                    bitmapDrawable.setColorFilter((int) ColorUtil.getColorByMode(this.tintColor), PorterDuff.Mode.SRC_ATOP);
                    setIconColor((int) ColorUtil.getColorByMode(this.tintColor), bitmapDrawable);
                }
                ((CdnImageView) getView()).setImageDrawable(bitmapDrawable);
            } else if (this.image.getDrawable() != null) {
                Drawable drawable = this.image.getDrawable();
                if (ColorUtil.getColorByMode(this.tintColor) != 0) {
                    drawable.setColorFilter((int) ColorUtil.getColorByMode(this.tintColor), PorterDuff.Mode.SRC_ATOP);
                    setIconColor((int) ColorUtil.getColorByMode(this.tintColor), drawable);
                }
                ((CdnImageView) getView()).setImageDrawable(drawable);
            }
            notifyChanged();
        }
    }

    public void setImageData(byte[] bArr) {
        if (bArr != null) {
            this.ImageData = bArr;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            setHeight((float) decodeByteArray.getHeight());
            ((CdnImageView) getView()).setImageBitmap(decodeByteArray);
        }
    }

    public void setScaleType(ScaleType scaleType2) {
        this.scaleType = scaleType2;
        int i = C676251.$SwitchMap$com$tencent$kinda$gen$ScaleType[scaleType2.ordinal()];
        if (i == 1) {
            ((CdnImageView) getView()).setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i == 2) {
            ((CdnImageView) getView()).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i == 3) {
            ((CdnImageView) getView()).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else if (i == 4) {
            ((CdnImageView) getView()).setScaleType(ImageView.ScaleType.CENTER);
        }
        notifyChanged();
    }

    public void setTintColor(DynamicColor dynamicColor) {
        if (ColorUtil.getColorByModeNoCompat(this.tintColor) != ColorUtil.getColorByMode(dynamicColor)) {
            this.tintColor = dynamicColor;
            Drawable drawable = ((CdnImageView) getView()).getDrawable();
            if (drawable != null) {
                drawable.setColorFilter((int) ColorUtil.getColorByMode(this.tintColor), PorterDuff.Mode.SRC_ATOP);
                setIconColor((int) ColorUtil.getColorByMode(this.tintColor), drawable);
                ((CdnImageView) getView()).setImageDrawable(drawable);
            }
            notifyChanged();
        }
    }

    public void setUrl(String str) {
        MMKImage copy = this.image.copy();
        copy.setSvgUrl(str, this.tintColor);
        setImage(copy);
    }

    public CdnImageView createView(Context context) {
        CdnImageView cdnImageView = new CdnImageView(context, (AttributeSet) null);
        cdnImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        cdnImageView.setAdjustViewBounds(true);
        cdnImageView.setUseSdcardCache(true);
        cdnImageView.setImgSavedDir(C79147d.m95779a());
        this.image.setNeedGetNetworkImageImmediately(false);
        this.defaultImage.setNeedGetNetworkImageImmediately(false);
        cdnImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return cdnImageView;
    }
}
