package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.BaseEmojiView;
import com.tencent.p014mm.p136ui.widget.MMEditText;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView */
public class LuckyMoneyTextInputView extends LinearLayout implements C69637m1 {

    /* renamed from: d */
    public MMEditText f200807d;

    /* renamed from: e */
    public TextView f200808e;

    /* renamed from: f */
    public LinearLayout f200809f;

    /* renamed from: g */
    public ImageView f200810g;

    /* renamed from: h */
    public BaseEmojiView f200811h;

    /* renamed from: i */
    public C69727y2 f200812i;

    /* renamed from: j */
    public View.OnClickListener f200813j;

    public LuckyMoneyTextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b_d, this, true);
        this.f200807d = (MMEditText) inflate.findViewById(C0966R.C0970id.gj6);
        this.f200808e = (TextView) inflate.findViewById(C0966R.C0970id.gj8);
        this.f200809f = (LinearLayout) inflate.findViewById(C0966R.C0970id.ge8);
        this.f200810g = (ImageView) inflate.findViewById(C0966R.C0970id.ge9);
        this.f200811h = (BaseEmojiView) inflate.findViewById(C0966R.C0970id.ge7);
        this.f200807d.setOnFocusChangeListener(new C69582d5(this));
        this.f200809f.setOnClickListener(new C69587e5(this));
        this.f200809f.setVisibility(8);
        this.f200810g.setContentDescription(inflate.getContext().getString(C0966R.string.gem));
        this.f200807d.setMaxLines(Integer.MAX_VALUE);
        this.f200807d.setFilters(new InputFilter[0]);
    }

    /* renamed from: a */
    public void mo5751a() {
    }

    /* renamed from: b */
    public void mo5752b() {
    }

    /* renamed from: c */
    public int mo5753c() {
        return 0;
    }

    /* renamed from: d */
    public int mo5754d() {
        return 0;
    }

    /* renamed from: e */
    public String mo5755e(int i) {
        return null;
    }

    public String getInput() {
        return this.f200807d.getText().toString();
    }

    public int getInputViewId() {
        return getId();
    }

    public void setHintText(String str) {
        this.f200807d.setHint(str);
    }

    public void setOnInputValidChangerListener(C69727y2 y2Var) {
        this.f200812i = y2Var;
    }

    public void setTitle(String str) {
        this.f200808e.setText(str);
    }

    public void setmOnEmojiSelectClickListener(View.OnClickListener onClickListener) {
        this.f200813j = onClickListener;
    }
}
