package com.tencent.kinda.framework.widget.base;

import android.widget.TextView;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KRichLabelView;
import com.tencent.kinda.gen.KText;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

public class MMKRichLabelView extends MMKLabelView implements KRichLabelView {
    public VoidCallback linkCallback;
    private MMKRichText richText;

    public KText getRichText() {
        return this.richText;
    }

    public void setRichText(KText kText) {
        if (kText != null && (kText instanceof MMKRichText)) {
            MMKRichText mMKRichText = (MMKRichText) kText;
            this.richText = mMKRichText;
            this.linkCallback = mMKRichText.linkCallback;
            ((TextView) getView()).setText(this.richText.get());
            if (this.richText.hasLinkAndCanCallback) {
                ((TextView) getView()).setClickable(true);
            } else {
                ((TextView) getView()).setClickable(false);
            }
            Log.m105919d("MMKRichLabelView", "setRichText: %s, raw color: %s, color: %s, colorHex: %s", this.richText.get().toString(), "" + getTextColor(), Integer.valueOf(MMKViewUtil.argbColor(ColorUtil.getColorByMode(getTextColor(), ColorUtil.MMViewType.MMKRichLabelView))), Integer.toHexString(MMKViewUtil.argbColor(ColorUtil.getColorByModeNoCompat(getTextColor()))));
            setTextColor(getTextColor());
            notifyChanged();
        }
    }

    public void setTextColor(DynamicColor dynamicColor) {
        super.setTextColor(dynamicColor);
        Log.m105918d("MMKRichLabelView", "setTextColor: " + Integer.toHexString(MMKViewUtil.argbColor(ColorUtil.getColorByMode(dynamicColor, ColorUtil.MMViewType.MMKRichLabelView))));
        ((TextView) getView()).setTextColor(MMKViewUtil.argbColor(ColorUtil.getColorByModeNoCompat(dynamicColor)));
        notifyChanged();
    }
}
