package com.tencent.p014mm.plugin.fav.p047ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavDetailTitleView */
public class FavDetailTitleView extends LinearLayout implements C111847h {
    public FavDetailTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.a27);
        TextView textView = (TextView) findViewById(C0966R.C0970id.kpm);
    }
}
