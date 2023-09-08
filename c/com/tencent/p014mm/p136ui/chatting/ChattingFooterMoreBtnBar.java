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
import java.util.LinkedList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar */
public class ChattingFooterMoreBtnBar extends LinearLayout {

    /* renamed from: d */
    public WeImageButton f215270d;

    /* renamed from: e */
    public WeImageButton f215271e;

    /* renamed from: f */
    public WeImageButton f215272f;

    /* renamed from: g */
    public WeImageButton f215273g;

    /* renamed from: h */
    public WeImageButton f215274h;

    /* renamed from: i */
    public LinearLayout.LayoutParams f215275i;

    public ChattingFooterMoreBtnBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(16);
        setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2869u7));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.f3955ld), 1.0f);
        this.f215275i = layoutParams;
        layoutParams.topMargin = C76577a.m92151b(getContext(), 0);
        WeImageButton weImageButton = new WeImageButton(getContext());
        this.f215270d = weImageButton;
        weImageButton.setImageResource(C0966R.C0969drawable.f4738lg);
        this.f215270d.setScaleType(ImageView.ScaleType.CENTER);
        this.f215270d.setBackgroundResource(0);
        this.f215270d.setContentDescription(context.getString(C0966R.string.b_z));
        WeImageButton weImageButton2 = new WeImageButton(getContext());
        this.f215274h = weImageButton2;
        weImageButton2.setImageResource(C0966R.C0969drawable.f4735ld);
        this.f215274h.setScaleType(ImageView.ScaleType.CENTER);
        this.f215274h.setBackgroundResource(0);
        this.f215274h.setContentDescription(context.getString(C0966R.string.b_x));
        WeImageButton weImageButton3 = new WeImageButton(getContext());
        this.f215273g = weImageButton3;
        weImageButton3.setImageResource(C0966R.C0969drawable.f4733lb);
        this.f215273g.setScaleType(ImageView.ScaleType.CENTER);
        this.f215273g.setBackgroundResource(0);
        this.f215273g.setContentDescription(context.getString(C0966R.string.b_v));
        WeImageButton weImageButton4 = new WeImageButton(getContext());
        this.f215272f = weImageButton4;
        weImageButton4.setImageResource(C0966R.C0969drawable.f4736le);
        this.f215272f.setScaleType(ImageView.ScaleType.CENTER);
        this.f215272f.setBackgroundResource(0);
        this.f215272f.setContentDescription(context.getString(C0966R.string.b_u));
        WeImageButton weImageButton5 = new WeImageButton(getContext());
        this.f215271e = weImageButton5;
        weImageButton5.setImageResource(C0966R.C0969drawable.f4734lc);
        this.f215271e.setScaleType(ImageView.ScaleType.CENTER);
        this.f215271e.setBackgroundResource(0);
        this.f215271e.setContentDescription(context.getString(C0966R.string.b_w));
        mo102070a();
    }

    /* renamed from: a */
    public void mo102070a() {
        removeAllViews();
        addView(this.f215270d, this.f215275i);
        addView(this.f215274h, this.f215275i);
        addView(this.f215273g, this.f215275i);
        addView(this.f215271e, this.f215275i);
    }

    /* renamed from: b */
    public void mo102071b(int i, View.OnClickListener onClickListener) {
        if (i == 0) {
            this.f215270d.setOnClickListener(onClickListener);
        } else if (i == 1) {
            this.f215271e.setOnClickListener(onClickListener);
        } else if (i == 2) {
            this.f215272f.setOnClickListener(onClickListener);
        } else if (i == 3) {
            this.f215273g.setOnClickListener(onClickListener);
        } else if (i != 4) {
            Log.m105929w("Ashu.ChattingFooterMoreBtnBar", "set button listener error button index %d", Integer.valueOf(i));
        } else {
            this.f215274h.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: c */
    public void mo102072c(int i) {
        boolean z = i > 0;
        this.f215270d.setClickable(z);
        this.f215270d.setEnabled(z);
        if (((LinkedList) C74343y0.m88762f()).size() > 0) {
            this.f215272f.setClickable(z);
            this.f215272f.setEnabled(z);
        } else {
            this.f215271e.setClickable(z);
            this.f215271e.setEnabled(z);
        }
        this.f215273g.setClickable(z);
        this.f215273g.setEnabled(z);
        this.f215274h.setClickable(z);
        this.f215274h.setEnabled(z);
    }
}
