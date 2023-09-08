package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import f40.C86709a0;
import hg0.C8526w0;
import nj3.C76879j;
import ob0.C117747y;
import p214om.C11502f;
import qg0.C12215a;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI */
public class RegByFacebookSetPwdUI extends SetPwdUI {

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI$a */
    public class C1450a implements DialogInterface.OnClickListener {
        public C1450a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RegByFacebookSetPwdUI.this.finish();
        }
    }

    /* renamed from: N7 */
    public int mo1444N7() {
        return 382;
    }

    /* renamed from: O7 */
    public C117747y mo1445O7() {
        return new C8526w0(this.f10769e);
    }

    /* renamed from: Q7 */
    public String mo1446Q7() {
        return ((EditText) findViewById(C0966R.C0970id.ik9)).getText().toString();
    }

    /* renamed from: R7 */
    public String mo1447R7() {
        return ((EditText) findViewById(C0966R.C0970id.ik8)).getText().toString();
    }

    /* renamed from: S7 */
    public boolean mo1448S7(int i, int i2, String str) {
        if (i != 0 || i2 != 0) {
            return ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(getContext(), i, i2, str);
        }
        C86709a0.m107535s().mo121142i().mo119676J(57, 0);
        C76879j.m92749t(this, getString(C0966R.string.hwv, new Object[]{(String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null)}), getString(C0966R.string.hwm), new C1450a());
        return true;
    }

    /* renamed from: T7 */
    public void mo1449T7(C12215a.C12216a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            C76879j.m92738i(this, C0966R.string.hwk, C0966R.string.hwm);
        } else if (ordinal == 1) {
            C76879j.m92738i(this, C0966R.string.hwl, C0966R.string.hwm);
        } else if (ordinal == 2) {
            C76879j.m92738i(this, C0966R.string.k_1, C0966R.string.f7964xo);
        } else if (ordinal == 3) {
            C76879j.m92738i(this, C0966R.string.k9y, C0966R.string.f7964xo);
        }
    }

    /* renamed from: U7 */
    public ProgressDialog mo1450U7(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        return C76879j.m92723Q(context, str, getString(C0966R.string.hwo), z, z2, onCancelListener);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.br5;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.hwx);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
