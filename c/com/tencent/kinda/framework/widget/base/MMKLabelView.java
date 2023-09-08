package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.BaselineAdjustmentAlign;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.Ellipsize;
import com.tencent.kinda.gen.FontStyle;
import com.tencent.kinda.gen.KLabelView;
import com.tencent.kinda.gen.TextAlign;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import de3.C75355a0;
import di3.C86312j;
import kg3.C76577a;
import p629ny.C76979h;

public class MMKLabelView extends MMKView<TextView> implements KLabelView {
    private Ellipsize ellipsize;
    private FontStyle fontStyle = FontStyle.REGULAR;
    private int maxLength = -1;
    private MMKRichText richText;
    private TextAlign textAlign = TextAlign.LEFT;
    private DynamicColor textColor = new DynamicColor(-1, 0);
    private String textFontName;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKLabelView$1 */
    public static /* synthetic */ class C676261 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$Ellipsize;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$TextAlign;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.tencent.kinda.gen.TextAlign[] r0 = com.tencent.kinda.gen.TextAlign.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$kinda$gen$TextAlign = r0
                r1 = 1
                com.tencent.kinda.gen.TextAlign r2 = com.tencent.kinda.gen.TextAlign.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$tencent$kinda$gen$TextAlign     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.TextAlign r3 = com.tencent.kinda.gen.TextAlign.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$TextAlign     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.gen.TextAlign r4 = com.tencent.kinda.gen.TextAlign.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.tencent.kinda.gen.Ellipsize[] r3 = com.tencent.kinda.gen.Ellipsize.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$tencent$kinda$gen$Ellipsize = r3
                com.tencent.kinda.gen.Ellipsize r4 = com.tencent.kinda.gen.Ellipsize.TAIL     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$tencent$kinda$gen$Ellipsize     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.tencent.kinda.gen.Ellipsize r3 = com.tencent.kinda.gen.Ellipsize.HEAD     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$Ellipsize     // Catch:{ NoSuchFieldError -> 0x004d }
                com.tencent.kinda.gen.Ellipsize r1 = com.tencent.kinda.gen.Ellipsize.MIDDLE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.MMKLabelView.C676261.<clinit>():void");
        }
    }

    private void updateTypeface() {
        String str = this.textFontName;
        if (str != null) {
            int i = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : this.textFontName.equalsIgnoreCase("WeChat-Sans-Std-Medium") ? 4 : this.textFontName.equalsIgnoreCase("WeChat-Sans-Std-Light") ? 6 : this.textFontName.equalsIgnoreCase("WeChat-Sans-Std-Bold") ? 5 : this.textFontName.equalsIgnoreCase("WeChat-Sans-Std-Regular") ? 7 : -1;
            if (i != -1) {
                try {
                    ((TextView) getView()).setTypeface(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), C75228t.m90273v(i)));
                    return;
                } catch (Exception e) {
                    Log.m105921e(MMKView.TAG, "setTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                    ((TextView) getView()).setTypeface((Typeface) null, 0);
                    return;
                }
            }
        }
        FontStyle fontStyle2 = this.fontStyle;
        if (fontStyle2 == FontStyle.BOLD) {
            ((TextView) getView()).setTypeface((Typeface) null, 1);
        } else if (fontStyle2 == FontStyle.MEDIUM) {
            C85875k4.m106189j0(((TextView) getView()).getPaint(), 0.8f);
        } else {
            ((TextView) getView()).setTypeface((Typeface) null, 0);
        }
    }

    public boolean getAdjustsFontSizeToFitWidth() {
        return false;
    }

    public BaselineAdjustmentAlign getBaselineAdjustment() {
        return null;
    }

    public Ellipsize getEllipsize() {
        return this.ellipsize;
    }

    public FontStyle getFontStyle() {
        return this.fontStyle;
    }

    public float getLineSpacingFactor() {
        return 0.0f;
    }

    public int getLines() {
        return ((TextView) getView()).getLineCount();
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public String getText() {
        Log.m105918d(MMKView.TAG, "MMKLabelView getText ");
        CharSequence text = ((TextView) getView()).getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public TextAlign getTextAlign() {
        return this.textAlign;
    }

    public DynamicColor getTextColor() {
        return this.textColor;
    }

    public String getTextFont() {
        return this.textFontName;
    }

    public float getTextSize() {
        return (float) C76577a.m92152c(MMApplicationContext.getContext(), (int) ((TextView) getView()).getTextSize());
    }

    public void notifyChanged() {
        super.notifyChanged();
    }

    public void setAdjustsFontSizeToFitWidth(boolean z) {
    }

    public void setBaselineAdjustment(BaselineAdjustmentAlign baselineAdjustmentAlign) {
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        ((TextView) getView()).setEnabled(z);
    }

    public void setEllipsize(Ellipsize ellipsize2) {
        this.ellipsize = ellipsize2;
        int i = C676261.$SwitchMap$com$tencent$kinda$gen$Ellipsize[ellipsize2.ordinal()];
        if (i == 1) {
            ((TextView) getView()).setEllipsize(TextUtils.TruncateAt.END);
        } else if (i == 2) {
            ((TextView) getView()).setEllipsize(TextUtils.TruncateAt.START);
        } else if (i == 3) {
            ((TextView) getView()).setEllipsize(TextUtils.TruncateAt.MIDDLE);
        }
        notifyChanged();
    }

    public void setFontStyle(FontStyle fontStyle2) {
        this.fontStyle = fontStyle2;
        updateTypeface();
    }

    public void setLineSpacingFactor(float f) {
    }

    public void setLines(int i) {
        if (i > 0) {
            ((TextView) getView()).setMaxLines(i);
            notifyChanged();
        }
    }

    public void setMaxLength(int i) {
        if (i >= 0) {
            this.maxLength = i;
            ((TextView) getView()).setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxLength)});
        }
    }

    public void setText(String str) {
        if (str != null) {
            ((TextView) getView()).setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(MMApplicationContext.getContext(), str, ((TextView) getView()).getTextSize()));
            notifyChanged();
        }
    }

    public void setTextAlign(TextAlign textAlign2) {
        if (textAlign2 != null) {
            this.textAlign = textAlign2;
            int gravity = ((TextView) getView()).getGravity();
            int i = C676261.$SwitchMap$com$tencent$kinda$gen$TextAlign[this.textAlign.ordinal()];
            if (i == 1) {
                ((TextView) getView()).setGravity(gravity | 3);
            } else if (i == 2) {
                ((TextView) getView()).setGravity(17);
            } else if (i == 3) {
                ((TextView) getView()).setGravity(5);
            }
        }
    }

    public void setTextColor(DynamicColor dynamicColor) {
        this.textColor = dynamicColor;
        StringBuilder sb = new StringBuilder();
        sb.append("setTextColor: ");
        ColorUtil.MMViewType mMViewType = ColorUtil.MMViewType.MMKLabelViewText;
        sb.append(Integer.toHexString(MMKViewUtil.argbColor(ColorUtil.getColorByMode(dynamicColor, mMViewType))));
        Log.m105918d("MMKLabelView", sb.toString());
        ((TextView) getView()).setTextColor(MMKViewUtil.argbColor(ColorUtil.getColorByMode(dynamicColor, mMViewType)));
        notifyChanged();
    }

    public void setTextFont(String str) {
        if (str != null) {
            this.textFontName = str;
            updateTypeface();
        }
    }

    public void setTextSize(float f) {
        if (f > 0.0f) {
            float f2 = 1.0f;
            if (getSupportDynamicSize()) {
                f2 = MMKViewUtil.getScaleSize(MMApplicationContext.getContext());
            }
            ((TextView) getView()).setTextSize(1, f * f2);
            notifyChanged();
        }
    }

    public TextView createView(Context context) {
        TextView textView = new TextView(context);
        textView.setOnTouchListener(new C75355a0());
        textView.setGravity(19);
        if (ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            textView.setTextColor(context.getResources().getColor(C0966R.color.a7f));
            this.textColor = new DynamicColor(Long.parseLong("E6000000", 16), Long.parseLong("CCFFFFFF", 16));
        }
        return textView;
    }
}
