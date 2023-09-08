package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import java.util.HashMap;
import junit.framework.Assert;
import pj3.C77097c;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.preference.ChoicePreference */
public final class ChoicePreference extends Preference {

    /* renamed from: J */
    public RadioGroup f215029J;

    /* renamed from: K */
    public final HashMap<CharSequence, C77097c> f215030K;

    /* renamed from: L */
    public String f215031L;

    /* renamed from: M */
    public int f215032M;

    /* renamed from: N */
    public CharSequence[] f215033N;

    /* renamed from: P */
    public CharSequence[] f215034P;

    /* renamed from: Q */
    public Preference.C6763a f215035Q;

    /* renamed from: com.tencent.mm.ui.base.preference.ChoicePreference$a */
    public class C73225a implements RadioGroup.OnCheckedChangeListener {
        public C73225a() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            ChoicePreference choicePreference = ChoicePreference.this;
            if (choicePreference.f215035Q != null) {
                if (i != -1) {
                    choicePreference.f215031L = "" + ChoicePreference.this.f215034P[i - 1048576];
                } else {
                    choicePreference.f215031L = null;
                }
                ChoicePreference choicePreference2 = ChoicePreference.this;
                choicePreference2.f215032M = i;
                choicePreference2.f215035Q.mo7744a(choicePreference2, choicePreference2.f215031L);
            }
        }
    }

    public ChoicePreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: B */
    public void mo69920B(Preference.C6763a aVar) {
        this.f215035Q = aVar;
    }

    /* renamed from: I */
    public void mo101919I(String str) {
        this.f215031L = str;
        C77097c cVar = this.f215030K.get(str);
        if (cVar == null) {
            this.f215032M = -1;
        } else {
            this.f215032M = cVar.f225193b;
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        RadioGroup radioGroup = this.f215029J;
        if (radioGroup != null) {
            radioGroup.check(this.f215032M);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        LayoutInflater layoutInflater = (LayoutInflater) this.f121274d.getSystemService("layout_inflater");
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(C0966R.C0971layout.bdf, viewGroup2);
        this.f215029J = (RadioGroup) x.findViewById(C0966R.C0970id.eqz);
        int i = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f215034P;
            if (i < charSequenceArr.length) {
                C77097c cVar = this.f215030K.get(charSequenceArr[i]);
                if (cVar != null) {
                    if (i == 0) {
                        RadioButton radioButton = (RadioButton) layoutInflater.inflate(C0966R.C0971layout.bc9, (ViewGroup) null);
                        radioButton.setText(cVar.f225192a);
                        radioButton.setId(cVar.f225193b);
                        this.f215029J.addView(radioButton);
                    } else if (i == this.f215034P.length - 1) {
                        RadioButton radioButton2 = (RadioButton) layoutInflater.inflate(C0966R.C0971layout.bca, (ViewGroup) null);
                        radioButton2.setText(cVar.f225192a);
                        radioButton2.setId(cVar.f225193b);
                        this.f215029J.addView(radioButton2);
                    } else {
                        RadioButton radioButton3 = (RadioButton) layoutInflater.inflate(C0966R.C0971layout.bc_, (ViewGroup) null);
                        radioButton3.setText(cVar.f225192a);
                        radioButton3.setId(cVar.f225193b);
                        this.f215029J.addView(radioButton3);
                    }
                }
                i++;
            } else {
                this.f215029J.setOnCheckedChangeListener(new C73225a());
                return x;
            }
        }
    }

    public ChoicePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChoicePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HashMap<CharSequence, C77097c> hashMap = new HashMap<>();
        this.f215030K = hashMap;
        this.f215032M = -1;
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226859e, i, 0);
        this.f215033N = obtainStyledAttributes.getTextArray(0);
        boolean z = true;
        this.f215034P = obtainStyledAttributes.getTextArray(1);
        obtainStyledAttributes.recycle();
        if (this.f215033N == null) {
            this.f215033N = new CharSequence[0];
        }
        if (this.f215034P == null) {
            this.f215034P = new CharSequence[0];
        }
        Assert.assertTrue("entries count different", this.f215033N.length != this.f215034P.length ? false : z);
        hashMap.clear();
        while (true) {
            CharSequence[] charSequenceArr = this.f215034P;
            if (i2 < charSequenceArr.length) {
                CharSequence charSequence = charSequenceArr[i2];
                this.f215030K.put(charSequence, new C77097c(charSequence, this.f215033N[i2], 1048576 + i2));
                i2++;
            } else {
                return;
            }
        }
    }
}
