package com.tencent.kinda.framework.widget.base;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.ResourcesUtils;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KImage;
import com.tencent.kinda.gen.KSize;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class MMKImage implements KImage {
    private static final String PATTERN_FILE = "file://";
    private static final String PATTERN_HTTP = "http://";
    private static final String PATTERN_HTTPS = "https://";
    private ImageInfo darkImage = new ImageInfo();
    private ImageInfo lightImage = new ImageInfo();

    private ImageInfo getImage() {
        return (!C85875k4.m106211z() || Util.isNullOrNil(this.darkImage.url)) ? this.lightImage : this.darkImage;
    }

    private void setIconColor(int i) {
        getImage().setIconColor(i);
    }

    public MMKImage copy() {
        MMKImage mMKImage = new MMKImage();
        ImageInfo imageInfo = this.lightImage;
        if (imageInfo != null) {
            mMKImage.lightImage = imageInfo.copy();
        }
        ImageInfo imageInfo2 = this.darkImage;
        if (imageInfo2 != null) {
            mMKImage.darkImage = imageInfo2.copy();
        }
        return mMKImage;
    }

    public void drawableTint(DynamicColor dynamicColor) {
        getImage().drawableTint(dynamicColor);
    }

    public Bitmap getBitmap() {
        return getImage().getBitmap();
    }

    public String getDarkUrl() {
        return this.darkImage.url;
    }

    public Drawable getDrawable() {
        return getImage().getDrawable();
    }

    public float getHeight() {
        return getImage().getHeight();
    }

    public float getInputHeight() {
        ImageInfo imageInfo = this.lightImage;
        if (imageInfo == null) {
            return 0.0f;
        }
        return imageInfo.inputHeight;
    }

    public float getInputWidth() {
        ImageInfo imageInfo = this.lightImage;
        if (imageInfo == null) {
            return 0.0f;
        }
        return imageInfo.inputWidth;
    }

    public boolean getSupportDynamicSize() {
        return false;
    }

    public String getUrl() {
        return getImage().url;
    }

    public float getWidth() {
        return getImage().getWidth();
    }

    public boolean isNeedGetNetworkImageImmediately() {
        return getImage().needGetNetworkImageImmediately;
    }

    public boolean isNetworkImage() {
        return getImage().isNetworkImage;
    }

    public void setDarkModeUrl(String str) {
        ImageInfo imageInfo = this.darkImage;
        imageInfo.url = str;
        imageInfo.parse();
    }

    public void setNeedGetNetworkImageImmediately(boolean z) {
        this.lightImage.needGetNetworkImageImmediately = z;
        this.darkImage.needGetNetworkImageImmediately = z;
    }

    public void setSupportDynamicSize(boolean z) {
    }

    public void setSvgUrl(String str, DynamicColor dynamicColor) {
        getImage().setSvgUrl(str, dynamicColor);
    }

    public void setUrl(String str) {
        if (!str.equals("PaidDetail_WeChatPay.png")) {
            ImageInfo imageInfo = this.lightImage;
            imageInfo.url = str;
            imageInfo.parse();
        }
    }

    public void stretchImage(float f, float f2) {
    }

    public void setSvgUrl(String str, DynamicColor dynamicColor, KSize kSize) {
        getImage().setSvgUrl(str, dynamicColor, kSize);
    }

    public static class ImageInfo {
        public Drawable drawable;
        public float height = -1.0f;
        public Bitmap imageBitmap;
        public float inputHeight = 0.0f;
        public float inputWidth = 0.0f;
        public boolean isNetworkImage = false;
        public boolean isSvgUrl;
        public int localResId;
        private int mSvgColor;
        public boolean needGetNetworkImageImmediately = false;
        public String url;
        public float width = -1.0f;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.graphics.Bitmap getImageFromNet(java.lang.String r6) {
            /*
                r5 = this;
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                r1 = 0
                if (r0 != 0) goto L_0x005a
                java.lang.String r0 = "http://"
                boolean r0 = r6.startsWith(r0)
                java.lang.String r2 = "GET"
                r3 = 20000(0x4e20, float:2.8026E-41)
                r4 = 10000(0x2710, float:1.4013E-41)
                if (r0 == 0) goto L_0x002f
                com.tencent.mm.network.b0 r6 = com.tencent.p014mm.network.C81035d.m98963d(r6, r1)
                r6.mo112919d(r4)
                r6.mo112923g(r3)
                r6.mo112930l(r2)
                int r0 = r6.mo112916a()
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L_0x0052
                java.io.InputStream r6 = r6.getInputStream()
                goto L_0x0053
            L_0x002f:
                java.lang.String r0 = "https://"
                boolean r0 = r6.startsWith(r0)
                if (r0 == 0) goto L_0x0052
                com.tencent.mm.network.e0 r0 = new com.tencent.mm.network.e0
                r0.<init>(r6)
                javax.net.ssl.HttpsURLConnection r6 = r0.f108504a
                r6.setConnectTimeout(r4)
                javax.net.ssl.HttpsURLConnection r6 = r0.f108504a
                r6.setReadTimeout(r3)
                javax.net.ssl.HttpsURLConnection r6 = r0.f108504a
                r6.setRequestMethod(r2)
                javax.net.ssl.HttpsURLConnection r6 = r0.f108504a
                java.io.InputStream r6 = r6.getInputStream()
                goto L_0x0053
            L_0x0052:
                r6 = r1
            L_0x0053:
                if (r6 == 0) goto L_0x005a
                android.graphics.Bitmap r6 = com.tencent.p014mm.graphics.MMBitmapFactory.m98737f(r6)
                return r6
            L_0x005a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo.getImageFromNet(java.lang.String):android.graphics.Bitmap");
        }

        public ImageInfo copy() {
            ImageInfo imageInfo = new ImageInfo();
            imageInfo.url = this.url;
            imageInfo.imageBitmap = this.imageBitmap;
            imageInfo.drawable = this.drawable;
            imageInfo.width = this.width;
            imageInfo.height = this.height;
            imageInfo.isSvgUrl = this.isSvgUrl;
            imageInfo.mSvgColor = this.mSvgColor;
            imageInfo.isNetworkImage = this.isNetworkImage;
            imageInfo.needGetNetworkImageImmediately = this.needGetNetworkImageImmediately;
            imageInfo.inputWidth = this.inputWidth;
            imageInfo.inputHeight = this.inputHeight;
            return imageInfo;
        }

        public void drawableTint(DynamicColor dynamicColor) {
            Drawable drawable2 = this.drawable;
            if (drawable2 != null && dynamicColor != null) {
                drawable2.setColorFilter((int) ColorUtil.getColorByMode(dynamicColor), PorterDuff.Mode.SRC_ATOP);
                this.mSvgColor = (int) ColorUtil.getColorByMode(dynamicColor);
            }
        }

        public Bitmap getBitmap() {
            if (!Util.isNullOrNil(this.url) && this.imageBitmap == null && !this.isNetworkImage) {
                parse();
            }
            return this.imageBitmap;
        }

        public Drawable getDrawable() {
            if (!Util.isNullOrNil(this.url) && ((this.imageBitmap == null || this.drawable == null) && !this.isNetworkImage)) {
                parse();
            }
            if (this.imageBitmap != null) {
                return new BitmapDrawable(MMApplicationContext.getContext().getResources(), this.imageBitmap);
            }
            if (this.drawable == null) {
                return null;
            }
            setIconColor(this.mSvgColor);
            return this.drawable;
        }

        public float getHeight() {
            Bitmap bitmap = this.imageBitmap;
            if (bitmap != null) {
                return (float) bitmap.getHeight();
            }
            return 0.0f;
        }

        public float getWidth() {
            Bitmap bitmap = this.imageBitmap;
            if (bitmap != null) {
                return (float) bitmap.getWidth();
            }
            return 0.0f;
        }

        public void parse() {
            int resId;
            String str = this.url;
            if (str != null) {
                if (str.startsWith(MMKImage.PATTERN_FILE)) {
                    this.imageBitmap = BitmapUtil.getBitmapNative(this.url.replaceFirst(MMKImage.PATTERN_FILE, ""));
                } else if (this.url.startsWith("http://") || this.url.startsWith("https://")) {
                    this.isNetworkImage = true;
                    if (this.needGetNetworkImageImmediately) {
                        try {
                            this.imageBitmap = getImageFromNet(this.url);
                        } catch (Exception unused) {
                            this.imageBitmap = null;
                        }
                    }
                } else {
                    int drawableId = ResourcesUtils.getDrawableId(MMApplicationContext.getContext(), this.url);
                    this.localResId = drawableId;
                    if ((drawableId == 0 || this.isSvgUrl) && (resId = ResourcesUtils.getResId(MMApplicationContext.getContext(), this.url, ShareConstants.DEXMODE_RAW)) != 0) {
                        this.localResId = resId;
                    }
                    Bitmap decodeResource = BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), this.localResId);
                    this.imageBitmap = decodeResource;
                    if (decodeResource == null) {
                        try {
                            this.drawable = MMApplicationContext.getContext().getResources().getDrawable(this.localResId);
                        } catch (Resources.NotFoundException unused2) {
                            this.drawable = null;
                        }
                    }
                }
                Bitmap bitmap = this.imageBitmap;
                if (bitmap != null) {
                    this.width = (float) bitmap.getWidth();
                    this.height = (float) this.imageBitmap.getHeight();
                }
            }
        }

        public void setIconColor(int i) {
            if (this.drawable != null) {
                int i2 = i != 0 ? (16777215 & i) | -16777216 : i;
                int alpha = Color.alpha(i);
                this.drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
                if (i != 0) {
                    this.drawable.setAlpha(alpha);
                }
            }
        }

        public void setSvgUrl(String str, DynamicColor dynamicColor) {
            this.isSvgUrl = true;
            this.url = str;
            parse();
            if (this.drawable != null && dynamicColor != null) {
                setIconColor((int) ColorUtil.getColorByMode(dynamicColor));
                this.mSvgColor = (int) ColorUtil.getColorByMode(dynamicColor);
            }
        }

        public void setSvgUrl(String str, DynamicColor dynamicColor, KSize kSize) {
            this.inputWidth = kSize.getWidth();
            this.inputHeight = kSize.getHeight();
            setSvgUrl(str, dynamicColor);
        }
    }
}
