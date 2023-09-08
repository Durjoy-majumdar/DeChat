package zt0;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zt0.c */
public class C79432c implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ EditVerifyCodeViewNew f232962d;

    public C79432c(EditVerifyCodeViewNew editVerifyCodeViewNew) {
        this.f232962d = editVerifyCodeViewNew;
    }

    public void afterTextChanged(Editable editable) {
        EditVerifyCodeViewNew.C68735b bVar;
        if (editable != null) {
            Log.m105927v("MicroMsg.EditVerifyCodeViewNew", "afterTextChanged:%s", editable.toString());
            EditVerifyCodeViewNew editVerifyCodeViewNew = this.f232962d;
            String obj = editable.toString();
            int i = EditVerifyCodeViewNew.f197418h;
            editVerifyCodeViewNew.getClass();
            int length = obj.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = obj.charAt(i2);
                editVerifyCodeViewNew.f197420e[i2].setText(String.valueOf(charAt));
                editVerifyCodeViewNew.f197420e[i2].setSelected(false);
                Log.m105925i("MicroMsg.EditVerifyCodeViewNew", "i:%d text:%s", Integer.valueOf(i2), String.valueOf(charAt));
            }
            boolean z = true;
            for (int i3 = length; i3 < 6; i3++) {
                Log.m105925i("MicroMsg.EditVerifyCodeViewNew", "i:%d text:%s", Integer.valueOf(i3), "");
                editVerifyCodeViewNew.f197420e[i3].setText("");
                if (z) {
                    editVerifyCodeViewNew.f197420e[i3].setSelected(true);
                    z = false;
                } else {
                    editVerifyCodeViewNew.f197420e[i3].setSelected(false);
                }
            }
            if (length == 6 && (bVar = editVerifyCodeViewNew.f197422g) != null) {
                bVar.mo94543a(obj);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
