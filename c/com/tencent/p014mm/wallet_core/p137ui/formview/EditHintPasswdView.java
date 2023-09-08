package com.tencent.p014mm.wallet_core.p137ui.formview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tenpay.android.wechat.TenpaySecureEditText;
import di3.C86312j;
import gr3.C76040e;
import gr3.C76043g;
import h81.C32735h;
import kg3.C76577a;
import tb3.C77881d;

/* renamed from: com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView */
public final class EditHintPasswdView extends RelativeLayout implements View.OnFocusChangeListener {

    /* renamed from: d */
    public TenpaySecureEditText f221247d;

    /* renamed from: e */
    public int f221248e;

    /* renamed from: f */
    public int f221249f;

    /* renamed from: g */
    public int f221250g;

    /* renamed from: h */
    public int f221251h;

    /* renamed from: i */
    public int f221252i;

    /* renamed from: j */
    public C75206c f221253j;

    /* renamed from: n */
    public View.OnFocusChangeListener f221254n;

    /* renamed from: o */
    public String f221255o;

    /* renamed from: p */
    public long f221256p;

    /* renamed from: q */
    public String f221257q;

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView$a */
    public class C75204a implements TenpaySecureEditText.I993EnvListener {
        public C75204a(EditHintPasswdView editHintPasswdView) {
        }

        public boolean is993Env() {
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_sm2_993_abtest, false);
            boolean z = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_993TEST_Int, 0) == 1;
            Log.m105925i("MicroMsg.EditHintPasswdView", "is993Env: %s, %s", Boolean.valueOf(wf), Boolean.valueOf(z));
            if (z) {
                return true;
            }
            return wf;
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView$b */
    public class C75205b implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ Context f221258d;

        public C75205b(Context context) {
            this.f221258d = context;
        }

        public void afterTextChanged(Editable editable) {
            String obj = EditHintPasswdView.this.f221247d.getText().toString();
            EditHintPasswdView editHintPasswdView = EditHintPasswdView.this;
            Context context = this.f221258d;
            boolean z = true;
            editHintPasswdView.setContentDescription(context.getString(C0966R.string.lcu, new Object[]{obj.length() + ""}));
            EditHintPasswdView editHintPasswdView2 = EditHintPasswdView.this;
            C75206c cVar = editHintPasswdView2.f221253j;
            if (cVar != null) {
                TenpaySecureEditText tenpaySecureEditText = editHintPasswdView2.f221247d;
                if (tenpaySecureEditText == null || tenpaySecureEditText.getInputLength() != editHintPasswdView2.f221248e) {
                    z = false;
                }
                cVar.onInputValidChange(z);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView$c */
    public interface C75206c {
        void onInputValidChange(boolean z);
    }

    public EditHintPasswdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f221247d = null;
        this.f221248e = 6;
        this.f221249f = 1;
        this.f221250g = C0966R.C0969drawable.f4910r2;
        this.f221251h = 1;
        this.f221253j = null;
        this.f221254n = null;
        this.f221255o = "";
        this.f221256p = 0;
        this.f221257q = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226912f, i, 0);
        this.f221249f = obtainStyledAttributes.getInteger(3, 1);
        this.f221250g = obtainStyledAttributes.getResourceId(0, C0966R.C0969drawable.f4910r2);
        this.f221251h = obtainStyledAttributes.getInteger(1, 1);
        this.f221252i = obtainStyledAttributes.getInteger(2, 1);
        obtainStyledAttributes.recycle();
        mo105044b(context);
        TenpaySecureEditText.setSalt(C75228t.m90271t());
    }

    private int getNumberSize() {
        int i = this.f221249f;
        if (i == 1) {
            return 6;
        }
        if (i == 8) {
            return 4;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        Log.m105924i("MicroMsg.EditHintPasswdView", "hy: error or not set format. use default");
        return 6;
    }

    /* renamed from: a */
    public void mo105043a() {
        TenpaySecureEditText tenpaySecureEditText = this.f221247d;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.ClearInput();
        }
    }

    /* renamed from: b */
    public void mo105044b(Context context) {
        TenpaySecureEditText tenpaySecureEditText = (TenpaySecureEditText) C85868k2.m106137b(context).inflate(C0966R.C0971layout.azb, this, true).findViewById(C0966R.C0970id.lg_);
        this.f221247d = tenpaySecureEditText;
        tenpaySecureEditText.set993EnvCallBackListener(new C75204a(this));
        if (this.f221250g == C0966R.C0969drawable.f4910r2 && C85875k4.m106211z()) {
            this.f221250g = C0966R.C0969drawable.f4911r3;
        }
        int i = this.f221252i;
        if (i == 1) {
            this.f221250g = C0966R.color.ahf;
        }
        C76040e.m91344a(this.f221247d, this.f221249f, i == 1);
        this.f221248e = getNumberSize();
        TenpaySecureEditText tenpaySecureEditText2 = this.f221247d;
        if (tenpaySecureEditText2 != null) {
            tenpaySecureEditText2.setBackgroundResource(this.f221250g);
            this.f221247d.setImeOptions(6);
            this.f221247d.setInputType(128);
            this.f221247d.addTextChangedListener(new C75205b(context));
            this.f221247d.setOnFocusChangeListener(this);
            this.f221247d.setClickable(false);
            this.f221247d.setLongClickable(false);
            setEnabled(true);
            setClickable(true);
        } else {
            Log.m105920e("MicroMsg.EditHintPasswdView", "hy: no edit text view");
        }
        setContentDescription(context.getString(C0966R.string.lcu, new Object[]{"0"}));
        this.f221247d.setImportantForAccessibility(2);
    }

