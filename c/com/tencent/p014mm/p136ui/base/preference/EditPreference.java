package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import kg3.C76577a;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: com.tencent.mm.ui.base.preference.EditPreference */
public class EditPreference extends Preference {

    /* renamed from: J */
    public Preference.C6763a f215042J;

    /* renamed from: K */
    public C73230c f215043K;

    /* renamed from: L */
    public C77398g f215044L;

    /* renamed from: M */
    public String f215045M;

    /* renamed from: com.tencent.mm.ui.base.preference.EditPreference$a */
    public class C73228a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f215046d;

        public C73228a(EditText editText) {
            this.f215046d = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77398g gVar = EditPreference.this.f215044L;
            if (gVar != null) {
                gVar.dismiss();
            }
            EditPreference.this.f215045M = this.f215046d.getText().toString();
            C73230c cVar = EditPreference.this.f215043K;
            if (cVar != null) {
                cVar.mo101927a(true);
            }
            EditPreference editPreference = EditPreference.this;
            Preference.C6763a aVar = editPreference.f215042J;
            if (aVar != null) {
                aVar.mo7744a(editPreference, editPreference.f215045M);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.EditPreference$b */
    public class C73229b implements DialogInterface.OnClickListener {
        public C73229b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77398g gVar = EditPreference.this.f215044L;
            if (gVar != null) {
                gVar.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.EditPreference$c */
    public interface C73230c {
        /* renamed from: a */
        void mo101927a(boolean z);
    }

    public EditPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    public void mo69920B(Preference.C6763a aVar) {
        this.f215042J = aVar;
    }

    /* renamed from: I */
    public void mo101924I() {
        EditText editText = new EditText(this.f121274d);
        editText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        editText.setSingleLine(true);
        editText.setText(this.f215045M);
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = editText.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
        }
        if (editText.getParent() != null) {
            ((ViewGroup) editText.getParent()).removeView(editText);
        }
        this.f215044L = C76879j.m92747r(this.f121274d, this.f121279i.toString(), editText, C76577a.m92166q(this.f121274d, C0966R.string.a18), C76577a.m92166q(this.f121274d, C0966R.string.f7926wf), new C73228a(editText), new C73229b());
    }

    public EditPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
