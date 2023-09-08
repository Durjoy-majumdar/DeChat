package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;

/* renamed from: com.tencent.mm.ui.base.preference.CheckBoxPreference */
public class CheckBoxPreference extends Preference {

    /* renamed from: J */
    public boolean f24210J;

    /* renamed from: K */
    public boolean f24211K;

    /* renamed from: L */
    public boolean f24212L;

    /* renamed from: M */
    public boolean f24213M;

    /* renamed from: N */
    public MMSwitchBtn f24214N;

    /* renamed from: P */
    public TextView f24215P;

    /* renamed from: Q */
    public ImageView f24216Q;

    /* renamed from: R */
    public int f24217R;

    /* renamed from: S */
    public String f24218S;

    /* renamed from: T */
    public int f24219T;

    /* renamed from: U */
    public View f24220U;

    /* renamed from: V */
    public View.OnClickListener f24221V;

    /* renamed from: W */
    public TextView f24222W;

    /* renamed from: X */
    public C6759b f24223X;

    /* renamed from: com.tencent.mm.ui.base.preference.CheckBoxPreference$a */
    public class C6758a implements MMSwitchBtn.C7041b {
        public C6758a() {
        }

        public void onStatusChange(boolean z) {
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            Boolean valueOf = Boolean.valueOf(z);
            Preference.C6763a aVar = checkBoxPreference.f121275e;
            if (aVar != null) {
                aVar.mo7744a(checkBoxPreference, valueOf);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.CheckBoxPreference$b */
    public interface C6759b {
        /* renamed from: a */
        void mo7738a(View view);
    }

    public CheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public int mo6386I() {
        return C0966R.C0971layout.bf7;
    }

    /* renamed from: J */
    public boolean mo6804J() {
        MMSwitchBtn mMSwitchBtn = this.f24214N;
        return mMSwitchBtn != null ? mMSwitchBtn.f220433y : this.f24210J;
    }

    /* renamed from: K */
    public void mo6805K(boolean z) {
        this.f24210J = z;
    }

    /* renamed from: L */
    public void mo6806L(String str, int i) {
        this.f24217R = i;
        this.f24218S = str;
        TextView textView = this.f24215P;
        if (textView != null) {
            if (i > 0) {
                textView.setBackgroundResource(i);
            }
            if (!TextUtils.isEmpty(this.f24218S)) {
                this.f24215P.setText(this.f24218S);
            }
        }
    }

    /* renamed from: M */
    public void mo6807M(int i) {
        this.f24219T = i;
        TextView textView = this.f24215P;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: N */
    public void mo6808N(boolean z) {
        MMSwitchBtn mMSwitchBtn = this.f24214N;
        if (mMSwitchBtn != null) {
            this.f24210J = z;
            mMSwitchBtn.setCheck(z);
        }
    }

    /* renamed from: P */
    public final void mo7737P() {
        View view;
        if (mo69930u() && !this.f24211K) {
            ImageView imageView = this.f24216Q;
            if (imageView != null && this.f24214N != null) {
                if (this.f24212L) {
                    imageView.setVisibility(0);
                    this.f24214N.setVisibility(4);
                } else {
                    imageView.setVisibility(8);
                    this.f24214N.setVisibility(0);
                }
                ((TextView) this.f24220U.findViewById(16908310)).setTextColor(this.f24220U.getResources().getColor(C0966R.color.a7f));
            }
        } else if (this.f24214N != null && (view = this.f24220U) != null && this.f24216Q != null) {
            ColorStateList textColors = ((TextView) view.findViewById(16908310)).getTextColors();
            mo69932y(false);
            ((TextView) this.f24220U.findViewById(16908310)).setTextColor(textColors);
            if (this.f24212L) {
                this.f24216Q.setVisibility(0);
                this.f24214N.setVisibility(4);
            } else {
                this.f24216Q.setVisibility(8);
                this.f24214N.setVisibility(0);
            }
            if (mo69930u()) {
                ((TextView) this.f24220U.findViewById(16908310)).setTextColor(this.f24220U.getResources().getColor(C0966R.color.a7f));
            } else if (this.f24213M) {
                ((TextView) this.f24220U.findViewById(16908310)).setTextColor(this.f24220U.getResources().getColor(C0966R.color.f3309nb));
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        mo69921C(8);
        this.f24220U = view;
        this.f24222W = (TextView) view.findViewById(16908304);
        this.f24214N = (MMSwitchBtn) view.findViewById(C0966R.C0970id.bab);
        this.f24216Q = (ImageView) view.findViewById(C0966R.C0970id.bag);
        this.f24214N.setSwitchListener(new C6758a());
        this.f24214N.setCheck(this.f24210J);
        this.f24215P = (TextView) view.findViewById(C0966R.C0970id.kmw);
        mo6806L(this.f24218S, this.f24217R);
        mo6807M(this.f24219T);
        mo7737P();
        C6759b bVar = this.f24223X;
        if (bVar != null) {
            bVar.mo7738a(view);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, mo6386I(), viewGroup2);
        this.f24220U = x;
        View.OnClickListener onClickListener = this.f24221V;
        if (onClickListener != null) {
            x.setOnClickListener(onClickListener);
        }
        return this.f24220U;
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24210J = false;
        this.f24211K = false;
        this.f24212L = false;
        this.f24213M = true;
        this.f24217R = -1;
        this.f24218S = "";
        this.f24219T = 8;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
