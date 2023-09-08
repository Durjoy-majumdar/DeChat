package com.tencent.p014mm.plugin.label.p067ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelEditUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import g22.C75831c;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.label.ui.widget.InputClearablePreference */
public class InputClearablePreference extends Preference {

    /* renamed from: J */
    public String f198720J;

    /* renamed from: K */
    public String f198721K;

    /* renamed from: L */
    public String f198722L;

    /* renamed from: M */
    public String f198723M;

    /* renamed from: N */
    public int f198724N;

    /* renamed from: P */
    public boolean f198725P;

    /* renamed from: Q */
    public MMEditText f198726Q;

    /* renamed from: R */
    public ImageView f198727R;

    /* renamed from: S */
    public TextView f198728S;

    /* renamed from: T */
    public int f198729T;

    /* renamed from: U */
    public C69106d f198730U;

    /* renamed from: com.tencent.mm.plugin.label.ui.widget.InputClearablePreference$a */
    public class C69103a implements TextWatcher {
        public C69103a() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                String obj = editable.toString();
                InputClearablePreference.this.mo95176I(obj);
                InputClearablePreference inputClearablePreference = InputClearablePreference.this;
                boolean z = !Util.isNullOrNil(obj);
                ImageView imageView = inputClearablePreference.f198727R;
                if (imageView != null) {
                    if (z) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
                InputClearablePreference.this.f198720J = obj;
                return;
            }
            ImageView imageView2 = InputClearablePreference.this.f198727R;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                Log.m105919d("MicroMsg.Label.InputClearablePreference", "cpan[onTextChanged] :%s", charSequence.toString());
                C69106d dVar = InputClearablePreference.this.f198730U;
                if (dVar != null) {
                    String charSequence2 = charSequence.toString();
                    ContactLabelEditUI.C69050h hVar = (ContactLabelEditUI.C69050h) dVar;
                    ContactLabelEditUI contactLabelEditUI = ContactLabelEditUI.this;
                    contactLabelEditUI.f198488e = charSequence2;
                    contactLabelEditUI.enableOptionMenu(!Util.isNullOrNil(charSequence2));
                    TextView textView = ContactLabelEditUI.this.f198497q.f198728S;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.widget.InputClearablePreference$b */
    public class C69104b implements View.OnClickListener {
        public C69104b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/widget/InputClearablePreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMEditText mMEditText = InputClearablePreference.this.f198726Q;
            if (mMEditText != null) {
                mMEditText.setText("");
                InputClearablePreference.this.f198720J = "";
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/widget/InputClearablePreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.widget.InputClearablePreference$c */
    public class C69105c implements View.OnTouchListener {
        public C69105c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/widget/InputClearablePreference$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMEditText mMEditText = InputClearablePreference.this.f198726Q;
            if (mMEditText != null) {
                mMEditText.clearFocus();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/label/ui/widget/InputClearablePreference$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.widget.InputClearablePreference$d */
    public interface C69106d {
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.widget.InputClearablePreference$e */
    public class C69107e implements InputFilter {

        /* renamed from: d */
        public final char[] f198734d = {10, ',', ';', 12289, 65292, 65307};

        public C69107e() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Log.m105919d("MicroMsg.Label.InputClearablePreference", "on create tag filter, %s [%d, %d) %s [%d, %d),", charSequence, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4));
            for (int i5 = i; i5 < i2; i5++) {
                char[] cArr = new char[(i2 - i)];
                TextUtils.getChars(charSequence, i, i2, cArr, 0);
                for (char c : this.f198734d) {
                    char c2 = cArr[i5];
                    if (c2 == ' ' && i3 == 0 && i5 == 0) {
                        return "";
                    }
                    if (c2 == c) {
                        InputClearablePreference inputClearablePreference = InputClearablePreference.this;
                        TextView textView = inputClearablePreference.f198728S;
                        if (textView != null) {
                            textView.setText(inputClearablePreference.f198723M);
                            inputClearablePreference.f198728S.setVisibility(0);
                        }
                        return "";
                    }
                }
            }
            return null;
        }
    }

    public InputClearablePreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public final void mo95176I(String str) {
        if (!Util.isNullOrNil(str)) {
            int f = C45078p0.m49927f(str);
            int i = this.f198724N;
            boolean z = true;
            boolean z2 = f > i;
            int b = C45078p0.m49923b(i, "");
            int d = C45078p0.m49925d(this.f198724N, str);
            TextView textView = this.f198728S;
            if (textView != null) {
                if (z2) {
                    textView.setText(String.format(this.f198722L, new Object[]{Integer.valueOf(b), Integer.valueOf(d)}));
                    this.f198728S.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            C69106d dVar = this.f198730U;
            if (dVar != null) {
                if (f > this.f198724N) {
                    z = false;
                }
                ContactLabelEditUI.C69050h hVar = (ContactLabelEditUI.C69050h) dVar;
                ContactLabelEditUI contactLabelEditUI = ContactLabelEditUI.this;
                if (contactLabelEditUI.f198500t || !contactLabelEditUI.f198501u) {
                    contactLabelEditUI.enableOptionMenu(z);
                    return;
                }
                contactLabelEditUI.enableOptionMenu(false);
                ContactLabelEditUI.this.f198501u = false;
            }
        }
    }

    /* renamed from: J */
    public void mo95177J(String str) {
        this.f198720J = str;
        if (this.f198726Q != null && !Util.isNullOrNil(str)) {
            this.f198726Q.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(this.f121274d, this.f198720J, this.f198729T));
            mo95176I(this.f198720J);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f198729T = C76577a.m92157h(this.f121274d, C0966R.dimen.f3881hq);
        this.f198726Q = (MMEditText) view.findViewById(C0966R.C0970id.cd7);
        this.f198727R = (ImageView) view.findViewById(C0966R.C0970id.c16);
        this.f198728S = (TextView) view.findViewById(C0966R.C0970id.ckp);
        MMEditText mMEditText = this.f198726Q;
        if (mMEditText != null) {
            mMEditText.setFilters(new InputFilter[]{new C69107e()});
        }
        this.f198726Q.addTextChangedListener(new C69103a());
        Log.m105919d("MicroMsg.Label.InputClearablePreference", "mText %s", this.f198720J + "");
        mo95177J(this.f198720J);
        if (!Util.isNullOrNil(this.f198720J)) {
            this.f198726Q.setSelection(this.f198720J.length());
        }
        if (this.f198725P) {
            new MMHandler().postDelayed(new C75831c(this), 0);
        }
        this.f198726Q.setHint(this.f198721K);
        this.f198727R.setOnClickListener(new C69104b());
        TextView textView = this.f198728S;
        if (textView != null) {
            textView.setOnTouchListener(new C69105c());
        }
    }

    public InputClearablePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InputClearablePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
