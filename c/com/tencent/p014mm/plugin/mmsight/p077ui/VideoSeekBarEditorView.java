package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.mmsight.segment.RecyclerThumbSeekBar;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView */
public class VideoSeekBarEditorView extends LinearLayout {

    /* renamed from: d */
    public RecyclerThumbSeekBar f272141d;

    /* renamed from: e */
    public Button f272142e;

    /* renamed from: f */
    public Button f272143f;

    public VideoSeekBarEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo129485a(context);
    }

    /* renamed from: a */
    public final void mo129485a(Context context) {
        LinearLayout linearLayout = (LinearLayout) C85868k2.m106137b(context).inflate(C0966R.C0971layout.cbu, this, true);
        this.f272141d = (RecyclerThumbSeekBar) findViewById(C0966R.C0970id.l7n);
        this.f272142e = (Button) findViewById(C0966R.C0970id.cb9);
        this.f272143f = (Button) findViewById(C0966R.C0970id.cbc);
    }

    /* renamed from: b */
    public void mo129486b() {
        this.f272141d.mo150238g();
        ViewParent parent = this.f272141d.getParent();
        if (parent instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) parent;
            linearLayout.removeView(this.f272141d);
            RecyclerThumbSeekBar recyclerThumbSeekBar = new RecyclerThumbSeekBar(getContext());
            this.f272141d = recyclerThumbSeekBar;
            linearLayout.addView(recyclerThumbSeekBar, 0, (LinearLayout.LayoutParams) this.f272141d.getLayoutParams());
        }
    }

    public void setCancelButtonClickListener(View.OnClickListener onClickListener) {
        this.f272142e.setOnClickListener(onClickListener);
    }

    public void setFinishButtonClickListener(View.OnClickListener onClickListener) {
        this.f272143f.setOnClickListener(onClickListener);
    }

    public void setTextColor(String str) {
        if (str != null) {
            this.f272143f.setTextColor(Color.parseColor(str));
        }
    }

    public VideoSeekBarEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo129485a(context);
    }
}
