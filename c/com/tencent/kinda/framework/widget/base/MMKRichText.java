package com.tencent.kinda.framework.widget.base;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import au0.C67109c;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.KindaFontUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.FontStyle;
import com.tencent.kinda.gen.KLink;
import com.tencent.kinda.gen.KText;
import com.tencent.kinda.gen.LinkStyle;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75359b0;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p629ny.C76979h;
import wd3.C53155r0;

public class MMKRichText implements KText {
    public boolean hasLinkAndCanCallback = false;
    public VoidCallback linkCallback;
    private SpannableStringBuilder spanText = new SpannableStringBuilder("");

    public static class MMKLink implements KLink {
        private DynamicColor bgColor;
        private int bgRadius;
        /* access modifiers changed from: private */
        public VoidCallback clickCallback;
        private FontStyle fontStyle = FontStyle.REGULAR;
        public boolean hasCallBack = false;
        private int linkColor;
        private LinkStyle linkStyle;
        private boolean setLinkColor = false;
        private String text;
        private String textFontName;
        private float textSize;

        public static class LinkClickableSpan extends C75359b0 {
            private byte _hellAccFlag_;
            private VoidCallback clickCallback;
            private int linkColor;
            private LinkStyle linkStyle;

            public LinkClickableSpan(int i, VoidCallback voidCallback) {
                super(2, (C53155r0) null);
                this.linkColor = i;
                this.clickCallback = voidCallback;
                setColor(i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/MMKRichText$MMKLink$LinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = this.clickCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/MMKRichText$MMKLink$LinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
            }
        }

        public SpannableString get() {
            SpannableString spannableString = new SpannableString("");
            if (this.text != null) {
                spannableString = new SpannableString(this.text);
            }
            if (!this.setLinkColor && ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
                this.linkColor = MMKViewUtil.argbColor(ColorUtil.getColorByMode(new DynamicColor(Long.parseLong("E6000000", 16), Long.parseLong("CCFFFFFF", 16))));
            }
            spannableString.setSpan(new ForegroundColorSpan(this.linkColor), 0, spannableString.length(), 33);
            if (this.clickCallback != null) {
                spannableString.setSpan(new LinkClickableSpan(this.linkColor, this.clickCallback), 0, spannableString.length(), 33);
            }
            if (this.linkStyle == LinkStyle.DELETED) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
            if (this.linkStyle == LinkStyle.UNDERLINE) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            DynamicColor dynamicColor = this.bgColor;
            if (dynamicColor != null) {
                long colorByMode = ColorUtil.getColorByMode(dynamicColor);
                int b = C76577a.m92151b(MMApplicationContext.getContext(), 8);
                spannableString.setSpan(new C67109c(this.text, b, b, (int) this.textSize, this.linkColor, (int) colorByMode, this.bgRadius), 0, spannableString.length(), 33);
            }
            if (!TextUtils.isEmpty(this.textFontName) || this.fontStyle != FontStyle.REGULAR) {
                spannableString.setSpan(new KindaFontUtil.KindaTypefaceSpan(this.textFontName, this.fontStyle), 0, spannableString.length(), 33);
            }
            return spannableString;
        }

        public void setBackground(DynamicColor dynamicColor, int i) {
            this.bgColor = dynamicColor;
            this.bgRadius = C76577a.m92151b(MMApplicationContext.getContext(), i);
        }

        public void setFontStyle(FontStyle fontStyle2) {
            this.fontStyle = fontStyle2;
        }

        public void setLinkCallbackImpl(VoidCallback voidCallback) {
            if (voidCallback != null) {
                this.clickCallback = voidCallback;
                this.hasCallBack = true;
            }
        }

        public void setLinkColor(DynamicColor dynamicColor) {
            this.linkColor = MMKViewUtil.argbColor(ColorUtil.getColorByMode(dynamicColor));
            this.setLinkColor = true;
        }

        public void setLinkFont(String str) {
            this.textFontName = str;
        }

        public void setLinkStyle(LinkStyle linkStyle2) {
            this.linkStyle = linkStyle2;
        }

        public void setText(String str) {
            this.text = str;
        }

        public void setTextSize(float f) {
            this.textSize = (float) C76577a.m92150a(MMApplicationContext.getContext(), f);
        }
    }

    public void appendLink(KLink kLink) {
        if (kLink != null && (kLink instanceof MMKLink)) {
            MMKLink mMKLink = (MMKLink) kLink;
            this.spanText.append(mMKLink.get());
            this.hasLinkAndCanCallback = mMKLink.hasCallBack;
            this.linkCallback = mMKLink.clickCallback;
        }
    }

    public void appendText(String str) {
        if (str != null) {
            this.spanText.append(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str));
        }
    }

    public CharSequence get() {
        return this.spanText;
    }
}
