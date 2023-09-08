package zt0;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.appbrand.widget.sms.EditVerifyCodeView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zt0.a */
public class C79430a implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ EditVerifyCodeView f232961d;

    public C79430a(EditVerifyCodeView editVerifyCodeView) {
        this.f232961d = editVerifyCodeView;
    }

    public void afterTextChanged(Editable editable) {
        if (editable != null && editable.length() != 0) {
            Log.m105925i("MicroMsg.EditVerifyCodeView", "afterTextChanged:%s", editable.toString());
            if (this.f232961d.f197412e.length() < 6) {
                this.f232961d.f197412e.append(editable.toString());
                EditVerifyCodeView editVerifyCodeView = this.f232961d;
                String sb = editVerifyCodeView.f197412e.toString();
                Log.m105924i("MicroMsg.EditVerifyCodeView", "mBuilder:" + editVerifyCodeView.f197412e);
                int length = sb.length();
                if (length > 0 && length <= 6) {
                    int i = length - 1;
                    editVerifyCodeView.f197414g[i].setVisibility(0);
                    editVerifyCodeView.f197414g[i].setText(String.valueOf(sb.charAt(i)));
                    editVerifyCodeView.f197413f[i].setVisibility(4);
                }
                if (length == 6) {
                    editVerifyCodeView.getClass();
                }
            }
            editable.delete(0, editable.length());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
