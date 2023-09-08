package nj3;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.p136ui.base.MMFormMobileInputView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;

/* renamed from: nj3.t */
public class C11186t implements TextWatcher {

    /* renamed from: d */
    public PhoneFormater f32989d = new PhoneFormater();

    /* renamed from: e */
    public final /* synthetic */ MMFormMobileInputView f32990e;

    public C11186t(MMFormMobileInputView mMFormMobileInputView) {
        this.f32990e = mMFormMobileInputView;
    }

    public void afterTextChanged(Editable editable) {
        int selectionEnd = this.f32990e.f24185f.getSelectionEnd();
        String obj = this.f32990e.f24185f.getText().toString();
        String substring = this.f32990e.f24185f.getText().toString().substring(0, selectionEnd);
        if (obj != null && !obj.equals(this.f32990e.f24188i)) {
            String obj2 = this.f32990e.f24184e.getText().toString();
            this.f32990e.f24188i = this.f32989d.formatNumber(obj2.replace("+", ""), obj);
            this.f32990e.f24189j = this.f32989d.formatNumber(obj2.replace("+", ""), substring);
            if (!obj.equals(this.f32990e.f24188i)) {
                MMFormMobileInputView mMFormMobileInputView = this.f32990e;
                mMFormMobileInputView.f24185f.setText(mMFormMobileInputView.f24188i);
                int length = this.f32990e.f24185f.getText().toString().length();
                if (substring != null) {
                    try {
                        this.f32990e.f24189j = this.f32989d.formatNumber(obj2.replace("+", ""), substring);
                        if (obj.length() > 13) {
                            if (selectionEnd <= length) {
                                this.f32990e.f24185f.setSelection(substring.length());
                                return;
                            }
                        }
                        if (selectionEnd <= length) {
                            if (this.f32990e.f24189j.toString().length() <= length) {
                                MMFormMobileInputView mMFormMobileInputView2 = this.f32990e;
                                mMFormMobileInputView2.f24185f.setSelection(mMFormMobileInputView2.f24189j.toString().length());
                                return;
                            }
                        }
                        this.f32990e.f24185f.setSelection(length - Math.abs(obj.length() - selectionEnd));
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.MMFormMobileInputView", e, "", new Object[0]);
                    }
                } else {
                    this.f32990e.f24185f.setSelection(0);
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
