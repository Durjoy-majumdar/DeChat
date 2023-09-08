package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.FrameLayout;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.FontStyle;
import com.tencent.kinda.gen.KButton;
import com.tencent.kinda.gen.KImage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.ArrayList;
import kg3.C76577a;

public class MMKButton extends MMKView<KindaButtonImpl> implements KButton {
    public static final String TAG = "MMKView.MMKButton";
    private String accessibilityString;
    private long disabledColor = -1;
    private MMKImage disabledImage;
    private FontStyle fontStyle = FontStyle.REGULAR;
    private long horizontalPadding;
    private boolean isEnableHighlight = true;
    private DynamicColor normalColor = new DynamicColor(-1, 0);
    private MMKImage normalImage;
    private long pressedColor = -1;
    private MMKImage pressedImage;
    private long selectedColor = -1;
    private MMKImage selectedImage;
    private long textDisabledColor = -1;
    private String textFontName;
    private DynamicColor textNormalColor = new DynamicColor(-1, 0);
    private long textPressedColor = -1;
    private long textSelectedColor = -1;
    private float textSize;
    private long verticalPadding;

    public static class BackgroundColorDrawable extends Drawable {
        private int color;

        public BackgroundColorDrawable(int i) {
            this.color = i;
        }

        public void draw(Canvas canvas) {
            canvas.drawColor(this.color);
        }

        public int getOpacity() {
            int i = this.color;
            if (i == 0) {
                return -2;
            }
            return Color.alpha(i) > 0 ? -3 : -1;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    private void updateBackgroundWithColor() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (this.isEnableHighlight && this.pressedColor >= 0) {
            int[] iArr = {16842919};
            stateListDrawable.addState(iArr, new BackgroundColorDrawable(MMKViewUtil.argbColor(this.pressedColor)));
        }
        if (this.selectedColor >= 0) {
            int[] iArr2 = {16842913};
            stateListDrawable.addState(iArr2, new BackgroundColorDrawable(MMKViewUtil.argbColor(this.selectedColor)));
        }
        if (this.disabledColor >= 0) {
            int[] iArr3 = {-16842910};
            stateListDrawable.addState(iArr3, new BackgroundColorDrawable(MMKViewUtil.argbColor(this.disabledColor)));
        }
        if (ColorUtil.getColorByMode(this.normalColor) >= 0) {
            stateListDrawable.addState(new int[0], new BackgroundColorDrawable(MMKViewUtil.argbColor(ColorUtil.getColorByModeNoCompat(this.normalColor))));
        }
        setViewBackground(stateListDrawable);
    }

    private void updateBackgroundWithImage() {
        MMKImage mMKImage;
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (this.isEnableHighlight && (mMKImage = this.pressedImage) != null && !mMKImage.isNetworkImage()) {
            stateListDrawable.addState(new int[]{16842919}, this.pressedImage.getDrawable());
        }
        MMKImage mMKImage2 = this.selectedImage;
        if (mMKImage2 != null && !mMKImage2.isNetworkImage()) {
            stateListDrawable.addState(new int[]{16842913}, this.selectedImage.getDrawable());
        }
        MMKImage mMKImage3 = this.disabledImage;
        if (mMKImage3 != null && !mMKImage3.isNetworkImage()) {
            stateListDrawable.addState(new int[]{-16842910}, this.disabledImage.getDrawable());
        }
        MMKImage mMKImage4 = this.normalImage;
        if (mMKImage4 != null && !mMKImage4.isNetworkImage()) {
            stateListDrawable.addState(new int[0], this.normalImage.getDrawable());
        }
        ((KindaButtonImpl) getView()).setImageDrawable(stateListDrawable);
    }

