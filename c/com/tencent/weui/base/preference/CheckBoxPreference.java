package com.tencent.weui.base.preference;

import android.content.Context;
import android.preference.Preference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;

public class CheckBoxPreference extends Preference {

    /* renamed from: d */
    public boolean f25005d;

    /* renamed from: e */
    public MMSwitchBtn f25006e;

    /* renamed from: f */
    public TextView f25007f;

    /* renamed from: g */
    public int f25008g;

    /* renamed from: h */
    public String f25009h;

    /* renamed from: i */
    public int f25010i;

    /* renamed from: j */
    public View f25011j;

    /* renamed from: com.tencent.weui.base.preference.CheckBoxPreference$a */
    public class C7110a implements MMSwitchBtn.C7041b {
        public C7110a() {
        }

        public void onStatusChange(boolean z) {
            boolean unused = CheckBoxPreference.this.callChangeListener(Boolean.valueOf(z));
        }
    }

    public CheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public boolean mo8242b() {
        MMSwitchBtn mMSwitchBtn = this.f25006e;
        return mMSwitchBtn != null ? mMSwitchBtn.f220433y : this.f25005d;
    }

    /* renamed from: c */
    public void mo8243c(int i) {
        this.f25010i = i;
        TextView textView = this.f25007f;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: e */
    public void mo8244e(boolean z) {
        MMSwitchBtn mMSwitchBtn = this.f25006e;
        if (mMSwitchBtn != null) {
            this.f25005d = z;
            mMSwitchBtn.setCheck(z);
        }
    }

    public void onBindView(View view) {
        super.onBindView(view);
        MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) view.findViewById(C0966R.C0970id.bab);
        this.f25006e = mMSwitchBtn;
        mMSwitchBtn.setSwitchListener(new C7110a());
        this.f25006e.setCheck(this.f25005d);
        if (!isEnabled()) {
            this.f25006e.setEnabled(false);
            ((TextView) view.findViewById(16908310)).setTextColor(view.getResources().getColor(C0966R.color.f3140go));
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kmw);
        this.f25007f = textView;
        String str = this.f25009h;
        int i = this.f25008g;
        this.f25008g = i;
        this.f25009h = str;
        if (textView != null) {
            if (i > 0) {
                textView.setBackgroundResource(i);
            }
            if (!TextUtils.isEmpty(this.f25009h)) {
                this.f25007f.setText(this.f25009h);
            }
        }
        mo8243c(this.f25010i);
    }

    public View onCreateView(ViewGroup viewGroup) {
        View onCreateView = super.onCreateView(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) onCreateView.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(getContext(), C0966R.C0971layout.bf7, viewGroup2);
        this.f25011j = onCreateView;
        return onCreateView;
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25005d = false;
        this.f25008g = -1;
        this.f25009h = "";
        this.f25010i = 8;
        setLayoutResource(C0966R.C0971layout.bcy);
    }
}
