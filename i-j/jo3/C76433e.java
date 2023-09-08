package jo3;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import cj3.C67382a;
import com.tencent.p014mm.p136ui.widget.cedit.api.MMFlexEditText;

/* renamed from: jo3.e */
public final class C76433e implements TextWatcher {

    /* renamed from: d */
    public final C67382a f223756d = new C67382a();

    /* renamed from: e */
    public boolean f223757e;

    /* renamed from: f */
    public Character f223758f;

    /* renamed from: g */
    public final /* synthetic */ MMFlexEditText f223759g;

    public C76433e(MMFlexEditText mMFlexEditText) {
        this.f223759g = mMFlexEditText;
    }

    public void afterTextChanged(Editable editable) {
        this.f223759g.getSizeAnimController().cancel();
        if (editable instanceof SpannableStringBuilder) {
            boolean z = false;
            if (this.f223757e) {
                Character ch = this.f223758f;
                int i = MMFlexEditText.f220522p;
                if (ch != null && ch.charValue() == 8203) {
                    if (editable.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) editable;
                        if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (editable.length() > 0) {
                z = true;
            }
            if (z) {
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) editable;
                if (spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 10) {
                    int i2 = MMFlexEditText.f220522p;
                    spannableStringBuilder2.append(8203);
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = i2 > i3;
        this.f223757e = z;
        if (z && charSequence != null) {
            this.f223758f = Character.valueOf(charSequence.charAt(i));
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            if (spannableStringBuilder.getSpanStart(this.f223756d) == -1) {
                spannableStringBuilder.removeSpan(this.f223756d);
                spannableStringBuilder.setSpan(this.f223756d, 0, charSequence.length(), 18);
            }
        }
    }
}