    private void updateTextColor() {
        if (ColorUtil.getColorByModeNoCompat(this.textNormalColor) >= 0 || this.textSelectedColor >= 0 || this.textPressedColor >= 0 || this.textDisabledColor >= 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.textSelectedColor >= 0) {
                arrayList.add(new int[]{16842913});
                arrayList2.add(Integer.valueOf(MMKViewUtil.argbColor(this.textSelectedColor)));
            }
            if (this.isEnableHighlight && this.textPressedColor >= 0) {
                arrayList.add(new int[]{16842919});
                arrayList2.add(Integer.valueOf(MMKViewUtil.argbColor(this.textPressedColor)));
            }
            if (this.textDisabledColor >= 0) {
                arrayList.add(new int[]{-16842910});
                arrayList2.add(Integer.valueOf(MMKViewUtil.argbColor(this.textDisabledColor)));
            }
            if (ColorUtil.getColorByModeNoCompat(this.textNormalColor) >= 0) {
                arrayList.add(new int[0]);
                arrayList2.add(Integer.valueOf(MMKViewUtil.argbColor(ColorUtil.getColorByModeNoCompat(this.textNormalColor))));
            }
            int size = arrayList2.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((Integer) arrayList2.get(i)).intValue();
            }
            int[][] iArr2 = new int[arrayList.size()][];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr2[i2] = (int[]) arrayList.get(i2);
            }
            ((KindaButtonImpl) getView()).setTextColor(new ColorStateList(iArr2, iArr));
        }
    }

    private void updateTypeface() {
        String str = this.textFontName;
        if (str != null) {
            int i = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : -1;
            if (i != -1) {
                try {
                    ((KindaButtonImpl) getView()).getKButtonTextView().setTypeface(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), C75228t.m90273v(i)));
                    return;
                } catch (Exception e) {
                    Log.m105921e(TAG, "setTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                    return;
                }
            }
        }
        if (this.fontStyle == FontStyle.REGULAR) {
            ((KindaButtonImpl) getView()).getKButtonTextView().setTypeface((Typeface) null, 0);
        } else {
            ((KindaButtonImpl) getView()).getKButtonTextView().setTypeface((Typeface) null, 1);
        }
    }

    public DynamicColor getDisableColor() {
        return null;
    }

    public DynamicColor getDisableTextColor() {
        return null;
    }

    public KImage getDisabledImage() {
        return this.disabledImage;
    }

    public boolean getEnable() {
        return ((KindaButtonImpl) getView()).isEnabled();
    }

    public long getExpandHitHeight() {
        return 0;
    }

    public long getExpandHitWidth() {
        return 0;
    }

    public FontStyle getFontStyle() {
        return this.fontStyle;
    }

    public long getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public DynamicColor getNormalColor() {
        return this.normalColor;
    }

    public KImage getNormalImage() {
        return this.normalImage;
    }

    public KImage getPressedImage() {
        return this.pressedImage;
    }

    public KImage getSelectedImage() {
        return this.selectedImage;
    }

    public String getText() {
        if (((KindaButtonImpl) getView()).getText() != null) {
            return ((KindaButtonImpl) getView()).getText().toString();
        }
        return null;
    }

    public String getTextFont() {
        return this.textFontName;
    }

    public DynamicColor getTextNormalColor() {
        return this.textNormalColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public long getVerticalPadding() {
        return this.verticalPadding;
    }

    public void setDisableColor(DynamicColor dynamicColor) {
        long colorByModeNoCompat = ColorUtil.getColorByModeNoCompat(dynamicColor);
        if (this.disabledColor != colorByModeNoCompat) {
            this.disabledColor = colorByModeNoCompat;
            updateBackgroundWithColor();
        }
    }

    public void setDisableTextColor(DynamicColor dynamicColor) {
        long colorByModeNoCompat = ColorUtil.getColorByModeNoCompat(dynamicColor);
        if (this.textDisabledColor != colorByModeNoCompat) {
            this.textDisabledColor = colorByModeNoCompat;
            updateTextColor();
        }
    }

    public void setDisabledImage(KImage kImage) {
        if (kImage instanceof MMKImage) {
            this.disabledImage = (MMKImage) kImage;
            updateBackgroundWithImage();
        }
    }

    public void setEnable(boolean z) {
        ((KindaButtonImpl) getView()).setEnabled(z);
        ((KindaButtonImpl) getView()).setNestEnabled(z);
        updateTextColor();
        ((KindaButtonImpl) getView()).setClickable(z);
    }

    public void setEnableHighLight(boolean z) {
        this.isEnableHighlight = z;
    }

    public void setExpandHitHeight(long j) {
    }

    public void setExpandHitWidth(long j) {
    }

    public void setFontStyle(FontStyle fontStyle2) {
        this.fontStyle = fontStyle2;
        updateTypeface();
    }

    public void setHorizontalPadding(long j) {
        this.horizontalPadding = j;
        KindaTextViewImpl kButtonTextView = ((KindaButtonImpl) getView()).getKButtonTextView();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kButtonTextView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = C76577a.m92150a(this.mContext, (float) this.horizontalPadding);
            layoutParams.rightMargin = C76577a.m92150a(this.mContext, (float) this.horizontalPadding);
            kButtonTextView.setLayoutParams(layoutParams);
        }
    }

    public void setNormalColor(DynamicColor dynamicColor) {
        if (ColorUtil.getColorByModeNoCompat(this.normalColor) != ColorUtil.getColorByMode(dynamicColor)) {
            this.normalColor = dynamicColor;
            if (ColorUtil.getColorByModeNoCompat(dynamicColor) != 0) {
                this.pressedColor = ColorUtil.MergeColors(ColorUtil.getColorByModeNoCompat(dynamicColor), 436207616);
                if (this.disabledColor == -1) {
                    if (ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
                        this.disabledColor = Long.parseLong("14FFFFFF", 16);
                    } else {
                        this.disabledColor = ColorUtil.MergeColors(ColorUtil.getColorByModeNoCompat(dynamicColor), 2583691263L);
                    }
                }
            }
            updateBackgroundWithColor();
            Log.m105924i(TAG, "MMKButton[" + getText() + "] setNormalColor设置完成后，normalColor：" + this.normalColor + "，pressedColor：" + this.pressedColor + "，disabledColor：" + this.disabledColor);
            return;
        }
        Log.m105924i(TAG, "MMKButton[" + getText() + "] setNormalColor设置相同值。");
    }

    public void setNormalImage(KImage kImage) {
        if (kImage instanceof MMKImage) {
            this.normalImage = (MMKImage) kImage;
            updateBackgroundWithImage();
        }
    }

    public void setPressedImage(KImage kImage) {
        if (kImage instanceof MMKImage) {
            this.pressedImage = (MMKImage) kImage;
            updateBackgroundWithImage();
        }
    }

    public void setSelectedImage(KImage kImage) {
        if (kImage instanceof MMKImage) {
            this.selectedImage = (MMKImage) kImage;
            updateBackgroundWithImage();
        }
    }

    public void setText(String str) {
        if (str != null) {
            ((KindaButtonImpl) getView()).setText(str);
        }
    }

    public void setTextFont(String str) {
        if (str != null) {
            this.textFontName = str;
            ((KindaButtonImpl) getView()).setTextFont(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), str));
            notifyChanged();
        }
    }

    public void setTextNormalColor(DynamicColor dynamicColor) {
        if (ColorUtil.getColorByModeNoCompat(this.textNormalColor) != ColorUtil.getColorByMode(dynamicColor, ColorUtil.MMViewType.MMKButtonText)) {
            this.textNormalColor = dynamicColor;
            long colorByModeNoCompat = (((long) 153.0f) << 24) | (ColorUtil.getColorByModeNoCompat(dynamicColor) & 16777215);
            this.textPressedColor = colorByModeNoCompat;
            if (this.textDisabledColor == -1) {
                this.textDisabledColor = colorByModeNoCompat;
            }
            Log.m105918d(TAG, "100mango pressedColor" + Long.toString(this.textPressedColor) + "disableColor" + Long.toString(this.textDisabledColor));
            Log.m105918d(TAG, "100mango pressedColor" + Long.toHexString(this.textPressedColor) + "disableColor" + Long.toHexString(this.textDisabledColor));
            updateTextColor();
        }
    }

    public void setTextSize(float f) {
        if (f > 0.0f) {
            float f2 = 1.0f;
            if (getSupportDynamicSize()) {
                f2 = MMKViewUtil.getScaleSize(MMApplicationContext.getContext());
            }
            this.textSize = f * f2;
            ((KindaButtonImpl) getView()).setTextSize(1, this.textSize);
        }
    }

    public void setVerticalPadding(long j) {
        this.verticalPadding = j;
        KindaTextViewImpl kButtonTextView = ((KindaButtonImpl) getView()).getKButtonTextView();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kButtonTextView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.topMargin = C76577a.m92150a(this.mContext, (float) this.verticalPadding);
            layoutParams.bottomMargin = C76577a.m92150a(this.mContext, (float) this.verticalPadding);
            kButtonTextView.setLayoutParams(layoutParams);
        }
    }

    public KindaButtonImpl createView(Context context) {
        KindaButtonImpl kindaButtonImpl = new KindaButtonImpl(context);
        kindaButtonImpl.setClickable(true);
        kindaButtonImpl.setEnabled(true);
        return kindaButtonImpl;
    }
}
