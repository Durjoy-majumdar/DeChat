package zt0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew;
import zt3.C119157j;

/* renamed from: zt0.d */
public class C79433d implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ EditVerifyCodeViewNew f232963d;

    public C79433d(EditVerifyCodeViewNew editVerifyCodeViewNew) {
        this.f232963d = editVerifyCodeViewNew;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            this.f232963d.mo94537b();
            return;
        }
        EditVerifyCodeViewNew editVerifyCodeViewNew = this.f232963d;
        editVerifyCodeViewNew.getClass();
        ((C119157j) C119157j.f356862d).mo183895z(new C79434e(editVerifyCodeViewNew));
    }
}
