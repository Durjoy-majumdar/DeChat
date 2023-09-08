package pj3;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.p136ui.base.preference.AutoHintSizeEditText;

/* renamed from: pj3.a */
public class C77096a implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ AutoHintSizeEditText f225191d;

    public C77096a(AutoHintSizeEditText autoHintSizeEditText) {
        this.f225191d = autoHintSizeEditText;
    }

    public void afterTextChanged(Editable editable) {
        AutoHintSizeEditText autoHintSizeEditText = this.f225191d;
        CharSequence hint = autoHintSizeEditText.getHint();
        int width = (this.f225191d.getWidth() - this.f225191d.getPaddingLeft()) - this.f225191d.getPaddingRight();
        int i = AutoHintSizeEditText.f215013i;
        autoHintSizeEditText.mo101913a(editable, hint, width);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
