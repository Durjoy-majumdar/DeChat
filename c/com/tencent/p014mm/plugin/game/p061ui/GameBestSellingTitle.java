package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBestSellingTitle */
public class GameBestSellingTitle extends LinearLayout {
    public GameBestSellingTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setText(String str) {
        if (Util.isNullOrNil(str)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        ((TextView) findViewById(C0966R.C0970id.ei4)).setText(str);
    }
}
