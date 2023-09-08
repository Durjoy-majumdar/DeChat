package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout */
public class FavourLayout extends LinearLayout {
    public FavourLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setWording(LinkedList<String> linkedList) {
        removeAllViews();
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            TextView textView = new TextView(getContext());
            textView.setText(it.next());
            textView.setTextColor(Color.parseColor("#ff891e"));
            textView.setTextSize(0, (float) C76577a.m92157h(getContext(), C0966R.dimen.f3957lf));
            addView(textView);
        }
    }

    public FavourLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