    /* renamed from: c */
    public void mo105045c(int i) {
        this.f221252i = i;
        boolean z = true;
        if (i == 1) {
            this.f221250g = C0966R.color.ahf;
        } else if (C85875k4.m106211z()) {
            this.f221250g = C0966R.C0969drawable.f4911r3;
        } else {
            this.f221250g = C0966R.C0969drawable.f4910r2;
        }
        this.f221247d.setBackgroundResource(this.f221250g);
        TenpaySecureEditText tenpaySecureEditText = this.f221247d;
        int i2 = this.f221249f;
        if (this.f221252i != 1) {
            z = false;
        }
        C76040e.m91344a(tenpaySecureEditText, i2, z);
    }

    public TenpaySecureEditText getEditText() {
        return this.f221247d;
    }

    public int getEncrType() {
        return this.f221251h;
    }

    public int getFormat() {
        return this.f221249f;
    }

    public String getMd5Value() {
        TenpaySecureEditText tenpaySecureEditText = this.f221247d;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getPasswordHash();
        }
        Log.m105928w("MicroMsg.EditHintPasswdView", "hy: edit view is null");
        return "";
    }

    public C75206c getOnEditInputValidListener() {
        return this.f221253j;
    }

    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f221254n;
    }

    public String getPwdNonce() {
        return this.f221255o;
    }

    public long getPwdTimestamp() {
        return this.f221256p;
    }

    public String getText() {
        TenpaySecureEditText tenpaySecureEditText = this.f221247d;
        if (tenpaySecureEditText != null) {
            return C76043g.m91346a(this.f221251h, tenpaySecureEditText, this.f221256p, this.f221255o, this.f221257q);
        }
        Log.m105928w("MicroMsg.EditHintPasswdView", "hy: no edit view");
        return "";
    }

    public void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.f221254n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
        C75206c cVar = this.f221253j;
        if (cVar != null) {
            TenpaySecureEditText tenpaySecureEditText = this.f221247d;
            cVar.onInputValidChange(tenpaySecureEditText != null && tenpaySecureEditText.getInputLength() == this.f221248e);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        setMeasuredDimension(View.getDefaultSize(BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 960.0f), i), View.getDefaultSize(BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 720.0f), i2));
        if (this.f221252i == 0) {
            int measuredWidth = getMeasuredWidth();
            int i5 = this.f221248e;
            int i6 = i5 == 0 ? measuredWidth / 6 : measuredWidth / i5;
            i4 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            i3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            setMeasuredDimension(View.getDefaultSize(measuredWidth, i4), View.getDefaultSize(i6, i3));
        } else {
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int b = C76577a.m92151b(getContext(), 8);
            int i7 = this.f221248e;
            int i8 = (measuredWidth2 - (b * (i7 - 1))) / i7;
            if (measuredHeight < i8) {
                measuredHeight = i8;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2 + 1, 1073741824);
            i3 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            setMeasuredDimension(View.getDefaultSize(measuredWidth2, makeMeasureSpec), View.getDefaultSize(i8, i3));
            i4 = makeMeasureSpec;
        }
        super.onMeasure(i4, i3);
    }

    public void setEditTextMaxLength(int i) {
        TenpaySecureEditText tenpaySecureEditText = this.f221247d;
        if (tenpaySecureEditText != null) {
            InputFilter[] filters = tenpaySecureEditText.getFilters();
            int length = filters.length + 1;
            InputFilter[] inputFilterArr = new InputFilter[length];
            for (int i2 = 0; i2 < filters.length; i2++) {
                inputFilterArr[i2] = filters[i2];
            }
            inputFilterArr[length - 1] = new InputFilter.LengthFilter(i);
            this.f221247d.setFilters(inputFilterArr);
        }
    }

    public void setEditTextSize(float f) {
        TenpaySecureEditText tenpaySecureEditText = this.f221247d;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setTextSize(f);
        }
    }

    public void setEncrType(int i) {
        this.f221251h = i;
    }

    public void setEncryptSoftSalt(String str) {
        this.f221257q = str;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f221254n = onFocusChangeListener;
    }

    public void setOnInputValidListener(C75206c cVar) {
        this.f221253j = cVar;
    }

    public void setPwdNonce(String str) {
        this.f221255o = str;
    }

    public void setPwdTimestamp(long j) {
        this.f221256p = j;
    }

    public EditHintPasswdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public EditHintPasswdView(Context context) {
        super(context);
        this.f221247d = null;
        this.f221248e = 6;
        this.f221249f = 1;
        this.f221250g = C0966R.C0969drawable.f4910r2;
        this.f221251h = 1;
        this.f221253j = null;
        this.f221254n = null;
        this.f221255o = "";
        this.f221256p = 0;
        this.f221257q = "";
        mo105044b(context);
    }
}
