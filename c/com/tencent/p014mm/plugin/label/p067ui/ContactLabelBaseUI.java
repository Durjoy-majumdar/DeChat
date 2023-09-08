package com.tencent.p014mm.plugin.label.p067ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import eb0.C97625j3;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelBaseUI */
public class ContactLabelBaseUI extends MMActivity {

    /* renamed from: d */
    public ProgressDialog f198479d;

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelBaseUI$a */
    public class C69042a implements DialogInterface.OnCancelListener {
        public C69042a(ContactLabelBaseUI contactLabelBaseUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123457c(636);
        }
    }

    /* renamed from: H7 */
    public void mo95085H7(String str) {
        this.f198479d = C76879j.m92723Q(this, getString(C0966R.string.a3h), str, true, true, new C69042a(this));
    }

    public int getLayoutId() {
        return 0;
    }

    public void hideLoading() {
        ProgressDialog progressDialog = this.f198479d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f198479d.dismiss();
        }
    }
}
