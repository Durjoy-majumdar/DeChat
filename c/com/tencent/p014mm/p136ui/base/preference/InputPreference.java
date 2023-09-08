package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.base.preference.InputPreference */
public class InputPreference extends Preference {

    /* renamed from: J */
    public EditText f24268J;

    /* renamed from: K */
    public Button f24269K;

    /* renamed from: L */
    public View.OnClickListener f24270L;

    /* renamed from: M */
    public TextView.OnEditorActionListener f24271M;

    /* renamed from: com.tencent.mm.ui.base.preference.InputPreference$a */
    public class C6761a implements View.OnClickListener {
        public C6761a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/preference/InputPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            InputPreference.this.getClass();
            C117292a.m165361g(this, "com/tencent/mm/ui/base/preference/InputPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.InputPreference$b */
    public class C6762b implements TextView.OnEditorActionListener {
        public C6762b() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (3 != i) {
                return false;
            }
            InputPreference.this.getClass();
            return false;
        }
    }

    public InputPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        EditText editText = (EditText) view.findViewById(C0966R.C0970id.cd7);
        this.f24268J = editText;
        editText.setHint((CharSequence) null);
        this.f24268J.setOnEditorActionListener(this.f24271M);
        Button button = (Button) view.findViewById(C0966R.C0970id.anq);
        this.f24269K = button;
        button.setText((CharSequence) null);
        this.f24269K.setOnClickListener(this.f24270L);
    }

    public InputPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24270L = new C6761a();
        this.f24271M = new C6762b();
    }
}
