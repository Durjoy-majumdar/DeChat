package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.widget.TextView;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KOpenIMInfoView;
import com.tencent.kinda.gen.TextAlign;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75355a0;
import kg3.C76577a;

public class KindaOpenIMInfoView extends MMKView<TextView> implements KOpenIMInfoView {
    /* access modifiers changed from: private */
    public String businessName = "";
    /* access modifiers changed from: private */
    public String formatText = "";
    /* access modifiers changed from: private */
    public String nickName = "";
    private TextAlign textAlign = TextAlign.LEFT;
    private DynamicColor textColor = new DynamicColor(-1, 0);
    /* access modifiers changed from: private */
    public String trueName = "";

    /* renamed from: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView$2 */
    public static /* synthetic */ class C675952 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$TextAlign;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.kinda.gen.TextAlign[] r0 = com.tencent.kinda.gen.TextAlign.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$kinda$gen$TextAlign = r0
                com.tencent.kinda.gen.TextAlign r1 = com.tencent.kinda.gen.TextAlign.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$TextAlign     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.TextAlign r1 = com.tencent.kinda.gen.TextAlign.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$TextAlign     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.gen.TextAlign r1 = com.tencent.kinda.gen.TextAlign.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.C675952.<clinit>():void");
        }
    }

    public String getBusinessNameText() {
        return this.businessName;
    }

    public String getFormatText() {
        return this.formatText;
    }

    public String getNickNameText() {
        return this.nickName;
    }

    public TextAlign getTextAlign() {
        return this.textAlign;
    }

    public DynamicColor getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return (float) C76577a.m92152c(MMApplicationContext.getContext(), (int) ((TextView) getView()).getTextSize());
    }

    public String getTrueNameText() {
        return this.trueName;
    }

    public void setBusinessNameText(String str) {
        this.businessName = str;
        notifyChanged();
    }

    public void setFormatText(String str) {
        this.formatText = str;
        notifyChanged();
    }

    public void setNickNameText(String str) {
        this.nickName = str;
        notifyChanged();
    }

    public void setTextAlign(TextAlign textAlign2) {
        if (textAlign2 != null) {
            this.textAlign = textAlign2;
            int gravity = ((TextView) getView()).getGravity();
            int i = C675952.$SwitchMap$com$tencent$kinda$gen$TextAlign[this.textAlign.ordinal()];
            if (i == 1) {
                ((TextView) getView()).setGravity(gravity | 3);
            } else if (i == 2) {
                ((TextView) getView()).setGravity(17);
            } else if (i == 3) {
                ((TextView) getView()).setGravity(5);
            }
            notifyChanged();
        }
    }

    public void setTextColor(DynamicColor dynamicColor) {
        this.textColor = dynamicColor;
        StringBuilder sb = new StringBuilder();
        sb.append("setNormalColor: ");
        ColorUtil.MMViewType mMViewType = ColorUtil.MMViewType.MMKLabelViewText;
        sb.append(Integer.toHexString(MMKViewUtil.argbColor(ColorUtil.getColorByMode(dynamicColor, mMViewType))));
        Log.m105918d("KindaOpenIMInfoView", sb.toString());
        ((TextView) getView()).setTextColor(MMKViewUtil.argbColor(ColorUtil.getColorByMode(dynamicColor, mMViewType)));
        notifyChanged();
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

    public void setTrueNameText(String str) {
        this.trueName = str;
        notifyChanged();
    }

    public void updateContent() {
        final TextView textView = (TextView) getView();
        String str = this.formatText;
        textView.setText(String.format(str, new Object[]{this.nickName + this.trueName + this.businessName}));
        textView.post(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0092, code lost:
                if (r10 < r12) goto L_0x0094;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r13 = this;
                    android.widget.TextView r0 = r0
                    android.text.TextPaint r0 = r0.getPaint()
                    android.widget.TextView r1 = r0
                    int r1 = r1.getWidth()
                    android.widget.TextView r2 = r0
                    float r2 = r2.getTextSize()
                    int r6 = (int) r2
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r2 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r2 = r2.formatText
                    java.lang.String r3 = "%s"
                    int r2 = r2.indexOf(r3)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r3 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r3 = r3.formatText
                    r4 = 0
                    java.lang.String r3 = r3.substring(r4, r2)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r4 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r4 = r4.formatText
                    int r2 = r2 + 2
                    java.lang.String r2 = r4.substring(r2)
                    float r4 = r0.measureText(r3)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r5 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r5 = r5.trueName
                    float r5 = r0.measureText(r5)
                    float r7 = r0.measureText(r2)
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r3)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r9 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r9 = r9.nickName
                    r8.append(r9)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r9 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r9 = r9.trueName
                    r8.append(r9)
                    java.lang.String r8 = r8.toString()
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r10 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r10 = r10.businessName
                    r9.append(r10)
                    r9.append(r2)
                    java.lang.String r9 = r9.toString()
                    float r10 = r0.measureText(r8)
                    float r11 = r0.measureText(r9)
                    float r11 = r11 + r10
                    int r12 = r1 * 2
                    float r12 = (float) r12
                    int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r12 > 0) goto L_0x0094
                    float r12 = (float) r1
                    int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r11 <= 0) goto L_0x00e5
                    int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r10 >= 0) goto L_0x00e5
                L_0x0094:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r3)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r3 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r3 = r3.nickName
                    float r1 = (float) r1
                    float r4 = r1 - r4
                    float r4 = r4 - r5
                    android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
                    java.lang.CharSequence r3 = android.text.TextUtils.ellipsize(r3, r0, r4, r5)
                    java.lang.String r3 = r3.toString()
                    r8.append(r3)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r3 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r3 = r3.trueName
                    r8.append(r3)
                    java.lang.String r8 = r8.toString()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "\n"
                    r3.append(r4)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r4 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    java.lang.String r4 = r4.businessName
                    float r1 = r1 - r7
                    android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
                    java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r4, r0, r1, r5)
                    java.lang.String r0 = r0.toString()
                    r3.append(r0)
                    r3.append(r2)
                    java.lang.String r9 = r3.toString()
                L_0x00e5:
                    r0 = r8
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r0)
                    r1.append(r9)
                    java.lang.String r1 = r1.toString()
                    java.lang.Class<ny.h> r3 = p629ny.C76979h.class
                    di3.d r3 = di3.C86312j.m106911c(r3)
                    ny.h r3 = (p629ny.C76979h) r3
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r4 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    android.content.Context r4 = r4.mContext
                    android.text.SpannableString r9 = r3.mo107057T1(r4, r1)
                    com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView r3 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.this
                    android.content.Context r3 = r3.mContext
                    r4 = 2131099865(0x7f0600d9, float:1.7812095E38)
                    android.content.res.ColorStateList r8 = kg3.C76577a.m92154e(r3, r4)
                    android.text.style.TextAppearanceSpan r10 = new android.text.style.TextAppearanceSpan
                    r4 = 0
                    r5 = 0
                    r3 = r10
                    r7 = r8
                    r3.<init>(r4, r5, r6, r7, r8)
                    int r0 = r0.length()
                    int r1 = r1.length()
                    int r2 = r2.length()
                    int r1 = r1 - r2
                    r2 = 33
                    r9.setSpan(r10, r0, r1, r2)
                    android.widget.TextView r0 = r0
                    android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
                    r0.setText(r9, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.C675941.run():void");
            }
        });
    }

    public TextView createView(Context context) {
        TextView textView = new TextView(context);
        textView.setOnTouchListener(new C75355a0());
        textView.setGravity(19);
        textView.setLines(2);
        if (ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            textView.setTextColor(context.getResources().getColor(C0966R.color.a7f));
            this.textColor = new DynamicColor(Long.parseLong("E6000000", 16), Long.parseLong("CCFFFFFF", 16));
        }
        return textView;
    }
}
