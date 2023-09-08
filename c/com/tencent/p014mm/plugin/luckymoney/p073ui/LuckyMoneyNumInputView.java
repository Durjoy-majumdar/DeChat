package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69273y;
import com.tencent.p014mm.plugin.luckymoney.model.C69277z0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.android.wechat.TenpaySecureEditText;
import g32.C75846b;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView */
public class LuckyMoneyNumInputView extends LinearLayout implements C69637m1 {

    /* renamed from: d */
    public TextView f200494d;

    /* renamed from: e */
    public TenpaySecureEditText f200495e;

    /* renamed from: f */
    public TextView f200496f;

    /* renamed from: g */
    public C69727y2 f200497g;

    /* renamed from: h */
    public C69273y f200498h;

    /* renamed from: i */
    public int f200499i = 1;

    /* renamed from: j */
    public int f200500j = Integer.MAX_VALUE;

    /* renamed from: n */
    public int f200501n = 1;

    /* renamed from: o */
    public int f200502o = 0;

    /* renamed from: p */
    public int f200503p = 0;

    /* renamed from: q */
    public TextWatcher f200504q = new C69477a();

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView$a */
    public class C69477a implements TextWatcher {
        public C69477a() {
        }

        public void afterTextChanged(Editable editable) {
            LuckyMoneyNumInputView luckyMoneyNumInputView = LuckyMoneyNumInputView.this;
            C69727y2 y2Var = luckyMoneyNumInputView.f200497g;
            if (y2Var != null) {
                y2Var.mo95263Q(false, luckyMoneyNumInputView.getInputViewId());
            }
            if (!Util.isNullOrNil(editable.toString())) {
                TextView textView = LuckyMoneyNumInputView.this.f200494d;
                textView.setContentDescription(LuckyMoneyNumInputView.this.f200494d.getText() + editable.toString() + LuckyMoneyNumInputView.this.f200496f.getText());
                return;
            }
            TextView textView2 = LuckyMoneyNumInputView.this.f200494d;
            textView2.setContentDescription(LuckyMoneyNumInputView.this.f200494d.getText() + "0" + LuckyMoneyNumInputView.this.f200496f.getText());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public LuckyMoneyNumInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b_5, this, true);
        this.f200494d = (TextView) inflate.findViewById(C0966R.C0970id.ghi);
        this.f200495e = (TenpaySecureEditText) inflate.findViewById(C0966R.C0970id.geq);
        this.f200496f = (TextView) inflate.findViewById(C0966R.C0970id.ghj);
        TenpaySecureEditText tenpaySecureEditText = this.f200495e;
        tenpaySecureEditText.setText(this.f200499i + "");
        ((ImageView) inflate.findViewById(C0966R.C0970id.m_a)).setVisibility(0);
        this.f200495e.addTextChangedListener(this.f200504q);
        TextView textView = this.f200494d;
        textView.setContentDescription(this.f200494d.getText() + "0" + this.f200496f.getText());
    }

    /* renamed from: a */
    public void mo5751a() {
        this.f200494d.setTextColor(C69242l1.m81598d(getContext()));
        this.f200495e.setTextColor(C69242l1.m81598d(getContext()));
        this.f200496f.setTextColor(C69242l1.m81598d(getContext()));
    }

    /* renamed from: b */
    public void mo5752b() {
        this.f200494d.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
        this.f200495e.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
        this.f200496f.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
    }

    /* renamed from: c */
    public int mo5753c() {
        if (Util.isNullOrNil(this.f200495e.getText().toString())) {
            return 0;
        }
        int i = Util.getInt(this.f200495e.getText().toString(), -1);
        if (i < 0) {
            return 3;
        }
        int i2 = this.f200503p;
        if (i > i2 && i2 > 0) {
            return 5;
        }
        int i3 = this.f200500j;
        if (i > i3 && i3 > 0) {
            return 1;
        }
        int i4 = this.f200501n;
        return (i >= i4 || i4 <= 0) ? 0 : 2;
    }

    /* renamed from: d */
    public int mo5754d() {
        if (Util.isNullOrNil(this.f200495e.getText().toString())) {
            return 4;
        }
        int i = Util.getInt(this.f200495e.getText().toString(), -1);
        if (i <= 0) {
            return 3;
        }
        int i2 = this.f200500j;
        if (i > i2 && i2 > 0) {
            return 1;
        }
        int i3 = this.f200503p;
        if (i > i3 && i3 > 0) {
            return 5;
        }
        int i4 = this.f200501n;
        return (i >= i4 || i4 <= 0) ? 0 : 2;
    }

    /* renamed from: e */
    public String mo5755e(int i) {
        int i2 = this.f200502o;
        if (i2 == 1) {
            this.f200498h = C75846b.zx0().yx0().mo95393a();
        } else if (i2 == 2) {
            C69277z0 xx02 = C75846b.zx0().xx0();
            if (xx02.f199395a == null) {
                xx02.mo95416a();
            }
            this.f200498h = xx02.f199395a;
        } else {
            this.f200498h = C75846b.zx0().vx0().mo95413a();
        }
        if (i == 1) {
            C69273y yVar = this.f200498h;
            if (yVar != null && !Util.isNullOrNil(yVar.f199383s)) {
                return getContext().getString(C0966R.string.ghw, new Object[]{Integer.valueOf(this.f200500j), this.f200498h.f199383s});
            }
            return getContext().getString(C0966R.string.ghv, new Object[]{Integer.valueOf(this.f200500j)});
        } else if (i == 2) {
            C69273y yVar2 = this.f200498h;
            if (!(yVar2 != null && !Util.isNullOrNil(yVar2.f199383s))) {
                return getContext().getString(C0966R.string.ght);
            }
            return getContext().getString(C0966R.string.ghu, new Object[]{Integer.valueOf(this.f200501n), this.f200498h.f199383s});
        } else if (i == 4 || i == 3) {
            return getContext().getString(C0966R.string.gif, new Object[]{this.f200494d.getText()});
        } else if (i != 5) {
            return null;
        } else {
            C69273y yVar3 = this.f200498h;
            if (!(yVar3 != null && !Util.isNullOrNil(yVar3.f199383s))) {
                return getContext().getString(C0966R.string.f360991m24);
            }
            return getContext().getString(C0966R.string.m25, new Object[]{this.f200498h.f199383s});
        }
    }

    public EditText getEditText() {
        return this.f200495e;
    }

    public int getInput() {
        try {
            return Integer.parseInt(this.f200495e.getText().toString(), 10);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getInputViewId() {
        return getId();
    }

    public void setGroupChatNumber(int i) {
        this.f200503p = i;
    }

    public void setHint(String str) {
        this.f200495e.setHint(str);
    }

    public void setMaxNum(int i) {
        this.f200500j = i;
        int i2 = 0;
        while (i > 0) {
            i2++;
            i /= 10;
        }
        if (i2 <= 3) {
            i2 = 3;
        }
        this.f200495e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
    }

    public void setMinNum(int i) {
        this.f200501n = i;
    }

    public void setNum(String str) {
        this.f200495e.setText(str);
        TenpaySecureEditText tenpaySecureEditText = this.f200495e;
        tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
        this.f200499i = Util.getInt(str, 0);
    }

    public void setOnInputValidChangerListener(C69727y2 y2Var) {
        this.f200497g = y2Var;
    }

    public void setRtxLuckyMoney(int i) {
        this.f200502o = i;
    }
}
