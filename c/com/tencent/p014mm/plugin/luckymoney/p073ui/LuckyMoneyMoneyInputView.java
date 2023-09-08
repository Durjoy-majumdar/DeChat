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
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import g32.C75846b;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView */
public class LuckyMoneyMoneyInputView extends LinearLayout implements C69637m1 {

    /* renamed from: d */
    public FixedAlignRightLabelEditText f200011d;

    /* renamed from: e */
    public TextView f200012e;

    /* renamed from: f */
    public ImageView f200013f;

    /* renamed from: g */
    public C69727y2 f200014g;

    /* renamed from: h */
    public C69273y f200015h = C75846b.zx0().vx0().mo95413a();

    /* renamed from: i */
    public String f200016i;

    /* renamed from: j */
    public double f200017j;

    /* renamed from: n */
    public double f200018n;

    /* renamed from: o */
    public int f200019o = 0;

    /* renamed from: p */
    public int f200020p;

    /* renamed from: q */
    public TextWatcher f200021q = new C69412a();

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView$a */
    public class C69412a implements TextWatcher {
        public C69412a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!Util.isNullOrNil(editable.toString())) {
                LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = LuckyMoneyMoneyInputView.this;
                luckyMoneyMoneyInputView.f200011d.setFixedLabelText(luckyMoneyMoneyInputView.f200016i);
            } else {
                LuckyMoneyMoneyInputView.this.f200011d.setFixedLabelText("");
            }
            LuckyMoneyMoneyInputView luckyMoneyMoneyInputView2 = LuckyMoneyMoneyInputView.this;
            C69727y2 y2Var = luckyMoneyMoneyInputView2.f200014g;
            if (y2Var != null) {
                y2Var.mo95263Q(false, luckyMoneyMoneyInputView2.getInputViewId());
            }
            if (!Util.isNullOrNil(editable.toString())) {
                TextView textView = LuckyMoneyMoneyInputView.this.f200012e;
                textView.setContentDescription(LuckyMoneyMoneyInputView.this.f200012e.getText() + editable.toString() + LuckyMoneyMoneyInputView.this.f200016i);
                return;
            }
            TextView textView2 = LuckyMoneyMoneyInputView.this.f200012e;
            textView2.setContentDescription(LuckyMoneyMoneyInputView.this.f200012e.getText() + "0" + LuckyMoneyMoneyInputView.this.f200016i);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public LuckyMoneyMoneyInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b9y, this, true);
        FixedAlignRightLabelEditText fixedAlignRightLabelEditText = (FixedAlignRightLabelEditText) inflate.findViewById(C0966R.C0970id.geq);
        this.f200011d = fixedAlignRightLabelEditText;
        fixedAlignRightLabelEditText.setTypeface(C75228t.m90274w(context, 7));
        this.f200011d.addTextChangedListener(this.f200021q);
        this.f200012e = (TextView) inflate.findViewById(C0966R.C0970id.gfx);
        this.f200013f = (ImageView) inflate.findViewById(C0966R.C0970id.gfv);
        TextView textView = this.f200012e;
        textView.setContentDescription(this.f200012e.getText() + "0");
    }

    /* renamed from: a */
    public void mo5751a() {
        this.f200012e.setTextColor(C69242l1.m81598d(getContext()));
        this.f200011d.setTextColor(C69242l1.m81598d(getContext()));
    }

    /* renamed from: b */
    public void mo5752b() {
        this.f200012e.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
        this.f200011d.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
    }

    /* renamed from: c */
    public int mo5753c() {
        if (Util.isNullOrNil(this.f200011d.getText().toString())) {
            return 0;
        }
        double input = getInput();
        if (input < 0.0d) {
            return 3;
        }
        double d = this.f200017j;
        if (input <= d || d <= 0.0d) {
            return (input >= this.f200018n || input <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: d */
    public int mo5754d() {
        if (Util.isNullOrNil(this.f200011d.getText().toString())) {
            return 4;
        }
        double d = Util.getDouble(this.f200011d.getText().toString(), -1.0d);
        if (d <= 0.0d) {
            return 3;
        }
        double d2 = this.f200017j;
        if (d <= d2 || d2 <= 0.0d) {
            return (d >= this.f200018n || d <= 0.0d) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: e */
    public String mo5755e(int i) {
        int i2 = this.f200019o;
        if (i2 == 1) {
            this.f200015h = C75846b.zx0().yx0().mo95393a();
        } else if (i2 == 2) {
            C69277z0 xx02 = C75846b.zx0().xx0();
            if (xx02.f199395a == null) {
                xx02.mo95416a();
            }
            this.f200015h = xx02.f199395a;
        } else {
            this.f200015h = C75846b.zx0().vx0().mo95413a();
        }
        if (i == 1) {
            if (this.f200020p == 1) {
                Context context = getContext();
                return context.getString(C0966R.string.gjo, new Object[]{Math.round(this.f200017j) + "", Util.nullAs(this.f200015h.f199381q, "")});
            }
            C69273y yVar = this.f200015h;
            if (yVar != null && !Util.isNullOrNil(yVar.f199383s)) {
                Context context2 = getContext();
                return context2.getString(C0966R.string.geo, new Object[]{this.f200015h.f199383s, Math.round(this.f200017j) + "", Util.nullAs(this.f200015h.f199381q, "")});
            }
            Context context3 = getContext();
            return context3.getString(C0966R.string.gen, new Object[]{Math.round(this.f200017j) + "", Util.nullAs(this.f200015h.f199381q, "")});
        } else if (i == 2) {
            C69273y yVar2 = this.f200015h;
            if (yVar2 != null && !Util.isNullOrNil(yVar2.f199383s)) {
                Context context4 = getContext();
                return context4.getString(C0966R.string.geq, new Object[]{this.f200015h.f199383s, C75228t.m90260n(this.f200018n) + "", Util.nullAs(this.f200015h.f199381q, "")});
            }
            Context context5 = getContext();
            return context5.getString(C0966R.string.gep, new Object[]{C75228t.m90260n(this.f200018n) + "", Util.nullAs(this.f200015h.f199381q, "")});
        } else if (i != 4 && i != 3) {
            return null;
        } else {
            return getContext().getString(C0966R.string.gif, new Object[]{this.f200012e.getText()});
        }
    }

    public EditText getEditText() {
        return this.f200011d;
    }

    public double getInput() {
        return Util.getDouble(this.f200011d.getText().toString(), 0.0d);
    }

    public int getInputViewId() {
        return getId();
    }

    public void setAmount(String str) {
        this.f200011d.setText(str);
        this.f200011d.setSelection(str.length());
    }

    public void setCurrencyUnitPrefix(String str) {
        this.f200016i = str;
        this.f200011d.setFixedLabelText(str);
    }

    public void setGroupIconIv(int i) {
        this.f200013f.setImageResource(i);
    }

    public void setHint(String str) {
        this.f200011d.setHint(str);
    }

    public void setMaxAmount(double d) {
        this.f200017j = d;
    }

    public void setMaxLen(int i) {
        this.f200011d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setMinAmount(double d) {
        this.f200018n = d;
    }

    public void setOnInputValidChangerListener(C69727y2 y2Var) {
        this.f200014g = y2Var;
    }

    public void setRtxLuckyMoney(int i) {
        this.f200019o = i;
    }

    public void setShowGroupIcon(boolean z) {
        if (z) {
            this.f200013f.setVisibility(0);
        } else {
            this.f200013f.setVisibility(8);
        }
    }

    public void setTitle(String str) {
        this.f200012e.setText(str);
    }

    public void setType(int i) {
        this.f200020p = i;
    }
}
