package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.ToolsBar */
public class ToolsBar extends LinearLayout {

    /* renamed from: d */
    public WeImageButton f215394d;

    /* renamed from: e */
    public WeImageButton f215395e;

    /* renamed from: f */
    public WeImageButton f215396f;

    /* renamed from: g */
    public LinearLayout.LayoutParams f215397g = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.f3955ld), 1.0f);

    public ToolsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(16);
        setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2869u7));
        WeImageButton weImageButton = new WeImageButton(getContext());
        this.f215394d = weImageButton;
        weImageButton.setImageResource(C0966R.C0969drawable.f4738lg);
        this.f215394d.setScaleType(ImageView.ScaleType.CENTER);
        this.f215394d.setBackgroundResource(0);
        this.f215394d.setContentDescription(context.getString(C0966R.string.b_z));
        WeImageButton weImageButton2 = new WeImageButton(getContext());
        this.f215395e = weImageButton2;
        weImageButton2.setImageResource(C0966R.C0969drawable.f4735ld);
        this.f215395e.setScaleType(ImageView.ScaleType.CENTER);
        this.f215395e.setBackgroundResource(0);
        this.f215395e.setContentDescription(context.getString(C0966R.string.b_x));
        WeImageButton weImageButton3 = new WeImageButton(getContext());
        this.f215396f = weImageButton3;
        weImageButton3.setImageResource(C0966R.C0969drawable.f4737lf);
        this.f215396f.setScaleType(ImageView.ScaleType.CENTER);
        this.f215396f.setBackgroundResource(0);
        this.f215396f.setContentDescription(context.getString(C0966R.string.b_y));
        removeAllViews();
        addView(this.f215394d, this.f215397g);
        addView(this.f215395e, this.f215397g);
        addView(this.f215396f, this.f215397g);
    }

    /* renamed from: a */
    public void mo102130a(int i, View.OnClickListener onClickListener) {
        if (i == 0) {
            this.f215394d.setOnClickListener(onClickListener);
        } else if (i == 1) {
            this.f215395e.setOnClickListener(onClickListener);
        } else if (i != 2) {
            Log.m105929w("MicroMsg.ToolsBar", "set button listener error button index %d", Integer.valueOf(i));
        } else {
            this.f215396f.setOnClickListener(onClickListener);
        }
    }
}
