package nj3;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.p136ui.base.MMAutoCompleteTextView;

/* renamed from: nj3.p */
public class C76896p implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ MMAutoCompleteTextView f224748d;

    public C76896p(MMAutoCompleteTextView mMAutoCompleteTextView) {
        this.f224748d = mMAutoCompleteTextView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MMAutoCompleteTextView mMAutoCompleteTextView = this.f224748d;
        int i4 = MMAutoCompleteTextView.f214757e;
        mMAutoCompleteTextView.mo101634a();
    }
}
