package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.c7 */
public class C6804c7 {

    /* renamed from: a */
    public C6807n4 f24359a;

    public C6804c7(C6807n4 n4Var) {
        this.f24359a = n4Var;
        Context context = n4Var.getContext();
        TextView textView = new TextView(context, (AttributeSet) null, C0966R.style.f8403h_);
        textView.setBackgroundResource(C0966R.C0969drawable.f4797n7);
        textView.setId(C0966R.C0970id.b8u);
        textView.setVisibility(8);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(C0966R.dimen.f3964lm);
        int h = C76577a.m92157h(context, C0966R.dimen.f3964lm);
        if (h != dimensionPixelSize) {
            Log.m105921e("MicroMsg.ChattingItemStackMsgContainerHandler", "warn!!! cacheSize:%s sysSize:%s", Integer.valueOf(h), Integer.valueOf(dimensionPixelSize));
        }
        textView.setTextSize(0, (float) dimensionPixelSize);
        textView.setTextColor(context.getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setPadding(context.getResources().getDimensionPixelSize(C0966R.dimen.f3627k), context.getResources().getDimensionPixelSize(C0966R.dimen.f3963ll), context.getResources().getDimensionPixelSize(C0966R.dimen.f3627k), context.getResources().getDimensionPixelSize(C0966R.dimen.f3963ll));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C76577a.m92157h(context, C0966R.dimen.f3738cr));
        layoutParams.addRule(4, C0966R.C0970id.b8z);
        layoutParams.addRule(19, C0966R.C0970id.b8z);
        layoutParams.addRule(21, -1);
        layoutParams.setMargins(context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6), 0, context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6), 0);
        this.f24359a.addView(textView, layoutParams);
    }
}
